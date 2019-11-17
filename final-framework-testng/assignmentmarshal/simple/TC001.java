package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {

	@Test
	public void login()
	{
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\OnlineTraining\\SDET Oct 2018\\dependencies\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//String baseUrl = "https://www.google.com";
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://retail.upskills.in/");
		
	}
}
