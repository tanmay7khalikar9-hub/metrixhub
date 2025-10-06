package com.metrixhub.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.metrixhub.pages.DriversPage;

public class DashboardTest extends BaseTest {

	public DashboardTest() throws Exception {
		super();
		
	}

	@Test
	public void dashboardtest() throws Exception { 

		DriversPage dp = new DriversPage();
		dp.hoverMenubar();
		Thread.sleep(1500);
		
		dp.addDrivers();
		Thread.sleep(1500);
		
		dp.driverName();
		Thread.sleep(1500);
		
		dp.driverDesc();
		Thread.sleep(1500);
		
		dp.driverType();
		Thread.sleep(1500);
		
		dp.saveDriver();
		Thread.sleep(1500);
		
		dp.clickAddConn();
		Thread.sleep(1500);
		
		dp.connName();
		Thread.sleep(1500);
		
		dp.hostIpAddress();
		Thread.sleep(1500);
		
		dp.netAddress();
		Thread.sleep(1500);
		
		dp.portNo();
		Thread.sleep(1500);
		
		dp.frequency();
		Thread.sleep(1500);
		
		dp.driverSubmit();
		Thread.sleep(1500);
	}
	
	

}
