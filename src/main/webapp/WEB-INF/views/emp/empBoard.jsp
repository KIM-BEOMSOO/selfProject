<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- c:forEach를 사용하려면, 해당 라이브러리를 jsp 페이지 최상단에 추가해야 함 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 게시판</title>
</head>
<body>
	<!-- 의미론적 태그(아무 의미 없지만, 개발자가 알아보기 편하게 만든 태그) -->
	<header>
		<!-- include를 위한 JSP문법 --> 
		<%@ include file ="../include/header.jsp"%>
	</header>
	
	<h1>사원 게시판</h1>
	
	<form>
		<input type="text" placeholder="이름을 검색하세요">
		<button type="submit">검색</button>	
		<button type="button" id="moveEmpInsertPage">사원등록</button>
	</form>
	
	<table border="1">	
		<tr align="center">
			<td colspan = "4">사원정보</td>
		</tr>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>주민등록번호</td>
			<td>가입일</td>
		</tr>
		<tr>
			<!-- c:forEach = 반복문을 의미 --> 
			<!-- var = 변수명을 board로 하겠다 -->
			<!-- items = 변수명 var에 들어갈 값 (Controller에서 Model에 담았던 값 list를 board라는 변수명 안에 넣겠다) -->
			<c:forEach var="board" items="${list }">
				<tr>
					<td><c:out value="${board.emp_no }"/></td>
					<td><a href="<c:url value='board/read?emp_no=${board.emp_no }'/>"><c:out value="${board.ename_kr }"/></a></td>
					<td><c:out value="${board.emp_rrno}"/></td>
					<td><c:out value="${board.join_date }"/></td>
				</tr>
			</c:forEach>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<input type="button" onclick="location.href='main'" value="홈">
			</td>
		</tr>
	</table>
	
	<script>
		document.getElementById("moveEmpInsertPage").addEventListener("click", function() {
		    location.href = "empInsert"; // empInsert.jsp 페이지로 이동
		});
	</script>
	
</body>
</html>