<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

		<p>服の画像</p>
		<%-- form actionタグは未実装 --%>
		<%-- <form action="clothes_register_check.jsp" method="post" enctype="multipart/form-data" ></form> --%>
      	<input type="file" name="clothes_img1">

		<p>服の種類</p>
			<select name="clothes_kind">
			  <option value="clothes_kind1"></option>
			</select><br>

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

		<p><a href="/hello/MainServlet">メイン画面に戻る</a></p>
		<p><a href="/hello/ClothesRegisterDisplayServlet">確認</a></p>
	</main>
	<footer>
	    <div>
	        <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	    </div>
	</footer>

</body>
</html>