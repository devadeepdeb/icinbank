package com.icinbank;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class ICINsignuptest {
	
	@Autowired
	WebDriver driver;

	@Before
	public void Setup() {
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		
		
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:7070/index/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		}

	@Test
		public void Login() {
			WebElement loginLink = driver.findElement(By.partialLinkText("Sign up "));
			loginLink.click();
			
			WebElement fname = driver.findElement(By.name("firstName"));
			fname.sendKeys("GOLAP KANTA");
			assertNotNull(fname);
			
			WebElement lname = driver.findElement(By.name("lastName"));
			lname.sendKeys("DEB");
			assertNotNull(lname);
			
			WebElement phn = driver.findElement(By.name("phone"));
			phn.sendKeys("9953336381");
			assertNotNull(phn);
			
			WebElement eml = driver.findElement(By.name("email"));
			eml.sendKeys("gk_deb1@yahoo.com");
			assertNotNull(eml);
			
			WebElement uname = driver.findElement(By.name("username"));
			uname.sendKeys("gkdeb");
			assertNotNull(uname);
			
			WebElement uPwd = driver.findElement(By.name("password"));
			uPwd.sendKeys("gkdeb");
			assertNotNull(uPwd);
			
			WebElement btnLogin = driver.findElement(By.partialLinkText("Sign up "));
			btnLogin.click();
			
		}
	
	 @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	 }

}
