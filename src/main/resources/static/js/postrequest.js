$( document ).ready(function() {
	
	// SUBMIT FORM
    $("#customerForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxUrlPost();
	});
    
    
    function ajaxPost(){
    	// PREPARE FORM DATA
    	var formData = {
    		firstname : $("#firstname").val(),
    		lastname :  $("#lastname").val()
    	}
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "api/customer/save",
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				if(result.status == "Done"){
					$("#postResultDiv").html("<strong>success</strong>");
				}else{
					$("#postResultDiv").html("<strong>Error</strong>");
				}
				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	// Reset FormData after Posting
    	resetData();
    }

	function ajaxUrlPost(){
		// PREPARE FORM DATA
		var formData = {
			firstname : $("#firstname").val(),
			lastname :  $("#lastname").val()
		}
		// DO POST
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "api/customer/yourUrl?data="+$("#firstname").val(),
			//data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				if(result.status == "Done"){
					$("#postResultDiv").html("<strong>success</strong>");
				}else{
					$("#postResultDiv").html("<strong>Error</strong>");
				}
				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
		// Reset FormData after Posting
		resetData();
	}

    function resetData(){
    	$("#firstname").val("");
    	$("#lastname").val("");
    }
})