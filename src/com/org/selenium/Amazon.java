package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.amazonPage;

public class Amazon {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		amazonPage.hamburger_menu(driver).click();
		amazonPage.prime_video(driver).click();
		amazonPage.rent_buy(driver).click();
		amazonPage.text_box(driver).sendKeys("Iron Man");
		amazonPage.search_btn(driver).click();
		
		driver.close();
		
		System.out.println("Test Completed Successfully");

	}

}