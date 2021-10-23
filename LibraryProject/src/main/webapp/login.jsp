<%@page import="Mphasis.LibraryProject.ConnectionHelper"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginJSPFile</title>
</head>
<body><% 
String user=request.getParameter("username");
String pwd=request.getParameter("pass");
Connection con= ConnectionHelper.getConnection();
String cmd="Select * from UserDetails where "+ "UserName = ? and Password = ?";
PreparedStatement pst=con.prepareStatement(cmd);
pst.setString(1,user);
pst.setString(2,pwd);
ResultSet rs=pst.executeQuery();
if(rs.next()){
	session.setAttribute("user",user);
%>
	<jsp:forward page="menu.jsp"/>
<%	
}
else {
	out.println("Invalid Credentials...");
%>
	<jsp:include page="login.html"/>
<%	
}
%>
</body>
</html>