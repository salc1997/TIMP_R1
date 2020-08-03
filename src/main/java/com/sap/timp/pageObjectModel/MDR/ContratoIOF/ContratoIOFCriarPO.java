package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class ContratoIOFCriarPO extends TestBaseEliel {

	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
		
	@FindBy(xpath = "//span[text()=\"Novo Cadastro da Condição\"]")
	public WebElement novocadastrocondicao;
	

	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Empresa\"]")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcaoempresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	//public WebElement opcaoempresatc2tq1tp1;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcaoempresatc2tq1tp1;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  um UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//*[@id=\"SP\"]/div[1]/label/span")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath ="//*[@id=\"1000_SP_0001\"]/div[1]/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  um Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"23\"]/div[1]/label/span")
	public WebElement opcaotributo;
	
	@FindBy(xpath ="//input[@placeholder=\"Selecionar  uma  Sequência de Acesso\"]")
	public WebElement sequenciaacesso;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcaosequenciaacesso;
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement vigenciade;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement camposestrutura;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Atribuição\"]")
	public WebElement atribuicao;
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[6]")
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	//public WebElement setafinal;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[7]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
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
	
	
	}



}
	
	

