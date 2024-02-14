package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.PomForAccountsVoucher.GRNPostingPom;
import TestBase.TBase;

public class GRNPostingTest  extends TBase {

	
	
	 @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-GRNPostingTest"), prop.getProperty("SubModuleXapath-GRNPostingTest"), prop.getProperty("FormSelection-GRNPostingTest"));
	    } 
	    
	    
	    

	    @Test
	    public void VerifyGRNPostingTest() throws InterruptedException, IOException {
	       
	                
	                

	                
	                
	    			

	    	GRNPostingPom GRNP = new GRNPostingPom(driver);
	    	
	    	GRNP.ClickOnForwordIcon();
	    	GRNP.ClickOnGRNDetailsTab();
	    	GRNP.ClickOnAddOnChargesTab();
	    	GRNP.ClickOnPostGRNButton();

	                
	               
	              
	               
	                


	                
	    			
	    	
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
	
}
