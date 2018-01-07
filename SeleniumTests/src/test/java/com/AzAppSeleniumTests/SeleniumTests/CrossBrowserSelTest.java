package com.AzAppSeleniumTests.SeleniumTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class CrossBrowserSelTest
{
	@Test
	public void testApp()
    { 
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\VSTLM\\Demo Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.compendiumdev.co.uk/selenium");
		
        assertTrue( driver.getTitle().startsWith("Selenium Simplified") );
        driver.quit();
    }
}
