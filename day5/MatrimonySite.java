package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonySite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//					Step 1: To open ChromeDriver
		ChromeDriver driver = new ChromeDriver();

//					Step 2: Load the Application Url as 'https://www.tamilmatrimony.in/'
		driver.get("https://www.tamilmatrimony.in/");

//					Step 3: Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//					Step 4: Select the Matrimony profile for YourSelf
		WebElement selectProfile = driver.findElement(By.xpath("//select[@name='REGISTERED_BY']"));
		Select selectProfileIP = new Select(selectProfile);
		selectProfileIP.selectByVisibleText("Myself");

//					Step 5: Enter Name
		WebElement name = driver.findElement(By.xpath("//input[@id='NAME']"));
		name.sendKeys("Clintton");

//					Step 6: Click on Gender
		WebElement gender = driver.findElement(By.xpath("//input[@id='gendermale']"));
		gender.click();

//					Step 7: Select your Date of Birth
		// Date
		WebElement date = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select dateIP = new Select(date);
		dateIP.selectByIndex(14);

		// Month
		WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select monthIP = new Select(month);
		monthIP.selectByIndex(5);

		// Year
		WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select yearIP = new Select(year);
		yearIP.selectByIndex(4);

//					Step 8: Select your Religion
		WebElement religion = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select religionIP = new Select(religion);
		religionIP.selectByVisibleText("Christian - Catholic");

//					Step 10: Select your Mother Tongue
		WebElement motherTongue = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select mtIP = new Select(motherTongue);
		mtIP.selectByIndex(4);

//					Step 11: Select your country
		WebElement country = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select countryIP = new Select(country);
		countryIP.selectByVisibleText("India");

//					Step 12: Enter your MobileNumber
		WebElement mobile = driver.findElement(By.xpath("//input[@id='MOBILENO']"));
		mobile.sendKeys("9654128730");

//					Step 13: Enter your E-mail ID
		WebElement email = driver.findElement(By.xpath("//input[@id='EMAIL']"));
		email.sendKeys("Clintton789@Outlook.com");

//					Step 14: Close the Browser	
		Thread.sleep(4000);
		driver.quit();
	}

}
