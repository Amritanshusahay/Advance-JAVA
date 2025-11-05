/**
 * public static void rebind(String name,Remote obj)throws RemoteException,MalformedURLException 
 *          -> Rebinds the specified name to a new remote object in the RMI registry. Any existing binding for the name is replaced.
 *              Parameters:
 *                         name- a name in URL format (without the scheme component).
 *                         obj- new remote object to associate with the name.
 */

import java.rmi.Naming;

public class RmiServer2 
{
  public static void main(String[] Amritanshu) throws Exception
  {
    //Here we need to throws exception because the constructor RmiMethod2 throws An Exception
       RmiMethod2 obj=new RmiMethod2();
       Naming.rebind("ADD",obj);
       System.out.println("Server Started....");

  }    
}
