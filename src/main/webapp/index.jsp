<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring_MVC测试web </title> 
<script src="./WEB-INF/views/js/jquery-1.9.1.min.js" ></script>
<script type="text/javascript">
function validateForm(){
	 return true;  
	};
</script>
</head>
<body>
	<a href="test/servlet/api">test/servlet/api</a>
	<br>
<!-- 	<a href=${pageContext.request.contextPath}/helloworld>请点击，出现helloworld!</a> -->
	<form action="test/pojo" method="GET">
		username:<input type="text" name="username" value="yao">
		age:<input type="text" name="age" value="18">
		password:<input type="password" name="password">
		city:<input type="text" name="address.city">
		<input type="submit" value="提交">
	</form>
	
	<br><br>
	<a href="test/requestParam?username=yao&age=11">测试test/requestParam</a>
	<br><br>
	<a href="test/requestcv">测试test/requestcv!</a>
	<br><br>
	<a href="test/requestHeader">测试test/requestHeader!</a>
	<br><br>
	<a href="helloworld">测试helloworld!</a>
	<br/>
	<a href="testMethod">testMethod</a>
	<br/>
	<form action="testMethod" method="post">
		<input type="submit" value="提交">
	</form>
	<div>
		<a href="testParamsHeader?username=yao&age=11">测试testParamsHeader</a>
	</div>
	<div>
		<form action="testParamsHeader" method="GET" onsubmit="return validateForm();">
			姓名：<input type="text" value="yao">
			<br/>
			年龄：<input type="number" value=11>
			<br/>
			<input type="submit" value="提交">
		</form>
	</div>
	<a href="test/get/api">REST GET</a>
	<br>
	<a href=${pageContext.request.contextPath}/test/post/api>REST POST</a>
	<br>
	<a href=testPathVariable/1>PathVariable</a>
	<br><br>
	<!--将表单post请求转化为DELETE  -->
	<form action="test/delete/1" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="提交">
	</form>
	
</body>
</html>