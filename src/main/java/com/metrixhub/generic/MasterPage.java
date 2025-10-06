package com.metrixhub.generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

    public static WebDriver driver;
    public Properties prop;
    public Properties or;
    public Properties td;

    public MasterPage() throws Exception {
        loadProperties();
    }

    private void loadProperties() throws Exception {
        FileInputStream config = new FileInputStream(".\\src\\main\\resources\\configuration.properties");
        prop = new Properties();
        prop.load(config);

        FileInputStream objectRepo = new FileInputStream(".\\src\\main\\resources\\locator.properties");
        or = new Properties();
        or.load(objectRepo);

        FileInputStream testingData = new FileInputStream(".\\src\\main\\resources\\testdata.properties");
        td = new Properties();
        td.load(testingData);
    }

    public void initializeDriver() {
        if (driver == null) { // Ensures only one browser opens
            if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("chrome2")) {
                System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
            } else {
                System.out.println("Browser Details not available...!!!");
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("http://localhost:4200");
        }
    }
}
