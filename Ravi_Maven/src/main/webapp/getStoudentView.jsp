<%@ page errorPage="Error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
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
<body>
<div  align="bottom"><%@ include file="HederView.jsp"%></div>
<center>
<hr>
	<h1>Stoudent List</h1>
	<hr>
	<form action="StoudentList" method="post">
	<table>
<tr>
				<th> <lebel>Name</lebel></th>
				<th> <input type="text" name="name"
					placeholder="entername"></th>
			<th>	<button>Go</button></th>

			</tr>
			</table>
			</form>
		</center>	
</body>
</html>