package leafgroundassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagesButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("http://leafground.com/pages/Button.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("home")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.findElement(By.id("position")).getLocation());
	WebElement colour=driver.findElement(By.id("color"));
	System.out.println(colour.getCssValue("color"));
	WebElement size=driver.findElement(By.id("size"));
	System.out.println(size.getSize());
	}

}
