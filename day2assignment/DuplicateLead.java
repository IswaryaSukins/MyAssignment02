package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Iswarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sukin");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("I");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("NonIT to IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("iswarya98842@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.getTitle();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement cmpny = driver.findElement(By.id("createLeadForm_companyName"));
		cmpny.clear();
		Thread.sleep(3000);
		cmpny.sendKeys("Leaf");
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.clear();
		Thread.sleep(3000);
		firstname.sendKeys("Ishu");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
	

}
}