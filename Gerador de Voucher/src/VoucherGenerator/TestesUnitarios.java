package VoucherGenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import org.openqa.selenium.Keys;

public class TestesUnitarios {

	public static void main(String[] args) {
        TestesUnitarios testes = new TestesUnitarios();
        Core core = new Core();
        testes.runTest();
	}

	public void runTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("LINK");
		
		
		//Pular "Sua conexão não é particular".
		waitFor(2000);
		WebElement botaoNParticular = driver.findElement(By.id("details-button"));
		botaoNParticular.click();
		WebElement botaoIP = driver.findElement(By.id("proceed-link"));
		botaoIP.click();
		
		//Processo de login
		waitFor(2000);
		WebElement campoLogin = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/ui-view/ui-view/ui-view/div/div/div/div/div[3]/ui-view/div/form/div[1]/input"));
		WebElement campoSenha = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/ui-view/ui-view/ui-view/div/div/div/div/div[3]/ui-view/div/form/div[2]/input"));
		WebElement botaoLogin = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
		
		campoLogin.sendKeys("EMAIL");
		campoSenha.sendKeys("SENHA");
		botaoLogin.click();
		
		waitFor(5000);
		
		apagarVoucher(driver);
		

    }
	
	public static void waitFor(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public void apagarVoucher(WebDriver driver) {
	    WebElement campoVoucherBotNotes;
	    
	    try {
	        campoVoucherBotNotes = driver.findElement(By.xpath("//*[@id=\"vouchersTable\"]/thead/tr/th[1]/form/input"));
	        boolean isDisplayed = campoVoucherBotNotes.isDisplayed();
	        
	        if (isDisplayed) {
	            System.out.println("O campo campoVoucherBotNotes esta disponível na tela.");
	            campoVoucherBotNotes.click();
	            WebElement botaoRevoke = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/ui-view/ui-view/ui-view/div/div/div/ui-view/div/div[1]/div/div[2]/div[1]/div/button"));
	            botaoRevoke.click();	            
	            WebElement botaoConfirm = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[12]/div/div/div/div/div[3]/div/div[2]/div/button[2]"));
	            waitFor(2000);
	            botaoConfirm.click();
	            waitFor(2000);
	            
	        } else {
	            System.out.println("O campo campoVoucherBotNotes NAO esta disponível na tela.");
	        }
	    } catch (NoSuchElementException e) {
	        System.out.println("O campo campoVoucherBotNotes não está disponível na tela.");
	    }
	}
}

