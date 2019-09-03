package com.Javapractice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;


public class newtab {
	
	public static void main(String[] args) {
		 WebDriver driver;
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    driver.get("http://google.com");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(tabs.size());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("http://facebook.com");
	    System.out.println("This is Facebook");
	    
	}
	
	
}
