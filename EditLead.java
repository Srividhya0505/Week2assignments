package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");

		WebElement password = driver.findElementByXPath("//input[@id='password']");
		password.sendKeys("crmsfa");
		Thread.sleep(2000);
		// password.clear();

		driver.findElementByXPath("//input[@type= 'submit']").click();

		driver.findElementByXPath("//div[@id = 'label']").click();

		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a [text()='Find Leads']").click();
		Thread.sleep(3000);
		// Enter first name
		driver.findElementByXPath("//input [@type ='text' and @name='firstName'][3]").sendKeys("Srividhya");
		// Click Find leads button
		driver.findElementByXPath("//button [text() = 'Find Leads']").click();
		Thread.sleep(2000);
		// Click on first resulting lead
		driver.findElementByXPath("(//div[@unselectable='on']//a[text()='Srividhya'][1])").click();
		// Verify title of the page
		String verifyTitle = driver.findElementById("sectionHeaderTitle_leads").getText();
		if (verifyTitle.contentEquals("View Lead")) {
			System.out.println("The title verification test passed");
		} else {
			System.out.println("The title verification test failed");
		}
		// Click Edit
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		// Change the company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Legato");
		// Click Update
		driver.findElementByXPath("//input[@value ='Update']").click();
		// Confirm the changed name appears
		String cmpName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(cmpName);

	}

}
