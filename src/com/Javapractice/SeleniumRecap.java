package com.Javapractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumRecap {

	public static void main(String[] args) throws Exception {
		WebDriver driver;

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		/*driver.get("https://www.linkedin.com");
		System.out.println(driver.getTitle());

		List<WebElement> list1 = driver.findElements(By.tagName("a"));
		System.out.println(list1.size());
		for (WebElement list2 : list1) {
			System.out.println(list2.getText());
		}
		
		Thread.sleep(3000);

		driver.get("https://facebook.com");
		WebElement we1 = driver.findElement(By.id("u_0_9"));
		we1.click();

		WebElement we2 = driver.findElement(By.id("year"));
		Select dd1 = new Select(we2);
		List<WebElement> list3 = dd1.getOptions();
		System.out.println(list3.size());
		for (WebElement list4 : list3) {
			System.out.println(list4.getText());
		}
		
		Thread.sleep(3000);
		
		driver.get("https://www.clubfactory.com/");
		WebElement we3=driver.findElement(By.xpath("//div[contains(text(),'(USD) | English')]"));
		Actions ac2= new Actions(driver);
		ac2.moveToElement(we3).build().perform();
		
		
		Thread.sleep(3000);*/
		
		driver.get("https://www.bseindia.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='indi']//i[@class='fa fa-arrow-circle-right']")).click();
		Thread.sleep(3000);
		
		WebElement we2 = driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.body div.container-fluid.whitebox.marketstartarea:nth-child(2) div.row div.col-lg-2.text-left:nth-child(2) > select.form-control.ng-pristine.ng-valid.ng-not-empty.ng-touched"));
		Select dd1 = new Select(we2);
		List<WebElement> list3 = dd1.getOptions();
		System.out.println(list3.size());
		for (WebElement list4 : list3) {
			System.out.println(list4.getText());
		
		}
	}

}
