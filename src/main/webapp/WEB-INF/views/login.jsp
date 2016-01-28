<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="row">
	<div class="col-md-12">
		<h1 class="page-head-line">Connexion</h1>
		<h1 class="page-subhead-line">entrez vos identifiants de
			connexion :</h1>
		<c:if test="${not empty error}">
			<div class="alert alert-danger text-center">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="alert alert-info text-center">${msg}</div>
		</c:if>
		<spring:url value="/j_spring_security_check" var="loginUrl" htmlEscape="true" />
		<form name='loginForm'
			action="${loginUrl}" method='POST'>
			<input type="text" name="username" class="form-control" placeholder="Your Username "  />
			<input type="password" name="password" class="form-control"
				placeholder="Your Password" />
				<input class="btn btn-primary " name="submit" type="submit"
					value="Se connecter" />
			<input type="hidden"
				name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>
</div>