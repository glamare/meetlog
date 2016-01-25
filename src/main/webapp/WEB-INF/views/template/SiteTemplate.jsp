<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<!-- BOOTSTRAP STYLES-->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link
	href="${pageContext.request.contextPath}/resources/css/font-awesome.css"
	rel="stylesheet" />
<!--CUSTOM BASIC STYLES-->
<link href="${pageContext.request.contextPath}/resources/css/basic.css"
	rel="stylesheet" />
<!--CUSTOM MAIN STYLES-->
<link href="${pageContext.request.contextPath}/resources/css/custom.css"
	rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />

</head>
<body>
	<div id="wrapper">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="menu" />
		<div id="page-wrapper">
			<div id="page-inner">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>