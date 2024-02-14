package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.PomForAccountsVoucher.AccountReceivableMultiListPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class AccountReceivableMultiListTest   extends TBase{

	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="AccountReceivableMultiListTest";
    int rowCount;
    int colCount;
    
    public AccountReceivableMultiListTest() throws IOException {
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
    public void VerifyAccountReceivableMultiListTest() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                
                String ReferenceNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String Amount = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
                String Naration = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);

                
                
    			

                AccountReceivableMultiListPom APMl = new AccountReceivableMultiListPom(driver);


                APMl.clickOnCreateButton();
                APMl.SelectCreditToAccount();
                APMl.SelectTXNCode();
                APMl.EnterReferenceNo(ReferenceNo);
                APMl.SelectDebitToAccount();
                APMl.EnterAmount(Amount);
                APMl.EnterNaration(Naration);
                APMl.ClickOnAddButton();
                APMl.ClickOnSubmitButton();
                
               

               
              
               
                


                
    			
    			
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
