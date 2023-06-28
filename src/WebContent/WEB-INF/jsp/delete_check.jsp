<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Cloth" %>
<%@page import="model.Small_category" %>
<!DOCTYPE html>
<%Small_category smallTag = (Small_category)session.getAttribute("smallTag");%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/delete_check.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<script type="text/javascript" src="/hello/JS/delete_check.js"></script>
<title>削除確認画面</title>
</head>
<body>
<header>
   <div class="headwrapper">
        <div class="headermenu">
            <ul class="nav">
                <a href="/hello/MainServlet"><img src="/hello/images/logo_images/0625_1.png" id="logoimg"></a>
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
	<h2>削除確認画面</h2>
	<p>以下のデータを削除します</p>
	<p>よろしければ削除ボタンを押してください</p>
	<form method="POST" action="/hello/ClothesListDeleteDisplayServlet" id="ProfileChange_form" onsubmit = "return hoge();">
		<p>服の画像</p>
		<input type="hidden" name="clothes__id" value = "${smallTag1.ID}">
		<img src="${smallTag1.CLO_IMAGES}" id="gazo">
		<p>服の種類</p>
		<p>${smallTag1.SMALL_TAG}</p><br>
		<div class ="button">
	    	<button type="submit" name="ProfileChange_" value="削除" id="profile_check"><!-- このボタンを押すと削除確認のダイアログ出る -->
		    	削除

	    	</button>

		</div>
	</form>
	<p><a href="/hello/ClothesListServlet">  タグ一覧画面にもどる</a></p>

</main>



<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>

</body>
</html>