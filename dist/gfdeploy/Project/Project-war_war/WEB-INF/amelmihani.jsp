<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />

<title>Insert title here</title>
</head>
<body class="is-preload">
	<div id="page-wrapper">

		<!-- Header -->
		<header id="header">
			<h1>
				<a href="index.html">DesAssociations</a>
			</h1>
			<nav id="nav">
				<ul>
					<li><a href="index.html">الصفحة الرئسية</a></li>
					<li><a href="#" class="icon fa-angle-down">Layouts</a>
						<ul>
							<li><a href="Controler?id=1">انواع التطوع</a></li>
							<li><a href="contact.html">Contact</a></li>
							<li><a href="elements.html">Elements</a></li>
							<li><a href="#">Submenu</a>
								<ul>
									<li><a href="#">Option One</a></li>
									<li><a href="#">Option Two</a></li>
									<li><a href="#">Option Three</a></li>
									<li><a href="#">Option Four</a></li>
								</ul></li>
						</ul></li>
					<li><a href="Login.html" class="button">تسجيل الدخول</a></li>
				</ul>
			</nav>
		</header>

		<br /> <br />
		<section id="main" class="container">
			<header>
				<h2>التبرع بعمل مهني</h2>
			</header>
			<div class="row">
				<div class="col-12">


					<div class="row">
						<div class="col-12">

							<section class="box">
								<form method="post" action="Controler">
									<div class="row gtr-uniform gtr-50">

										<div class="col-6 col-12-mobilep">
											<input type="text" name="lesjours" id="name" value=""
												placeholder=" المدة " />
										</div>
										<div class="col-6 col-12-mobilep">
											<input type="text" name="profession" id="name" value=""
												placeholder="المهنة" />
										</div>


										<input type="hidden" name="test" value="amelmihani" />



										<div class="col-6 col-12-mobilep">
											<input type="date" name="time" id="name" value=""
												placeholder="الوقت" /> الوقت
										</div>


										<div class="col-6 col-12-mobilep">

											<div class="col-12">
												<select name="place" id="category">
													<option value="e39">الوادي</option>
													<option value="c25">قسنطينة</option>
												</select>
											</div>
										</div>




										<div class="col-12">
											<ul class="actions">
												<li><input type="submit" value="ارسال" /></li>
											</ul>
										</div>
									</div>
								</form>


							</section>
						</div>
					</div>
				</div>
			</div>

		</section>
	</div>


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