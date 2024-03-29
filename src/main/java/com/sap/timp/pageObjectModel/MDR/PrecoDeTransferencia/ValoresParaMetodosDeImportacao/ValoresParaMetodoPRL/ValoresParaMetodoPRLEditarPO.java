package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ValoresParaMetodoPRLEditarPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Pre�o de Transfer�ncia\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para M�todos de Importa��o\"]")
	public WebElement valoresparametodosdeimportacao;
	
	@FindBy(xpath = "//span[text()=\" Valores para M�todo PRL\"]")
	public WebElement valoresprl;
	
	@FindBy(xpath = "//span[text()=\"Novo  Valores para M�todo PRL\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"material\"]/div/div/div[2]")
	public WebElement material;
	
	@FindBy(xpath = "//div[@id=\"model\"]/div/div/div[2]")
	public WebElement modelo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Quantidade Importada\"]")
	public WebElement quantidadeimportada;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Venda p/ Vinculada\"]")
	public WebElement qtdevendavinculada;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Venda p/ NV\"]")
	public WebElement qtdevendanv;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Venda p/ Exporta��o\"]")
	public WebElement qtdevendaexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Total Vendas\"]")
	public WebElement qtdetotalvendas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Pre�o Revenda M�dio\"]")
	public WebElement precorevendamedio;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Descontos Incondicionais\"]")
	public WebElement descontos;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  ICMS s/ Vendas\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  PIS s/ Vendas\"]")
	public WebElement pis;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  COFINS s/ Vendas\"]")
	public WebElement cofins;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Juros Vendas a Prazo\"]")
	public WebElement jurosvendas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Despesas c/ Comiss�es\"]")
	public WebElement despesas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Tipo Margem Lucro\"]")
	public WebElement tipomargem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Pre�o Praticado\"]")
	public WebElement precopraticado;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//button[@id=\"add-materials\"]")
	public WebElement addmateriais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descri��o\"]")
	public WebElement descricao;
	
	public ValoresParaMetodoPRLEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {

		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		valoresparametodosdeimportacao.click();
		
		sleep(2000);
		
		valoresprl.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =  idObter("ValoresParaMetodoPRL");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		waitExpectedElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = datainicial.getAttribute("value");

		String enviar = fechaAyer();

		datainicial.clear();
		sleep(2000);
		datainicial.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		sleep(2000);
		waitExpectedElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String novoTexto=datainicial.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		datainicial.clear();

		sleep(2000);
		datainicial.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		return sucesso;
	}	

	

}
