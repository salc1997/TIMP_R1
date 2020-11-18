package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultPorTributo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class ContasDefaultPorTributoEditarPO extends TestBaseEliel{
	
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default por Tributo (Substituir Conta Estoque)\"]")
	public WebElement contasdefaultportributo;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Default por Tributo\"]")
	public WebElement novacontadefaultportributo;
	
	@FindBy(xpath = "//div[@class=\"field-element companyId_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field-element branchId_0_0\"]/div/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofilial;
	
	
	@FindBy(xpath = "//div[@class=\"field-element adjustmentCode_0_1\"]/div/div/div/div[2]")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaocodigodeajuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Conta de Débito\"]")
	public WebElement contadebito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Conta de Crédito\"]")
	public WebElement contacredito;
	
	
	public ContasDefaultPorTributoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultportributo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
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
		
		//ediçao
		attributeToBeXpath("//div[@class=\"field-element adjustmentCode_0_1\"]/div","class", "input-element-wrapper");
		sleep(2000);
		
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		String valor = contadebito.getAttribute("value");

		String enviar = "1234567810";

		contadebito.clear();
		sleep(2000);
		contadebito.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element adjustmentCode_0_1\"]/div","class", "input-element-wrapper");
		sleep(2000);
		
		String novoTexto=contadebito.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		contadebito.clear();

		sleep(2000);
		contadebito.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		/*
		contadebito.clear();
		sleep(2000);
		
		contadebito.sendKeys("1234567810");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
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
		*/
		System.out.println(sucesso);	
		return sucesso;
	
	}	
	

}
