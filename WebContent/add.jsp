<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
<table>
<tr>
<td>图书名称</td>
<td><input type="text"  name="bookname"> </td>
</tr>
<tr>
<td>图书价格</td>
<td><input type="text"  name="bookprice"> </td>
</tr>
<tr>
<td>作者</td>
<td><input type="text"  name="author"> </td>
</tr>

</table>
<a href="show"><input type="button" value="返回"></a><input type="submit" value="提交">
</form>
</body>
</html>