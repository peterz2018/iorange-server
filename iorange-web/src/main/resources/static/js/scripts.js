(function() {

    // page conent frame size
    reloadPageIframeSize();
    window.onresize=function(){
        reloadPageIframeSize();
    }
    
    function reloadPageIframeSize() {
        var headerWidth = $(".left-section").width();
        var leftWidth = $(".header-section").width();
        /*$("#pageIframe").width($(window).width()-headerWidth-leftWidth);*/
        
        
        var windowH = $(window).height();
        $("#pageIframe").height(windowH-5);
        $("#header-section").height(windowH);
        $("#left-section").height(windowH);
        $("#leftMenu").height(windowH);
    }
   
})(jQuery);