package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.PomForAccountsVoucher.PdcEntryPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class PdcEntryTest   extends TBase {

	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="PdcEntryTest";
    int rowCount;
    int colCount;
    
    public PdcEntryTest() throws IOException {
        super();
        
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-PdcEntryTest"), prop.getProperty("SubModuleXapath-PdcEntryTest"), prop.getProperty("FormSelection-PdcEntryTest"));
    } 

    @Test
    public void VerifyPdcEntryTestForm() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;
                

                
                String Naration = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String ChequeNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
                String ChequeDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
                String Amount = reader.getCellData(sheetPath, sheetName, rowNum, colNum+3);

                
                
    			

                PdcEntryPom PE = new PdcEntryPom(driver);
                
                PE.ClickOnCreateButton();
                PE.SelectRFAndIT();
                PE.SelectAccountName();
                PE.EnterNaration(Naration);
                PE.EnterChequeNo(ChequeNo);
                PE.EnterChequeDate(ChequeDate);
                PE.EnterAmount(Amount);
                PE.ClickOnAddButton();
                PE.ClickOnSubmitButton();
                
                
               
              
               
                


                
    			
    			
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

