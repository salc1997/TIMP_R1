package com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class TributosCriarPO extends TestBaseKathy{
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	
	@FindBy(xpath = "//li/div/span[text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Centralização de Tributos\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um  Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF Filial\"]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcUfFilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filiais\"]")
	public WebElement filiais;
	
	@FindBy(xpath = "//*[@id=\"0001\"]/div[2]")
	public WebElement opcFiliais;
	
	@FindBy(xpath = "//div[contains(@class,\"overlay-multipleSelect3\")]")
	public WebElement claseOpcFiliais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"00\"]/div[2]")
	public WebElement opcTributoICMS;
	
	@FindBy(xpath = "//*[@id=\"23\"]/div[2]")
	public WebElement opcTributoCIAP;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo Centralizador\"]")
	public WebElement tributoCentralizador;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcTributoCentralizador;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement dataVigenciaInicio;
	
	@FindBy(xpath = "//div[@class=\"date today\"]")
	public WebElement dia;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span")
	public WebElement pestañaAjuste;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Ajuste\"]")
	public WebElement btnNovoAjuste;
	
	@FindBy(xpath = "//div[@class=\"item\"]/div/div/div/input[@placeholder=\"Selecionar Filiais\"]")
	public WebElement filiaisAjuste;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcFiliaisAjuste;
	
	@FindBy(xpath = "//div[@id=\"tributeOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de tributo\"]")
	public WebElement tributoOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opcTributoOrigen;
	
	@FindBy(xpath = "//div[@id=\"tributeTypeOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de tributo\"]")
	public WebElement tipoOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcTipoOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opcTipoOrigenTP1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Saldo\"]")
	public WebElement saldo;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcSaldo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Detalhe Origem\"]")
	public WebElement detalheOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcDetalheOrigen;
	
	@FindBy(xpath = "//div[@id=\"documentTypeOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de documento\"]")
	public WebElement tipoDocumentoOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-3\"]")
	public WebElement opcTipoDocumentoOrigen;
	
	@FindBy(xpath = "//div[@id=\"documentNameOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Modelo de Guia\"]")
	public WebElement modeloGuiaOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcModeloGuiaOrigen;
	
	@FindBy(xpath = "//div[@id=\"outputFieldOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Campo de saída\"]")
	public WebElement campoSaidaOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcCampoSaidaOrigen;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo Destino\"]")
	public WebElement tributoDestino;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcTributoDestino;
	
	@FindBy(xpath = "//div[@id=\"tributeTypeDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de tributo\"]")
	public WebElement tipoDestino;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcTipoDestino;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Detalhe Destino\"]")
	public WebElement detalheDestino;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcDetalheDestino;
	
	@FindBy(xpath = "//div[@id=\"documentTypeDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de documento\"]")
	public WebElement tipoDocumentoDestino;
	
	@FindBy(xpath = "//*[@id=\"option-3\"]")
	public WebElement opcTipoDocumentoDestino;
	
	@FindBy(xpath = "//div[@id=\"documentNameDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Modelo de Guia\"]")
	public WebElement modeloGuiaDestino;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcModeloGuiaDestino;
	
	@FindBy(xpath = "//div[@id=\"outputFieldDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Campo de saída\"]")
	public WebElement campoSaidaDestino;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcCampoSaidaDestino;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnNovoAjusteGravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[5]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"01\"]/div[2]")
	public WebElement opcICMSST;
	
	@FindBy(xpath = "//*[@id=\"0008\"]/div[2]")
	public WebElement opcFiliaisTC2;
	
	public TributosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarTributo() {
		
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
		
		centralização.click();
		sleep(1000);
		tributos.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
			
		Actions actions = new Actions(driver);
		idC.click();
		sleep(1000);
		actions.doubleClick(idC).perform();
			
		String id = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[3]/div")).getText();
			
		novo.click();
		waitExpectElement(btnGravar);
		waitExpectElement(empresa);
		empresa.sendKeys(Keys.ENTER);
		opcEmpresa.click();
		sleep(3000);
		ufFilial.sendKeys(Keys.ENTER);
		opcUfFilial.click();
		sleep(4000);
		filiais.sendKeys(Keys.ENTER);
		if(tc2==true) {
			opcFiliaisTC2.click();
		}else {
			opcFiliais.click();
		}
		
		claseOpcFiliais.click();
		
		tributo.click();
		
		if (td1 == true || tq1==true ) {
			opcTributoCIAP.click();
			opcTributoICMS.click();
		}else if (tp1 == true || tc2==true) {
			opcTributoICMS.click();
			opcICMSST.click();
		}
		claseOpcFiliais.click();
		
		tributoCentralizador.click();
		opcTributoCentralizador.click();
		
		
		dataVigenciaInicio.sendKeys(Keys.ENTER);

		dataVigenciaInicio.sendKeys("24/07/2020");
		dataVigenciaInicio.sendKeys(Keys.ENTER);
		cuerpo.click();
			
		pestañaAjuste.click();
		waitExpectElement(btnNovoAjuste);
		btnNovoAjuste.click();
		sleep(1000);
		waitExpectElement(filiaisAjuste);
		filiaisAjuste.sendKeys(Keys.ENTER);
		opcFiliaisAjuste.click();
		
		sleep(1000);
		tributoOrigen.click();
		opcTributoOrigen.click();
		
		if (td1 == true || tq1==true ) {
			sleep(8000);
		}else if (tp1 == true || tc2==true) {
			sleep(10000);
		}		
		tipoOrigen.click();
		if (td1 == true || tq1==true ) {
			opcTipoOrigen.click();
		}else if (tp1 == true || tc2==true) {
			opcTipoOrigenTP1.click();
		}		
		
		if (td1 == true || tq1==true ) {
			sleep(9000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}	
		saldo.click();
		opcSaldo.click();
		
		if (td1 == true || tq1==true) {
			sleep(6000);
		}else if (tp1 == true || tc2==true) {
			sleep(8000);
		}		
		detalheOrigen.click();
		opcDetalheOrigen.click();
		
		sleep(3000);
		tipoDocumentoOrigen.click();
		opcTipoDocumentoOrigen.click();
		
		if (td1 == true || tq1==true ) {
			sleep(8000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		modeloGuiaOrigen.click();
		opcModeloGuiaOrigen.click();
		
		if (td1 == true || tq1==true ) {
			sleep(6000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		campoSaidaOrigen.click();
		opcCampoSaidaOrigen.click();
		

		if (td1 == true || tq1==true ) {
			sleep(2500);
		}else if (tp1 == true || tc2==true) {
			sleep(4000);
		}
		tributoDestino.click();
		opcTributoDestino.click();
		
		
		if (td1 == true || tq1==true ) {
			sleep(6000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		tipoDestino.click();
		opcTipoDestino.click();
		

		if (td1 == true || tq1==true ) {
			sleep(8000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		detalheDestino.click();
		opcDetalheDestino.click();
		
		sleep(2000);
		tipoDocumentoDestino.click();
		opcTipoDocumentoDestino.click();
		

		if (td1 == true || tq1==true ) {
			sleep(9000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		modeloGuiaDestino.click();
		opcModeloGuiaDestino.click();
		

		if (td1 == true || tq1==true ) {
			sleep(8000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		campoSaidaDestino.click();
		opcCampoSaidaDestino.click();
		
		btnNovoAjusteGravar.click();
		
		//Integer filas= driver.findElements(By.xpath("//*[@id=\"library\"]/div/div/div/div[2]/div[1]")).size();
		
		
		btnGravar.click();
		waitExpectElement(confirmacionGravar);
		confirmacionGravar.click();
		
		sleep(3000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(btnRegresar);
		btnRegresar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		if(tc2==true) {
			actions.click(idC).perform();
		}else {
			actions.doubleClick(idC).perform();
		}
	
		
		String id2 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[3]/div")).getText();
		
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
}
