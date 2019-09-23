package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogGuru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\guru99\\Driver\\chromedriver.exe");
		 WebDriver guru=new ChromeDriver();
		guru.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		guru.manage().window().maximize();
		guru.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("guru99");
		guru.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("3308");
		guru.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		guru.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")).sendKeys("3308");
     guru.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")).click();
     guru.findElement(By.xpath("//html/body/table/tbody/tr[2]/td/table/tbody/tr[5]/td/a")).click();
     guru.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
     guru.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")).sendKeys("3309");
     guru.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")).click();
     guru.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
     guru.close();
	}

}