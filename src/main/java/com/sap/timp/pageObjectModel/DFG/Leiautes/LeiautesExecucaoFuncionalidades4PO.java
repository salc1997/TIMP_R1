package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.sap.timp.base.TestBaseKenssy;

public class LeiautesExecucaoFuncionalidades4PO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;
	@FindBy(xpath = "//li[contains(text(),\"ALTER E-SOCIAL S1200\")]")
	public WebElement opcTipo;
	@FindBy(xpath = "//li[contains(text(),\"DCTF\")]")
	public WebElement opcTipo2;
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement opcGrupoEstructura;
	@FindBy(xpath = "//li[contains(text(),\"Ajuste\")][2]")
	public WebElement opcGrupoEstructura2;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcEstrutura;
	@FindBy(xpath = "//*[@id=\"inputValidFrom\"]/div/div[1]/input")
	public WebElement dataVigencia;
	@FindBy(xpath = "//*[@id=\"inputLayoutVersion\"]/div/div[1]/input")
	public WebElement versaoLeiaute;
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	//SEPARADORES
	@FindBy(xpath = "//button/span[2][text()=\"Separadores\"]")
	public WebElement separadores;
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button/span")
	public WebElement flecha;
	@FindBy(xpath = "//input[@placeholder=\"Sem separador\"]")
	public WebElement inputSeparador;
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement incluirIniciodeLinha;
	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement incluirFindeLinha;
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
		
	
	//BLOCOS Y REGISTROS
	@FindBy(xpath = "//button/span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	//BLOCO 1 - REGISTRO 1
		@FindBy(xpath = "//div[@block-id=\"0\"]/div/div/div[3]/button")
		public WebElement adicionarRegistro1;
		
		@FindBy(xpath = "//div[@block-id=\"0\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreBloco1;
		@FindBy(xpath = "//div[@block-id=\"0\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreRegistro1;
		
		@FindBy(xpath = "//li[@data-id=\"initialDateReference\"]/div/div/span[contains(text(),\"Data Inicial de Referência\")][1]")
		public WebElement dataInicialDeReferencia;
		
		@FindBy(xpath = "//div[@class=\"select-year inputs medium\"]/div/div/div[2]")
		public WebElement anio;
		@FindBy(xpath = "//li[contains(text(),\"AAAA\")]")
		public WebElement opcAnio;
		@FindBy(xpath = "//div[@class=\"select-month inputs medium\"]/div/div/div[2]")
		public WebElement mes;
		@FindBy(xpath = "//li[contains(text(),\"MM\")]")
		public WebElement opcMes;
		@FindBy(xpath = "//div[@class=\"select-day inputs medium\"]/div/div/div[2]")
		public WebElement dia;
		@FindBy(xpath = "//li[contains(text(),\"DD\")]")
		public WebElement opcDia;
		
		@FindBy(xpath = "//input[@placeholder=\"Separadores\"]")
		public WebElement separadores1;
		
		@FindBy(xpath = "//li[@data-id=\"newline\"]/div/div/span[contains(text(),\"Salto de Linha\")][1]")
		public WebElement saltoDeLinha;
		
		@FindBy(xpath = "//li[@data-id=\"finalDateReference\"]/div/div/span[contains(text(),\"Data Final de Referência\")][1]")
		public WebElement dataFinalDeReferencia;
		
		@FindBy(xpath = "//li[@data-id=\"v\"]/div/div/span[contains(text(),\"Versão\")][1]")
		public WebElement versao;
		
		@FindBy(xpath = "//div[@id=\"VersionField\"]/div/div/input")
		public WebElement versaoValor;
		
		@FindBy(xpath = "//li[@data-id=\"HRE\"]/div/div/span[contains(text(),\"Hora da Execução do Arquivo\")][1]")
		public WebElement horaDaExecucao;
		
		@FindBy(xpath = "//li[@data-id=\"DTE\"]/div/div/span[contains(text(),\"Data da Execução do Arquivo\")][1]")
		public WebElement dataDaExecucao;
		
		@FindBy(xpath = "//li[@data-id=\"sp\"]/div/div/span[contains(text(),\"Período de Referência\")][1]")
		public WebElement periodoDaReferencia;
		
		
	//arrastrar 1
	//div[@block-id="0"]/div[@class="columns-container"]/div
	
	//BLOCO 2 - REGISTRO 2
	@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[3]/button")
	public WebElement adicionarRegistro2;
	
	@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreBloco2;
	@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreRegistro2;
	
	
	//BLOCO 3 - REGISTRO 3
	@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[3]/button")
	public WebElement adicionarRegistro3;
	
	@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreBloco3;
	@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreRegistro3;
	
	
	//BLOCO 4 - REGISTRO 4
	@FindBy(xpath = "//div[@block-id=\"3\"]/div/div/div[3]/button")
	public WebElement adicionarRegistro4;
	
	@FindBy(xpath = "//div[@block-id=\"3\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreBloco4;
	@FindBy(xpath = "//div[@block-id=\"3\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreRegistro4;
	
	
	//BLOCO 5 - REGISTRO 5
	@FindBy(xpath = "//div[@block-id=\"4\"]/div/div/div[3]/button")
	public WebElement adicionarRegistro5;
	
	@FindBy(xpath = "//div[@block-id=\"4\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreBloco5;
	@FindBy(xpath = "//div[@block-id=\"4\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreRegistro5;
	
	
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
		
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Bloco\"]")
	public WebElement nombreBloco;
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Registro\"]")
	public WebElement nombreRegistro;
	
	@FindBy(xpath = "//div/span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement abaAjusteFiscais;
	@FindBy(xpath = "//div/span[text()=\"Ajustes\"][1]")
	public WebElement subAbaAjusteFiscais;
	
	@FindBy(xpath = "//div/span[contains(text(),\"Código da empresa\")]")
	public WebElement codigoEmpresa;
	@FindBy(xpath = "//div/span[contains(text(),\"Código da filial\")]")
	public WebElement codigoFilial;
	@FindBy(xpath = "//div/span[contains(text(),\"Data de lançamento\")]")
	public WebElement dataLanzamento;
	@FindBy(xpath = "//li[14]/div/div/span[contains(text(),\"Valor do ajuste\")][1]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//div/span[text()=\"Campos Especiais\"][1]")
	public WebElement abaCamposEspeciais;
	
	@FindBy(xpath = "//li[17]/div/div/span[contains(text(),\"Data/Hora da Execução do Arquivo\")][1]")
	public WebElement dataHoraExecucaco;
	
//	@FindBy(xpath = "//div[@class=\"select-year inputs medium\"]/div/div/div[2]")
//	public WebElement anio;
//	@FindBy(xpath = "//li[contains(text(),\"AAAA\")]")
//	public WebElement opcAnio;
//	@FindBy(xpath = "//div[@class=\"select-month inputs medium\"]/div/div/div[2]")
//	public WebElement mes;
//	@FindBy(xpath = "//li[contains(text(),\"MM\")]")
//	public WebElement opcMes;
//	@FindBy(xpath = "//div[@class=\"select-day inputs medium\"]/div/div/div[2]")
//	public WebElement dia;
//	@FindBy(xpath = "//li[contains(text(),\"DD\")]")
//	public WebElement opcDia;
	@FindBy(xpath = "//div[@class=\"select-hour inputs medium\"]/div/div/div[2]")
	public WebElement hora;
	@FindBy(xpath = "//li[contains(text(),\"HH\")]")
	public WebElement opcHora;
	@FindBy(xpath = "//div[@class=\"select-min inputs medium\"]/div/div/div[2]")
	public WebElement minutos;
	@FindBy(xpath = "//li[contains(text(),\"MI\")]")
	public WebElement opcMinutos;
	@FindBy(xpath = "//div[@class=\"select-sec inputs medium\"]/div/div/div[2]")
	public WebElement segundos;
	@FindBy(xpath = "//li[contains(text(),\"SS\")]")
	public WebElement opcSegundos;
	@FindBy(xpath = "//div[@class=\"select-ff inputs medium\"]/div/div/div[2]")
	public WebElement ff;
	@FindBy(xpath = "//li[contains(text(),\"FF7\")]")
	public WebElement opcFF;
	
//	@FindBy(xpath = "//input[@placeholder=\"Separadores\"]")
//	public WebElement separadores2;
	
	@FindBy(xpath = "//li[12]/div/div/span[contains(text(),\"Contador Linhas de Registro\")][1]")
	public WebElement contadorLinhas;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public LeiautesExecucaoFuncionalidades4PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarLeiaute() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		String idLeiaute = "0";
		
		if(rows > 0) {
			idLeiaute = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
			System.out.println(idLeiaute);
		}
		
		

		System.out.println(idLeiaute + " ultimo id Leiaute");
		
		
		System.out.println("");
		System.out.println("------------------------CRIAR LEIAUTE-------------------");
		System.out.println("");
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado kenssy");
		sleep(1000);
		String nomeValor = nome.getAttribute("value");
		System.out.println("nombreInicial "+nomeValor);
		
		tipo.click();
		sleep(2000);
		
		if (tq1 == true) {
			opcTipo.click();
			sleep(1000);
//			String tipoT = opcTipo.getText();
//			System.out.println(tipoT);
		}else if (tc2 ==true) {
			opcTipo2.click();
			sleep(1000);
			
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcTipo.click();
			sleep(1000);
//			String tipoT = opcTipo.getText();
//			System.out.println(tipoT);
		}
		
		
		
		sleep(1000);
		actionsMoveToElementElement(versaoLeiaute);
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		
		if (tq1 == true) {
			opcGrupoEstructura.click();
			sleep(1000);
		}else if (tc2 ==true) {
			opcGrupoEstructura2.click();
			sleep(1000);
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcGrupoEstructura2.click();
			sleep(1000);
		}
		
		estrutura.click();
		sleep(1000);
		opcEstrutura.click();
		sleep(1000);
		opcEstrutura.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versaoLeiaute.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		sleep(3000);
		//waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O leiaute foi criado com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public void  separadores() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!separadores.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		separadores.click();
		sleep(2000);
		
		inputSeparador.sendKeys("|");
		sleep(2000);
		
		incluirIniciodeLinha.click();
		sleep(2000);
		
		incluirFindeLinha.click();
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		System.out.println("");
		System.out.println("------------------------BLOCOS Y REGISTROS-------------------");
		System.out.println("");
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//ADICIONAR 5 BLOCOS
		//DEBEN ADICIONARSE UNO POR UNO
		
		//for (int i = 0; i < 5; i++) {
			adicionarBloco.click();
			//sleep(2000);
		//}
		
		
		//BLOCO 1 - REGISTRO 1
		
		
//		nombreBloco.sendKeys("1");
//		sleep(2000);
//		
//		nombreRegistro.sendKeys("1");
//		sleep(2000);
//		
//		abaAjusteFiscais.click();
//		sleep(2000);
//		
//		subAbaAjusteFiscais.click();
//		sleep(2000);
//		
//		//ARRASTRAR ELEMENTOS
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
//		sleep(2000);
//		
//		
//		abaCamposEspeciais.click();
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		moveToElement(dataHoraExecucaco, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
//		sleep(2000);
//		
//		waitExpectElement(anio);
//		sleep(2000);
//		
//		anio.click();
//		sleep(2000);
//		opcAnio.click();
//		sleep(2000);
//		
//		mes.click();
//		sleep(2000);
//		opcMes.click();
//		sleep(2000);
//		
//		dia.click();
//		sleep(2000);
//		opcDia.click();
//		sleep(2000);
//		
//		hora.click();
//		sleep(2000);
//		opcHora.click();
//		sleep(2000);
//		
//		minutos.click();
//		sleep(2000);
//		opcMinutos.click();
//		sleep(2000);
//		
//		segundos.click();
//		sleep(2000);
//		opcSegundos.click();
//		sleep(2000);
//		
//		ff.click();
//		sleep(2000);
//		opcFF.click();
//		sleep(2000);
//		
//		separadores2.sendKeys(":");
//		sleep(2000);
//		
//		aplicar.click();
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		moveToElement(contadorLinhas, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
//		sleep(2000);
//		
//		waitExpectElement(aplicar);
//		sleep(2000);
//		
//		aplicar.click();
//		sleep(2000);
//		
//		gravar.click();
//		sleep(3000);
//		waitExpectElement(nao);
//		sleep(2000);
//		nao.click();
//		sleep(2000);
//		waitExpectElement(sim);
//		sleep(2000);
//		sim.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
//		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
//		System.out.println(mensaje);
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (mensaje > 0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		return sucesso;
		
	}
	
	public ArrayList<Boolean> dataInicialDeReferencia() {
		sleep(2000);
		adicionarRegistro1.click();
		sleep(2000);
		
		nombreBloco1.sendKeys("1");
		sleep(2000);
		
		nombreRegistro1.sendKeys("1");
		sleep(2000);
		
		abaCamposEspeciais.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataInicialDeReferencia, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> saltodeLinha() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(saltoDeLinha, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> dataFinalDeReferencia() {
//		sleep(2000);
//		adicionarRegistro1.click();
//		sleep(2000);
//		
//		nombreBloco1.sendKeys("1");
//		sleep(2000);
//		
//		nombreRegistro1.sendKeys("1");
//		sleep(2000);
//		
//		abaCamposEspeciais.click();
//		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataFinalDeReferencia, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> versao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(versao, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		versaoValor.sendKeys("2");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> horaDaExecucao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(horaDaExecucao, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcHora.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMinutos.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcSegundos.click();
		sleep(2000);
		
		separadores1.sendKeys(":");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> dataDaExecucao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataDaExecucao, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> periodoDaReferencia() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(periodoDaReferencia, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	//BLOCO 2 - REGISTRO 2
	
	public void name() {
		
	}
}
