package jan2_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		List<WebElement>Olist=driver.findElements(By.xpath("//form/nav/ul/li/label/strong"));
		System.out.println("no of radio button are::"+Olist.size());
		for (int i = 0; i < Olist.size(); i++)
		{
			boolean value=Olist.get(i).isSelected();
			System.out.println(value);
			String radiobuttonname=Olist.get(i).getText();
			System.out.println(radiobuttonname);
			if (!Olist.get(i).isSelected())
			{
				Olist.get(i).click();
				Thread.sleep(5000);

			}


		}
	}

}
