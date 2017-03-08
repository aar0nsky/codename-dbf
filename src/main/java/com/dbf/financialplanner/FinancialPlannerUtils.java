package com.dbf.financialplanner;

public class FinancialPlannerUtils {

	private static final int HOUSING_EXPENSE_PERCENTAGE = 50;
	private static final int FOOD_EXPENSE_PERCENTAGE = 30;
	private static final int PERCENTAGE_DIVISOR = 100;

	public double calculateAmountSaved(double totalAmount, double savingPercentage) {
		return totalAmount * (savingPercentage/PERCENTAGE_DIVISOR);
	}

	public double calculateDisposableIncome(double totalAmount) {
		double housingExpense = HOUSING_EXPENSE_PERCENTAGE;
		double foodExpense = FOOD_EXPENSE_PERCENTAGE;
		
		return totalAmount - (totalAmount * (housingExpense/PERCENTAGE_DIVISOR) + totalAmount * (foodExpense/PERCENTAGE_DIVISOR));
	}

	public double calculateDisposableIncome(Budget budget) {
		return budget.getTotalAmount() - (budget.getTotalAmount() * (budget.getHousingExpense()/PERCENTAGE_DIVISOR) + budget.getTotalAmount() * (budget.getFoodExpense()/PERCENTAGE_DIVISOR));
	}

}
