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
<title>AddComplaint</title>
</head>
<body>

<%
 int Cid = Integer.parseInt(request.getParameter("cid"));
 String ComplaintType =request.getParameter("ctype");
 String CDescription =request.getParameter("cdesc");
 String ComplaintDate=request.getParameter("cdate");
 String Severity =request.getParameter("severity");
 String Status =request.getParameter("status");
 Connection conn=ConnectionHelper.getConnection();
 String cmd="Insert into Complaint(ComplaintID,ComplaintType,CDescription,ComplaintDate,Severity,Status) " +
			" values(?,?,?,?,?,?) ";
 PreparedStatement pst = conn.prepareStatement(cmd);
 pst.setInt(1, Cid);
 pst.setString(2,ComplaintType);
 pst.setString(3,CDescription);
 pst.setString(4,ComplaintDate);
 pst.setString(5,Severity);
 pst.setString(6,Status);
	pst.executeUpdate();
	out.println("*** Record Inserted ***");
%>

</body>
</html>