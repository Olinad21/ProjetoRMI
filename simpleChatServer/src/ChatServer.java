
import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class ChatServer extends UnicastRemoteObject implements ChatServerInt,Serializable {

    private List <ChatClientInt> v = new ArrayList<>();
    
    

    public ChatServer() throws RemoteException {
    }

    public boolean login(ChatClientInt a) throws RemoteException {

        System.out.println(a.getName() + "  got connected....");
        //a.tell(a.getName()+ " está online TELL");
        publish(a.getName() + " está online");
        getV().add(a);
        return true;
    }

    @Override
    public void sair(String nome) throws RemoteException {
        System.out.println(nome);
        for (int i = 0; i < getV().size(); i++) {
            publish(nome + " está offline");
            if(getV().get(i).getName().equals(nome)){
                getV().remove(i);
            }           
        }
    }
    
    public void publish(String s) throws RemoteException {
        System.out.println(s);
        for (int i = 0; i < getV().size(); i++) {
            try {
                ChatClientInt tmp = (ChatClientInt) getV().get(i);
                tmp.tell(s);
            } catch (Exception e) {
                //problem with the client not connected.
                //Better to remove it
            }
        }
    }

    public void publish(String nome, String s) throws RemoteException {
        System.out.println(s);
        for (int i = 0; i < getV().size(); i++) {
           
            if (getV().get(i).getName().equals(nome)) {
                System.out.println("vetor   name: "+getV().get(i).getName()); 
               try {
                    ChatClientInt tmp = (ChatClientInt) getV().get(i);
                    tmp.tell(s);
                } catch (Exception e) {
                    //problem with the client not connected.
                    //Better to remove it
                }

            }

        }
    }

    @Override
    public List<ChatClientInt> getConnected() throws RemoteException {
        System.out.println("entrou em getConected SERVIDOR");
        List <ChatClientInt> lst = new ArrayList<ChatClientInt>();
        if(getV()!=null) 
            for (int i = 0; i < getV().size(); i++) {
                System.out.println("Clientes: "+getV().get(i).getName());
                lst.add(getV().get(i));
            }
        return lst;
    }

    /**
     * @return the v
     */
    public List <ChatClientInt> getV() {
        return v;
    }
}
