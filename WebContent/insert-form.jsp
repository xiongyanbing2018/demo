<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertProduct.do" method="post">
	<table>
		<tr>
			<td>商品名称</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>商品价格</td>
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td>入库时间</td>
			<td><input type="text" name="createtime"></td>
		</tr>
		<tr>
			<td>商品描述</td>
			<td><input type="text" name="detail"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" name="提交"></td>
		</tr>								
	</table>
</form>
</body>
</html>