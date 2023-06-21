<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_update.css">
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

 	  <form method="POST" action="/hello/ClothesListServlet" id="clothesChange_form" onsubmit = "return hoge();">
  	  <p>写真</p>
  	  <input type="file" name="CLO_IMAGES" accept="image/*" required/>
        <input type="hidden" name="photoInfo" value="${e.clo_imags}"/>

  	  <p>タグ</p>
  	  <select name="SMALL_CATEGORY">
		<option value="${e.small_category}"></option>
		</select>


		<!--<form action="ClothesListUpdateServlet" method="post" enctype="multipart/form-data">
        <label for="photo">写真:</label>
        <input type="file" name="photo" id="photo">
        <br>
        <form action="/hello/ClothesListUpdateDisplayServlet" method="post">
        <input type="hidden" name="clothId" value="<%--= clothId --%>">
        <select name="selectedValue" id="dropdown">
    	<option value="1">半袖</option>
		<option value="2">長袖(薄手)</option>
		<option value="3">長袖</option>
		<option value="4">コート</option>
		<option value="5">ジャケット(薄手)</option>
		<option value="6">ジャケット</option>
		<option value="7">カーディガン</option>
		<option value="8">長ズボン(薄手)</option>
		<option value="9">長ズボン</option>
		<option value="10">スカート</option>
		</select>-->

		<!--<label for="photo">写真:</label>
        <input type="file" name="photo" id="photo">
        <br><br>
        <select name="small_category" >
    	<option value="1">半袖</option>
		<option value="2">長袖(薄手)</option>
		<option value="3">長袖</option>
		<option value="4">コート</option>
		<option value="5">ジャケット(薄手)</option>
		<option value="6">ジャケット</option>
		<option value="7">カーディガン</option>
		<option value="8">長ズボン(薄手)</option>
		<option value="9">長ズボン</option>
		<option value="10">スカート</option>
		</select>

		<label for="photo">写真:</label>
        <input type="file" name="photo" id="photo">
        <br><br>
        <select name="small_category" >
    	<option value="1">半袖</option>
		<option value="2">長袖(薄手)</option>
		<option value="3">長袖</option>
		<option value="4">コート</option>
		<option value="5">ジャケット(薄手)</option>
		<option value="6">ジャケット</option>
		<option value="7">カーディガン</option>
		<option value="8">長ズボン(薄手)</option>
		<option value="9">長ズボン</option>
		<option value="10">スカート</option>
		</select>

		<label for="photo">写真:</label>
        <input type="file" name="photo" id="photo">
        <br><br>
        <select name="small_category" >
    	<option value="1">半袖</option>
		<option value="2">長袖(薄手)</option>
		<option value="3">長袖</option>
		<option value="4">コート</option>
		<option value="5">ジャケット(薄手)</option>
		<option value="6">ジャケット</option>
		<option value="7">カーディガン</option>
		<option value="8">長ズボン(薄手)</option>
		<option value="9">長ズボン</option>
		<option value="10">スカート</option>
		</select>

	    <label for="photo">写真:</label>
        <input type="file" name="photo" id="photo">
        <br><br>
        <select name="small_category" >
    	<option value="1">半袖</option>
		<option value="2">長袖(薄手)</option>
		<option value="3">長袖</option>
		<option value="4">コート</option>
		<option value="5">ジャケット(薄手)</option>
		<option value="6">ジャケット</option>
		<option value="7">カーディガン</option>
		<option value="8">長ズボン(薄手)</option>
		<option value="9">長ズボン</option>
		<option value="10">スカート</option>
		</select>

		<label for="photo">写真:</label>
        <input type="file" name="photo" id="photo">
        <br><br>
        <select name="small_category" >
    	<option value="1">半袖</option>
		<option value="2">長袖(薄手)</option>
		<option value="3">長袖</option>
		<option value="4">コート</option>
		<option value="5">ジャケット(薄手)</option>
		<option value="6">ジャケット</option>
		<option value="7">カーディガン</option>
		<option value="8">長ズボン(薄手)</option>
		<option value="9">長ズボン</option>
		<option value="10">スカート</option>
		</select>

	</form>-->


	<p><a href="/hello/ClothesListdeleteupdateServlet">各タグ詳細一覧画面にもどる</a></p>
	<p><a href="/hello/ClothesListUpdateDisplayServlet">変更</a></p>
	</form>
</main>


<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>

</body>
</html>