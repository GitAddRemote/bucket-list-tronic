
<%@ page import="com.bucketlist.location.Location" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'location.label', default: 'Location')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-location" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-location" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>

						<g:sortableColumn property="name" title="${message(code: 'location.name.label', default: 'Name')}" />

						<g:sortableColumn property="description" title="${message(code: 'location.description.label', default: 'Description')}" />

						<g:sortableColumn property="visited" title="${message(code: 'location.visited.label', default: 'Visited')}" />

						<th><g:message code="location.user.label" default="User" /></th>

					</tr>
				</thead>
				<tbody>
				<g:each in="${locationInstanceList}" status="i" var="locationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${locationInstance.id}">${fieldValue(bean: locationInstance, field: "name")}</g:link></td>

						<td>${fieldValue(bean: locationInstance, field: "description")}</td>

						<td><g:formatBoolean boolean="${locationInstance.visited}" /></td>

						<td>${fieldValue(bean: locationInstance, field: "user")}</td>

					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${locationInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
