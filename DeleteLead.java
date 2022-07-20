package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		//login
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//election of leads
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		//lead selection
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains( text(),'Find Leads')]")).click();
		//selecting phone
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("909");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		//selection of first lead and delete
		String leadid =driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(leadid);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String mesage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

		System.out.println(mesage);
		driver.close();
	}

}


