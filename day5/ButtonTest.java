package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Step 1: To open the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

//		Step 2: Load the Application Url as 'https://www.facebook.com/'
		driver.get("https://leafground.com/button.xhtml");

//		Step 3: Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Title
		WebElement title = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']"));
		title.click();
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);

		 if (titleOfPage.contains("Dashboard")) {
			 System.out.println("Title verified");
	}
		 //
}

}
