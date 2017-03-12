$(document).ready(function() {
	var element = $('body');
	var word = 'FizzBuzz';
	var regex = new RegExp(word, 'g');
	var replacement = '<span style="color: red">' + word + '</span>';
	
	element.html(element.html().replace(regex, replacement));
	
	$('.goodThingButton').click(function(){
        $.ajax({
        	url: "financialplanner-executeGoodThing", 
        	data: {
                monthlySavings: $('#monthlySavings').val(),
                accountBalance: $('#accountBalance').val(),
                yearNumber: $('#yearNumber').text()
             },
        	success: function(data){
        		$('#monthlySavings').val(data.monthlySavings);
        		$('#accountBalance').val(data.accountBalance),
        		$("#yearNumber").html(data.yearNumber);
        }});
    });
	
	$('.badThingButton').click(function(){
        $.ajax({
        	url: "financialplanner-executeBadThing", 
        	data: {
        		monthlySavings: $('#monthlySavings').val(),
                accountBalance: $('#accountBalance').val(),
                yearNumber: $('#yearNumber').text()
             },
        	success: function(data){
        		$('#monthlySavings').val(data.monthlySavings);
        		$('#accountBalance').val(data.accountBalance),
        		$("#yearNumber").html(data.yearNumber);
        }});
    });
});
