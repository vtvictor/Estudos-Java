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
			
		
		//campoEmail.sendKeys("EMAIL");


	}
	
	public static void waitFor(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

}
