$(document).ready(function () {
    window.setInterval(function() {
        $.ajax({
            url: '/account/watts',
            type: 'GET',
            success: function (data) {
                if(parseInt($("#watts").html()) < data) {
                    $("#transactions").append(
                        "<div style='padding:5px;margin:5px;border: 3px solid black;'>" +
                            "Transaction id : " + "0x" + makeid() +
                        "</div>" +
                        "<br />");
                }

                $("#watts").html(data);
                $("#cost-rub").html(data * 0.006);
                $("#cost-btc").html((data * 0.006 * 0.000013).toFixed(6));
            }
        });
    }, 2000);
});

function makeid() {
    var text = "";
    var possible = "abcdefghijklmnopqrstuvwxyz0123456789";

    for(var i=0; i < 60; i++)
        text += possible.charAt(Math.floor(Math.random() * possible.length));

    return text;
}