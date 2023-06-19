<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.User" %>
<!DOCTYPE html>

<%User login_user = (User)session.getAttribute("login_user");%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/main3.css">
<title>メイン画面</title>
</head>
<body>
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
    <div class="date">
        <p class="datedate">今日<span id="today"></span></p>
    </div>
    <div class="weatherbox">
        <div class="tempbox">
            最高気温:<span id="temphigh"></span>°C<br/>
            最低気温:<span id="templow"></span>°C
        </div>
        <div>
            <img id="weatherimg" src="'/hello/images/weather_images/weather_快晴.png'" alt="">
        </div>
    </div>
    <div class="title">
        <h1 class="rec">おすすめの組み合わせ</h1>
    </div>
    <div class="recomendclothes">
        <a href="#"><div id="tops"></div></a>
        <a href="#"><div id="outer"></div></a>
        <a href="#"><div id="bottoms"></div></a>
    </div>

    <div class="coordregister">
        <p><a href="#">コーディネート登録</a></p>
    </div>


 </main>

    <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
    </footer>

    <script src = "/hello/JS/main.js"></script>
</body>
</html>