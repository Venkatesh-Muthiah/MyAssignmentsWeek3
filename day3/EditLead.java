package week3.day3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

//		Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

//		Enter UserName and Password Using Id Locator
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");

		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");

//		Click on Login Button using Class Locator
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

//		Click on CRM/SFA Link
		WebElement crmButton = driver.findElement(By.xpath("//*[@id=\"label\"]/a"));
		crmButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Click Leads link
		WebElement leadsButton = driver.findElement(By.linkText("Leads"));
		leadsButton.click();

//		Click Find leads
		WebElement findLead = driver.findElement(By.linkText("Find Leads"));
		findLead.click();

//		Enter first name
		WebElement firstName = driver.findElement(By.id("ext-gen248"));
		firstName.sendKeys("firstName");

//		Click Find leads button
		WebElement findLeads = driver.findElement(By.id("ext-gen334"));
		findLeads.click();

//		Click on first resulting lead
		WebElement firstResult = driver.findElement(By.linkText("12281"));
		firstResult.click();

//		Verify title of the page
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Title verified successfully");
		} else {
			System.out.println("Title not verified");
		}

//		Click Edit
		WebElement editButton1 = driver
				.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[1]/div/div/div/div[2]/a[3]"));
		editButton1.click();

//		Change the company name
		WebElement changeCN = driver.findElement(By.id("updateLeadForm_companyName"));
		changeCN.clear();
		changeCN.sendKeys("Microsoft");

//		Click Update
		WebElement updateButton = driver.findElement(By.className("smallSubmit"));
		updateButton.click();

//		Close the browser (Do not log out)
		driver.close();
	}

}
