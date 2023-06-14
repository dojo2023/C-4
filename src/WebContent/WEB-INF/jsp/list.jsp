<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/list.css">
<title>タグ一覧画面</title>
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

	<p>服一覧画面</p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">上に羽織るもの（薄手）</a></p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">上に羽織るもの</a></p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">防寒着</a></p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">半袖</a></p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">長袖（薄手）</a></p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">長袖</a></p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">ボトムス（薄手）</a></p>
	<p><a href="/hello/ClothesListdeleteupdateServlet">ボトムス</a></p>
	<p><a href="/hello/MainServlet">メイン画面にもどる</a></p>

 </main>

<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>
</body>
</html>