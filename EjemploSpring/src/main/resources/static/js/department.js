function list(){
	$.ajax({
		type : "post",
		url : "/department/list",
		success : function(response) {
			$("#message").val(response);
		}
	});
}