package Jan2_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingCheckBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.id("remember"));
		boolean value=checkbox.isSelected();
		System.out.println(value);
		if (checkbox.isSelected()) 
		{
			checkbox.click();
			
		}
		else
		{
			checkbox.click();
		}
	Thread.sleep(5000);
	driver.close();

	}

}
