package br.com.util.test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.exec.ExecuteException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.util.Browser;
import br.com.util.DesafioSoma;

public class SomaTest extends Browser{
	private WebDriver driver;
	private Browser browser = new Browser();
	
	
	@Before
	public void setUp() throws Exception {
		this.driver = this.browser.firefoxBrowsing();
	}
	
	@Test
	public void deveSomarValores() {
		DesafioSoma desafio = new DesafioSoma(driver);
		try {
			desafio.abrir();
		} catch(Exception e) {
			e.printStackTrace();
		}
		desafio.preencherCampo1("2");
		desafio.preencherCampo2("4");
		desafio.clicaSomar();
		
		assertEquals("6", driver.findElement(By.id("total")).getAttribute("value"));
	}
	
	@Test
	public void deveSubtrairValores() {
		DesafioSoma desafio = new DesafioSoma(driver);
		try {
			desafio.abrir();
		}catch(Exception e) {
			e.printStackTrace();
		}
		desafio.preencherCampo1("10");
		desafio.preencherCampo2("5");
		desafio.clicarSubtrair();
		
		assertEquals("5", driver.findElement(By.id("total")).getAttribute("value"));
	}
	
	@Test
	public void deveMultiplicarValores() {
		DesafioSoma desafio = new DesafioSoma(driver);
		try {
			desafio.abrir();
		}catch(Exception e) {
			e.printStackTrace();
		}
		desafio.preencherCampo1("100");
		desafio.preencherCampo2("2");
		desafio.clicarMultiplicar();
		
		assertEquals("200", driver.findElement(By.id("total")).getAttribute("value"));
	}
	
	@Test
	public void deveDividirValores() {
		DesafioSoma desafio = new DesafioSoma(driver);
		try{
			desafio.abrir();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	desafio.preencherCampo1("100");
	desafio.preencherCampo2("2");
	desafio.clicarDividir();
	
	assertEquals("50", driver.findElement(By.id("total")).getAttribute("value"));
	
//	@After
//	public void tearDown() {
//		this.driver.close();
//	}

}
}
