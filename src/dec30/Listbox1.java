package dec30;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	//store month list box into select class
	Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
	//store year list box into select class
	Select yearlistbox=new Select(driver.findElement(By.id("year")));
	boolean value1=monthlistbox.isMultiple();
	System.out.println(value1);
	boolean value2=yearlistbox.isMultiple();
	System.out.println(value2);
	monthlistbox.selectByVisibleText("Mar");
	System.out.println(monthlistbox.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	yearlistbox.selectByVisibleText("1990");
	System.out.println(yearlistbox.getFirstSelectedOption().getText());
	yearlistbox.selectByValue("2001");
	System.out.println(yearlistbox.getFirstSelectedOption().getText());
	monthlistbox.selectByIndex(9);
	System.out.println(yearlistbox.getFirstSelectedOption().getText());
	yearlistbox.selectByIndex(50);
	System.out.println(yearlistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	driver.close();

	}

}
