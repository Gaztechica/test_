package ar.soft;

import ar.soft.modelPage.UserPage;
import ar.soft.runner.BaseTest;
//import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class UserTest extends BaseTest {

    // ================================== пользователь =====================================================

    @Test
    public void userCreateAdmin() {
        new UserPage(driver)
                .userPage()
                .createUserClick()
                .userName(UserPage.USER_NAME)
                .userLastName("Леха")
                .userEmail()
                .userEmailClick()
                .userTimezoneClick()
                .userTime()
                .userTimeEnter()
                .userRolesClick()
                .userRoles()
                .userPassword()
                .userPasswordClick()
                .buttonSave();
    }

    @Test
    public void userCreateInspektor() {
        new UserPage(driver)
                .userPage()
                .createUserClick()
                .userName(UserPage.USER_NAME)
                .userLastName("Игнат")
                .userEmail()
                .userEmailClick()
                .userTimezoneClick()
                .userTime()
                .userTimeEnter()
                .userRolesClick()
                .userRolesArron()
                .userRoles()
                .userPassword()
                .userPasswordClick()
                .buttonSave();
    }

    @Test
    public void userCreatePodraydchic() {
        new UserPage(driver)
                .userPage()
                .createUserClick()
                .userName(UserPage.USER_NAME)
                .userLastName("Kirov")
                .userEmail()
                .userEmailClick()
                .userTimezoneClick()
                .userTime()
                .userTimeEnter()
                .userRolesClick()
                .userRolesArron()
                .userRolesArron()
                .userRoles()
                .imputRolesEmplomentClick()
                .inputRolesEmplomentArro()
                .imputRolesEmplomentEnter()
                .userPassword()
                .userPasswordClick()
                .buttonDeleteClick();
    }

    @Test
    public void userCreateNabludately() {
        new UserPage(driver)
                .userPage()
                .createUserClick()
                .userName(UserPage.USER_NAME)
                .userLastName("Наблюдатель")
                .userEmail()
                .userEmailClick()
                .userTimezoneClick()
                .userTime()
                .userTimeEnter()
                .userRolesClick()
                .userRolesArron()
                .userRolesArron()
                .userRolesArron()
                .userRoles()
                .imputRolesEmplomentClick()
                .inputRolesEmplomentArro()
                .imputRolesEmplomentEnter()
                .userPassword()
                .userPasswordClick()
                .buttonDeleteClick();
    }

    @Test
    public void userCreatePodraydchiAdd() {
        new UserPage(driver)
                .userPage()
                .createUserClick()
                .userName(UserPage.USER_NAME)
                .userLastName("FamilyTest")
                .userEmail()
                .userEmailClick()
                .userTimezoneClick()
                .userTime()
                .userTimeEnter()
                .userRolesClick()
                .userRolesArron()
                .userRolesArron()
                .userRoles()
                .createRoleClick()
                .createRoleEmploment()
                .roleEmploment()
                .roleEmplomentClick()
                .userPassword()
                .userPasswordClick()
                .buttonDeleteClick();
    }

    @Test
    public void userCreateNabludatelyAdd() {
        new UserPage(driver)
                .userPage()
                .createUserClick()
                .userName(UserPage.USER_NAME)
                .userLastName("Наблюдатель")
                .userEmail()
                .userEmailClick()
                .userTimezoneClick()
                .userTime()
                .userTimeEnter()
                .userRolesClick()
                .userRolesArron()
                .userRolesArron()
                .userRolesArron()
                .userRoles()
                .createRoleClick()
                .createRoleEmploment()
                .roleEmploment()
                .roleEmplomentClick()
                .userRoles()
                .userPassword()
                .userPasswordClick()
                .buttonSave();
    }

    @Test
    public void userCreateRemove() {
        new UserPage(driver)
                .userPage()
                .createUserClick()
                .userName(UserPage.USER_NAME)
                .userLastName("FamilyTest")
                .userEmail()
                .userEmailClick()
                .userTimezoneClick()
                .userTime()
                .userTimeEnter()
                .userRolesClick()
                .userRolesArron()
                .userRolesArron()
                .userRolesArron()
                .userRoles()
                .createRoleClick()
                .createRoleEmploment()
                .roleEmploment()
                .roleEmplomentClick()
                .userRoles()
                .userPassword()
                .userPasswordClick()
                .buttonDeleteClick()
                .buttonRemove()
                .removeName()
                .userNameClear()
                .userName("РедактироваL")
                .buttonRemoCancel()
                .userNameClear()
                .userName("Отменить");
    }

    @Test
    public void userCancelDelete() {
        new UserPage(driver)
                .userPage()
                .buttonRemove()
                .userNameDel()
                .buttonRemoCancel();
    }

    @Test
    public void userInviteAdmin() {
        new UserPage(driver)
                .userPage()
                .inviteUserClick()
                .inviteUserEmail()
                .inviteRolesClick()
                .inviteRolesEnter();
    }

    @Test
    public void userInviteInspektor() {
        new UserPage(driver)
                .userPage()
                .inviteUserClick()
                .inviteUserEmail()
                .inviteRolesClick()
                .inviteRolesArron()
                .inviteRolesEnter()
                .buttonDeleteClick();
    }

    @Test
    public void userInvitePodraydchic() {
        new UserPage(driver)
                .userPage()
                .inviteUserClick()
                .inviteUserEmail()
                .inviteRolesClick()
                .inviteRolesArron()
                .inviteRolesArron()
                .inviteRolesEnter()
                .inviteRolesEmploymentClick()
                .inviteRoleEmplomentArro()
                .inviteRolesEmploymentEnter()
                .buttonDeleteClick();
    }

    @Test
    public void userInviteNabludately() {
        new UserPage(driver)
                .userPage()
                .inviteUserClick()
                .inviteUserEmail()
                .inviteRolesClick()
                .inviteRolesArron()
                .inviteRolesArron()
                .inviteRolesArron()
                .inviteRolesEnter()
                .inviteRolesEmploymentClick()
                .inviteRoleEmplomentArro()
                .inviteRolesEmploymentEnter()
                .buttonDeleteClick();
    }

    @Test
    public void userCreatePodraydchicAdd() {
        new UserPage(driver)
                .userPage()
                .inviteUserClick()
                .inviteUserEmail()
                .inviteRolesClick()
                .inviteRolesArron()
                .inviteRolesArron()
                .inviteRolesEnter()
                .inviteRolesEmploymentClick()
                .createRoleClick()
                .createRolesEmplomentClick()
                .createRolesEmplomentSent()
                .inviteRoleEmplomentEnter()
                .buttonDeleteClick();
    }

    @Test
    public void userCreaNabludatelyAdd() {
        new UserPage(driver)
                .userPage()
                .inviteUserClick()
                .inviteUserEmail()
                .inviteRolesClick()
                .inviteRolesArron()
                .inviteRolesArron()
                .inviteRolesArron()
                .inviteRolesEnter()
                .inviteRolesEmploymentClick()
                .createRoleClick()
                .createRolesEmplomentClick()
                .createRolesEmplomentSent()
                .inviteRoleEmplomentEnter()
                .buttonDeleteClick();
    }

    @Test
    public void userSearchTest() {
        new UserPage(driver)
                .userPage()
                .searchInputClick()
                .searchClick()
                .searchInputSent("Леха")

                .searchInputDelete()
                .searchInputSent("Игнат")

                .searchInputDelete()
                .searchInputSent("Kirov")

                .searchInputDelete()
                .searchInputSent("Наблюдатель")

                .searchInputDelete()
                .searchInputSent("ye2vtcmvg@mail.ru")

                .searchInputDelete();

    }



    @DataProvider(name = "userAddProvider")
    public Object[][] userAddProvider() {
        return new Object[][]{
                {"Gleb", "Password", "Full name", "E-mail@com"},
                {"Ignat", "Password", "Full name", "E-mail@com"},
                {"Lion", "Password", "Full name", "E-mail@com"},
                {"Oleg", "Password", "Full name", "E-mail@com"},
                {"Den", "Password", "Full name", "E-mail@com"},
        };
    }

    @Test(dataProvider = "userAddProvider")
    public void testCheckPeople(String Username, String Password, String Fullname, String Email) {

    }
}
