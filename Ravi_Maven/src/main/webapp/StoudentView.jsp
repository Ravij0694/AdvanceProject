<%@ page errorPage="Error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
    <%@page import="in.co.rays.been.StoudentBeen"%>
   
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
	
	<h1>Stoudent</h1>
	<hr>
	<form action="StoudentCtl" method="post">
		
		<jsp:useBean id="b" class="in.co.rays.been.StoudentBeen"
				scope="request"></jsp:useBean>
	<%StoudentBeen l=(StoudentBeen)request.getAttribute("m");
	
	
	%><%=l.getName() %>
	
	
			
		<table border="3">
		
	
	
		<%
						String mr0 = (String) request.getAttribute("mg");
					if(mr0!=null){%>
					 <h style="color: red"><%=mr0%></h>
					<%} %>
					<tr>
				<th><br> <lebel>Rollno</lebel></th>
				<th><br> <input type="text" name="rollno" value="<%=l.getRollno() %>"
					placeholder="<%=l.getRollno() %>" ></th>
					
			</tr>
			<tr>
				<th><br> <lebel>Name</lebel></th>
				<th><br> <input type="text" name="name" value="<%=l.getName() %>"
					placeholder="<%=l.getName()%>"></th>
				

			</tr>

			<tr>
				<th><br> <label>Lastname</label></th>
				<th><br> <input type="text" name="lname" value="<%=l.getLname() %>"
					placeholder="<%=l.getLname()%>"></th>
					
			</tr>

			<tr>
				<th><br> <lebel>Session</lebel></th>
				<th><br> <input type="text" name="session" value="<%=l.getSession() %>"
					placeholder="<%=l.getSession() %>" ></th>
						
			</tr>
			
</table>

<br>
		<button  value="Add" name="po">
			Add
		</button>
			<button value="Update" name="po">
			Update
		</button>	
		    <button value="Delit" name="po">
			Delit
		</button>
			
</form>
<div  align="bottom"><%@ include file="FooterView.jsp"%></div>
</body>
</html>

<%-- <%
						StoudentBeen b1 = (StoudentBeen)request.getAttribute("been");
	         	if(b1!=null){%>
		              <h style="color: red"><%=b1.getName()%></h>
		<%}
					 %>
					 
					  <%@page import="in.co.rays.been.StoudentBeen" %>
					   --%>