<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<%@ include file="HederView.jsp"%>
	<center>
		<h1>MarkSheet</h1>
		<hr>
		
<% 		String mr6 = (String) request.getAttribute("msg9");
					if(mr6!=null){%>
					 <h style="color: red"><%=mr6%></h>
					<%} %> 

			
 

		<form action="rav" method="post">
			
			<table border="3">
				<tr>
					<th>Id</th>
					<th><input type="text" name="id" placeholder="entername" style="background-color: aqua";>
					<br></th>
				</tr>
				<tr>
					<th>Name</th>
					<th><input type="text" name="name" placeholder="entername" style="background-color: aqua";></th>
				</tr><th></th>

				<tr>
					<th>LName</th>
					<th><input type="text" name="lname" placeholder="entername" style="background-color: aqua";></th>
				</tr>

				<tr>
					<th>Rollno</th>
					<th><input type="text" name="rollno"
						placeholder="enter Lastname" style="background-color: aqua";>
					</th>
				</tr>

				<tr>
					<th>Hindi</th>
					<th><input type="text" name="hindi" placeholder="enter pass"
						style="background-color: aqua";></th>
				</tr>

				<tr>
					<th>English</th>
					<th><input type="text" name="eng" placeholder="enter pass"
						style="background-color: aqua";></th>
				</tr>

				<tr>
					<th>physics</th>
					<th><input type="text" name="phy" placeholder="enter Id"
						style="background-color: aqua";></th>
				</tr>

				<tr>
					<th>chemestry</th>
					<th><input type="text" name="che" placeholder="enter pass"
						style="background-color: aqua";></th>
				</tr>

				<tr>
					<th>Math</th>
					<th><input type="text" name="math" placeholder="enter pass"
						style="background-color: aqua";></th>
				</tr>
			</table>



			<button name="add">Add</button>
			<button style="">	<a href="ravi" target="NewFile.html">Back</a></button>
	</center>
	</form>
	<%@ include file="FooterView.jsp"%>
</body>
</html>