<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
<p>ログイン画面</p>

<p><a href="/hello/MainServlet">メイン画面</a></p>
 <form method="POST" action="/hello/LoginServlet" id="login_form">
    <input type="submit" name="LOGIN" value="ログイン">
 </form>


</body>
</html>