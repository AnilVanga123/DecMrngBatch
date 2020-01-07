package Jan3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/user/Downloads/promp%20(2).html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String alertmassege=alert.getText();
		System.out.println(alertmassege);
		Thread.sleep(5000);
		alert.sendKeys("anil");
		alert.accept();
		Thread.sleep(5000);
		String massege=driver.findElement(By.id("promptdemo")).getText();
		System.out.println(massege);
		Thread.sleep(5000);
		driver.quit();
		}

}
