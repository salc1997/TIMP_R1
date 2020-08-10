package com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class RegistroDeExportaçaoEditarPO extends TestBaseEliel {
	
	@FindBy(xpath = "//span[text()=\"Registro de Exportação\"]")
	public WebElement registroexportacao;
	
	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item  first \"]/button/span[2]")
	public WebElement novoregistro;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Docnum SAP\"]")
	public WebElement docnum;

	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Chave da NFe\"]")
	public WebElement chavenfe;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Código do item\"]")
	public WebElement codigoitem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Cod país destino\"]")
	public WebElement codpais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data lançamento\"]")
	public WebElement datalancamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Nº Declaração\"]")
	public WebElement numerodeclaracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data declaração\"]")
	public WebElement datadeclaracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo de doc. exportação\"]")
	public WebElement tipodocexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Natureza da exportação\"]")
	public WebElement naturezadaexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data averbação decla. exp\"]")
	public WebElement dataaverbacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo de conhec. embarque\"]")
	public WebElement tipodeconhecembarque;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Modelo\"]")
	public WebElement preenchamodelo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Nº Nota fiscal\"]")
	public WebElement notafiscal;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data emissão NF exportação\"]")
	public WebElement dataemissaonf;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public RegistroDeExportaçaoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public String editar() {
		sleep(2000);
		registroexportacao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		attributeToBeXpath("//div[@class=\"element\" and @id=\"company\"]/div", "class", "base-select required");
		sleep(2000);
		docnum.clear();
		sleep(2000);
		
		docnum.sendKeys("0987654321");
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		//sim.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
	
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		//System.out.println(sucesso);	
		return sucesso;
		
			
	}	

}
