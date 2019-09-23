package guru99;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\guru99\\src\\Drivers\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/?gclid=CjwKCAjwr8zoBRA0EiwANmvpYHZGzAOiP5rTOEcjM8JI8TNURYFdyUeb3stUS1ptRXtEcaR0hVSqCBoCIFQQAvD_BwE&ef_id=CjwKCAjwr8zoBRA0EiwANmvpYHZGzAOiP5rTOEcjM8JI8TNURYFdyUeb3stUS1ptRXtEcaR0hVSqCBoCIFQQAvD_BwE:G:s&s_kwcid=AL!739!3!326555007752!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("ashokelkapally@gmail.com");
		d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("9701148699");
		d.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		d.findElement(By.id("container")).click();
		
		
		
		Actions a = new Actions(d);
		a.sendKeys(Keys.ENTER).build().perform();
		
	}

}