import java.rmi.*;
import java.util.List;

public interface ChatClientInt extends Remote {

    public void tell(String name) throws RemoteException;

    public String getName() throws RemoteException;

    public void Up(List<ChatClientInt> client) throws RemoteException;
}
