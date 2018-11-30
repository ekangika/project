/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ekangika
 */
public class validate {
    public static String user1(String a) throws SQLException
    {
       
      boolean st =false;
 
	 //loading drivers for mysql
      Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/project?allowMultiQueries=true","root","");
      PreparedStatement  ps=con.prepareStatement
            ("insert into voting(party) values(?)");
            //out.println("hello world");
                
            // int id = Integer.parseInt(name);
            ps.setString(1,a);
            
           
            int i=ps.executeUpdate();
            if(i>0)
            {
              return("You are sucessfully registered");  
               //return true;
            }
      // System.out.println("You are sucessfully registered");  
             //return "data not inserted";
          //   return false;
       //return false;
    
        // st = rs.next();
      return "fslfgb";
     // System.out.println(st);

    }
public static void main(String args[]) throws SQLException
{
 validate.user1("BJP");
}

}
