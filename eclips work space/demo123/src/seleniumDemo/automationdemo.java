package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class automationdemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.Flipkart.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		//screenshot("flipkart opening window");
		d.findElement(By.xpath("(//div[@class='xtXmba'])[1]")).click();
		Thread.sleep(2000);
		//screenshot("mobile window");
		WebElement ele = d.findElement(By.xpath("//*[text()='Electronics']"));
		Actions a = new Actions(d);
		a.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		//screenshot("Electronics window");
		WebElement sam = d.findElement(By.xpath("//*[text()='Samsung']"));
		Actions b = new Actions(d);
		b.moveToElement(sam).click().build().perform();
		//screenshot("samsung window");
	}


//public static void screenshot(String name) throws IOException {
//	TakesScreenshot sc= (TakesScreenshot)d;
//	File f = sc.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(f, new File("F:\\eclips work space\\demo123\\src\\seleniumDemo\\screenshots\\"+ name +".png"));
//}
}
