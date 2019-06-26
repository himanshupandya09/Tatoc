package tatoctestngpackage;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TatocTestNGFile {
	WebDriver driver=new ChromeDriver();
  @BeforeTest
  public void launchBrowser() {
      System.out.println("launching chrome driver"); 
      System.setProperty("webdriver.chrome.driver","/home/himanshupandya/Downloads/chromedriver");
      
     
  }
  
  @Test
  public void TestImplementation() throws InterruptedException {
	 
	  driver.navigate().to("http://10.0.1.86/tatoc");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Basic")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("greenbox")).click();
		Thread.sleep(1000);
				
		WebElement e=driver.findElement(By.id("main"));
		driver.switchTo().frame(e);
		String eanswer=driver.findElement(By.id("answer")).getAttribute("class");
		
		Boolean condition=true;
		
		while(condition)
		{
			driver.findElement(By.linkText("Repaint Box 2")).click();
			
			WebElement child=driver.findElement(By.id("child"));
			
			driver.switchTo().frame(child);
			String realAnswer=driver.findElement(By.id("answer")).getAttribute("class");
			
			if(realAnswer.contentEquals(eanswer))
			{
				condition=false;
			}
			driver.switchTo().parentFrame();
		}
		driver.findElement(By.linkText("Proceed")).click();
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(driver.findElement(By.id("dragbox")),driver.findElement(By.id("dropbox"))).build().perform();
		driver.findElement(By.linkText("Proceed")).click();
		
		
		driver.findElement(By.linkText("Launch Popup Window")).click();
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		
		// Now you are in the popup window, perform necessary actions here
		
		
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Himanshu");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		driver.switchTo().window(parentWindowHandler);
		driver.findElement(By.linkText("Proceed")).click();

  }
  
  @AfterTest
  public void terminateBrowser(){
	  
      driver.close();
  }
}
