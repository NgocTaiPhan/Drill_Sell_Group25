$(document).ready(function () {
    $('form.register-form').submit(function (event) {
        event.preventDefault();

        var fullName = $('#full-name-register').val();
        var birthDate = $('#birth-date-register').val();
        var address = $('#address-register').val();
        var phoneNumber = $('#phone-number-register').val();
        var email = $('#email-register').val();
        var username = $('#username-register').val();
        var password = $('#password-register').val();
        var confirmPassword = $('#confirm-password-register').val();
        var agreeToTerms = $('#agree-to-terms').is(':checked');

        if (fullName === "") {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Tên người dùng không được bỏ trống   ',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
            // Kiểm tra họ và tên không chứa số

        } else if (!/^[^\d]+$/.test(fullName)) {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Tên người dùng không được chứa số   ',
                icon: 'error',
                confirmButtonText: 'OK',
            });

            return;
        }


        // Kiểm tra ngày tháng năm sinh
        var birthDateObj = new Date(birthDate);
        var currentDate = new Date();

        if (isNaN(birthDateObj.getTime())) {
            // Ngày không hợp lệ
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Ngày sinh không hợp lệ',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        } else if (!birthDate) {
            // Ngày rỗng
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Ngày sinh không được bỏ trống',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;

        } else if (birthDateObj > currentDate) {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Ngày sinh không được lớn hơn ngày hiện tại',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        }


        // Kiểm tra số điện thoại
        if (phoneNumber === "") {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Số điện thoại không được bỏ trống',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        } else if (typeof phoneNumber !== 'number' && !/^0\d{9}$/.test(phoneNumber)) {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Số điện thoại không hợp lệ',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;

        } else if (!/^0\d{9}$/.test(phoneNumber)) {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Số điện thoại phải đủ 10 số',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        }

        // Kiểm tra email
        if (!/^\S+@\S+\.\S+$/.test(email)) {

            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Địa chỉ email không hợp lệ.',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        }

        // Kiểm tra tên đăng nhập không chứa khoảng trắng

        if (!/^(?!\d)\S+$/.test(username)) {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Tên đăng nhập không được chứa khoảng trắng hay số ở đầu',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        }

        // Kiểm tra mật khẩu và nhập lại mật khẩu

        if (password !== confirmPassword) {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Mật khẩu không khớp',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        }

        // Kiểm tra đồng ý điều khoản
        if (!agreeToTerms) {
            Swal.fire({
                title: 'Đăng kí thất bại',
                text: 'Bạn cần phải đồng ý với điều khoản của chúng tôi',
                icon: 'error',
                confirmButtonText: 'OK',
            });
            return;
        }

        // Nếu tất cả đều hợp lệ, có thể thực hiện đăng ký hoặc xử lý theo ý của bạn ở đây
        Swal.fire({
            title: 'Đăng kí thành công',
            text: 'Chào mừng',
            icon: 'success',
            confirmButtonText: 'OK',
        }).then((result) => {
            if (result.isConfirmed) {
                window.location.href = "home.html";
            }
        });
    });

})
;

