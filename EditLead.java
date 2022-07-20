package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("SIVA");
		driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//verify page title

		String pagetitle=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if(pagetitle.equalsIgnoreCase("View Lead")) {
			//stem.out.println("success");
			driver.findElement(By.linkText("Edit")).click();
			//company name updation
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HP");
			String editedname=driver.findElement(By.id("updateLeadForm_companyName")).getText();
			driver.findElement(By.name("submitButton")).click();

			String company=driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(company);
			driver.close();

		}


	}

}


