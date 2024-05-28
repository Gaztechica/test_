package ar.soft;

import ar.soft.modelPage.ProgjctPage;
import ar.soft.runner.BaseTest;
import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class ProjectTest extends BaseTest {

    private final By NEW_PROJEСT_NAME_TEXT = By.xpath("//div[@class='Sidebar__project-name'][contains(.,'1Новый проект')]");


    // ============================== Проект создание/удаление переписать на РОМ ==================================

    @Test
    public void createProgect() {
        new ProgjctPage(driver)
                .btnCreateProgect();
        driver.findElement(By.xpath("//input[@class='ant-input primaryInput  not-entered']")).sendKeys("1Новый проект");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_city']")).sendKeys("Самара");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_country']")).sendKeys("РФ");
        driver.findElement(By.xpath("//textarea[@id='CreateProjectForm_street']")).sendKeys("Победы");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_postalCode']")).sendKeys("444444");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_code']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_building']")).sendKeys("121");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_office']")).sendKeys("117");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_startDate']")).click();

        WebElement NewData = driver.findElement(By.xpath("//a[@class='ant-picker-today-btn']"));
        NewData.click();

        WebElement EndData = driver.findElement(By.xpath("//input[@id='CreateProjectForm_endDate']"));
        EndData.sendKeys("26-06-2024");
        EndData.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary ']")).click();

        driver.findElement(By.xpath("//div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line p_r']")).click();

//       кнопка отмены
//        WebElement textBoxAside = driver.findElement(By.xpath("//button[@class='Sidebar__collapsibleBtn']"));
//        textBoxAside.click();

        WebElement textSection = driver.findElement(By.xpath("//a[@style='color: inherit;'][contains(.,'Настройки')]"));
        textSection.click();

        String newProgectName = driver.findElement(NEW_PROJEСT_NAME_TEXT).getText();

        Assert.assertEquals("1Новый проект", newProgectName);

        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorRed ']")).click();
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary '][contains(.,'Подтвердить')]")).click();
    }

    @Test
    public void cancelCreateProgectTest() {
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary ']")).click();
        driver.findElement(By.xpath("//input[@class='ant-input primaryInput  not-entered']")).sendKeys("1Новый проект");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_city']")).sendKeys("Самара");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_country']")).sendKeys("РФ");
        driver.findElement(By.xpath("//textarea[@id='CreateProjectForm_street']")).sendKeys("Победы");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_postalCode']")).sendKeys("444444");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_code']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_building']")).sendKeys("121");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_office']")).sendKeys("117");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_startDate']")).click();
        driver.findElement(By.xpath("//a[@class='ant-picker-today-btn']")).click();

        WebElement EndData = driver.findElement(By.xpath("//input[@id='CreateProjectForm_endDate']"));
        EndData.sendKeys("26-06-2024");
        EndData.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default cleanButton big colorPrimary '][contains(.,'Отменить')]")).click();
    }

    @Test
    public void sidebarProgect() {
        new ProgjctPage(driver)
                .btnCreateProgect();
        driver.findElement(By.xpath("//input[@class='ant-input primaryInput  not-entered']")).sendKeys("1Новый проект");
        driver.findElement(By.xpath("//input[@id='CreateProjectForm_city']")).sendKeys("Самара");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default cleanButton big colorPrimary '][contains(.,'Отменить')]")).click();

        driver.findElement(By.xpath("//div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line p_r']")).click();
        driver.findElement(By.xpath("//button[@class='Sidebar__collapsibleBtn']")).click();

        driver.findElement(By.xpath("//div[@class='Sidebar__admin']")).click();
        driver.findElement(By.xpath("//div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line p_r']")).click();
        driver.findElement(By.xpath("//button[@class='Sidebar__collapsibleBtn']")).click();

        driver.findElement(By.xpath("//div[@class='Sidebar__project']//button[@class='ant-btn ant-btn-default iconButton small colorPrimary ']")).click();
        driver.findElement(By.xpath("//div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line p_r']")).click();
        driver.findElement(By.xpath("//div[@class='CustomLogo']")).click();
    }

    @Test
    public void removeProgect() {
//        new ProgectPage(driver)
//                .btnCreateProgect();
//        driver.findElement(By.xpath()).sendKeys("1Новый проект");
//        driver.findElement(By.xpath("//input[@id='CreateProjectForm_city']")).sendKeys("Самара");
//
//        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default cleanButton big colorPrimary '][contains(.,'Отменить')]")).click();

        driver.findElement(By.xpath("//div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line p_r']")).click();
        driver.findElement(NEW_PROJEСT_NAME_TEXT).click();
//        driver.findElement(By.xpath("//div[@class='CustomLogo']")).click();

        driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_country\"]")).sendKeys("РФ");
        driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_street\"]")).sendKeys("Победы");
        driver.findElement(By.xpath("//*[@id=\"CreateProjectForm_postalCode\"]")).sendKeys("444444");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary ']")).click();
    }

}
