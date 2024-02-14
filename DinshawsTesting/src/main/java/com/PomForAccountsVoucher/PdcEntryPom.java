package com.PomForAccountsVoucher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class PdcEntryPom   extends TBase{

	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-pdc-fin-entery/div/div[2]/div[1]/app-g-select-all-select/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement RFAndITDrop;
	
	@FindBy(xpath="//span[text()=' Recieved From ']")
	WebElement SelectRFAndIT;
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-pdc-fin-entery/div/div[2]/div[2]/app-g-combo-all-simplbox/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement AccountNameDrop;
	
	@FindBy(xpath="//span[text()=' 1260 ']")
	WebElement SelectAccountName;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement EnterNaration;
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement EnterChequeNo;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[8]")
	WebElement ChequeDate;
	
	
	@FindBy(xpath="(//input[@type='number'])[3]")
	WebElement EnterAmount;
	
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement ClickOnAddButton;
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	public PdcEntryPom(WebDriver Driver ) {
		PageFactory.initElements(Driver,this);
	}
	
	
	public void ClickOnCreateButton() {
		CreateButton.click();
	}
	
	
	
	public void SelectRFAndIT() throws InterruptedException {
		RFAndITDrop.click();
		
		Thread.sleep(500);
		
		SelectRFAndIT.click();
		
	}
	
	
	public void SelectAccountName() throws InterruptedException {
		AccountNameDrop.click();
		
		Thread.sleep(500);
		
		SelectAccountName.click();
	}
	
	
	public void EnterNaration(String naration) {
		EnterNaration.sendKeys(naration);
	}
	
	
	
	public void EnterChequeNo(String chequenumber) {
		EnterChequeNo.sendKeys(chequenumber);
	}
	
	
	public void EnterChequeDate(String chequedate) throws InterruptedException {
		ChequeDate.click();
		
		Thread.sleep(500);
		
		ChequeDate.sendKeys(chequedate);
	}
	
	
	
	
	public void EnterAmount(String amount) {
		EnterAmount.sendKeys(amount);
	}
	
	
	
	
	public void ClickOnAddButton () {
		ClickOnAddButton.click();
	}
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
	
}
