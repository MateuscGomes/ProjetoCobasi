package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Produtopesquisado extends BasePage{


    public Produtopesquisado(WebDriver navegador) {
        super(navegador);
    }

    public referenciaDoProduto confirmarProduto(){
        navegador.findElement(By.xpath("//div[@data-testid='product-item']")).click();

        return new referenciaDoProduto(navegador);
    }
}
