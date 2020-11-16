import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void test () {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("75");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.cssSelector("input[type='button'][value='Calculate']")).click();
driver.close();
    }
}

