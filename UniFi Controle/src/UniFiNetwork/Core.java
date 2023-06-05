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
		
		driver.get("");
		
		//Pular "Sua conexão não é particular".
		waitFor(2000);
		WebElement botaoNParticular = driver.findElement(By.id("details-button"));
		botaoNParticular.click();
		WebElement botaoIP = driver.findElement(By.id("proceed-link"));
		botaoIP.click();
		//
		
		loginSite("", "", driver);
		
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
