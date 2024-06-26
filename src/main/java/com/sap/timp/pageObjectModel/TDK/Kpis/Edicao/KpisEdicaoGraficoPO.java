package com.sap.timp.pageObjectModel.TDK.Kpis.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBase;

public class KpisEdicaoGraficoPO extends TestBase {

	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's P�blicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"dashboardEditor-right-content\"]/div/div/div/ul/li[4]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//table[@class=\"createWidgetTable\"]/tbody/tr/td/button[@widgetop=\"1\"]")
	public WebElement grafico;

	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement criar;

	@FindBy(xpath = "//div[@id=\"group-charts\"]/div[1]")
	public WebElement columnas;

	@FindBy(xpath = "//div[@id=\"title\"]/div[2]/div/div/input")
	public WebElement titulo;

	@FindBy(xpath = "//div[@id=\"source\"]/div[2]/div/div/div[2]")
	public WebElement fonte;

	@FindBy(xpath = "//li[text()=\"Campos de Estrutura\"]")
	public WebElement fonteOPC;

	@FindBy(xpath = "//div[@id=\"structure-group\"]/div[2]/div/div[2]")
	public WebElement grupoEstructura;

	@FindBy(xpath = "//div[@id=\"structure\"]/div[2]/div/div[2]")
	public WebElement estructuraDatos;

	@FindBy(xpath = "//div[@id=\"dimensionField\"]/div/div[2]")
	public WebElement dimensao;
	
	@FindBy(xpath = "//div[@id=\"measure-format\"]/div/div/div[2]")
	public WebElement formatoMedida;

	@FindBy(xpath = "//div[@id=\"measuresField\"]/div/div/div[2]")
	public WebElement valoresMedida;

	@FindBy(xpath = "//span[text()=\"Filtros\"]")
	public WebElement filtros;

	@FindBy(xpath = "//span[text()=\"Adicionar Filtro\"]")
	public WebElement adicionarFiltros;

	@FindBy(xpath = "//div[@id=\"field-select-container\"]/div/div[2]")
	public WebElement tipoFiltro;
	
	@FindBy(xpath = "//span[text()=\"Adicionar condi��o\"]")
	public WebElement adicionarCondicao;
	
	@FindBy(xpath = "//input[@placeholder=\"Insira o Filtros\"]")
	public WebElement insiraFiltro;
	
	@FindBy(xpath = "//div[@class=\"filter-condition layout-row\"][2]/div[1]/div/div/div[2]")
	public WebElement operador;

	@FindBy(xpath = "//li[text()=\"OR\"]")
	public WebElement operadorOPC;
	
	@FindBy(xpath = "//div[@class=\"filter-condition layout-row\"][2]/div[4]/div/div/input")
	public WebElement insiraFiltro1;

	@FindBy(xpath = "//div[@class=\"filter-condition layout-row\"][3]/div[1]/div/div/div[2]")
	public WebElement operador2;

	@FindBy(xpath = "//li[text()=\"OR\"]")
	public WebElement operadorOPC2;

	@FindBy(xpath = "//div[@class=\"filter-condition layout-row\"][3]/div[4]/div/div/input")
	public WebElement insiraFiltro2;

	@FindBy(xpath = "//div[@class=\"filter-condition layout-row\"][4]/div[1]/div/div/div[2]")
	public WebElement operador3;

	@FindBy(xpath = "//li[text()=\"OR\"]")
	public WebElement operadorOPC3;

