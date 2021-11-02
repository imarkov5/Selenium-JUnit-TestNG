package org.web.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Chrome_Amazon {
    ChromeDriver driver;

//  1.findElementByName()
//  2.findElementByXPath()
//  3.findElementById()
//  4.clear()

    @BeforeMethod
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
        driver = new ChromeDriver(); //new instance
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void testCase_01() throws InterruptedException {
        driver.findElementByName("field-keywords").sendKeys("java book");
        driver.findElementByXPath("//input[@value='Go']").click();//click on element
        driver.findElementByName("field-keywords").clear();//to clear the input box, otherwise it will append to the previous input data
        driver.findElementByName("field-keywords").sendKeys("selenium webdriver book");
        driver.findElementByXPath("//input[@value='Go']").click();//locator is a button
        driver.findElementById("a-autoid-0-announce").click();
        driver.findElementById("s-result-sort-select_4").click();
        Thread.sleep(10000);

    }
}
