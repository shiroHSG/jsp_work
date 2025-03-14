<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="mDao" class="ch08.MemberDao" />
<jsp:useBean id="mBean" class="ch08.Member" />
<jsp:setProperty name="mBean" property="*" />
<%
	mDao.insertMember(mBean);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>