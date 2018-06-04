import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChatClient extends UnicastRemoteObject implements ChatClientInt {

    private String name;
    private TelaIni ui;

    public boolean sendData(String filename, byte[] data, int len) throws RemoteException {
        try {
            File sourceFile = new File(filename);
            sourceFile.createNewFile();//renameTo(sourceFile);
            //createNewFile();
            FileOutputStream file = new FileOutputStream(sourceFile,true);
            file.write(data);
           
            BufferedOutputStream output = new BufferedOutputStream(file);
            output.flush();
            output.write(data, 0, len);
            output.flush();
            output.close();
            System.out.println("Escrevendo dados ...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public ChatClient(String n) throws RemoteException {
        name = n;
    }

    public void tell(String st) throws RemoteException {
        System.out.println("[ChatClienteInt]: recebendo o nome para jogar no tx " + st);
        ui.writeMsg(st);
    }

    public void Up(List<ChatClientInt> client) {
        ui.updateUsers(client);
    }

    public String getName() throws RemoteException {
        return name;
    }

    public void setGUI(TelaIni t) {
        ui = t;
    }
}
