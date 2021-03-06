
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class ChatServer extends UnicastRemoteObject implements ChatServerInt, Serializable {

    private List<ChatClientInt> v = new ArrayList<>();
    private String file = "";

    public ChatServer() throws RemoteException {
    }

    public void setFile(String f) {
        file = f;
    }

    public void getArquivo(ChatClientInt client) {
        System.out.println("[Arquivo]: caminho :" + file);
        try {

            File f1 = new File(file);
            //f1.canExecute();
            FileInputStream in = new FileInputStream(f1);
            byte[] mydata = new byte[(int) file.length()];
            int mylen = in.read(mydata);

         for (int i = 0; i < getV().size(); i++) {
            while (mylen > 0) {
                 ChatClientInt clientes = (ChatClientInt) getV().get(i);
                 clientes.sendData(f1.getName(), mydata, mylen);
                //client.sendData(f1.getPath(), mydata, mylen);

            }
         }
//            while(mylen>0){
//                a.sendData(f1.getName(), mydata, mylen);	 
//                mylen=in.read(mydata);				 
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean login(ChatClientInt a) throws RemoteException {
        getV().add(a);
        System.out.println("[ChatServer]: " + a.getName() + " entrou em login SERVIDOR");
        System.out.println("lista: " + getV().size() + " clientes");
        if (getV() != null) {
            System.out.println("getv nao nulo");
            for (int i = 0; i < getV().size(); i++) {
                if (!getV().get(i).getName().equals(a.getName())) {
                    ChatClientInt cliente = (ChatClientInt) getV().get(i);
//                    cliente.tell(a.getName() + " LgON");                    
//                    a.tell(cliente.getName() + "LgON2");
                    //cliente.Up(getV());
                    System.out.println(cliente.getName() + " Avisa para " + a.getName() + " q ta on");
                    System.out.println(a.getName() + " Avisa para " + cliente.getName() + " q ta on");
                }

            }
            System.out.println("Adicionado " + getV().size() + " cliente na lista ");
        } else {
            System.out.println("[login] : Lista de cliente vazio");
        }
        System.out.println("server [login] foi para Publish");

        //para mostrar no text Area 
        //publish(a.getName());
        return true;
    }

    @Override
    public void sair(ChatClientInt client) throws RemoteException {
        System.out.println(client.getName());
        for (int i = 0; i < getV().size(); i++) {
            //ChatClientInt clientes = (ChatClientInt) getV().get(i);            
            if (getV().get(i).getName().equals(client.getName())) {
                getV().remove(client);
                //clientes.tell(client.getName() + " está offline");
                getConnected();
            }
        }
    }

    public void publish(String s) throws RemoteException {
        System.out.println(s);
        if (getV() != null) {
            for (int i = 0; i < getV().size(); i++) {
                try {
                    ChatClientInt tmp = (ChatClientInt) getV().get(i);
                    tmp.tell(s);
                } catch (Exception e) {
                    //problem with the client not connected.
                    //Better to remove it
                }
            }
        } else {
            System.out.println("[PUBLISH] : LIsta de clientes NULL");
        }
    }

    public void publish(String nome, String texto, ChatClientInt client) throws RemoteException {
        System.out.println(texto);
        for (int i = 0; i < getV().size(); i++) {

            if (getV().get(i).getName().equals(nome)) {
                //System.out.println("vetor   name: " + getV().get(i).getName());                
                try {
                    ChatClientInt clientes = (ChatClientInt) getV().get(i);
                    clientes.tell(texto);
                    client.tell(texto);

                } catch (Exception e) {
                    System.out.println("Erro ao Transferir msg para clientes" + e.getMessage());
                    //problem with the client not connected.
                    //Better to remove it
                }

            }

        }
    }

    @Override
    public List<ChatClientInt> getConnected() throws RemoteException {
        System.out.println("[ChatServer]:entrou em getConected SERVIDOR");
        List<ChatClientInt> lst = new ArrayList<ChatClientInt>();
        if (getV() != null) {
            for (int i = 0; i < getV().size(); i++) {
                System.out.println("Clientes: " + getV().get(i).getName());
                ChatClientInt cliente = (ChatClientInt) getV().get(i);
                cliente.Up(getV());

                lst.add(getV().get(i));
            }
            System.out.println("[getConected] lista getV" + getV().size());
        }
        System.out.println("\n\n");
        return lst;
    }

    /**
     * @return the v
     */
    public List<ChatClientInt> getV() {
        return v;
    }
}
