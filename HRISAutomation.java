package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.*;

public class HRISAutomation {

	private static WebDriver driver=null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver","/home/himanshupandya/Downloads/chromedriver");
	
	driver=new ChromeDriver();
	driver.get("https://hris.qainfotech.com/login.php");
	driver.findElement(By.cssSelector("a.active > span")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("[id='txtUserName']")).sendKeys("himanshupandya");
	driver.findElement(By.cssSelector("[id='txtPassword']")).sendKeys("Himanshu09@");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#login > form > div.loginTxtBtn.extraText > div > input")).click();
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElements(By.id("addstatustag")).get(0).click();
	//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(1).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(2).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(3).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(4).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(5).click();
}
}