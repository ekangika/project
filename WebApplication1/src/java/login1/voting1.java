/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Ekangika
 */
public class voting1 extends HttpServlet {

    
    @Override
    public  void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
        String a=request.getParameter("Parties");
       
            String  s=   validate.user1("djfnj");
         
             out.println(s);
           
        } catch (SQLException ex) {
            Logger.getLogger(voting1.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
