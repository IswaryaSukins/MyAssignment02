package week2.day2assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("7C");
		
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select op=new Select(industry);
		op.selectByValue("IND_SOFTWARE");
		Thread.sleep(3000);
		
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select op1=new Select(ownership);
		op1.selectByValue("OWN_SCORP");
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select op2=new Select(source);
		op2.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(3000);
		
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select op3=new Select(campaign);
		op3.selectByIndex(6);
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select op4=new Select(state);
		op4.selectByValue("TX");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
		
	}

}
