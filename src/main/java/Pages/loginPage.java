package Pages;

import baseclass.driverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage
{
    public loginPage() {
        PageFactory.initElements(driverContext.Driver, this);
    }
    private @FindBy(xpath = "//input[@name='username']")
    WebElement username_field;
    private @FindBy(xpath = "//input[@name='password']")
    WebElement password_field;
    private @FindBy(xpath = "//button[@type='submit']")
    WebElement login_button;
    public void performLogin(String username, String password) throws InterruptedException {
        Thread.sleep(10000);
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        login_button.click();
    }
    public String verifytitle()
    {
       return driverContext.Driver.getTitle();
    }
}

