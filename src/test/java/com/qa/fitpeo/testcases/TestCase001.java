package com.qa.fitpeo.testcases;

import org.testng.annotations.Test;

import com.qa.fitpeo.pages.BaseClass;
import com.qa.fitpeo.pages.RevenueCalculatorPage;

public class TestCase001 extends BaseClass {

	@Test
	public void testCaseIDOne() throws Throwable {
		try {
			RevenueCalculatorPage revenueCalculatorPage = new RevenueCalculatorPage(driver);
			revenueCalculatorPage.revenueCalculatorClickMethod();
			revenueCalculatorPage.scrollToRevenueCalculatorMethod();
			revenueCalculatorPage.sliderDragMethod(driver);
			revenueCalculatorPage.scrollToRevenueCalculatorMethod();
			revenueCalculatorPage.sliderInputValue();
			revenueCalculatorPage.cptCheckboxSelection();
			revenueCalculatorPage.totalReimbursementOfPatients();
		} catch (Exception e) {

		}
	}
}
