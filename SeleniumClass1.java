package org.emp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {

	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement a = driver.findElement(By.name("promptalertbox1234"));
		a.click();
		
		Alert b = driver.switchTo().alert();
	    
		String text = b.getText();
	    System.out.println(text);
	    
	    b.sendKeys("yes");
	    b.accept();
	
		
	}

}
