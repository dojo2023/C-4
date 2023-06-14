<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/main.css">
<title>メイン画面</title>
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
        <p>画面が入ります</p>
        <p><a href="/hello/RecordSearchServlet">コーディネート履歴検索画面</a></p>
		<p><a href="/hello/ClothesRegisterServlet">登録画面</a></p>
		<p><a href="/hello/ClothesListServlet">服一覧画面</a></p>
		<p><a href="/hello/CoordinateRegisterServlet">コーディネート登録画面</a></p>
		<p><a href="/hello/ProfileServlet">プロフィール画面</a></p>
    </main>

    <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
    </footer>


</body>


</html>