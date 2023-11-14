
$(document).ready(function() {
    $('.user-support').click(function(event) {
      event.preventDefault(); // Ngăn chặn hành động mặc định của thẻ 'a' (nếu có)
      $('.social-button-content').slideToggle();
    });
  });
  