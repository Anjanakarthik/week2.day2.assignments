package leafgroundassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagesLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://leafground.com/pages/Link.html");
	driver.manage().window().maximize();
	
	//go to home page
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.navigate().back();
	//Find where am supposed to go without clicking me?
	System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"))	;
	
//verify broken page
	driver.findElement(By.linkText("Verify am I broken?")).click();
	if(driver.getTitle().equals("404 Not Found")) {
	System.out.println("page is broken");
	driver.navigate().back();
	}
	
	//interact with same link
	driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[2]")).click();
	driver.navigate().back();
	//number of links
	List<WebElement>links = driver.findElements(By.tagName("a"));
	System.out.println("The number of links "+links.size());
	}
}


