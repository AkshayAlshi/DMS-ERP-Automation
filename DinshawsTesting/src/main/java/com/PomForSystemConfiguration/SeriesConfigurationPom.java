package com.PomForSystemConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class SeriesConfigurationPom   extends TBase  {

	
	@FindBy(xpath="/html/body/app-root/div/app-wrappper-adm/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-series/div/div[1]/div/div/div/div[1]/app-g-combo-all-simplbox[1]/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix[1]/igx-icon")
	WebElement EntityDropCrossButton;
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrappper-adm/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-series/div/div[1]/div/div/div/div[1]/app-g-combo-all-simplbox[1]/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement EntityDropButton;
	
	
	@FindBy(xpath="(//span[text()=' Dinshaws Dairy Food Pvt Ltd '])[2]")
	WebElement SelectEntity;
	
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrappper-adm/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-series/div/div[1]/div/div/div/div[1]/app-g-combo-all-simplbox[2]/div/igx-simple-combo/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement DocumentTypeDrop;
	
	
	@FindBy(xpath="//span[text()=' Process Transaction Approval ']")
	WebElement SelectDocumentType;
	
	
	
	@FindBy(xpath="/html/body/app-root/div/app-wrappper-adm/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-series/div/div[1]/div/div/div/div[1]/app-g-select-all-select[1]/div/igx-select/igx-input-group/div[1]/div[5]/igx-suffix/igx-icon")
	WebElement GenrationTypeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' Yearly ']")
	WebElement SelectGenrationType;
	
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement EnterSeries;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement EnterName;
	
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClicKOnSubmitButton;
	
	
	
	
	
	public SeriesConfigurationPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	
	
	
	
	public void SelectEntity() throws InterruptedException {


		EntityDropCrossButton.click();
		
		Thread.sleep(500);
		
		EntityDropButton.click();
		
		Thread.sleep(500);
		
		SelectEntity.click();
	}
	
	
	
	public void SelectDocumentType() throws InterruptedException {
		DocumentTypeDrop.click();
		
		
		Thread.sleep(500);
		
		SelectDocumentType.click();
		
	}
	
	
	public void SelectGenrationTypeDrop() throws InterruptedException {
		GenrationTypeDrop.click();
		
		Thread.sleep(500);
		
		SelectGenrationType.click();
	}
	
	
	public void EnterSeries(String series) {
		EnterSeries.sendKeys(series);
	}
	
	
	
	public void EnterName(String name) {
		EnterName.sendKeys(name);
	}
	
	
	
	public void  ClicKOnSubmitButton() {
		ClicKOnSubmitButton.click();
	}
	
	
	
	
	
	
	
}
