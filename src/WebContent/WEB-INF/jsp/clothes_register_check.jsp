<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_register_check.css">
<!-- <link rel="stylesheet" href="/hello/css/common.css">  --><!-- 共通CSS使用 -->
<script type="text/javascript" src="/hello/JS/user_register_check.js"></script>
<title>服登録確認</title>
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
		<h2>登録確認</h2>

		<form method="POST" action="/hello/ClothesRegisterDisplayServlet" id="ClothesRegisterCheck_form" onsubmit = "return hoge();">
		<!-- 一つ目 -->
		<p id = img>服の画像</p>
			<img src="${clo_img_name.CLO_IMAGES}" id="gazo">
<!--  		<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
		<canvas id="preview" style="max-width:200px;"></canvas><br>-->
		<p>服の種類</p>
		<input type="text" name="clothes_kind" value="${clo_img_name.SMALL_NAME}" readonly style="background-color:white"><br>

		<!-- 二つ目 -->
		<p id = img>服の画像</p>
			<img src="${clo_img_name2.CLO_IMAGES}" id="gazo2">
		<!--  		<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
				<canvas id="preview" style="max-width:200px;"></canvas><br>-->
		<p>服の種類</p>
		<input type="text" name="clothes_kind2" value="${clo_img_name2.SMALL_NAME}" readonly style="background-color:white"><br>


		<!-- 三つ目 -->
		<p id = img>服の画像</p>
			<img src="${clo_img_name3.CLO_IMAGES}" id="gazo3">
		<!--  		<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
				<canvas id="preview" style="max-width:200px;"></canvas><br>-->
		<p>服の種類</p>
		<input type="text" name="clothes_kind3" value="${clo_img_name3.SMALL_NAME}" readonly style="background-color:white"><br>


		<!-- 四つ目 -->
		<p id = img>服の画像</p>
			<img src="${clo_img_name4.CLO_IMAGES}" id="gazo4">
		<!--  		<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
				<canvas id="preview" style="max-width:200px;"></canvas><br>-->
		<p>服の種類</p>
		<input type="text" name="clothes_kind4" value="${clo_img_name4.SMALL_NAME}" readonly style="background-color:white"><br>

		<!-- 五つ目 -->
		<p id = img>服の画像</p>
			<img src="${clo_img_name5.CLO_IMAGES}" id="gazo5">
		<!--  		<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
				<canvas id="preview" style="max-width:200px;"></canvas><br>-->
		<p>服の種類</p>
		<input type="text" name="clothes_kind5" value="${clo_img_name5.SMALL_NAME}" readonly style="background-color:white"><br>

		<!-- 六つ目 -->
		<p id = img>服の画像</p>
			<img src="${clo_img_name6.CLO_IMAGES}" id="gazo6">
		<!--  		<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
				<canvas id="preview" style="max-width:200px;"></canvas><br>-->
		<p>服の種類</p>
		<input type="text" name="clothes_kind6" value="${clo_img_name6.SMALL_NAME}" readonly style="background-color:white"><br>


		<p class = warning>※上記の内容に<br>お間違いないですか？</p>
		<div class = link>
			<p><a href="/hello/ClothesRegisterServlet">登録画面に戻る</a></p>
			<div class ="button">
			    <button type="submit" name="ClothesRegisterCheck" value="登録" id="ClothesRegisterCheck">
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