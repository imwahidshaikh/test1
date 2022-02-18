package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demosite {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")).click();
		
		String d = "Cricket, Hockey";
		String g = "Cricket";
		if (d.contains("Cricket"))
		{	WebElement chk1 =driver.findElement(By.id("checkbox1"));
		chk1.click();
		
		}
		if (d.contains("Hockey"))
		{	WebElement chk3 =driver.findElement(By.id("checkbox3"));
		chk3.click();}
	/*	if (g.contains("Hockey"))
		{	
		WebElement chk3 =driver.findElement(By.id("checkbox3"));
		chk1.click();
		}*/
		
	
		Thread.sleep(2000);

	}

}
