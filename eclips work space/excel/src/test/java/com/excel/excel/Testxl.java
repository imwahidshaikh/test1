


	package com.excel.excel;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
import java.util.List;
import java.util.Set;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Testxl {
	public static WebDriver driver = null;
	@BeforeSuite
		public void browser() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
	@Test (dataProvider= "excelread")
	public void registration(String hobies) throws InterruptedException{
		
		List<WebElement> crk = driver.findElements(By.xpath("//div[@class = 'form-group'][6]/div/div/input"));
		for (WebElement we:crk) {
			String h = we.getText();
			
		
		if (hobies.contains(h))
		{	WebElement chk1 =driver.findElement(By.id("checkbox1"));
		chk1.click();
		System.out.println(h);
		}
		 
		
		if (hobies.contains(h))
		{	WebElement chk2 =driver.findElement(By.id("checkbox2"));
		chk2.click();}
		
		if (hobies.contains("Hockey"))
		{	WebElement chk3 =driver.findElement(By.id("checkbox3"));
		chk3.click();}
		}

	
		Thread.sleep(2000);
		}

	@DataProvider
	public Object[] [] excelread() throws IOException {
	File file = new File("C:\\Users\\Wahid\\Documents\\DEMO AUTOMATION for hobies.xlsx");
	FileInputStream z = new FileInputStream(file);
	Workbook wb = new XSSFWorkbook(z);
	Sheet sheet = (Sheet) wb.getSheet("Sheet1");
	int lastrow = sheet.getLastRowNum();
	int lastcellno = sheet.getRow(0).getLastCellNum();

	Object[] [] obj = new Object [lastrow] [lastcellno];

	for (int i = 1;i<lastrow;i++) {

	for (int j = 0 ; j<lastcellno ;j++ ) {

	obj[i] [j]  = sheet.getRow(i).getCell(j).getStringCellValue();
	}
	}
	return obj;}


	@AfterSuite
	public void browserclose() {
		driver.close();
	}


	}
