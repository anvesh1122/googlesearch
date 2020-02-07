package guru99;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testscenariogoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\guru99\\Driver\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
	    
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	driver.get("https://www.google.co.in/webhp?tab=rw1");
	Thread.sleep(1000);
	    
	   WebElement w= driver.findElementByXPath("//input[@name='q']");
	   w.click(); 
	   w.sendKeys("abdul kalam");
	   w.sendKeys(Keys.ENTER);
	
	   List<String> a= new ArrayList<String>();
	 
	   String goti =driver.getTitle();
	  
	   if(goti.contains("Google")) {
	   List<WebElement> links= driver.findElementsByXPath("//h3[@class='LC20lb']");
	   int lsize=links.size();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   System.out.println(lsize);

	   for (int i=0;i<lsize;i++) {
		   Thread.sleep(2000);
		   if(driver.getTitle().equalsIgnoreCase(goti))
		  	 {}
		   else
			  driver.navigate().back();
		  

		 links= driver.findElementsByXPath("//h3[@class='LC20lb']");
		
	   if (links.get(i).isDisplayed()) {
			   
		 links.get(i).click();	
		 Thread.sleep(1000);
		 js.executeScript("return window.stop");
       	    	a.add(driver.getTitle());
		driver.navigate().back();
		   }
		  
	   }
	    System.out.println(a);
	    
	    Thread.sleep(50000);
	    driver.close();

	}

	}

}

