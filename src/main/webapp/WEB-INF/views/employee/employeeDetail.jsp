<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- c:forEach를 사용하려면, 해당 라이브러리를 jsp 페이지 최상단에 추가해야 함 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 상세정보</title>
</head>
<body>
	<!-- 의미론적 태그(아무 의미 없지만, 개발자가 알아보기 편하게 만든 태그) -->
	<header>
		<!-- include를 위한 JSP문법 --> 
		<%@ include file ="../include/header.jsp"%>
	</header>
	
	<h1>사원 상세정보</h1>
	<table border="1">
		<tr>
			<td>사원번호</td>
			<td><c:out value='${boardDto.emp_no }'/></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><c:out value='${boardDto.ename_kr }'/></td>
		</tr>
		<tr>
			<td>주민등록번호</td>
			<td><c:out value='${boardDto.emp_rrno }'/></td>
		</tr>
		<tr>
			<td>가입일</td>
			<td><c:out value='${boardDto.join_date }'/></td>
		</tr>
		<tr>
			<!-- 사원정보 게시판으로 돌아가는 버튼 -->
			<td colspan="2" align="center"><button type="button" id="returnEmployeeListBoard">게시판 이동</button></td>
		</tr>
	</table>
	
	<script type="text/javascript">
		document.getElementById("returnEmployeeListBoard").addEventListener("click",function(){
			location.href="<c:url value='employeeListBoard'/>"
		});
	</script>

</body>
</html>