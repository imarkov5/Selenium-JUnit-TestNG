package org.web.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CreateAccount {
    ChromeDriver driver;

    @BeforeMethod
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
        driver = new ChromeDriver();// browser starts
        driver.manage().window().maximize();//maximizes window
        driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&ltmpl=default&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit(); //closes the active window and all tabs
    }

    @Test
    public void testCase_01() throws InterruptedException {
        driver.findElementByName("firstName").sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElementByName("lastName").sendKeys("Webdriver");
        Thread.sleep(3000);
        driver.findElementByName("Username").sendKeys("11");
        Thread.sleep(3000);
        driver.findElementByName("Passwd").sendKeys("selenium");
        Thread.sleep(3000);
        driver.findElementByName("ConfirmPasswd").sendKeys("webdriver");
        Thread.sleep(3000);
        driver.findElementByXPath("//input[@type='checkbox']").click();//click on element
        Thread.sleep(3000);
        driver.findElementById("accountDetailsNext").click();
        Thread.sleep(5000);
    }
}
