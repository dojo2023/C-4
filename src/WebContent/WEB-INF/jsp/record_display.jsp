<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/hello/css/record_display.css">
    <link rel="stylesheet" href="/hello/css/common.css"><!-- 共通CSS使用 -->
    <title>コーディネート履歴検索結果</title>
</head>
<body>
<h1>コーディネート履歴検索結果</h1>

	<!--<c:if test="${empty cardList}">
      <p>一致するデータはありません。</p>
    </c:if>-->

<c:forEach var="e" items="${record_search}">
   <!-- <input type="hidden" name="currentIndex" value="${loop.index}"> -->
    日付<input type="date" name="DAY_DAY" value="${e.DAY_DAY}"><br>
    最高気温<input type="text" name="DAY_HTEMPERTURE" value="${e.DAY_HTEMPERTURE}"><br>
    最低気温<input type="text" name="DAY_LTEMPERTURE" value="${e.DAY_LTEMPERTURE}"><br>
    トップス<input type="text" name="DAY_TOPSNO" value="${e.DAY_TOPSNO}"><br>
    アウター①<input type="text" name="DAY_OUTERNO1" value="${e.DAY_OUTERNO1}"><br>
    アウター②<input type="text" name="DAY_OUTERNO2" value="${e.DAY_OUTERNO2}"><br>
    ボトムス<input type="text" name="DAY_BOTTOMNO" value="${e.DAY_BOTTOMNO}"><br>

  <hr>
</c:forEach>
</body>
</html>