<!-- grails-app/views/login/index.gsp -->
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>

    <g:if test="${flash.message}">
        <div class="alert">${flash.message}</div>
    </g:if>

    <g:form controller="login" action="authenticate">
      <label for="username">Username (Email)</label>
      <g:textField name="username" />

      <label for="password">Password</label>
      <g:passwordField name="password" />

      <g:submitButton name="login" value="Login" />
    </g:form>
</body>
</html>
