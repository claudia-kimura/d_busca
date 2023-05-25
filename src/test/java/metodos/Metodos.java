package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos {

	WebDriver driver;

	public void iniciarTeste() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.drogasil.com.br/");

	}

	public void finalizarTeste() {
		driver.quit();
	}
	

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
			
	}
	
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
	
	public void clear(By elemento) {
		driver.findElement(elemento).clear();
		
	}
	
	public void evidencia(String nomeEvidencia) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot)driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/"+nomeEvidencia+".png");
		FileUtils.copyFile(srcFile, destFile);
	}

}