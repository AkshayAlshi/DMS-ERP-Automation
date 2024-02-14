package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.CreditNotePom;


import TestBase.TBase;
import Utilitys.XLUtils1;

public class CreditNoteTest   extends TBase{

	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
    String sheetName ="DebitNoteTest";
    int rowCount;
    int colCount;
    
    public CreditNoteTest() throws IOException {
        super();
        
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-CreditNoteTest"), prop.getProperty("SubModuleXapath-CreditNoteTest"), prop.getProperty("FormSelection-CreditNoteTest"));
    } 

    @Test
    public void VerifyBankPaymentTestForm() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                
                String VoucherAmount = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String Naration = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
                String ReferenceNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);

                
                
    			

                CreditNotePom DN = new CreditNotePom(driver);

                DN.SelectSeries();
                DN.SelectAccount();
                DN.EnterVoucherAmount(VoucherAmount);
                DN.EnterNaration(Naration);
                DN.SelectTnxCode();
                DN.EnterReferenceNo(ReferenceNo);
                DN.SelectDebitToAccountDrop();
                DN.ClickOnSubmitButton();
               
              
               
                


                
    			
    			
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
