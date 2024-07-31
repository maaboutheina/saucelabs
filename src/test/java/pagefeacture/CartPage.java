package pagefeacture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement remove;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement checkout;

    @FindBy(id= "first-name")
    WebElement username;

    @FindBy(id= "last-name")
    WebElement lastname;

    @FindBy(id= "postal-code")
    WebElement codepostal;

    @FindBy(id= "continue")
    WebElement continuboutton;

    @FindBy(id= "finish")
    WebElement finishbutton;

    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void cliqueremove()
    {
        remove.click();
    }
    public void cliquecheckout()
    {
        checkout.click();
    }
    public void cliquecontinuboutton()
    {
        continuboutton.click();
    }
    public void cliquefinishbutton()
    {
        finishbutton.click();
    }
    public void saisirusername(String usn)
    {
        username.sendKeys(usn);
    }
    public void saisirlastname(String lsn)
    {
        lastname.sendKeys(lsn);
    }
    public void saisircodepostal(String cp)
    {
        codepostal.sendKeys(cp);
    }

}
