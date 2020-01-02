package Dec24_2;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommandsAmezon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String pagetitle=driver.getTitle();
		System.out.println("pagtitle is::"+pagetitle);
		System.out.println("pagtitle is::"+pagetitle.length());
		String strurl=driver.getCurrentUrl();
		System.out.println("page url is=="+strurl);
		System.out.println("page url is=="+strurl.length());
		driver.close();		

	}

}
