<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage Moniz Bakery </title>

<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->

	<c:if test="${userClickHome==true}">
		<%@include file="home.jsp"%>
	</c:if>
	<!-- About Us -->

	<c:if test="${userClickAbout==true}">
		<%@include file="about.jsp"%>
	</c:if>


	<c:if test="${userClickProduct==true || userClickCategoryProduct==true}">
		<%@include file="product.jsp"%>
	</c:if>


	<!-- Footer -->

	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>

</body>

</html>
