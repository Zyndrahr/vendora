package com.vendora.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vendora.utilities.XLUtils;

public class TC_LoginDDT_003 extends BaseClass
{
  @Test(dataProvider = "dp")
  public void LoginDDT(String Login,String pass) 
  {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Login);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	  driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	  logger.info("Invalid credentials");
  }
  
  @DataProvider
  public Object[][] dp() throws IOException
  {
   
	  XLUtils dd = new XLUtils ("D:\\Vendora\\src\\test\\java\\com\\vendora\\testdata\\Logintest.xlsx");
     int totalrow = dd.rowcount(0);
    Object[][]data = new Object[totalrow][2];
    for(int i=0;i<totalrow;i++) 
   {
	   data[i][0]=dd.getdata(0, i, 0);
	   data[i][1]=dd.getdata(0, i, 1);
   }
   return data;
    
  }
  
}
