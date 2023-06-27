<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.User" %>
<!DOCTYPE html>
<%User login_user = (User)session.getAttribute("login_user");%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/record_search.css">
<!--<link rel="stylesheet" href="/hello/css/common.css"> 共通CSS使用 -->
<title>コーディネート履歴検索画面</title>
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
    <h2>コーディネート履歴検索画面</h2>
    <p>日付,最高気温,最低気温のいずれかを選択し入力して下さい</p>
    <p>(何も選択せず検索した場合は全件検索になります)</p>

    <form method="POST" action="/hello/RecordSearchServlet" id="Record_Search_form">
    <div class="pbox">
		<div class="box">
		    <label for="date">日付</label>
		    <input type="date" class="date" name="DAY_DAY" value="" />
		</div>


		<div class="box">
		    <label for="text">最高気温[℃]</label>
		    <input class="textbox" type="text" name="DAY_HTEMPERTURE" >
		    <input type="hidden" name="user_id"id='userid' value="<%=login_user.getUSER_ID() %>">
		</div>

		<div class="box">
		<label for="text">最低気温[℃]</label>
		    <input  class="textbox" type="text" name="DAY_LTEMPERTURE" >
		</div>
	</div>
    <div class=link>
      <p><a href="/hello/MainServlet">メイン画面に戻る</a></p>
	  <input type="submit" name="SEARCH" value="検索" id="Search">
    </div>
    </form>

</main>
<footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
</footer>
</body>
</html>