<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    Cookie cookie = new Cookie("myCookie", "Apple");
	cookie.setMaxAge(60);
	cookie.setValue("Banana");
    response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Cookie 사용하여 연결 유지</h2>
<a href="01.2.testCookie.jsp">클릭하세요</a>
</body>
</html>