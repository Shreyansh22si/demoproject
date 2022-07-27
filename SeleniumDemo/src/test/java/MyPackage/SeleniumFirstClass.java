package MyPackage;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SeleniumFirstClass {
	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		d = new ChromeDriver(); //open the browser
		d.get("https://demoqa.com/browser-windows");
	//	d.navigate().to("https://chromedriver.chromium.org/downloads");
		String str = d.getTitle();
		System.out.println(str);
		String currenturl  = d.getCurrentUrl();
		System.out.println(currenturl);
	//	Select sel = new Select(d.findElement(By.id("oldSelectMenu")));
	//	sel.selectByValue("2");
	//	sel.selectByIndex(5);
	//	sel.selectByVisibleText("Black");
	//	WebElement e = d.findElement(By.className("rct-icon-uncheck"));
	//	System.out.println(e.isDisplayed());
	//	System.out.println(e.isEnabled());
	//	System.out.println(e.isSelected());
	//	System.out.println(e.getText()); 
	//	Thread.sleep(3000);
	//	d.quit();
		
	//	Select st = new Select(d.findElement(By.id("oldSelectMenu")));
	//	st.selectByValue("2");
	//	st.selectByIndex(5);
	//	st.selectByVisibleText("Black");
	//	Thread.sleep(3000);
	//	d.quit();
		
		Actions ac = new Actions(d);
	//	WebElement start = d.findElement(By.id("draggable"));
	//	WebElement end = d.findElement(By.id("droppable"));
	//	ac.dragAndDrop(start, end).perform();
	//	ac.doubleClick(end);
	//	ac.contextClick();
	
	//	WebElement first = d.findElement(By.xpath("//div/a[contains(text(),'API')]"));
	//	WebElement second = d.findElement(By.xpath("//div/a[contains(text(),'A Complete Guide to API Development')]"));
	//	ac.moveToElement(first).moveToElement(second).click().perform();;
	//	Thread.sleep(3000);      
	//	d.quit();
		
	//	d.findElement(By.id("alertButton")).click();
	//	Alert al = d.switchTo().alert();
	//	al.accept();
	//	Thread.sleep(3000);      
	//	d.quit();
		
//		d.navigate().back(); // navigational command
//		d.navigate().forward();
//		d.navigate().refresh();
//		
		d.findElement(By.id("tabButton")).click();
		Set<String> set = d.getWindowHandles();
		
		String firstTab = (String)set.toArray()[1];
		d.switchTo().window(firstTab);
		String parent = (String)set.toArray()[0];
		d.switchTo().window(parent);
		Thread.sleep(3000);
		d.quit();
		 
	 
		
		
	}

}
