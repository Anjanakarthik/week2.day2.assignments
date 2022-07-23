package leafgroundassignments;
import java.time.Duration;
import java.util.List;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PagesCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		//known language
		driver.findElement(By.xpath("//label[contains(text(),'Select the languages that you know?')]/following::input[4]")).click();
		WebElement chek=driver.findElement(By.xpath("(//label[@for=\"java\"])[2]/following::input[1]"));
		if(chek.getAttribute("checked")!=null) {
			System.out.println("it is selected");
		}
		//unchek the heked box
		WebElement unchek =driver.findElement(By.xpath("(//label[@for='java'])[3]/following::input[2]"));
		if(unchek.getAttribute("checked")!=null) {	
			unchek.click();
		}else
			System.out.println("not cheked");

		//select all options
		List<WebElement>checkboxes = driver.findElements(By.xpath("(//label[@for='java'])[4]/following::input"));
		int size =checkboxes.size();
		for(int i = 0;i<size;i++) {
			checkboxes.get(i).click(); 
		}

	}

}



