package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createleads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Iswarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sukin");
		
		WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select op=new Select(src);
		op.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(3000);
		
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select op1=new Select(campaign);
		op1.selectByValue("9001");
		Thread.sleep(3000);
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select op2=new Select(ownership);
		op2.selectByIndex(5);
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select op3=new Select(country);
		op3.selectByVisibleText("India");
		Thread.sleep(3000);
		
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
