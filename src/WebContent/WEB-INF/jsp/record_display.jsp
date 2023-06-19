<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/hello/css/record_display.css">
    <title>コーディネート履歴検索結果</title>
</head>
<body>
	<c:if test="${empty cardList}">
  <p>一致するデータはありません。</p>
</c:if>

 <h1>Record Display</h1>

<c:forEach var="e" items="${cardList}" varStatus="loop">
    <input type="hidden" name="currentIndex" value="${loop.index}"> <!-- Add hidden input field for current index -->
    日付<input type="date" name="DAY_DAY" value="${e.day_day}"><br>
    最高気温<input type="text" name="DAY_HTEMPERTURE" value="${e.day_htemperture}"><br>
    最低気温<input type="text" name="DAY_LTEMPERTURE" value="${e.day_ltemperture}"><br>
    トップス<input type="text" name="DAY_TOPSNO" value="${e.outfits}"><br>
    ボトムス<input type="text" name="DAY_BOTTOMNO" value="${e.bottpms}"><br>
    アウター<input type="text" name="DAY_OUTERNO" value="${e.outerwear}"><br>
  <hr>
</c:forEach>
</body>
</html>