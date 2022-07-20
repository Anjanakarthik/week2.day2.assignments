package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//loading facebook
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@id='reg_pages_msg']/preceding::a)[3]")).click();
		Thread.sleep(3000);
		//capturing basic details
		driver.findElement(By.name("firstname")).sendKeys("Anjana",Keys.TAB);
		driver.findElement(By.name("lastname")).sendKeys("satya",Keys.TAB);
		driver.findElement(By.name("reg_email__")).sendKeys("4544552266",Keys.TAB);
		driver.findElement(By.id("password_step_input")).sendKeys("gpa@1234");
		//dropdown selection
		WebElement day=driver.findElement(By.id("day"));
		Select d = new Select (day);
		d.selectByIndex(8);
		WebElement month=driver.findElement(By.id("month"));
		Select m = new Select (month);
		m.selectByIndex(9);
		WebElement year=driver.findElement(By.id("year"));
		Select y = new Select (year);
		y.selectByVisibleText("1990");
		//selection of gender
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();


	}

}
