
<%@ page import="com.bucketlist.location.Location" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'location.label', default: 'Location')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-location" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-location" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list location">

				<g:if test="${locationInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="location.name.label" default="Name" /></span>

						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${locationInstance}" field="name"/></span>

				</li>
				</g:if>

				<g:if test="${locationInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="location.description.label" default="Description" /></span>

						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${locationInstance}" field="description"/></span>

				</li>
				</g:if>

				<g:if test="${locationInstance?.visited}">
				<li class="fieldcontain">
					<span id="visited-label" class="property-label"><g:message code="location.visited.label" default="Visited" /></span>

						<span class="property-value" aria-labelledby="visited-label"><g:formatBoolean boolean="${locationInstance?.visited}" /></span>

				</li>
				</g:if>

				<g:if test="${locationInstance?.user}">
				<li class="fieldcontain">
					<span id="user-label" class="property-label"><g:message code="location.user.label" default="User" /></span>

						<span class="property-value" aria-labelledby="user-label"><g:link controller="appUser" action="show" id="${locationInstance?.user?.id}">${locationInstance?.user?.encodeAsHTML()}</g:link></span>

				</li>
				</g:if>

			</ol>
			<g:form url="[resource:locationInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${locationInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
