<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/user_register.css">
<title>ユーザー登録</title>
<img src="/hello/images/logo_images/clo_logo6.png" id="logoimg">
</head>
<body>
	<header>
	</header>
	<main>
	<h2>ユーザー登録</h2>

<form method="POST" action="/hello/UserRegisterServlet" id="UserRegister_form" onsubmit = "return hoge();">
	<p>ID</p><input type="text" name="user_id" required><br>
	<p>PW</p><input type="password" name="user_pw" required><br>
	<p>性別</p><input type="radio" name="user_genderid" value="1" checked>男
	<input type="radio" name="user_genderid" value="2">女
	<input type="radio" name="user_genderid" value="3">その他<br>
	<p>居住地</p>
		<select name="user_homeid">
		<c:forEach var="e" items="${list}" >
		  <option value="${e.ID}">${e.HOME}</option>
		 </c:forEach>
		</select>

	<br>
	<p>暑がり寒がり</p>
		<select name="user_ptempertureid">
		<c:forEach var="f" items="${list2}" >
		  <option value="${f.ID}">${f.USER_PTEMPERTURE}</option>
		 </c:forEach>
		</select><br>

	<p>暑がりの方は＋、寒がりの方は‐</p>
	<div class="MainBackLink">
			<p><a href="/hello/LoginServlet">ログイン画面に戻る</a></p>
	</div>
	<div class ="button">
		    <button type="submit" name="UserRegister" value="登録" id="UserRegister">
		    	確認
		    </button>
	</div>
	</form>

	</main>
	<footer>
	    <div>
	        <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	    </div>
	</footer>
</body>
</html>