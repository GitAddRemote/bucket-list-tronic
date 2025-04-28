<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8"/>
  <!-- Tell Grails to use this layout -->
  <meta name="layout" content="main"/>
  <title><g:layoutTitle default="Bucket List Tronic"/></title>

  <!-- Head inserts (e.g. JS/CSS from views) -->
  <g:layoutHead/>

  <!-- Your global styles -->
  <link rel="stylesheet" href="${resource(dir:'css', file:'style.css')}"/>
  <!-- Bootstrap (optional) -->
  <link
    rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
    integrity="sha384-B0vP5xmATw1+K9KRQjQERJvtuXc9IrZTK5gqW1T4n1gXrXFl0yE2816C1NQ+PpJ0"
    crossorigin="anonymous"/>
</head>
<body class="d-flex flex-column min-vh-100">

  <!-- Render the header partial -->
  <g:render template="/layouts/header"/>

  <!-- Main content -->
  <main class="container flex-grow-1 mt-4">
    <g:layoutBody/>
  </main>

  <!-- Render the footer partial -->
  <g:render template="/layouts/footer"/>

</body>
</html>
