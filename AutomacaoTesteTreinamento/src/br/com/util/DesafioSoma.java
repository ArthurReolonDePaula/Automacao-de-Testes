package br.com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesafioSoma {

	private WebDriver driver;
	private By numero1;

	public DesafioSoma(WebDriver driver) {
		this.driver = driver;
		this.numero1 = By.id("number1");
	}

	public void abrir() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://treinoautomacao.hol.es/desafiosoma.html");
	}

	public void preencherCampo1(String valor) {
		driver.findElement(By.id("number1")).sendKeys(valor);
	}

	public void preencherCampo2(String valor) {
		driver.findElement(By.id("number2")).sendKeys(valor);
	}

	public void clicaSomar() {
		driver.findElement(By.id("somar")).click();
	}
	
	public void clicarSubtrair() {
		driver.findElement(By.id("subtrair")).click();
	}
	
	public void clicarMultiplicar() {
		driver.findElement(By.id("multiplicar")).click();
	}
	
	public void clicarDividir() {
		driver.findElement(By.id("dividir")).click();
	}

}
