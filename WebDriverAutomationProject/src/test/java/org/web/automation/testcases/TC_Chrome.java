package org.web.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Chrome {
    ChromeDriver driver;

    @BeforeMethod
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imarkov\\Documents\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();// browser starts
        driver.get("https://www.amazon.com/");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void testCase_01(){
        driver.findElementByName("field-keywords").sendKeys("musashi book");//write data
        driver.findElementByXPath("//input[@value='Go']").click();//click on element

    }
}
