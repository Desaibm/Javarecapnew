package com.Javapractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Testngcheck {
	
	@BeforeSuite
	
	public void beforesuite1() {
		System.out.println("Beforesuite");		
	}
	
	@AfterSuite
	
	public void aftersuite1() {
		System.out.println("Aftersuite");		
	}
	
	
	@BeforeMethod
	public void beforemethod1() {
		System.out.println("Beforemethod");		
	}
/*	@BeforeTest
	public void Beforetest1() {
		System.out.println("Beforetest");		
	}
	@AfterTest
	public void Aftertest1() {
		System.out.println("Aftertest");		
	}*/
	
	@AfterMethod
	public void Aftermethod1() {
		System.out.println("Aftermethod");		
	}
	@BeforeClass
	public void beforeclass1() {
		System.out.println("Beforeclass");		
	}
	@AfterClass
	public void afterclass1() {
		System.out.println("Afterclass");		
	}
	@Test
	public void test1() {
		System.out.println("test1");		
	}
	@Test
	public void test2() {
		System.out.println("test2");		
	}
	@Test(priority=1)
	public void test3() {
		System.out.println("test3");		
	}
	@Test
	public void test4() {
		System.out.println("test4");		
	}
	@Test
	public void test5() {
		System.out.println("test5");		
	}
	
	@Test
	public void testngoperations() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cricbuzz.com");
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	WebElement we = driver.findElement(By.id("videosDropDown"));
	Actions ac1= new Actions(driver);
	ac1.moveToElement(we).build().perform();
	Thread.sleep(3000);
	WebElement we2=driver.findElement(By.xpath("//a[contains(text(),'Categories')]"));
	we2.click();
	driver.navigate().to("https://myntra.com");
	WebElement we3=driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
	Actions ac2=new Actions(driver);
	ac2.moveToElement(we3).perform();
	driver.findElement(By.xpath("//a[contains(text(),'Formal Shirts')]")).click();
	driver.findElement(By.xpath("//label[contains(text(),'Louis Philippe')]")).click();
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scroll(0,600)");
	driver.navigate().to("https://www.facebook.com");
	WebElement we4=driver.findElement(By.xpath("//select[@id='day']"));
	Select l4 = new Select(we4);
	List<WebElement> list4=l4.getOptions();
	System.out.println(list4.size());
	for(WebElement list5:list4)
		System.out.println(list5.getText());
	List<WebElement> we5=driver.findElements(By.tagName("a"));
	System.out.println(we5.size());
	for(WebElement we6:we5)
		System.out.println(we6.getText());
	
	
	
	
	
		
		
		
	}

}
