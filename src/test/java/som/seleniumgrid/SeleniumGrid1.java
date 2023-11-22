package som.seleniumgrid;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumGrid1 {
	@Test
	public void  test1() throws InterruptedException, MalformedURLException {
		//WebDriverManager.chromedriver.setup();
		String nodeurl="http://localhost:4444";///wd/hub";
		URL url=new URL(nodeurl);
		ChromeOptions  options =new ChromeOptions();
		
		options.setCapability("platformname", "windows");
		options.setCapability("browsername", "chrome");
		WebDriver driver =new RemoteWebDriver(url,options);
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		//Thread.sleep(5000);
		//By ob=By.name("q");
		WebElement searchbx=driver.findElement(By.name("q"));
		searchbx.sendKeys("selenium");
        driver.close();

}
	public void  test2() throws InterruptedException, MalformedURLException {
		//WebDriverManager.chromedriver.setup();
		String nodeurl="http://localhost:4444";///wd/hub";
		URL url=new URL(nodeurl);
		FirefoxOptions  options =new FirefoxOptions();
		
		options.setCapability("platformname", "windows");
		options.setCapability("browsername", "chrome");
		WebDriver driver =new RemoteWebDriver(url,options);
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		//Thread.sleep(5000);
		//By ob=By.name("q");
		WebElement searchbx=driver.findElement(By.name("q"));
		searchbx.sendKeys("selenium");
        driver.close();

}
}
