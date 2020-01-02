package Dec24;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//print title page and length of title
	String pagetitle=driver.getTitle();
	System.out.println("page title is::"+pagetitle);
	System.out.println("page title is::"+pagetitle.length());
	//print URL of page and length of URL
	String strurl=driver.getCurrentUrl();
	System.out.println("page url is=="+strurl);
	System.out.println("page url is=="+strurl.length());
	driver.close();
	}

}
