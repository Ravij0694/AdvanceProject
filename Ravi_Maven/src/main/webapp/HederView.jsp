<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<body style="background-color: aqua;">

	<img src="./logo.png" width="200px " alt="my 1 pic" align="right"></img>

	<%
		String m = (String) session.getAttribute("msg1");
	%>
	<%
		if (m != null) {
	%>
	<h1 style="color: green" align="left">
		Hi
		<%=m%></h1>

	<%
		} else {
	%>
	<h1 style="color: green" align="left">
		Hi,Guest</h1>

	<%
		}
	%>

	<%
		if (m != null) {
	%>


	<h3>
		<a href="ravi" target="fx" align="left">Welcome </a>
	</h3>
	<h3>
		<a href="Logoutview.jsp" align="left"> Logout</a>
	</h3>
<h3>
		<a href="VisitorCount" align="left"> VCount</a>
	</h3>


	<ul class="pagination">
		<li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">College</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="RajistrationView.jsp" target="fx">Collage</a>
					<a class="dropdown-item" href="Form2.html" target="fx">Add
						College</a> <a class="dropdown-item" href="#">CollegeList</a>
				</div>
			</div>
		</li>
		<li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Employ</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="Form1.html" target="fx">AllEmploy</a>
					<a class="dropdown-item" href="Form2.html" target="fx">AddEmploy</a>
					<a class="dropdown-item" href="#">EmployInfo</a>
				</div>
			</div>
		</li>
		<li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Stoudent</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="StoudentCtl" target="fx">Add
						Stoudent</a> <a class="dropdown-item" href="StoudentList" target="fx">StoudentList</a>
					<a class="dropdown-item" href="#">Something else here</a>
				</div>
			</div>
		</li>
		<li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Marksheet</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="MarkshList" target="fx">Marksheet
						List</a> <a class="dropdown-item" href="addmarksheetview.jsp"
						target="fx">Add Marksheet</a> <a class="dropdown-item"
						href="GetmarkshView.jsp" target="fx">Get Marksheet</a>
				</div>
			</div>
		</li>
		<li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">About Us</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="MyProfailView.jsp" target="fx">My
						profail</a> <a class="dropdown-item" href="RajistrationView.jsp"
						target="fx">Rajistration</a> <a class="dropdown-item" href="#">Something
						else here</a>
				</div>
			</div>
		</li>
	</ul>

	<%
		}
	%>


	

</body>
</html>
<%-- <% if(session.getAttribute("fname") == null){%>
Welcome Guest
<%}else{ %>
Welcome <%= session.getAttribute("fname") %>
<%} %>

<%if (session.getAttribute("fname") != null){ 
%>
 --%>
<%-- <%
}
 %> --%>