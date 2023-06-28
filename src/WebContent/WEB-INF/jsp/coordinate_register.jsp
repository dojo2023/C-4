<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="model.Cloth" %>
    <%@page import="model.Small_category" %>
<!DOCTYPE html>
<%Small_category smallTag1 = (Small_category)session.getAttribute("smallTag1");%>
<%Small_category smallTag2 = (Small_category)session.getAttribute("smallTag2");%>
<%Small_category smallTag3 = (Small_category)session.getAttribute("smallTag3");%>
<%Small_category smallTag4 = (Small_category)session.getAttribute("smallTag4");%>
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
<h2>コーディネート登録画面</h2>


<!--
  <input type="radio" name="first" value="clothes1" checked>
  <input type="radio" name="first" value="clothes2">
  <input type="radio" name="first" value="clothes3">
-->
<p>${smallTag1.SMALL_CATEGORY}</p>
<form method="POST" action="/hello/CoordinateRegisterServlet">
    <c:forEach var="e" items="${Coordinate1}">

		<p>${smallTag1.SMALL_CATEGORY}</p>
		 <img src="${e.CLO_IMAGES}"   ><br>


	     <input type="radio" name="cood_tops" value="${e.ID}" required>
		<br>

		<hr>
	</c:forEach>
  <br>

<p>${smallTag2.SMALL_CATEGORY}</p>
	<c:forEach var="f" items="${Coordinate2}">

		<p>${smallTag2.SMALL_CATEGORY}</p>
		 <img src="${f.CLO_IMAGES}" ><br>


	     <input type="radio" name="cood_outer1" value="${f.ID}" >
		<br>

		<hr>
	</c:forEach>
  <br>

  <br>
	<p>${smallTag3.SMALL_CATEGORY}</p>
	<c:forEach var="g" items="${Coordinate3}">

		<p>${smallTag3.SMALL_CATEGORY}</p>
		 <img src="${g.CLO_IMAGES}" ><br>


	     <input type="radio" name="cood_outer2" value="${g.ID}" >
		<br>

		<hr>
	</c:forEach>
   <br>

<p>${smallTag4.SMALL_CATEGORY}</p>
	<c:forEach var="h" items="${Coordinate4}">

		<p>${smallTag4.SMALL_CATEGORY}</p>
		 <img src="${h.CLO_IMAGES}" ><br>


	     <input type="radio" name="cood_bottoms" value="${h.ID}" required>
		<br>

		<hr>
	</c:forEach>
   <br>
   <div class="CoLink">

   <div class = "clo_register">
 	<p><a href="/hello/MainServlet">メイン画面へ戻る</a></p>
	</div>

	<br>
		<button type="submit" name="CoordinateRegister" value="登録" id="CoordinateRegister">登録</button>

</form>

	</div>

</main>
 <footer>
        <div>
         <!--    <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p> -->
        </div>
    </footer>

</body>
</html>