import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Array1 extends Remote {
   public int arraySum(int []arr) throws RemoteException;
}