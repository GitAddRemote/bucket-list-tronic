<%@ page contentType="text/html;charset=UTF-8" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="${createLink(controller:'login', action:'index')}">
    Bucket List Tronic
  </a>
  <button
    class="navbar-toggler"
    type="button"
    data-toggle="collapse"
    data-target="#navbarNav"
    aria-controls="navbarNav"
    aria-expanded="false"
    aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <g:link class="nav-link" controller="dashboard" action="index">
          Dashboard
        </g:link>
      </li>
      <!-- more left-nav links here -->
    </ul>

    <ul class="navbar-nav">
      <g:if test="${session.userId}">
        <li class="nav-item dropdown">
          <a
            class="nav-link dropdown-toggle"
            href="#"
            id="userDropdown"
            role="button"
            data-toggle="dropdown"
            aria-haspopup="true"
            aria-expanded="false">
            <img
              src="${createLinkTo(dir:'images', file:'default-avatar.png')}"
              alt="Avatar"
              class="rounded-circle"
              width="30"
              height="30"/>
          </a>
          <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
            <g:link class="dropdown-item" controller="profile" action="edit">
              Profile Settings
            </g:link>
            <div class="dropdown-divider"></div>
            <g:link class="dropdown-item" controller="login" action="logout">
              Logout
            </g:link>
          </div>
        </li>
      </g:if>
      <g:else>
        <li class="nav-item">
          <g:link class="nav-link" controller="login" action="index">
            Login
          </g:link>
        </li>
      </g:else>
    </ul>
  </div>
</nav>
