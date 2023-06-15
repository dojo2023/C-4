<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/profile_check.css">
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

  <p>ID</p>
  	  <input type="text" name="ID">
  <p>PW</p>
	  <input type="password" name="PW">
  <p>性別</p>
	  <input type="radio" name="gender" value="man" checked>男
	  <input type="radio" name="gender" value="woman">女
	  <input type="radio" name="gender" value="others">その他

  <p>居住地</p>
		<select name="LATITUDE_AND_LONGITEDE">
		<option value="residence1"></option>
		</select>


  <p>暑がり・寒がり</p>
	  	<select name="PTEMPERTUREID">
		<option value="ptempertureid1"></option>
		</select>


<form method="POST" action="/hello/MainServlet" id="ProfileChange_form">
    <input type="submit" name="ProfileChange_" value="確定">
    <p><a href="/hello/ProfileServlet">プロフィール画面へ戻る</a></p>

 </form>

 </main>

 <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
    </footer>

</body>
</html>