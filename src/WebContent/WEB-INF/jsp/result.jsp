<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>画像表示</title>
</head>
<body>

	新規登録をしようとされた方→そのIDは既に利用されています。

	服の登録をしようとされた方→服の登録は上から順にお願いします。

	<form method="GET" action="/hello/LoginServlet"  >
		<button type="submit" name="ProfileChange_" value="確定" id="profile_check">
	    	確認
    	</button>
	</form>


</body>
<script>

</script>

</html>