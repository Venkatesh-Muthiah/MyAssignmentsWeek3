package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Step 1: To open the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

//		Step 2: Load the Application Url as 'https://www.facebook.com/'
		driver.get("https://www.facebook.com/");

//		Step 3: Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Step 4: Click on Create New Account button
		WebElement newAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		newAcc.click();

//		Step 5: Enter first name
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Tamil");

//		Step 6: Enter last name
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Selvan");

//		Step 7: Enter your mobile number
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9516238470");

//		Step 8: Enter your password
		WebElement passKey = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passKey.sendKeys("passkey");

//		Step 9: Select  date
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select dateIP = new Select(date);
		dateIP.selectByIndex(14);

//		Step 10: Select month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthIP = new Select(month);
		monthIP.selectByIndex(5);

//		Step 11: Select year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearIP = new Select(year);
		yearIP.selectByVisibleText("1995");

//		Step 12: Click on your Gender
		WebElement sex = driver.findElement(By.xpath("//input[@value='2']"));
		sex.click();

//		Step 13: Close your Browser
		Thread.sleep(4000);
		driver.close();
	}

}
