package Jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='_26Vr']")).click();
		List<WebElement>Oframes=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames::"+Oframes.size());
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
		System.out.println("no of frames are::"+Oframes.size());
		driver.findElement(By.name("username")).sendKeys("anilvanga123@gmail.com");;
		driver.findElement(By.name("password")).sendKeys("powerstar");;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("X")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Electricity")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		

	}

}
