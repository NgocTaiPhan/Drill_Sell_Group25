$(document).ready(function () {
    $(window).scroll(function () {
        // khoảng cách giữa màng hình và đầu lề bằng 0
        if ($(this).scrollTop()) {
            // ẩn nút
            $('#backtop').fadeIn();
        } else {
            $('#backtop').fadeOut();
        }
    });
    $('#backtop').click(function () {
        $('html, body').animate({ scrollTop: 0 }, 500);
    });
});