//we get data a/c to the rs object not how it is stored in the Database.

import java.sql.*;

public class Jdbc8 
{
  public static void main(String[] Amritanshu) throws SQLException,ClassNotFoundException
  {
    String Dname,url,uname,pass;
    Dname="oracle.jdbc.driver.OracleDriver";
    url="jdbc:oracle:thin:@localhost:1521:xe";
    uname="amritanshu";
    pass="Amrit";
    
   Class.forName(Dname);
   Connection con=DriverManager.getConnection(url,uname,pass);
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select empname from emp");
   while(rs.next())
   {
    System.out.println(rs.getString(3));
   }
   con.close();
  }    
}
