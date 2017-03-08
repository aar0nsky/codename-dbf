package tst.dbf.financialplanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbf.financialplanner.Budget;
import com.dbf.financialplanner.FinancialPlannerUtils;

@RunWith(MockitoJUnitRunner.class)
public class FincialPlannerUtilsTest {
	
	@InjectMocks
	private FinancialPlannerUtils utils = new FinancialPlannerUtils();
	
	@Test
	public void testCalculateAmountSavedTakesInDouble_AndReturnsDouble() throws Exception {
		double input = 27;
		double returned = utils.calculateAmountSaved(input, 100);
		
		assertThat(input, instanceOf (Double.class));
		assertThat(returned, instanceOf (Double.class));
	}
	
	@Test
	public void testCalcluateAmountSaved_Returns5_WhenSavingPercentageIs5() throws Exception {
		double totalAmount = 100;
		double savingPercentage = 5;
		
		double saved = utils.calculateAmountSaved(totalAmount, savingPercentage);
		
		assertThat(saved, is(5.0));
	}
	
	@Test
	public void testCalculateDisposableIncome_WhenGivenOnlyTotalAmount() throws Exception {
		double totalAmount = 100;
		
		double remaining = utils.calculateDisposableIncome(totalAmount);
		
		assertThat(remaining, is(20.0));
	}
	
	@Test
	public void testCalculateDisposableIncome_WhenGivenBudgetObject() throws Exception {
		double totalAmount = 100;
		double housingExpense = 45;
		double foodExpense = 25;
		
		Budget budget = new Budget(totalAmount, housingExpense, foodExpense);
		
		double remaining = utils.calculateDisposableIncome(budget);
		
		assertThat(remaining, is(30.0));
	}
	
	
}
