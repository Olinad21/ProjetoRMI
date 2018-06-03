import java.rmi.*;
import java.util.*;

public interface ChatServerInt extends Remote {

    public boolean login(ChatClientInt a) throws RemoteException;

    public void publish(String s) throws RemoteException;

    public void publish(String nome, String texto, ChatClientInt client) throws RemoteException;

    public List getConnected() throws RemoteException;

    public void sair(ChatClientInt client) throws RemoteException;
}
