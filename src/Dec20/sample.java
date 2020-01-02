package Dec20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class sample {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","‪F:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.gecko.driver","‪F:\\geckodriver.exe");
WebDriver dri=new FirefoxDriver();
System.setProperty("webdriver.ie.driver","‪F:\\IEDriverServer.exe");
WebDriver dr=new InternetExplorerDriver();
	}
}