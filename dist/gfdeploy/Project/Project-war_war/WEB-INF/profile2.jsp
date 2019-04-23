<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="model.Jamia"%>
<%@page import="java.sql.*"%>
<%@page import="tratement.Comand"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	Jamia jam = (Jamia) session.getAttribute("bdnamej");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" >

<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<style type="text/css">
body {
	background-image: url(images/2.jpg);
}
</style>
<title>Insert title here</title>
</head>
<body>
	<!-- Header -->
	<header id="header">
		<h1>
			<a href="#"><%=jam.getEmail()%> </a>

		</h1>
		<nav id="nav">
			<ul>
				<li><a href="#"><%=jam.getNamej()%> &nbsp;جمعية ال </a></li>
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
			<h2 style="background-color: #fff">الصفحة الرئسية</h2>
		</header>





		<div class="row">
			<div class="col-6 col-12-narrower">

				<section class="box special">
					<h2>جزء الاعلانات</h2>
					<form method="post" action="Controler">

						<div class="col-6 col-12-mobilep">
							<input type="text" name="name" id="name" value=""
								placeholder=" اسم المبادرة" />
						</div>

						<br>
						<div class="col-12">
							<select name="place" id="category">
								<option value="e39">الوادي</option>
								<option value="a16">الجزائر</option>

							</select>
						</div>
						<br>
						<div class="col-12">
							<select name="typet" id="category">
								<option value="e39">التبرع بالدم</option>
								<option value="a16">التبرع بشيء عيني</option>
								<option value="e39">التبرع بعمل بدني</option>
								<option value="e39">التبرع بالاموال</option>
								<option value="e39">التبرع بعل مهني</option>
							</select>
						</div>
						<br>
						<div class="col-6 col-12-mobilep">
							<input type="date" name="time" id="name" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							الوقت
						</div>
						<br> <input type="hidden" name="test" value="jamiai">
						<div class="col-12">
							<textarea name="message" id="message"
								placeholder="Enter your message" rows="6"></textarea>
						</div>
						<br>

						<div class="col-12">
							<ul class="actions">
								<li><input class="button2" type="submit" value="ارسال" /></li>
							</ul>
						</div>
					</form>

				</section>

			</div>
			<div class="col-6 col-12-narrower">
				<section class="box special">
					<h3>التطوعات</h3>
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
				<div class="col-6 col-12-narrower">
					<section class="box special">
						<h3>الاعمال المنجزة</h3>
						<div class="table-wrapper">
							<table>
								<thead>
									<tr>
										<th>المشاركين في المشروع</th>
										<th>عنوان المشروع</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>fsdfss</td>
										<td>fsdfss</td>

									</tr>
								</tbody>
							</table>
						</div>
					</section>
				</div>
			</div>
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