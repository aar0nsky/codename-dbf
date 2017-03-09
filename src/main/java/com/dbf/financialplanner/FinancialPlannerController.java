package com.dbf.financialplanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FinancialPlannerController {
	
	FinancialPlannerService financialPlannerService = new FinancialPlannerService();
	
	@RequestMapping("/financialplanner-landing")
    public String landing() {
        return "financialplanner/financialplanner-landing";
    }
	
	@RequestMapping("/financialplanner-results")
    public String financialPlanner(@RequestParam double income, @RequestParam double housing, @RequestParam double food, @RequestParam double savings, Model model) {
		Budget budget = new Budget(income, housing, food);
		double amountSaved = financialPlannerService.calculateSavings(budget, savings);
		model.addAttribute("amountSaved", amountSaved);
		double amountSavedAfter10Years = financialPlannerService.calculateCompoundedSavings(amountSaved*12, 9, 1, 10, amountSaved*12);
		model.addAttribute("amountSavedAfter10Years", amountSavedAfter10Years);
		
		Budget budget2 = new Budget(0.5*income, housing, food);
		double halfAmountSaved = financialPlannerService.calculateSavings(budget2, savings);
		model.addAttribute("halfAmountSaved", halfAmountSaved);
		double halfAmountSavedAfter10Years = financialPlannerService.calculateCompoundedSavings(0.5*amountSaved*12, 9, 1, 10, 0.5*amountSaved*12);
		model.addAttribute("halfAmountSavedAfter10Years", halfAmountSavedAfter10Years);
		
		Budget budget3 = new Budget(2*income, housing, food);
		double doubleAmountSaved = financialPlannerService.calculateSavings(budget3, savings);
		model.addAttribute("doubleAmountSaved", doubleAmountSaved);
		double doubleAmountSavedAfter10Years = financialPlannerService.calculateCompoundedSavings(2*amountSaved*12, 9, 1, 10, 2*amountSaved*12);
		model.addAttribute("doubleAmountSavedAfter10Years", doubleAmountSavedAfter10Years);
		
        return "financialplanner/financialplanner-results";
    }

}
