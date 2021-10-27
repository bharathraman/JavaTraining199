<%@page import="Mphasis.RaiseComplaint.ConnectionHelper"%>
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
<title>Insert title here</title>
</head>
<body>
<%
	Connection conn = ConnectionHelper.getConnection();
	String cmd = "select * from Complaint";
	PreparedStatement pst = conn.prepareStatement(cmd);
	ResultSet rs = pst.executeQuery();
%>
<table border="3" align="center">
	<tr>
		<th>Complaint ID</th>
		<th>Complaint Type</th>
		<th>Complaint Description</th>
		<th>Complaint Date</th>
		<th>Severity</th>
		<th>Status</th>
		<th>resolve</th>
		
		
	</tr>
<%
	while(rs.next()) {
%>
	<tr>
		<td><%=rs.getInt("ComplaintID") %> </td>
		<td><%=rs.getString("ComplaintType") %> </td>
		<td><%=rs.getString("CDescription") %> </td>
		<td><%=rs.getString("ComplaintDate") %> </td>
		<td><%=rs.getString("Severity") %> </td>
		<td><%=rs.getString("Status") %> </td>
		<td><a href="Resolve.jsp">Resolve</a> </td>
		
	</tr>
<%
	}
%>
</body>
</html>