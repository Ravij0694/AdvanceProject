<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@ page errorPage="Error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="in.co.rays.been.StoudentBeen"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body bgcolor="aqua">
	<%@ include file="HederView.jsp"%>
	<center>
		<h1>Stoudent List</h1>
		<hr>
		Name <input type="text" name="login" placeholder="enter Id"
			style="background-color: aqua";> RollNo <input type="text"
			name="name" placeholder="entername">
		<button style="">Search</button>
		<hr>

		<form action="StoudentList">
			<jsp:useBean id="b" class="in.co.rays.been.StoudentBeen"
				scope="request"></jsp:useBean>
			
			<table border="3"
				style="border-colleps: colleps; width:1400px; height: 250px">
				<tr>
					<th><h3>Name</h3></th>
					<th><h3>Lname</h3></th>
					<th><h3>Rollno</h3></th>
					<th><h3>Session</h3></th>
				</tr>
<%
				List<StoudentBeen> a=(List<StoudentBeen>)request.getAttribute("List");
				Iterator<StoudentBeen> it = a.iterator();
				while (it.hasNext()) {
					StoudentBeen be=it.next();
		
				
			%>
<tr>
					<th><h3><%=be.getName() %></h3></th>
					<th><h3><%=be.getLname() %></h3></th>
					<th><h3><%=be.getRollno() %></h3></th>
					<th><h3><%=be.getSession() %></h3></th>
				</tr>
<%} %>

			</table>
			<%@ include file="FooterView.jsp"%>
</body>
</html>
