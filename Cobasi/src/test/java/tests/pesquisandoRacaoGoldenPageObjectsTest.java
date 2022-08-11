package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.PesquisarProduto;
import suporte.Web;

public class pesquisandoRacaoGoldenPageObjectsTest {
    private WebDriver navegador;
    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void pesquisarRacao(){
     new PesquisarProduto(navegador)
             .pesquisarProduto("Ração Golden Special para Cães Adultos Frango e Carne 15 kg")
             .confirmarProduto()
             .Selecionar20KG()
             .comprarEConfirmarProduto()
             .limparDoCarrinho()
             .voltarParaHome()
             .confirmarTest();

    }


    @After
    public void tearDown(){

        navegador.quit();
    }
}
