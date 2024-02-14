package com.PomForAccountsVoucher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class GRNPostingPom   extends TBase {

	
	


	@FindBy(xpath="/html/body/app-root/div/app-wrapper-fin/app-templete-wrapper/div[1]/div/div/app-component-wrapper/div/app-grn-inv-posting/div/div[2]/app-g-tgrid-all-treegrid/div/igx-grid/div[1]/div[1]/igx-display-container/igx-grid-row[1]/igx-grid-cell/div/button/igx-icon")
	WebElement ClickOnForwordIcon;
	
	
	@FindBy(xpath="//app-g-label[text()='GRN Details']")
	WebElement GRNDetailsTab;
	
	
	@FindBy(xpath="//app-g-label[text()='Addon Charges']")
	WebElement ClickOnAddOnChargesTab;
	
	
	@FindBy(xpath="//button[text()=' Post GRN ']")
	WebElement ClickOnPostGRNButton;
	
	
	
	
	
	public GRNPostingPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	public void ClickOnForwordIcon() {
		ClickOnForwordIcon.click();
	}
	
	
	
	public void ClickOnGRNDetailsTab() {
		GRNDetailsTab.click();
	}
	
	
	
	public void ClickOnAddOnChargesTab() {
		ClickOnAddOnChargesTab.click();
	}
	
	public void ClickOnPostGRNButton() {
		ClickOnPostGRNButton.click();
	}
	
}


