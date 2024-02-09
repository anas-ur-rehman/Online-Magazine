<%@ page import = "main.* " %>
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
String name = request.getParameter("username");
String password = request.getParameter("password");
AdminLogin log = new AdminLoginProxy().getAdminLogin();
boolean result = log.login(name, password);

if (result) {
    response.sendRedirect("homepageforadmin.jsp"); 
} else {
    String errorMessage = "Invalid username or password. Please try again."; 
    request.setAttribute("errorMessage", errorMessage);
    RequestDispatcher dispatcher = request.getRequestDispatcher("AdminLoginPage .jsp"); 
    dispatcher.forward(request, response);
}
%>



</body>
</html>