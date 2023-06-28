<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/user_register.css">
<title>ユーザー登録</title>
<div class = "headermenu">
	<img src="/hello/images/logo_images/0625_1.png" id="logoimg"></a>
</div>
</head>
<body>
	<header>
	</header>
	<main>
	<div class = narrow>
	<h2>ユーザー登録</h2>

<form method="POST" action="/hello/UserRegisterServlet" id="UserRegister_form" onsubmit = "return hoge();">
	<div class = side><h4>ID</h4><input type="text" name="user_id" required><br></div>
	<div class = side><h4>PW</h4><input type="password" name="user_pw" required><br></div>
	<h4>性別</h4><input type="radio" name="user_genderid" value="1" checked>男
	<input type="radio" name="user_genderid" value="2">女
	<input type="radio" name="user_genderid" value="3">その他<br>
	<h4>居住地</h4>
		<select name="user_homeid">
		<c:forEach var="e" items="${list}" >
		  <option value="${e.ID}">${e.HOME}</option>
		 </c:forEach>
		</select>

	<br>
	<h4>暑がり寒がり</h4>
		<select name="user_ptempertureid">
		<c:forEach var="f" items="${list2}" >
		  <option value="${f.ID}">${f.USER_PTEMPERTURE}</option>
		 </c:forEach>
		</select><br>
	</div>

	<div class = wide>
		<p class = memo>暑がりの方は＋、寒がりの方は‐</p>
	</div>
		<div class = link>
			<div class="MainBackLink">
					<p><a href="/hello/LoginServlet">ログイン画面に戻る</a></p>
			</div>
			<div class ="button">
				    <button type="submit" name="UserRegister" value="登録" id="UserRegister">
				    	確認
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