<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/board/write" method="post">
        제목: <input type="text" name="title" value="${board.title}">
        내용: <input type="text" name="content" value="${board.content}">
        <br/>
        <br/>
        <button type="submit">작성하기</button>
    </form>
</body>
</html>
