<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Day"%>
<% Day record_search = (Day)request.getAttribute("record_search");%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/hello/css/record_display.css">
    <title>コーディネート履歴検索結果</title>
</head>
<body>
	<p>
        <%=record_search.getDAY_DAY()%>
    </p>

</body>
</html>