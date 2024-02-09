<%@ page import = "main.*" %>
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
String title = request.getParameter("section");
Search sh = new SearchProxy().getSearch();
String posts= sh.searchPostsByCategory(title);

StringTokenizer tokenizer = new StringTokenizer(posts, "\n");
List<String> postList = new ArrayList<String>();

while (tokenizer.hasMoreTokens()) {
    postList.add(tokenizer.nextToken());
}
%>
<h2><%=title %></h2>
<input type="hidden" name="title" value="<%=title%>>">
<% 
int numb = 1;
for (String post : postList) { %>
		<div id="div<%=numb%>">
			<h3><%=title +":" + numb %> </h3>
			<!-- <img src="C:\Users\TechDotPK\OneDrive\Desktop\online-magazine\src\components\images\backimage.jpeg"> -->
			<p class="paragraph-with-background"><%=post %></p>
			<div>
				<form action="Update.jsp"  accept-charset="UTF-8">
					<input type="hidden" name ="postdes" value="<%=post %>">
					<button>Update</button>
				</form>
				<form action="delete.jsp" accept-charset="UTF-8">
					<input type="hidden" name ="postdes" value="<%=post %>">
					<button>Delete</button>
				</form>
			</div>
		</div>
<%
numb++;
}%>

</body>
</html>