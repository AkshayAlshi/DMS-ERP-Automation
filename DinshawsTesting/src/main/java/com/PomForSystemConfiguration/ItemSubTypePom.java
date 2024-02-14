package com.PomForSystemConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class ItemSubTypePom   extends TBase{

	
	
	
	
	
	@FindBy(xpath = "/html/body/app-root/div/app-wrappper-adm/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-itemsubtype-create/div/div[1]/div/div/div/div/app-g-select-all-select/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement ItemType;

	@FindBy(xpath = "//span[text()=' RAW MATERIAL ']")
	WebElement SelectItemType;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement EnterCode;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement EnterDiscription;

	

	@FindBy(xpath = "//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	public ItemSubTypePom(WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	
	
	
	
	
	
	public void SelectItemType() throws InterruptedException {
		ItemType.click();
		
		Thread.sleep(500);
		
		SelectItemType.click();
	}
	
	
	
	public void EnterCode(String entercode) {
		EnterCode.sendKeys(entercode);
	}
	
	
	
	public void EnterDiscription(String Discription) {
		EnterDiscription.sendKeys(Discription);
	}
	
	
	
	public void SubmitButton() {
		SubmitButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
