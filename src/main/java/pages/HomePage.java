package pages;

import modules.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

//    public WebElement signInBtn = webDriver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[3]"));
    @FindBy (xpath = "//*[@id=\"login\"]/form/div[3]/input[3]")
    protected WebElement signinBtn;
    @FindBy (xpath = "//*[@id=\"login_field\"]")
    protected WebElement emailField;
    @FindBy (xpath = "//*[@id=\"password\"]")
    protected WebElement passwordField;

    @FindBy (xpath = "//*[@id=\"user-links\"]/li[2]/details/summary")
    protected WebElement option1;
    @FindBy (xpath = "//*[@id=\"user-links\"]/li[2]/details/details-menu/a[3]")
    protected WebElement newGistBtn;

    @FindBy (xpath = "//*[@id=\"gists\"]/div[2]/div/div[1]/div[1]/input[2]")
    protected WebElement gistNameField;
    @FindBy (className = "CodeMirror-line")
    protected WebElement gistDesc;
    @FindBy (xpath = "//*[@id=\"new_gist\"]/div/div[2]/button[1]")
    protected WebElement submitGistBtn;

    @FindBy (xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[1]/a")
    protected WebElement editGistBtn;
    @FindBy(xpath = "//*[@id=\"edit_gist_93374752\"]/div/div[2]/button")
    protected WebElement updatePublicGistBtn;

    @FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[2]/form/button")
    protected WebElement deleteGistBtn;
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    protected WebElement okPopupBtn;

    @FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/h1/span[1]/a/span")
    protected WebElement usernameGist;
    @FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[2]/div[1]")
    protected WebElement listGist;

//    ===================

    public void clickSignInBtn() {
        inputTextToElement(emailField, "pandubuana23@gmail.com");
        inputTextToElement(passwordField, "December13thh");
        isElementPresentVerifyclick(signinBtn);
    }

    public void clickOption1() {
        isElementPresentVerifyclick(option1);
    }
    public void clickNewGist() {
        isElementPresentVerifyclick(newGistBtn);
    }
    public void inputNewGistField() {
        inputTextToElement(gistNameField, "TestGist");
    }
    public void inputUpdateNewGistField() {
        waitFor(2);
        isElementPresentVerifyclick(gistNameField);
        inputTextToElement(gistNameField, "TestGist Update");
    }
    public void clickNewGistBtn() {
        isElementPresentVerifyclick(newGistBtn);
    }
    public void inputGistDesc() {
        waitFor(2);
        inputTextToElement(gistDesc, "tester Gist 1");
    }
    public void clickSubmitGistBtn() {
        isElementPresentVerifyclick(submitGistBtn);
    }
    public void clickEditGistBtn() {
        isElementPresentVerifyclick(editGistBtn);
    }
    public void clickUpdateGistBtn() {
        isElementPresentVerifyclick(updatePublicGistBtn);
    }
    public void clickDeleteGistBtn() {
        isElementPresentVerifyclick(deleteGistBtn);
        isElementPresentVerifyclick(okPopupBtn);
    }
    public void clickUsernameGist() {
        isElementPresentVerifyclick(usernameGist);
        isElementPresentVerifyclick(listGist);
    }


}
