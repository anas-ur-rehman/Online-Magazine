<%@ page import="main.*" %>
<%@ page import="java.util.StringTokenizer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
        .paragraph-with-background {
            background-image: url('C:\\Users\\TechDotPK\\OneDrive\\Desktop\\online-magazine\\src\\components\\images\\backimage.jpeg');
            background-size: cover; /* Adjust this according to your preference */
            color: white; /* Set text color to contrast with the background */
            padding: 20px; /* Add some padding for better readability */
        }
    </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>

	<%
		String search = request.getParameter("searched");
        SearchUsecase post = new SearchUsecaseProxy().getSearchUsecase();
        String str=post.getdescription(search);
       	
        StringTokenizer tokenizer = new StringTokenizer(str , "\n");
        String firstPart = tokenizer.nextToken();
        String secondPart = tokenizer.nextToken();
        
     %>
     <div>
     
		<form action="search.jsp">
			<input type="text" name="searched">
			<button type="submit">search</button>
		</form>
		
		<form action="homepageforadmin.jsp">
			<button type="submit">
				back
			</button>
		</form>
	</div>
     
	<div>
			<h3><%=firstPart %></h3>
			<!--  <img src="C:\Users\TechDotPK\OneDrive\Desktop\online-magazine\src\components\images\backimage.jpeg">  -->
			<p class="paragraph-with-background"><%=secondPart %></p>
		</div>
</body>
</html>