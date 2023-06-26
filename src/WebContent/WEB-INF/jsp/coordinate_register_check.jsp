<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/coordinate_register_check.css">
<link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
<title>コーディネート登録確認</title>
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

<p>コーディネート登録確認画面</p>


		<p>${smallTag1.SMALL_CATEGORY}</p>
		 <img src="${check_tops.CLO_IMAGES}"   ><br>
		<br>

		<hr>

  <br>

<p>${smallTag2.SMALL_CATEGORY}</p>


		<p>${smallTag2.SMALL_CATEGORY}</p>
		 <img src="${check_outer2.CLO_IMAGES}" ><br>
		<br>

		<hr>

  <br>

  <br>
<p>${smallTag3.SMALL_CATEGORY}</p>

<c:if test="${not empty check_outer2 }">

		<p>${smallTag3.SMALL_CATEGORY}</p>
		 <img src="${check_outer2.CLO_IMAGES}" ><br>
		<br>

		<hr>

</c:if>
   <br>

<p>${smallTag4.SMALL_CATEGORY}</p>
		<p>${smallTag4.SMALL_CATEGORY}</p>
		 <img src="${check_bottoms.CLO_IMAGES}" ><br>
		<br>

		<hr>
   <br>







<form method="POST" action="/hello/CoordinateRegisterDisplayServlet" id="CoordinateRegister_form">
  <div class ="link">
   <div class = "CoordinateRegisterBack">
    <p><a href="/hello/MainServlet">メイン画面へ戻る </a></p>
    </div>
   <div class = "Coordinateinput">
   <button type="submit" name="CoodinateRegister" value="登録" id="Coordinateinput">
   登録
   </button>
   </div>
 </form>

   </div>



</main>
 <footer>
        <div>
            <p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
        </div>
 </footer>

</body>
</html>