import java.sql.*;

public class Jdbc5 
{
  public static void main(String []Amritanshu) throws SQLException
  {
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
    Statement st=con.createStatement();
    
    //case 1: executeQuery() vs non-select query
    ResultSet rs=st.executeQuery("update e set salary= 2000 where Name=\'Amrit\'");
    System.out.println("ResultSet: "+rs);

    //case 2: executeUpdate() vs select query
    int rows=st.executeUpdate("Select * from e");
    System.out.println("No. of rows: "+rows); 

    //case 3: executeUpdate() vs DDL commands
    int n=st.executeUpdate("create table e1 (eno number(2))");
    System.out.println("Table create return: "+n);

    con.close();
  }
}
