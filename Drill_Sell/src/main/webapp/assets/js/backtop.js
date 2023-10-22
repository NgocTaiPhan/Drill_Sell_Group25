$(document).ready(function(){
    $(window).scroll(function(){
        if($(window).scrollTop()){
            $('#backtop').fadein();
        }else{
            $('#backtop').fadeout();
        }
    });
    $('#backtop').click(function(){
        $('html, body').animate({
            scrollTop: 0
        }, 500);
    });  
});