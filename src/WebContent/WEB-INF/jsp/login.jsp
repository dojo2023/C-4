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
 <div class="container">
    <div class="clock">
      <p class="clock-date"></p>
      <p class="clock-time"></p>
    </div>
  </div>
 <form method="POST" action="/hello/LoginServlet" id="login_form">
    ID<input type="text" name="ID"><br>
	PW<input type="password" name="PW"><br>
    <input type="submit" name="LOGIN" value="ログイン">
 </form>

 <p><a href="/hello/UserRegisterServlet">新規登録はこちら</a></p>


</body>
</html>