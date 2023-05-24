package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateAcme {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();

//		1. Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();

//		2. Enter email as "kumar.testleaf@gmail.com"
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");

//		3. Enter Password as "leaf@12"
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("leaf@12");

//		4. Click login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

//		5. Get the title of the page and print
		System.out.println("Title of the page is- " + driver.getTitle());

//		6. Click on Log Out
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
		logOut.click();

//		7. Close the browser (use -driver.close())
		Thread.sleep(5000);
		driver.close();

	}
}
