<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_update_check.css">
<title>編集確認画面</title>
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

	  <p>編集確認</p>

	 <form method="POST" action="/hello/ClothesListUpdateDisplayServlet" id="ClothesRegisterCheck_form" onsubmit = "return hoge();">
		<p>服の画像</p>
			<img src="${clothesuptag.CLO_IMAGES}" id="gazo">
		 <p>服の種類</p>
		<input type="text" name="clothes_kind" value="${clothesuptag.SMALL_NAME}" readonly style="background-color:white"><br>

		<div class ="button">
		    <button type="submit" name="ClothesRegisterCheck" value="登録" id="ClothesRegisterCheck">
		    	登録
		    </button>
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