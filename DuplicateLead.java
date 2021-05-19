package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
						  
		  driver.findElementByXPath("//div[@id = 'label']").click();
		  
		  driver.findElementByXPath("//a[text()='Leads']").click();
		  driver.findElementByXPath("//a [text()='Find Leads']").click();
		  
		driver.findElementByXPath("//span [text() = 'Email']").click();
		driver.findElementByXPath("//input [@name = 'emailAddress']").sendKeys("srisrini05@gmail.com");
		driver.findElementByXPath ("//button [text() = 'Find Leads']").click();
		
		//To get the first emp record
		WebElement emName = driver.findElementByXPath ("(//div[@unselectable='on']//a[text()='Srividhya'][1])");
				String firstName = emName.getText(); 
		       System.out.println(firstName);
		       emName.click();     
		       
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String CheckTitle = driver.findElementByXPath("//div [@id='sectionHeaderTitle_leads']").getText();
		               System.out.println(CheckTitle);
		      
		               if(CheckTitle.matches("Duplicate Lead")) {
		    	   System.out.println("The title verification test passed");
		    	}
		       else {
		    	   System.out.println("The title verification test failed");
		    	}
		    //driver.findElementByClassName("smallSubmit").findElement(By.name("submitButton")).click();
		    driver.findElementByXPath("//input [@class='smallSubmit']").click();
		    
		    String DupLeadName = driver.findElementById("viewLead_firstName_sp").getText();
		              if (DupLeadName.matches(firstName)) {
						System.out.println("The duplicate lead name is same as captured name");
						}   
		              else {
		            	  System.out.println("The duplicate lead name is not same as captured name");
		              }
		         driver.close();
	}
		               
	}