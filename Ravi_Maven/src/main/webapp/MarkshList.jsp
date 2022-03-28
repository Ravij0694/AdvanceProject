<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="in.co.rays.been.MarksheetBeen" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<%@ include file="HederView.jsp"%>
<center>
<h1>MarkSheet List</h1>
	<hr>

	<form action="MarkshList"> 
    Name   <input type="text" name="login"
		placeholder="enter Id" style="background-color: aqua";> 
		RollNo     <input type="text" name="name"
		placeholder="entername">
	<button style="a ">Search</button>
	<hr>
	
	<%  
	ArrayList b = (ArrayList) request.getAttribute("ml");
	   		
	Iterator it= b.iterator();
	String s=(String)b.get(1);
	   	/* 	while(it.hasNext()){
	   		String s=(String)it.next(); */
	   		%>
	          <h1>Topper <%=s%>  </h1>
	<%-- <%} %> --%>
	
	<hr>
		<table border="3" style="border-colleps: colleps; width: 590px ; height: 300px"  >
		<tr>
		
		    
		    <th>Rank</th>
			<th>Name</th>
			<th>ID</th>
			<th>Totel</th>
			<th>Persenteg</th>
			
			
		</tr>
		<tr>
			
			<td>1</td>
			<td><%=b.get(1) %></td>
			<td><%=b.get(2) %></td>
			<th><%=b.get(3) %></th>
			<th><%=b.get(4) %></th>
			
		</tr>
		<tr>
			<td>2</td>
			<td><%=b.get(6) %></td>
			<td><%=b.get(7) %></td>
			<th><%=b.get(8) %></th>
			<th><%=b.get(9) %></th>
		</tr>
		<tr>
			<td>3</td>
			<td><%=b.get(11) %></td>
			<td><%=b.get(12) %></td>
			<th><%=b.get(13) %></th>
			<th><%=b.get(14) %></th>
		</tr>
		<tr>
			<td>4</td>
			<td><%=b.get(16) %></td>
			<td><%=b.get(17) %></td>
			<th><%=b.get(18) %></th>
			<th><%=b.get(19) %></th>
		</tr>
		<tr>
			<td>5</td>
			<td><%=b.get(21) %></td>
			<td><%=b.get(22) %></td>
			<th><%=b.get(23) %></th>
			<th><%=b.get(24) %></th>
		</tr>
		</table>
	
		<button style="a ">NextPage</button>
		</center>
		
 </form>
 <%@ include file="FooterView.jsp"%>
</body>
</html>