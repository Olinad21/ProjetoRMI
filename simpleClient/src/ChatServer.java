    import java.rmi.*;
    import java.rmi.server.UnicastRemoteObject;
    import java.util.*;
     
    public class ChatServer  extends UnicastRemoteObject implements ChatServerInt{
    	
    	private Vector v=new Vector();	
    	public ChatServer() throws RemoteException{}
    		
    	public boolean login(ChatClientInt a) throws RemoteException{	
            
    		System.out.println(a.getName() + "  got connected....");	
    		//a.tell(a.getName()+ " está online TELL");
    		publish(a.getName()+ " está online");
    		v.add(a);
    		return true;		
    	}
    	
    	public void publish(String s) throws RemoteException{
    	    System.out.println(s);
    		for(int i=0;i<v.size();i++){
    		    try{
    		    	ChatClientInt tmp=(ChatClientInt)v.get(i);
    			tmp.tell(s);
    		    }catch(Exception e){
    		    	//problem with the client not connected.
    		    	//Better to remove it
    		    }
    		}
    	}
     
        @Override
    	public Vector getConnected() throws RemoteException{
            Vector VET=new Vector();
    		for(int i=0;i<v.size();i++){
                    VET.add(v.get(i));
                }
            return VET;
    	}
    }
