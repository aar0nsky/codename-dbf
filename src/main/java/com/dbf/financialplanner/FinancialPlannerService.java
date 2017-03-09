package com.dbf.financialplanner;

public class FinancialPlannerService {
	
	private FinancialPlannerUtils utils = new FinancialPlannerUtils();

	public double calculateSavings(Budget budget, double savingsPercent) {
		double disposableIncome = utils.calculateDisposableIncome(budget);
		return utils.calculateAmountSaved(disposableIncome, savingsPercent);
	}

	public double calculateCompoundedSavings(double principal, double interestRate, int compoundingFrequency, int years, double contribution) {
		for (int yearCounter = 1; yearCounter <= years; yearCounter++) {
			principal += contribution;
			principal = utils.compound(principal, interestRate, compoundingFrequency, 1);
		}
		
		return principal;
	}
	
	
}