	@FindBy(xpath = "//div[@class=\"filter-condition layout-row\"][4]/div[4]/div/div/input")
	public WebElement insiraFiltro3;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   big ui-draggable\"]/div[3]/button[2]")
	public WebElement aceitar;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitarFiltros;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitarFiltros1;

	@FindBy(xpath = "//div[@class=\"grid-stack-item-content\"]/div/div[1]/button")
	public WebElement gra;

	@FindBy(xpath = "//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]")
	//@FindBy(xpath = "//div[@data-gs-width=\"7\"]/div[2]")
	public WebElement flechita;


	//@FindBy(xpath = "//div[@class=\"container-fluid\"]/div")

	//@FindBy(xpath = "//div[@id=\"UIComp_3\"]/*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"][1]/*[name()=\"rect\"][1]")
	@FindBy(xpath = "//div[contains(@id,\"UIComp_\")]/*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"][1]/*[name()=\"rect\"][1]")
	public WebElement mostrar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	//@FindBy(xpath = "//div[@id=\"UIComp_0\"]/*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"][1]/*[name()=\"rect\"]")
	@FindBy(xpath = "//div[contains(@id,\"UIComp_\")]/*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"][1]/*[name()=\"rect\"][1]")
	public WebElement mostrar1;
	

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"measuresField\"]//input")
	public WebElement txtValor;
	
	@FindBy(xpath = "//div[@id=\"field-select-container\"]//input")
	public WebElement txtFiltro;
	
	
	
	boolean sucesso;
	
	public KpisEdicaoGraficoPO () {
		PageFactory.initElements(driver, this);
	}

	public boolean Grafico() {
		
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
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		kpis.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("---------- Editar --------- " );
		String idRegistro =idObter("KpisCriar");

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		
		waitExpectedElement(adicionar);
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		grafico.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		criar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		columnas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		titulo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		titulo.sendKeys("Test Massiel");
		titulo.sendKeys(Keys.ENTER);
		sleep(2000);

		fonte.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			actionsMoveToElement("//li[@id=\"option-5\"]");
			sleep(3000);

			WebElement fonteOPC = driver.findElement(By.xpath("//li[@id=\"option-5\"]"));

			fonteOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			actionsMoveToElement("//li[@id=\"option-5\"]");
			sleep(2000);

			WebElement fonteOPC = driver.findElement(By.xpath("//li[@id=\"option-5\"]"));

			fonteOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			actionsMoveToElement("//li[@id=\"option-5\"]");
			sleep(2000);

			WebElement fonteOPC = driver.findElement(By.xpath("//li[@id=\"option-5\"]"));

			fonteOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		grupoEstructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);


		if (tq1 == true) {

			actionsMoveToElement("//li[@id=\"467\"]");
			sleep(1000);

			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @id and text()=\"Ajuste\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			actionsMoveToElement("//li[@id=\"468\"]");
			sleep(1000);

			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @id and text()=\"Ajuste\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			actionsMoveToElement("//li[@id=\"option-31\"]");
			sleep(2000);

			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @id and text()=\"Ajuste\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		estructuraDatos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		if (tq1 == true) {

			actionsMoveToElement("//li[@id=\"1834805491\"]");
			sleep(2000);

			WebElement estructuraDatosOPC = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @id and text()=\"Ajustes Fiscais\"]"));

			estructuraDatosOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			actionsMoveToElement("//li[@id=\"1834805491\"]");
			sleep(2000);

			WebElement estructuraDatosOPC = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @id and text()=\"Ajustes Fiscais\"]"));

			estructuraDatosOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			actionsMoveToElement("//li[@id=\"option-2\"]");
			sleep(3000);

			WebElement estructuraDatosOPC = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @id and text()=\"Ajustes Fiscais\"]"));

			estructuraDatosOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}

		dimensao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
	


		if (tq1 == true) {

			actionsMoveToElement("//li[@id=\"275\"]");
			sleep(3000);

			WebElement dimensaoOPC = driver.findElement(By.xpath("//li[@id=\"275\"]"));

			dimensaoOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			actionsMoveToElement("//li[@id=\"275\"]");
			sleep(2000);

			WebElement dimensaoOPC = driver.findElement(By.xpath("//li[@id=\"275\"]"));

			dimensaoOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {
			actionsMoveToElement("//li[@id=\"option-55\"]");
			sleep(2000);

			WebElement dimensaoOPC = driver.findElement(By.xpath("//li[@id=\"option-55\"]"));

			dimensaoOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}

		formatoMedida.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		if (tq1 == true) {

			WebElement formatoMedidaoOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			formatoMedidaoOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			WebElement formatoMedidaoOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			formatoMedidaoOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {
			WebElement formatoMedidaoOPC  = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			formatoMedidaoOPC  .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		valoresMedida.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);



		if (tq1 == true) {

			actionsMoveToElement("//div[@id=\"323\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"195\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"436\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"567\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"197\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"138\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"139\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"314\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"308\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"426\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"430\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"415\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"516\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"419\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"430\"]");
			sleep(1000);
			
			//Detalhe de conta (EC - encargos) - DP
			actionsMoveToElement("//div[@id=\"478\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"417\"]");
			sleep(1000);

			//Detalhe de conta (EC - encargos) - E250
			actionsMoveToElement("//div[@id=\"428\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"425\"]");
			sleep(1000);

			//Detalhe de conta (JR - juros) - E316
			actionsMoveToElement("//div[@id=\"515\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"413\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"514\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"420\"]");
			sleep(1000);
			
			//Detalhe de conta (OD - outras dedu��es) - E250
			actionsMoveToElement("//div[@id=\"431\"]");
			sleep(1000);
			
			//Detalhe de conta (PR - principal) - E116
			actionsMoveToElement("//div[@id=\"412\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"513\"]");
			sleep(1000);
			
			//Detalhe de conta (TT - total) - E116
			actionsMoveToElement("//div[@id=\"418\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"429\"]");
			sleep(1000);

			//Detalhe de conta (TX - taxas) - DP
			actionsMoveToElement("//div[@id=\"477\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"427\"]");
			sleep(1000);
			
			//Detalhe de conta (TX - taxas) - E316
			actionsMoveToElement("//div[@id=\"517\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"569\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"348\"]");
			sleep(1000);
			
			//Perc. redu��o BC ICMS ST
			actionsMoveToElement("//div[@id=\"347\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"352\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"181\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"182\"]");
			sleep(1000);
			
			//Qtd. BC PIS
			actionsMoveToElement("//div[@id=\"337\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"267\"]");
			sleep(1000);
			
			//Saldo de cr�dito fiscal acumulado para o per�odo seguinte
			actionsMoveToElement("//div[@id=\"532\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"535\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"531\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"495\"]");
			sleep(1000);
			
			//Valor COFINS
			actionsMoveToElement("//div[@id=\"208\"]");
			sleep(1000);
			
			actionsMoveToElement("//div[@id=\"198\"]");
			sleep(1000);

			WebElement valoresMedidaOPC = driver.findElement(By.xpath("//div[@id=\"201\"]/div/label/span"));

			valoresMedidaOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(valoresMedida);

		}else if (tc2==true) {

		
			txtValor.sendKeys("Valor ICMS");

			WebElement valoresMedidaOPC = driver.findElement(By.xpath("//div[@id=\"201\"]/div/label/span"));

			valoresMedidaOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(valoresMedida);
		}else {
			
			actionsMoveToElement("//div[@id=\"172\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"319\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"321\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"2\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"468\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"314\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"4\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"318\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"216\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"212\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"219\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"184\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"182\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"213\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"214\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"46\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"132\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"320\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"63\"]");
			sleep(1000);

			actionsMoveToElement("//div[@id=\"443\"]");
			sleep(1000);

			WebElement valoresMedidaOPC = driver.findElement(By.xpath("//div[@id=\"66\"]/div/label/span"));

			valoresMedidaOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(valoresMedida);


		}


		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		adicionarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		tipoFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			actionsMoveToElement("//li[@id=\"275\"]");
			sleep(3000);

			WebElement tipoFiltroOPC = driver.findElement(By.xpath("//li[@id=\"275\"]"));

			tipoFiltroOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			txtFiltro.sendKeys("CFOP legal");
			sleep(3000);
			
			WebElement formatoMedidaoOPC  = driver.findElement(By.xpath("//li[text()=\"CFOP legal\"]"));

			formatoMedidaoOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {
			WebElement formatoMedidaoOPC  = driver.findElement(By.xpath("//li[@id=\"option-55\"]"));

			formatoMedidaoOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		insiraFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro.sendKeys("6102");
		insiraFiltro.sendKeys(Keys.ENTER);

		adicionarCondicao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		operador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		operadorOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro1.sendKeys("1201");
		insiraFiltro1.sendKeys(Keys.ENTER);
		sleep(2000);

		adicionarCondicao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		operador2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		operadorOPC2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro2.sendKeys("1111");
		insiraFiltro2.sendKeys(Keys.ENTER);
		sleep(2000);


		adicionarCondicao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		operador3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		operadorOPC3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro3.sendKeys("1118");
		insiraFiltro3.sendKeys(Keys.ENTER);

		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tp1 == true) {

			aceitarFiltros1.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			aceitarFiltros.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}


		if (tq1 == true){

			actionsMoveToElement(gra);
			
			sleep(2000);
			moveToElement(flechita, driver.findElement(By.xpath("//div[@class=\"main-footer\"]/div[1]/div[3]")));
			sleep(2000);

		}else if (tc2 == true){

			actionsMoveToElement(gra);

			sleep(2000);
			moveToElement(flechita, driver.findElement(By.xpath("//div[@class=\"main-footer\"]/div[1]/div[3]")));
			sleep(2000);

		}else {
			
			actionsMoveToElement(gra);

			sleep(2000);
			moveToElement(flechita, driver.findElement(By.xpath("//div[@class=\"main-footer\"]/div[1]/div[3]")));
			sleep(2000);


		}



		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(4000);
		sleep(4000);

		

		if (tq1 == true ) {

			sucesso = mostrar.isDisplayed();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);

		}else if (tc2 == true){
			sucesso = mostrar.isDisplayed();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);


		}else {
			sucesso = mostrar1.isDisplayed();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
		}

		return sucesso;
	}



}
