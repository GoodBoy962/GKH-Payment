$(document).ready(function () {
    window.setInterval(function() {
        $.ajax({
            url: '/account/watts',
            type: 'GET',
            success: function (data) {
                $("#watts").html(data);
                $("#cost-rub").html(data * 0.006);
                $("#cost-btc").html((data * 0.006 * 0.000013).toFixed(6));
            }
        });
    }, 2000);
});