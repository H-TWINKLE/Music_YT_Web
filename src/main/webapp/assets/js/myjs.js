$(document).ready(function () {

    if (tip != null && tip != "") {

        $.Toast("提醒", tip, "success", {
            stack: true,
            has_icon: false,
            has_close_btn: true,
            fullscreen: false,
            timeout: 3000,
            sticky: false,
            has_progress: true,
            rtl: false
        });
        
    }

});

/*收藏*/

function collection_() {
    
}




