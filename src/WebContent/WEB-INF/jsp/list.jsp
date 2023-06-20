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
	<form method="POST" action="/hello/ClothesListdeleteupdateServlet" id="">
		<button type="submit" name="1" value="1">
			上に羽織るもの（薄手)
		</button>
		<button type="submit" name="2" value="2">
			上に羽織るもの
		</button>

		<button type="submit" name="3" value="3">
			防寒着
		</button>

		<button type="submit" name="4" value="4">
			半袖
		</button>
		<button type="submit" name="5" value="5">
			長袖（薄手）
		</button>
		<button type="submit" name="6" value="6">
			長袖
		</button>
		<button type="submit" name="7" value="7">
			ボトムス（薄手）
		</button>
		<button type="submit" name="8" value="8">
			ボトムス
		</button>

	</form>


	<p><a href="/hello/MainServlet">メイン画面にもどる</a></p>

 </main>

<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>
</body>
</html>