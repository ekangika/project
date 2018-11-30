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
String Parties=request.getParameter("Parties"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",""); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into register values ('"+Bharatiya_janata_party+"','"+Indian_national_congress+"','"+janata_dal+"','"+Samajwadi_party+"','"+Bahujan_samaj_party+"')"); 
out.println("Registered"); 
%>
</body>
</html>
