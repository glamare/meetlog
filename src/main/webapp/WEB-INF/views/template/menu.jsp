<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="navbar-default navbar-side">
	<div class="sidebar-collapse">
		<ul class="nav" id="main-menu">
			<li><spring:url value="/" var="homeUrl" htmlEscape="true" /> <a
				href="${homeUrl}">Home</a></li>
			<li><spring:url value="/about" var="aboutUrl" htmlEscape="true" />
				<a href="${aboutUrl}">About</a></li>
		</ul>
	</div>
</div>