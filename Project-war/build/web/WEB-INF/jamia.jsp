<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="model.Persone"%>
<%@page import="java.sql.*"%>
<%@page import="tratement.Comand"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
	<%
		Persone per = (Persone) session.getAttribute("bdname");

	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />

<title>Insert title here</title>
</head>
<body>
	<!-- Header -->
	<header id="header">
		<h1>
			<a href="#"><%= per.getEmail()%> </a>

		</h1>
		<nav id="nav">
			<ul>
				<li><a href="#"><%=per.getName() %> <%=per.getLastname() %> &nbsp; مرحبا بك</a></li>
				<li><a href="#" class="icon fa-angle-down">Layouts</a>
					<ul>
						<li><a href="generic.html">Generic</a></li>
						<li><a href="ProfileServlet">Contact</a></li>
						<li><a href="elements.html">Elements</a></li>
						<li><a href="#">Submenu</a>
							<ul>
								<li><a href="#">Option One</a></li>
								<li><a href="#">Option Two</a></li>
								<li><a href="#">Option Three</a></li>
								<li><a href="#">Option Four</a></li>
							</ul></li>
					</ul></li>
				<li><a href="LogoutServlet" class="button"> تسجيل الخروج</a></li>

			</ul>

		</nav>
	</header>





	<!-- Main -->
	<section id="main" class="container">
		<header>
			<h2>انواع التطوع </h2>
		</header>





		<div class="row">
			<div class="col-6 col-12-narrower">

				<section class="box special">
					<h2><a href="Controler?id=5">التبرع بالدم</a></h2><br>
					<h2><a href="Controler?id=6">التبرع بشئ عيني</a></h2><br> 
					<h2><a href="Controler?id=7">التبرع بعمل بدني</a></h2><br> 
					<h2><a href="Controler?id=8">التبرع بالاموال</a></h2><br> 
					<h2><a href="Controler?id=9">التبرع بعمل مهني</a></h2> <br> 
					
				</section>

			</div>
			<div class="col-6 col-12-narrower">

		
				
				
				<section class="box special">
					
					<h3>الاعلانات</h3>
					
					
					
					
					
					
					
					<div class="table-wrapper">
							<table>
								<thead>
									<tr>
										<th>عنوان المشروع</th>
										<th>اسم الجمعية</th>
										<th>المكان</th>
										<th>الوقت</th>
     									<th>قبول</th>
										<th>رفض</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>fsdfss</td>
										<td>fsdfss</td>
										<td>fsdfss</td>
										<td>fsdfss</td>
										<td>fsdfss</td>
										<td>fsdfss</td>
										
									</tr>
								</tbody>
							</table>
						</div>
					</section>
				</div>
					
					
					
				
				</section>


	<!-- Footer -->
	<footer id="footer">
		<ul class="icons">
			<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
			<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
			<li><a href="#" class="icon fa-instagram"><span
					class="label">Instagram</span></a></li>
			<li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
			<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
			<li><a href="#" class="icon fa-google-plus"><span
					class="label">Google+</span></a></li>
		</ul>
		<ul class="copyright">
			<li>&copy; Untitled. All rights reserved.</li>
			<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
		</ul>
	</footer>


	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.dropotron.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>