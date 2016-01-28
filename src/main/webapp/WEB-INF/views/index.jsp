<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<div class="row">
	<div class="col-md-12">
		<h1 class="page-head-line">Bienvenue</h1>
		<h1 class="page-subhead-line">Vous voici sur la page d'accueil de
			Meetlog</h1>

		<sec:authorize access="hasRole('ROLE_USER')">
			<!-- For login user -->
			<c:url value="/j_spring_security_logout" var="logoutUrl" />
			<form action="${logoutUrl}" method="post" id="logoutForm">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
			<script>
				function formSubmit() {
					document.getElementById("logoutForm").submit();
				}
			</script>
			<sec:authorize access="hasRole('ROLE_USER')">
				<!-- For login user -->
				<c:url value="/j_spring_security_logout" var="logoutUrl" />
				<form action="${logoutUrl}" method="post" id="logoutForm">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
				<script>
					function formSubmit() {
						document.getElementById("logoutForm").submit();
					}
				</script>

				
					<h2>
						User : ${pageContext.request.userPrincipal.name} | <a
							href="javascript:formSubmit()"> Logout</a>
					</h2>
				


			</sec:authorize>


		</sec:authorize>
	</div>
</div>