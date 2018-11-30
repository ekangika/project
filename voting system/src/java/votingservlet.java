import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class votingservlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("party");  

          
try{  
String myurl="jdbc:mysql://localhost:3306/project";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");  
  
PreparedStatement ps=conn.prepareStatement(  
"insert into voting values(?)");  
  
ps.setString(1,n);  

int i=ps.executeUpdate();  
if(i>0)  
{
          
            if(i>0)
            {
                RequestDispatcher rd=request.getRequestDispatcher("loginpage.html");
                rd.forward(request, response);
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("voting.html");
                rd.include(request,response);
            }
  }

          
}catch (Exception e2) {
    out.print("Error it is..."+e2);  
System.out.println(e2);}  
          
out.close();  
}  
  
}