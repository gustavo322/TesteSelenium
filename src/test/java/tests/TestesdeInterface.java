package tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesdeInterface {
	public String WebDriver = "C:\\Users\\User\\Desktop\\Workspace\\TesteWebMotors\\chromedriver.exe"; 
	
	@Test
	public void TesteBuscaHondaCity() {
	System.setProperty("webdriver.chrome.driver", WebDriver);
	WebDriver navegador = new ChromeDriver();
	navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	navegador.get("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
	navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small")).click();
	navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]")).click();
	navegador.findElement(By.linkText("CITY")).click();
	navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]")).click();
	navegador.findElement(By.linkText("1.5 DX 16V FLEX 4P AUTOMÁTICO")).click();	
	String filtro = navegador.findElement(By.linkText("HONDA CITY 1.5 DX 16V FLEX 4P AUTOMÁTICO")).getText();
	assertEquals(filtro, "HONDA CITY 1.5 DX 16V FLEX 4P AUTOMÁTICO");
	navegador.quit();
	

	
	}
	

		@Ignore //A loja não possui estoque para este carro no momento, quando voltar a possuir basta remover esta linha
		@Test
		public void TesteListagemdeEstoqueSemEstoqueHondaCity() {
		System.setProperty("webdriver.chrome.driver", WebDriver);
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get("https://www.webmotors.com.br/carros/estoque/?IdRevendedor=3834764&TipoVeiculo=carros&anunciante=concession%C3%A1ria%7Cloja");
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small")).click();
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]")).click();
		navegador.findElement(By.linkText("CITY")).click();
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]")).click();
		navegador.findElement(By.linkText("1.5 DX 16V FLEX 4P AUTOMÁTICO")).click();
		String filtro = navegador.findElement(By.linkText("HONDA CITY 1.5 DX 16V FLEX 4P AUTOMÁTICO")).getText();
		assertEquals(filtro, "HONDA CITY 1.5 DX 16V FLEX 4P AUTOMÁTICO");
		String filtroLoja = navegador.findElement(By.linkText("MAZOLA AUTOMOVEIS")).getText();
		assertEquals(filtroLoja, "MAZOLA AUTOMOVEIS");
		navegador.quit();

		

		
		}
		
		@Test
		public void TesteListagemdeEstoqueComEstoqueHondaHRV() {
		System.setProperty("webdriver.chrome.driver", WebDriver);
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get("https://www.webmotors.com.br/carros/estoque/?IdRevendedor=3834764&TipoVeiculo=carros&anunciante=concession%C3%A1ria%7Cloja");
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small")).click();
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]")).click();
		navegador.findElement(By.linkText("HR-V")).click();
		navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]")).click();
		navegador.findElement(By.linkText("1.8 16V FLEX EX 4P AUTOMÁTICO")).click();
		String filtro = navegador.findElement(By.linkText("HONDA HR-V 1.8 16V FLEX EX 4P AUTOMÁTICO")).getText();
		assertEquals(filtro, "HONDA HR-V 1.8 16V FLEX EX 4P AUTOMÁTICO");
		String filtroLoja = navegador.findElement(By.linkText("MAZOLA AUTOMOVEIS")).getText();
		assertEquals(filtroLoja, "MAZOLA AUTOMOVEIS");
		navegador.quit();
		

		

		
		}

}
