<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<%@ page import ="java.sql.*" %>
<%
String name=request.getParameter("name"); 
String email=request.getParameter("email"); 
String password=request.getParameter("password");
String vcard=request.getParameter("vcard");
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",""); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into register values ('"+name+"','"+email+"','"+password+"','"+vcard+"')"); 
out.println("Registered");
{
                RequestDispatcher rd=request.getRequestDispatcher("loginpage.html");
                rd.forward(request, response);
            }
%>
</body>
</html>
