

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://icrtc.com/");
		driver.manage().window().maximize();
		//WebElement we1=driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
		//we1.click();
		//WebElement we2=driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"));
		//we2.click();
		//WebElement we=driver.findElement(By.xpath("//div[@class='element-list collapse show']]"));
		//we.click();
		
		
}
}
