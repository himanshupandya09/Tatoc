import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/himanshupandya/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://10.0.1.86/tatoc");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Basic")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("greenbox")).click();
		
		String var=driver.findElement(By.linkText("Box1")).getAttribute("class");
		System.out.println(var);
		String var1=driver.findElement(By.linkText("Box2")).getAttribute("class");
		System.out.println(var1);
		if(var!=var1)
		{
			driver.findElement(By.partialLinkText("Repaint Box ")).click();
		}
		else
		{
			driver.findElement(By.partialLinkText("Proceed ")).click();
		}
		
	}

}
