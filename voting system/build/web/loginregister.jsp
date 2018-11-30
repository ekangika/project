<%-- 
    Document   : signup
    Created on : 15 Nov, 2018, 10:55:48 AM
    Author     : Ekangika
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            try{
            String uname = request.getParameter("uname");
            
            String myurl="jdbc:mysql://localhost/project";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                Statement st=conn.createStatement();
                String query1="select * from register where vcard='"+uname+"'";
                ResultSet rs=st.executeQuery(query1);
                
            if(rs.next()){
                response.sendRedirect("parties.html");
                        }
                else
                 out.println("not found");
                st.close();
            
            }
            catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
            }
   
        %>
    </body>
</html>

