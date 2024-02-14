package com.TestForSystemConfiguration;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.PomForSystemConfiguration.TagMasterPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class TagMasterTest    extends TBase{


	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For System Module.xlsx";
    String sheetName ="TagMasterTest";
    int rowCount;
    int colCount;
    
    public TagMasterTest() throws IOException {
        super();
   }
    
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\System.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-TagMasterTest"), prop.getProperty("SubModuleXapath-TagMasterTest"), prop.getProperty("FormSelection-TagMasterTest"));
      } 
  
    
    @Test
    public void VerifySeriesConfigurationTest() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                
                String CODE = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String Discription = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
               

                
                
    			

                TagMasterPom TM = new TagMasterPom(driver);


              
                TM.SelectTagType();
                TM.EnterCode(CODE);
                TM.EnterDiscription(Discription);
                TM.ClickOnSubmitButton();
              
                
                
              
             
               
                
               

               
              
               
                


                
    			
    			
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
