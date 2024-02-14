package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.AccountPayablePom;


import TestBase.TBase;
import Utilitys.XLUtils1;

public class AccountPayableTest    extends TBase{

	
	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="AccountPayableTest";
    int rowCount;
    int colCount;
    
    public AccountPayableTest() throws IOException {
        super();
    
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-AccountPayableTest"), prop.getProperty("SubModuleXapath-AccountPayableTest"), prop.getProperty("FormSelection-AccountPayableTest"));
      } 
  
    @Test
    public void VerifyAccountReceivable() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                
                String VoucherAmount = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String Naration = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
                String ReferenceNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);

                
                
    			

                AccountPayablePom AP = new AccountPayablePom(driver);

                AP.SelectSeries();
                AP.SelectAccount();
                AP.EnterVoucherAmount(VoucherAmount);
                AP.EnterNaration(Naration);
                AP.SelectTnxCode();
                AP.EnterReferenceNo(ReferenceNo);
                AP.SelectDebitToAccountDrop();
                AP.ClickOnSubmitButton();
               
              
               
                


                
    			
    			
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
