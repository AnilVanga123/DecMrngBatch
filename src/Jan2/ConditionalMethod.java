package Jan2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
	WebElement reenteremail=driver.findElement(By.id("u_0_12"));
	boolean value=reenteremail.isDisplayed();
	System.out.println(value);

	}

}
