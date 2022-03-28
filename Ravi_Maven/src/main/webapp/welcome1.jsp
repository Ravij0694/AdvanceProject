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
		String m = (String) request.getAttribute("msg1");
	%>
	<%
		if (m != null) {
	%>
	<h1 style="color: green" align="left">Hi  <%=m%></h1>
	
	<%
		}
	%>

	<h3>
		<a href="Welcome1.html" target="fx" align="left">Welcome </a>
	</h3>
	<h3>
		<a href="LoginView.jsp" align="left">Logout </a>
	</h3>

<%if(m != null) {%>
	<ul class="pagination">
		<li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">College</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="Form1.html" target="fx">Collage</a>
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
					<a class="dropdown-item" href="Form1.html" target="fx">Add
						Stoudent</a> <a class="dropdown-item" href="Form5.html" target="fx">StoudentList</a>
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
					<a class="dropdown-item" href="Form5.html" target="fx">Marksheet
						List</a> <a class="dropdown-item" href="addmarksheetview.jsp"
						target="fx">Add Marksheet</a> <a class="dropdown-item"
						href="Form4.html" target="fx">Get Marksheet</a>
				</div>
			</div>
		</li>
		<li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">About Us</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="Form1.html" target="fx">My
						profail</a> <a class="dropdown-item" href="RajistrationView.jsp"
						target="fx">Rajistration</a> <a class="dropdown-item" href="#">Something
						else here</a>
				</div>
			</div>
		</li>
	</ul>

<%} %>
	


	<!-- <ul class="pagination" >
		<li class="active"><a href="Welcome.html" target="fx">Home</a></li>
		<li><a href="Form3.html" target="fx" >marksheet</a></li>

		<li><a href="Form5.html" target="fx"> marksheetList</a></li>
		<li><a href="Form1.html" target="fx">profail</a></li>
		<li><a href="#" target="fx">aboutus</a></li>
	</ul> -->

	<iframe name="fx" src="welcome.jsp" width="1300" height="400"></iframe>

</body>
</html>
