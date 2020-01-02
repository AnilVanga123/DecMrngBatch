package Dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_UsingChrome {

	public static void main(String[] args) throws Throwable {
//creating instance object
WebDriver driver=new ChromeDriver();
//launch URL in Browser
driver.get("http://orangehrm.qedgetech.com/");
driver.manage().window().maximize();
//enter User name and password
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
driver.findElement(By.name("Submit")).click();
//suspend from executing for 5 seconds
Thread.sleep(5000);
driver.quit();
 }

}
