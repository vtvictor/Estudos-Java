package VoucherGenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.time.LocalTime;

public class Core {

	public static void main(String[] args) {
		
		LocalTime horarioAtual = LocalTime.now();
		
		System.out.println("Hora atual teste: " + horarioAtual);
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		while (true) {
			TestesUnitarios testesUnitarios = new TestesUnitarios();
			horarioAtual = LocalTime.now();
			System.out.println("Hora atual teste: " + horarioAtual);
			//Verificar se é 06:00 da manhã
			if(horarioAtual.getHour() == 06 && horarioAtual.getMinute() == 00) {
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
						
				campoLogin.sendKeys("");
				campoSenha.sendKeys("");
				waitFor(2000);
				botaoLogin.submit();
		
				waitFor(4000);				

				apagarVoucher(driver);
				
				waitFor(6000);
				
				gerarVoucher(driver);
				
				waitFor(4000);

				copiarVoucher(driver);
				
			}else {
				System.out.println("O novo voucher sera gerado as 06:00 da manha");
				waitFor(10000);
			}
			
		}
		
		
		
		
	}
	
	
	//Metodos:
	
	public static void waitFor(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void gerarVoucher(WebDriver driver) {
		waitFor(2000);
		WebElement botaoCreateVouchers = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/ui-view/ui-view/ui-view/div/div/div/ui-view/div/div[1]/div/div[1]/div/button[1]/span[2]"));
		botaoCreateVouchers.click();
		WebElement campoQuantidade = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[63]/div/div/div/form/div[2]/div/div/div[1]/div/div/input"));
		campoQuantidade.clear();
		campoQuantidade.sendKeys("1");
		WebElement campoQuota = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[63]/div/div/div/form/div[2]/div/div/div[2]/div/div[1]/select"));
		campoQuota.click();
		waitFor(2000);
		WebElement campoQuotaUnlimited = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[63]/div/div/div/form/div[2]/div/div/div[2]/div/div[1]/select/option[4]"));
		campoQuotaUnlimited.click();
		WebElement campoExpirationTime = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[63]/div/div/div/form/div[2]/div/div/div[3]/div/div[1]/select"));
		campoExpirationTime.click();
		WebElement campoExpirationTime8H = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[63]/div/div/div/form/div[2]/div/div/div[3]/div/div[1]/select/option[2]"));
		campoExpirationTime8H.click();		
		WebElement campoNotes = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[63]/div/div/div/form/div[2]/div/div/div[7]/div/input"));
		campoNotes.sendKeys("Voucher Bot");
		WebElement botaoSave = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[63]/div/div/div/form/div[3]/div/div/div/button[2]/div"));
		botaoSave.click();
	}

	public static void apagarVoucher(WebDriver driver) {
	    WebElement campoVoucherBotNotes;
	    
	    try {
	        campoVoucherBotNotes = driver.findElement(By.xpath("//*[@id=\"vouchersTable\"]/thead/tr/th[1]/form/input"));
	        boolean isDisplayed = campoVoucherBotNotes.isDisplayed();
	        
	        if (isDisplayed) {
	        	waitFor(2000);
	            System.out.println("O campo campoVoucherBotNotes esta disponível na tela.");
	            campoVoucherBotNotes.click();
	            WebElement botaoRevoke = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/ui-view/ui-view/ui-view/div/div/div/ui-view/div/div[1]/div/div[2]/div[1]/div/button"));
	            botaoRevoke.click();	            
	            WebElement botaoConfirm = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/div[3]/div[12]/div/div/div/div/div[3]/div/div[2]/div/button[2]"));
	            waitFor(2000);
	            botaoConfirm.click();
	            waitFor(2000);
	            
	        } else {
	            System.out.println("O campo campoVoucherBotNotes NAO esta disponivel na tela.");
	        }
	    } catch (NoSuchElementException e) {
	        System.out.println("O campo campoVoucherBotNotes NAO esta disponivel na tela.");
	    }
	}
	
	public static void copiarVoucher(WebDriver driver) {
		waitFor(3000);

		
		WebElement campoCodeVoucher = driver.findElement(By.xpath("//*[@id=\"vouchersTable\"]/tbody/tr/td[2]"));
		boolean isDisplayed = campoCodeVoucher.isDisplayed();
		
		try {
			if (isDisplayed) {
				waitFor(2000);
				String CodigoVoucher = campoCodeVoucher.getText();
				System.out.println("Voucher: "+CodigoVoucher);
				
				driver.get("https://adpromotora.com.br/wifi//voucher.php");
				
				WebElement campoSenha_SiteAD = driver.findElement(By.xpath("/html/body/center[2]/span/center/form/input"));
				campoSenha_SiteAD.sendKeys("ad2023");
			
				WebElement botaoLogin_SiteAD = driver.findElement(By.xpath("/html/body/center[2]/span/center/form/button"));
				botaoLogin_SiteAD.submit();
				
				waitFor(2000);
				
				WebElement campoInserirSenha_SiteAD = driver.findElement(By.xpath("/html/body/center[2]/span/center/form/input"));
				campoInserirSenha_SiteAD.sendKeys(CodigoVoucher);
				
				WebElement botaoInserir_SiteAD = driver.findElement(By.xpath("/html/body/center[2]/span/center/form/button"));
				botaoInserir_SiteAD.click();
				
				
			}else {
				System.out.println("Codigo do Voucher NAO existe!");
			}
			
		} catch (NoSuchElementException e) {
			System.out.print("Codigo do Voucher NAO existe!");
		}
	}
		
	
}