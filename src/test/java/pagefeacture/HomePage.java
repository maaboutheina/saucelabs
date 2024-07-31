package pagefeacture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addbackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addtschirt;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement panier;

    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    WebElement burger;

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    WebElement logout ;


    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void cliqueaddbackpack()
    {
        addbackpack.click();
    }
    public void cliqueaddtschirt()
    {
        addtschirt.click();
    }
    public void cliquepanier()
    {
        panier.click();
    }
    public void cliqueburger()
    {
        burger.click();
    }
    public void cliquelogout()
    {
        logout.click();
    }


}
