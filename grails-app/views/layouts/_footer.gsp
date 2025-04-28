<%@ page contentType="text/html;charset=UTF-8" %>
<footer class="bg-light mt-auto">
  <div class="footer-container">
    <div class="footer-column">
      <h5>About</h5>
      <p>Bucket List Tronic helps you manage your adventures and travel plans.</p>
    </div>
    <div class="footer-column">
      <h5>Links</h5>
      <ul>
        <li><a href="#" class="text-dark">Help</a></li>
        <li>
          <g:link class="text-dark" controller="contact" action="index">
            Contact
          </g:link>
        </li>
        <li><a href="#" class="text-dark">Privacy Policy</a></li>
      </ul>
    </div>
    <div class="footer-column">
      <h5>Social</h5>
      <ul>
        <li><a href="#" class="text-dark">Twitter</a></li>
        <li><a href="#" class="text-dark">Facebook</a></li>
        <li><a href="#" class="text-dark">Instagram</a></li>
      </ul>
    </div>
  </div>
  <div class="text-center p-3 bg-secondary text-white">
    © <%= new Date().format('yyyy') %> Bucket List Tronic
  </div>
</footer>
