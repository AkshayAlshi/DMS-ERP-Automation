package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.ChequeBouncePom;


import TestBase.TBase;


public class ChequeBounceTest  extends TBase {

	
	
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-ChequeBounceTest"), prop.getProperty("SubModuleXapath-ChequeBounceTest"), prop.getProperty("FormSelection-ChequeBounceTest"));
    } 
    
    
    

    @Test
    public void VerifyChequeBounceTest() throws InterruptedException, IOException {
       
                
                

                
                
    			

                ChequeBouncePom CB = new ChequeBouncePom(driver);

                CB.ClickOnCreateButton();
                CB.SelectSeries();
                CB.SelectReferenceNo();
                CB.ClickOnSubmitButton();
               
               
              
               
                


                
    			
    	
    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }

}
