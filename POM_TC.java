package automationframework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class POM_TC {

	private static WebDriver driver=null;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/himanshupandya/Downloads/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.cssSelector("[id='gb_70']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[id='identifierId']")).sendKeys("himanshupandya040995@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > span > span")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Himanshu09@");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#passwordNext > span > span")).click();

		//driver.close();
}
}