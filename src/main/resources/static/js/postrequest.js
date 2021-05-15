$( document ).ready(function() {
	
	// SUBMIT FORM
    $("#customerForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxPost();
	});
    
    
    function ajaxPost(){
    	
    	// PREPARE FORM DATA
    	var formData = {
    		firstname : $("#firstname").val(),
    		lastname :  $("#lastname").val(),
			test3:'test3'
    	}
		var formData2 = {
			firstname : $("#firstname").val(),
			lastname :  $("#lastname").val(),
			test3:'test3'
		}
		var formData3 = {
			firstname : $("#firstname").val(),
			lastname :  $("#lastname").val(),
			test3:'test3'
		}
    	var formData4 =[formData, formData2,formData3];

    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "api/customer/save2",
			data : JSON.stringify(formData4),
			dataType : 'json',
			success : function(result) {
				if(result.status == "Done"){
					$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
												"Post Successfully! <br>" +
												"---> Customer's Info: FirstName = " + 
												result.data.firstname + " ,LastName = " + result.data.lastname + "</p>");
					var employee_data= '';
					$.each(result.data, function(key, customer){
						employee_data += '<tr>';
						employee_data += '<td>' +customer.firstname + '</td>';
						employee_data += '<td>' +customer.lastname + '</td>';
						employee_data += '</tr>';
					});

					$('#employee_table').append(employee_data);
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