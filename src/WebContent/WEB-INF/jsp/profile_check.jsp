<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>プロフィール変更</title>
</head>
<body>
<p>プロフィール変更画面</p>

<p><a href="/hello/ProfileServlet">プロフィール画面へ戻る</a></p>
<form method="POST" action="/hello/MainServlet" id="ProfileChange_form">
    <input type="submit" name="ProfileChange_" value="確定">
 </form>


</body>
</html>