package com.sap.timp.pageObjectModel.MDR.TESTE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class PruebaTodosPO extends TestBaseSteven {

	// criar

	@FindBy(xpath = "//span[text()=\" Antecipa��o\"]")
	public WebElement antecipacao;

	@FindBy(xpath = "//*[@id=\"container\"]/div[1]/div/div/ul/li[1]/button")
	public WebElement novaAntecipacao;

	@FindBy(xpath = "//*[@id=\"content-list\"]/div[1]/div/div/div/input")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"empresa\"]/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement empresaOTc2;
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaOTd1;

	@FindBy(xpath = "//*[@id=\"uf\"]/div/div/div[2]")
	public WebElement ufFilial;
	@FindBy(xpath = "//li[text()=\"SP\"]")
	public WebElement ufFilialO;

	@FindBy(xpath = "//*[@id=\"filial\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement filialO;

	@FindBy(xpath = "//*[@id=\"tributo\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement tributoO;

	@FindBy(xpath = "//*[@id=\"tipoTributo\"]/div/div/div[2]")
	public WebElement tipoTributo;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement tipoTributoO;

	@FindBy(xpath = "//*[@id=\"detalheTipoTributo\"]/div/div[2]")
	public WebElement detalhe;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement detalheO;
	@FindBy(xpath = "//li[@id=\"2\"]")
	public WebElement detalheOTq1;

	@FindBy(xpath = "//div[contains(@id,\"Antecipacao\")]/div/div/input")
	public WebElement antecipacaoC;

	@FindBy(xpath = "//div[@id=\"parcela\"]/div/div/input")
	public WebElement parcela;

	@FindBy(xpath = "//div[@id=\"baseAntecipacao\"]/div/div[2]")
	public WebElement base;
	@FindBy(xpath = "//*[@id=\"01\"]")
	public WebElement baseOTd1;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement baseOTc2;

	@FindBy(xpath = "//div[@id=\"linhaDeducao\"]/div/div[2]")
	public WebElement linha;
	@FindBy(xpath = "//*[@id=\"01\"]")
	public WebElement linhaOTd1;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement linhaOTc2;

	@FindBy(xpath = "//div[@id=\"codRegLancSped\"]/div/div/div[2]")
	public WebElement lancamento;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement lancamentoO;

	@FindBy(xpath = "//div[@id=\"modRelatorio\"]/div/div/div[2]")
	public WebElement modelo;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement modeloO;

	@FindBy(xpath = "//*[@id=\"dtInicio\"]/div/div[1]/input")
	public WebElement data;

	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[6]")
	public WebElement siguiente;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;

	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement biblioteca;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	// Editar

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;

	@FindBy(xpath = "//*[@id=\"percAntecipacao\"]/div/div/input")
	public WebElement campo;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;

	public PruebaTodosPO() {

			PageFactory.initElements(driver, this);
	}
	
	String idG= "";
	public boolean criarAntecipacao() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;

		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else if (url.contains("tq1")) {
			tq1 = true;
		} else {
			td1 = true;
		}

		antecipacao.click();

		sleep(2000);
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");

		siguiente.click();

		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");

		sleep(2000);

		Actions actions = new Actions(driver);
		idC.click();
		sleep(1000);
		actions.doubleClick(idC).perform();

		String id = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[3]/div"))
				.getText();

		novaAntecipacao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"tributo\"]/div", "class", "base-select required");
		// invisibilityOfElement("//*[@id=\"container\"]/div[4]/div/div/div/img");
		sleep(2000);

		empresa.click();
		sleep(2000);
		if (tc2 == true || tp1 == true || tq1 == true) {
			empresaOTc2.click();
		} else {
			empresaOTd1.click();
			empresaOTd1.sendKeys(Keys.ESCAPE);
		}

		attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-select required");

		ufFilial.click();
		sleep(2000);
		ufFilialO.click();
		sleep(2000);

		attributeToBeXpath("//*[@id=\"filial\"]/div", "class", "base-select required");

		filial.click();
		sleep(2000);
		filialO.click();
		sleep(2000);

		tributo.click();
		sleep(2000);
		tributoO.click();
		sleep(2000);

		attributeToBeXpath("//*[@id=\"tipoTributo\"]/div", "class", "base-select required");
		tipoTributo.click();
		sleep(2000);
		tipoTributoO.click();
		sleep(2000);

		detalhe.click();
		sleep(2000);
		if (tq1 == true || td1 == true) {
			detalheOTq1.click();
		} else {
			detalheO.click();
		}

		sleep(2000);

		antecipacaoC.sendKeys("20");
		sleep(1000);
		parcela.sendKeys("12");
		sleep(2000);

		base.click();
		sleep(2000);
		if (tc2 == true || tp1 == true) {
			baseOTc2.click();
		} else {
			baseOTd1.click();
		}
		sleep(2000);

		linha.click();
		sleep(2000);
		if (tc2 == true || tp1 == true) {
			linhaOTc2.click();
		} else {
			linhaOTd1.click();
		}
		sleep(2000);

		lancamento.click();
		sleep(2000);
		lancamentoO.click();
		sleep(2000);

		modelo.click();
		sleep(2000);
		modeloO.click();
		sleep(2000);

		data.sendKeys("01/07/2020");
		sleep(2000);
		gravar.click();
		sleep(3000);
		waitExpectElement(sim);
		sim.click();
		sleep(3000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		actions.doubleClick(idC).perform();

		String id2 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[3]/div"))
				.getText();
		
		idG = id2;
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		return sucesso;

	}
	
	
	public boolean editar() {

		antecipacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		/*
		siguiente.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");

		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		*/
		pesquisar.sendKeys(idG);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu.click();
		sleep(1000);
		editar.click();

		//invisibilityOfElement("//*[@id=\"container\"]/div[4]/div/div/div/img");
		attributeToBeXpath("//div[@id=\"tributo\"]/div", "class", "base-select required");
		sleep(2000);

		String url = driver.getCurrentUrl();
		String valor = campo.getAttribute("value");

		String enviar = "30";

		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		driver.navigate().refresh();

		//invisibilityOfElement("//*[@id=\"container\"]/div[4]/div/div/div/img");

		//waitExpectElement(campo);
		attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-select required");
		sleep(2000);

		String nuevoTexto = campo.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(1000);
		campo.clear();

		sleep(1000);
		campo.sendKeys(valor);

		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;

	}

}