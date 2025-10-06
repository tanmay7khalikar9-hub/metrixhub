package com.metrixhub.generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {

		super();
	}

	public void clickWebElement(String xpathkey) {

		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void enterData(String xpathkey, String testdata) {

		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}

	public void loginDone(String xpathkey) {

		driver.findElement(By.xpath(or.getProperty(xpathkey))).isDisplayed();
	}
	
	public void hoverWebElement(String xpathkey) {
		
		WebElement sidebar = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Actions act = new Actions(driver);
		act.moveToElement(sidebar).build().perform();
	}
	
	public void addButton (String xpathkey) {
		
		List <WebElement> button = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for ( WebElement btn : button ) {
			
			if ( btn.isDisplayed() && btn.isEnabled()) {
				
				btn.click();
				break;
			}
		}
	}
	
	public void dropDown(String xpathkey , String testdata) {
		
		WebElement dropdown = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select option = new Select(dropdown);
		option.selectByValue(td.getProperty(testdata));
		
	}
	
	
}
