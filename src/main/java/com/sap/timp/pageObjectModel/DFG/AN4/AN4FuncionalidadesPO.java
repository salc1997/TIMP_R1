package com.sap.timp.pageObjectModel.DFG.AN4;

import java.security.MessageDigest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class AN4FuncionalidadesPO 	extends TestBaseMassiel{
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]/div /div[1]/div/div[1]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]/div /div[1]/div/div[1]/div/div[1]")
	public WebElement raiz2;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Leiaute\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[4]/div[2]/div/div/input")
	public WebElement nombre;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[6]/div[2]/div/div[1]/div[2]")
	public WebElement tipo;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[7]/div[2]/div/div[1]/div[2]")
	public WebElement grupoEstructura;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[8]/div[2]/div/div[1]/div[2]")
	public WebElement estructura;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[10]/div[2]/div/div/input")
	public WebElement fechainicioVigencia;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[10]/div[2]/div/div[1]/span")
	public WebElement fechainicioVigencia1;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[12]/div[2]/div/div/input")
	public WebElement versao;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement salvar;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/div/ul/li[6]/button")
	public WebElement separadorbutton;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/ul/li[2]")
	public WebElement flecha;
	
	@FindBy(xpath = "//div[@id=\"inputSeparator\"]/div/div/input")
	public WebElement separador;
	
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement inicioLinha;
	
	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement fimLinha;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement aplicar;

	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
	
	@FindBy(xpath = "//div[@class=\"block-inner-header\"]/div[2]/div/div[2]/div/div/div[2]/input")
	public WebElement blocoNome;
	
	@FindBy(xpath = "//div[@class=\"record-inner-header\"]/div[2]/div/div[2]/div/div/div[2]/input")
	public WebElement registroNome;
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement ajusteFiscal;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[2]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[3]")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[5]")
	public WebElement dataLancamento;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[14]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim2;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//-------------- BRE 
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regra;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novoRegra;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[2]/td[2]/div/div/input ")
	public WebElement nomeRegra;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[4]/td[2]/div/div/div[2] ")
	public WebElement tipoRegra;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[5]/td[2]/div/div/div[2] ")
	public WebElement componente;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[6]/td[2]/div/div/div[2] ")
	public WebElement tributo;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[9]/td[2]/div/div/div[2] ")
	public WebElement grupoEstructuraReferencia;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[10]/td[2]/div/div/div[2] ")
	public WebElement EstructuraDatosReferencia;

	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[11]/td[2]/div/div/div[2] ")
	public WebElement grupoEstructuraComparacao;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[12]/td[2]/div/div/div[2] ")
	public WebElement EstructuraDatosComparacao;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[13]/td[2]/div/div/div[2]")
	public WebElement primeroLeiaute;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[14]/td[2]/div/div/div[2]")
	public WebElement versaoLeiauteReferencia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement versaoLeiauteOPC;

	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[15]/td[2]/div/div/div[2]")
	public WebElement segundoLeiaute;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[16]/td[2]/div/div/div[2]")
	public WebElement versaoLeiauteComparacao;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[17]/td[2]/div/div/div[2]")
	public WebElement caracteristicaEspacialReferencia;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[18]/td[2]/div/div/div[2]")
	public WebElement caracteristicaEspacialComparacao;
	
	@FindBy(xpath = "//li[@id=\"option-3\"]")
	public WebElement caracteristicasOPC;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[31]/td[2]/div/div/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[31]/td[2]/div/div/span")
	public WebElement validaDe1;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement camino;
	
	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[1]/div/div/div/div[4]/div[1]/ul/li/ul/li/div")
	public WebElement registroPrimerDato;

	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[3]/div/div/div/div[4]/div[1]/ul/li/ul/li/div")
	public WebElement registroSegundoDato;
	
	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[1]/div/div/div/div[4]/div[1]/ul/li/ul/li/ul/li[4]")
	public WebElement valorAjustePrimerDato;
	
	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[3]/div/div/div/div[4]/div[1]/ul/li/ul/li/ul/li[4]")
	public WebElement valorAjusteSegundoDato;
	
	@FindBy(xpath = "//div[@class=\"message-wrapper\"]/div/div/div/input")
	public WebElement mensaje;
	
	@FindBy(xpath = "//div[@class=\"areaCondition\"]/div[2]/div/div/div[2]")
	public WebElement operador;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement operadorOPC;
	
	// DFG
	@FindBy(xpath = "//span[@class=\"icon icon-font-Display-and-Setting icon-setting padding-right \"]")
	public WebElement abaConfiguraciones;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração\"]")
	public WebElement novoConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputTextFileName\"]/div/div/input")
	public WebElement nomeConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement primerLeiauteConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement versaoConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
	public WebElement tributoConfiguracoe;
	
	@FindBy(xpath = "//li[@id=\"option-17\"]")
	public WebElement tributoConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
	public WebElement empresaConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"1000\"]")
	public WebElement empresaConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
	public WebElement ufConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement ufConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
	public WebElement filialConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"1000SP0001\"]")
	public WebElement filialConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputValidFrom\"]/div/div[1]/input")
	public WebElement fechaConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputValidFrom\"]/div/div[1]/span")
	public WebElement fechaConfiguracoeSpan;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvarConfiguracoe;
	
	// Executar
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executarConfiguracao;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement estadoOPC;
	
	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[@class=\"title-wrapper\"]/div[1]")
	public WebElement flechacalendario;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement anio;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement mes;
	
	@FindBy(xpath = "//div[@class=\"dates-wrapper\"]/div[1]/span")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
	public WebElement movimiento;
	


	
	public AN4FuncionalidadesPO () {
		PageFactory.initElements(driver, this);
	}
	

	public void Id() {
		
		System.out.println("---------- Id Anterior --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		if (tq1 == true) {


			raiz.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
			raiz2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id Antes en Raiz: " +id);
		idInserir1(id);
		
		
		
	}
	
	public boolean Criar() {
		
		System.out.println("---------- Criar --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombre.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nombre.sendKeys("Test Massiel");
		nombre.sendKeys(Keys.ENTER);
		
		tipo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement tipoOPC = driver.findElement(By.xpath("//li[@id=\"option-1\"]"));


		tipoOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		grupoEstructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {


			actionsMoveToElementXpath("//li[@id=\"option-8\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-8\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {

			actionsMoveToElementXpath("//li[@id=\"option-2\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}

		estructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		WebElement estructuraOPC = driver.findElement(By.xpath("//div[@id=\"18\"]"));


		estructuraOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		closeSelectTypeCheckbox(estructura);


		
		fechainicioVigencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fechainicioVigencia.sendKeys("01/01/2013");
		fechainicioVigencia.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechainicioVigencia1);

		
		versao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		versao.sendKeys("1");
		versao.sendKeys(Keys.ENTER);
		
		salvar.click();
		sleep(2000);
	
		waitExpectElement(flecha);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		while (!separadorbutton.isDisplayed()) {
			flecha.click();
			
		}
		sleep(2000);
		
		separadorbutton.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.sendKeys("|");
		separador.sendKeys(Keys.ENTER);
		
		inicioLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fimLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.sendKeys("Bloco 1");
		
		registroNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		registroNome.sendKeys("Registro 1");
		
		ajusteFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		no.click();
		sleep(1000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String id =idObter1();

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idNuevo);
		idInserir2(idNuevo);



		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public boolean Criar2() {
		
		System.out.println("---------- Criar2 --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombre.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nombre.sendKeys("Test Massiel2");
		nombre.sendKeys(Keys.ENTER);
		
		tipo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement tipoOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

		tipoOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		grupoEstructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			actionsMoveToElementXpath("//li[@id=\"option-8\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-8\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {

			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		estructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement estructuraOPC = driver.findElement(By.xpath("//div[@id=\"18\"]"));


		estructuraOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		closeSelectTypeCheckbox(estructura);

		
		fechainicioVigencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fechainicioVigencia.sendKeys("01/01/2013");
		fechainicioVigencia.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechainicioVigencia1);

		
		versao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		versao.sendKeys("1");
		versao.sendKeys(Keys.ENTER);
		
		salvar.click();
		sleep(2000);
	
		waitExpectElement(flecha);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		while (!separadorbutton.isDisplayed()) {
			flecha.click();
			
		}
		sleep(2000);
		
		separadorbutton.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.sendKeys("|");
		separador.sendKeys(Keys.ENTER);
		
		inicioLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fimLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.sendKeys("Bloco 1");
		
		registroNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		registroNome.sendKeys("Registro 1");
		
		ajusteFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		no.click();
		sleep(1000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String id =idObter1();
		String id2 =idObter2();

		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String  idRegistro1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idRegistro1);
		idInserir3(idRegistro1);
		
		rows = rows-1;
		String  idRegistro2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idD2 = convertToDouble(id2);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD && idRegistroD2 == idD2) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public void IdBRE() {
		
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();
		acessarBREPO.acessarBRE();
		
		regra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idregra = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id Antes da Criação en Regra N4: " +idregra);
		idInserir4(idregra);
		
	}
	
	public boolean CriarRegra() {

		
		System.out.println("---------- Criar --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		novoRegra.click();
		sleep(4000);
		
		nomeRegra.click();
		sleep(2000);
		
		nomeRegra.sendKeys("Test Massiel regra");
		nomeRegra.sendKeys(Keys.ENTER);
		
		tipoRegra.click();
		sleep(2000);

		WebElement Opc = driver.findElement(By.xpath("//li[@id=\"option-4\"]"));

		Opc .click();
		sleep(2000);

		componente.click();
		sleep(2000);
		
		if (tq1 == true) {
			
			WebElement Opc1 = driver.findElement(By.xpath("//li[@id=\"option-11\"]"));

			Opc1 .click();
			sleep(2000);
			

		}else if (tp1==true) {

			WebElement Opc1 = driver.findElement(By.xpath("//li[@id=\"option-10\"]"));

			Opc1 .click();
			sleep(2000);
		}
		
		tributo.click();
		sleep(2000);
		
			
		actionsMoveToElementXpath("//div[@id=\"00\"]");
		sleep(2000);

		WebElement Opc2 = driver.findElement(By.xpath("//div[@id=\"00\"]"));

		Opc2 .click();
		sleep(2000);

		closeSelectTypeCheckbox(tributo);


		
		grupoEstructuraReferencia.click();
		sleep(2000);
		
		if (tq1 == true) {
			
			WebElement Opc3 = driver.findElement(By.xpath("//li[@id=\"option-8\"]"));

			Opc3 .click();
			sleep(2000);
		
		}else if (tp1==true) {

			WebElement Opc3 = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			Opc3 .click();
			sleep(2000);
		}
		
		EstructuraDatosReferencia.click();
		sleep(2000);

		WebElement Opc4 = driver.findElement(By.xpath("//li[@id=\"option-1\"]"));

		Opc4 .click();
		sleep(2000);

		
		grupoEstructuraComparacao.click();
		sleep(2000);
		
		if (tq1 == true) {
			
			actionsMoveToElementXpath("//li[@id=\"option-8\"]");
			sleep(2000);
			
			WebElement Opc5 = driver.findElement(By.xpath("//li[@id=\"option-8\"]"));

			Opc5 .click();
			sleep(2000);

		}else if (tp1==true) {

			WebElement Opc5 = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			Opc5 .click();
			sleep(2000);
			
		}
		
		EstructuraDatosComparacao.click();
		sleep(2000);
		
		WebElement Opc5 = driver.findElement(By.xpath("//li[@id=\"option-1\"]"));

		Opc5.click();
		sleep(2000);


		String idRegistro = idObter2();
		System.out.println(idRegistro);

		primeroLeiaute.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(4000);

		versaoLeiauteReferencia.click();
		sleep(2000);
		versaoLeiauteOPC.click();
		sleep(2000);

		String idRegistro2 = idObter3();
		System.out.println(idRegistro2);


		segundoLeiaute.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro2+"\")]");
		sleep(2000);

		WebElement Opc1 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro2+"\")]"));

		Opc1 .click();
		sleep(4000);

		versaoLeiauteComparacao.click();
		sleep(2000);
		versaoLeiauteOPC.click();
		sleep(2000);
		
		caracteristicaEspacialReferencia.click();
		sleep(2000);
		
		caracteristicasOPC.click();
		sleep(2000);
		
		caracteristicaEspacialComparacao.click();
		sleep(2000);
		
		caracteristicasOPC.click();
		sleep(2000);
		
		validaDe.click();
		sleep(2000);
		
		
		validaDe.sendKeys("01/01/2013");
		validaDe.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(validaDe1);
		
		aplicar.click();
		sleep(2000);
		
		waitExpectElement(camino);
		sleep(2000);
		
		camino.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		registroPrimerDato.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(valorAjustePrimerDato, driver.findElement(By.xpath("//div[@class=\"areaCondition\"]/div[1]")));
		sleep(2000);
		
		registroSegundoDato.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(valorAjusteSegundoDato, driver.findElement(By.xpath("//div[@class=\"areaCondition\"]/div[3]")));
		sleep(2000);
		
		mensaje.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mensaje.sendKeys("test Massiel Aplicado");
		sleep(2000);
		
		operador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		operadorOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id =idObter4();

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id nuevo: " +idNuevo);
		idInserir5(idNuevo);

		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public void IdDFG() {
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		acessarDFGPO.acessarDFG();
		
		System.out.println("---------- Criar --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		
		abaConfiguraciones.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement raizABA = driver.findElement(By.xpath("//div[@class=\"baseTabs-view-wrapper\"]/div /div[2]/div/div[1]"));

			raizABA .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizABA = driver.findElement(By.xpath("//div[@class=\"baseTabs-view-wrapper\"]/div /div[2]/div/div[1]/div/div[1]"));

			raizABA .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idraizAba = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id Antes da Criação en Raiz Configuracoe: " +idraizAba);
		idInserir6(idraizAba);
		
	}
	
	public boolean CriarConfiguracoe() {
		
		novoConfiguracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeConfiguracoe.click();
		sleep(2000);
		
		nomeConfiguracoe.sendKeys("Test Massiel configuracao");
		nomeConfiguracoe.sendKeys(Keys.ENTER);
		
		String idRegistro = idObter2();
		System.out.println(idRegistro);

		primerLeiauteConfiguracoe.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(4000);

		versaoConfiguracoe.click();
		sleep(2000);

		versaoLeiauteOPC.click();
		sleep(2000);
		
		tributoConfiguracoe.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[@id=\"option-17\"]");
		tributoConfiguracoeOPC.click();
		sleep(2000);
		
		empresaConfiguracoe.click();
		sleep(2000);

		empresaConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(empresaConfiguracoe);
		
		ufConfiguracoe.click();
		sleep(2000);

		ufConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(ufConfiguracoe);
		
		filialConfiguracoe.click();
		sleep(2000);

		filialConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(filialConfiguracoe);
		
		fechaConfiguracoe.sendKeys("01/01/2013");
		fechaConfiguracoe.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechaConfiguracoeSpan);
		
		salvar.click();
		sleep(4000);
		
		waitExpectElement(siguiente);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id =idObter6();

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idNuevo);
		idInserir7(idNuevo);

		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		System.out.println(sucesso);
		return sucesso;
	}
	
	public boolean CriarConfiguracoe2() {
		
		novoConfiguracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeConfiguracoe.click();
		sleep(2000);
		
		nomeConfiguracoe.sendKeys("Test Massiel configuracao 2");
		nomeConfiguracoe.sendKeys(Keys.ENTER);
		
		String idRegistro = idObter3();
		System.out.println(idRegistro);

		primerLeiauteConfiguracoe.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(4000);

		versaoConfiguracoe.click();
		sleep(2000);

		versaoLeiauteOPC.click();
		sleep(2000);
		
		tributoConfiguracoe.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[@id=\"option-17\"]");
		tributoConfiguracoeOPC.click();
		sleep(2000);
		
		empresaConfiguracoe.click();
		sleep(2000);

		empresaConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(empresaConfiguracoe);
		
		ufConfiguracoe.click();
		sleep(2000);

		ufConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(ufConfiguracoe);
		
		filialConfiguracoe.click();
		sleep(2000);

		filialConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(filialConfiguracoe);
		
		fechaConfiguracoe.sendKeys("01/01/2013");
		fechaConfiguracoe.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechaConfiguracoeSpan);
		
		salvar.click();
		sleep(4000);
		
		waitExpectElement(siguiente);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id =idObter6();
		String id2 =idObter7();

		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String  idRegistro1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idRegistro1);
		idInserir8(idRegistro1);
		
		rows = rows-1;
		String  idRegistro2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idD2 = convertToDouble(id2);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD && idRegistroD2 == idD2) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public void ExecutarConfiguracao() {
		
		String idRegistro =idObter7();
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		executar.click();
		sleep(2000);

		waitExpectElement(executarConfiguracao);
		
		estado.click();
		sleep(3000);
		
		estadoOPC.click();
		sleep(3000);
	
		closeSelectTypeCheckbox(estado);
		sleep(3000);
		
		calendario.click();
		sleep(3000);
		
		flechacalendario.click();
		sleep(3000);
		
		anio.click();
		sleep(3000);
		
		mes.click();
		sleep(3000);
		
		periodo.click();
		sleep(3000);
		
		movimiento.click();
		sleep(3000);
		
		executarConfiguracao.click();
		sleep(3000);
		
		waitExpectElement(gravar);
		
		gravar.click();
		sleep(3000);
		
		biblioteca.click();
		sleep(3000);
	}
	
}
