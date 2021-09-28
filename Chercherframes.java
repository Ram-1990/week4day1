package week4day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chercherframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		WebElement topic = driver.findElement(By.xpath("/html/body/input"));
		topic.sendKeys("Animals");
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");	
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.id("a"));
		radio.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropDown1 = driver.findElement(By.id("animals"));
		Select drop=new Select(dropDown1);
		drop.selectByIndex(1);
		
		
	}
	
	

}
