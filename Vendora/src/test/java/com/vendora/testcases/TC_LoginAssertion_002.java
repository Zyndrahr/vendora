package com.vendora.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginAssertion_002 extends BaseClass
{
  @Test
  public void AssertionTest() 
  {
	  String ExpectedTitle ="Dashboard | Vendor Portal";
      Assert.assertEquals(ExpectedTitle, driver.getTitle());
      System.out.println("Assertion test is passed ");
      logger.info("assertion passed");
  }
}
