<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<div class="container h-100">
    <div class="d-flex align-items-center">
        <div class="row">
            <div class="col-10">
                <form action="/board/upsert" method="post">
                    <input type="hidden" value="${board.id}" name="attemptId">
                    <div class="row mb-1">
                        <div class="col">
                            <label for="form-title">제목</label>
                            <input type="text" name="title" value="${board.title}" class="form-control" id="form-title">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <label for="form-content">내용</label>
                            <input type="text" name="content" value="${board.content}" id="form-content">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col">
                            <button type="submit" class="btn btn-dark">입력하기</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>

</body>
</html>
