package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class ElementUtils {
    WebDriver driver;
    public ElementUtils(WebDriver driver){
        this.driver = driver;

    }
    public void confirmation(String lien)
    {
        String resultatattendu = lien;
        String resultaobtenu = driver.getCurrentUrl();

        Assert.assertEquals(resultatattendu,resultaobtenu);
    }
    public void cursuer( ){
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0," + 600 + ");");
    }
    public void recherche(String rech)
    {
        String pagecontent = driver.findElement(By.tagName("html")).getText();
        List<String> motrechrche = new ArrayList<>();
        motrechrche.add(rech);
        for (String mot : motrechrche) {
            if (pagecontent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            } else {
                System.out.println("le mot " + mot + " n'existe pas sur la page");
            }
        }
    }
}
