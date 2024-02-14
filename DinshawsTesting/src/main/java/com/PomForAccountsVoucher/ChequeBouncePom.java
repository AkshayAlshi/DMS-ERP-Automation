package com.PomForAccountsVoucher;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class ChequeBouncePom   extends TBase{
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[1]/app-g-series-tag-by-doctype/div/div/app-g-select-all-select[1]/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement SeriesDrop;
	
	
	@FindBy(xpath="//span[text()=' CB ']")
	WebElement SelectSeries;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[1]/app-g-combo-all-simplbox/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement ReferenceNoDrop;
	
	
	
	@FindBy(xpath="//span[text()=' A02-BRV-23-00025 ']")
	WebElement SelectReferenceNumber;
		
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	
	
	
	
public ChequeBouncePom(WebDriver Driver) {
	PageFactory.initElements(Driver, this);
}
	

public void ClickOnCreateButton() {
	CreateButton.click();
	
}


public void SelectSeries() throws InterruptedException {
	
	
    
//    boolean result = false;
//    int attempts = 0;
//    while(attempts < 2) {
//        try {
//        	
//        	WebElement ele = driver.findElement(By.xpath("/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[1]/app-g-series-tag-by-doctype/div/div/app-g-select-all-select[1]/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon"));
//            JavascriptExecutor executor = (JavascriptExecutor)driver;
//            executor.executeScript("arguments[0].click();", ele);
//        
//            result = true;
//            break;
//        } catch(StaleElementReferenceException e) {
//        }
//        attempts++;
//        System.out.println(result);
//    }
   
    
	SeriesDrop.click();
	
	Thread.sleep(500);
	
	SelectSeries.click();
	
}



public void SelectReferenceNo() throws InterruptedException {
	ReferenceNoDrop.click();
	
	Thread.sleep(500);
	
	SelectReferenceNumber.click();
}



public void ClickOnSubmitButton() {
	ClickOnSubmitButton.click();
}
	

}
