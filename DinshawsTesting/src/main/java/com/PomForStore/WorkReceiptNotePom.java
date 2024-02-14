package com.PomForStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestBase.Base;

public class WorkReceiptNotePom   extends Base {

	
	

	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[10]")
	WebElement PONumberDrop;
	
	
	@FindBy(xpath="//span[text()=' A02-POQ-23-00099 ']")
	WebElement SelectPONumber;
	
	
	@FindBy(xpath="//button[text()=' Next ']")
	WebElement NextButton;
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	WebElement EnterTransporter;
	
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	WebElement EnterChallanNo;
	
	
	@FindBy(xpath="(//input[@role ='combobox'])[8]")
	WebElement EnterChallanDate;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[22]")
	WebElement TransporterDrop;
	
	
	@FindBy(xpath="//span[text()=' Road ']")
	WebElement SelectTransporter;
	
	
	@FindBy(xpath="(//input[@type='text'])[15]")
	WebElement EnterLRRRAWRNumber;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[10]")
	WebElement EnterLRRRAWRDate;
	
	
	@FindBy(xpath="(//input[@type='text'])[16]")
	WebElement EnterInvoiceNo;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[11]")
	WebElement 	EnterInvoiceDate;
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement EnterInvoiceValue;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[27]")
	WebElement TreadNameDrop ;
	
	@FindBy(xpath="//span[text()=' Celfrost Pvt ltd - Transport ']")
	WebElement  SelectTradName;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[28]")
	WebElement CurrencyDrop;
	
	
	@FindBy(xpath="//span[text()=' INR ']")
	WebElement SelectCurrency;
	
	@FindBy(xpath="//app-g-label[text()='WRN Details']")
	WebElement ClickOnWRNDetailsTabA;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[45]")
	WebElement UpdateIcon;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[29]")
	WebElement BatchLotDrop;
	
	@FindBy(xpath="(//input[@type='text'])[28]")
	WebElement EnterBatchLot;
	
	
	@FindBy(xpath="//button[text()=' Add Batch ']")
	WebElement ClickOnAddBatchButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[29]")
	WebElement ReversDrop;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[15]")
	WebElement EnterExpiryDate;
	
	
	@FindBy(xpath="(//input[@type='number'])[3]")
	WebElement EnterInvoiceQuantity;
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement ServiceQuantity;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[6]")
	WebElement  AcceptedQuantity ;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[23]")
	WebElement EnterRemark;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[38]")
	WebElement HSNCodeDrop;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[1]")
	WebElement SelectHSNCode;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[38]")
	WebElement  ReversHSNDrop;
	
	
	@FindBy(xpath="//app-g-label[text()='Addon Charges']")
	WebElement ClickOnAddOnChargesTab;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[51]")
	WebElement AddOnChargesTypeDrop;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[50]")
	WebElement PartyDrop;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[1]")
	WebElement ClickOnPartyCheck;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[51]")
	WebElement  ClickOnPartyRevers;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[17]")
	WebElement ChargeAmount;
	
	
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement ClickOnAddButton;
	
	
	
	
}
