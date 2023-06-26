<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/user_register_check.css">
<!--  <link rel="stylesheet" href="/hello/css/common.css">  --> <!-- 共通CSS使用 -->
<script type="text/javascript" src="/hello/JS/user_register_check.js"></script>
<title>ユーザー登録確認</title>
<img src="/hello/images/logo_images/clo_logo6.png" id="logoimg">
</head>
<body>
	<header>
	</header>
	<main>
	<h3>登録内容確認</h3>

	<form method="POST" action="/hello/UserRegisterDisplayServlet" id="UserRegister_form" onsubmit = "return hoge();">
	<h4>ID</h4><input type="text" name="user_id" value="${user_register.USER_ID}" readonly style="background-color:white"><br>
	<h4>PW</h4><input type="text" name="user_pw" value="${user_register.USER_PW}" readonly style="background-color:white"><br>
	<h4>性別</h4>
	<input type="text" name="user_genderid" value="${user_register.USER_GENDERNAME}" readonly style="background-color:white"><br>
	<h4>居住地</h4>
	<input type="text" name="user_homeid" value="${user_register.USER_HOMENAME}" readonly style="background-color:white">
	<h4>暑がり寒がり</h4>
	<input type="text" name="user_ptempertureid" value="${user_register.USER_PTEMPERTURENAME}" readonly style="background-color:white">

	<p class = memo>暑がりの方は＋、寒がりの方は‐</p>
	<p class = warning>※上記の内容にお間違いないですか？</p>

	<div class = link>
		<p><a href="/hello/UserRegisterServlet">ユーザー登録画面に戻る</a></p>
		<div class ="button">
		    <button type="submit" name="UserRegister" value="登録" id="UserRegister">
		    	登録
		    </button>
		</div>
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