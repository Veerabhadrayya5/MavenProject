package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

static
	{
	System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");
}
@org.testng.annotations.Test
public void openSite()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.moodfabrics.com/");
   driver.findElement(By.id("search")).sendKeys("tiger button");
   
}

}
