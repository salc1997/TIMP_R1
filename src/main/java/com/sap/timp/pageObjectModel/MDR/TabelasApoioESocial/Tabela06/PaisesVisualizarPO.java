package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela06;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class PaisesVisualizarPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 06 - Pa�ses\"]")
	public WebElement tabela06;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher C�digo\"]")
	public WebElement codigo;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//td[@id=\"code\"]/span")
	public WebElement codigovi;

	@FindBy(xpath = "//td[@id=\"name\"]/span")
	public WebElement nomevi;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement datavi;
	
	public PaisesVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		
		tabela06.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("Paises");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		String codigovisualizar =codigovi.getText();
		String nomevisualizar =nomevi.getText();
		String datavisualizar =datavi.getText();
		
		
		
		
		System.out.println(codigovisualizar);
		System.out.println(nomevisualizar);
		System.out.println(datavisualizar);
		
		
		
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectedElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("Paises");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectedElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		//editar
		
		
		String codigoeditar = codigo.getAttribute("value");
		String nomeeditar=nome.getAttribute("value");
		String dataeditar = datainicio.getAttribute("value");
		
		System.out.println(codigoeditar);
		System.out.println( nomeeditar);
		System.out.println(dataeditar);
		
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(codigoeditar.equals(codigovisualizar));
		sucesso.add(nomeeditar.equals(nomevisualizar));
		sucesso.add(dataeditar.equals(datavisualizar));
		return sucesso;	

	
	}	

}
