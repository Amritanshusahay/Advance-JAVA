import java.sql.*;
import java.util.*;

public class Jdbc2
{
    public static void main(String[] Amritanshu) 
    {
      
     try( 
        Scanner sc=new Scanner(System.in);
       )
       {
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from e");
            while(rs.next())
            {
             System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3));       
            }
       }
       catch(Exception e)
       {
        System.out.println("Exception generated :- "+e.getMessage());
       }

    }
}