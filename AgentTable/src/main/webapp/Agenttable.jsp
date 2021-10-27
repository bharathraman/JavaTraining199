<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent Table</title>
</head>
<body>
<sql:setDataSource var="conn" 
	driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe"
	user="bhadmin"
	password="badmin"
	/>
	<sql:query var="AgentQuery" dataSource="${conn}">
	    select * from Agent
   </sql:query>
   
   <table border="3">
	<tr>
		<th>Agent ID</th>
		<th>Name</th>
		<th>City</th>
		<th>Gender</th>
		<th>Marital Status</th>
		<th>Premium</th>
	</tr>
	
	<c:forEach var="a" items="${AgentQuery.rows}">
	<tr>
		<td><c:out value="${a.agentid}"/> </td>
		<td><c:out value="${a.name}"/> </td>
		<td><c:out value="${a.city}"/> </td>
		<td><c:out value="${a.gender}"/></td>
		<td><c:out value="${a.maritalstatus}"/> </td>
		<td><c:out value="${a.premium}"/> </td>
	</tr>
</c:forEach>
	</table>
</body>
</html>