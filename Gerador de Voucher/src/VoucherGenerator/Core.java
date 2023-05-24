package VoucherGenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class Core {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://172.16.10.8:8443/manage/hotspot-manager/site/default/vouchers/1/50");
		
		
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
		
		campoLogin.sendKeys("victor.silva@adpromotora.com.br");
		campoSenha.sendKeys("V991218204@");
		botaoLogin.click();
		
		//Gerar o Voucher
		gerarVoucher(driver);
	}
	
	public static void waitFor(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void gerarVoucher(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
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

}
