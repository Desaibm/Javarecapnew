package com.Javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulitest {
	
	public static void main(String[] args) throws FindFailed {

        String filepath = "E:\\selemium\\sikuli\\";
        String inputFilePath = "E:\\selemium\\sikuli\\";
        Screen s = new Screen();
        Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
        WebDriver driver;

        // Open Chrome browser    
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/image_upload/index.php");

        // Click on Browse button and handle windows pop up using Sikuli
        driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
        s.wait(fileInputTextBox, 20);
        s.type(fileInputTextBox, inputFilePath + "Test.docx");
        s.click(openButton);

        // Close the browser
        driver.close();
        
	}

}
