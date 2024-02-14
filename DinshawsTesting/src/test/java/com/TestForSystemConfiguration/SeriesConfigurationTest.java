package com.TestForSystemConfiguration;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.PomForSystemConfiguration.SeriesConfigurationPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class SeriesConfigurationTest    extends TBase{

	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For System Module.xlsx";
    String sheetName ="SeriesConfigurationTest";
    int rowCount;
    int colCount;
    
    public SeriesConfigurationTest() throws IOException {
        super();
    
    }
    

    
    
    @BeforeTest
    public void setup() throws Exception {
    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\System.Properties");
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-SeriesConfigurationTest"), prop.getProperty("SubModuleXapath-SeriesConfigurationTest"), prop.getProperty("FormSelection-SeriesConfigurationTest"));
      } 
  
    @Test
    public void VerifySeriesConfigurationTest() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                
                String Series = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String Name = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
               

                
                
    			

                SeriesConfigurationPom 	SC = new SeriesConfigurationPom(driver);


                
                
               SC.SelectEntity();
               SC.SelectDocumentType();
               SC.SelectGenrationTypeDrop();
               SC.EnterSeries(Series);
               SC.EnterName(Name);
//               SC.ClicKOnSubmitButton();
             
               
                
               

               
              
               
                


                
    			
    			
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
