package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadandDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver ();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElementById("username").sendKeys("DemoSalesManager");
	
		WebElement password = driver.findElementById("password");
			password.sendKeys("crmsfa");
			Thread.sleep(5000);
            //password.clear();
            
		driver.findElementByClassName("decorativeSubmit").click();
	  
		String Actual = driver.getTitle();
	  String Expected = "http://leaftaps.com/opentaps/control/main";
	  
	  if (Actual.equals(Expected)) {
		  System.out.println("Title Verificaiton Passed");
	  }
	  else {
		  System.out.println("Title Verification Failed");
		    }
	  
	  driver.findElementByLinkText("CRM/SFA").click();
	  driver.findElementByLinkText("Leads").click();
	  driver.findElementByLinkText("Create Lead").click();
	  
	  driver.findElementById("createLeadForm_companyName").sendKeys("HCLT");
	 // driver.findElementById("createLeadForm_parentPartyId").sendKeys("HCL Company");
	  driver.findElementById("createLeadForm_firstName").sendKeys("Srividhya");
	  driver.findElementById("createLeadForm_lastName").sendKeys("Srinivasan");
	  
	    WebElement c0 = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown0 = new Select (c0);
		dropdown0.selectByIndex(4);
		
		
		WebElement cl = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown = new Select (cl);
		dropdown.selectByValue("DEMO_MKTG_CAMP");
		   
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sri");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Srini");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
		driver.findElementById("createLeadForm_birthDate").sendKeys("05/05/1983");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Test Lead");
		driver.findElementById("createLeadForm_departmentName").sendKeys("QA");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("10000");
		
		WebElement c3 = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown2 = new Select (c3);
		dropdown2.selectByVisibleText("INR - Indian Rupee");
		
		WebElement c2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown1 = new Select (c2);
		dropdown1.selectByVisibleText("Computer Software");
	  		
	  driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
	  
	  WebElement onwer = driver.findElementById("createLeadForm_ownershipEnumId");
	  Select dropdown3 = new Select (onwer);
	  dropdown3.selectByValue("OWN_SCORP");
	  
	  driver.findElementById("createLeadForm_sicCode").sendKeys("NA");
	  driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Notknown");
	  
	  driver.findElementById("createLeadForm_description").sendKeys("Data of Srividhya");
	  driver.findElementById("createLeadForm_importantNote").sendKeys("Lateral Entry - Having H1B");
	  
	  driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
	  driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
	  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("43964081");
	  driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("05");
	  driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Srividhya");
	  driver.findElementById("createLeadForm_primaryEmail").sendKeys("srisrini05@gmail.com");
	  
	  driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
	  
	  driver.findElementById("createLeadForm_generalToName").sendKeys("Srividhya S");
	  driver.findElementById("createLeadForm_generalAttnName").sendKeys("Mrs. Srividhya");
	  driver.findElementById("createLeadForm_generalAddress1").sendKeys("B2-1, Serene Acres, Thoraipakkam");
	  driver.findElementById("createLeadForm_generalAddress2").sendKeys("         ");
	  driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
	  
	  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("620097");
	  
	  WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
	  Select dropdown6 = new Select (Country);
	  dropdown6.selectByVisibleText("India");
	  Thread.sleep(2000);	
	  
	  WebElement Province = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	  Select dropdown5 = new Select (Province);
	  dropdown5.selectByVisibleText("TAMILNADU");
	       
     driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("   ");
	  
	  driver.findElementByClassName("smallSubmit").click();  
	  
	  driver.findElementByLinkText("Duplicate Lead").click();
	  
	  driver.findElementById("createLeadForm_companyName").clear();
	  
	  driver.findElementById("createLeadForm_companyName").sendKeys("FreshWorks");
	 
	  driver.findElementByClassName("smallSubmit").click(); 
	  
	  WebElement compName = driver.findElementById("createLeadForm_companyName");
	        compName.getText();
	        
	    driver.close();
	    
	  }
		  
	
		
	}


