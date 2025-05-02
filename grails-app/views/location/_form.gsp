<%@ page import="com.bucketlist.location.Location" %>



<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="location.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="100" required="" value="${locationInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="location.description.label" default="Description" />

	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="500" value="${locationInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'visited', 'error')} ">
	<label for="visited">
		<g:message code="location.visited.label" default="Visited" />

	</label>
	<g:checkBox name="visited" value="${locationInstance?.visited}" />

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="location.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${com.bucketlist.auth.AppUser.list()}" optionKey="id" required="" value="${locationInstance?.user?.id}" class="many-to-one"/>

</div>

