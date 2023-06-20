<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/hello/css/clothes_update_check.css">
<title>編集確認画面</title>
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

	  <p>編集確認</p>

	  <table class= "clothestable">
  	  <tr>
	  <th>タグ</th>
	  <td>${small_category.SMALL_CATEGORY}</td>
      </tr>
  	  </table>


      <form action="/hello/ClothesListServlet" method="POST">

	  <p><a href="/hello/ClothesListdeleteupdateServlet">編集画面にもどる</a></p>
	  <input type="hidden" name="clothId" value="<%= request.getParameter("clothId") %>">
      <input type="hidden" name="selectedValue" value="<%= request.getAttribute("selectedValue") %>">
	  <input type="submit" value="更新"><!-- このボタンを押すと更新確認のダイアログ出る -->
	  </form>

</main>


<footer>
	<div>
		<p>&copy;Copyright Atype.Co.Ltd.All rights reserved.</p>
	</div>
</footer>
</body>
</html>