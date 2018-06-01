    import java.rmi.*;
    import java.util.*;
     
    public interface ChatServerInt extends Remote{	
    	public boolean login (ChatClientInt a)throws RemoteException ;
    	public void publish (String s)throws RemoteException ;
        public void publish (String nome,String s)throws RemoteException ;
    	public List <ChatClientInt> getConnected() throws RemoteException ;
        public void sair(String nome) throws RemoteException;
    }
