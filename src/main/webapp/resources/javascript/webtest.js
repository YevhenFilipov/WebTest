function deletePupils() {
    var items = $("input[type=checkbox]:checked");
    if (items.length == 0) {
        alert("Please, select pupils");
        return;
    }
    var ids = "";
    for (var i = 0; i < items.length; i++) {
        ids += $(items[i]).attr("id");
        if (i < items.length - 1) {
            ids += "|";
        }
    }

    var form = '<form id="deleteStudentForm" action="' +
    context + '/pupillist.html" method="post"><input type="hidden" name="ids" /></form>';
    $("body").append(form);
    $('#deleteStudentForm input').val(ids);
    $('#deleteStudentForm').submit();
}

function addModifyPupil() {
    var items = $("input[type=checkbox]:checked");
    if (items.length > 1) {
        alert("Please select just one row to be edited");
        return;
    }
    if (items.length == 0) {
        document.location.href = context + "/addpupil.html";
    } else {
        var id = $(items[0]).attr("id");

        var form = '<form id="editStudentForm" action="' +
        context + '/editpupil.html" method="get"><input type="hidden" name="id" /></form>';
        $("body").append(form);
        $('#editStudentForm input').val(id);
        $('#editStudentForm').submit();
    }

}

