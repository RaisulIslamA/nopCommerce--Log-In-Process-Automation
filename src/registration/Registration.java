package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training.nop-station.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
	    driver.findElement(By.className("male")).click();
	    driver.findElement(By.name("FirstName")).sendKeys("Mr.A");
	    driver.findElement(By.name("LastName")).sendKeys("B");
	    Thread.sleep(5000);
	    
	    WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")); 
	    Select sel = new Select(element);
	    sel.selectByValue("3");
	    
	    WebElement element2 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")); 
	    Select sel2 = new Select(element2);
	    sel2.selectByVisibleText("March");
	    
	    WebElement element3 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")); 
	    Select sel3 = new Select(element3);
	    sel3.selectByValue("1995");
	    
	    driver.findElement(By.name("Email")).sendKeys("bugfind20220@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.name("Company")).sendKeys("company-1");
	    Thread.sleep(3000);
	    driver.findElement(By.name("Newsletter")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("Password")).sendKeys("1234AAa");
	    Thread.sleep(3000);
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("1234AAa");
	    Thread.sleep(3000);
	    driver.findElement(By.name("register-button")).click();
	    Thread.sleep(8000);
	    driver.close();
		

	}

}
