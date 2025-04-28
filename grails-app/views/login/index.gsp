<%@ page contentType="text/html;charset=UTF-8" %>
<meta name="layout" content="main"/>

<h1>Login</h1>

<g:if test="${flash.message}">
  <div class="alert alert-warning">${flash.message}</div>
</g:if>

<g:form controller="login" action="authenticate">
  <div class="form-group">
    <label for="username">Username (Email)</label>
    <g:textField name="username" class="form-control"/>
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <g:passwordField name="password" class="form-control"/>
  </div>
  <g:submitButton name="login" value="Login"
                  class="btn btn-primary"/>
</g:form>
