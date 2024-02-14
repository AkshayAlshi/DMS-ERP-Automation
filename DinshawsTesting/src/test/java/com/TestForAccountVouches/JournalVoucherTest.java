package com.TestForAccountVouches;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.JournalVoucherPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class JournalVoucherTest   extends TBase{

	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="JournalVoucherTest";
    int rowCount;
    int colCount;
    
    public JournalVoucherTest() throws IOException {
        super();
    
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-JournalVoucherTest"), prop.getProperty("SubModuleXapath-JournalVoucherTest"), prop.getProperty("FormSelection-JournalVoucherTest"));
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
              
                
                
                
                JournalVoucherPom JV = new JournalVoucherPom(driver);

                
                JV.ClickONCreateButton();
                JV.SelectSeries();
                JV.SelectCreditToAndDebitto();
                JV.SelectAccountDrop();
                JV.SelectTXNCode();
                JV.SelectDebitToAccount();
                JV.EnterAmount(VoucherAmount);
                JV.EnterNaration(Naration);
                JV.ClickOnAddButton();
                JV.ClickOnSubmitButton();
                
              
               
              
               
                


                
    			
    			
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
