<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page</h2>
<form action="SignInController" method="post">
<label>EmailId</label>
<input type="email" name="emailid" required="required"/><br/>
<label>Password</label>
<input type="password" name="password" required="required"/><br/>
<input type="submit" value="SignIn"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="signup.jsp">SignUp!</a>
</body>
</html>