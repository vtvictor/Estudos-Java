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
	        
	        //Teste de quantidade de Licenças (STATUS ATUAL: FUNCIONANDO)
	        String teste1 = quantidadeO365.getText();
	        String teste2 = quantidadeOE1.getText();
	        String teste3 = quantidadeOE3.getText(); 
	        System.out.println("Quantidade O365: "+ teste1);
	        System.out.println("Quantidade OE1: "+ teste2);
	        System.out.println("Quantidade OE3: "+ teste3);
	        
	        
	        /*Acessar Link da planilha para poder atualizar:*/
	        driver.get("LINK");
	        
	        try {
	            Thread.sleep(1000); //Esperar 3 segundos
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        Actions actions = new Actions(driver);
	        

	        
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
	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.RIGHT).perform();
				tempoPagina.waitFor(1000);
				actions.sendKeys(valorQuantidadeOE1);
				System.out.println(valorQuantidadeOE1);
				actions.sendKeys(Keys.DOWN).perform();
				tempoPagina.waitFor(1000);
				actions.sendKeys(Keys.chord(teste3)).perform();
				tempoPagina.waitFor(3000);
				actions.sendKeys(Keys.ENTER).perform();
				tempoPagina.waitFor(3000);
				System.out.println(teste3);
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
	
	
	public static void moverInicio (String officee1, String officee3, String m365) {
		MetodosSimplificacao tempoPagina = new MetodosSimplificacao();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		
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
		
		//Mover ate o nome das licenças:
		//5 para baixo
		for(int count=0 ; count >5; count++){
			actions.sendKeys(Keys.DOWN).perform();
        }
		tempoPagina.waitFor(1000);
		actions.sendKeys(Keys.RIGHT).perform();
		actions.sendKeys(officee1);
		

		
	}
	
	public static void clicarLupa(String licenca) {
		
		MetodosSimplificacao tempoPagina = new MetodosSimplificacao();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement lupa = driver.findElement(By.xpath("Editing_MLR"));
		tempoPagina.waitFor(1000);
		lupa.click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		tempoPagina.waitFor(1000);
		actions.sendKeys(licenca);
		tempoPagina.waitFor(1000);
		actions.sendKeys(Keys.ENTER).perform();
		tempoPagina.waitFor(1000);
		actions.sendKeys(Keys.ENTER).perform();
		tempoPagina.waitFor(1000);
		actions.sendKeys(Keys.ESCAPE).perform();
		tempoPagina.waitFor(1000);
		actions.sendKeys(Keys.RIGHT).perform();	
		
	}
}




