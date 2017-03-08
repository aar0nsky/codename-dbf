package com.dbf.financialplanner;

public class FinancialPlannerService {
	
	private FinancialPlannerUtils utils = new FinancialPlannerUtils();

	public double calculateSavings(Budget budget, double savingsPercent) {
		double disposableIncome = utils.calculateDisposableIncome(budget);
		return utils.calculateAmountSaved(disposableIncome, 5);
	}
	
	
}
