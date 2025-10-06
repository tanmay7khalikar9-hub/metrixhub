package com.metrixhub.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.metrixhub.generic.MasterPage;
import com.metrixhub.pages.LoginPage;

public class LoginTest {

    @BeforeClass
    public void setUp() throws Exception {
        MasterPage mp = new MasterPage(); // initializes driver
        mp.initializeDriver();
    }

    @Test
    public void loginTest() throws Exception {
        LoginPage lp = new LoginPage();

        lp.clickUsername();
        Thread.sleep(500);

        lp.enterUsername();
        Thread.sleep(1000);

        lp.clickPassword();
        Thread.sleep(500);

        lp.enterPassword();
        Thread.sleep(1000);

        lp.showPassword();
        Thread.sleep(500);

        lp.clickLoginButton();
        Thread.sleep(1000);

        Assert.assertTrue(lp.loginSuccessfull(), "If Table is displayed login is done successfully...!!!");
    }

    @AfterClass
    public void tearDown() {
        if (MasterPage.driver != null) {
            MasterPage.driver.quit();
        }
        System.out.println("Login Test Completed");
    }
}
