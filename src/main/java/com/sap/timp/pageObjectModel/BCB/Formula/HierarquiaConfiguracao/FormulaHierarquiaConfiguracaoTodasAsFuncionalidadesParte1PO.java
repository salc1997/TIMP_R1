package com.sap.timp.pageObjectModel.BCB.Formula.HierarquiaConfiguracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.sap.timp.base.TestBase;



public class FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO extends TestBase  {
	//TSTNG-855
	//NUEVA CONFIGURACION HIERARQUIA
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
		public WebElement hierarquias;
		@FindBy(xpath = "//span[text()=\"Hierarquia de Configura��o\"]")
		public WebElement hierarquiaConfiguracao;
		@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
		public WebElement ultimo;

	//NUEVA HIERARQUIA
		@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
		public WebElement nova;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
		public WebElement nomeDeHierarquia;
	
		@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Aba\")]")
		public WebElement nomeDaAba;
		
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
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement sim;
		
		@FindBy(xpath = "//button[text()=\"N�o\"]")
		public WebElement nao;
		
		@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
		public WebElement justificativa;
		
		@FindBy(xpath = "//button[text()=\"Aplicar\"]")
		public WebElement aplicarJustificativa;

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
		@FindBy(xpath = "//div[contains(@id,\"DF\")]/div/label/span")
		public WebElement ufO2;
		
		@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
		public WebElement filial;
		@FindBy(xpath = "//div[contains(@id,\"1000_SP_0016\")]/div/label/span")
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
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
				
		
		// primer subnivel
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement primerNivel;	
			
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha1;
		@FindBy(xpath = "//li[text()=\"Atribuir F�rmula\"]")
		public WebElement campoLinhaO1;
		
		@FindBy(xpath = "//span[contains(@class,\"icon-function\")]")
		public WebElement formula;
		
		@FindBy(xpath = "//div[@id=\"column-source\"]//div/div[1]/div[2]")
		public WebElement fontedeDados;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement opcFontedeDados;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectBCB;
		
		@FindBy(xpath = "//div[@class=\"column-wrapper first\"]/div/div[contains(text(),\"Campos de Sa�da BCB\")]")
		public WebElement camposSaidaBCB;
		
		@FindBy(xpath = "//div[@class=\"column-wrapper second\"]/div/div/div/div/div/input")
		public WebElement buscarCamposSaidaBCB;
		
		
		
		
		
		@FindBy(xpath = "//div[contains(text(),\"ID954-(BCB com campo de Output) TA\")]")
		public WebElement selectBCB1;
		//CORREGIR EN SU DEBIDO AMBIENTE
		@FindBy(xpath = "//div[text()=\"ID326-(BCB com campo de Output) TA\"]")
		public WebElement selectBCB2;
		@FindBy(xpath = "//div[text()=\"ID393-(BCB com campo de Output) TA\"]")
		public WebElement selectBCB3;
		
		
		@FindBy(xpath = "//div[contains(text(),\"4285-Campo de Sa�da 1\")]")
		public WebElement selectBCB11;
		//REVISAR CUANDO PASE POR EL AMBIENTE RESPECTIVO
		@FindBy(xpath = "//div[contains(text(),\"1424-Campo de sa�da 1\")]")
		public WebElement selectBCB12;
		@FindBy(xpath = "//div[contains(text(),\"Campo de Sa�da 1\")]")
		public WebElement selectBCB13;
		
		@FindBy(xpath = "//div[@id=\"formula-Box\"]/div/textarea")
		public WebElement caixaFormula;
		
		@FindBy(xpath = "//button[text()=\"Aplicar\"]")
		public WebElement aplicar;
		
		
		//SEGUNDO SUBNIVEL
		
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivel;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha2;
		@FindBy(xpath = "//li[text()=\"Atribuir F�rmula\"]")
		public WebElement campoLinhaO2;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcFontedeDados2;
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-negative\"]/div/label/span")
		public WebElement negativo2;
		
		//TERCER SUBNIVEL
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"3\"]")
		public WebElement tercerNivel;
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha3;
		@FindBy(xpath = "//li[text()=\"Atribuir F�rmula\"]")
		public WebElement campoLinhaO3;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][3]")
		public WebElement opcFontedeDados3;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div/div[@id=\"check-zero-value\"]/div/label/span")
		public WebElement zerado;
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"zero-value\"]/div/div/div[2]")
		public WebElement condicaoZerado;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcZerado;
		
		//CUARTO SBUNIVEL
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"4\"]")
		public WebElement cuartoNivel;
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha4;
		@FindBy(xpath = "//li[text()=\"Atribuir F�rmula\"]")
		public WebElement campoLinhaO4;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][4]")
		public WebElement opcFontedeDados4;
		@FindBy(xpath = "//div[contains(text(),\"4286-Campo de Sa�da 2\")]")
		public WebElement selectBCB41;
		//REVISAR CUANDO PASE POR EL AMBIENTE RESPECTIVO
		@FindBy(xpath = "//div[contains(text(),\"1424-Campo de sa�da 1\")]")
		public WebElement selectBCB42;
		@FindBy(xpath = "//div[contains(text(),\"Campo de Sa�da 2\")]")
		public WebElement selectBCB43;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div/div[@id=\"check-zero-value\"]/div/label/span")
		public WebElement zerado4;
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]//div[@id=\"zero-value\"]/div/div/div[2]")
		public WebElement condicaoZerado4;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement opcZerado4;
		
		//QUINTO SUBNIVEL
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"5\"]")
		public WebElement quintoNivel;
		@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha5;
		@FindBy(xpath = "//li[text()=\"Atribuir F�rmula\"]")
		public WebElement campoLinhaO5;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][5]")
		public WebElement opcFontedeDados5;
		
		@FindBy(xpath = "//span[contains(@class,\"icon-number\")]")
		public WebElement arredondamento;
		
		@FindBy(xpath = "//button[text()=\"Adicionar configura��o de arredondamento\"]")
		public WebElement adicionarConfiguracionArredondamento;
		
		@FindBy(xpath = "//div[@id=\"rounding\"]/div/div/div[2]")
		public WebElement configuracaoArrendamiento;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement configuracaoArrendamientoOpc;
		
		@FindBy(xpath = "//div[@id=\"rounding-decimals\"]/div/div/input")
		public WebElement decimais;
		
		@FindBy(xpath = "//div[@id=\"create-tab\"]/div/div/div[2]")
		public WebElement abaArredondar;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement abaArredondarOpc;
		
		@FindBy(xpath = "//div[@id=\"create-hierarchy\"]/div/div/div[2]")
		public WebElement hierarquiaArredondar;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement hierarquiaArredondarOpc;
		
		@FindBy(xpath = "//div[@id=\"create-group\"]/div/div/div[2]")
		public WebElement grupoArredondar;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement grupoArredondarOpc;
		
		
		@FindBy(xpath = "//div[@id=\"create-sublevel\"]/div/div/div[2]")
		public WebElement subnivelArredondar;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][5]")
		public WebElement subnivelArredondarOpc;
		
		@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
		public WebElement criarSubnivel5;
		
		@FindBy(xpath = "//html/body/div[4]/div/div[3]/button[1]")
		public WebElement fecharSubnivel5;
		
		
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executar;

		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executarN;
		
		//EXECUTAR
		@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
		public WebElement periodo;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
		public WebElement paginaAnterior;
		
		@FindBy(xpath = "//div[text()=\"2016\"]")
		public WebElement ano2016;
		
		@FindBy(xpath = "//div[text()=\"2015\"]")
		public WebElement ano2015;
		
		@FindBy(xpath = "//div[text()=\"Jan\"]")
		public WebElement jan;
		
		@FindBy(xpath = "//span[text()=\"1M\"]")
		public WebElement m1;
		
		@FindBy(xpath = "//span[text()=\"1A\"]")
		public WebElement a1;
		
		@FindBy(xpath = "//div[contains(@class,\"execution-type\")]/div[2]/label/span")
		public WebElement execucaoAnalitica;
		
		@FindBy(xpath = "//button[text()=\"Executar\"]")
		public WebElement executarB;
		
		//VERIFICAR INFORMACION DE SUBNIVELES
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")]/div/div/div/div")
		public WebElement aba1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[1]/div[1]/div[1]/div[1]")
		public WebElement hierarquia1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[1]/div[1]/div[1]/div[1]")
		public WebElement grupo1;
		
