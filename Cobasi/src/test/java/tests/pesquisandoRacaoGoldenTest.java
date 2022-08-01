package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.http.UrlPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class pesquisandoRacaoGoldenTest {
    private WebDriver navegador;

    @Before
    public void cobasiHome() {
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mateu\\drivers\\102\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Logar na pagina inicial da Cobasi
        navegador.get("https://www.cobasi.com.br");

    }
    @Test
    public void pesquisarRacao() {
        // Selecionar a barra de pesquisa com id "chaordic-remote-collect" e buscar ração
         navegador.findElement(By.xpath("//input[@class='fulltext-search-box ui-autocomplete-input neemu-search-field']")).sendKeys("Ração Golden Special para Cães Adultos Frango e Carne 15 kg");

        // Clicar no botão buscar com class "btn-buscar"
        navegador.findElement(By.className("btn-buscar")).click();

        // Selecionar a ração "Ração Golden Special para Cães Adultos Frango e Carne 15 kg" com a XPATH "//div[@class='styles__ProductItem-sc-1ac06td-1 iVQkzc']"
        navegador.findElement(By.xpath("//div[@class='styles__ProductItem-sc-1ac06td-1 iVQkzc']")).click();

        // Selecionar ração de 20Kg com XPATH "//span[text()='20 kg']"
        navegador.findElement(By.xpath("//span[text()='20 kg']")).click();

        // Clicar no campo comprar com XPATH "//button[text()='Adicionar ao carrinho']"
        navegador.findElement(By.xpath("//button[text()='Adicionar ao carrinho']"));
        WebElement botaoComprar = navegador.findElement(By.xpath("//button[text()='Adicionar ao carrinho']"));
        botaoComprar.click();

        // Reconhecer Box-modal
        WebDriverWait caixaComprar = new WebDriverWait(navegador, Duration.ofSeconds(20));
        caixaComprar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='styles__wrap-sc-yb2pa1-6 hgcfNY']")));

        // Clicar no link com o campo "Finalizar Compra"
        navegador.findElement(By.linkText("Ir para o carrinho")).click();

        // Clicar no link com o campo "Limpar Carrinho"
        navegador.findElement(By.linkText("Limpar Carrinho")).click();

        // Clicar no XPATH "//img[@class='styles__Logo-sc-1x0mfb3-1 jHguGO']" para retornar a página inicial.
        navegador.findElement(By.xpath("//img[@class='styles__Logo-sc-1x0mfb3-1 jHguGO']")).click();

        // Validar com a aba do site descrito "Cobasi | A maior e melhor pet shop do Brasil"
        Assert.assertEquals("Cobasi | A maior e melhor pet shop do Brasil", navegador.getTitle());




    }

    @After
    public void tearDown(){

        navegador.quit();
    }
}
