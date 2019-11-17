package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RTTC_004 {
	
	private WebDriver driver;

	@BeforeMethod
	public void precondition() 
	{
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\OnlineTraining\\SDET Oct 2018\\dependencies\\chromedriver.exe");
		driver =new ChromeDriver();
		//String baseUrl = "https://www.google.com";
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://retail.upskills.in/");
	}
	
	@Test 
	public void register() throws InterruptedException
		{	
		
		WebElement user= driver.findElement(By.xpath("//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i"));
		Actions action= new Actions(driver);
		action.moveToElement(user).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[1]/a/span/span/i")).click();
		driver.findElement(By.id("input-email")).sendKeys("massu.ju1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("marshal@123");
		driver.findElement(By.xpath("//*[@class=\"pull-right\"]/input")).click();
		Thread.sleep(3000);
		WebElement order= driver.findElement(By.xpath("//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i"));
		Actions act= new Actions(driver);
		act.moveToElement(order).perform();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("MY ORDERS")).click();
		
		
	}
}
