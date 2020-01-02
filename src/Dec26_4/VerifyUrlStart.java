package Dec26_4;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlStart {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		String strprotocol="https://";
		String stractprotocol=driver.getCurrentUrl();
		if (stractprotocol.startsWith(stractprotocol)) {
		System.out.println("url is secured::"+stractprotocol+"  "+strprotocol);
		}
		else
		{
			System.out.println("url is unsecured::"+stractprotocol+"  "+strprotocol);
		}
		driver.close();
				
	}}
