package com.dbf.financialplanner;

import java.text.DecimalFormat;

public class FinancialPlannerUtils {

	private static final double HOUSING_EXPENSE_PERCENTAGE = 50;
	private static final double FOOD_EXPENSE_PERCENTAGE = 30;
	private static final double PERCENTAGE_DIVISOR = 100;

	public double calculateAmountSaved(double amount, double savingPercentage) {
		return amount * (savingPercentage/PERCENTAGE_DIVISOR);
	}

	public double calculateDisposableIncome(double totalAmount) {
		return totalAmount - (totalAmount * (HOUSING_EXPENSE_PERCENTAGE/PERCENTAGE_DIVISOR) + totalAmount * (FOOD_EXPENSE_PERCENTAGE/PERCENTAGE_DIVISOR));
	}

	public double calculateDisposableIncome(Budget budget) {
		return budget.getTotalAmount() - (budget.getTotalAmount() * (budget.getHousingExpense()/PERCENTAGE_DIVISOR) + budget.getTotalAmount() * (budget.getFoodExpense()/PERCENTAGE_DIVISOR));
	}

	//heinous type switching of return used to round result.  Want to return double from util, string from service.
	public double compound(double principal, double interestRate, int compoundingFrequency, int years) {
		DecimalFormat formatter = new DecimalFormat("##.00");
		return Double.parseDouble(formatter.format(principal * Math.pow(1 + interestRate/PERCENTAGE_DIVISOR/compoundingFrequency, compoundingFrequency*years)));
	}

}
