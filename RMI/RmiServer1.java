import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer1 implements Array1
{
   public RmiServer1(){ }

   public int arraySum(int []arr)
  {
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
	sum+=arr[i];
	}
   return sum;
   }

   public static void main(String []Amritanshu)
   {
       try
        {
            RmiServer1 obj=new RmiServer1();
            Array1 stub=(Array1) UnicastRemoteObject.exportObject(obj,13);

            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Array1",stub);
            System.out.println("Server Ready, Waiting for the Client to Send the array of integers...............");
           }
            catch(Exception e)
              {
                System.out.println("Server Exception  :  "+e);
                e.printStackTrace();
	}
    }
}