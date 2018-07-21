package br.com.util.test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.exec.ExecuteException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.util.Browser;
import br.com.util.DesafioPaladins;

public class PaladinsTest extends Browser{
	private WebDriver driver;
	private Browser browser = new Browser();
	
	
	@Before
	public void setUp() throws Exception {
		this.driver = this.browser.firefoxBrowsing();
	}
	
	@Test
	public void devePesquisarNomeDoGame() {
		DesafioPaladins desafio = new DesafioPaladins(driver);
		try {
			desafio.abrir();
		} catch(Exception e) {
			e.printStackTrace();
		}
		desafio.preencherCampo1("paladins");
		desafio.clicaProcurar();
		desafio.selecinarJogo();
		
		assertEquals("Paladins®", driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[2]/div/div[3]")).getText());
	}
	
	
//	@After
//	public void tearDown() {
//		this.driver.close();
//	}

}

