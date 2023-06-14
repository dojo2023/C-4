<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/coordinate_register_check.css">
<title>コーディネート登録確認</title>
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

<p>コーディネート登録確認画面</p>

  <p>(仮)服タグ1</p>


  <br>
  <p>(仮)服タグ2</p>

  <br>
  <p>(仮)服タグ3</p>


<p><a href="/hello/CoordinateRegisterServlet">コーディネート登録画面へ戻る</a></p>

<form method="POST" action="/hello/MainServlet" id="CoordinateRegister_form">
    <input type="submit" name="CoodinateRegister" value="登録">
 </form>



</main>
 <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
 </footer>

</body>
</html>