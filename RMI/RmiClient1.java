import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient1
{
   private RmiClient1(){  }
   public static void main(String Amritanshu[])
    {
      String host=Amritanshu[0];
       try
        {
           Registry registry = LocateRegistry.getRegistry(host);
           Array1 stub=(Array1) registry.lookup("Array1");
	   int arr[]={23,43,86,33};
	   System.out.println("\nElements of the Array :- ");
	   for(int a: arr)
	   {
	     System.out.print(a+" ");
	      }
	   System.out.println();
           int response = stub.arraySum(arr);
           System.out.println("Sum of elements of Array : "+response);
           }
        catch(Exception e)
           {
               System.err.println("Client Exception :  "+e.toString());
               e.printStackTrace();
	}
    }
}