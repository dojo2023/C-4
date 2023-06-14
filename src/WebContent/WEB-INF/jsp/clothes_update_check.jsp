<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<p>編集確認画面</p>
	<div>編集した服の写真</div><div>編集した服の種類タグ</div>
	<div>編集した服の写真</div><div>編集した服の種類タグ</div>
	<div>編集した服の写真</div><div>編集した服の種類タグ</div>
	<div>編集した服の写真</div><div>編集した服の種類タグ</div>
	<div>編集した服の写真</div><div>編集した服の種類タグ</div>

	<p><a href="/hello/ClothesListdeleteupdateServlet">編集画面にもどる</a></p>
	<p><a href="/hello/ClothesListDeleteDisplayServlet">更新ボタン</a></p><!-- このボタンを押すと更新確認のダイアログ出る -->

</main>





<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>
</body>
</html>