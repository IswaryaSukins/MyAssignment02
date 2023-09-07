package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Iswarya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='12887']")).click();
		
		String data="View Lead | opentaps CRM";
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals(data)) {
			System.out.println("successful");
		}else {
			System.out.println("Not successful");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(2000);
		
		WebElement cmpnyname = driver.findElement(By.id("updateLeadForm_companyName"));
		cmpnyname.clear();
		Thread.sleep(2000);
		cmpnyname.sendKeys("Leaf");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(2000);
		
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if (text.contains("Leaf")){
			
			System.out.println("Text matched");
		} else {
			
			System.out.println("Text not matched");
		}

		 driver.close();
	}

}
