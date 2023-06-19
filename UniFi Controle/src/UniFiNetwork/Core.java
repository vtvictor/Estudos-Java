package UniFiNetwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int whileCont = 0;
		
		while(whileCont==0) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("");
			
			//Pular "Sua conexão não é particular".
			waitFor(2000);
			WebElement botaoNParticular = driver.findElement(By.id("details-button"));
			botaoNParticular.click();
			WebElement botaoIP = driver.findElement(By.id("proceed-link"));
			botaoIP.click();
			
			loginSite("", "", driver);
			
			waitFor(2000);
			
			driver.get("");

			waitFor(2000);
			
			//Dados do UniFi do Atendimento:
			WebElement unifiAtendimento = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[3]/div/div/span"));
			String stringunifiAtendimento = unifiAtendimento.getText();
			
			String textoRemovido_atendimento = "AD UNIFI 06 - ";
			String resultado_atendimento = stringunifiAtendimento.replace(textoRemovido_atendimento, "");
			
			WebElement unifiAtendimento_status = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div/div/div/span"));
			String stringunifiAtendimento_status = unifiAtendimento_status.getText();
			WebElement unifiAtendimento_experience = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[8]/div/div/div/span"));
			String stringunifiAtendimento_experience = unifiAtendimento_experience.getText();

			
			//Dados do UniFi do Auditório:
			WebElement unifiAuditorio = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[2]/td[3]/div/div/span"));
			String stringunifiAuditorio = unifiAuditorio.getText();
			
			String textoRemovido_auditorio = "AD UNIFI 05 - ";
			String resultado_auditorio = stringunifiAuditorio.replace(textoRemovido_auditorio, "");
			
			WebElement unifiAuditorio_status = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[2]/td[4]/div/div/div/span"));
			String stringunifiAuditorio_status = unifiAuditorio_status.getText();
			WebElement unifiAuditorio_experience = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[2]/td[8]/div/div/div/span"));
			String stringunifiAuditorio_experience = unifiAuditorio_experience.getText();
			
			
			//Dados do UniFi da Base SE
			WebElement unifiBasese = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[3]/td[3]/div/div/span"));
			String stringunifiBasese = unifiBasese.getText();
			
			String textoRemovido_basese = "AD UNIFI 04 - ";
			String resultado_basese = stringunifiBasese.replace(textoRemovido_basese, "");
			
			WebElement unifiBasese_status = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[3]/td[4]/div/div/div/span"));
			String stringunifiBasese_status = unifiBasese_status.getText();
			WebElement unifiBasese_experience = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[3]/td[8]/div/div/div/span"));
			String stringunifiBasese_experience = unifiBasese_experience.getText();
			
			
			
			//Dados do UniFi Operacional 
			WebElement unifiOperacional = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[4]/td[3]/div/div/span"));
			String stringunifiOperacional = unifiOperacional.getText();
			
			String textoRemovido_operacional = "AD UNIFI 03 - ";
			String resultado_operacional = stringunifiOperacional.replace(textoRemovido_operacional, "");
			
			WebElement unifiOperacional_status = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[4]/td[4]/div/div/div/span"));
			String stringunifiOperacional_status = unifiOperacional_status.getText();
			WebElement unifiOperacional_experience = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[4]/td[8]/div/div/div/span"));
			String stringunifiOperacional_experience = unifiOperacional_experience.getText();
			
			
			
			
			
			
			//Exibição de dados para testes:
			System.out.println("UniFi: " +resultado_atendimento+" | Status: "+stringunifiAtendimento_status+" | Experience: "+stringunifiAtendimento_experience);
			System.out.println("UniFi: " +resultado_auditorio+" | Status: "+stringunifiAuditorio_status+" | Experience: "+stringunifiAuditorio_experience);
			System.out.println("Unifi: " +resultado_basese+ " |Status: "+stringunifiBasese_status+" | Experience: "+stringunifiBasese_experience);
			
			waitFor(5000);
		}
		
	}
	

	
	
	//Metodos
	public static void waitFor(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void loginSite(String email, String senha, WebDriver driver) {
		waitFor(2000);
		WebElement campoLogin = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/ui-view/ui-view/div/div/div/div/div[3]/ui-view/div/form/div[1]/input"));
		WebElement campoSenha = driver.findElement(By.xpath("//*[@id=\"unifi-network-app\"]/div/ui-view/ui-view/div/div/div/div/div[3]/ui-view/div/form/div[2]/input"));
		WebElement botaoLogin = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
		
		campoLogin.sendKeys(email);
		campoSenha.sendKeys(senha);
		botaoLogin.click();
		
	}

}

//teste
