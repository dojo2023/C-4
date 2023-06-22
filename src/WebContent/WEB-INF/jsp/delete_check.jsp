<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/delete_check.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<title>削除確認画面</title>
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
	<p>削除確認画面</p>
	<p>以下のデータを削除します</p>
	<p>よろしければ削除ボタンを押してください</p>

	<p><a href="/hello/ClothesListdeleteupdateServlet">各タグ詳細一覧画面にもどる</a></p>
	<p><a href="/hello/ClothesListDeleteDisplayServlet">削除ボタン</a></p><!-- このボタンを押すと削除確認のダイアログ出る -->
</main>



<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>

</body>
</html>