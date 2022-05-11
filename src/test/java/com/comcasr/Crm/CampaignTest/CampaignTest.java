package com.comcasr.Crm.CampaignTest;

import org.testng.annotations.Test;

public class CampaignTest {
	@Test(groups="SmokeTesting")
	public void createCampaignTest()
	{
	    System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		System.out.println("Campaign is created");	
	}
	@Test(groups="RegressionTesting")
	public void createCampaignWithProductTest()
	{
		System.out.println("Campaign is created Campaign  With ProductTest");	
	}
	@Test(groups="RegressionTesting")
	public void editCampaignTest()
	{
		System.out.println("Campaign is edited");	
	}
}
