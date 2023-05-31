package com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class OPPropiasRessarcimentosEditarPO extends TestBase{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Op. Próprias e Ressarcimentos\"]")
	public WebElement opProprias;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[contains(@id,\"start\")]/div/div/input")
	public WebElement dataInicioVigencia;
	
	public OPPropiasRessarcimentosEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		opProprias.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		String idRegistro = 	idObter("OPPropiasRessarcimentos");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		String dataInicioVigenciaValorNuevo = fechaAyer();
		System.out.println("Data a ser inserida: " +dataInicioVigenciaValorNuevo);
	
		dataInicioVigencia.clear(); // Limpio la fecha actual que tiene guardada
		dataInicioVigencia.sendKeys(dataInicioVigenciaValorNuevo); // Le envio la nueva fecha a editar	
		System.out.println(dataInicioVigenciaValorNuevo); // Imprimo la fecha que se va editar el nuevo valor
		
		sleep(1000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(2000);	
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(34000);
		
		// Obtengo el valor actualizado ya recargada la página
		actionsMoveToElementElement(dataInicioVigencia);
		String dataInicioVigenciaEditada = dataInicioVigencia.getAttribute("value");
		System.out.println("Data Nova: " +dataInicioVigenciaEditada);
		sleep(2000);
		
		boolean sucesso = false;
		sucesso = dataInicioVigenciaEditada.equals(dataInicioVigenciaValorNuevo); // Se compara si la fecha editada que se muestra en visualizar es igual a la fecha de ayer que fue la fecha que se establecio en editar
		
		return sucesso;
	}		
	
	
	

}
