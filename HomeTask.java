import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTask{

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\automation\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();


//Enlarge the window to the maximum size
driver.manage().window().maximize();

//Launch the ZenGo web
driver.get("https://zengo.com/");

// check that we in the good web(from title)
if (driver.getTitle().equals("ZenGo - Simple & Secure Crypto Wallet App"));	{
System.out.println("We are in homepage");
}
				

//menu item “Features” and press “Buy”
driver.findElement(By.id("menu-item-13191")).click();
Thread.sleep(2000);
driver.findElement(By.id("menu-item-10474")).click();
Thread.sleep(2000);


//Logo check
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/img[2]"));	
System.out.println("ZenGo logo is displayed successfully");


//go back to home page
driver.navigate().back();
Thread.sleep(2000);
driver.close();

}

}
