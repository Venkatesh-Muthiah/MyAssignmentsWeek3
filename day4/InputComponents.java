package week3.day4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputComponents {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// box1
		WebElement box1 = driver.findElement(By.id("j_idt88:name"));
		box1.sendKeys("Jadeja");

		// box2
		WebElement box2 = driver.findElement(By.id("j_idt88:j_idt91"));
		box2.sendKeys(",India");

		// box3
		boolean box3 = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(box3);
		if (box3 == false) {
			System.out.println("not enabled");
		} else {
			System.out.println("enbled");
		}

		// box4
		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		// box6
		WebElement box6 = driver.findElement(By.id("j_idt88:j_idt99"));
		box6.sendKeys("420@gmail.com");
		box6.sendKeys(Keys.TAB + "I am BillGates");

		// box7 and box8
		driver.findElement(By.xpath("//button[@class='ql-bold']")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("BillGates");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);

		// box9
		String box9 = driver.findElement(By.className("ui-message-error-detail")).getText();
		System.out.println(box9);
		if (box9.contains("Age is mandatory")) {
			System.out.println("ERROR shown");
		}

		// box10
		WebElement box10 = driver.findElement(By.id("j_idt106:j_idt113"));

		Point originalLoc = box10.getLocation();

		driver.findElement(By.id("j_idt106:float-input")).click();

		Point changedLoc = box10.getLocation();

		if (!originalLoc.equals(changedLoc)) {
			System.out.println("location changed");
		}

		// box11
		WebElement box11 = driver.findElement(By.id("j_idt106:auto-complete_input"));
		box11.sendKeys("Jadeja");
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();

		// box12
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("04/26/2001");
		String box12 = driver.findElement(By.linkText("26")).getText();
		if ("04/26/2001".contains(box12)) {
			System.out.println("day is the same");
		}

		// box13
		WebElement box13 = driver.findElement(By.id("j_idt106:j_idt118_input"));
		box13.sendKeys("5");
		driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a")).click();
		String newValue = box13.getText();
		if (!newValue.equals("5")) {
			System.out.println("value has changed");
		} else {
			System.out.println("No change in value");
		}

		// box14

		// box15
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		boolean keyboard = driver.findElement(By.xpath("//div[contains(@class,'shadow keypad-popup')]")).isDisplayed();
		System.out.println(keyboard);
		if (keyboard == true) {
			System.out.println("keyboard is displayed");
		} else {
			System.out.println("keyboard is not displayed");
		}

		Thread.sleep(3000);
		driver.close();

	}

}