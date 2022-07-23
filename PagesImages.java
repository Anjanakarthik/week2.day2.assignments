package leafgroundassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagesImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://leafground.com/pages/Image.html");
	driver.manage().window().maximize();
	
	//click on first image
driver.findElement(By.xpath("//label[contains(text(),'Click on this image to go home page')]/following::img[1]")).click();
driver.navigate().back();
//clcik keyboard image
driver.findElement(By.xpath("//label[contains(text(),'Click on this image to go home page')]/following::img[3]")).click();
driver.navigate().back();
//broken imaage

WebElement broknimg=driver.findElement(By.xpath("(//label[@for='position'])[1]/following::img[1]"));
if(broknimg.getAttribute("naturalWidth").equals("0")) {
	System.out.println("broken image");
	}else
	System.out.println("image is not broken");
	}
}



