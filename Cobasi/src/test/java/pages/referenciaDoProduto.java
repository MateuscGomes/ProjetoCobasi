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
        WebDriverWait botao2 = new WebDriverWait(navegador, Duration.ofSeconds(10));
        botao2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Adicionar ao carrinho']")));
        navegador.findElement(By.xpath("//button[text()='Adicionar ao carrinho']")).click();

        return this;
    }

    public carrinhoDeCompra confirmarCompra(){
        WebDriverWait caixaComprar = new WebDriverWait(navegador, Duration.ofSeconds(30));
        caixaComprar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='styles__CardTitle-sc-fbi3ap-2 lhvaqQ']")));
        navegador.findElement(By.linkText("Ir para o carrinho")).click();

        return new carrinhoDeCompra(navegador);
    }

    public carrinhoDeCompra comprarEConfirmarProduto(){
        clicarComprar();
        confirmarCompra();

        return new carrinhoDeCompra(navegador);

    }
}
