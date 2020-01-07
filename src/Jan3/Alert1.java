package Jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		String alrtmassage=driver.switchTo().alert().getText();
		System.out.println(alrtmassage);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("qedgeeee!@#");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();
		}

}
