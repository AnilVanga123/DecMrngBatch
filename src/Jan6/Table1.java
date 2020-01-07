package Jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/qedgetable.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String tabletext=driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText();
		System.out.println(tabletext);
		WebElement table=driver.findElement(By.name("qedgetech"));
		List<WebElement>rows=driver.findElements(By.tagName("tr"));
		System.out.println("no of rows are"+rows.size());
		Thread.sleep(5000);
		for (int i = 1; i < rows.size(); i++) 
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("row no::"+i+"  "+"column no::"+cols.size());
			
		}	
		Thread.sleep(5000);
		driver.close();
	}

}
