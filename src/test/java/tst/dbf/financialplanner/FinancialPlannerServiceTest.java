package tst.dbf.financialplanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.hamcrest.CoreMatchers.instanceOf;
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
}
