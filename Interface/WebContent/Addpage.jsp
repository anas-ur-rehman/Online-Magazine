<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Insert a Post</h2>
		<form action="Adding.jsp">
			<label>Add Title:</label>
			<input type="text" name="PostTitle">
			<br>
			<label>Password</label>
			<input type="text" name="PostDescription">
			<div>
				<button type="submit">Add</button>
				<button type="reset">Discard</button>
			</div>
		</form>
</body>
</html>