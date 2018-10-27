<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>test</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script>
        $(function () {
                $("#selectUser").click(function () {
                    var id = $("#userId").val();
                    $.ajax({
                        method: "post",
                        url: "user/showUser.do",
                        data: {id: id},
                        dataType: "json",
                        success: function (result) {
                            alert(result.username)
                        }
                    })
                })
            }
        )
    </script>
</head>
<body>
<p id="test">Hello World!</p>
请输入id：<input type="text" id="userId" value="1">
<button type="button" id="selectUser">这是一号</button>
</body>
</html>
