package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.j2objc.annotations.Weak;
import com.sap.timp.base.TestBaseEliel;

public class ContratoIOFCriarPO extends TestBaseEliel {

	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
		
	@FindBy(xpath = "//span[text()=\"Novo Contrato IOF \"]")
	public WebElement novocontratoiof;
	

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Contrato No.\"]")
	public WebElement preenchercontrato;
	
	@FindBy(xpath ="//div[@id=\"revenueCode\"]/div/div/div[2]")
	public WebElement codigoreceita;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocodigoreceita;
	
	@FindBy(xpath = "//div[@id=\"personType\"]/div/div/div[2]")
	public WebElement tipopessoa;
	
	@FindBy(xpath ="//li[@id][1]")
	public WebElement opcaotipopessoa;
	
	@FindBy(xpath ="//input[@placeholder=\"Preencher CPF\"]")
	public WebElement cpf;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Variação\"]")
	public WebElement variacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Razão Social\"]")
	public WebElement razaosocial;
	
	@FindBy(xpath = "//div[@id=\"periodicity\"]/div/div/div[2]")
	public WebElement periocidade;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoperiocidade;
	
	@FindBy(xpath = "//div[@id=\"coin\"]/div/div[2]")
	public WebElement moeda;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaomoeda;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor do Contrato\"]")
	public WebElement valorcontrato;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath ="//*[@id=\"0001\"]/div[1]/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath ="//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotributo;
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[6]")
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	//public WebElement setafinal;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar\"]")
	public WebElement adicionar;
	
	
	public ContratoIOFCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void criar() {
		
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		contratoiof.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String id = idR.getText();
		sleep(2000);
		//System.out.println(id);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		novocontratoiof.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		preenchercontrato.sendKeys("123");
		
		codigoreceita.click();
	
		opcaocodigoreceita.click();
		
		tipopessoa.click();
		waitExpectElement(opcaotipopessoa);
		sleep(2000);
		opcaotipopessoa.click();
		
		cpf.sendKeys("13154614712");
		
		variacao.sendKeys("01");
		
		razaosocial.sendKeys("Razão");
		
		periocidade.click();
		
		opcaoperiocidade.click();
		
		waitExpectElement(moeda);
		sleep(2000);
		moeda.click();
		
		opcaomoeda.click();
		
		valorcontrato.sendKeys("1000");
		
		String data= fechaActual();
		
		validadede.sendKeys(data);
		
		empresa.click();
		opcaoempresa.click();
		
		waitExpectElement(filial);
		sleep(2000);
		
		filial.click();
		
		opcaofilial.click();
		
		opcaofilial.sendKeys(Keys.ESCAPE);
	
		
	//	attributeToBeXpath("//div[@id=\"tax\"]/div/div/div/div[2]", "class", "new-tag");
		
		tributo.click();
		opcaotributo.click();
		opcaotributo.sendKeys(Keys.ESCAPE);
		
		adicionar.click();
		
		gravar.click();
		
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	
		biblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		//Pega o ultimo id depois do preenchimento

		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		String idB = idR.getText();
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
				
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
				
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
				
		System.out.println( sucesso);
		
		//verificar se o relatório foi criado
		boolean text= idB.contains(idR.getText());
		System.out.println(text);
		
	}



}
	
	

