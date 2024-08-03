package com.qa.fitpeo.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.utilities.ResusableClass;

public class RevenueCalculatorPage {

	WebDriver driver;

	public RevenueCalculatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Revenue Calculator']")
	WebElement revenueCalculatorLink;

	@FindBy(xpath = "//*[text()='Patients should be between 0 to 2000']")
	WebElement scrollToRevenueCalculator;

	@FindBy(xpath = "//input[@type='range']")
	WebElement sliderOption;

	@FindBy(xpath = "//input[@type='number']")
	WebElement sliderValueField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1s3unkt']")
	List<WebElement> cptOptions;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkBoxOptions;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 inter css-hocx5c'])[4]")
	WebElement totalReimbursementPatients;

	public void revenueCalculatorClickMethod() {
		revenueCalculatorLink.click();
	}

	public void scrollToRevenueCalculatorMethod() throws InterruptedException {
		Thread.sleep(2000);
		ResusableClass.scrollingByJS();
	}

	public void sliderDragMethod(WebDriver driver) {

		ResusableClass.waitTillElementToBeClickable(sliderOption, 10);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(sliderOption, 93, 10).perform();
	}

	public void sliderInputValue() {
		for (int i = 1; i <= 3; i++) {
			sliderValueField.sendKeys(Keys.BACK_SPACE);
		}
		sliderValueField.sendKeys("560");
	}

	public void cptCheckboxSelection() {
		ResusableClass.checkboxSelection(cptOptions, "57");
		ResusableClass.checkboxSelection(cptOptions, "19.19");
		ResusableClass.checkboxSelection(cptOptions, "63");
		ResusableClass.checkboxSelection(cptOptions, "15");

	}

	public void totalReimbursementOfPatients() {
		String totalValue = totalReimbursementPatients.getText();
		Assert.assertEquals(totalValue, "$75600", "Expected and Actual is matched hence Testcase is passed");
	}

}
