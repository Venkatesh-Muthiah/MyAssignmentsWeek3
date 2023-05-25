package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();

//					Click Leads link
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
		leadButton.click();

//					Click Find leads
		WebElement findlead = driver.findElement(By.linkText("Find Leads"));
		findlead.click();

//					Click on Phone
		WebElement mobile = driver.findElement(By.linkText("Phone"));
		mobile.click();

//					Enter phone number
		WebElement mobileNo = driver.findElement(By.name("phoneNumber"));
		mobileNo.sendKeys("1223334444");

//					Click find leads button
		WebElement findLead = driver.findElement(By.linkText("Find Leads"));
		findLead.click();

//					Capture lead ID of First Resulting lead
		WebElement capleadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadID = capleadId.getText();
		System.out.println(leadID);

//					Click First Resulting lead
		capleadId.click();

//					Click Delete
		WebElement deleteButton = driver.findElement(By.className("subMenuButtonDangerous"));
		deleteButton.click();

//					Click Find leads
		WebElement findEleadButton = driver.findElement(By.linkText("Find Leads"));
		findEleadButton.click();

//					Enter captured lead ID
		WebElement leadID1 = driver.findElement(By.xpath("//input[@name='id']"));
		leadID1.sendKeys(leadID);

//					Click find leads button
		WebElement findLeads1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads1.click();
		Thread.sleep(2000);

//					Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String verify = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

		if (verify.equalsIgnoreCase("No records to display")) {
			System.out.println(leadID + " is deleted");
		} else {
			System.out.println(leadID + " is not delted");

			// Close the browser (Do not log out)
		}
	}
}
