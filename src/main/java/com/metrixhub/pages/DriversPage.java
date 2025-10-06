package com.metrixhub.pages;

import com.metrixhub.generic.CommonMethods;

public class DriversPage extends CommonMethods {

	public DriversPage() throws Exception {

		super();
	}

	public void hoverMenubar() {

		hoverWebElement("menu_bar");
	}

	public void addDrivers() {

		addButton("add_btn");
	}

	public void driverName() {

		enterData("driverNameField", "td_driverName");
	}

	public void driverDesc() {

		enterData("driverDescField", "td_driverDesc");
	}

	public void driverType() {

		dropDown("driverType", "td_opt2");
	}

	public void saveDriver() {

		clickWebElement("save&next_btn");
	}

	public void clickAddConn() {

		clickWebElement("addConn");
	}

	public void connName() {

		enterData("connNameFiled", "td_connName");
	}

	public void hostIpAddress() {

		enterData("host_ip", "td_hostIp");
	}

	public void netAddress() {

		enterData("netAddress", "td_netAddress");
	}

	public void portNo() {

		enterData("port_No", "td_pollingRate");
	}

}
