package com.PomForAccountsVoucher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

 public class  CreditNotePom    extends TBase{


	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[2]")
	WebElement SeriesDrop;
	
	
	@FindBy(xpath="//span[text()=' DN ']")
	WebElement SelectSeries;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[7]")
	WebElement AccountDrop;
	
	
	
	@FindBy(xpath="//span[text()=' 1276 ']")
	WebElement SelectAccount;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement EnterVoucherAmount;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterNaration;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[11]")
	WebElement TnxCodeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' OTHER ']")
	WebElement SelectTnxCode;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement EnterReferenceNo;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[15]")
	WebElement DebitToAccountDrop;
	
	
	@FindBy(xpath="//span[text()=' 01010101 ']")
	WebElement SelectDebitToAcc;
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	
	public CreditNotePom(WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	public void SelectSeries() throws InterruptedException {
		SeriesDrop.click();
		
		Thread.sleep(500);
		
		SelectSeries.click();
		
	}
	
	
	
	public void SelectAccount() throws InterruptedException {
		AccountDrop.click();
		
		Thread.sleep(500);
		
		SelectAccount.click();
	}
	
	
	
	public void EnterVoucherAmount(String voucherAmount) {
		EnterVoucherAmount.sendKeys(voucherAmount);
	}
	
	
	public void EnterNaration(String naration) {
		
		EnterNaration.sendKeys(naration);
	}
	
	
	
	public void SelectTnxCode() throws InterruptedException {
		
		TnxCodeDrop.click();
		
		Thread.sleep(500);
		
		SelectTnxCode.click();
	}
	
	
	
	public void EnterReferenceNo (String referencenumber) {
		EnterReferenceNo.sendKeys(referencenumber);
	}
	
	
	
	public void SelectDebitToAccountDrop() throws InterruptedException {
		DebitToAccountDrop.click();
		
		Thread.sleep(500);
		
		SelectDebitToAcc.click();
	}
	
	
	public void ClickOnSubmitButton() {
		SubmitButton.click();
	}
}
