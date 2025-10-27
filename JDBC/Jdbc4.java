import java.sql.*;
import java.util.*;

public class Jdbc4 
{
  public static void main(String[] Amritanshu)
  {
      //Class.forName("oracle.jdbc.driver.OracleDriver");
      try{
            
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
         Statement st=con.createStatement();
         System.out.print("Enter your Query :- ");
         String query=(new Scanner(System.in)).nextLine();
         boolean b=st.execute(query);
         if(b)
         {
            st.setMaxRows(2);
            ResultSet rs=st.getResultSet();
            while(rs.next())
            {
             System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3));     
            }
         }
         else
         {
            int modify=st.getUpdateCount();
            System.out.println("Rows modify: "+modify);
         }
     }
     catch(SQLException e)
     {
        System.out.println("Exception: "+e.getMessage());
     }

  }    
}
