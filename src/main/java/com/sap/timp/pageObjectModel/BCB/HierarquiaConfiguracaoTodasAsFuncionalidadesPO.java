package com.sap.timp.pageObjectModel.BCB;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sap.timp.base.TestBaseSteven;

public class HierarquiaConfiguracaoTodasAsFuncionalidadesPO extends TestBaseSteven {

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configura��o\"]")
	public WebElement hierarquiaConfiguracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][1]")
	public WebElement siguiente;

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

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[contains(@id,\"1000_SP_0001\")]/div/label/span")
	public WebElement filialO;

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

	// primer subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha1;
	@FindBy(xpath = "//li[text()=\"Relat�rio\"]")
	public WebElement campoLinhaO1;

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio1;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor1;

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"filters-button-container\"]/button")
	public WebElement filtros1;

	@FindBy(xpath = "//span[text()=\"Adicionar Filtro\"]")
	public WebElement adicionarFiltro;

	@FindBy(xpath = "//div[@id=\"field-select-container\"]/div/div[2]")
	public WebElement listaValorDoAjuste1;

	@FindBy(xpath = "//li[text()=\"Valor do ajuste\"]")
	public WebElement listaValorAjusteO1;

	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]")
	public WebElement operador1;
	@FindBy(xpath = "//div[text()=\">\"]")
	public WebElement operadorO1;

	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div[1]/div[2]/div[3]/div/div/input")
	public WebElement valorFiltro1;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	// segundo subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div[2]/div[3]/div[1]/div/label/span")
	public WebElement subPeriodosAcumulados;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div[2]/div[3]/div[2]/div/div/div[2]")
	public WebElement periodosSubAcumulados;

	@FindBy(xpath = "//li[text()=\"2\"]")
	public WebElement periodosSubAcumuladosO;

	// tercer Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha3;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio3;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor3;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div[2]/div[3]/div[3]/div/label/span")
	public WebElement subPeriodosAnteriores;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div[2]/div[3]/div[4]/div/div/div[2]")
	public WebElement periodosSubAnteriores;

	@FindBy(xpath = "//li[text()=\"1\"]")
	public WebElement periodosSubAnterioresO;

	// Cuarto Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha4;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio4;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor4;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div[2]/div[4]/div[1]/div/label/span")
	public WebElement filtroPorDatae;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div[2]/div[4]/div[2]/div/div/div[2]")
	public WebElement listaFiltroPorDatae;

	@FindBy(xpath = "//li[text()=\"Data lan�amento doc. fiscal\"]")
	public WebElement listaFiltroPorDataOe;

	// Quinto Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha5;

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio5;

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor5;

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div[3]/div/div[2]/div/div[2]")
	public WebElement campoLinha5;

	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement campoLinhaO5;

	
	
	// Sexto Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div[3]/div/div[2]/div/div[2]")
	public WebElement campoLinha6;

	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement campoLinhaO6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div[4]/div[2]/div[1]/div/div[2]/div/div[2]")
	public WebElement ordenacao6;

	@FindBy(xpath = "//div[text()=\"Crescente\"]")
	public WebElement ordenacaoO6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div[4]/div[2]/div[2]/div/div[2]/div/div[2]")
	public WebElement campoOrdenacao6;
	@FindBy(xpath = "//div[text()=\"CFOP\"]")
	public WebElement campoOrdenacaoO6;
	
	
	
	// Septimo Subnivel

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div/div[@id=\"report\"]/div/div/input")
		public WebElement relatorio7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div/div[@id=\"value\"]/div/div/div[2]")
		public WebElement valor7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div[3]/div/div[2]/div/div[2]")
		public WebElement campoLinha7;

		@FindBy(xpath = "//li[text()=\"CFOP\"]")
		public WebElement campoLinhaO7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div[4]/div[2]/div[1]/div/div[2]/div/div[2]")
		public WebElement ordenacao7;

		@FindBy(xpath = "//div[text()=\"Decrescente\"]")
		public WebElement ordenacaoO7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div[4]/div[2]/div[2]/div/div[2]/div/div[2]")
		public WebElement campoOrdenacao7;
		@FindBy(xpath = "//div[text()=\"CFOP\"]")
		public WebElement campoOrdenacaoO7;
		
		
		// Octavo Subnivel

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha8;

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div/div[@id=\"report\"]/div/div/input")
		public WebElement relatorio8;

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div/div[@id=\"value\"]/div/div/div[2]")
		public WebElement valor8;

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div[2]/div[5]/div[1]/div/label/span")
		public WebElement agrupamento8;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div[2]/div[5]/div[2]/div/div/div[2]")
		public WebElement listaAgrupamento8;
		
		@FindBy(xpath = "//div[@id=\"250\"]/div/label/span")
		public WebElement listaAgrupamentoO8;
		
		
		
		// Noveno Subnivel

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha9;

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div/div[@id=\"report\"]/div/div/input")
		public WebElement relatorio9;

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div/div[@id=\"value\"]/div/div/div[2]")
		public WebElement valor9;

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[5]/div[1]/div/label/span")
		public WebElement agrupamento9;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[5]/div[2]/div/div/div[2]")
		public WebElement listaAgrupamento9;
		
		@FindBy(xpath = "//div[@id=\"250\"]/div/label/span")
		public WebElement listaAgrupamentoO9;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[6]/div[1]/div/label/span")
		public WebElement subAgrupamento9;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[6]/div[2]/div/div/div[2]")
		public WebElement listaSubAgrupamento9;
		
		@FindBy(xpath = "//div[@id=\"156\"]/div/label/span")
		public WebElement listaSubAgrupamentoO9;


	public HierarquiaConfiguracaoTodasAsFuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> criarConfiguracaoHierariquia() {

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

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

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		System.out.println(id);

		nova.click();
		sleep(3000);
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		nomeDeHierarquia.sendKeys("Teste Automatizado Hierarquia");
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

		int id1I = convertToInt(id);
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

	public void criarConfiguracao() {

		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nova.click();
		sleep(3000);

		attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(2000);

		nomeHirarquia.sendKeys(idObter1());
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
		ufO.click();
		ufO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		filial.click();
		sleep(1000);
		filialO.click();
		filialO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		tipoApuracao.click();
		sleep(1000);
		tipoApuracaoO.click();
		sleep(1000);

		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);

		gravarC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

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

		campolinha1.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(2000);

		String url = driver.getCurrentUrl();
		
		String relatorioUsar = "";
		if (url.contains("tq1")) {
			relatorioUsar = "8004728";
		}else if (url.contains("tc2")) {
			relatorioUsar = "2099";
		}else {
			relatorioUsar = "1766";
		}

	
		relatorio1.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio1.sendKeys(Keys.ENTER);
		sleep(2000);

		valor1.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		filtros1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		adicionarFiltro.click();
		sleep(2000);

		listaValorDoAjuste1.click();
		sleep(1000);
		listaValorAjusteO1.click();
		sleep(1000);

		operador1.click();
		sleep(1000);
		operadorO1.click();
		sleep(1000);

		valorFiltro1.sendKeys("5000");
		sleep(1000);

		aplicar.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha2);
		sleep(2000);

		// Segundo Subnivel

		campolinha2.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);
			
		relatorio2.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio2.sendKeys(Keys.ENTER);
		sleep(1000);

		valor2.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		subPeriodosAcumulados.click();

		sleep(1000);

		periodosSubAcumulados.click();
		sleep(1000);
		periodosSubAcumuladosO.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha3);
		sleep(1000);

		// tercer Subnivel

		campolinha3.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio3.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio3.sendKeys(Keys.ENTER);
		sleep(1000);

		valor3.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		subPeriodosAnteriores.click();

		sleep(1000);

		periodosSubAnteriores.click();
		sleep(1000);
		periodosSubAnterioresO.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);

		actionsMoveToElementElement(campolinha4);
		sleep(1000);

		// Quarto Subnivel

		campolinha4.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);

		relatorio4.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio4.sendKeys(Keys.ENTER);
		sleep(1000);

		valor4.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		filtroPorDatae.click();

		sleep(1000);

		listaFiltroPorDatae.click();
		sleep(1000);
		listaFiltroPorDataOe.click();
		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha5);
		sleep(1000);

		// Quinto Subnivel

		campolinha5.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio5.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio5.sendKeys(Keys.ENTER);
		sleep(1000);

		valor5.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		actionsMoveToElementElement(siguiente);
		sleep(1000);

		campoLinha5.click();

		sleep(1000);
		campoLinhaO5.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha6);
		sleep(1000);

		// Sexto Subnivel

		campolinha6.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio6.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio6.sendKeys(Keys.ENTER);
		sleep(1000);

		valor6.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		actionsMoveToElementElement(siguiente);
		sleep(1000);

		campoLinha6.click();
		sleep(1000);
		campoLinhaO6.click();

		sleep(1000);

		ordenacao6.click();
		sleep(1000);
		ordenacaoO6.click();
		sleep(1000);

		campoOrdenacao6.click();
		sleep(1000);
		campoOrdenacaoO6.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha7);
		sleep(1000);
		
		
		
		// Septimo Subnivel

		campolinha7.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio7.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio7.sendKeys(Keys.ENTER);
		sleep(1000);

		valor7.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		actionsMoveToElementElement(siguiente);
		sleep(1000);

		campoLinha7.click();

		sleep(1000);
		campoLinhaO7.click();

		sleep(1000);

		ordenacao7.click();
		sleep(1000);
		ordenacaoO7.click();
		sleep(1000);

		campoOrdenacao7.click();
		sleep(1000);
		campoOrdenacaoO7.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha8);
		sleep(1000);
		
		
		
		// Octavo Subnivel

		campolinha8.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio8.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio8.sendKeys(Keys.ENTER);
		sleep(1000);

		valor8.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		agrupamento8.click();
		sleep(1000);
		
		listaAgrupamento8.click();
		sleep(1000);
		listaAgrupamentoO8.click();
		listaAgrupamentoO8.sendKeys(Keys.ESCAPE);
		

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha9);
		sleep(1000);
		
		
		
		
		// Octavo Subnivel

		campolinha9.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);

	
		relatorio9.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio9.sendKeys(Keys.ENTER);
		sleep(1000);

		valor9.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		agrupamento9.click();
		sleep(1000);
		
		listaAgrupamento9.click();
		sleep(1000);
		listaAgrupamentoO9.click();
		listaAgrupamentoO9.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		subAgrupamento9.click();
		sleep(1000);
		listaSubAgrupamento9.click();
		sleep(1000);
		listaSubAgrupamentoO9.click();
		listaSubAgrupamentoO9.sendKeys(Keys.ESCAPE);

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		
		
		

	}

}
