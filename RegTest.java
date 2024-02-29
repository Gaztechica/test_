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
        driver.get("http://23.105.246.172:3000/login");

       WebElement textBox = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[1]/input"));

        textBox.sendKeys("yevgeniy.gor.90@mail.ru");

        WebElement submitPassword = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[2]/span/input"));

        submitPassword.sendKeys("qwert12345");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"basic\"]/button"));

        submitButton.click();

        Thread.sleep(5000);

        driver.quit();
    }



    @Test
    public void PassworTest () throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("http://23.105.246.172:3000/login");

//        String titlel = driver.getTitle();

        WebElement textBoxl = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[3]/h2"));

        textBoxl.click();

        Thread.sleep(2000);

        WebElement submitPassword = driver.findElement(By.xpath("//*[@id=\"RestorePassword_email\"]"));

        submitPassword.sendKeys("yevgeniy.gor.90@mail.ru");

        WebElement submitButtonl = driver.findElement(By.xpath("//*[@id=\"RestorePassword\"]/button"));

        submitButtonl.click();

        Thread.sleep(5000);


        driver.get("http://23.105.246.172:3000/login");

        WebElement submitButtonlProject = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/div/div/div[1]/button/span"));

        submitButtonlProject.click();



        WebElement textProjectName = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_name\"]"));

        textProjectName.sendKeys("Новый проект");


        WebElement textProjectCity = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_city\"]"));

        textProjectCity.sendKeys("Самара");


        WebElement textBoxCountry = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_country\"]"));

        textBoxCountry.sendKeys("РФ");


        WebElement textBoxStreet = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_street\"]"));

        textBoxStreet.sendKeys("Победы");

        WebElement textBoxPostalCode = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_postalCode\"]"));

        textBoxPostalCode.sendKeys("444444");

//
//
//        textBoxStreet.sendKeys("yevgeniy.gor.90@mail.ru");
//
//
//        WebElement textBoxStreet = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_street\"]"));
//
//        textBoxStreet.sendKeys("yevgeniy.gor.90@mail.ru");
//
//
//        WebElement textBoxStreet = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_street\"]"));
//
//        textBoxStreet.sendKeys("yevgeniy.gor.90@mail.ru");
//
//
//        WebElement textBoxStreet = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_street\"]"));
//
//        textBoxStreet.sendKeys("yevgeniy.gor.90@mail.ru");
//
//
//        WebElement textBoxStreet = driver.findElement(By.xpath("//*[@id="root"]/section/aside/div/div[1]/button/svg/path"));
//
//        textBoxStreet.sendKeys("yevgeniy.gor.90@mail.ru");
//
//
//        WebElement textBoxStreet = driver.findElement(By.xpath("//*[@id="root"]/section/main/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[9]/td[2]/div/div"));
//
//        textBoxStreet.sendKeys("yevgeniy.gor.90@mail.ru");




        WebElement submitButtonCreateProject = driver.findElement(By.xpath("//*[@id=\"CreateProjectForm\"]/div[2]/button[1]/span"));


        submitButtonCreateProject.click();

        driver.quit();
    }
}
