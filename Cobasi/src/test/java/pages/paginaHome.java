package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class paginaHome extends BasePage {


    public paginaHome(WebDriver navegador) {
        super(navegador);
    }

    public paginaHome confirmarTest(){
        Assert.assertEquals("Cobasi | A maior e melhor pet shop do Brasil", navegador.getTitle());

        return this;
    }
}
