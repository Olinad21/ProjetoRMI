import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChatClient extends UnicastRemoteObject implements ChatClientInt {

    private String name;
    private TelaIni ui;

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
