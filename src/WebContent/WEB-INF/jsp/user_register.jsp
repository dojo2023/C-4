<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/user_register.css">
<title>ユーザー登録</title>
</head>
<body>
	<header>
	</header>
	<main>
	<p>ユーザー登録</p>

	<p>ID</p><input type="text" name="ID"><br>
	<p>PW</p><input type="password" name="PW"><br>
	<p>性別</p><input type="radio" name="gender" value="man" checked>男
	<input type="radio" name="gender" value="woman">女
	<input type="radio" name="gender" value="others">その他<br>
	<p>居住地</p>
		<select name="LATITUDE_AND_LONGITEDE">
		  <option value="residence1"></option>
		</select><br>
	<p>暑がり寒がり</p>
		<select name="PTEMPERTUREID">
		  <option value="ptempertureid1"></option>
		</select><br>

	<p>暑がりの方は＋、寒がりの方は‐</p>
	<p><a href="/hello/LoginServlet">ログイン画面に戻る</a></p>
	<p><a href="/hello/UserRegisterDisplayServlet">確認</a></p>
	</main>
	<footer>
	    <div>
	        <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	    </div>
	</footer>
</body>
</html>