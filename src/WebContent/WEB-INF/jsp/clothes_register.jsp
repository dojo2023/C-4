<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_register.css">
<title>服登録</title>
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
		<p>登録</p>

		<form method="POST" action="/hello/ClothesRegisterServlet" id="ClothesRegister_form"  enctype="multipart/form-data"
			 onsubmit = "return hoge();">

			<p>服の画像</p>
    	  	<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);">
			<canvas id="preview" style="max-width:200px;"></canvas><br>

			<p>服の種類</p>
			<select name="clothes_kind">
				<c:forEach var="e" items="${smallcategory_list}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

			<p>服の画像</p>
    	  	<input type="file" name="IMAGE2" accept="image/*" onchange="preview2Image(this);">
			<canvas id="preview2" style="max-width:200px;"></canvas><br>

			<p>服の種類</p>
			<select name="clothes_kind2">
				<c:forEach var="e" items="${smallcategory_list2}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

			<p>服の画像</p>
    	  	<input type="file" name="IMAGE3" accept="image/*" onchange="preview3Image(this);">
			<canvas id="preview3" style="max-width:200px;"></canvas><br>

			<p>服の種類</p>
			<select name="clothes_kind3">
				<c:forEach var="e" items="${smallcategory_list3}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

			<p>服の画像</p>
    	  	<input type="file" name="IMAGE4" accept="image/*" onchange="preview4Image(this);">
			<canvas id="preview4" style="max-width:200px;"></canvas><br>

			<p>服の種類</p>
			<select name="clothes_kind4">
				<c:forEach var="e" items="${smallcategory_list4}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

			<p>服の画像</p>
    	  	<input type="file" name="IMAGE4" accept="image/*" onchange="preview4Image(this);">
			<canvas id="preview4" style="max-width:200px;"></canvas><br>

			<p>服の種類</p>
			<select name="clothes_kind4">
				<c:forEach var="e" items="${smallcategory_list4}" >
				  <option value="${e.ID}">${e.SMALL_CATEGORY}</option>
				</c:forEach>
			</select><br>

		<p><a href="/hello/MainServlet">メイン画面に戻る</a></p>
		<!--  <p><a href="/hello/ClothesRegisterDisplayServlet">確認</a></p> -->
			<div class ="button">
		    <button type="submit" name="ClothesRegister" value="登録" id="ClothesRegister">
		    	確認
		    </button>
			</div>
		<%--
		<form onsubmit="return hoge();">
		<a href="/hello/ClothesRegisterDisplayServlet">
		  <button type="submit">確認</button>
		 </a>
		</form>
		--%>
		</form>

	</main>
	<footer>
	    <div>
	        <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	    </div>
	</footer>

</body>

<script>
	function previewImage(obj){

		var fileReader = new FileReader();

		// 読み込み後に実行する処理
		fileReader.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas = document.getElementById('preview');
			var ctx = canvas.getContext('2d');
			var image = new Image();
			image.src = fileReader.result;
			console.log(fileReader.result) // ← (確認用)

			image.onload = (function () {
				canvas.width = image.width;
				canvas.height = image.height;
				ctx.drawImage(image, 0, 0);
			});
		});
		// 画像読み込み
		fileReader.readAsDataURL(obj.files[0]);
		console.log(fileReader.result) // ← (確認用)null
	}


	function preview2Image(obj){

		var fileReader2 = new FileReader();

		// 読み込み後に実行する処理
		fileReader2.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas2 = document.getElementById('preview2');
			var ctx2 = canvas2.getContext('2d');
			var image2 = new Image();
			image2.src = fileReader2.result;
			console.log(fileReader2.result) // ← (確認用)

			image2.onload = (function () {
				canvas2.width = image2.width;
				canvas2.height = image2.height;
				ctx2.drawImage(image2, 0, 0);
			});
		});
		// 画像読み込み
		fileReader2.readAsDataURL(obj.files[0]);
		console.log(fileReader2.result) // ← (確認用)null
	}


	function preview3Image(obj){

		var fileReader3 = new FileReader();

		// 読み込み後に実行する処理
		fileReader3.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas3 = document.getElementById('preview3');
			var ctx3 = canvas3.getContext('2d');
			var image3 = new Image();
			image3.src = fileReader3.result;
			console.log(fileReader3.result) // ← (確認用)

			image3.onload = (function () {
				canvas3.width = image3.width;
				canvas3.height = image3.height;
				ctx3.drawImage(image3, 0, 0);
			});
		});
		// 画像読み込み
		fileReader3.readAsDataURL(obj.files[0]);
		console.log(fileReader3.result) // ← (確認用)null
	}


	function preview4Image(obj){

		var fileReader4 = new FileReader();

		// 読み込み後に実行する処理
		fileReader4.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas4 = document.getElementById('preview4');
			var ctx4 = canvas4.getContext('2d');
			var image4 = new Image();
			image4.src = fileReader4.result;
			console.log(fileReader4.result) // ← (確認用)

			image4.onload = (function () {
				canvas4.width = image4.width;
				canvas4.height = image4.height;
				ctx4.drawImage(image4, 0, 0);
			});
		});
		// 画像読み込み
		fileReader4.readAsDataURL(obj.files[0]);
		console.log(fileReader4.result) // ← (確認用)null
	}


	function preview5Image(obj){

		var fileReader5 = new FileReader();

		// 読み込み後に実行する処理
		fileReader5.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas5 = document.getElementById('preview5');
			var ctx5 = canvas4.getContext('2d');
			var image5 = new Image();
			image5.src = fileReader5.result;
			console.log(fileReader5.result) // ← (確認用)

			image5.onload = (function () {
				canvas5.width = image5.width;
				canvas5.height = image5.height;
				ctx5.drawImage(image5, 0, 0);
			});
		});
		// 画像読み込み
		fileReader5.readAsDataURL(obj.files[0]);
		console.log(fileReader5.result) // ← (確認用)null
	}
</script>

</html>