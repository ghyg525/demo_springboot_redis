<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
<form action="/login" method="post">
username: <input type="text" name="username"/><br>
password: <input type="text" name="password"/>
<input type="submit" value="login">
</form>${msg}
</body>
</html>