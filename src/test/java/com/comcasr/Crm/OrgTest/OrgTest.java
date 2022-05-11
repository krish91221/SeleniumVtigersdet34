package com.comcasr.Crm.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="SmokeTesting")
	public void orgcreateTest()
	{
		System.out.println("Org is created");	
	}
	@Test(groups="RegressionTesting")
	public void createOrgWithContactTest()
	{
		System.out.println("Org is created   With contact");	
	}
	@Test(groups="RegressionTesting")
	public void editOrgTest()
	{
		System.out.println("Org is edited");	
	}
}
