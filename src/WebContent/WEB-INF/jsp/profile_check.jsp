<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/profile_check.css">
<script type="text/javascript" src="/hello/JS/profile_check.js"></script>
<title>プロフィール変更</title>
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
<p>プロフィール変更画面</p>
<form method="POST" action="/hello/MainServlet" id="ProfileChange_form" onsubmit = "return hoge();">
  <p>ID</p>
  	  <input type="text" name="ID" value="${e.ID}">
  <p>PW</p>
	  <input type="password" name="PW" value="${e.PW}">
  <p>性別</p>
	  <input type="radio" name="gender" value="${e.GENDER}" checked>男
	  <input type="radio" name="gender" value="${e.GENDER}">女
	  <input type="radio" name="gender" value="${e.GENDER}">その他

  <p>居住地</p>
		<select name="LATITUDE_AND_LONGITUDE">
		<option value="${e.latitude_and_longitude }"></option>
		</select>


  <p>暑がり・寒がり</p>
	  	<select name="PTEMPERTUREID">
		<option value="${e.ptemperture}"></option>
		</select>

<br>
<div class ="button">

    <button type="submit" name="ProfileChange_" value="確定" id="profile_check">
    確定
    </button>

</div>
 </form>



    <p><a href="/hello/ProfileServlet">プロフィール画面へ戻る</a></p>

 </main>

 <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
    </footer>

</body>
</html>