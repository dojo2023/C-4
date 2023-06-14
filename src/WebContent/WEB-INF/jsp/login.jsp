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

 <form method="POST" action="/hello/LoginServlet" id="login_form">
    <input type="submit" name="LOGIN" value="ログイン">
 </form>

 <p><a href="/hello/UserRegisterServlet">新規登録はこちら</a></p>


</body>
</html>