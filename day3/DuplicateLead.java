package week3.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();

		// Click Leads link
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
		leadButton.click();

		// Click Find leads
		WebElement findlead = driver.findElement(By.linkText("Find Leads"));
		findlead.click();

		// Click on Email
		WebElement email = driver.findElement(By.linkText("Email"));
		email.click();

		// Enter Email
		WebElement typeEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
		typeEmail.sendKeys("mail007@gmail.com");

		// Click find leads button
		WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadButton.click();

		// Capture name of First Resulting lead
		WebElement nameOfThe1stLead = driver.findElement(By.xpath("//a[text()='Vishnu'][1]"));
		String text = nameOfThe1stLead.getText();
		System.out.println(text);
		nameOfThe1stLead.click();

		// Click First Resulting lead
		// Click Duplicate Lead
		WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
		duplicate.click();

		// Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Duplicate Lead")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title mismatch");
		}

		// Click Create Lead
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();

		// Confirm the duplicated lead name is same as captured name
		WebElement dName = driver.findElement(By.id("viewLead_firstName_sp"));
		String text1 = dName.getText();
		if (text1.equals(text)) {
			System.out.println("both names are same");
		}

		// Close the browser (Do not log out)
		driver.close();
	}
}
