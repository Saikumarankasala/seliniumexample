package seliniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	WebElement we=driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Phir Aur Kya Chahiye| Zara Hatke Zara Bachke| Vicky K, Sara Ali K, Arijit Singh,Sachin-Jigar,Amitabh')]"));
	we.click();
	WebElement element= driver.findElement(By.xpath("//div[@class='landing-header']"));
	element.clear();
	}

}
