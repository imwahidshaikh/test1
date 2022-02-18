package com.demo.Testng;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {	
	@Test
	public void chromebrwsr () throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.Flipkart.com/");
		c.manage().window().maximize();
		Thread.sleep(2000);
		
		c.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		c.findElement(By.xpath("(//div[@class='xtXmba'])[1]")).click();
		Thread.sleep(2000);
		
		WebElement ele = c.findElement(By.xpath("//*[text()='Electronics']"));
		Actions a = new Actions(c);
		a.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		
		WebElement sam = c.findElement(By.xpath("//*[text()='Samsung']"));
		Actions b = new Actions(c);
		b.moveToElement(sam).click().build().perform();


	}

}
