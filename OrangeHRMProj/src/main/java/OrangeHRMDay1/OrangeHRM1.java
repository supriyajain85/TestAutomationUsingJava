package OrangeHRMDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrangeHRM1 {

	public static void main(String[] args) throws InterruptedException {
		
		List<User> user = new ArrayList<User>();
		
		for (int i=0; i<=4 ; i++) {
			User tempUser = new User();
				tempUser.setUserID("Vishal" + i);
				tempUser.setPassword("Password" + i);
				user.add(tempUser);
			
		}
		
		for (User users: user)
			System.out.println(users.getUserID() + "--" + users.getPassword());
		

	/*	System.setProperty("webdriver.chrome.driver", "C:\\Data\\driver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  
		driver.close();
		*/
	}

}
