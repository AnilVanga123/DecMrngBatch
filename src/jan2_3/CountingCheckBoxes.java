package jan2_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingCheckBoxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/user/Downloads/checkbox_1.html");
		driver.manage().window().maximize();
		List<WebElement>Olist=driver.findElements(By.tagName("input"));
		System.out.println("no of checkboxes are::"+Olist.size());
		for (int i = 0; i < Olist.size(); i++)
		{
			String checkboxname=Olist.get(i).getAttribute("value");
			System.out.println(checkboxname);
			boolean value=Olist.get(i).isSelected();
			System.out.println("checkbox active or inactive::"+value);
			if (Olist.get(i).isSelected())
			{
				Olist.get(i).click();
			}
			else
			{
				Olist.get(i).click();

			}
			Thread.sleep(5000);


		}
		Thread.sleep(5000);
		driver.close();

	}

}
