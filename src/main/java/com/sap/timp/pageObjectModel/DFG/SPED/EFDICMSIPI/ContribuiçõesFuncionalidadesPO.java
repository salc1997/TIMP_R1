package com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;

public class ContribuiçõesFuncionalidadesPO extends TestBaseCristhian{
	

	
	@FindBy(xpath = "//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")
	public WebElement fecharMensagem;
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-left\") and @tabindex=\"0\"][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//li[text()=\"SPED EFD/ICMS\"]")
	public WebElement tipoO;
	
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement grupoEstruturaO;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement grupoEstruturaTP1O;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//div[@id=\"18\"]/div/label/span")
	public WebElement estruturaO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão do Leiaute\")]")
	public WebElement versao;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button")
	public WebElement buscarSeparadores;
	
	@FindBy(xpath = "//span[text()=\"Separadores\"]")
	public WebElement separadores;
	
	@FindBy(xpath = "//input[@placeholder=\"Sem separador\"]")
	public WebElement separador;
	
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement incluirInicio;
	
	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement incluirFinal;
	
	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Bloco\")]")
	public WebElement nomeBloco;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Registro\")]")
	public WebElement nomeRegistro;
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement ajustesFiscais;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"][1]")
	public WebElement ajustes;
	
	@FindBy(xpath = "//li[@data-hananame=\"ID_COMPANY\"]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//li[@data-hananame=\"ID_BRANCH\"]")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//li[@data-hananame=\"DT_LANC\"]")
	public WebElement dataLancamento;
	
	@FindBy(xpath = "//li[@data-hananame=\"AJUSTE_VALUE\"]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//span[text()=\"Mapeamento do SPED\"]")
	public WebElement mapeamentoSPED;
	
	@FindBy(xpath = "//div[@class=\"block-select\"]/div/div/div[2]")
	public WebElement selecionarBloco;
	
	@FindBy(xpath = "//li[text()=\"Bloco 1\"]")
	public WebElement selecionarBlocoO;
	
	@FindBy(xpath = "//div[@class=\"record-select\"]/div/div/div[2]")
	public WebElement selecionarRegistro;
	
	@FindBy(xpath = "//li[text()=\"1200\"]")
	public WebElement selecionarRegistroO;
	
	@FindBy(xpath = "//li[contains(text(),\"empresa\")]")
	public WebElement selecionarEmpresa;
	
	@FindBy(xpath = "//li[contains(text(),\"filial\")]")
	public WebElement selecionarFilial;
	
	@FindBy(xpath = "//li[contains(text(),\"lançamento\")]")
	public WebElement selecionarDataLancamento;
	
	@FindBy(xpath = "//li[contains(text(),\"ajuste\")]")
	public WebElement selecionarValorAjuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	
	
	//BRE
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nomeRegra;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tipoRegra;
	
	@FindBy(xpath = "//li[text()=\"Auditoria Nvl 3\"]")
	public WebElement tipoRegraO;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[text()=\"DFG\"]")
	public WebElement componenteO;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement tributoO;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupoEstruturaR;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement grupoEstruturaRO;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement grupoEstruturaROTP1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturaR;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement estruturaRO;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristica;
	
	@FindBy(xpath = "//li[text()=\"Toda a Obrigação\"]")
	public WebElement caracterisiticaO;
	
	@FindBy(xpath = "//td[@class=\"layout-field\"]/div/div/div[2]")
	public WebElement leiauteR;
	
	@FindBy(xpath = "//td[@class=\"layoutVersion-field\"]/div/div/div[2]")
	public WebElement versaoLeiauteR;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoLeiauteRO;
	
	@FindBy(xpath = "//td[@class=\"EffectiveDateFrom\"]/div/div/input")
	public WebElement dataVigenciaR;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//input[@placeholder=\"Código\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Embasamento\"]")
	public WebElement embasamento;
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	public WebElement condicao1;
	
	@FindBy(xpath = "//li[contains(text(),\"Código da empresa\")]")
	public WebElement condicao1O;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div/div/div[2]")
	public WebElement condicao2;
	
	@FindBy(xpath = "//div[contains(text(),\"≠\")]")
	public WebElement condicao2O;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement condicao3;
	
	@FindBy(xpath = "//li[contains(text(),\"Código da filial\")]")
	public WebElement condicao3O;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div[2]/div/div/div/input")
	public WebElement acoes;
	

	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;
	
	
	
	//DFG
	
	@FindBy(xpath = "//span[contains(@class,\"icon-gooddoc\")]")
	public WebElement sped;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-efd-icmsipi\"]")
	public WebElement efd;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-icmsipi\"]")
	public WebElement efdO;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-icmsipi-calculationBlocks\"]")
	public WebElement blocosApuracao;
	
	
	@FindBy(xpath = "//div[@class=\"inputs layout-select\"]/div/div[2]")
	public WebElement leiauteE;
	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoE;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoEO;
	
	@FindBy(xpath = "//div[@class=\"inputs tax-select\"]/div/div[2]")
	public WebElement tributoE;
	
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoEO;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div/div[2]")
	public WebElement empresaE;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaEO;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div/div[2]")
	public WebElement ufE;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufEO;
	
	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div/div[2]")
	public WebElement filialE;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]/div/label/span")
	public WebElement filialEO;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fecharInformacoes;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement descricaoI;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeV;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Leiaute\")]")
	public WebElement leiauteV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão Leiaute\")]")
	public WebElement versaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoV;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement ufV;

	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement filialV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaV;
	
	//Bloco Apuração
	
	@FindBy(xpath = "//div[@id=\"executarArquivo\"]/div[3]/div[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div[1]/div[2]")
	public WebElement ufFilialB;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufFilialBO;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\") and @tabindex=\"0\"][1]")
	public WebElement atras;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement ano2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement jan;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Atualizar Estrutura\"]")
	public WebElement atualizarEstrutura;
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executarConf;
	
	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement visualizarAN3;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeR;
	
	@FindBy(xpath = "//div[@class=\"rule-input\"]/div/div/div[2]")
	public WebElement regra;
	
	@FindBy(xpath = "//span[text()=\"Atualizar\"]")
	public WebElement atualizar;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	
	@FindBy(xpath = "//div[contains(@class,\"company\")]/div/div/div[2]")
	public WebElement empresaDFG;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaDFGO;
	
	@FindBy(xpath = "//div[contains(@class,\"branch\")]/div/div/div[2]")
	public WebElement filialDFG;
	
	@FindBy(xpath = "//div[@id=\"0001\"]/div/label/span")
	public WebElement filialDFGO;
	
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[1]/button")
	public WebElement executarDFG;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Arquivos\"]")
	public WebElement visualizarArquivos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-layout\"]")
	public WebElement lixeiraDFG;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeiraBRE;
	
	public ContribuiçõesFuncionalidadesPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id antes da criação do registro (Raiz): " + ultimoIdAC);

		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		actionsMoveToElementElement(versao);
		sleep(1000);
		tipo.click();
		sleep(1000);
		tipoO.click();
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		if (tp1 == true) {
			grupoEstruturaTP1O.click();
		}else {
			grupoEstruturaO.click();
		}
		
		sleep(1000);
		
		estrutura.click();
		sleep(1000);
		estruturaO.click();
		sleep(1000);
		estruturaO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versao.sendKeys("1");
		sleep(1000);
		salvar.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(gravar);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		while(!separadores.isDisplayed()) {
			buscarSeparadores.click();
		}
		
		separadores.click();
		sleep(2000);
		waitExpectElement(aplicar);
		sleep(2000);
		separador.sendKeys("|");
		sleep(1000);
		
		incluirInicio.click();
		sleep(1000);
		incluirFinal.click();
		sleep(1000);
		
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		waitExpectElement(adicionarRegistro);
		sleep(1000);
		adicionarRegistro.click();
		sleep(2000);
		
		nomeBloco.sendKeys("Bloco 1");
		sleep(1000);
		nomeRegistro.sendKeys("1200");
		sleep(1000);
		
		
		ajustesFiscais.click();
		sleep(2000);
		ajustes.click();
		sleep(2000);
		
		moveToElement(codigoEmpresa,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		moveToElement(codigoFilial,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		actionsMoveToElementElement(dataLancamento);
		sleep(500);
		moveToElement(dataLancamento,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(500);
		actionsMoveToElementElement(valorAjuste);
		moveToElement(valorAjuste,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		while(!mapeamentoSPED.isDisplayed()) {
			buscarSeparadores.click();
			sleep(500);
		}
		
		mapeamentoSPED.click();
		sleep(3000);
		
		selecionarBloco.click();
		sleep(1000);
		selecionarBlocoO.click();
		sleep(1000);
		
		selecionarRegistro.click();
		sleep(1000);
		selecionarRegistroO.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int f = 1;
		for (int i = 0; i < 6; i++) {
			
			WebElement abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"]["+f+"]/div[1]/div/div[2]"));
			
			abrirComboBox.click();
			sleep(1000);
			selecionarEmpresa.click();
			sleep(1000);
			
			f++;
				
		}
		
		WebElement valorA = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][10]/div[1]/div/div[1]/input"));
		actionsMoveToElementElement(valorA);
		WebElement abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][7]/div[1]/div/div[2]"));
		abrirComboBox.click();
		sleep(1000);
		selecionarFilial.click();
		
	
		abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][8]/div[1]/div/div[2]"));
		abrirComboBox.click();
		sleep(1000);
		selecionarDataLancamento.click();
		
		
		abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][9]/div[1]/div/div[2]"));
		abrirComboBox.click();
		sleep(1000);
		selecionarValorAjuste.click();
		

		actionsMoveToElementElement(valorA);
		valorA.sendKeys("Valor");
		sleep(1000);
		valorA.sendKeys(Keys.ENTER);
		
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id após da criação do registro (Raiz): " + ultimoIdDC);
		idInserir2(ultimoIdDC);

		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
	
		System.out.println(sucesso);
		
		return sucesso;

		
	}

	
	public boolean BRE() {
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();
		
		acessarBREPO.acessarBRE();
		
		regraAuditoriaN3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id antes da criação do registro (BRE): " + ultimoIdAC);
		idInserir1(ultimoIdAC);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nomeRegra);
		sleep(2000);
		
		nomeRegra.sendKeys("Teste Automatizado DFG Cristhian");
		sleep(1000);
		
		
		tipoRegra.click();
		sleep(1000);
		tipoRegraO.click();
		sleep(1000);
		
		componente.click();
		sleep(1000);
		componenteO.click();
		sleep(1000);
		
		actionsMoveToElementElement(dataVigenciaR);
		
		sleep(1000);
		
		tributo.click();
		sleep(1000);
		tributoO.click();
		sleep(1000);
		tributoO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		grupoEstruturaR.click();
		sleep(1000);
		if (tp1 == true) {
			grupoEstruturaROTP1.click();
		}else {
			grupoEstruturaRO.click();
		}
		
		
		sleep(1000);
		
		estruturaR.click();
		sleep(1000);
		estruturaRO.click();
		sleep(1000);
		
		caracteristica.click();
		sleep(1000);
		caracterisiticaO.click();
		sleep(3000);
		actionsMoveToElementElement(dataVigenciaR);
		sleep(1000);
		
		leiauteR.click();
		sleep(1000);
		WebElement leiauteO = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		leiauteO.click();
		sleep(1000);
		
		versaoLeiauteR.click();
		sleep(1000);
		versaoLeiauteRO.click();
		sleep(1000);
		
		dataVigenciaR.sendKeys("01/01/2013");
		sleep(1000);
		aplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarCaminho.click();
		sleep(3000);
		waitExpectElement(codigo);
		sleep(2000);
		
		codigo.sendKeys("R1");
		sleep(1000);
		embasamento.sendKeys("1");
		sleep(1000);
		
		condicao1.click();
		sleep(1000);
		condicao1O.click();
		sleep(1000);
		
		condicao2.click();
		sleep(1000);
		condicao2O.click();
		sleep(1000);
		
		condicao3.click();
		sleep(1000);
		condicao3O.click();
		sleep(1000);
		
		acoes.sendKeys("TESTE");
		acoes.sendKeys(Keys.ENTER);
		sleep(1000);
		
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id após da criação do registro (BRE): " + ultimoIdDC);
		idInserir3(ultimoIdDC);
		
		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		return sucesso;
		
		
		
	}
}
