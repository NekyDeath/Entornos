<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="NBA.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>
<!-- Header -->
	<header id="header">
		<a class="logo" href="index.html">Centro Nelson</a>
		<nav>
			<a href="#menu">Menú</a>
		</nav>
	</header>

	<!-- Nav -->
	<nav id="menu">
		<ul class="links">
			<li><a href="index.html">Inicio</a></li>
			<li><a href="">Enlace 1</a></li>
			<li><a href="">Enlace 2</a></li>
		</ul>
	</nav>

	<!-- Heading -->
	<div id="heading">
		<h1>Práctica Peliculas</h1>
	</div>

	<!-- Main -->
	<%
	BDController conexion=new BDController();
	ArrayList<Equipo> equipos = conexion.equipos();
	ArrayList<Jugador> jugadores = conexion.jugadores();
	ArrayList<Estadistica> estadisticas = conexion.Estadisticas();
	ArrayList<Partidos> partidos = conexion.partidos();
	%>
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">
				<header>
					<h2>Listado de los equipos de la base de datos nba</h2>
				</header>
				<%
				for (Equipo e : equipos) {
					out.print("<div class=" + "Nombre" + ">");
					out.print("<h3>");
					out.print(e.getNombre());
					out.print("</h3>");
					out.print("<p>");
					out.print("<b>Ciudad: </b>" + e.getCiudad());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Conferencia: </b>" + e.getConferencia());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Division: </b>" + e.getDivision());
					out.print("</p>");
					out.print("</div>");
					out.print("<hr>");
				}
				%>
			</div>
			<hr>
			<!-- Ej2 -->
			<div class="content">
			<h2>Jugadores</h2>
			<%
				for (Jugador e : jugadores) {
					out.print("<div class=" + "Codigo" + ">");
					out.print("<h3>");
					out.print(e.getCodigo());
					out.print("</h3>");
					out.print("<p>");
					out.print("<b>Nombre: </b>" + e.getNombre());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Procedencia: </b>" + e.getProcedencia());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Altura: </b>" + e.getAltura());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Peso: </b>" + e.getPeso());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Posicion: </b>" + e.getPosicion());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Equipo: </b>" + e.getEquipo());
					out.print("</p>");
					out.print("</div>");
					out.print("<hr>");
				}
				%>
			</div>
			<hr>
			<!-- Ej3 -->
			<div class="content">
			<h2>Partidos</h2>
			<%
				for (Partidos e : partidos) {
					out.print("<div class=" + "Codigo" + ">");
					out.print("<h3>");
					out.print(e.getCodigo());
					out.print("</h3>");
					out.print("<p>");
					out.print("<b>Equipo local: </b>" + e.getLocal());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Equipos visitante: </b>" + e.getVisitante());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Puntos local: </b>" + e.getPunos_local());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Puntos visitante: </b>" + e.getPuntos_vistitante());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Temporada: </b>" + e.getTemporada());
					out.print("</p>");
					out.print("</div>");
					out.print("<hr>");
				}
				%>
			</div>
			<hr>
			<!-- Ej4 -->
			<div class="content">
			<h2>Estadisticas</h2>
			<%
				for (Estadistica e : estadisticas) {
					out.print("<div class=" + "Temporada" + ">");
					out.print("<h3>");
					out.print(e.getTemporada());
					out.print("</h3>");
					out.print("<p>");
					out.print("<b>Jugador: </b>" + e.getJugador());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Puntos por partido: </b>" + e.getPuntos_por_partido());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Astistencias por partido: </b>" + e.getAssist_por_partido());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Puntos visitanteRebotes por partido: </b>" + e.getRebotes_por_partido());
					out.print("</p>");
					out.print("<p>");
					out.print("<b>Tapones por partido: </b>" + e.getTapones_por_partido());
					out.print("</p>");
					out.print("</div>");
					out.print("<hr>");
				}
				%>
			</div>
		</div>
	</section>
	<!-- Footer -->
	<footer id="footer">
		<div class="inner">
			<div class="content">
				<section>
					<h3>Accumsan montes viverra</h3>
					<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing
						gravida odio porttitor sem non mi integer non faucibus ornare mi
						ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien
						lorem accumsan varius montes viverra nibh in adipiscing. Lorem
						ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum.
						Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed
						feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia
						ante nunc ac gravida.</p>
				</section>
				<section>
					<h4>Sem turpis amet semper</h4>
					<ul class="alt">
						<li><a href="#">Dolor pulvinar sed etiam.</a></li>
						<li><a href="#">Etiam vel lorem sed amet.</a></li>
						<li><a href="#">Felis enim feugiat viverra.</a></li>
						<li><a href="#">Dolor pulvinar magna etiam.</a></li>
					</ul>
				</section>
				<section>
					<h4>Magna sed ipsum</h4>
					<ul class="plain">
						<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
			<div class="copyright">
				&copy; <a href="https://www.centronelson.org">Centro Nelson</a>.
			</div>
		</div>
	</footer>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>