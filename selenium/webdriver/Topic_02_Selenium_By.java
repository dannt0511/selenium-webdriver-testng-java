package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Selenium_By {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/signup");
	}

//	HTML: 
//	Sub email textbox <input type="email" class="form-control sub_email" id="exampleInputEmail1" placeholder="Enter your email">
//	Firstname textbox <input class="form-control" type="text" placeholder="First Name" name="first_name" value="" required="">
	@Test
	public void TC_01_() {
//		ID - exampleInputEmail1
		driver.findElement(By.id("exampleInputEmail1"));
		
//		Class - sub_email
		driver.findElement(By.className("sub_email"));
		
//		Name - first_name textbox
		driver.findElement(By.name("first_name"));
		
//		Tagname - Tìm các thẻ a
		driver.findElements(By.tagName("a"));
		
//		Linktext - Link hotels
		driver.findElement(By.linkText("Hotels"));
		
//		Partial linktext
		driver.findElement(By.partialLinkText("Ho"));
		driver.findElement(By.partialLinkText("tels"));
		driver.findElement(By.partialLinkText("ote"));
		driver.findElement(By.partialLinkText("Hotels"));
		
//		Xpath
		driver.findElement(By.xpath("//input[@id ='exampleInputEmail1']"));
		driver.findElement(By.xpath("//input[@name = 'first_name']"));
		
//		Css
		driver.findElement(By.cssSelector("input[id ='exampleInputEmail1']"));
		driver.findElement(By.cssSelector("input[name = 'first_name']"));
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
