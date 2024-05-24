package ar.soft.modelPage;

import ar.soft.modelPage.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogFilePage extends BasePage {

    public LogFilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/logfiles']")
    private WebElement btnLogFile;

    @FindBy(xpath = "//img[@src='/static/media/Basket.8774715cc0eccb962b78054dc111a9a8.svg']")
    private WebElement iconDeleteLogFile;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default cleanButton big colorPrimary ']")
    private WebElement btnCanselDeleteLogFile;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary ']")
    private WebElement btnDeleteLogFile;

    @FindBy(xpath = "//input[@id='rc_select_3']")
    private WebElement searchLogFile;

//    @FindBy(xpath = "//a[@href='/logfiles']")
//    private WebElement btnLogFile;
//
//    @FindBy(xpath = "//a[@href='/logfiles']")
//    private WebElement btnLogFile;

    public LogFilePage btnLogFile() {
        btnLogFile.click();

        return this;
    }

    public LogFilePage iconDeleteLogFile() {
        iconDeleteLogFile.click();

        return this;
    }

    public LogFilePage btnCanselDeleteLogFile() {
        btnCanselDeleteLogFile.click();

        return this;
    }

    public LogFilePage btnDeleteLogFile() {
        btnDeleteLogFile.click();

        return this;
    }

    public LogFilePage searchLogFile() {
        searchLogFile.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,
                Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

        return this;
    }

//
//    public void btnLogFile() {
//        btnLogFile.click();
//    }
//
//    public void btnLogFile() {
//        btnLogFile.click();
//    }
//
//    public void btnLogFile() {
//        btnLogFile.click();
//    }
}
