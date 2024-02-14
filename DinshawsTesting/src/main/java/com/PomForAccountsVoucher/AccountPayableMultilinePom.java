package com.PomForAccountsVoucher;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class AccountPayableMultilinePom  extends TBase{

	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[2]/div[2]/app-g-combo-all-simplbox[1]/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement CreditToAccountDrop;
	
	
	@FindBy(xpath="//span[text()=' 1278 ']")
	WebElement SelectCreditToAccount;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[2]/div[3]/div[1]/app-g-combo-all-simplbox/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement TXNCodeDrop;
	
	
	@FindBy(xpath="//span[text()=' OTHER ']")
	WebElement SelectTxnCode;
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement EnterReferenceNo;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[3]/div[1]/div[2]/div/div[1]/div[1]/app-g-combo-all-simplbox/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement DebitToAccountDrop;
	
	
	
	@FindBy(xpath="//span[text()=' 67643 ']")
	WebElement SelectDebitAccount;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement EnterAmount;
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterNaration;
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[3]/div[1]/div[2]/div/div[2]/div[2]/app-g-button-all-simplebtn[2]/button")
	WebElement ClickOnAddButton;
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	
	
   public  AccountPayableMultilinePom(WebDriver Driver) {
	PageFactory.initElements(Driver,this );
   }
   
   
   
   public void clickOnCreateButton () {
	   
	   WebElement ele = driver.findElement(By.xpath("((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]"));
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", ele);
       
//	   CreateButton.click();
   }
   
   
   public void SelectCreditToAccount() throws InterruptedException {
	   CreditToAccountDrop.click();
	   
	  

	   
	   Thread.sleep(500);
	   
	   SelectCreditToAccount.click();
	   
   }
   
   
   public void SelectTXNCode() throws InterruptedException {
	   TXNCodeDrop.click();
	   
	   Thread.sleep(500);
	   
	   SelectTxnCode.click();
	   
   }
   
   
   
   public void EnterReferenceNo (String ReferenceNo) {
	   EnterReferenceNo.sendKeys(ReferenceNo);
	
   }
   
   
   public void SelectDebitToAccount() throws InterruptedException {
	   DebitToAccountDrop.click();
	   
	   Thread.sleep(500);
	   
	   SelectDebitAccount.click();
   }
   
   public void EnterAmount(String amount) {
	   EnterAmount.sendKeys(amount);
   }
   
   
   
   public void EnterNaration(String naration) {
	   EnterNaration.sendKeys(naration);
   }
   
   
   
   public void ClickOnAddButton() {
	   ClickOnAddButton.click();
   }
   
   
   
   public void ClickOnSubmitButton() {
	   ClickOnSubmitButton.click();
   }
   
   
	
}
