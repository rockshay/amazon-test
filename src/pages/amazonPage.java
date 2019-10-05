package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonPage {
	
	private static WebElement element;
	
	public static WebElement hamburger_menu(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']"));
		return element;
	}
	
	public static WebElement prime_video(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@class='nav-sprite hmenu-arrow-next']"));
		return element;
	}

	public static WebElement rent_buy(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@class='hmenu-item']"));
		return element;
	}
	
	public static WebElement text_box(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		return element;
	}
	
	public static WebElement search_btn(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@class='nav-input']"));
		return element;
	}
}
