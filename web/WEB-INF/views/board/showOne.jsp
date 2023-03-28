<%--
  Created by IntelliJ IDEA.
  User: BIT
  Date: 2023-03-15
  Time: 오후 4:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
글번호: ${result.id}<br/>
제목: ${result.title}<br/>
작성자: ${result.writerId}<br/>
작성일: ${result.entryDate}<br/>
수정일: ${result.modifyDate}<br/>
내용: ${result.content} <br/>
<c:if test="${logInId eq result.writerId}">
    <a href="/board/update/${result.id}">수정하기</a>
    <a href="/board/delete/${result.id}">삭제하기</a>
</c:if>
</body>
</html>
