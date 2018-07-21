package br.com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesafioPaladins {

	private WebDriver driver;
	private By numero1;

	public DesafioPaladins(WebDriver driver) {
		this.driver = driver;
		this.numero1 = By.id("number1");
	}

	public void abrir() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://store.steampowered.com/");
	}

	public void preencherCampo1(String nomeJogo) {
		driver.findElement(By.id("store_nav_search_term")).sendKeys(nomeJogo);
	}

	public void clicaProcurar() {
		driver.findElement(By.xpath("//*[@id=\"store_search_link\"]/img")).click();
	}
	
	public void selecinarJogo() {
		driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[3]/form/div[1]/div/div[1]/div[3]/div/div[2]/a[1]/div[2]/div[1]/span")).click();
	}
	
}
