<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/profile_check.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<script type="text/javascript" src="/hello/JS/profile_check.js"></script>
<title>プロフィール変更</title>
</head>
<body>

<header>
        <div class="headwrapper">
        <div class="headermenu">
            <ul class="nav">
                 <a href="/hello/MainServlet"><img src="/hello/images/logo_images/clo_logo6.png" id="logoimg"></a>
                <li><a href="/hello/ClothesRegisterServlet">服登録</a></li>
                <li><a href="/hello/ClothesListServlet">一覧</a></li>
                <li><a href="/hello/RecordSearchServlet">コーディネート履歴</a></li>
                <li><a href="/hello/ProfileServlet"> プロフィール</a></li>
                <li><a href="/hello/LoginServlet">ログアウト</a></li>

            </ul>
        </div>
        </div>
    </header>

<main>
<p>プロフィール変更画面</p>
<form method="POST" action="/hello/ProfileUpdateServlet" id="ProfileChange_form" onsubmit = "return hoge();">
	<p>ID</p>
	<input type="text" name="ID" value="${login_user.USER_ID}">

	<p>PW</p>
	<input type="password" name="PW" value="${login_user.USER_PW}">

	<p>性別</p>
	<input type="radio" name="gender" value="1" <c:if test="${login_user.USER_GENDERID == 1}">checked</c:if>>男
	<input type="radio" name="gender" value="2" <c:if test="${login_user.USER_GENDERID == 2}">checked</c:if>>女
	<input type="radio" name="gender" value="3" <c:if test="${login_user.USER_GENDERID == 3}">checked</c:if>>その他

	<p>居住地</p>
	<select name="USER_HOMEID">
		<c:forEach var="e" items="${list}" >
			<option value="${e.ID}">${e.HOME}</option>
		</c:forEach>
	</select>

	<p>暑がり・寒がり</p>
	<select name="PTEMPERTUREID">
		<c:forEach var="f" items="${list2}" >
			<option value="${f.ID}">${f.USER_PTEMPERTURE}</option>
		</c:forEach>
	</select>
	<br>
	<br>
	<div class ="button">
    	<button type="submit" name="ProfileChange_" value="確定" id="profile_check">
	    確定
    	</button>
	</div>
</form>


 <div class = "ProfileCheckLink">
    <p><a href="/hello/ProfileServlet">プロフィール画面へ戻る</a></p>
 </div>
 </main>

 <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
    </footer>

</body>
</html>