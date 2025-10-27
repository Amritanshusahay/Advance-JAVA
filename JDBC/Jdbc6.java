//JDBC Program To Create A Table.

import java.sql.*;

public class Jdbc6 
{
  public static void main(String[] Amritanshu) throws Exception
  {
    String driverClassNm="oracle.jdbc.driver.OracleDriver";
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String usernm="Amritanshu";
    String password="amrit";
    String query="Create Table Emp(empid number(3),empName varchar2(15),empsal number(5,2),empadd varchar2(15))";

    Class.forName(driverClassNm);
    Connection con=DriverManager.getConnection(url,usernm,password);
    Statement st=con.createStatement();

    st.executeUpdate(query);
    System.out.println("\n:):) ;);) Table is Created Successfully!!! :):) ;);)\n");
    con.close();
  }   
}
