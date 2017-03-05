package tst.dbf.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbf.service.FizzBuzzService;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzServiceTest {
	
	@InjectMocks
	private FizzBuzzService service = new FizzBuzzService();
	
	@Test
	public void testService() throws Exception {
		String returned = service.testMethod();
		
		assertThat(returned, is("test"));
	}
	
	@Test
	public void testOutputsOne_WhenArrayHasOnlyOne() throws Exception {
		String returned = service.fizzBuzz(1);
		
		assertThat(returned, is("1"));
	}
	
	@Test
	public void testOutputsStringWithOnlyDigitsInArray_WhenArrayHasOneAndTwo() throws Exception {
		String returned = service.fizzBuzz(2);
		
		assertThat(returned, is("12"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizz_WhenArrayHasThree() throws Exception {
		String returned = service.fizzBuzz(3);
		
		assertThat(returned, is("12Fizz"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizzAndBuzz_WhenArrayHasThreeAndFive() throws Exception {
		String returned = service.fizzBuzz(5);
		
		assertThat(returned, is("12Fizz4Buzz"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizzAndBuzzAndFizzBuzz_AsAppropriate() throws Exception {
		String returned = service.fizzBuzz(31);
		
		assertThat(returned, is("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz31"));
	}
}
