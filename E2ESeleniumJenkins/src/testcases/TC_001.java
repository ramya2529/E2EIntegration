package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC_001 {
@Test
public void testcase1()
{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-extensions");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElementById("email").sendKeys("hello");
	driver.findElementById("pass").sendKeys("hello");
	driver.quit();
}
}
