package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    		
    driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	   
    WebElement password = driver.findElementByXPath("//input[@id='password']");
	
    password.sendKeys("crmsfa");
	Thread.sleep(5000);
        //password.clear();
        
	 driver.findElementByXPath("//input[@type= 'submit']").click();
		
    driver.findElementByLinkText("CRM/SFA").click();
  
    driver.findElementByXPath("//a[text()='Leads']").click();	
    driver.findElementByXPath("//a [text()='Find Leads']").click();
   
    driver.findElementByXPath("//span [text() = 'Phone']").click();
    
    
    driver.findElementByXPath("//input [@name ='phoneCountryCode']").clear();
    driver.findElementByXPath("//input [@name ='phoneCountryCode']").sendKeys("91");
    driver.findElementByXPath("//input [@name = 'phoneAreaCode']").sendKeys("044");
    driver.findElementByXPath("//input [@name = 'phoneNumber']").sendKeys("43964081");
    driver.findElementByXPath("//button [text() = 'Find Leads']").click();
    Thread.sleep(1000);
    
     String LeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[1]").getText();
	      System.out.println(LeadID);  
	 
     driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[1]").click();
	         
    driver.findElementByXPath("//a [@class = 'subMenuButtonDangerous']").click();
    driver.findElementByXPath("//a [text()='Find Leads']").click();
    
    driver.findElementByXPath("//input [@name ='id']").sendKeys(LeadID);
    driver.findElementByXPath("//button [text() = 'Find Leads']").click();
    
    String recordcheck = driver.findElementByXPath("//div [@class ='x-paging-info']").getText();
   
    if (recordcheck.contentEquals("No records to display"))
      	 System.out.println("The record is successfully deleted");
     driver.close();
      
	}

}
