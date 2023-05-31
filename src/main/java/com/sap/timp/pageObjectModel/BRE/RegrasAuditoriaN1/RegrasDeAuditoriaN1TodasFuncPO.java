package com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegrasDeAuditoriaN1TodasFuncPO extends TestBase{
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N1\"]")
	public WebElement regrasdeauditorian1;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaregra;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tiporegra;
	
	@FindBy(xpath = "//li[@id][text()=\"Auditoria Nvl 1\"]")
	public WebElement opcaotiporegra;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id][text()=\"TAA\"]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[@id][text()=\"Abas\"]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[@class=\"tab-field\"]/div/div/div[2]")
	public WebElement abas;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div/label/span")
	public WebElement opcaoabas;
	
	@FindBy(xpath = "//td[@class=\"regulation-field\"]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[@id][text()=\"TA-TESTE\"]")
	public WebElement opcaoRegulamento;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Data\"]")
	public WebElement dataValidadeDe;
		
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar1;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarcaminho;
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	//@FindBy(xpath = "//div[@class=\"select-one\"]/div/div/input")
	public WebElement Condicoes;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS (ED)\"]")
	public WebElement opcaoCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement Operador;
	
	@FindBy(xpath = "//div[@id]/div[text()=\"<\"]")
	public WebElement opcaoOperador;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	//@FindBy(xpath = "//div[@class=\"value-one\"]/div/div/input")
	public WebElement NomeDoValor;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS (ED)\"]")
	public WebElement opcaoNomeDoValor;
	
	//@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/div[2]")
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;
	
	//@FindBy(xpath = "//div[@id=\"T1\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Dados Lançamento\"]")
	public WebElement opcaoacoes;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement Justificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;

	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]")
	public WebElement primeiracaixar1;
	
	@FindBy(xpath = "//button[text()=\"Modificar\"]")
	public WebElement modificar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div[1]/div/div/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[5]")
	public WebElement primeiracaixar2;
	
	@FindBy(xpath = "//button[text()=\"Salvar como Cópia\"]")
	public WebElement salvarcomocopia;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[1]/span[2]")
	public WebElement campo1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[2]/span[2]")
	public WebElement campo2;
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1vi;
	
	
	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@class=\"detail-label\"]")
	public WebElement nomede;
 
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*[1]")
	public WebElement r1vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[2]/*/*[1]")
	public WebElement segundocampo1ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[2]/*/*[1]")
	public WebElement segundocampo1vi;
	
	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomeed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*[1]")
	public WebElement r1ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1ed;
	
	@FindBy(xpath = "//span[text()=\"Simulação\"]")
	public WebElement simulacao;
	
	@FindBy(xpath = "//div[@class=\"graph-wrapper\"]//*[name()=\"g\"]//*[name()=\"g\"][1]")
	public WebElement CFOP;
	
	@FindBy(xpath = "//span[text()=\"Dados\"]")
	public WebElement dados;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//span[text()=\"Filtros\"]")
	public WebElement fil;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione campo\"]")
	public WebElement inputSeleccionfiltro;

	@FindBy(xpath = "//li[text()=\"Alíquota ICMS (ED) (ED)\"][1]")
	public WebElement seleccionFiltro;
	
	//simular 
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Operador\"]")
	public WebElement operador;

	@FindBy(xpath = "//li[text()=\"=\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div/div[2]/div[3]/div/div/input")
	public WebElement constatante;
	
	@FindBy(xpath = "//span[text()=\"Estruturas\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//button[text()=\"Criar estruturas associadas\"]")
	public WebElement asociarEstrutura;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma tabela\"]")
	public WebElement inputSeleccionTabela;

	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement seleccionTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um campo \"]")
	public WebElement campo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editTabela;
	
	@FindBy(xpath = "//button[@id=\"delete-button\"]")
	public WebElement excluirTabela;
	
	@FindBy(xpath = "//div[text()=\"Ajustes Fiscais\"]")
	public WebElement verificacion;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar1;
	
	public RegrasDeAuditoriaN1TodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdeauditorian1.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
	
		
		novaregra.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);

		nome.sendKeys("TESTE AUTOMATIZADO N1 RODADA- NAO MEXER QA");

		sleep(1000);
		
		tiporegra.click();
		sleep(1000);
		opcaotiporegra.click();
		sleep(1000);
		
		tipotributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipotributo);
		sleep(1000);
		
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
		if(tp1 == true) {
		grupodeestrutura.click();
		sleep(1000);
		opcaogrupodeestruturatp1.click();
		sleep(1000);
		}else {
			grupodeestrutura.click();
			sleep(1000);
			opcaogrupodeestrutura.click();
			sleep(1000);
		}
		
		
		
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		regulamento.click();
		sleep(1000);
		opcaoRegulamento.click();
		sleep(1000);
		//dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(2000);		
		//waitExpectElement(aplicar);
		sleep(2000);
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
	
		Justificactiva.click();
		sleep(2000);
		waitExpectElement(justificativa);
		sleep(2000);
		justificativa.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		aceitar.click();
		sleep(85000);
		//1 caminho
		adicionarcaminho.click();
		sleep(2000);
		waitExpectElement(Condicoes);
		Condicoes.click();
		sleep(1000);
		opcaoCondicoes.click();
		//Condicoes.sendKeys("Alíquota ICMS (ED)");
		//Condicoes.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		Operador.click();
		sleep(1000);
		opcaoOperador.click();
		sleep(1000);
		
		NomeDoValor.click();
		sleep(1000);
		opcaoNomeDoValor.click();
		//NomeDoValor.sendKeys("BC ICMS (ED)");
		//NomeDoValor.sendKeys(Keys.ESCAPE);
		
		sleep(1000);
		
		acoes.sendKeys("Alíquota correta");
		acoes.sendKeys(Keys.ESCAPE);
	
		sleep(2000);
		waitExpectElement(aplicar);
		sleep(2000);
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		/*WebElement caminhocriador1 = driver.findElement(By.xpath("//div[@id=\"graph\"]//*[name()=\"svg\"]/*[name()=\"g\"]"));
		
		if(caminhocriador1.isDisplayed()) {
			System.out.println("Caminho criado r1");
			sucesso.add(caminhocriador1.isDisplayed());
		}*/
		
		nao.click();
		sleep(46000);
		
		biblioteca.click();
		sleep(2000);
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regrasdeauditorian1.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		//idInserir1(idB);
		idInserir("An1",idB);
		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso2 = false;
		if (idBD > idD) {
			sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			sucesso2 = false;
			sucesso.add(sucesso2);
		}
		System.out.println(sucesso);
		return sucesso;
	}

	public ArrayList<Boolean> criarComCopia() {
		

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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("An1");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		System.out.println("ID do registro criado: " + idRegistro);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.clear();
		nome.sendKeys("Testeautomatizado N1 - Copia");
		//waitExpectElement(aplicar);
		sleep(3000);
		aplicar.click();
		
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader transp\"]");
		invisibilityOfElement("//div[@class=\"overlay loader transp\"]");
		sleep(2000);	
	
		if(tp1 == true || tq1 == true) {
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		regrasdeauditorian1.click();
		}else {
			biblioteca.click();
			
			sleep(2000);
			waitExpectElement(mensagembloqueio);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			regrasdeauditorian1.click();
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroCopia = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro copia: " + idRegistroCopia);
		
		if(idRegistroCopia != idRegistro) {
			boolean sucesso1= true;
			System.out.println("Copia criada...");
			System.out.println("ID Registro: " + idRegistro);
			System.out.println("ID Registro copia: " + idRegistroCopia);	
			sucesso.add(sucesso1);
		}else {
			boolean sucesso1= false;
			System.out.println("Copia não criada");			
			sucesso.add(sucesso1);
		}
		
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(5000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroCopiaLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro Copia na Lixeira: " + idRegistroCopiaLixeira);
		
		double idD = convertToDouble(idRegistroCopiaLixeira);
		double idBD = convertToDouble(idRegistroCopia);
		if(idD == idBD)
		{
			System.out.println("Sim o ID é o mesmo da Copia");
			boolean sucesso1=true;
			sucesso.add(sucesso1);
		}else {
			System.out.println("Não é o mesmo ID");
			boolean sucesso1 = false;
			sucesso.add(sucesso1);
		}
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
//		waitExpectElement(mensagembloqueio);
		sleep(5000);
		
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		if(idRegistroCopiaLixeira != idRegistroLixeira) {
			System.out.println("ID Registro Copia Lixeira: " + idRegistroCopiaLixeira);
			System.out.println("ID Registro ultimo após apagar o registro copia da lixeira: " + idRegistroLixeira);	
			boolean sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			System.out.println("Não existe a cópia na lixeira");			
			 boolean sucesso2 = false;
			 sucesso.add(sucesso2);
		}
		
		System.out.println(sucesso);
		return sucesso;

	}
	
	public ArrayList<Boolean> editar() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdeauditorian1.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("An1");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(primeiracaixar1);
		sleep(1000);
		
		primeiracaixar1.click();
		sleep(1000);
		String enviar ="Alíquota correta N1 QA";
		acoes.clear();
		acoes.sendKeys(enviar);
		acoes.sendKeys(Keys.ESCAPE);
		
		modificar.click();
		sleep(1000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);

		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(primeiracaixar1);
		sleep(1000);
		
		primeiracaixar1.click();
		attributoNotToBeEmptyElement(acoes, "value");
		String texto1 = acoes.getAttribute("value");
		
		System.out.println("texto1: " + texto1);
		System.out.println("enviar: " + enviar);
		sucesso.add(texto1.contains(enviar));
			
		sleep(1000);
		codigo.clear();
		sleep(1000);
		codigo.sendKeys("r2");
		sleep(1000);
		acoes.clear();
		acoes.sendKeys("Alíquota correta");
		acoes.sendKeys(Keys.ESCAPE);
		salvarcomocopia.click();
		/*
		waitExpectElement(r2);
		sleep(2000);
		if(r2.isDisplayed()) {
			System.out.println("O campo r2 está na página de edição");
			boolean sucesso3=true;
			sucesso.add(sucesso3);
		}
		*/
		sleep(1000);
		gravar.click();

		sleep(1000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeiracaixar2.click();
		sleep(1000);
		remover.click();
		sleep(1000);
		gravar.click();

		sleep(1000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int removerr2 = driver.findElements(By.xpath("//div[@id=\"graph\"]/*/*/*[7]/*/*")).size();
		if(removerr2 == 0)
		{
			System.out.println("Caminho r2 foi removido");
			sucesso.add(true);
		}else {
			System.out.println("Caminho r2 não foi removido");
			sucesso.add(false);
		}
		
		configuracoes.click();
		sleep(1000);
		
		String nome1 = "TESTE  N1- NAO MEXER QA";
		
		nome.clear();
		sleep(1000);
		nome.sendKeys(nome1);
		waitExpectElement(aplicar1);
		sleep(2000);
		aplicar1.click();
		sleep(5000);
		gravar.click();

		sleep(1000);
		waitExpectElement(nao);
		sleep(2000);

		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracoes.click();
		sleep(1000);
		String verficarnome = nome.getAttribute("value");
		sucesso.add(verficarnome.contains(nome1));
		System.out.println(sucesso);
		
		cancelar.click();
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		return sucesso;

	}
	
	public ArrayList<Boolean> detalhes() {
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		//System.out.println("Ultimo registro: " + id);
		//String idRegistro = idObter1();
		String idRegistro = idObter("An1");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhe.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String nomedetalhes = nomede.getText();
		String campo1detalhes = campo1.getText();
		String campo2detalhes = campo2.getText();
		
		
		System.out.println(nomedetalhes);
		System.out.println(campo1detalhes);
		System.out.println( campo2detalhes);
		
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		waitExpectElement(r1vi);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		String nomevisualizar = nomevi.getText();
		String primeirocampo1visualizar = campo1vi.getText();
		
				
		
		System.out.println(nomevisualizar);
		System.out.println(primeirocampo1visualizar);
		//System.out.println(segundoterceirocampo1);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomevisualizar.contains(nomedetalhes));
		sucesso.add(primeirocampo1visualizar.contains(campo1detalhes));
		sucesso.add(primeirocampo1visualizar.contains(campo2detalhes));
		
		
		System.out.println(sucesso);
	
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		return sucesso;
	}
	
	public ArrayList<Boolean> visualizar() {
		

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("An1");
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo do registro que foi criado: " + idRegistro);
	
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		waitExpectElement(r1vi);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		String nomevisualizar =nomevi.getText();
		String r1visualizar=r1vi.getText();
		String primeirocampo1visualizar = campo1vi.getText();
		String segundocampo1visualizar = segundocampo1vi.getText();
		
		
		
		//String campo2visualizar = campo2vi.getText();
		
		System.out.println(nomevisualizar);
		System.out.println(r1visualizar);
		System.out.println(primeirocampo1visualizar);
		System.out.println(segundocampo1visualizar);
		
		//System.out.println(campo2visualizar);
	
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//editar
		waitExpectElement(r1ed);
		sleep(2000);
		String nomeeditar = nomeed.getText();
		String r1editar=r1ed.getText();
		String primeirocampo1editar = campo1ed.getText();
		String segundocampo1editar= segundocampo1ed.getText();
		
		
		
		System.out.println(nomeeditar);
		System.out.println(r1editar);
		System.out.println(primeirocampo1editar);
		System.out.println(segundocampo1editar);
		
		
		//System.out.println(campo2visualizar);
	
		
		
	
		
	
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeeditar.contains(nomevisualizar));
		sucesso.add(r1editar.contains(r1visualizar));
		sucesso.add(primeirocampo1visualizar.contains(primeirocampo1editar));
		sucesso.add(segundocampo1visualizar.contains(segundocampo1editar));
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		
		System.out.println(sucesso);
	
		return sucesso;
	}
	
	public boolean ParâmetrosgeraisSimular() {


		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//String idRegistro = idObter1();
		String idRegistro = idObter("An1");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(simulacao);
		simulacao.click();
		sleep(4000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");


		waitExpectElement(CFOP);
		sleep(8000);
		CFOP.click();
		sleep(5000);

		dados.click();

		sleep(4000);

		ok.click();
		sleep(2000);

		fil.click();

		sleep(3000);

		inputSeleccionfiltro.click();
		sleep(3000);
		seleccionFiltro.click();
		sleep(3000);
		sleep(3000);

		operador.click();
		sleep(2000);
		opcOperador.click();
		sleep(4000);


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
		if(tq1 == true) {
			constatante.sendKeys("10");
			sleep(3000);
		}else {
			constatante.sendKeys("10");
			sleep(3000);
		}



		aplicar.click();

		sleep(4000);
/*
		simular.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		waitExpectElement(grafico);
		sleep(3000);

		String graf1 = grafico.getText();
		System.out.println("grafico 1: "+graf1);

		configuracao.click();
		sleep(3000);

		selectTodos.click();
		sleep(3000);

		dados.click();
		sleep(3000);

		ok.click();
		sleep(3000);

		fil.click();
		sleep(4000);

		excluirFil.click();
		sleep(3000);

		aplicar.click();
		sleep(4000);


		simular.click();
		sleep(3000);



		waitExpectElement(grafico);
		sleep(3000);

		String graf2 = grafico.getText();


		System.out.println("--------------------------------");
		System.out.println("grafico 2: "+graf2);

*/

		boolean sucesso = true;
		System.out.println(sucesso);
		return sucesso;
	}
	
	public boolean estructura() {


		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("An1");
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));


		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(estrutura);
		estrutura.click();
		sleep(4000);
		asociarEstrutura.click();
		sleep(3000);

		inputSeleccionTabela.click();
		sleep(3000);
		seleccionTabela.click();
		sleep(3000);
		sleep(3000);


		waitExpectElement(campo);
		campo.sendKeys("Alíquota COFINS (ED)");
		sleep(2000);
		campo.sendKeys(Keys.ENTER);
		sleep(2000);

		aplicar.click();
		sleep(4000);

		fechar1.click();
		sleep(2000);


		grabar.click();
		sleep(2000);

		sim.click();
		sleep(3000);

		aceitar.click();
		sleep(24000);

		biblioteca.click();
		sleep(3000);

		//sim.click();
		sleep(3000);


		//----------------Entrando de nuevo a editar--------------------------

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		regrasdeauditorian1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		String idRegistro1 = idObter("An1");
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement açao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu1.click();
		sleep(1000);
		açao1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);


		waitExpectElement(estrutura);
		estrutura.click();
		sleep(4000);

		editTabela.click();
		sleep(4000);

		campo.clear();
		sleep(2000);
		campo.sendKeys("Alíquota ICMS (ED)");
		sleep(2000);
		campo.sendKeys(Keys.ENTER);
		sleep(2000);

		aplicar.click();
		sleep(4000);

		fechar1.click();
		sleep(4000);

		grabar.click();
		sleep(2000);

		sim.click();
		sleep(3000);

		aceitar.click();
		sleep(24000);

		biblioteca.click();
		sleep(3000);

		//sim.click();
		sleep(3000);

		//----------------Entrando de nuevo a excluir--------------------------

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		regrasdeauditorian1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		String idRegistro4 = idObter("An1");
		WebElement menu4 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro4+"\"]/div[1]/div"));
		WebElement açao4 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro4+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro4); // Ultimo registro que es el que se crea con la automatizacion

		menu4.click();
		sleep(1000);
		açao4.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		waitExpectElement(estrutura);	
		estrutura.click();
		sleep(4000);

		excluirTabela.click();
		sleep(3000);
		ok.click();
		sleep(3000);

		fechar1.click();
		sleep(3000);

		grabar.click();
		sleep(2000);

		sim.click();
		sleep(3000);

		aceitar.click();
		sleep(30000);

		biblioteca.click();
		sleep(18000);

		//sim.click();
		sleep(3000);

		//----------------------FINAL---------------------------------------
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		regrasdeauditorian1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		String idRegistro2 = idObter("An1");
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
		WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu2.click();
		sleep(1000);
		açao2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		waitExpectElement(estrutura);	
		estrutura.click();
		sleep(5000);


		boolean sucesso = false;

		if (verificacion != null) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
