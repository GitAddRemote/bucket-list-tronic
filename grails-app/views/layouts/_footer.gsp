<%@ page contentType="text/html;charset=UTF-8" %>
<footer class="bg-light text-center text-lg-start mt-auto">
  <div class="container p-4">
    <div class="row">
      <div class="col-lg-6 col-md-12 mb-4">
        <h5 class="text-uppercase">About</h5>
        <p>Bucket List Tronic helps you manage your adventures and travel plans.</p>
      </div>
      <div class="col-lg-3 col-md-6 mb-4">
        <h5 class="text-uppercase">Links</h5>
        <ul class="list-unstyled mb-0">
          <li><a href="#" class="text-dark">Help</a></li>
          <li><g:link class="text-dark" controller="contact" action="index">Contact</g:link></li>
          <li><a href="#" class="text-dark">Privacy Policy</a></li>
        </ul>
      </div>
      <div class="col-lg-3 col-md-6 mb-4">
        <h5 class="text-uppercase">Social</h5>
        <ul class="list-unstyled mb-0">
          <li><a href="#" class="text-dark">Twitter</a></li>
          <li><a href="#" class="text-dark">Facebook</a></li>
          <li><a href="#" class="text-dark">Instagram</a></li>
        </ul>
      </div>
    </div>
  </div>
  <div class="text-center p-3 bg-secondary text-white">
    © <%= new Date().format('yyyy') %> Bucket List Tronic
  </div>
</footer>
