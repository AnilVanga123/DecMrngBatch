package Dce27_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		if (driver.getCurrentUrl().contains("dash")) {
			System.out.println("login success");
				}
		else
		{
		//get error massage
			String massage=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(massage+" "+"login fail");
			}
		Thread.sleep(6000);
		driver.quit();
	}	
}
