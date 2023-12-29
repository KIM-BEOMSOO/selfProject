<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- c:forEach를 사용하려면, 해당 라이브러리를 jsp 페이지 최상단에 추가해야 함 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 의미론적 태그(아무 의미 없지만, 개발자가 알아보기 편하게 만든 태그) -->
	<header>
		<!-- include를 위한 JSP문법 --> 
		<%@ include file ="../include/header.jsp"%>
	</header>
	<h1>안녕~~~</h1>
	<form>
		<input type="text" name="" value="${boardDto.emp_no }">	
		<button></button>
	</form>
	

</body>
</html>