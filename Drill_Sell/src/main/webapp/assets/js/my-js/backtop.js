
let btnBacktop = document.getElementById("back-to-top");

window.onscroll = function () {
    scrollFunction();
};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        btnBacktop.style.display = "block";
    } else {
        btnBacktop.style.display = "none";
    }
}

function topFunction() {
    scrollToTop(700);
}

function scrollToTop(duration) {
    const scrollStep = -window.scrollY / (duration / 15);
    const scrollInterval = setInterval(function () {
        if (window.scrollY !== 0) {
            window.scrollBy(0, scrollStep);
        } else {
            clearInterval(scrollInterval);
        }
    }, 15);
}
