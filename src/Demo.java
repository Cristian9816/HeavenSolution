import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium code
		
		//create driver object

		
		 ChromeOptions ops = new ChromeOptions();
		 ops.addArguments("--disable-notifications"); //disable notificare chrome
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\crist\\Desktop\\HeavenS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("first-name")).sendKeys("Cristian");
		driver.findElement(By.id("last-name")).sendKeys("Bereanu");
		driver.findElement(By.id("email")).sendKeys("email@gmail.com");
		driver.findElement(By.id("sign-up-password-input")).sendKeys("parolamQw1");
		driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("parolamQw1");

		Select options =new Select(driver.findElement(By.id("sign-up-heard-input")));
		options.selectByVisibleText("Other");
		
		
		driver.findElement(By.xpath("//*[@id=\" qa_loader-button\"]")).click();

		
	}

}
