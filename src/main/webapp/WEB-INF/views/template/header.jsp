<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<nav class="navbar navbar-default navbar-cls-top " role="navigation"
	style="margin-bottom: 0">
	<div class="navbar-header">
		<!-- <button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".sidebar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button> -->
		<a class="navbar-brand" href="">Meetlog</a>
	</div>

	<div class="header-right">
		<sec:authorize ifAnyGranted="isAuthenticated()">

			<c:url value="/j_spring_security_logout" var="logoutUrl" />

			<!-- csrt for log out-->
			<form action="${logoutUrl}" method="post" id="logoutForm">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>

			<a class="btn btn-danger" href="javascript:formSubmit()"> Se
				déconnecter</a>
		</sec:authorize>
		<sec:authorize ifNotGranted="isAuthenticated()">
		<spring:url value="/login" var="loginUrl" htmlEscape="true" />
			<a class="btn btn-primary" href="${loginUrl}"> Se connecter</a>
		</sec:authorize>
	</div>
</nav>
