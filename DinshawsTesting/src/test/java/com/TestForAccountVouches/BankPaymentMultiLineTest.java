package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.BankPaymentMultiLinePom;


import TestBase.TBase;
import Utilitys.XLUtils1;

public class BankPaymentMultiLineTest  extends TBase{

	
	
	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="BankPaymentMultiLineTest";
    int rowCount;
    int colCount;
    
    public BankPaymentMultiLineTest() throws IOException {
        super();
        
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-BankPaymentMultiLineTest"), prop.getProperty("SubModuleXapath-BankPaymentMultiLineTest"), prop.getProperty("FormSelection-BankPaymentMultiLineTest"));
    } 

    @Test
    public void VerifyBankPaymentMultiLineForm() throws InterruptedException, IOException {
        try {
        	
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;
                

                
                
                String Number = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String Amount = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
                String Naration = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);

                
                
    			

                BankPaymentMultiLinePom BPM = new BankPaymentMultiLinePom(driver);
                
              
                BPM.CreateButton();
                BPM.SelectSeriesDrop();
                BPM.SelectAccountDrop();
                BPM.SelectTXNCode();
                BPM.EnterChequeNumber(Number);
                BPM.SelectDebitToAccount();
                BPM.EnterAmount(Amount);
                BPM.EnterNAration(Naration);
                BPM.ClickOnAddButton();
                BPM.ClickOnSubmitButton();
               
              
               
                


                
    			
    			
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
