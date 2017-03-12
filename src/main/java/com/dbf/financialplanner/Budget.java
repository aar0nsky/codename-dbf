package com.dbf.financialplanner;

public class Budget {
	double totalAmount;
	double housingExpense;
	double foodExpense;
	
	public Budget(double totalAmount, double housingExpense, double foodExpense) {
		this.totalAmount = totalAmount;
		this.housingExpense = housingExpense;
		this.foodExpense = foodExpense;
	}
	
	public Budget() {
		this.totalAmount = 0;
		this.housingExpense = 0;
		this.foodExpense = 0;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getHousingExpense() {
		return housingExpense;
	}

	public void setHousingExpense(double housingExpense) {
		this.housingExpense = housingExpense;
	}

	public double getFoodExpense() {
		return foodExpense;
	}

	public void setFoodExpense(double foodExpense) {
		this.foodExpense = foodExpense;
	}
	
}
