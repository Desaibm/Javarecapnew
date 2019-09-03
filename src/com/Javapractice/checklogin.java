package com.Javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class checklogin {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://wallethub.com/join/light");
		WebElement we3=driver.findElement(By.xpath("//main[@class='ng-animate-enabled no-nav']//li[2]"));
		Actions ac2= new Actions(driver);
		ac2.click(we3).build().perform();
		
	}

}
