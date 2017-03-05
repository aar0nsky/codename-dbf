package tst.dbf.Service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbf.Service.DBFService;

@RunWith(MockitoJUnitRunner.class)
public class DBFServiceTest {
	
	@InjectMocks
	private DBFService service = new DBFService();
	
	@Test
	public void testService() throws Exception {
		String returned = service.testMethod();
		
		assertThat(returned, is("test"));
	}
	
	@Test
	public void testOutputsOne_WhenArrayHasOnlyOne() throws Exception {
		int[] input = this.buildInputArray(1);
		
		String returned = service.fizzBuzz(input);
		
		assertThat(returned, is("1"));
	}
	
	@Test
	public void testOutputsStringWithOnlyDigitsInArray_WhenArrayHasOneAndTwo() throws Exception {
		int[] input = this.buildInputArray(2);
		
		String returned = service.fizzBuzz(input);
		
		assertThat(returned, is("12"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizz_WhenArrayHasThree() throws Exception {
		int[] input = this.buildInputArray(3);
		
		String returned = service.fizzBuzz(input);
		
		assertThat(returned, is("12Fizz"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizzAndBuzz_WhenArrayHasThreeAndFive() throws Exception {
		int[] input = this.buildInputArray(5);
		
		String returned = service.fizzBuzz(input);
		
		assertThat(returned, is("12Fizz4Buzz"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizzAndBuzzAndFizzBuzz_AsAppropriate() throws Exception {
		int[] input = this.buildInputArray(31);
		
		String returned = service.fizzBuzz(input);
		
		assertThat(returned, is("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz31"));
	}
	
	public int[] buildInputArray(int numberOfItems) {
		int[] inputArray = new int[numberOfItems];
		
		for (int i = 0; i < numberOfItems; i++) {
			inputArray [i] = i+1;
		}
		
		return inputArray;
	}
}
