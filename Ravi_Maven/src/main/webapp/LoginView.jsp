
<%@ page errorPage="Error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<%@ include file="HederView.jsp"%>
<!-- <h3>
		<a align="left">Welcome </a>
	</h3>
	<h3>
		<a  align="left"> In Rays</a>
	</h3>
 -->
	<center>
	<%String m1=(String)request.getAttribute("by");%>
			<%if(m1!=null){ %>
			<h style="color: red"><%=m1 %></h>
			<%} %>
	
		<form action="ravi" method="post">
			
			<%String m2=(String)request.getAttribute("msg");%>
			<%if(m2!=null){ %>
			<h style="color: red"><%=m2 %></h>
			<%} %>
			<table>
					
					<hr>
		<h1>Login</h1>
		<hr>
					
				<tr>
					<th><br> <lebel>Login</lebel></th>
					<th><br> <input type="text" name="login"
						placeholder="enter Id" style="background-color: aqua";></th>
				</tr>


				<tr>
					<th><br> <lebel>password</lebel></th>
					<th><br> <input type="password" name="pass"
						placeholder="enter pass" style="background-color: aqua";></th>
				</tr>

			</table>

			<button>login</button>

			<br>
			 <a href="RajistrationView.jsp">SingUp</a> <br> 
			 <a href="ChangPassView.jsp" align="left">ForgetPassword </a>
	</center>


	</form>
<div  align="bottom"><%@ include file="FooterView.jsp"%></div>
</body>

</body>
</html>
