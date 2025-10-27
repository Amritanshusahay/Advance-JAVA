//JDBC Program to Insert, Delete, Display data stored in DB by user dynamic input.

import java.sql.*;
import java.util.Scanner;


public class Jdbc7 
{
  public static void main(String[] Amritanshu) throws SQLException
  {
    String drivernm="oracle.jdbc.driver.OracleDriver"; 
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String uname="Amritanshu";
    String pass="amrit";
    Connection con=DriverManager.getConnection(url,uname,pass);
    Statement st= con.createStatement();
    
    Scanner sc=new Scanner(System.in);
    while (true) 
    {     
    System.out.println("Options:\n1.Insert Employee Data\n2.Delete Employee Data\n3.Display Employee Data\n4.Exit"); 
    System.out.println(); 

    System.out.print("Enter Your Choice: ");
    int ch=sc.nextInt();
    System.out.println();
    switch(ch)
    {
    
    case 1:
    {
     System.out.print("Enter ID: ");
     int empid=sc.nextInt();
     sc.nextLine();
     System.out.print("Enter Name: ");
     String empnm=sc.nextLine();
     System.out.print("Enter Salary: ");
     float empsal=sc.nextFloat();
     sc.nextLine();
     System.out.print("Enter Address: ");
     String empadd=sc.nextLine();
     String query=String.format("insert into emp values(%d,'%s',%.2f,'%s')",empid,empnm,empsal,empadd);//"insert into emp values("+empid+",'"+empnm+"',"+empsal+",'"+empadd+"')";

     st.executeUpdate(query);
     System.out.println("\n1 record inserted!\n");
     break;
    }
    case 2:
    {
      System.out.print("Enter Employee ID to delete their record: ");
      int id=sc.nextInt();
      st.executeUpdate("delete from emp where empid= "+id);
      System.out.println("\n1 record deleted!\n");
      break;
    }
    case 3:
    {
     ResultSet rs=st.executeQuery("select * from emp");
     if(!rs.isBeforeFirst())
     {System.out.println("Table is empty\n\n");}
     while(rs.next())
     {
      System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
     }
     System.out.println("\n");
     break;
    }
    case 4:
      System.exit(0);
      break;
    default :
      System.out.println("Enter a valid option!!!");
    }
  }
}
}
