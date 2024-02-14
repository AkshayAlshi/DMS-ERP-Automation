package com.PomForAccountsVoucher;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TBase;

public class JournalVoucherPom     extends TBase{

	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-vour-fin-create/div/div[1]/app-g-series-tag-by-doctype/div/div/app-g-select-all-select[1]/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement 	SeriesDrop;
	
	
	@FindBy(xpath="//span[text()=' JV ']")
	WebElement SelectSeries;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[10]")
	WebElement CreditToAndDebittoDrop;
	
	
	
	@FindBy(xpath="//igx-select-item//span[text()=' Debit To ']")
	WebElement SelectCRandDR;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[11]")
	WebElement AccountDrop;
	
	
	
	@FindBy(xpath="//span[text()=' 1276 ']")
	WebElement SelectAccount;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[16]")
	WebElement TXNCodeDrop;
	
	
	
	@FindBy(xpath="//span[text()=' OTHER ']")
	WebElement SelectTXNCode;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[24]")
	WebElement DebitToAccountDrop;
	
	
	
	@FindBy(xpath="//span[text()=' 1275 ']")
	WebElement SelectDebitToAccount;
	
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement EnterAmount;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterNaration;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[26]")
	WebElement TaxDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' GST 5% ']")
	WebElement SelectTaxRank;
	
	
	
	@FindBy(xpath="//button[@id='l_vouh_save_button']")
	WebElement AddButton;
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public JournalVoucherPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	public void ClickONCreateButton() {
		WebElement Ele=driver.findElement(By.xpath("((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",Ele);;
	}
	
	public void SelectSeries() throws InterruptedException {
		SeriesDrop.click();
		
		Thread.sleep(500);
		
		SelectSeries.click();
	}
	
	
	
	public void SelectCreditToAndDebitto() throws InterruptedException {
		CreditToAndDebittoDrop.click();
		
		
		
		
		Thread.sleep(1000);
		
		SelectCRandDR.click();
		Thread.sleep(500);
		SelectCRandDR.click();
	}
	
	
	public void SelectAccountDrop() throws InterruptedException {
		AccountDrop.click();
		
		
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//igx-suffix[@class='igx-combo__toggle-button'])[3]//igx-icon[@class='material-icons igx-icon']")));
//		element1.click();

		
		Thread.sleep(500);
		
		SelectAccount.click();
	}
	
	
	public void SelectTXNCode() throws InterruptedException {
		TXNCodeDrop.click();
		
		Thread.sleep(500);
		
		SelectTXNCode.click();
		
	}
	
	
	
	
	public void SelectDebitToAccount() throws InterruptedException {
		DebitToAccountDrop.click();
		
		Thread.sleep(500);
		
		SelectDebitToAccount.click();
		
	}
	
	
	
	public void EnterAmount(String enteramount) {
		EnterAmount.sendKeys(enteramount);
	}
	
	
	public void EnterNaration(String enternaration) {
		EnterNaration.sendKeys(enternaration);
	}
	
	
	
	public void ClickOnAddButton() {
		
		AddButton.click();
	}
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
	
	
	
	
	
	
}
