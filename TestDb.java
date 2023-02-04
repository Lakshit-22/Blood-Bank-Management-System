/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.sql.*;
public class TestDb {
    public static void main(String args[])
    {
        System.out.println("Start");  
        try{  
                Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/bbms","root","Lakshit@123");  
                //here sonoo is database name, root is username and password  
                 Statement stmt=con.createStatement();  
                 //stmt.executeQuery("select * from donor");
                 stmt.executeUpdate("insert into donor(donorId,name,fatherName,motherName,DOB,MobileNo,gender,email,bloodGroup,city,address)values(3,'rahul','sohan','suhani','22092000','8883838383','male','abc@gmail.com','apositive','dehradun','grapgic era')");
                ResultSet rs=stmt.executeQuery("select * from donor");
                
                
                while(rs.next())
                {
                    //System.out.println("mid");
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                }
                con.close();  
}catch(Exception e){ System.out.println(e);} 
System.out.println("End");        
}  
        
    }
    
