package Dec30_2;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Counting_Items {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("REG")).click();
		Select country=new Select(driver.findElement(By.name("country")));
		List<WebElement>listitems=country.getOptions();
		System.out.println("no of items are::"+listitems.size());
		for (int i = 0; i < listitems.size(); i++)
		{
			String eachitem=listitems.get(i).getText();
			System.out.println(eachitem);
			listitems.get(i).click();	
		}
		Thread.sleep(5000);
		driver.close();
	}

}
