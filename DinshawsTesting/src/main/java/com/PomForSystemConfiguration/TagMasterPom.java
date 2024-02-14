package com.PomForSystemConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class TagMasterPom   extends TBase {

	
	@FindBy(xpath="/html/body/app-root/div/app-wrappper-adm/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-tagmaster/div/div[1]/div/div/div/div/app-g-combo-all-simplbox/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement DocumentTypeDrop;
	
	
	@FindBy(xpath="//span[text()=' GRN Inspection ']")
	WebElement SelectDocumentType;
	
	@FindBy(xpath="/html/body/app-root/div/app-wrappper-adm/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-tagmaster/div/div[1]/div/div/div/div/app-g-select-all-select/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement TagType;
	
	
	@FindBy(xpath="//span[text()=' Tag 2 ']")
	WebElement SelectTag;
	
	
	@FindBy(xpath="//input[@type='number']")
	WebElement EnterCode;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement EnterDiscription ;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	
	
	public TagMasterPom(WebDriver Driver) {
		
		PageFactory.initElements(Driver,this);
	}
	
	
	
	
	public void   SelectDocumentType() throws InterruptedException {
		DocumentTypeDrop.click();
		
		Thread.sleep(500);
		
		SelectDocumentType.click();
	}
	
	
	
	public void SelectTagType() throws InterruptedException {
		
		TagType.click();
		
		Thread.sleep(500);
		
		SelectTag.click();
	}
	
	
	
	
	public void EnterCode(String code) {
		EnterCode.sendKeys(code);
	}
	
	
	
	public void EnterDiscription(String Discription) {
		EnterDiscription.sendKeys(Discription);
	}
	
	
	
	
	public void ClickOnSubmitButton() {
		
		ClickOnSubmitButton.click();
	}
	
	
	
}
