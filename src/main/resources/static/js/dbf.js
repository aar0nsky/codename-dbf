$(document).ready(function() {
	var element = $('body');
	var word = 'FizzBuzz';
	var regex = new RegExp(word, 'g');
	var replacement = '<span style="color: red">' + word + '</span>';
	
	element.html(element.html().replace(regex, replacement));
	
	$('.goodThingButton').click(function(){
        $.ajax({
        	url: "financialplanner-execute", 
        	data: {
                monthlySavings: $('#monthlySavings').val(),
                accountBalance: $('#accountBalance').val(),
                yearNumber: $('#yearNumber').text()
             },
        	success: function(data){
            $("#yearNumber").html(data.yearNumber + 1);
        }});
    });
	
	$('.badThingButton').click(function(){
        $.ajax({
        	url: "financialplanner-execute", 
        	data: {
        		monthlySavings: $('#monthlySavings').val(),
                accountBalance: $('#accountBalance').val(),
                yearNumber: $('#yearNumber').text()
             },
        	success: function(data){
    		$("#yearNumber").html(data.yearNumber + 1);
        }});
    });
});
