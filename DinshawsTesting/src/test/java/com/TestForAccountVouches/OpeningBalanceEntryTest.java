package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.OpeningBalanceEntryPom;


import TestBase.TBase;
import Utilitys.XLUtils1;

public class OpeningBalanceEntryTest  extends TBase {

	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="OpeningBalanceEntryTest";
    int rowCount;
    int colCount;
    
    public OpeningBalanceEntryTest() throws IOException {
        super();
        
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-OpeningBalanceEntryTest"), prop.getProperty("SubModuleXapath-OpeningBalanceEntryTest"), prop.getProperty("FormSelection-OpeningBalanceEntryTest"));
    } 

    @Test
    public void VerifyOpeningBalanceEntryForm() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;
                

                
                
                String amount = reader.getCellData(sheetPath, sheetName, rowNum, colNum);

                
                
    			

                OpeningBalanceEntryPom OPE = new OpeningBalanceEntryPom(driver);
                
                OPE.SelectAccount();
                OPE.SelectType();
                OPE.EnterAmount(amount);
                OPE.ClickOnSubmitButton();
               
                
                
               
              
               
                


                
    			
    			
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
