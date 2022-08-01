package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mateu\\drivers\\102\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Logar na pagina inicial da Cobasi
        navegador.get("https://www.cobasi.com.br");

        return navegador;
    }
}
