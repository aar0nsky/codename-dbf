package com.dbf.financialplanner;

public class ExecutionResult {
	private double monthlySavings;
	private double accountBalance;
	private double yearNumber;
	private int maxYear;
	
	public ExecutionResult(double monthlySavings, double accountBalance, double yearNumber, int maxYear) {
		this.monthlySavings = monthlySavings;
		this.accountBalance = accountBalance;
		this.yearNumber = yearNumber;
		this.setMaxYear(maxYear);
	}
	
	public ExecutionResult() {
		this.setMonthlySavings(0);
		this.setAccountBalance(0);
		this.setYearNumber(0);
		this.setMaxYear(0);
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

	public int getMaxYear() {
		return maxYear;
	}

	public void setMaxYear(int maxYear) {
		this.maxYear = maxYear;
	}
	
}
