package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class CodigoContabilizacaoCriarPO extends TestBaseEliel {
	
	@FindBy(xpath = "//span[text()=\"C�digos de Contabiliza��o\"]")
	public WebElement codigoscontabilizacao;
		

	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinaltc2;
	
	@FindBy(xpath = "//span[text()=\"Novo C�digo de Contabiliza��o\"]")
	public WebElement novocodigocontabilizacao;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	

	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Lan�amento \"]")
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
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public CodigoContabilizacaoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void criar() {
		
		
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
			
		novocodigocontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		empresa.click();
		
		opcaoempresa.click();
		
		opcaoempresa.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		tipolancamento.sendKeys(Keys.ENTER);;
		
		opcaotipolancamento.click();
		
		sleep(1000);
		
		descricaopadrao.sendKeys("Teste");
		
		tributo.click();
		
		opcaotributo.click();
		
		//tipotributo.sendKeys("A0002 - FUNDOS");
		
		
		waitExpectElement(tipotributo);
		sleep(2000);
		tipotributo.click();

		opcaotipotributo.click();
		
		//pega a data atual
		//String data= fechaActual();
		String data = dataanterior();
		datainicio.sendKeys(data);
		
		gravar.click();
		
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
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
		//compara pra ver se o novo id criado � realmente o ultimo
		boolean sucesso = false;
				
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
				
		System.out.println( sucesso);
		
		//verificar se o relat�rio foi criado
		boolean text= idB.contains(idR.getText());
		System.out.println(text);
    }
	

}
