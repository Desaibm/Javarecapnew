package com.Javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_table {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bseindia.com/");
		Thread.sleep(3000);
		// Here we are storing the value from the cell in to the string variable
		//String sCellValue = driver.findElement(By.xpath("//li[@class='active']//a[@id='gainer']")).getText();
		//System.out.println(sCellValue);
		driver.findElement(By.cssSelector("body:nth-child(2)")).sendKeys(Keys.CONTROL + "\t");
		//driver.get("https://facebook.com");
		

		// Here we are clicking on the link of first row and the last column
		/*
		 * driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a"))
		 * .click(); System.out.
		 * println("Link has been clicked otherwise an exception would have thrown");
		 */
		// driver.close();
	}
}