<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/coordinate_register.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<title>コーディネート登録</title>
</head>
<body>
<header>
        <div class="headwrapper">
        <div class="headermenu">
            <ul class="nav">
                <a href="/hello/MainServlet"><img src="/hello/images/logo_images/clo_logo6.png" id="logoimg"></a>
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
<p>コーディネート登録画面</p>

<p>(仮)服タグ1</p>
  <input type="radio" name="first" value="clothes1" checked>
  <input type="radio" name="first" value="clothes2">
  <input type="radio" name="first" value="clothes3">

  <br>
  <p>(仮)服タグ2</p>
  <input type="radio" name="second" value="clothes1" checked>
  <input type="radio" name="second" value="clothes2">
  <input type="radio" name="second" value="clothes3">

  <br>
  <p>(仮)服タグ3</p>
  <input type="radio" name="third" value="clothes1" checked>
  <input type="radio" name="third" value="clothes2">
  <input type="radio" name="third" value="clothes3">

<div class = "clo_register">
 <p><a href="/hello/CoordinateRegisterDisplayServlet">コーディネート登録確認画面へ</a></p>
 <p><a href="/hello/MainServlet">メイン画面へ戻る</a></p>
</div>

</main>
 <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
    </footer>

</body>
</html>