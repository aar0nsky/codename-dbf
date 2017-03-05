package com.dbf.Service;

public class DBFService {

	public String testMethod() {
		return "test";
	}

	public String fizzBuzz(int[] input) {
		StringBuilder resultBuilder = new StringBuilder();
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 3 == 0 && input[i] % 5 == 0) {
				resultBuilder.append("FizzBuzz");
			} else if (input[i] % 3 == 0) {
				resultBuilder.append("Fizz");
			} else if (input[i] % 5 == 0) {
				resultBuilder.append("Buzz");
			} else {
				resultBuilder.append(Integer.toString(input[i]));
			}
		}
		
		return resultBuilder.toString();
	}

}
