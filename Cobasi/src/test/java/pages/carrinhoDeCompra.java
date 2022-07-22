package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class carrinhoDeCompra extends BasePage {

    public carrinhoDeCompra(WebDriver navegador) {
        super(navegador);
    }

    public carrinhoDeCompra limparDoCarrinho(){
        navegador.findElement(By.linkText("Limpar Carrinho")).click();

        return this;
    }

    public paginaHome voltarParaHome(){
        navegador.findElement(By.xpath("//img[@class='styles__Logo-sc-1x0mfb3-1 jHguGO']")).click();

        return new paginaHome(navegador);
    }
}
