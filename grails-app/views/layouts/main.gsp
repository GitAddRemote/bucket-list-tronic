<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8"/>
  <meta name="layout" content="main"/>
  <title><g:layoutTitle default="Bucket List Tronic"/></title>
  <g:layoutHead/>

  <!-- Bootstrap CSS -->
  <link
    rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
    integrity="sha384-B0vP5xmATw1+K9KRQjQERJvtuXc9IrZTK5gqW1T4n1gXrXFl0yE2816C1NQ+PpJ0"
    crossorigin="anonymous"/>

  <!-- Your custom styles (loaded *after* Bootstrap) -->
  <link rel="stylesheet"
        href="${createLinkTo(dir:'css', file:'style.css')}"/>
</head>
<body class="d-flex flex-column min-vh-100">
<g:render template="/layouts/header"/>

<main class="container flex-grow-1 mt-4">
  <g:layoutBody/>
</main>

<g:render template="/layouts/footer"/>

<!-- Bootstrap JS -->
<script
  src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
  integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
  crossorigin="anonymous"></script>
<script
  src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
  crossorigin="anonymous"></script>
</body>
</html>
