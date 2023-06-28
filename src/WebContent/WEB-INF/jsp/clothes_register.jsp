<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_register.css">
<!--  <link rel="stylesheet" href="/hello/css/common.css">  --> <!-- 共通CSS使用 -->
<script type="text/javascript" src="/hello/JS/clothes_register.js"></script>
<title>服登録</title>
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
		<h2>服登録</h2>

		<form method="POST" action="/hello/ClothesRegisterServlet" id="ClothesRegister_form"  enctype="multipart/form-data"
			 onsubmit = "return hoge();">

			<!-- 一つ目 -->
			<p id = img>服の画像</p>
    	  	<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);" required>
			<canvas id="preview" style="max-width:200px;"></canvas><br>
			<p>服の種類</p>
			<select name="clothes_kind">
				<c:forEach var="e" items="${smallcategory_list}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

			<!-- 二つ目 -->
			<p id = img>服の画像</p>
    	  	<input type="file" name="IMAGE2" accept="image/*" onchange="preview2Image(this);">
			<canvas id="preview2" style="max-width:200px;"></canvas><br>
			<p>服の種類</p>
			<select name="clothes_kind2">
				<c:forEach var="e" items="${smallcategory_list2}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>


			<!-- 三つ目 -->
			<p id = img>服の画像</p>
    	  	<input type="file" name="IMAGE3" accept="image/*" onchange="preview3Image(this);">
			<canvas id="preview3" style="max-width:200px;"></canvas><br>
			<p>服の種類</p>
			<select name="clothes_kind3">
				<c:forEach var="e" items="${smallcategory_list3}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>


			<!-- 四つ目 -->
			<p id = img>服の画像</p>
    	  	<input type="file" name="IMAGE4" accept="image/*" onchange="preview4Image(this);">
			<canvas id="preview4" style="max-width:200px;"></canvas><br>
			<p>服の種類</p>
			<select name="clothes_kind4">
				<c:forEach var="e" items="${smallcategory_list4}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>


			<!-- 五つ目 -->
			<p id = img>服の画像</p>
    	  	<input type="file" name="IMAGE5" accept="image/*" onchange="preview5Image(this);">
			<canvas id="preview5" style="max-width:200px;"></canvas><br>
			<p>服の種類</p>
			<select name="clothes_kind5">
				<c:forEach var="e" items="${smallcategory_list5}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

			<!-- 六つ目 -->
			<p id = img>服の画像</p>
    	  	<input type="file" name="IMAGE6" accept="image/*" onchange="preview6Image(this);">
			<canvas id="preview6" style="max-width:200px;"></canvas><br>
			<p>服の種類</p>
			<select name="clothes_kind6">
				<c:forEach var="e" items="${smallcategory_list6}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

			<div class = link>
				<p><a href="/hello/MainServlet">メイン画面に戻る</a></p>
					<div class ="button">
				    <button type="submit" name="ClothesRegister" value="登録" id="ClothesRegister">
				    	確認
				    </button>
					</div>
			</div>
		</form>

	</main>
	<footer>
	<br>
	<br>
	<br>
	    <div>
	        <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	    </div>
	</footer>

</body>

</html>