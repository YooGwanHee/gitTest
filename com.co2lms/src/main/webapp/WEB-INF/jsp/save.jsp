<%-- <%@ page language="java" contentType="text/html; charset=EUC-KR" --%>
<%--     pageEncoding="EUC-KR"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="helloList" items="${helloList}"  varStatus="status">
 ${helloList}  
<!--  <c:out value="$helloList"> -->
</c:forEach>
</body>
</html>