package autoTest;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegTest {

    @Test
    public void RegaTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get
       WebElement textBox = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[1]/input"));

        textBox.sendKeys(

        WebElement submitPassword = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[2]/span/input"));
     WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"basic\"]/button"));

        submitButton.click();

        Thread.sleep(5000);

        driver.quit();
    }



   

        driver.quit();
    }
}
