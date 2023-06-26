<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_update.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<title>編集画面</title>
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
	<p>編集画面</p>

 	  <form method="POST" action="/hello/ClothesListUpdateServlet" id="clothesChange_form"   enctype="multipart/form-data">
  	  	<p>服の画像</p>
    	  	<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
			<canvas id="preview" style="max-width:200px;"></canvas><br>
			<p>服の種類</p>
			<select name="clothes_kind">
				<c:forEach var="e" items="${smallcategory_tag}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>
			<input type="hidden" name="upclothes__id" value = "${e.ID}">
			<input type="hidden" name="upclothes__name" value = "${smallTag.SMALL_CATEGORY}">
			<input type="hidden" name="upclothes__images" value = "${e.CLO_IMAGES}">
			<p><a href="/hello/ClothesListdeleteupdateServlet">各タグ詳細一覧画面にもどる</a></p>
		<div class ="button">
		    <button type="submit" name="ClothesRegister" value="登録" id="ClothesRegister">
		    	変更
		    </button>
		 </div>
	</form>
</main>


<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>
<script type="text/javascript" src="/hello/JS/clothes_update.js"></script>
</body>
</html>