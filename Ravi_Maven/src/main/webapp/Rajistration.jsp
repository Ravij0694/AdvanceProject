<%@ page errorPage="Error.java" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="in.co.rays.ctl.RjistrationCtl"%>
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
<body>
<body style="background-color: aqua">



<center>
<hr>
	<h1>User Ragistration</h1>
	<hr>


	<form action="RjistrationCtl" method="post">
		<table>
			<tr>
				<th><br> <lebel>Name</lebel></th>
				<th><br> <input type="text" name="name"
					placeholder="entername"></th>
				<th>
					<%
						String mr = (String) request.getAttribute("msg");
					if(mr!=null){%>
					 <h style="color: red"><%=mr%></h>
					<%} %> 
				</th>
			</tr>

			<tr>
				<th><br> <label>Lastname</label></th>
				<th><br> <input type="text" name="lname"
					placeholder="enter Lastname"></th>
					<th>
					<%
						String mr1 = (String) request.getAttribute("msg1");
					if(mr1!=null){%>
					 <h style="color: red"><%=mr1%></h>
					<%} %> 
				</th>
			</tr>

			<tr>
				<th><br> <lebel>Login</lebel></th>
				<th><br> <input type="email" name="id"
					placeholder="enter Id" style="background-color: aqua";></th>
						<th>
					<%
						String mr2 = (String) request.getAttribute("msg2");
					if(mr2!=null){%>
					 <h style="color: red"><%=mr2%></h>
					<%} %> 
				</th>
			</tr>


			<tr>
				<th><br> <lebel>password</lebel></th>
				<th><br> <input type="password" name="pass"
					placeholder="enter pass" style="background-color: aqua";></th>
					<th>
					<%
						String mr3 = (String) request.getAttribute("msg3");
					if(mr3!=null){%>
					 <h style="color: red"><%=mr3%></h>
					<%} %> 
				</th>
			</tr>

			<tr>
				<th><br> <lebel> Gender</lebel></th>
				<th><br> <select id="gen">
						<option>male</option>
						<option>female</option>
				</select></th>
				<th>
					<%
						String mr4 = (String) request.getAttribute("msg4");
					if(mr4!=null){%>
					 <h style="color: red"><%=mr4%></h>
					<%} %> 
				</th>
			</tr>


			<tr>
				<th><br> <lebel>DOB</lebel></th>
				<th><br> <input type="date" name="date" value="date"></th>
				<th>
					<%
						String mr5 = (String) request.getAttribute("msg5");
					if(mr5!=null){%>
					 <h style="color: red"><%=mr5%></h>
					<%} %> 
				</th>
			</tr>
<%
						String mr6 = (String) request.getAttribute("msg6");
					if(mr6!=null){%>
					 <h style="color: red"><%=mr6%></h>
					<%} %> 
		</table>
		<br>
		<button value="SignUp">
			SingUp</a>
		</button>
		<button style="">
			<a href="LoginView.jsp" target="NewFile.html">Back</a>
		</button>
</center>
	</form>
  <%-- <div  align="bottom"><%@ include file="FooterView.jsp"%></div> --%>
</body>
</html>
</body>
</html>
<!-- <a href="css.html" target="NewFile.html"> -->
</html>