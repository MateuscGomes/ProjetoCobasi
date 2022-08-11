package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Produtopesquisado extends BasePage{


    public Produtopesquisado(WebDriver navegador) {
        super(navegador);
    }

    public referenciaDoProduto confirmarProduto(){
        navegador.findElement(By.xpath("//div[@class='MuiGrid-root ProductListItem MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-4']")).click();

        return new referenciaDoProduto(navegador);
    }
}
