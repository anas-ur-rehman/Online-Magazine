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
		
		int id= Integer.parseInt(request.getParameter("newid"));
		DeletePost del = new DeletePostProxy().getDeletePost();
		del.main(id);
		//RequestDispatcher dispatcher = request.getRequestDispatcher("homepageforadmin.jsp");
	    //dispatcher.forward(request, response);
	%>
	
	<h2>Update Service Page</h2>
    <p>Delete successful! Redirecting back to the home page...</p>
    <script>
        setTimeout(function() {
            window.location.href = "homepageforadmin.jsp";
        }, 3000); // Redirect after 3 seconds (adjust as needed)
    </script>

</body>
</html>