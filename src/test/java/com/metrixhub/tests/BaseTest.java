package com.metrixhub.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.metrixhub.generic.MasterPage;
import com.metrixhub.pages.LoginPage;

public class BaseTest extends MasterPage {

    public BaseTest() throws Exception {
        super();
    }

    @BeforeClass
    public void setUp() throws Exception {
        initializeDriver(); 
        login();            
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void login() throws Exception {
        LoginPage lp = new LoginPage();
        lp.clickUsername();
        lp.enterUsername();
        lp.clickPassword();
        lp.enterPassword();
        lp.clickLoginButton();
    }
    
    //61dd72f29fdd49c59eb3dd469142f15f [Jenikns Password]
}
