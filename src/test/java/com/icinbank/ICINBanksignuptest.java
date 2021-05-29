package com.icinbank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		}

	@Test
		public void Signup() {
			
			
			//WebElement loginLink1 = driver.findElement(By.xpath("//a[@href='/signup']"));
			WebElement loginLink1 = driver.findElement(By.xpath("//*[@class='form-group ']"));
			loginLink1.click();
			
			WebElement fname1 = driver.findElement(By.name("firstName"));
			fname1.sendKeys("DEVADEEP");
			
			WebElement lname1 = driver.findElement(By.name("lastName"));
			lname1.sendKeys("DEB");
			
			WebElement phn1 = driver.findElement(By.name("phone"));
			phn1.sendKeys("8860573008");
			
			WebElement eml1 = driver.findElement(By.name("email"));
			eml1.sendKeys("devadeep.deb@gmail.com");
			
			WebElement uname1 = driver.findElement(By.name("username"));
			uname1.sendKeys("devadeepdeb");
			
			WebElement uPwd1 = driver.findElement(By.name("password"));
			uPwd1.sendKeys("devadeepdeb");
			
			WebElement btnLogin2 = driver.findElement(By.xpath("//button[contains(text(),'Sign up!')]"));
			btnLogin2.click();
			
		}
		
		
		@Test
		public void LoginFunctions() {
			
			WebElement name = driver.findElement(By.name("username"));
			name.sendKeys("devadeepdeb");
			
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("devadeepdeb");
			
			WebElement btnlgn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
			btnlgn.click();
			
			WebElement h1 = driver.findElement(By.xpath("//*[contains(text(),'Go to Deposit')]"));
			//WebElement h1 = driver.findElement(By.xpath("//a[@href='/account/deposit']/div/span[@class='pull-left']"));
			h1.click();
			
			Select acctType1 = new Select(driver.findElement(By.id("accountType")));
			acctType1.selectByVisibleText("Primary");
			
			WebElement acctAmt1 = driver.findElement(By.xpath("//input[@id='amount']"));
			acctAmt1.sendKeys("100");
			
			WebElement cl1 = driver.findElement(By.xpath("//button[contains(text(),'Deposit')]"));
			cl1.click();
			
			WebElement h2 = driver.findElement(By.xpath("//a[contains(@href,'/account/primaryAccount')]/div/span[contains(text(),'View Details')]"));
			h2.click();
			
			WebElement h3 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h3.click();
			
			//driver.navigate().back();
			
			WebElement h4 = driver.findElement(By.xpath("//*[contains(text(),'Go to Withdrawal')]"));
			//WebElement h4 = driver.findElement(By.xpath("//a[@href='/account/withdraw']/div/span[@class='pull-left']"));
			h4.click();
			
			Select acctType2 = new Select(driver.findElement(By.id("accountType")));
			acctType2.selectByVisibleText("Primary");
			
			WebElement acctAmt2 = driver.findElement(By.xpath("//input[@id='amount']"));
			acctAmt2.sendKeys("20");
			
			WebElement cl2 = driver.findElement(By.xpath("//button[contains(text(),'Withdraw')]"));
			cl2.click();
			
			WebElement h5 = driver.findElement(By.xpath("//a[contains(@href,'/account/primaryAccount')]/div/span[contains(text(),'View Details')]"));
			h5.click();
			
			WebElement h6 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h6.click();
			
			
			WebElement h7 = driver.findElement(By.xpath("//*[contains(text(),'Go to Deposit')]"));
			h7.click();
			
			Select acctType3 = new Select(driver.findElement(By.xpath("//select[@name='accountType']")));
			acctType3.selectByVisibleText("Savings");
			
			WebElement acctAmt3 = driver.findElement(By.xpath("//input[@id='amount']"));
			acctAmt3.sendKeys("200");
			
			WebElement cl3 = driver.findElement(By.xpath("//button[contains(text(),'Deposit')]"));
			cl3.click();
			
			WebElement h8 = driver.findElement(By.xpath("//a[contains(@href,'/account/savingsAccount')]/div/span[contains(text(),'View Details')]"));
			h8.click();
			
			WebElement h9 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h9.click();
			
			WebElement h10 = driver.findElement(By.xpath("//*[contains(text(),'Go to Withdrawal')]"));
			h10.click();
			
			Select acctType4 = new Select(driver.findElement(By.xpath("//select[@name='accountType']")));
			acctType4.selectByVisibleText("Savings");
			
			WebElement acctAmt4 = driver.findElement(By.xpath("//input[@id='amount']"));
			acctAmt4.sendKeys("40");
			
			WebElement cl4 = driver.findElement(By.xpath("//button[contains(text(),'Withdraw')]"));
			cl4.click();
			
			WebElement h11 = driver.findElement(By.xpath("//a[contains(@href,'/account/savingsAccount')]/div/span[contains(text(),'View Details')]"));
			h11.click();
			
			WebElement h12 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h12.click();
			
			WebElement h13 = driver.findElement(By.xpath("//a[contains(text(),'Transfer')]"));
			h13.click();
			
			WebElement h14 = driver.findElement(By.xpath("//a[contains(text(),'Between Accounts')]"));
			h14.click();
			
			Select acctType5 = new Select(driver.findElement(By.xpath("//select[@name='transferFrom']")));
			acctType5.selectByVisibleText("Primary");
			
			WebElement acctAmt5 = driver.findElement(By.xpath("//input[@id='amount']"));
			acctAmt5.sendKeys("10");
			
			WebElement cl5 = driver.findElement(By.xpath("//button[contains(text(),'Transfer')]"));
			cl5.click();
			
			WebElement h15 = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
			h15.click();
			
			WebElement h16 = driver.findElement(By.xpath("//a[contains(text(),'Primary')]"));
			//JavascriptExecutor executor = (JavascriptExecutor)driver;
		    //executor.executeScript("arguments[0].click();", h16);
			h16.click();
			
			WebElement h17 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h17.click();
			
			WebElement h18 = driver.findElement(By.xpath("//a[contains(text(),'Transfer')]"));
			h18.click();
			
			WebElement h181 = driver.findElement(By.xpath("//a[contains(text(),'Between Accounts')]"));
			h181.click();
			
			Select acctType6 = new Select(driver.findElement(By.xpath("//select[@name='transferFrom']")));
			acctType6.selectByVisibleText("Savings");
			
			WebElement acctAmt6 = driver.findElement(By.xpath("//input[@id='amount']"));
			acctAmt6.sendKeys("10");
			
			WebElement cl6 = driver.findElement(By.xpath("//button[contains(text(),'Transfer')]"));
			cl6.click();
			
			WebElement h19 = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
			h19.click();
			
			WebElement h20 = driver.findElement(By.xpath("//a[contains(text(),'Savings')]"));
			h20.click();
			
			WebElement h21 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h21.click();
			
			WebElement h22 = driver.findElement(By.xpath("//a[contains(text(),'Transfer')]"));
			h22.click();
			
			WebElement h23 = driver.findElement(By.xpath("//a[contains(text(),'Add/Edit Recipient')]"));
			h23.click();
			
			WebElement name1 = driver.findElement(By.id("recipientName"));
			name1.sendKeys("Ram");
			
			WebElement em2 = driver.findElement(By.id("recipientEmail"));
			em2.sendKeys("ram@abc.com");
			
			WebElement ph2 = driver.findElement(By.id("recipientPhone"));
			ph2.sendKeys("1234567890");
			
			WebElement addr = driver.findElement(By.id("recipientAccountNumber"));
			addr.sendKeys("123456");
			
			WebElement desc = driver.findElement(By.id("recipientDescription"));
			desc.sendKeys("My Friend");
			
			WebElement cl7 = driver.findElement(By.xpath("//button[contains(text(),'Add/Edit Recipient')]"));
			cl7.click();
			
			WebElement h24 = driver.findElement(By.xpath("//a[contains(text(),'Ram')]"));
			h24.click();
			
			WebElement addr1 = driver.findElement(By.id("recipientAccountNumber"));
			addr1.sendKeys("1234567");
			
			WebElement h25 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h25.click();
			
			WebElement h26 = driver.findElement(By.xpath("//a[contains(text(),'Transfer')]"));
			h26.click();
			
			WebElement h27 = driver.findElement(By.xpath("//a[contains(text(),'To Someone Else')]"));
			h27.click();
			
			Select acctType7 = new Select(driver.findElement(By.id("recipientName")));
			acctType7.selectByVisibleText("Ram");
			
			Select acctType8 = new Select(driver.findElement(By.id("accountType")));
			acctType8.selectByVisibleText("Savings");
			
			WebElement acctAmt7 = driver.findElement(By.xpath("//input[@id='amount']"));
			acctAmt7.sendKeys("10");
			
			WebElement cl8 = driver.findElement(By.xpath("//button[contains(text(),'Transfer')]"));
			cl8.click();
			
			WebElement h28 = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
			h28.click();
			
			WebElement h29 = driver.findElement(By.xpath("//a[contains(text(),'Savings')]"));
			h29.click();
			
			WebElement h30 = driver.findElement(By.xpath("//a[contains(@href,'/ICINBank')]"));
			h30.click();
			
			WebElement h31 = driver.findElement(By.xpath("//a[contains(text(),'Request')]"));
			h31.click();
			
			WebElement h32 = driver.findElement(By.xpath("//a[contains(text(),'Request New Cheque Book')]"));
			h32.click();
			
			Select acctType9 = new Select(driver.findElement(By.id("account")));
			acctType9.selectByVisibleText("Savings");
			
			WebElement desc1 = driver.findElement(By.id("description"));
			desc1.sendKeys("Please issue cheque book on my Savings Account");
			
			WebElement h33 = driver.findElement(By.xpath("//a[contains(text(),'Submit Request')]"));
			h33.click();
			
			WebElement cl9 = driver.findElement(By.xpath("//button[@data-bb-handler='confirm']"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		    executor1.executeScript("arguments[0].click();", cl9);
			
			WebElement h34 = driver.findElement(By.xpath("//a[contains(text(),'Me ')]"));
			h34.click();
			
			WebElement h35 = driver.findElement(By.xpath("//a[contains(text(),'Profile')]"));
			h35.click();
			
			WebElement h36 = driver.findElement(By.xpath("//a[contains(text(),'Me ')]"));
			h36.click();
			
			WebElement h37 = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			h37.click();
			
		}
	
	 @AfterEach
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	 }

}
