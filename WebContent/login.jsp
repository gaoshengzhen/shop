<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
当前在线人数为：${count }<br/>
<form action="login.do" method="post">
<table>
<tr>
<td>用户名：</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>密码：</td>
<td><input type="password" name=password></td>
</tr>

</table>
<input type="button" value="注册">
<input type="submit" value="登录">
</form>
</body>
</html>