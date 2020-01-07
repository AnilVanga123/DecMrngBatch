package Jan3;

import java.security.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args)throws Throwable{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		System.out.println("parent id::"+parent);
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Te")).click();
		Thread.sleep(5000);
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("allwindows id"+allwindows);
		for(String each:allwindows)
		{
			if (!parent.equals(each))
			{
				driver.switchTo().window(each);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']"));
				Thread.sleep(5000);
				driver.switchTo().window(parent);
				Thread.sleep(5000);
				driver.findElement(By.name("email")).sendKeys("anilvanga123@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("nani123");
				driver.findElement(By.id("u_0_2")).click();
				Thread.sleep(5000);
				driver.quit();
			}
			}
		}
}
