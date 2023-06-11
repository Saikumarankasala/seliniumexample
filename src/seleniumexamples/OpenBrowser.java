package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
public static  void main (String args[]){
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://amazon.com");
driver.manage().window().maximize();
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	 String pageSource=driver.getPageSource();
	 System.out.println(pageSource);
	 WebElement we=driver.findElement(By.xpath("//*[@);
     we.click();
}

}