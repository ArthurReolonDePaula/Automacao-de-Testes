package br.com.util;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Utils {
	public static String nomeReduzidoUser(String nomeUsuario){
		if (nomeUsuario.length()>12){
			nomeUsuario= nomeUsuario.substring(0, 9);
			nomeUsuario= nomeUsuario+"...";
			nomeUsuario= nomeUsuario.replace("  ", " ");
		}
		return nomeUsuario;
	}
	public static void setaCampo(By locator, String texto, WebDriver driver){
		driver.findElement(locator).click();
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(texto);
		driver.findElement(locator).sendKeys(Keys.TAB);
	}
	public static void setaQtdsLindaoImv(By locator, String texto , WebDriver driver){
		driver.findElement(locator).click();
		driver.findElement(locator).sendKeys(texto);
		driver.findElement(locator).sendKeys(Keys.TAB);
	}
	public static void setaLindaoMultiplo (By locator, String texto, WebDriver driver){
		driver.findElement(locator).click();
		driver.findElement(locator).sendKeys(texto);
		driver.findElement(locator).sendKeys(Keys.ENTER);
		driver.findElement(locator).sendKeys(Keys.TAB);
	}
	public static void setaLindaoEnter(By locator, By locatorlink, String texto, WebDriver driver){
		driver.findElement(locator).click();
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(texto);
		driver.findElement(locatorlink).click();
	}
	
	public static WebElement fluentWait(final By locator, final WebDriver driver) {
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(10, TimeUnit.SECONDS)
	            .pollingEvery(50, TimeUnit.MILLISECONDS)
	            .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	            return driver.findElement(locator);
	        }
	    });

	    return  foo;
	};
}
