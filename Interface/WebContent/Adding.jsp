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
try {
    String title = request.getParameter("PostTitle");
    String des = request.getParameter("PostDescription");
    PostInsert insert = new PostInsertProxy().getPostInsert();
    insert.main(title, des);
    response.sendRedirect("Addpage.jsp");
%>
<script>
        alert("Post inserted successfully!");
        setTimeout(function(){
            window.location.href = "Addpage.jsp";
        }, 2000);
    </script>
<%
} catch (Exception e) {
    out.println("Error inserting post: " + e.getMessage());
}
%>

</body>
</html>