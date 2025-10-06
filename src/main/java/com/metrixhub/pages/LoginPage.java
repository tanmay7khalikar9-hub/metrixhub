package com.metrixhub.pages;

import com.metrixhub.generic.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws Exception {

		super();
	}

	public void clickUsername() {

		clickWebElement("username");
	}

	public void enterUsername() {

		enterData("username", "td_username");
	}

	public void clickPassword() {

		clickWebElement("username");
	}

	public void enterPassword() {

		enterData("password", "td_password");
	}

	public void showPassword() {

		clickWebElement("showpassword_Button");
	}

	public void clickLoginButton() {

		clickWebElement("login_Button");
	}

	public boolean loginSuccessfull() {

		loginDone("table");
		return true;
	}

}
