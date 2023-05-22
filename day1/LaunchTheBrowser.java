package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// To launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver1 = new EdgeDriver();

		driver1.get("http://iplt20.com/");
		driver.get("http://accuweather.com/");

		// ChromeDriver driver1=new Edge

		driver1.manage().window().maximize(); // used to maximize the edge window
		driver.manage().window().maximize(); // used to maximize the chrome window

		Thread.sleep(5000); // used to close the window by 5000 milliseconds(i.e 5 seconds)

		driver.close(); // to close the chrome window
		driver1.close(); // to close the edge window
	}

}
