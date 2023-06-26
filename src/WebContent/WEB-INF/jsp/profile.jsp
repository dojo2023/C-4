<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/profile.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<title>プロフィール</title>
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
<div>
	<p>プロフィール画面</p>
	<br>
	  <table class= "profiletable">

	  <tr>
		  <th>ID</th>
		  <td>${login_user.USER_ID}</td> <!-- EL式 ${属性名.プロパティ} -->
	  </tr>
	  <tr>
		  <th>PW</th>
		  <td>${login_user.USER_PW}</td>
	  </tr>
	  <tr>
		  <th>居住地</th>
		  <td>${login_user.USER_HOMENAME}</td>
	  </tr>
	  <tr>
		  <th>性別</th>
		  <td>${login_user.USER_GENDERNAME}</td>
	  </tr>
	  <tr>
		  <th>暑がり・寒がり</th>
		  <td>${login_user.USER_PTEMPERTURENAME}</td>
	  </tr>

	  </table>
	  <br>
	  <div class="ProfileButton">
	     <p><a href="/hello/MainServlet">メイン画面へ戻る</a></p>
		 <p><a href="/hello/ProfileUpdateServlet">変更</a></p>
	  </div>

</div>
</main>

 <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
    </footer>

</body>
</html>