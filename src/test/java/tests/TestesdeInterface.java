package tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesdeInterface {
	
	@Test
	public void Teste001() {
	System.setProperty("webdriver.chrome.driver", "D:\\DEV2\\Workspace\\chromedriver.exe");
	WebDriver navegador = new ChromeDriver();
	navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	navegador.get("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
	navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small")).click();
	navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]")).click();
	navegador.findElement(By.linkText("CITY")).click();
	navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]")).click();
	navegador.findElement(By.linkText("1.5 DX 16V FLEX 4P AUTOMÁTICO")).click();	
	
	

	
	}
	

		
		@Test
		public void Teste002() {
		System.setProperty("webdriver.chrome.driver", "D:\\DEV2\\Workspace\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get("https://www.webmotors.com.br/carros/estoque/?IdRevendedor=3834764&TipoVeiculo=carros&anunciante=concession%C3%A1ria%7Cloja");
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small")).click();
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]")).click();
		navegador.findElement(By.linkText("CITY")).click();
		
		

		
		}

}
