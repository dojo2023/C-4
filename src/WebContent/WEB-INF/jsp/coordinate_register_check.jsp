<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーディネート登録確認</title>
</head>
<body>

<p>コーディネート登録確認画面</p>
<p><a href="/hello/CoordinateRegisterServlet">コーディネート登録画面へ戻る</a></p>

<form method="POST" action="/hello/MainServlet" id="CoordinateRegister_form">
    <input type="submit" name="CoodinateRegister" value="登録">
 </form>

</body>
</html>