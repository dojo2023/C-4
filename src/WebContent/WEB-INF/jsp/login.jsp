<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/login.css"><!-- ログインCSS使用 -->
<title>ログイン</title>
<img src="/hello/images/logo_images/clo_logo6.png" id="logoimg">
</head>
<body>
<h2>ログイン</h2>
 <form method="POST" action="/hello/LoginServlet" id="login_form">
    ID<input type="text" name="ID"><br>
	PW<input type="password" name="PW"><br>
	<br>
    <input type="submit" name="LOGIN" value="ログイン" id="login_button">
 </form>
<div class="NewRegisterLink">
 <p><a href="/hello/UserRegisterServlet">新規登録はこちら</a></p>
</div>

<!-- 天気画像表示サンプルコード
<img src="/hello/images/weather_images/weather_快晴.png" width="200" height="200" alt="天気イメージ" >
-->



</body>
</html>