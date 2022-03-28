<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="background-color: aqua">
<center>
<h1>ChangPassword</h1><hr>
<form action="ChangPass" method="post">
<%String s=(String)request.getAttribute("pass") ;
if(s!=null){
%>
<h1><%=s %></h1>
<%} %>
<table>
<tr>
				<th><br><lebel>Email Id</lebel></th>
				<th><br><input type="email" name="id" placeholder="enter id"
					style="background-color: aqua";> </th></tr>
<tr>
				<th><br><lebel>Newpassword</lebel></th>
				<th><br><input type="password" name="pass1" placeholder="enter pass"
					style="background-color: aqua";> </th></tr>
<tr>
				<th><br><lebel>Changpassword</lebel></th>
				<th><br><input type="password" name="pass" placeholder="enter pass"
					style="background-color: aqua";> </th></tr>
</table>
<br>

<button>Save</button>
<button><a href="LoginView.jsp">Back</a></button>
</form>

</center>
</body>
</html>