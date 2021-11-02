package org.web.automation.testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Firefox {
    FirefoxDriver driver;

//  1. WebDriver (Interface) <-> RemoteWebDriver <-> Driver (ChromeDriver/FirefoxDriver) <-> Browser
//  2. navigate() and get() methods
//  3. Go Back - Go Forward - Refresh
//  4. close() vs quit()
//  5. @BeforeMethod (executes first) @AfterMethod (executes last) annotations

    @BeforeMethod
    public void startBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./webdriver/geckodriver.exe");
        driver = new FirefoxDriver();// starting browser

        driver.manage().window().maximize();//maximizes window

        driver.navigate().to("https://www.google.com/");//navigate() and get() are the same methods to navigate to a page
        driver.get("https://www.amazon.com/");

        driver.navigate().back();//go back
        Thread.sleep(4000);//wait for 4 sec

        driver.navigate().forward();//go forward to amazon
        Thread.sleep(4000);

        driver.navigate().refresh();//refresh amazon.com page
}
    @AfterMethod
    public void closeBrowser(){
        driver.close(); //closes only the active tab
//      driver.quit(); //closes the active window and all tabs
    }

    @Test
    public void testCase_01() throws InterruptedException {
        driver.findElementByXPath("//a[text()='Early Black Friday']").click();//click on the link
        Thread.sleep(7000);




    }
}
