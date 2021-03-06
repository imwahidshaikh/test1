package com.excel.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

public class excel {
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
public void registration(String fname, String lname, String addrss, String mail, String phoneno, String gender, String hobies) throws InterruptedException{
	WebElement first_name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	first_name.clear();
	first_name.sendKeys(fname);
	
	WebElement last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	last_name.clear();
	last_name.sendKeys(lname);
	
	WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
	address.clear();
	address.sendKeys(addrss);
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.clear();
	email.sendKeys(mail);
	
	WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	phone.clear();
	phone.sendKeys(phoneno);
	
	String g = "Male";
	if (gender.equals(g))
	{	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input")).click();
	
	
	}
	
	else {driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")).click();
	
	
	}
	
	
	if (hobies.contains("Cricket"))
	{	WebElement chk1 =driver.findElement(By.id("checkbox1"));
	chk1.click();}
	
	if (hobies.contains("Movies"))
	{	WebElement chk2 =driver.findElement(By.id("checkbox2"));
	chk2.click();}
	
	if (hobies.contains("Hockey"))
	{	WebElement chk3 =driver.findElement(By.id("checkbox3"));
	chk3.click();
	
	}
	
	

	
	}

@DataProvider
public Object[] [] excelread() throws IOException {
File file = new File("C:\\Users\\Wahid\\Documents\\DEMO AUTOMATION DATA.xlsx");
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
