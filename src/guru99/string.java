package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\guru99\\Driver\\chromedriver.exe");
		 WebDriver gmail=new ChromeDriver();
	
		gmail.get("https://www.youtube.com/");
	
		gmail.manage().window().maximize();
	  
		gmail.close();
		

	}

}
