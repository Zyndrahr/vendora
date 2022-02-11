package com.vendora.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TC_Login_001 extends BaseClass
{
	
  @Test
  public void Login() 
  {
	 
	  logger.info("URL is opened");
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Juliet");
		logger.info("Entered username");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("angleritech");
	  logger.info("Entered password");
	  driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	  logger.info("Login test passed");
  }
}
