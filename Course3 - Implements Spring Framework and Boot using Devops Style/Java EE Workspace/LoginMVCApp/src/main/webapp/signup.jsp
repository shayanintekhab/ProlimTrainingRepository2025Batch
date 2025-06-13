<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>SignUp Page</h2>
<form action="SignUpcontroller" method="post">
<label>EmailId</label>
<input type="email" name="emailid" required="required"/><br/>
<label>Password</label>
<input type="password" name="password" required="required"/><br/>
<input type="submit" value="SignUp"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="login.jsp">Login Page!</a>
</body>
</html>