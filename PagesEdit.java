package leafgroundassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagesEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	
	//email addres
	driver.findElement(By.id("email")).sendKeys("anjana@gmail.com");
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("a",Keys.TAB);
System.out.println("default text is "+driver.findElement(By.name("username")).getAttribute("value"));	
driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
boolean enablecheck= driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
	if(enablecheck==false) {
		System.out.println("it is disabled");
	}else
		System.out.println("it is enabled");
	}
	}


