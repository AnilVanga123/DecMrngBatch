package Dec26_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) throws Throwable{
WebDriver driver=new ChromeDriver();
driver.get("https://gmail.com");
driver.manage().window().maximize();
String exptitle="gmail";
//get acttitle
String acttitle=driver.getTitle();
//verify acttitle with ex
Thread.sleep(5000);
driver.close();
	}

}