//		@FindBy(xpath = "//div[@class=\"hdr hdr-0\"]")
//		public WebElement aba1;
//		@FindBy(xpath = "//div[@class=\"hdr hdr-1\"]")
//		public WebElement hierarquia1;
//		@FindBy(xpath = "//div[@class=\"hdr hdr-2\"]")
//		public WebElement grupo1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verFormulaSubNivel1;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[1]/div/div[2]")
		public WebElement totalizadorSubNivel1;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel2;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verFormulaSubNivel2;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div/div[2]")
		public WebElement totalizadorSubNivel2;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel3;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verFormulaSubNivel3;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div/div[2]")
		public WebElement totalizadorSubNivel3;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel4;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verFormulaSubNivel4;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[4]/div/div[2]")
		public WebElement totalizadorSubNivel4;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel5;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verFormulaSubNivel5;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[5]/div/div[2]")
		public WebElement totalizadorSubNivel5;
		
		//EXCLUIR
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement simLexeira;
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveExecutions\"]")
		public WebElement pastaLexeira;
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement simExcluir;
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveConfigurations\"]")
		public WebElement pastaLexeiraC;
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveHierarchies\"]")
		public WebElement pastaLexeiraH;
		
		
		public FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO() {
			PageFactory.initElements(driver, this);
		}
		
		public ArrayList<Boolean> criarConfiguracaoHierarquia() {
			
			boolean tc2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

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
			waitExpectedElement(nomeDeHierarquia);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(1000);
			
			nomeDeHierarquia.sendKeys("Prueba Automatizadaa QA1");
			sleep(1000);

			nomeDaAba.sendKeys("Teste Automatizado");
			sleep(1000);
			
			actionsMoveToElement(nomeDoCampoDeLinha);
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

			for (int i = 0; i < 4; i++) {
				adicionar.click();
				sleep(1000);
			}

			int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();
			System.out.println(subniveisAdicionados);

			String subniveisAdicionadosS = String.valueOf(subniveisAdicionados);

			sucesso.add(subniveisAdicionadosS.equals("5"));

			int f = 1;
			for (int i = 0; i < 1; i++) {

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
			sleep(3000);
			sim.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			justificativa.sendKeys("Justificativa TESTE AUTOMATIZADO");
			aplicarJustificativa.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			biblioteca.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			ultimo.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			rowsH = driver
					.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
					.size();
			String id2 = driver.findElement(By.xpath(
					"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH + "]/div[4]/div"))
					.getText();
			String nome = driver.findElement(By.xpath(
					"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH + "]/div[5]/div"))
					.getText();
			System.out.println(nome);

			sucesso.add(nome.contains("Prueba Automatizadaa QA1"));

			idInserir("FormulaH1",id2);

			int id1I = convertToInt(idH);
			int id2I = convertToInt(id2);

			System.out.println("***********");
			System.out.println("Hierarquia");
			System.out.println("Id antes da cria��o: " + id1I);
			System.out.println("Id Ap�s a cria��o: " + id2I);
			System.out.println("");
			System.out.println("***********");

			if (id2I > id1I) {
				sucesso.add(true);
			} else {
				sucesso.add(false);
			}

			return sucesso;
		}
		
		
		public boolean criarConfiguracionConfiguracao() {
			
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
		//	idInserir2(id); //antes de crear herarquia configuracao
			
			nova.click();
			sleep(3000);

			attributeToBe("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
			sleep(2000);

			nomeHirarquia.sendKeys("Prueba Automatizadaa QA1");
			sleep(1000);
			nomeHirarquia.sendKeys(Keys.ENTER);
			sleep(1000);

			tributo.click();
			sleep(1000);
			tributoO.click();
			tributoO.sendKeys(Keys.ESCAPE);
			sleep(1000);

			attributeToBe("//div[@id=\"company\"]/div", "class", "base-MultipleSelect3 required");
			sleep(1000);

			empresa.click();
			sleep(1000);
			empresaO.click();
			empresaO.sendKeys(Keys.ESCAPE);
			sleep(1000);

			attributeToBe("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(1000);

			uf.click();
			sleep(1000);
//			if (tc2==true) {
//				ufO2.click();
//				ufO2.sendKeys(Keys.ESCAPE);
//				sleep(1000);
//			}else {
				ufO.click();
				ufO.sendKeys(Keys.ESCAPE);
				sleep(1000);
			//}
			
			attributeToBe("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(1000);

			filial.click();
			sleep(1000);
//			if (tc2==true) {
//				filialTc2.click();
//				filialTc2.sendKeys(Keys.ESCAPE);
//				sleep(1000);
			//}else {
				filialO.click();
				filialO.sendKeys(Keys.ESCAPE);
				sleep(1000);
			//}


			tipoApuracao.click();
			sleep(1000);
			tipoApuracaoO.click();
			sleep(20000);

			dataVigencia.sendKeys("01/01/2013");
			sleep(1000);

			gravarC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(11000);
			
			biblioteca.click();
			sleep(5000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

			sleep(9000);
			
			ultimo.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
			String idApos = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
			idInserir("FormulaC1",idApos);
			System.out.println("Id Configura��es apos da cria��o: "+ idApos);
			
			
			System.out.println("");
			System.out.println("***********");
			System.out.println("CONFIFURACOES");
			System.out.println("ID ANTES: " +id);
			System.out.println("ID DESPUES: "+ idApos);
			System.out.println("***********");
			System.out.println("");
			
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
		
		
		public ArrayList<Boolean> configurarConfiguracao() {
			boolean tc2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			
			//COMENTAR DESPUES PORFAVOR
//				sleep(2000);
//				configuracoes.click();
//				sleep(3000);
//				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//				sleep(2000);
//				configuracaoDaConsolidacao.click();
//				sleep(3000);
//				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//				sleep(2000);
//				
//				
//				pesquisar.sendKeys("1072");
//				pesquisar.sendKeys(Keys.ENTER);
//				sleep(3000);
//				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//				sleep(2000);
//				
//				
//				
//				WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div"));
//				WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//				sleep(2000);
			//HASTA AQUI
				
			sleep(9000);

			WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter("FormulaC1")+"\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter("FormulaC1")+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			sleep(2000);
				
	//	
	//	
			menu.click();
			sleep(1000);
			editar.click();
			sleep(6000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			waitExpectedElement(calculator);
			sleep(6000);
			
			calculator.click();
			sleep(1000);
			waitExpectedElement(resultadoFinal);
			sleep(2000);
			resultadoFinal.click();
			sleep(1000);

			adicionarConfiguracao.click();
			sleep(1000);
			waitExpectedElement(condicao);
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
			sleep(2000);
			
			sim.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			justificativa.sendKeys("JUSTIFICATIVA 2 TESTE AUTOMATIZADO");
			sleep(2000);
			aplicarJustificativa.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			//corregir mensaje al parecer
			int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configura��o de hierarquia foi salva\")]")).size();
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (mensaje > 0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			return sucesso;
		}
		
		public ArrayList<Boolean> formulaOutputBCB() {
			boolean tc2 = false;
			boolean tq1 = false;
			boolean tp1 = false;
			boolean tq2 = false;
			String url = driver.getCurrentUrl();
			
			if (url.contains("tc2")) {
				tc2 = true;
			}else if (url.contains("tp1")) {
				tp1 = true;
			}else if (url.contains("tq1")) {
				tq1 = true;
			}else if (url.contains("tq2")) {
				tq2 = true;
			}
			

			
			System.out.println("--------------------------------------------SubNivel 1-------------------------------------");
			sleep(1000);
			
			//sleep(2000);
			//primerNivel.click();
			sleep(2000);
			campolinha1.click();
			sleep(2000);
			campoLinhaO1.click();
			sleep(3000);
			
			
			formula.click();
			sleep(6000);
			
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
	//		waitExpectElement(fontedeDados);
			sleep(2000);
			
			
			fontedeDados.click();
			sleep(2000);
			opcFontedeDados.click();
			sleep(2000);
			
			actionsMoveToElement(camposSaidaBCB);
			sleep(2000);
			
			camposSaidaBCB.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			sleep(2000);
			camposSaidaBCB.click();
			sleep(2000);
			
			//attributeToBeXpath("//div[@class=\"column-wrapper second\"]/div/div","class", "animation-wrapper show");
			sleep(9000);
			
			
			if (tq1 == true) {
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB11);
				sleep(1000);
			}else if (tc2 ==true) {
				buscarCamposSaidaBCB.sendKeys("393");
				sleep(1000);
				dobleClick(selectBCB3);
				sleep(5000);
				dobleClick(selectBCB13);
				sleep(1000);
			}else  if (tq2 ==true){
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB11);
				sleep(1000);
			}else{
				//CORREGIR AL EJECUTAR EN AMBIENTE
				buscarCamposSaidaBCB.sendKeys("326");
				sleep(1000);
				selectBCB2.click();
				sleep(1000);
				dobleClick(selectBCB12);
				sleep(1000);
			}
			
			
			caixaFormula.sendKeys("/2");
			sleep(2000);
			
			aplicar.click();
			sleep(2000);
			
			gravar.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			nao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
//			
//			aplicarJustificativa.click();
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
			
			
			int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configura��o de hierarquia foi salva\")]")).size();
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (mensaje > 0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			return sucesso;
		}
		
		
		public ArrayList<Boolean> subNivel2() {
			
			boolean tc2 = false;
			boolean tq1 = false;
			boolean tp1 = false;
			boolean tq2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			
			if (url.contains("tq1")) {
				tq1 = true;
			}
			
			if (url.contains("tp1")) {
				tp1 = true;
			}
			
			if (url.contains("tq2")) {
				tq2 = true;
			}


			System.out.println("--------------------------------------------SubNivel 2-------------------------------------");
			sleep(1000);
			
			segundoNivel.click();
			sleep(2000);
			campolinha2.click();
			sleep(2000);
			campoLinhaO2.click();
			sleep(2000);
			
			formula.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			fontedeDados.click();
			sleep(2000);
			
			opcFontedeDados2.click();
			sleep(2000);
			
			camposSaidaBCB.click();
			sleep(2000);
			
			if (tq1 == true) {
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB11);
				sleep(1000);
			}else if (tc2 ==true) {
				buscarCamposSaidaBCB.sendKeys("393");
				sleep(1000);
				selectBCB3.click();
				sleep(1000);
				dobleClick(selectBCB13);
				sleep(1000);
			}else if (tq2 == true){
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB11);
				sleep(1000);
			}else{
				//CORREGIR AL EJECUTAR EN AMBIENTE
				buscarCamposSaidaBCB.sendKeys("326");
				sleep(1000);
				selectBCB2.click();
				sleep(1000);
				dobleClick(selectBCB12);
				sleep(1000);
			}
			
			
			caixaFormula.sendKeys("/2");
			sleep(2000);
			
			aplicar.click();
			sleep(2000);
			
			negativo2.click();
			sleep(3000);
			
			gravar.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			nao.click();
			sleep(4000);
			
			int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configura��o de hierarquia foi salva\")]")).size();
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (mensaje > 0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			return sucesso;
			
		}
		
		
		public ArrayList<Boolean> subNivel3() {
			
			boolean tc2 = false;
			boolean tq1 = false;
			boolean tp1 = false;
			boolean tq2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			
			if (url.contains("tq1")) {
				tq1 = true;
			}
			
			if (url.contains("tp1")) {
				tp1 = true;
			}
			
			if (url.contains("tq2")) {
				tq2 = true;
			}
			
			System.out.println("--------------------------------------------SubNivel 3-------------------------------------");
			sleep(1000);

			tercerNivel.click();
			sleep(2000);
			campolinha3.click();
			sleep(2000);
			campoLinhaO3.click();
			sleep(2000);
			
			formula.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			fontedeDados.click();
			sleep(2000);
			
			opcFontedeDados3.click();
			sleep(2000);
			
			camposSaidaBCB.click();
			sleep(2000);
			
			if (tq1 == true) {
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB11);
				sleep(1000);
			}else if (tc2 ==true) {
				buscarCamposSaidaBCB.sendKeys("393");
				sleep(1000);
				selectBCB3.click();
				sleep(1000);
				dobleClick(selectBCB13);
				sleep(1000);
			}else if (tq2 == true){
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB11);
				sleep(1000);
			}else{
				//CORREGIR AL EJECUTAR EN AMBIENTE
				buscarCamposSaidaBCB.sendKeys("326");
				sleep(1000);
				selectBCB2.click();
				sleep(1000);
				dobleClick(selectBCB12);
				sleep(1000);
			}
			
			
			caixaFormula.sendKeys("/2");
			sleep(2000);
			
			aplicar.click();
			sleep(2000);
			
			zerado.click();
			sleep(4000);
			
			condicaoZerado.click();
			sleep(3000);
			opcZerado.click();
			opcZerado.sendKeys(Keys.ESCAPE);
			sleep(3000);
			
			gravar.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			nao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configura��o de hierarquia foi salva\")]")).size();
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (mensaje > 0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			return sucesso;
			
		}
		
		
		public ArrayList<Boolean> subNivel4() {
			sleep(10000);
			boolean tc2 = false;
			boolean tq1 = false;
			boolean tp1 = false;
			boolean tq2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			
			if (url.contains("tq1")) {
				tq1 = true;
			}
			
			if (url.contains("tp1")) {
				tp1 = true;
			}
			
			if (url.contains("tq2")) {
				tq2 = true;
			}
			
			
			
			System.out.println("--------------------------------------------SubNivel 4-------------------------------------");
			sleep(1000);

			cuartoNivel.click();
			sleep(2000);
			campolinha4.click();
			sleep(2000);
			campoLinhaO4.click();
			sleep(2000);
			
			formula.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			fontedeDados.click();
			sleep(2000);
			
			opcFontedeDados4.click();
			sleep(2000);
			
			camposSaidaBCB.click();
			sleep(2000);	
			
			if (tq1 == true) {
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB41);
				sleep(1000);
			}else if (tc2 ==true) {
				buscarCamposSaidaBCB.sendKeys("393");
				sleep(1000);
				selectBCB3.click();
				sleep(1000);
				dobleClick(selectBCB43);
				sleep(1000);
			}else if (tq2 == true){
				buscarCamposSaidaBCB.sendKeys("954");
				sleep(1000);
				selectBCB1.click();
				sleep(1000);
				dobleClick(selectBCB41);
				sleep(1000);
			}else{
				//CORREGIR AL EJECUTAR EN AMBIENTE
				buscarCamposSaidaBCB.sendKeys("326");
				sleep(3000);
				selectBCB2.click();
				sleep(3000);
				dobleClick(selectBCB42);
				sleep(3000);
			}
			
			caixaFormula.sendKeys("/2");
			sleep(2000);
			
			aplicar.click();
			sleep(2000);
			
			zerado4.click();
			sleep(2000);
			
			condicaoZerado4.click();
			sleep(2000);
			opcZerado4.click();
			opcZerado4.sendKeys(Keys.ESCAPE);
			sleep(2000);
			
			gravar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			nao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configura��o de hierarquia foi salva\")]")).size();
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (mensaje > 0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			return sucesso;
	
		}		
}
