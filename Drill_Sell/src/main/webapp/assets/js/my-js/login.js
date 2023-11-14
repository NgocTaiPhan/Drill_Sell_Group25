const admin = {
    email: "admin@edu.com",
    password: "123"
};
const users = {
    email: "users@gmail.com",
    password: "123"
};
$(document).ready(function () {
    $('#login-form').submit(function (e) {
        e.preventDefault(); // Ngăn chặn gửi biểu mẫu mặc định

        var emailLogin = $('#email-login').val();
        var passwordLogin = $('#password-login').val();
        var errorEmailLogin = $('#error-email-login');

        errorEmailLogin.html(''); // Xóa thông báo lỗi trước đó

        // Định nghĩa biểu thức chính quy để kiểm tra địa chỉ email
        var emailRegex = /^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/;

        if (emailLogin.trim() === "" && passwordLogin.trim() === "") {
            Swal.fire({
                title: 'Lỗi',
                text: 'Chưa nhập email và mật khẩu',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (emailLogin.trim() === "") {
            Swal.fire({
                title: 'Lỗi',
                text: 'Chưa nhập email ',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (passwordLogin.trim() === "") {
            Swal.fire({
                title: 'Lỗi',
                text: 'Chưa nhập mật khẩu',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (!emailRegex.test(emailLogin)) {
            // Kiểm tra tính hợp lệ của địa chỉ email bằng biểu thức chính quy
            Swal.fire({
                title: 'Lỗi',
                text: 'Địa chỉ email không hợp lệ',
                icon: 'error',
                confirmButtonText: 'Đóng',
            });
        } else if (emailLogin === admin.email && passwordLogin === admin.password) {
            Swal.fire({
                title: 'Bạn đang đăng nhập với quyền quản trị',
                text: 'Chào mừng',
                icon: 'success',
                confirmButtonText: 'OK',
            }).then((result) => {
                if (result.isConfirmed) {
                    window.location.href = "admin.html";
                }
            });
        } else if (emailLogin === users.email && passwordLogin === users.password) {

            Swal.fire({
                title: 'Đăng nhập thành công',
                text: 'Chào mừng',
                icon: 'success',
                confirmButtonText: 'OK',
                timeout: 1000,
            });
            window.location.href = "./home.html";
        } else {
            Swal.fire({
                title: 'Đăng nhập thất bại',
                text: 'Không tìm thấy dữ liệu đăng nhập',
                icon: 'error',
                confirmButtonText: 'OK',
            });

        }

    });
})
;





