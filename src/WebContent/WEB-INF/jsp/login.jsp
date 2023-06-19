<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
<h2>ログイン</h2>
 <form method="POST" action="/hello/LoginServlet" id="login_form">
    ID<input type="text" name="ID"><br>
	PW<input type="password" name="PW"><br>
    <input type="submit" name="LOGIN" value="ログイン">
 </form>

 <p><a href="/hello/UserRegisterServlet">新規登録はこちら</a></p>

<!-- 天気画像表示サンプルコード
<img src="/hello/images/weather_images/weather_快晴.png" width="200" height="200" alt="天気イメージ" >
-->



</body>
</html>