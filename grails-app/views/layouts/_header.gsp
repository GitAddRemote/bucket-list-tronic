<%@ page contentType="text/html;charset=UTF-8" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="${createLink(controller:'login', action:'index')}">
    Bucket List Tronic
  </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <g:link class="nav-link" controller="dashboard" action="index">Dashboard</g:link>
      </li>
      <!-- add more nav items here -->
    </ul>

    <ul class="navbar-nav">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="userDropdown"
           role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <img src="${resource(dir:'images', file:'default-avatar.png')}"
               alt="Avatar" class="rounded-circle" width="30" height="30"/>
        </a>
        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
          <g:link class="dropdown-item" controller="profile" action="edit">
            Profile Settings
          </g:link>
          <a class="dropdown-item" href="#">Account</a>
          <div class="dropdown-divider"></div>
          <g:link class="dropdown-item" controller="login" action="logout">
            Logout
          </g:link>
        </div>
      </li>
    </ul>
  </div>
</nav>
