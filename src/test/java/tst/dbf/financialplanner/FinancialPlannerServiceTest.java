package tst.dbf.financialplanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbf.financialplanner.Budget;
import com.dbf.financialplanner.FinancialPlannerService;

@RunWith(MockitoJUnitRunner.class)
public class FinancialPlannerServiceTest {
	
	@InjectMocks
	private FinancialPlannerService service = new FinancialPlannerService();
	
	@Test
	public void testServiceCalculatesAmountSaved_GivenABudget() throws Exception {
		Budget budget = new Budget(100, 30, 20);
		
		double saved = service.calculateSavings(budget, 5);
		
		assertThat(saved, is(2.5));
	}
	
	@Test
	public void testServiceCalculatesFutureValue_AfterOneYear() throws Exception {
		double principal = 1000;
		double interestRate = 5;
		int compoundingFrequency = 1;
		int years = 1;
		double contribution = 0;
		
		double compounded = service.calculateCompoundedSavings(principal, interestRate, compoundingFrequency, years, contribution);
		
		assertThat(compounded, is(1050.0));
	}
	
	@Test
	public void testServiceCalculatesFutureValue_After10Years_WithYearlyDeposits() throws Exception {
		double principal = 1000;
		double interestRate = 5;
		int compoundingFrequency = 1;
		int years = 10;
		double contribution = 1000;
		
		double compounded = service.calculateCompoundedSavings(principal, interestRate, compoundingFrequency, years, contribution);
		
		assertThat(compounded, is(14835.69));
	}
}
