package Dec27_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Attribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		String linkurl=driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(linkurl);
		driver.close();
	}

}
