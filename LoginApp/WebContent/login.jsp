<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html >
<head>
<title>Login Application </title>
</head>
 
<body>
<h2>Login Application</h2>
<s:actionerror />
<s:form action="login" method="post">
<table border="1">
<tr><td>
    <s:textfield name="username" key="label.username" size="20" /></td></tr>
    <tr><td><s:password name="password" key="label.password" size="20" /></td></tr>
    <tr><td ><s:submit method="execute" key="label.login" align="center" /></td></tr></table>
</s:form>
</body>
</html>