
import java.rmi.*;

public class StartServer {

    public static void main(String[] args) {
        try {
            //System.setSecurityManager(new RMISecurityManager());
            java.rmi.registry.LocateRegistry.createRegistry(1099);

            ChatServerInt fs=new ChatServer();
            fs.setFile("/home/Danilo_Oliveira/ProjetoRMI/SimpleChatClient/arq.txt");
                        
            //ChatServerInt b = new ChatServer();
            //Naming.rebind("rmi://localhost/myabc", b);
            Naming.rebind("rmi://localhost/myabc", fs);
            System.out.println("[System] Chat Server is ready.");
        } catch (Exception e) {
            System.out.println("Chat Server failed: " + e);
        }
    }
}
