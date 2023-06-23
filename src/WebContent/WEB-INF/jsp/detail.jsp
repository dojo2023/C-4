<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="model.Cloth" %>
    <%@page import="model.Small_category" %>
<!DOCTYPE html>
<%Small_category smallTag = (Small_category)session.getAttribute("smallTag");%>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/detail.css">
<title>各タグ詳細一覧画面</title>
</head>
<body>
<header>
   <div class="headwrapper">
        <div class="headermenu">
            <ul class="nav">
                <li><a href="/hello/MainServlet">ロゴ</a></li>
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
	<p>各タグ詳細一覧画面</p>
	<p>${smallTag.SMALL_CATEGORY}</p>

	<c:forEach var="e" items="${clothesTagList}">
	<form method="POST" action="/hello/ClothesListdeleteupdateServlet">
		<p>${smallTag.SMALL_CATEGORY}</p>
		<img src="${e.CLO_IMAGES}" id="gazo"><br>
		<input type="hidden" name="clothes__id" value = "${e.ID}">
		<input type="hidden" name="clothes__name" value = "${smallTag.SMALL_CATEGORY}">
		<input type="hidden" name="clothes__images" value = "${e.CLO_IMAGES}">
		<button type="submit" name="SUBMIT" value="更新">
			更新
		</button>
		<button type="submit" name="SUBMIT" value="削除">
			削除
		</button>
		<br>
		</form>
		<hr>
	</c:forEach>










	<p><a href="/hello/ClothesListServlet">タグ一覧画面にもどる</a></p>
	<p><a href="/hello/ClothesListDeleteDisplayServlet">削除ボタン</a></p>
	<p><a href="/hello/ClothesListUpdateServlet">編集ボタン</a></p>
</main>
<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>

</body>
</html>