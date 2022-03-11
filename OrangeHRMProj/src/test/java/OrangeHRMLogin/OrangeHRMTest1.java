package OrangeHRMLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMTest1 {
@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\driver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test(dataProvider="LoginData")
	public void loginTest(String user,String pass, String exp )
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");

		  /*driver.findElement(By.name("txtUsername")).sendKeys(username);
		  driver.findElement(By.name("txtPassword")).sendKeys(password);
		  driver.findElement(By.name("Submit")).click();
		  driver.close();*/
		System.out.println(user+pass+exp);
		
		
		
	}
	
	@DataProvider(name="loginData")
	public String [][] getData()
{
		String loginData[][]= {
				{"Admin","admin123","valid"},
				{"ADMIN","admin222","invalid"},
				{"Addmin","ADMIN123","invalid"}
				};
		return loginData;
		}
	@AfterTest
	void tearDown() 
	{
		//driver.close()
	}
		
	}
