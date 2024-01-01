<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	
	<h1>사원정보 수정</h1>
	
	<table border="1">
		<tr>
			<td>사원번호</td>
			<td>
				<c:out value='${boardDto.emp_no }'/>
				<input type="hidden" value="<c:out value='${boardDto.emp_no }'/>">
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" value="<c:out value='${boardDto.ename_kr }'/>"></td>
		</tr>
		<tr>
			<td>주민등록번호</td>
			<td>
				<input type="text" value="<c:out value='${boardDto.emp_rrno_F }'/>">
				-	
				<input type="text" value="<c:out value='${boardDto.emp_rrno_B }'/>">
			</td>
		</tr>
		<tr>
			<td>가입일</td>
			<td><input type="date" value="<c:out value='${boardDto.join_date }'/>"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="button" id="">저장</button>
				<button type="button" id="">취소</button>
			</td>
		</tr>
	</table>

</body>
</html>