function submitRegister() {
    var formRegister = document.getElementById("register-form");

    function showError(title, text) {
        Swal.fire({
            title: title,
            text: text,
            icon: 'error',
            confirmButtonText: 'OK',
        });
    }

    // Validation logic
    var fullName = document.getElementById('full-name-register').value.trim();
    var birthDate = document.getElementById('birth-date-register').value;
    var phoneNumber = document.getElementById('phone-number-register').value;
    var email = document.getElementById('email-register').value;
    var username = document.getElementById('username-register').value;
    var password = document.getElementById('password-register').value;
    var confirmPassword = document.getElementById('confirm-password-register').value;
    var agreeToTerms = document.getElementById('agree-to-terms').checked;

    // Validate full name
    if (fullName === "") {
        showError('Đăng kí thất bại', 'Tên người dùng không được bỏ trống');
        return;
    } else if (!/^[^\d]+$/.test(fullName)) {
        showError('Đăng kí thất bại', 'Tên người dùng không được chứa số');
        return;
    }

    // Validate birth date
    var birthDateObj = new Date(birthDate);
    var currentDate = new Date();
    if (isNaN(birthDateObj.getTime()) || !birthDate || birthDateObj > currentDate) {
        showError('Đăng kí thất bại', 'Ngày sinh không hợp lệ');
        return;
    }

    // Validate phone number
    if (phoneNumber === "" || !/^0\d{9}$/.test(phoneNumber)) {
        showError('Đăng kí thất bại', 'Số điện thoại không hợp lệ');
        return;
    }

    // Validate email
    if (!/^\S+@\S+\.\S+$/.test(email)) {
        showError('Đăng kí thất bại', 'Địa chỉ email không hợp lệ');
        return;
    }

    // Validate username
    if (!/^(?!\d)\S+$/.test(username)) {
        showError('Đăng kí thất bại', 'Tên đăng nhập không hợp lệ');
        return;
    }

    // Validate password
    if (password !== confirmPassword) {
        showError('Đăng kí thất bại', 'Mật khẩu không khớp');
        return;
    }

    // Validate agreement to terms
    if (!agreeToTerms) {
        showError('Đăng kí thất bại', 'Bạn cần phải đồng ý với điều khoản của chúng tôi');
        return;
    }

    // If all validations pass, show success message and submit the form
    Swal.fire({
        title: 'Đăng kí thành công',
        text: 'Chào mừng',
        icon: 'success',
        confirmButtonText: 'OK',
    }).then((result) => {
        if (result.isConfirmed) {
            formRegister.action = 'register';
            formRegister.method = 'POST';
            formRegister.submit();
        }
    });
}
