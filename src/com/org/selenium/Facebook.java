package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Akshay");
		driver.findElement(By.name("lastname")).sendKeys("Athawale");
		driver.findElement(By.name("websubmit")).click();
		//driver.close();

	}

}
