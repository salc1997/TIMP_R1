package com.sap.timp.pageObjectModel.BCB;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class HierarquiaExecucoesTodasAsFuncionalidadesPO extends TestBaseKenssy{
	
	//CRIAR CONFIGURACION
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][3]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execu��o da Consolida��o\"]")
	public WebElement execucacoConsolidacao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configura��o\"]")
	public WebElement hierarquiaConfiguracao;

	//NUEVA HIERARQUIA
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement nova;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
	public WebElement nomeDeHierarquia;

	@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Aba\")]")
	public WebElement nomeDaAba;
	
	// Nome da Hierarquia
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Hierarquia\")]")
	public WebElement nomeDaHierarquia;
	
	@FindBy(xpath = "//div[@id=\"hierarchies\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
	public WebElement listaNomeDaAba;

	// Nome do Grupo
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Grupo\")]")
	public WebElement nomeDoGrupo;
	@FindBy(xpath = "//div[@id=\"groups\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
	public WebElement listaNomeDoHierarquia;

	// Nome do Campo de Linha
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Campo de Linha\")]")
	public WebElement nomeDoCampoDeLinha;
	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
	public WebElement listanomeDoSubnivel;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;

	@FindBy(xpath = "//div[@class=\"list-option selectAll\"][1]/div/div/label/span")
	public WebElement opcaoTodos;

	@FindBy(xpath = "//div[@id=\"sublevels\"]/div/div[@id=\"add-icon\"]")
	public WebElement adicionar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	// Configuracao
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
	public WebElement configuracoes;

	@FindBy(xpath = "//span[text()=\"Configura��o da Consolida��o\"]")
	public WebElement configuracaoDaConsolidacao;

	@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
	public WebElement nomeHirarquia;

	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//div[contains(@id,\"00\")]/div/label/span")
	public WebElement tributoO;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[contains(@id,\"1000\")]/div/label/span")
	public WebElement empresaO;

	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	@FindBy(xpath = "//div[contains(@id,\"SP\")]/div/label/span")
	public WebElement ufO;
	@FindBy(xpath = "//div[contains(@id,\"SP\")]/div/label/span")
	public WebElement ufO2;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[contains(@id,\"1000_SP_0001\")]/div/label/span")
	public WebElement filialO;
	@FindBy(xpath = "//div[contains(@id,\"1000_DF_0019\")]/div/label/span")
	public WebElement filialTc2;

	@FindBy(xpath = "//div[@id=\"calculation-type\"]/div/div/div[2]")
	public WebElement tipoApuracao;
	@FindBy(xpath = "//li[text()=\"3 - Outros\"]")
	public WebElement tipoApuracaoO;

	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravarC;

	@FindBy(xpath = "//span[contains(@class,\"icon-Calculator\")]")
	public WebElement calculator;

	@FindBy(xpath = "//span[contains(text(),\"Configura��o do Resultado Final\")]")
	public WebElement resultadoFinal;

	@FindBy(xpath = "//div[contains(@class,\"adjustments\")]/div/div/div[2]/div/div[2]/div/div/button")
	public WebElement adicionarConfiguracao;

	@FindBy(xpath = "//div[@id=\"condition\"]/div/div/div[2]")
	public WebElement condicao;
	@FindBy(xpath = "//li[text()=\"N�o Exibir\"]")
	public WebElement condacaoO;

	@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
	public WebElement criar;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	//ENTRADA MANUAL
	@FindBy(xpath = "//span[contains(@class,\"icon-textandtext\")]")
	public WebElement entrada;
	
	@FindBy(xpath = "//button[text()=\"Adicionar Entrada Manual\"]")
	public WebElement adicionarEntrada;
	
	@FindBy(xpath = "//button[text()=\"Adicionar Entrada Manual\"]")
	public WebElement entradaManualNome;
	
	@FindBy(xpath = "//div[@id=\"create-value\"]/div/div/input")
	public WebElement entradaManualValor;
	
	@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
	public WebElement criarAdicionarEntradaManual;
	
	
	// primer subnivel
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha1;
	@FindBy(xpath = "//li[text()=\"Entrada Manual\"]")
	public WebElement campoLinhaO1;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement entradaManual1;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement entradaManualO1;
	
	//EXECUTAR
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executar;
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executarM;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
	public WebElement paginaAnterior;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement ano2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement jan;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//span[text()=\"1Y\"]")
	public WebElement y1;
	
	@FindBy(xpath = "//div[contains(@class,\"execution-type\")]/div[2]/label/span")
	public WebElement execucaoAnalitica;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement executarB;
	
	
	
	
	
	
	
	
	
	
	
	public HierarquiaExecucoesTodasAsFuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarConfiguracaoExecucoes() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sleep(2000);
		execucoes.click();
		sleep(1000);
		execucacoConsolidacao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//GUARDO EL ULTIMO ID DE LA ULTIMA PAGINA DE EXECUCOES
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		System.out.println("Ultimo ID de Execucoes: "+id);
		System.out.println("");
		System.out.println("*************************");
		
		//IR A HIERARQUIA CONFIGURACAO
		sleep(2000);
		hierarquias.click();
		sleep(1000);
		hierarquiaConfiguracao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rowsH = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idH = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH + "]/div[4]/div"))
				.getText();
		System.out.println("Ultimo ID de Hierarquia Configuracao: "+idH);
		
		
		nova.click();
		sleep(3000);
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		nomeDeHierarquia.sendKeys("Prueba Automatizada de Hierarquia QA PREUBA 2");
		sleep(1000);

		nomeDaAba.sendKeys("Teste Automatizado");
		sleep(1000);
		
		actionsMoveToElementElement(nomeDoCampoDeLinha);
		sleep(1000);
		nomeDaHierarquia.sendKeys("Teste Automatizado");
		sleep(1000);
		listaNomeDaAba.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

		nomeDoGrupo.sendKeys("Teste Automatizado");
		sleep(1000);
		listaNomeDoHierarquia.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

		for (int i = 0; i < 8; i++) {
			adicionar.click();
			sleep(1000);
		}

		int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();
		System.out.println(subniveisAdicionados);

		String subniveisAdicionadosS = String.valueOf(subniveisAdicionados);

		sucesso.add(subniveisAdicionadosS.equals("9"));

		int f = 1;
		for (int i = 0; i < 9; i++) {

		}
		
		
		for (int i = 0; i < subniveisAdicionados; i++) {
			WebElement nomeDoSubnivel = driver
					.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f + "]/div[3]/div/div/input"));
			WebElement listoDoNomeDoGrupo = driver.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f
					+ "]/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]"));

			nomeDoSubnivel.sendKeys("Teste Automatizado " + f);
			sleep(1000);
			listoDoNomeDoGrupo.click();
			opcao.click();
			opcao.sendKeys(Keys.ESCAPE);
			sleep(1000);

			f = f + 1;
		}

		nomeDoCampoDeLinha.sendKeys("Teste Automatizado");
		sleep(1000);
		listanomeDoSubnivel.click();
		opcaoTodos.click();
		opcaoTodos.sendKeys(Keys.ESCAPE);

		sleep(1000);
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");

		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		String nome = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		System.out.println(nome);

		sucesso.add(nome.contains("Teste Automatizado"));

		idInserir1(id2);

		int id1I = convertToInt(idH);
		int id2I = convertToInt(id2);

		System.out.println("Id antes da cria��o: " + id1I);
		System.out.println("Id Ap�s a cria��o: " + id2I);

		if (id2I > id1I) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		return sucesso;
	}
	
	public boolean criarConfiguracao() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		System.out.println("Id Configura��es antes da cria��o: "+ id);
		
		nova.click();
		sleep(3000);

		attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(2000);

		nomeHirarquia.sendKeys("teste automatizado hierar");
		sleep(1000);
		nomeHirarquia.sendKeys(Keys.ENTER);
		sleep(1000);

		tributo.click();
		sleep(1000);
		tributoO.click();
		tributoO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		empresa.click();
		sleep(1000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		uf.click();
		sleep(1000);
		if (tc2==true) {
			ufO2.click();
			ufO2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			ufO.click();
			ufO.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		filial.click();
		sleep(1000);
		if (tc2==true) {
			filialTc2.click();
			filialTc2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			filialO.click();
			filialO.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}


		tipoApuracao.click();
		sleep(1000);
		tipoApuracaoO.click();
		sleep(1000);

		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);

		gravarC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		biblioteca.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(3000);
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		
		
		String idApos = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		idInserir2(idApos);
		System.out.println("Id Configura��es apos da cria��o: "+ idApos);
		
		
		int idI = convertToInt(id);
		int idAposI = convertToInt(idApos);
		
		boolean sucesso = false;
		
		if (idAposI > idI) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;

	}
	
	public void configurarConfiguracao() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
	
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(calculator);
		sleep(2000);
		
		calculator.click();
		sleep(1000);
		waitExpectElement(resultadoFinal);
		sleep(2000);
		resultadoFinal.click();
		sleep(1000);

		adicionarConfiguracao.click();
		sleep(1000);
		waitExpectElement(condicao);
		sleep(2000);
		condicao.click();
		sleep(1000);
		condacaoO.click();
		sleep(1000);

		criar.click();
		sleep(2000);
		fechar.click();
		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);
		
		
		entrada.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		adicionarEntrada.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		entradaManualNome.sendKeys("Teste Entrada Manual");
		sleep(1000);
		
		entradaManualValor.sendKeys("1000");
		sleep(1000);
		
		
		criarAdicionarEntradaManual.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		campolinha1.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(2000);
		
		entradaManual1.click();
		sleep(1000);
		entradaManualO1.click();
		sleep(2000);
		
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	}
	
	public void executar() {
			
		boolean tc2 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}
		
		
		sleep(1000);
		executarM.click();
		sleep(3000);
		waitExpectElement(executar);
		sleep(2000);
		executar.click();
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		periodo.click();
		sleep(3000);
		paginaAnterior.click();
		sleep(2000);
		ano2016.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		jan.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tc2 == true || tp1== true) {
			y1.click();
		}else {
			m1.click();
		}
		
		sleep(2000);
		execucaoAnalitica.click();
		sleep(1000);
		executarB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
	}	
}