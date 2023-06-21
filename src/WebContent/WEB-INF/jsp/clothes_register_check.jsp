<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_register_check.css">
<title>服登録確認</title>
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
		<p>登録確認</p>

		<form method="POST" action="/hello/ClothesRegisterDisplayServlet" id="ClothesRegisterCheck_form" onsubmit = "return hoge();">
		<p>服の画像</p>
			<img src="${clo_img_name.CLO_IMAGES}" id="gazo">
<!--  		<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
		<canvas id="preview" style="max-width:200px;"></canvas><br>-->


		<p>服の種類</p>
		<input type="text" name="clothes_kind" value="${clo_img_name.SMALL_NAME}" readonly style="background-color:white"><br>

<!--
		<p>服の画像</p>
		<%-- form actionタグは未実装 --%>
		<%-- <form action="clothes_register_check.jsp" method="post" enctype="multipart/form-data" ></form> --%>
      	<input type="file" name="clothes_img2">

		<p>服の種類</p>
			<select name="clothes_kind">
			  <option value="clothes_kind1"></option>
			</select><br>

		<p>服の画像</p>
		<%-- form actionタグは未実装 --%>
		<%-- <form action="clothes_register_check.jsp" method="post" enctype="multipart/form-data" ></form> --%>
      	<input type="file" name="clothes_img3">

		<p>服の種類</p>
			<select name="clothes_kind">
			  <option value="clothes_kind1"></option>
			</select><br>

		<p>服の画像</p>
		<%-- form actionタグは未実装 --%>
		<%-- <form action="clothes_register_check.jsp" method="post" enctype="multipart/form-data" ></form> --%>
      	<input type="file" name="clothes_img4">

		<p>服の種類</p>
			<select name="clothes_kind">
			  <option value="clothes_kind1"></option>
			</select><br>

		<p>服の画像</p>
		<%-- form actionタグは未実装 --%>
		<%-- <form action="clothes_register_check.jsp" method="post" enctype="multipart/form-data" ></form> --%>
      	<input type="file" name="clothes_img5">

		<p>服の種類</p>
			<select name="clothes_kind">
			  <option value="clothes_kind1"></option>
			</select><br>

		<p>服の画像</p>
		<%-- form actionタグは未実装 --%>
		<%-- <form action="clothes_register_check.jsp" method="post" enctype="multipart/form-data" ></form> --%>
      	<input type="file" name="clothes_img6">

		<p>服の種類</p>
			<select name="clothes_kind">
			  <option value="clothes_kind1"></option>
			</select><br>
-->

		<p><a href="/hello/ClothesRegisterServlet">登録画面に戻る</a></p>
		<div class ="button">
		    <button type="submit" name="ClothesRegisterCheck" value="登録" id="ClothesRegisterCheck">
		    	登録
		    </button>
		</div>
	</form>


		<!--  <p><a href="/hello/ClothesRegisterServlet">登録</a></p> -->

		<%--
		<form onsubmit="return hoge();">
		 <a href="/hello/ClothesRegisterServlet">
		  <button type="submit">登録</button></a>
		</form>
		--%>
	</main>
	<footer>
	    <div>
	        <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	    </div>
	</footer>
		<%-- <script src = "user_register_check.js"></script> --%>
</body>
</html>