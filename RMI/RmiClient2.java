/**
 * lookup() is a static method of Naming class which refers to finding and retrieving an object or resource from a naming or directory service, such as the Java Naming and Directory Interface (JNDI).
 * The lookup() method returns an Object, which then needs to be cast to its specific type.
 */

import java.rmi.*;
public class RmiClient2
{
  public static void main(String[] Amritanshu) throws Exception
  {
    RmiInterface2 obj=(RmiInterface2)Naming.lookup("ADD"); 
    int sum=obj.add(5,4);
    System.out.println("Sum: "+sum);
  }
}