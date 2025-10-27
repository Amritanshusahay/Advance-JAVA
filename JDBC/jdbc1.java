import java.sql.*;
import java.util.*;

class JDBC1
{
 public static void main(String []Amritanshu)
 {
    Scanner obj=new Scanner(System.in);
    int id=0;
    String query="";
  try
 {
   Class.forName("oracle.jdbc.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
   Statement st=con.createStatement();
   System.out.print("\nWelcome to JDBC Application\n\n1.Search by EmployeeID\n2.Search by firstname & last name.\nEnter Your Choice [1 2]:-  ");
   int ch=obj.nextInt();

   switch (ch)
   {
    case 1: 
	   System.out.print("Enter Employee ID :- ");
	   id=obj.nextInt();
	   query="Select * from employees where employee_ID = "+id;
 	   break;
    case 2:
	   System.out.print("Enter First name of the employee :- ");
     String fname=obj.next();
	   //System.out.println();
	   //String lname=obj.next();
	   query ="select * from employees where First_Name =\'"+fname+"\'";	
     break;
    default:  System.out.print("Please Enter Correct Option.......");
    }

   ResultSet rs=st.executeQuery(query);
   while(rs.next())
    {
	System.out.println("Employee  Details :- \nID : "+rs.getString(1)+"\nFirst_Name :- "+rs.getString(2)+"\nLast_Name :- "+rs.getString(3)+"\nEmail : "+rs.getString(4)+"\nMobile No : "+rs.getString(5)+"\nSalary :- "+rs.getString(8));
       }   
  }
 catch(Exception e)
 {
  System.out.println("Exception arises : "+e);
 }

  }
}
