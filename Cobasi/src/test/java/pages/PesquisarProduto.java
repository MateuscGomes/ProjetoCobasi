package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PesquisarProduto extends BasePage {


    public PesquisarProduto(WebDriver navegador) {
        super(navegador);
    }

    public Produtopesquisado pesquisarProduto(String produto){
        navegador.findElement(By.xpath("//input[@class='fulltext-search-box ui-autocomplete-input neemu-search-field']")).sendKeys(produto);
        navegador.findElement(By.className("btn-buscar")).click();

        return new Produtopesquisado(navegador);

    }
}
