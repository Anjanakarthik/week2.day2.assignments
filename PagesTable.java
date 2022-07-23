package leafgroundassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagesTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();

		//count of rows
		List<WebElement>rows = driver.findElements(By.xpath("//table[@cellspacing=\"0\"]/tbody/tr"));
		System.out.println("total rows are "+rows.size());
		
		//count of colms
		List<WebElement>colms = driver.findElements(By.xpath("//table[@cellspacing=\"0\"]/tbody/tr/th"));
		System.out.println("total colms are "+colms.size());

		//value of 'Learn to interact with Elements'
		for(int i=0;i<3;i++) {
			List<WebElement>progress = driver.findElements(By.xpath("(//tr[@class='even'])/td[2]"));
			System.out.println("progress of Learn to interact with Elements"+progress.get(i).getText())	  ;
		}
		//check the least one
		driver.findElement(By.xpath("(//tr[@class='even'])[2]/td[3]")).click();
	}

}
