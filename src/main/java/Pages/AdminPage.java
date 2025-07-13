package Pages;

import baseclass.driverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage
{
    public AdminPage() {
        PageFactory.initElements(driverContext.Driver, this);
    }
    private @FindBy(xpath = "//span[text()='admin']")
    WebElement admin_label;
    public void NavigateToAdminPage()
    {
        admin_label.click();
    }
}
