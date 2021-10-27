<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent Search</title>
</head>
<body>
<form method="get" action="AgentSearch.jsp">
		<center>
			Agent id : 
			<input type="number" name="agentid" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	
	<c:if test="${param.agentid !=null}">
			<sql:setDataSource var="conn" 
				driver="oracle.jdbc.driver.OracleDriver"
				url="jdbc:oracle:thin:@localhost:1521:xe"
				user="bhadmin"
				password="badmin"
			/>
			
			<sql:query var="AgentQuery" dataSource="${conn}">
	    		select * from Agent where agentid=?
	    		<sql:param value="${param.agentid}"/>
   			</sql:query>	
   			<c:set var="flag" value="0" />
   			<c:forEach var="a" items="${AgentQuery.rows}">
	Agent ID : 
	<c:out value="${a.agentid}"/> <br/>
	Employ Name : 
	<c:out value="${a.name}"/> <br/>
	City : 
	<c:out value="${a.city}"/> <br/>
	Gender : 
	<c:out value="${a.gender}"/> <br/>
	Marital Status : 
	<c:out value="${a.maritalstatus}"/> <br/>
	Premium :
	<c:out value="${a.premium}"/> <br/> <hr/>
	<c:set var="flag" value="1" />
</c:forEach>
<c:if test="${flag==0}">
	<c:out value="Record Not Found..."/>
</c:if>
   			
	</c:if>
</body>
</html>