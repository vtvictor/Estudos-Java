package BrasoftwareCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class Core {

	public static void main(String[] args) {
		
		int whileCont = 0;
        int numero = 0;
		
		while (whileCont ==0) {
			MetodosSimplificacao tempoPagina = new MetodosSimplificacao();
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www2.brasoftware.com.br/cloudportal/logincontrato.aspx");
			
			//Armazenando dados dos campos de digitar o Email, Senha e login.
			WebElement campoEmail = driver.findElement(By.id("ContentPlaceHolder1_txtLogin"));
			WebElement campoSenha = driver.findElement(By.id("ContentPlaceHolder1_txtSenha"));
			WebElement botaoLogin = driver.findElement(By.id("ContentPlaceHolder1_btnlogin"));
			
			campoEmail.sendKeys("EMAIL");
			campoSenha.sendKeys("SENHA");
			botaoLogin.click();
			
	        try {
	            Thread.sleep(2000); //Esperar 2 segundos
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        //Armazenando dados em variaveis referente a quantidade de licenças.
	        WebElement quantidadeO365 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewProdutosContrato\"]/tbody/tr[1]/td[4]"));
	        String valorQuantidadeO365 = quantidadeO365.getText();
			tempoPagina.waitFor(1000);
	        WebElement quantidadeOE1 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewProdutosContrato\"]/tbody/tr[2]/td[4]"));
	        String valorQuantidadeOE1 = quantidadeOE1.getText();
			tempoPagina.waitFor(1000);
	        WebElement quantidadeOE3 = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewProdutosContrato\"]/tbody/tr[3]/td[4]"));
	        String valorQuantidadeOE3 = quantidadeOE3.getText();    
			tempoPagina.waitFor(1000);
	        
	        try {
	            Thread.sleep(2000); //Esperar 2 segundos
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        
	        //Acessar Link da planilha para poder atualizar:
	        driver.get("LINK DA PLANILHA");
	        
	        try {
	            Thread.sleep(1000); //Esperar 3 segundos
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        Actions actions = new Actions(driver);

	        moverInicio(actions);
	         
	        //Maneira utilizda para burlar sistema do Office online.
	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.RIGHT).perform();
				tempoPagina.waitFor(1000);
				actions.sendKeys(valorQuantidadeOE1);
				System.out.println(valorQuantidadeOE1);
				actions.sendKeys(Keys.DOWN).perform();
				tempoPagina.waitFor(1000);
				
				//Keys.chord foi uma maneira utilizada para conseguir digitar na planilha online.
				actions.sendKeys(Keys.chord(valorQuantidadeOE3)).perform();
				tempoPagina.waitFor(3000);
				actions.sendKeys(Keys.ENTER).perform();
				tempoPagina.waitFor(3000);
				System.out.println(valorQuantidadeOE3);
				numero = numero + 1;
				driver.quit();
	            
	        } else {
	            System.out.println("O número é ímpar.");
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.RIGHT).perform();
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.DOWN).perform();
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.DOWN).perform();
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.chord(valorQuantidadeO365)).perform();
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.ENTER).perform();
				tempoPagina.waitFor(3000);
				System.out.println(valorQuantidadeO365);
				numero = numero + 1;	
				driver.quit();
	            
	        }
	        
			driver.quit();
		}
		
		
       

	}
	
	//Metodo utilizado para poder percorrer sempre a planilha, devido ao fato que o não é possível fazer requisição via inspecionar elemento.
	public static void moverInicio(Actions actions) {
		
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
    }
	
}




