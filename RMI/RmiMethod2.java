import java.rmi.server.*;

public class RmiMethod2 extends UnicastRemoteObject implements RmiInterface2
{
    RmiMethod2() throws Exception
    {
        super();
    }

    public int add(int a,int b) throws Exception
    {
        return a+b;
    }
}
