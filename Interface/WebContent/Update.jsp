<%@ page import = "main_pkg.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String des = request.getParameter("postdes");
		String title= request.getParameter("title");
		UpdatePost id = new UpdatePostProxy().getUpdatePost();
		int getid= id.getid(des);
		
	%>
	
	<h4>enter new details</h4>
	<form action="updateservice.jsp">
			<label>New Title:</label>
			<input type="text" name="newtitle">
			<br>
			<label>New description:</label>
			<input type="text" name="newdes">
			<br>
			<input type="hidden" name="newid" value="<%=getid%>">
			<button type="submit">Confirm</button>
			
		</form>
		
		<form action="homepageforadmin.jsp">
			<button type="submit">Cancel</button> 
		</form>
	
</body>
</html>