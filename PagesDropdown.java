package leafgroundassignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagesDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
//first dopdown
		WebElement firstdropdown=driver.findElement(By.id("dropdown1"));
		Select S1 = new Select (firstdropdown);
		S1.selectByIndex(1);
		Thread.sleep(3000);
//second dropdown		
		WebElement seconddropdown=driver.findElement(By.name("dropdown2"));
		Select S2 = new Select (seconddropdown);
S2.selectByVisibleText("Selenium");
//third DD
		WebElement thirddropdown=driver.findElement(By.id("dropdown3"));
		Select S3 = new Select (thirddropdown);
		S3.selectByValue("1");
	//count 
		String [] options=driver.findElement(By.className("dropdown")).getText().split("\n");
		System.out.println(options.length-1);
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Se",Keys.TAB);
		driver.findElement(By.xpath("(//div[@class='example']/select)[6]")).sendKeys("Se",Keys.TAB);
	}

}
