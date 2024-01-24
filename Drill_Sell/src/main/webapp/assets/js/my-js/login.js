window.onload = function () {
    var urlParams = new URLSearchParams(window.location.search);
    var errorParam = urlParams.get("error");

    if (errorParam === "null-value") {

        Swal.fire({
            icon: "error",
            title: "Lỗi",
            text: "Hãy điền tên đăng nhập và mật khẩu",
            confirmButtonText: "Đóng",
        });
    }
    if (errorParam === "not-found-user") {

        Swal.fire({
            icon: "error",
            title: "Lỗi",
            text: "Không tìm thấy tên đăng nhập",
        });
    }
}