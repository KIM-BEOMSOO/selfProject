<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
	<form action="<c:url value = 'empDataInsert'/>" method="post">
		<table border="1">
			<!-- table-row (테이블 행) -->
			<tr>
				<!-- table-data (테이블 데이터/테이블 열) -->
				<td>이름</td>
				<td><input type="text" name="ename_kr"></td>
			</tr>
			<tr>
				<td>주민등록번호</td>
				<td>
					<input type="text" name="emp_rrno_F">
					-
					<input type="text" name="emp_rrno_B">
				</td>
			</tr>
			<tr>
				<!-- 가로 2칸을 1칸처럼 만들고, 중앙정렬 -->
				<td colspan="2" align="center">
					<!-- <input type="submit">과 동일 --> 
					<button type="submit">등록</button>
					<!-- type=button은 아무 기능이 없음 - js기능을 삽입하여 기능을 부여 -->
  					<button type="button" onclick="location.href='employeeList'">취소</button>

				</td>
			</tr>
		</table>
	</form>
	<a href="empBoard">사원 게시판</a>

</body>
</html>