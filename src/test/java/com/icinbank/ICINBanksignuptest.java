package com.icinbank;



import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class ICINBanksignuptest {
	
	@Autowired
	WebDriver driver;

    @BeforeEach
	public void Setup() {
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		
		
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:7070/index");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		}

	@Test
		public void Login() {
			WebElement loginLink = driver.findElement(By.xpath("//*[@class='form-group ']"));
			loginLink.click();
			
			WebElement fname = driver.findElement(By.name("firstName"));
			fname.sendKeys("GOLAP KANTA");
			
			WebElement lname = driver.findElement(By.name("lastName"));
			lname.sendKeys("DEB");
			
			WebElement phn = driver.findElement(By.name("phone"));
			phn.sendKeys("9953336381");
			
			WebElement eml = driver.findElement(By.name("email"));
			eml.sendKeys("gk_deb1@yahoo.com");
			
			WebElement uname = driver.findElement(By.name("username"));
			uname.sendKeys("gkdeb");
			
			WebElement uPwd = driver.findElement(By.name("password"));
			uPwd.sendKeys("gkdeb");
			
			WebElement btnLogin = driver.findElement(By.xpath("//button[contains(text(),'Sign up!')]"));
			btnLogin.click();
			
		}
	
	 @AfterEach
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	 }

}
