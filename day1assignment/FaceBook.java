package week2.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Iswarya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sukin");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("iswarya98842@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ishu@123");
		driver.findElement(By.xpath("//div[text()='Date of birth']")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select op=new Select(day);
		op.selectByValue("2");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select op1=new Select(month);
		op1.selectByValue("10");
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select op2=new Select(year);
		op2.selectByValue("1996");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
