<%@ page import = "main.* " %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
        .paragraph-with-background {
            background-image: url('C:\\Users\\TechDotPK\\OneDrive\\Desktop\\online-magazine\\src\\components\\images\\backimage.jpeg');
            background-size: cover; /* Adjust this according to your preference */
            color: white; /* Set text color to contrast with the background */
            padding: 20px; /* Add some padding for better readability */
        }
    </style>
</head>
<body>
	<div>
	<h1> Magazine </h1>
	<form action="Addpage.jsp">
	<button type="submit" >Add a post </button>
	</form>
	</div>
	
	<div id ="dailyItem" >
		<%
			Getpost post = new GetpostProxy().getGetpost();
			String hadithdescription = post.get_post("hadith");
		%>
		<div>
			<h3>Hadith</h3>
			<!--  <img src="C:\Users\TechDotPK\OneDrive\Desktop\online-magazine\src\components\images\backimage.jpeg">  -->
			<p class="paragraph-with-background"><%=hadithdescription %></p>
			<form action="UpdateAndDel.jsp" method="post">
				<input type="hidden" name = "section" value="hadith">
				<button type="submit">More</button>
			</form>
		</div>
		
		<%
			String ayatdescription = post.get_post("Ayat");
		%>
		<div>
			<h3>Ayat</h3>
			<!-- <img src="C:\Users\TechDotPK\OneDrive\Desktop\online-magazine\src\components\images\backimage.jpeg"> -->
			<p class="paragraph-with-background"><%=ayatdescription %></p>
			<form action="UpdateAndDel.jsp" method="post">
				<input type="hidden" name = "section" value="ayat">
				<button type="submit">More</button>
			</form>
		</div>
	</div>
	
	<div id ="dailyItem" >
		<%
			String qoldescription = post.get_post("qol");
		%>
		<div>
			<h3>Qol</h3>
			<!--  <img src="C:\Users\TechDotPK\OneDrive\Desktop\online-magazine\src\components\images\backimage.jpeg">  -->
			<p class="paragraph-with-background"><%=qoldescription %></p>
			<form action="UpdateAndDel.jsp" method="post">
				<input type="hidden" name = "section" value="qol">
				<button type="submit">More</button>
			</form>
		</div>
		
		<%
			String sherdescription = post.get_post("sher");
		%>
		<div>
			<h3>Sher</h3>
			<!-- <img src="C:\Users\TechDotPK\OneDrive\Desktop\online-magazine\src\components\images\backimage.jpeg">  -->
			<p class="paragraph-with-background"><%=sherdescription %></p>
			<form action="UpdateAndDel.jsp" method="post">
				<input type="hidden" name = "section" value="sher">
				<button type="submit">More</button>
			</form>
		</div>
	</div>
	

</body>
</html>