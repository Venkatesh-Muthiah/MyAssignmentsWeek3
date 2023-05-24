package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		// Pseudo Code

//				  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

//				  2. Enter UserName and Password Using Id Locator
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");

		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");

//				  3. Click on Login Button using Class Locator
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

//				  4. Click on CRM/SFA Link
		WebElement crmButton = driver.findElement(By.xpath("//*[@id=\"label\"]/a"));
		crmButton.click();

//				  5. Click on contacts Button
		WebElement contactsButton = driver.findElement(By.linkText("Contacts"));
		contactsButton.click();

//				  6. Click on Create Contact
		WebElement createContactButton = driver.findElement(By.linkText("Create Contact"));
		createContactButton.click();

//				  7. Enter FirstName Field Using id Locator
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("firstName");

//				  8. Enter LastName Field Using id Locator
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("lastName");

//				  9. Enter FirstName(Local) Field Using id Locator
		WebElement localFirstName = driver.findElement(By.id("createContactForm_firstNameLocal"));
		localFirstName.sendKeys("firstNameLocal");

//				  10. Enter LastName(Local) Field Using id Locator
		WebElement localLastName = driver.findElement(By.id("createContactForm_lastNameLocal"));
		localLastName.sendKeys("lastNameLocal");

//				  11. Enter Department Field Using any Locator of Your Choice
		WebElement departmentID = driver.findElement(By.name("departmentName"));
		departmentID.sendKeys("departmentName");

//				  12. Enter Description Field Using any Locator of your choice 
		WebElement descriptionBox = driver.findElement(By.xpath("//*[@id=\"createContactForm_description\"]"));
		descriptionBox.sendKeys("description");

//				  13. Enter your email in the E-mail address Field using the locator of your choice
		WebElement mail = driver.findElement(By.id("createContactForm_primaryEmail"));
		mail.sendKeys("cba@gmail.com");

//				  14. Select State/Province as NewYork Using Visible Text
		WebElement province = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select provinceNY = new Select(province);
		provinceNY.selectByVisibleText("New York");

//				  15. Click on Create Contact
		WebElement clickContactButton = driver.findElement(By.className("smallSubmit"));
		clickContactButton.click();

//				  16. Click on edit button 
		WebElement editButton = driver.findElement(By.className("subMenuButton"));
		editButton.click();

//				  17. Clear the Description Field using .clear
		WebElement clearDescription = driver.findElement(By.id("updateContactForm_description"));
		clearDescription.clear();

//				  18. Fill ImportantNote Field with Any text
		WebElement impNote = driver.findElement(By.name("importantNote"));
		impNote.sendKeys("important note");

//				  19. Click on update button using Xpath locator
		WebElement updateButton = driver.findElement(By.xpath("//input[@value='Update']"));
		updateButton.click();

//				  20. Get the Title of Resulting Page.
		System.out.println("Title: " + driver.getTitle());

	}

}
