import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationsite {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		c.manage().window().maximize();
		Thread.sleep(3000);
		WebElement trip = c.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]"));
		trip.click();
		WebElement frmtxtbx = c.findElement(By.xpath("(//input[@type='text'])[1]"));
		frmtxtbx.sendKeys("MU");
		Thread.sleep(3000);
		List<WebElement> allcities =c.findElements(By.xpath("(//div[@class='p-relative'])[2]/div[2]/ul/li"));
		for (WebElement singlecity :allcities) {
			if (singlecity.getText().contains("Mumbai, IN")) {
				singlecity.click();
				
			}
			
			WebElement totxtbx = c.findElement(By.xpath("(//input[@type='text'])[2]"));
			totxtbx.sendKeys("pu");
			Thread.sleep(3000);
			List<WebElement> allcities1 =c.findElements(By.xpath("(//div[@class='p-relative'])[4]/div[2]/ul/li"));
			for (WebElement singlecity1 :allcities1) {
				if (singlecity1.getText().contains("Pune, IN")) {
					singlecity1.click();
				
				}
			
			
		}
		
	}

}}
