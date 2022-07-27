package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class referenciaDoProduto extends BasePage {


    public referenciaDoProduto(WebDriver navegador) {
        super(navegador);
    }

    public referenciaDoProduto Selecionar20KG(){
        navegador.findElement(By.xpath("//span[text()='20 kg']")).click();

        return this;
    }

    public referenciaDoProduto clicarComprar(){
        navegador.findElement(By.xpath("//button[text()='Adicionar ao carrinho']"));
        WebElement botaoComprar = navegador.findElement(By.xpath("//button[text()='Adicionar ao carrinho']"));
        botaoComprar.click();

        return this;
    }

    public carrinhoDeCompra confirmarCompra(){
        WebDriverWait caixaComprar = new WebDriverWait(navegador, Duration.ofSeconds(30));
        caixaComprar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='styles__wrap-sc-yb2pa1-6 hgcfNY']")));
        navegador.findElement(By.linkText("Ir para o carrinho")).click();

        return new carrinhoDeCompra(navegador);
    }

    public carrinhoDeCompra comprarEConfirmarProduto(){
        clicarComprar();
        confirmarCompra();

        return new carrinhoDeCompra(navegador);

    }
}
