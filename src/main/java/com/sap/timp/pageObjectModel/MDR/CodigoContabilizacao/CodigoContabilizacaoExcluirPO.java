package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class CodigoContabilizacaoExcluirPO extends TestBaseEliel {
	
	
	
	
	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoscontabilizacao;
		

	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinaltc2;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Contabilização\"]")
	public WebElement novocodigocontabilizacao;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	

	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Lançamento \"]")
	public WebElement tipolancamento;
	
	@FindBy(xpath = "//li[@class=\"list-item selected visible\"]")
	public WebElement opcaotipolancamento;

	@FindBy(xpath = "//*[@id=\"standard-description\"]/div/div/input")
	public WebElement descricaopadrao;
	
	@FindBy(xpath = "//div[@class=\"icon main-icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//*[@id=\"start-date\"]/div/div[1]/input")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[@id=\"tax-type\"]/div/div[2]")
	public WebElement tipotributo;
	
	//@FindBy(xpath = "//div[@class=\"base-autocomplete-box show\"]/ul/li[2]")
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	//@FindBy(xpath = "//button[text()=\"Sim\"]")
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[4]")
	public WebElement excluir;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisa;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	public CodigoContabilizacaoExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
public boolean excluir() {
		
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		codigoscontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id
		if (tc2 == true || tp1 == true || tq1 == true) {
			setafinaltc2.click();
		}else {
			setafinal.click();
		}
		//setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//pega o ultimo id
		idC.click();
		sleep(1000);
		dobleClickElement(idC);
		sleep(2000);
		
		String id = idR.getText();
		sleep(2000);
	//	System.out.println(id);
		
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		opcao.click();
		
		engrenagem.click();
		sleep(1000);
		excluir.click();
		sleep(1000);
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(pesquisa);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		pesquisa.sendKeys(id);
		pesquisa.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		boolean sucesso = nenhumResult.isDisplayed();
		System.out.println(sucesso);
		return sucesso;
		
    }

}
