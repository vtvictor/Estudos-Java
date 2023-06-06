package UniFiNetwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(");
		
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
		WebElement unifiAtendimento_status = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div/div/div/span"));
		String stringunifiAtendimento_status = unifiAtendimento_status.getText();
		WebElement unifiAtendimento_experience = driver.findElement(By.xpath("//*[@id=\"app-main-panel\"]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[8]/div/div/div/span"));
		String stringunifiAtendimento_experience = unifiAtendimento_experience.getText();
		
		
		
		System.out.println(stringunifiAtendimento+" | Status: "+stringunifiAtendimento_status+" | Experience: "+stringunifiAtendimento_experience);
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
