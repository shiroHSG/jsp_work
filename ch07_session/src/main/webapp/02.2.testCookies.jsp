<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Cookie[] cookies = request.getCookies(); %>
<%!
	public String getCookieValue(Cookie[] cookies, String name) {
		for(int i=0; i<cookies.length; i++) {
			if(cookies[i].getName().equals(name)) {
				return cookies[i].getValue();
			}
		}
		return null;
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : <%=getCookieValue(cookies, "NAME") %>
	나이 : <%=getCookieValue(cookies, "AGE") %>
	성별 : <%=getCookieValue(cookies, "GENDER") %>

<!-- 	if(cookies != null) {
		for(int i=0; i<cookies.length; i++) {
			out.print("Cookie Name : " + cookies[i].getName() + "<p/>");
			out.print("Cookie value : " + cookies[i].getValue() + "<p/>");
		}
	} -->
</body>
</html>