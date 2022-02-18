package seleniumDemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.booking.com");
		String title = c.getTitle();
		System.out.println(title);
		List<WebElement> links = c.findElementsByXPath("(//ul[@class = 'bui-tab__nav'])[1]/li/a/span[2]");
		System.out.println(links.size());
		int i=0;
		while(i<links.size()) {
		WebElement link = links.get(i);
		String txt = link.getText();
		i++;
		if(txt.equals("Car rentals") ) {
	    link.click();
	    break;
	    
}}}}

/*for(int i = 0; i < links.size() ; i++) {
WebElement link = links.get(i);
String txt = link.getText();
if(txt.equals("Flights") ) {
link.click();
}*/
/*for(WebElement link: links) {

String txt = link.getText();

if(txt.equals("Flights") ) {
link.click();
}
}*/

/*FirefoxDriver f = new FirefoxDriver ();
WebDriverManager.iedriver().setup();
InternetExplorerDriver i= new InternetExplorerDriver();*/