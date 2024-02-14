package com.TestForAccountVouches;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.AccountPayableMultilinePom;


import TestBase.TBase;
import Utilitys.XLUtils1;

public class AccountPayableMultilineTest   extends TBase{

	
	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="AccountPayableMultilineTest";
    int rowCount;
    int colCount;
    
    public AccountPayableMultilineTest() throws IOException {
        super();
    
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-AccountPayableMultilineTest"), prop.getProperty("SubModuleXapath-AccountPayableMultilineTest"), prop.getProperty("FormSelection-AccountPayableMultilineTest"));
      } 
  
    @Test
    public void VerifyAccountPayableMultiline() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                
                String ReferenceNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String Amount = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
                String Naration = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);

                
                
    			

                AccountPayableMultilinePom APM = new AccountPayableMultilinePom(driver);


                APM.clickOnCreateButton();
                APM.SelectCreditToAccount();
                APM.SelectTXNCode();
                APM.EnterReferenceNo(ReferenceNo);
                APM.SelectDebitToAccount();
                APM.EnterAmount(Amount);
                APM.EnterNaration(Naration);
                APM.ClickOnAddButton();
                APM.ClickOnSubmitButton();
                
               

               
              
               
                


                
    			
    			
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }
	
	
	
	
	
}
   
   
   
   
   
   
   




