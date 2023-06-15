<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/record_display.css">
<title>コーディネート履歴検索結果</title>
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
    <h2>コーディネート履歴検索結果</h2>
    <div class="table">
  	<table class="list">
      <tr>
        <th>日付</th><th>最高気温[℃]</th><th>最低気温[℃]</th><th>画像(トップス)</th><th>画像(ボトムス)</th><th>画像(アウター)</th>
      </tr>

    </table>
    </div>

    <div class=button>
    <p><a href="/hello/RecordSearchServlet">履歴検索画面に戻る</a></p>
    <p><a href="/hello/MainServlet">メイン画面に戻る</a></p>
    </div>

</main>
<footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
</footer>
</body>
</html>