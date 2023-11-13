$(document).ready(function () {
    $('#register-form').submit(function (e) {
        e.preventDefault(); // Ngăn chặn gửi biểu mẫu mặc định

        var fullName = $('#full-name').val();
        var address = $('#address').val();
        var phoneNumber = $('#phone-number').val();
        var email = $('#email-register').val();
        var username = $('#username-register').val();
        var password = $('#password-register').val();
        var confirmPassword = $('#confirm-password-register');
        var errorFullName = $('#error-full-name');
        var errorPhoneNumber = $('#error-phone-number');

        errorFullName.html(''); // Xóa thông báo lỗi trước đó
        errorPhoneNumber.html(''); // Xóa thông báo lỗi trước đó

        // Định nghĩa biểu thức chính quy để kiểm tra tên không chứa số
        var nameRegex = /^[A-Za-z ]+$/;

        // Định nghĩa biểu thức chính quy để kiểm tra số điện thoại chỉ chứa 10 số
        var phoneRegex = /^\d{10}$/;

        if (fullName.trim() === "" || !nameRegex.test(fullName)) {
            Swal.fire({
                title: 'Lỗi',
                text: 'Họ và tên không hợp lệ',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (address.trim() === "") {
            Swal.fire({
                title: 'Lỗi',
                text: 'Chưa nhập địa chỉ',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (phoneNumber.trim() === "" || !phoneRegex.test(phoneNumber)) {
            Swal.fire({
                title: 'Lỗi',
                text: 'Số điện thoại không hợp lệ',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (email.trim() === "") {
            Swal.fire({
                title: 'Lỗi',
                text: 'Chưa nhập địa chỉ email',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (username.trim() === "") {
            Swal.fire({
                title: 'Lỗi',
                text: 'Chưa nhập tên đăng nhập',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (password.trim() === "" || confirmPassword.trim() === "" || password !== confirmPassword) {
            Swal.fire({
                title: 'Lỗi',
                text: 'Mật khẩu và xác nhận mật khẩu không trùng khớp',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (!$('#agree-to-terms').is(':checked')) {
            Swal.fire({
                title: 'Lỗi',
                text: 'Bạn phải đồng ý với điều khoản của chúng tôi',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else {
            Swal.fire({
                title: 'Đăng kí thành công',
                text: 'Chào mừng bạn đã tạo tài khoản',
                icon: 'success',
                confirmButtonText: 'OK',
            });
        }
    });
});