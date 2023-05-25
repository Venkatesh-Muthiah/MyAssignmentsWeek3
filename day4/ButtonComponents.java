package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonComponents {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// getTitle
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		System.out.println(driver.getTitle());
		driver.get("http://www.leafground.com/button.xhtml");
		Thread.sleep(3000);
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if (enabled == false) {
			System.out.println("Button is disabled");
		} else {
			System.out.println("Button is enabled");
		}

		// location,size
		Point location = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		System.out.println(location);
		Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println(size);

		// click image
		WebElement image = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']/span"));
		image.click();

		driver.close();
	}
}