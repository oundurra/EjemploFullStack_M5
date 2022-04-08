function list(){
	$.ajax({
		type : "get",
		url : "/titletype",
		success : function(response) {
			$("#titletypeTable").bootstrapTable('load',response);
			$("#titletypeTable tbody").on('click','tr',function() {
				$("#title_no").val($(this).find("td:eq(0)").text());
				$("#title_name").val($(this).find("td:eq(1)").text());
				$("#btn_group_old").show();
				$("#btn_group_new").hide();
				$("#myModal").modal("show");
			});
		}
	});
}

function select(){
	$.ajax({
		type : "get",
		url : "/titletype/select",
		data: "titleNo=" + $("#title_no").val(),
		success : function(response) {
			$("#title_name").val(response.dept_name);
		}
	});
}

function del(){
	$.ajax({
		type : "post",
		url : "/titletype/delete",
		data: "titleNo=" + $("#title_no").val(),
		success : function(response) {
			if (response == 1) {
				alert("Se eliminó el registro");
				list();
				$("#myModal").modal("hide");

			}			
		}
	});
}

function updateJSON(){
	dataJSON = {title_no: $("#title_no").val(), title_name: $("#title_name").val()};
	
	$.ajax({
		type : "POST",
		headers: { 
        	'Accept': 'application/json',
        	'Content-Type': 'application/json' 
    	},
		url : "/titletype/updateJayson",
		dataType: "json",
		data: JSON.stringify(dataJSON),
		success : function(response) {
			if (response == 1) {
				alert("Se actualizó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}


function update(){
	$.ajax({
		type : "post",
		url : "/titletype/update",
		data: {
			titleNo:$("#title_no").val(),
			titleName:$("#title_name").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se actualizó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}

function add() {
	$("#title_no").val("");
	$("#title_name").val("");
	$("#myModal").modal("show");
	$("#btn_group_old").hide();
	$("#btn_group_new").show();
}


function insert(){
	$.ajax({
		type : "post",
		url : "/titletype/insert",
		data: {
			titleNo:$("#title_no").val(),
			titleName:$("#title_name").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se insertó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}