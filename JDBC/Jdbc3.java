import java.sql.*;
import java.util.*;

public class Jdbc3
{
    public static void main(String[] Amritanshu) 
    {
      
     try( 
        Scanner sc=new Scanner(System.in);
       )
       {
       //     Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
            Statement st=con.createStatement();
            int del=st.executeUpdate("update e set salary= 2000 where Name=\'Amrit\'");
            System.out.println("Rows Deleted: "+del);
       }
       catch(Exception e)
       {
        System.out.println("Exception generated :- "+e.getMessage());
       }

    }
}