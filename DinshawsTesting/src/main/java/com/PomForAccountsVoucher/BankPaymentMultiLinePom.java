package com.PomForAccountsVoucher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class BankPaymentMultiLinePom  extends TBase{

	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[1]/app-g-series-tag-by-doctype/div/div/app-g-select-all-select[1]/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement SeriesDrop;
	
	
	@FindBy(xpath="//span[text()=' BP ']")
	WebElement SelectSeries;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[2]/div[2]/app-g-combo-all-simplbox[1]/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement AccountDrop;
	
	
	@FindBy(xpath="//span[text()=' 1231 ']")
	WebElement SelectAccount;
	
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[2]/div[3]/div[1]/app-g-combo-all-simplbox/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement TXNCodeDrop;
	
	
	
	@FindBy(xpath="//span[text()=' OTHER ']")
	WebElement SelectTxnCode;
	
	
	
	@FindBy(xpath="//span[text()=' Cheque ']")
	WebElement SelectPaymentMode;
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement EnterChequeNumber;
	
	
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[3]/div/div[2]/div/div[1]/div[1]/app-g-combo-all-simplbox/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement DebitToAccount;
	
	
	
	@FindBy(xpath="//span[text()=' 67643 ']")
	WebElement SelectDebitToAccount;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[5]")
	WebElement EnterAmount;
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement EnterNAration ;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[3]/div/div[2]/div/div[2]/div[2]/app-g-button-all-simplebtn[2]/button")
	WebElement ClickOnAddButton;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement 	ClickOnSubmitButton;
	
	
	
	
	public BankPaymentMultiLinePom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	public void CreateButton() {
		CreateButton.click();
	}
	
	
	
	public void SelectSeriesDrop() throws InterruptedException {
		
		SeriesDrop.click();
		
		Thread.sleep(500);
		
		SelectSeries.click();
	}
	
	
	
	
	public void SelectAccountDrop() throws InterruptedException {
		AccountDrop.click();
		
		Thread.sleep(500);
		
		SelectAccount.click();
		
	}
	
	
	
	
	
	
	
	public void SelectTXNCode() throws InterruptedException {
		TXNCodeDrop.click();
		
		Thread.sleep(500);
		
		SelectTxnCode.click();
	}
	
	
	
	
	public void EnterChequeNumber(String chequenumber) throws InterruptedException {
		EnterChequeNumber.sendKeys(chequenumber);
	
	}
	
	
	
	public void SelectDebitToAccount() throws InterruptedException {
		DebitToAccount.click();
		
		Thread.sleep(500);
		
		SelectDebitToAccount.click();
	}
	
	
	
	public void EnterAmount(String amount) {
		EnterAmount.sendKeys(amount);
	}
	
	
	public  void  EnterNAration(String naration) {
		EnterNAration.sendKeys(naration);
	}
	
	
	
	public void ClickOnAddButton() {
		ClickOnAddButton.click();
	}
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
	
}
