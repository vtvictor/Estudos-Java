package BrasoftwareCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesUnitarios {
    private MetodosSimplificacao tempoPagina = new MetodosSimplificacao();
    
    public static void main(String[] args) {
        TestesUnitarios testes = new TestesUnitarios();
        testes.runTest();
    }
    
    public void runTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www2.brasoftware.com.br/cloudportal/logincontrato.aspx");
        
        WebElement campoEmail = driver.findElement(By.id("ContentPlaceHolder1_txtLogin"));
        WebElement campoSenha = driver.findElement(By.id("ContentPlaceHolder1_txtSenha"));
        WebElement botaoLogin = driver.findElement(By.id("ContentPlaceHolder1_btnlogin"));
        
        campoEmail.sendKeys("EMAIL");
        campoSenha.sendKeys("SENHA");
        botaoLogin.click();
        
        try {
            Thread.sleep(2000); // Esperar 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        WebElement quantidadeO365 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewProdutosContrato\"]/tbody/tr[1]/td[4]"));
        tempoPagina.waitFor(1000);
        WebElement quantidadeOE1 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewProdutosContrato\"]/tbody/tr[2]/td[4]"));
        tempoPagina.waitFor(1000);
        WebElement quantidadeOE3 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewProdutosContrato\"]/tbody/tr[3]/td[4]"));   
        tempoPagina.waitFor(1000);
        
        // Teste de quantidade de Licenças (STATUS ATUAL: FUNCIONANDO)
        String teste1 = quantidadeO365.getText();
        String teste2 = quantidadeOE1.getText();
        String teste3 = quantidadeOE3.getText(); 
        System.out.println("Quantidade O365: "+ teste1);
        System.out.println("Quantidade OE1: "+ teste2);
        System.out.println("Quantidade OE3: "+ teste3);
        tempoPagina.waitFor(5000);
        
        driver.quit();
    }
}
