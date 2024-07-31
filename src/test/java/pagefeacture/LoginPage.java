package pagefeacture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id ="user-name")
    WebElement username;
    @FindBy(id ="password")
    WebElement password;
    @FindBy(id ="login-button")
    WebElement loginbutton;

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void saisirusername(String un)
    {
       username.sendKeys(un);
    }
    public void saisirpassword(String pwd)
    {
        password.sendKeys(pwd);
    }
    public void cliqueloginbutton()
    {
        loginbutton.click();
    }


}
