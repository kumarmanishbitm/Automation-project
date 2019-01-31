package newMN;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MNEn {
	@Test
	public void test() throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Sel\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.get("https://office2.m.network/#/Login");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='l-login']/div[2]/div[1]/div/input")).sendKeys("manish");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='l-login']/div[2]/div[2]/div/input")).sendKeys("DirectScale1");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(".//*[@id='Home']/a")).click();
	 Thread.sleep(2000);
	 
	 Actions act= new Actions(driver);
	 
	WebElement we= driver.findElement(By.xpath(".//*[@id='Business']/a"));
	act.moveToElement(we).perform();
	Thread.sleep(2000);
	
	WebElement we1=driver.findElement(By.xpath(".//*[@id='New Customer Sign Up']"));
	act.click(we1).build().perform();
	Thread.sleep(2000);
	
	String parent=driver.getWindowHandle();
	Set<String>s1=driver.getWindowHandles();
	Iterator<String> I1= s1.iterator();
	while(I1.hasNext())
	{
	   String child_window=I1.next();
	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='fixed-sidebar']/div[5]/button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='autocheck']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='fixed-sidebar']/div[5]/button[1]")).click();
	Thread.sleep(2000);
	
	Select sel= new Select(driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[2]/div[1]/div[1]/div/div/div/select")));
	sel.selectByVisibleText("Mr.");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[2]/div[1]/div[2]/div/div/input")).sendKeys("mani");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[2]/div[1]/div[3]/div/div/input")).sendKeys("test");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='Email2']")).sendKeys("Test Company");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[2]/div[3]/div[1]/div/div/input")).sendKeys("8965478512");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='Email8']")).sendKeys("9965874589");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='Email9']")).sendKeys("78956478596");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[2]/div[4]/div[1]/div/div/input")).sendKeys("manitest@test.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[2]/div[4]/div[2]/label/input")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[3]/div[1]/div[1]/div/div/input")).sendKeys("Test Address");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='Email4']")).sendKeys("Test Apartment");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[3]/div[2]/div[1]/div/div/input")).sendKeys("Test City");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='Zipcode']")).sendKeys("84043");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='autoshipdiv']/div[2]/div[3]/div[2]/div[4]/button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("manitest");
	Thread.sleep(2000);
	
	
	
	
	
	 
	 
	 
	
	
	}}}	
}
