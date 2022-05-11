package com.comcasr.Crm.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups="SmokeTesting")
	public void createContactTest()
	{
		System.out.println("Contact is created");	
	}
	@Test(groups="RegressionTesting")
	public void createContactWithOrgTest()
	{
		System.out.println("Contact is created   With Organization");	
	}
	@Test(groups="RegressionTesting")
	public void editContactTest()
	{
		System.out.println("Contact is edited");	
	}
}
