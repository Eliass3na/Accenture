package automacaoAccenture;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Metodos {

	WebDriver driver;

	public void abrirBrowser(String url, String navegador) {

		if (navegador == "CHROME") {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else if (navegador == "FIREFOX") {

			System.setProperty("webdriver.gecko.driver", "./Driver.geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else {

			System.out.println("Escolha CHROME OU FIREFOX");

		}

	}

	public void trocarAbas(By elemento) {

		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowsHanles = driver.getWindowHandles();

		Iterator<String> iterator = allWindowsHanles.iterator();

		while (iterator.hasNext()) {

			String ChildWindow = iterator.next();

			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {

				driver.switchTo().window(ChildWindow);

				WebElement texto = driver.findElement(elemento);
				System.out.println(texto.getText());
			}

		}

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void fechar() {
		driver.quit();
	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}
	public void selecionarCombo(By elemento, String value) {
		
		WebElement element = driver.findElement(elemento);
		Select combo = new Select(element);
		combo.selectByValue(value);
	}
	public void pausa (long time) throws InterruptedException {
		
		Thread.sleep(time);
		
		
	}
public void selecionarComboMultiplo(By elemento, String value) {
		
		WebElement element = driver.findElement(elemento);
		Select combo = new Select(element);
		combo.selectByValue(value);
		combo.selectByValue(value);
		combo.selectByValue(value);
}
public void selecionarComboVisibletext(By elemento, String value) {
	
	WebElement element = driver.findElement(elemento);
	Select combo = new Select(element);
	combo.selectByVisibleText(value);
}
public void validarTexto(String texto, By elemento) {
	String txt = driver.findElement(elemento).getText();
	assertEquals(texto, txt);
}
}