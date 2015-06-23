$(function() {
    $('form').submit(function (event) {
        event.preventDefault();

        var file = $('#myFile')[0].files[0];
        var formData = new FormData();
        formData.append('file', file);

        $.ajax('api/loadFile', {
            method: 'POST',
            data: formData,
            contentType: false,
            processData: false
        }).then(function success(data) {

            /*
             data contains the parsed data file.
            */
            console.log(data);
        });
    });
});
