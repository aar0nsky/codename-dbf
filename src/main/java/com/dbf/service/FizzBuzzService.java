package com.dbf.service;

public class FizzBuzzService {

	public String testMethod() {
		return "test";
	}

	public String fizzBuzz(int numberOfItems) {
		StringBuilder resultBuilder = new StringBuilder();
		int[] inputArray = this.buildInputArray(numberOfItems);
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 3 == 0 && inputArray[i] % 5 == 0) {
				resultBuilder.append("FizzBuzz ");
			} else if (inputArray[i] % 3 == 0) {
				resultBuilder.append("Fizz ");
			} else if (inputArray[i] % 5 == 0) {
				resultBuilder.append("Buzz ");
			} else {
				resultBuilder.append(Integer.toString(inputArray[i])).append(" ");
			}
		}
		
		return resultBuilder.toString().trim();
	}
	
	private int[] buildInputArray(int numberOfItems) {
		int[] inputArray = new int[numberOfItems];
		
		for (int i = 0; i < numberOfItems; i++) {
			inputArray [i] = i+1;
		}
		
		return inputArray;
	}
	
}
