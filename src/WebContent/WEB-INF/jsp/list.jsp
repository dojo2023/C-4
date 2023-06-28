<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/list.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<title>タグ一覧画面</title>
</head>
<body>
<header>
   <div class="headwrapper">
        <div class="headermenu">
            <ul class="nav">
                <a href="/hello/MainServlet"><img src="/hello/images/logo_images/0625_1.png" id="logoimg"></a>
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


	<h2>服一覧画面</h2>
	<form method="GET" action="/hello/ClothesListdeleteupdateServlet" >

	<button value="1" name="btn">
		半袖
	</button>
	<button  value="2" name="btn">
		長袖（薄手）
	</button>

	<button  value="3" name="btn">
		長袖
	</button>

	<button value="4" name="btn" >
		防寒着
	</button>
	<button value="5" name="btn" >
		上に羽織るもの（薄手）
	</button >

	<button value="6" name="btn">
		上に羽織るもの
	</button>

	<button value="7" name="btn">
		長ズボン（薄手）
	</button>

	<button value="8" name="btn">
		長ズボン
	</button>

	<button value="9" name="btn">
		スカート
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