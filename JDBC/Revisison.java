import java.sql.*;

public class Revisison 
{
    public static void main(String[] args)  throws Exception
    {
      String dname,uname,url,pass;
      dname="oracle.jdbc.OracleDriver";
      url="jdbc:oracle:thin:@localhost:1521:xe";
      uname="Amritanshu";
      pass="Amrit";
      Class.forName(dname);
      Connection con=DriverManager.getConnection(url,uname,pass);  
      Statement st =con.createStatement();
      ResultSet rs=st.executeQuery("Select * from emp");
      ResultSetMetaData rsmd=rs.getMetaData();
      int c=rsmd.getColumnCount();
      
      for(int i=1;i<=c;i++)
      System.out.print(rsmd.getColumnName(i)+" | ");
      System.out.println();
      while(rs.next())
      {
          for(int i=1;i<=c;i++)
          {
         System.out.print(rs.getString(i)+" | ");
        }
        System.out.println();
      }
    int col=st.executeUpdate("update emp set empid=100 where empid=20");
    System.out.println("no of updated rows: "+col+"\n");
}
}
