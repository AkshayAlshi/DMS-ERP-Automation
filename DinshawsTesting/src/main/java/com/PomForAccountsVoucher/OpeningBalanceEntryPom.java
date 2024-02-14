package com.PomForAccountsVoucher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class OpeningBalanceEntryPom   extends TBase{

	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-opening-balancecreate/div/div[1]/div/div/app-g-select-all-select[1]/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement AccountDrop;
	
	@FindBy(xpath="//span[text()=' BOTH-Marcel ']")
	WebElement SelectAccount;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-opening-balancecreate/div/div[1]/div/div/app-g-select-all-select[2]/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement TypeDrop;
	
	
	@FindBy(xpath="//span[text()=' Credit ']")
	WebElement SelectType;
	
	
	
	@FindBy(xpath="//input[@type='number']")
	WebElement EnterAmount;
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	public OpeningBalanceEntryPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	public void SelectAccount() throws InterruptedException {
		AccountDrop.click();
		
		Thread.sleep(500);
		
		SelectAccount.click();
		
	}
	
	
	
	public void SelectType() throws InterruptedException {
		TypeDrop.click();
		
		Thread.sleep(500);
		
		SelectType.click();
		
	}
	
	
	
	public void EnterAmount(String amount) throws InterruptedException {
		
		EnterAmount.sendKeys(amount);
		
	}
	
	
	
	public void ClickOnSubmitButton() {
		SubmitButton.click();
	}
}
