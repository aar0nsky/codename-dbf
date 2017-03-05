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
		
		assertThat(returned, is("1 2"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizz_WhenArrayHasThree() throws Exception {
		String returned = service.fizzBuzz(3);
		
		assertThat(returned, is("1 2 Fizz"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizzAndBuzz_WhenArrayHasThreeAndFive() throws Exception {
		String returned = service.fizzBuzz(5);
		
		assertThat(returned, is("1 2 Fizz 4 Buzz"));
	}
	
	@Test
	public void testOutputsStringWithDigitsAndFizzAndBuzzAndFizzBuzz_AsAppropriate() throws Exception {
		String returned = service.fizzBuzz(31);
		
		assertThat(returned, is("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31"));
	}
}
