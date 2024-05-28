package ar.soft;

import ar.soft.modelPage.UserSidebarPage;
import ar.soft.runner.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class UserSidebarTest extends BaseTest {

    @Test
    public void addUserTest() {
        new UserSidebarPage(getDriver())
                .progect()
                .userSidebarClick()
                .btnAddUser()
                .btnCheckboxUserClick();
    }

    @Test
    public void deleteUserTest() {
        driver.findElement(By.xpath("//div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line p_r'][contains(.,'1Новый проект')]")).click();
        driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][contains(.,'Пользователи')]")).click();
        driver.findElement(By.xpath("//td[@class='ant-table-cell'][contains(.,'a123EvgenTest')]")).click();

        driver.findElement(By.xpath("//div[@class='ContentProjectUsers__iconBlock']")).click();

        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary '][contains(.,'Подтвердить')]")).click();

    }

    @Test
    public void cancelDeleteUserTest() {
        driver.findElement(By.xpath("//div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line p_r'][contains(.,'1Новый проект')]")).click();
        driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][contains(.,'Пользователи')]")).click();
        driver.findElement(By.xpath("//td[@class='ant-table-cell'][contains(.,'a123EvgenTest')]")).click();

        driver.findElement(By.xpath("//div[@class='ContentProjectUsers__iconBlock']")).click();

        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default cleanButton big colorPrimary '][contains(.,'Отменить')]")).click();

    }
}
