package com.qa.utilities;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.fitpeo.pages.BaseClass;

public class ResusableClass extends BaseClass {

	// method for JavaScriptScroll
	public static void scrollingByJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}

	// Method for handling checkboxes
	public static void checkboxSelection(List<WebElement> element, String value) {
		for (WebElement ele : element) {
			if (ele.getText().equals(value)) {
				ele.click();
			}
		}
	}

	// WebDriver wait
	public static void waitTillElementToBeClickable(WebElement ele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}
