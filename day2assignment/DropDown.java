package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select op=new Select(tool);
		op.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role='application']//button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='One']")).click();
		
		
		
		
		
	}

}
