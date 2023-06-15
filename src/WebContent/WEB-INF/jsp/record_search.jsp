<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/record_search.css">
<title>コーディネート履歴検索画面</title>
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
    <h2>コーディネート履歴検索画面</h2>
    <p>日付か気温どちらかを選択し入力して下さい</p>
	<div class="box">
	    <label for="date">日付</label>
	    <input type="date" class="date" name="日付" value="" />
	</div>
	<div class="box">
	    <label for="text">最高気温</label>
	    <input class="textbox" type="text" />
	    <label for="text">最低気温</label>
	    <input  class="textbox" type="text" />
	</div>

    <form method="POST" action="/hello/RecordSearchServlet" id="SEARCH_form">
        <input type="submit" name="SEARCH" value="検索">
    </form>
    <p><a href="/hello/MainServlet">メイン画面に戻る</a></p>
</main>
<footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
</footer>
</body>
</html>