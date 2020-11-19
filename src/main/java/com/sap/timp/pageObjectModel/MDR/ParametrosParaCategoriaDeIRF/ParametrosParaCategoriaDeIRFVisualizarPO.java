package com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaCategoriaDeIRFVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Parâmetros para Categoria de IRF \"]")
	public WebElement parametros;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath ="//span[@id=\"irf-category\"]")
	public WebElement categoriaIRF;
	
	@FindBy(xpath ="//span[@id=\"irf-code\"]")
	public WebElement codIRF;
	
	@FindBy(xpath ="//span[@id=\"irf-key\"]")
	public WebElement chavedeIRF;
	
	@FindBy(xpath ="//span[@id=\"irf-description\"]")
	public WebElement descriçãodeIRF;
	
	@FindBy(xpath ="//span[@id=\"structure\"]")
	public WebElement estruturadeDados;
	
	@FindBy(xpath ="//span[@id=\"values-fields\"]")
	public WebElement camposdeValor;
	
	
	//---------- Visualizar
	@FindBy(xpath ="//div[@class=\"fields\"]/div[1]/div[1]/div/div/div/div/input")
	public WebElement categoriaIRF1;
	
	@FindBy(xpath ="//div[contains(@class,\"base-MultipleSelect3 required\")]/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement codIRF1;
	
	@FindBy(xpath ="//div[@class=\"fields\"]/div[2]/div/div[1]/div[1]/div[1]/div[1]/input")
	public WebElement chavedeIRF1;
	
	@FindBy(xpath ="//div[@id=\"irf-description\"]/div/div/input")
	public WebElement descriçãodeIRF1;
	
	@FindBy(xpath ="//div[@class=\"fields\"]/div[3]/div/div/div[1]/div[1]/input")
	public WebElement estruturadeDados1;
	
	@FindBy(xpath ="//div[@class=\"fields\"]/div[3]/div/div[1]/div[1]/div[1]/div[1]/input")
	public WebElement camposdeValor1;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public ParametrosParaCategoriaDeIRFVisualizarPO() {
		PageFactory.initElements(driver, this);
	}

	public void Visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		parametros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter2();

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textocategoriaIRF =  categoriaIRF.getText();
		String textocodIRF = codIRF.getText();
		String textochavedeIRF = chavedeIRF.getText();
		String textodescriçãodeIRF = descriçãodeIRF.getText();
		String textoestruturadeDados = estruturadeDados.getText();
		String textocamposdeValor = camposdeValor.getText();

		System.out.println("Categoria de IRF: " + textocategoriaIRF);
		System.out.println("Cod. IRF: " + textocodIRF);
		System.out.println("Chave de IRF: " + textochavedeIRF);
		System.out.println("Descrição de IRF: " + textodescriçãodeIRF);
		System.out.println("Estrutura de Dados: " + textoestruturadeDados);
		System.out.println("Campos de Valor: " + textocamposdeValor);

		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		sleep(8000);
		
		String textocategoriaIRF1 =  categoriaIRF1.getAttribute("value");
		String textocodIRF1 = codIRF1.getAttribute("value");
		String textochavedeIRF1 = chavedeIRF1.getAttribute("value");
		String textodescriçãodeIRF1 = descriçãodeIRF1.getAttribute("value");
		String textoestruturadeDados1 = estruturadeDados1.getAttribute("value");
		String textocamposdeValor1 = camposdeValor1.getAttribute("value");
		sleep(2000);
		System.out.println("-------------------------------------------");
		System.out.println("Categoria de IRF: " + textocategoriaIRF1);
		System.out.println("Cod. IRF: " + textocodIRF1);
		System.out.println("Chave de IRF: " + textochavedeIRF1);
		System.out.println("Descrição de IRF: " + textodescriçãodeIRF1);
		System.out.println("Estrutura de Dados: " + textoestruturadeDados1);
		System.out.println("Campos de Valor: " + textocamposdeValor1);
		
	}
}