package Dec31_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checking_Itms {

	public static void main(String[] args) {
	String Expitem="books";
	boolean itemexist=false;
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
	//get collection of items
 	List<WebElement>listitems=listbox.getOptions();
	System.out.println("no of items are"+listitems.size());
	for (int i = 1; i < listitems.size(); i++)
	{
		String eachitem=listitems.get(i).getText();
		System.out.println(eachitem);
		if (eachitem.equalsIgnoreCase(Expitem)) {
			itemexist=true;
			break;
		}
	}
	if (itemexist) {
		System.out.println("item found in listbox::"+Expitem);
	
	}
	else
	{
		System.out.println("item not found in listbox::"+Expitem);
	}

	}

}
