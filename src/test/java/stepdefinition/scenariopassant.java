package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefeacture.CartPage;
import pagefeacture.HomePage;
import pagefeacture.LoginPage;
import utils.Configreader;
import utils.ElementUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class scenariopassant {
    WebDriver driver = new ChromeDriver();
    Properties prop ;
    ElementUtils methodes;
    Configreader config;
    LoginPage login;
    HomePage home;
    CartPage cart;
    @Given("Je me rends sur le site SwagLabs")
    public void je_me_rends_sur_le_site_swag_labs() {
        config = new Configreader();
        methodes = new ElementUtils(driver);
        prop = config.ConfigurationManager();
        login = new LoginPage(driver);
        home = new HomePage(driver);
        cart = new CartPage(driver);

        driver.get(config.geturl());
        driver.manage().window().maximize();
    }
    @When("Je saisie le username")
    public void je_saisie_le_username() throws InterruptedException {
        login.saisirusername(config.getusername());
        Thread.sleep(1000);
    }
    @And("Je saisie le password")
    public void je_saisie_le_password() throws InterruptedException {
        login.saisirpassword(config.getpassword());
        Thread.sleep(1000);
    }
    @And("Je clique sur le bouton Login")
    public void je_clique_sur_le_bouton_login() throws InterruptedException {
       login.cliqueloginbutton();
        Thread.sleep(1000);

    }
    @Then("La page des produit s affichent")
    public void la_page_des_produit_s_affichent() throws InterruptedException {
        methodes.confirmation("https://www.saucedemo.com/inventory.html");
        Thread.sleep(3000);
    }
    @And("Je clique sur le bouton Add to cart du produit BackPack")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_back_pack() throws InterruptedException {
        home.cliqueaddbackpack();
        Thread.sleep(1000);
    }
    @And("Je clique sur le bouton Add to cart du produit T-Shirt")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_t_shirt() throws InterruptedException {
        home.cliqueaddtschirt();
        Thread.sleep(1000);
    }
    @Then("Les produit s ajoutent dans le panier")
    public void les_produit_s_ajoutent_dans_le_panier() {
        methodes.recherche("remove");
    }
    @And("Je clique sur l icone panier")
    public void je_clique_sur_l_icone_panier() throws InterruptedException {
        methodes.cursuer();
        home.cliquepanier();
        Thread.sleep(1000);

    }
    @And("Je clique sur le bouton remove")
    public void je_clique_sur_le_bouton_remove() throws InterruptedException {
        cart.cliqueremove();
        Thread.sleep(1000);
    }
    @Then("Le produit sera supprimé du panier")
    public void le_produit_sera_supprimé_du_panier() {
      methodes.recherche("Sauce Labs Bolt T-Shirt");
    }


    @When("Je clique sur le bouton checkout")
    public void je_clique_sur_le_bouton_checkout() throws InterruptedException {
        cart.cliquecheckout();
        Thread.sleep(1000);
    }
    @And("Je rempli le username")
    public void je_rempli_le_username() throws InterruptedException {
        cart.saisirusername("boutheina");
        Thread.sleep(1000);
    }
    @And("Je saisie le lastname")
    public void je_saisie_le_lastname() throws InterruptedException {
        cart.saisirlastname("maatallah");
        Thread.sleep(1000);
    }
    @And("Je saisie le code postal")
    public void je_saisie_le_code_postal() throws InterruptedException {
        cart.saisircodepostal("5000");
        Thread.sleep(1000);
    }
    @And("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() throws InterruptedException {
        cart.cliquecontinuboutton();
        Thread.sleep(1000);
    }
    @Then("une page overview s affiche")
    public void une_page_overview_s_affiche() throws InterruptedException {
        methodes.confirmation("https://www.saucedemo.com/checkout-step-two.html");
        Thread.sleep(3000);
    }

    @When("je clique sur le bouton finish")
    public void je_clique_sur_le_bouton_finish() throws InterruptedException {
        methodes.cursuer();
        cart.cliquefinishbutton();
        Thread.sleep(1000);
    }
    @Then("une page Checkout:Complete s affiche")
    public void une_page_checkout_complete_s_affiche() throws InterruptedException {
        methodes.confirmation("https://www.saucedemo.com/checkout-complete.html");
        Thread.sleep(3000);

    }

    @When("Je clique sur le menu burger")
    public void je_clique_sur_le_menu_burger() throws InterruptedException {
        home.cliqueburger();
        Thread.sleep(1000);
    }
    @And("Je clique surle bouton Logout")
    public void je_clique_surle_bouton_logout() throws InterruptedException {
        home.cliquelogout();
        Thread.sleep(1000);
    }
    @Then("Je me redirige vers la page d authentification {string}")
    public void je_me_redirige_vers_la_page_d_authentification(String string) throws InterruptedException {
       methodes.confirmation(";https://www.saucedemo.com/");
       Thread.sleep(3000);
    }




}
