import java.rmi.Remote;

public interface RmiInterface2 extends Remote
{
    public int add(int a,int b) throws Exception;
}
