<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/hello/css/record_display.css">
    <!--<link rel="stylesheet" href="/hello/css/common.css"> 共通CSS使用 -->
    <title>コーディネート履歴検索結果</title>
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
<h2>コーディネート履歴検索結果</h2>

<c:if test="${empty record_search}">
    <p>一致するデータがありません。</p>
</c:if>

<table>
  <tr>
    <th>日付</th>
    <th>最高気温</th>
    <th>最低気温</th>
    <th>トップス</th>
    <th>アウター①</th>
    <th>アウター②</th>
    <th>ボトムス</th>
  </tr>

  <c:forEach var="e" items="${record_search}">

    <tr>

       <td>
            <input type="date" name="DAY_DAY" value="${e.DAY_DAY}" readonly style="background-color:white">
        </td>
        <td>
            <input type="text" name="DAY_HTEMPERTURE" value="${e.DAY_HTEMPERTURE}" readonly style="background-color:white">
        </td>
        <td>
            <input type="text" name="DAY_LTEMPERTURE" value="${e.DAY_LTEMPERTURE}" readonly style="background-color:white">
        </td>
        <td>
			<img src="${e.DAY_TOPSTAG}"   >
			<p>${e.DAY_TOPSNAME}</p>
        </td>
        <td>
           <img src="${e.DAY_OUTER1TAG}"   >
			<p>${e.DAY_OUTER1NAME}</p>
        </td>
        <td>
            <img src="${e.DAY_OUTER2TAG}"   >
			<p>${e.DAY_OUTER2NAME}</p>
        </td>
        <td>
            <img src="${e.DAY_BOTTOMTAG}"   >
			<p>${e.DAY_BOTTOMNAME}</p>
        </td>

    </tr>

  </c:forEach>
</table>

<div class="link">
  <p><a href="/hello/MainServlet">メイン画面に戻る</a></p>
  <p><a href="/hello/RecordSearchServlet">検索画面に戻る</a></p>
</div>
</main>
</body>
</html>