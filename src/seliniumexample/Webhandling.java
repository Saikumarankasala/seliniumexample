package seliniumexample;

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
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		//WebElement grid_element=driver.findElement(By.xpath("//li[contains(text(),'Three')]"));
		Actions ac= new Actions(driver);
		ac.sendKeys(firstname,"sai").build().perform();
		WebElement mail_id=driver.findElement(By.xpath("//input[@id='userEmail']"));
		ac.sendKeys(mail_id,"saiankasala502@gmail.com").build().perform();
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		ac.sendKeys(lastname,"kumar").build().perform();
		WebElement gender = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		ac.click(gender).build().perform();
		WebElement mobilenumber = driver.findElement(By.xpath("	//input[@placeholder='Mobile Number']"));
		ac.sendKeys(mobilenumber,"8977977978").build().perform();
		WebElement date_of_birth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		ac.sendKeys(date_of_birth,"14-08-1995").build().perform();
		WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']"));
		ac.sendKeys(subject,"automation_testing").build().perform();
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		ac.sendKeys(hobbies," sports").build().perform();
		WebElement current_address = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		ac.sendKeys(current_address," vijayawada,andhrapradesh,pincode_521456").build().perform();

	}

}
