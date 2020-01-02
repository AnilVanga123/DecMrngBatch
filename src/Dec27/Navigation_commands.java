package Dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("page title[1]::"+driver.getTitle());
		driver.findElement(By.partialLinkText("Gm")).click();
		System.out.println("page title[2]::"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("page title[3]::"+driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("page title[4]::"+driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
