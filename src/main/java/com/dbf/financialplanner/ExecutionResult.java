package com.dbf.financialplanner;

public class ExecutionResult {
	double monthlySavings;
	double accountBalance;
	double yearNumber;
	
	public ExecutionResult(double monthlySavings, double accountBalance, double yearNumber) {
		this.monthlySavings = monthlySavings;
		this.accountBalance = accountBalance;
		this.yearNumber = yearNumber;
	}
	
	public ExecutionResult() {
		this.monthlySavings = 0;
		this.accountBalance = 0;
		this.yearNumber = 0;
	}

	public double getMonthlySavings() {
		return monthlySavings;
	}

	public void setMonthlySavings(double monthlySavings) {
		this.monthlySavings = monthlySavings;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getYearNumber() {
		return yearNumber;
	}

	public void setYearNumber(double yearNumber) {
		this.yearNumber = yearNumber;
	}
	
}
