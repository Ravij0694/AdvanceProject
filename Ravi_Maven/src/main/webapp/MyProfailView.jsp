<%@ page errorPage="Error.java" language="java" contentType="text/html; charset=ISO-8859-1"
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
<h1>My Profil</h1>
	<hr>
	
		
		<form action="MyProfilView.jsp">
			<table  style="border-colleps: colleps; width: 590px ; height: 300px">
				<tr>
					<th><br>
					<lebel>Login </lebel></th>
					<th><br> <input type="text" name="login"
						placeholder="enter Id" style="background-color: aqua";></th>
				<tr>
					<th><br>
					<lebel>Name</lebel></th>
					<th><br>
					<input type="text" name="name" placeholder="entername"></th>

					<th><br> <lebel> Lastname</lebel></th>
					<th><br> <input type="text" name="lname"
						placeholder="enter Lastname"></th>
				</tr>
				<tr>
					<th><br> <lebel>Gender</lebel></th>
					<th><br> <select id="gender">
							<option>male</option>
							<option>female</option>
					</select></th>
				</tr>
				<tr>
					<th><br>
					<lebel>DOB</lebel></th>
					<th><br> <input type="date" value="date"></th>
				</tr></table>
<br>  
				<button>SAVE</button>
				<button>chang pass</button>
				</center>
				</form>
				<center>
				<%@ include file="FooterView.jsp"%>
</body>
</html>