    import java.rmi.*;
    import java.rmi.server.UnicastRemoteObject;
     
    public class ChatClient  extends UnicastRemoteObject implements ChatClientInt{
    	
    	private String name;
    	private Tela ui;	
    	public ChatClient (String n) throws RemoteException {
    		name=n;
    		}
    	
    	public void tell(String st) throws RemoteException{
    		System.out.println(st);
    		ui.writeMsg(st);
    	}
    	public String getName() throws RemoteException{
    		return name;
    	}
    	
    	public void setGUI(Tela t){ 
    		ui=t ; 
    	} 	
    }