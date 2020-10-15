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
	navegador.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small")).click();;
	
	}

}
