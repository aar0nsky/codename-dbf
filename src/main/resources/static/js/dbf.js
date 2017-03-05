$(document).ready(function() {
	var element = $('body');
	var word = 'FizzBuzz';
	var regex = new RegExp(word, 'g');
	var replacement = '<span style="color: red">' + word + '</span>';
	
	element.html(element.html().replace(regex, replacement));
});
