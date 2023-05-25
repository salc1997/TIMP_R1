package com.sap.timp.pageObjectModel.BCB.OrigemBRB.HierarquiaConfiguracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;



public class OrigenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO extends TestBaseSteven {
	//TSTNG-1238
	//NUEVA CONFIGURACION HIERARQUIA
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
		public WebElement hierarquias;
		@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
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
		
		@FindBy(xpath = "//button[text()=\"Não\"]")
		public WebElement nao;
		
		
		@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
		public WebElement justificativa;
		
		@FindBy(xpath = "//button[text()=\"Aplicar\"]")
		public WebElement aplicar;

		@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
		public WebElement biblioteca;
		
	// Configuracao
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
		public WebElement configuracoes;
	
		@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
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
		@FindBy(xpath = "//div[contains(@id,\"1000_SP_0121\")]/div/label/span")
		public WebElement filialO;
		@FindBy(xpath = "//div[contains(@id,\"1000_DF_0019\")]/div/label/span")
		//@FindBy(xpath = "//div[contains(@id,\"1000_DF_0013\")]/div/label/span")
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
	
		@FindBy(xpath = "//span[contains(text(),\"Configuração do Resultado Final\")]")
		public WebElement resultadoFinal;
	
		@FindBy(xpath = "//div[contains(@class,\"adjustments\")]/div/div/div[2]/div/div[2]/div/div/button")
		public WebElement adicionarConfiguracao;
	
		@FindBy(xpath = "//div[@id=\"condition\"]/div/div/div[2]")
		public WebElement condicao;
		@FindBy(xpath = "//li[text()=\"Não Exibir\"]")
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
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO1;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]//div[2]")
	public WebElement relatorio;
	
	@FindBy(xpath = "//li[text()=\"954 - (BCB com campo de Output) TA\"]")
	public WebElement selectBCB1;
	
	//@FindBy(xpath = "//li[text()=\"328 - (BCB com campo de Output) TA\"]")
	@FindBy(xpath = "//li[@id][text()=\"326 - (BCB com campo de Output) TA\"]")
	public WebElement selectBCB2;
	
	//este es para tc2, pendiente de ver
	@FindBy(xpath = "//li[text()=\"2099 - Ajuste - Ajuste Fiscais - NÃO MEXER - Teste automatizado\"]")
	public WebElement selectRela2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida1;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida11;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor1;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcValor1;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"version\"]/div/div[2]")
	public WebElement campoSaida11;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida1;
	
		
	// SEGUNGO subnivel
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha2;
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinha2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement selectBCBsub2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida2;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]//div[2]")
	public WebElement relatorio2;
	
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
	public WebElement segundoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-accumulated\"]/div/label/span")
	public WebElement subPeriodosAcumulados;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"accumulated-periods\"]/div/div/div[2]")
	public WebElement cantSubPeriodosAcumulados;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCantSubPeriodosAcumulados;
	
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-date\"]/div/label/span")
	public WebElement filtrosporData;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"date-filter\"]/div/div/div[2]")
	public WebElement filtrosporDataCombo;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcFiltrosporDataCombo;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-date\"]/div/label/span")
	public WebElement dataFiltro;
	
	//TERCER SUBNIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"3\"]")
	public WebElement tercerNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha3;
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinha3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]//div[2]")
	public WebElement relatorio3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-previous\"]/div/label/span")
	public WebElement subPeriodosAnteriores3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"previous-periods\"]/div/div/div[2]")
	public WebElement cantSubPeriodosAnteriores3;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcCantSubPeriodosAnteriores3;

	
	//CUARTO SUBNIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"4\"]")
	public WebElement cuartoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha4;
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO4;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]//div[2]")
	public WebElement relatorio4;
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor4;

	//QUINTO SUBNIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"5\"]")
	public WebElement quintoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha5;
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO5;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]//div[2]")
	public WebElement relatorio5;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"field_38942\"]//div[2]")
	public WebElement camposLinha5;
	
	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement camposLinha5OPC;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor5;

	
	//SEXTO NIVEL
	@FindBy(xpath = "//div[@class=\"paginator\"]//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimaPagina;
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"6\"]")
	public WebElement sextoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha6;
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO6;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"report\"]//div[2]")
	public WebElement relatorio6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"field_38942\"]//div[2]")
	public WebElement camposLinha6;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"ordination\"]//div[contains(@class,\"drop-down\")]")
	public WebElement ordenar6;
	
	@FindBy(xpath = "//div[text()=\"Crescente\"]")
	public WebElement ordenarOpc6;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"ordination-field\"]//div[contains(@class,\"drop-down\")]")
	public WebElement CampoOrdenar6;
	
	@FindBy(xpath = "//div[text()=\"CFOP\"]")
	public WebElement CampoOrdenarOPC6;
	
	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement camposLinha6OPC;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor6;
	
	//7 NIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"7\"]")
	public WebElement septimoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha7;
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO7;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"report\"]//div[2]")
	public WebElement relatorio7;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"field_38942\"]//div[2]")
	public WebElement camposLinha7;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"ordination\"]//div[contains(@class,\"drop-down\")]")
	public WebElement ordenar7;
	
	@FindBy(xpath = "//div[text()=\"Decrescente\"]")
	public WebElement ordenarOpc7;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"ordination-field\"]//div[contains(@class,\"drop-down\")]")
	public WebElement CampoOrdenar7;
	
	@FindBy(xpath = "//div[text()=\"CFOP\"]")
	public WebElement CampoOrdenarOPC7;
	
	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement camposLinha7OPC;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor7;
	

	//8 NIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"9\"]")
	public WebElement novenoNivel;
		
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha9;
	
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO9;
		
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"report\"]//div[2]")
	public WebElement relatorio9;


	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor9;
		
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-dynamic-field\"]/div/label/span")
	public WebElement agrupamento2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"dynamic-field\"]//div[2]")
	public WebElement selecAgrupamento2;
	
	@FindBy(xpath = "//div[@id=\"250\"]//span")
	public WebElement opcSelecAgrupamento2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"check-sub-grouping\"]//span")
	public WebElement subGrupo;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//div[@id=\"sub-grouping\"]/div/div/div[2]")
	public WebElement selectSubGrupo;
	
	@FindBy(xpath = "//div[@id=\"156\"]//span")
	public WebElement opcSelectSubGrupo;
	
	//8 NIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"8\"]")
	public WebElement octavoNivel;
		
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha8;
	
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO8;
		
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"report\"]//div[2]")
	public WebElement relatorio8;


	@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"value\"]//div[contains(@class,\"icon-downmenu\")]")
	public WebElement valor8;
		
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div/div[@id=\"check-dynamic-field\"]/div/label/span")
	public WebElement agrupamento;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div/div[@id=\"dynamic-field\"]//div[2]")
	public WebElement selecAgrupamento;
	
	@FindBy(xpath = "//div[@id=\"250\"]//span")
	public WebElement opcSelecAgrupamento;
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executar;

	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executarM;
	

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
	@FindBy(xpath = "//div[contains(@class,\"lvl-0\")]/div[1]/div[1]/div[1]/div[1]")
	public WebElement aba1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[1]/div[1]/div[1]/div[1]")
	public WebElement hierarquia1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[1]/div[1]/div[1]/div[1]")
	public WebElement grupo1;

	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel1;
	@FindBy(xpath = "//tr[@class=\"cell hdr-4\"][1]/td[1]/span[1]")
	public WebElement verCampoSaidaSubNivel1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel2;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel2;
	//TQ1 Y TP1
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div[1]/div[1]/div[2]")
	public WebElement periodoTiempo2;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel3;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel3;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div[1]/div[1]/div[2]")
	public WebElement periodoTiempo3;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel4;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel4;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel5;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel5;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[5]/div[1]/div[2]")
	public WebElement totalizadorSubNivel5;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][6]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel6;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][6]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel6;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[6]/div[1]/div[2]")
	public WebElement totalizadorSubNivel6;
	
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
	
	@FindBy(xpath = "//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//button[@id=\"filters-button\"]")
	public WebElement filtro;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]//button[@id=\"filters-button\"]")
	public WebElement filtro2;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Filtro\"]")
	public WebElement adicionarFiltro;
	
	@FindBy(xpath = "//div[@class=\"layout-cell value-holder\"]//input")
	public WebElement valorAjusteI;
	
	@FindBy(xpath = "//div[@id=\"field-select-container\"]//div[2]")
	public WebElement combo;
	
	@FindBy(xpath = "//li[text()=\"Valor do ajuste\"]")
	public WebElement comboOPC;
	
	
	public OrigenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO() {
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
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		//nomeDeHierarquia.sendKeys("Prueba Automatizada de Hierarquia QA PREUBA 2");
		nomeDeHierarquia.sendKeys("Origem BRB - TF");
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
		nao.click();
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

		//sucesso.add(nome.contains("Prueba Automatizada de Hierarq"));
		sucesso.add(nome.contains("Origem BRB - TF"));
		idInserir1(id2);

		int id1I = convertToInt(idH);
		int id2I = convertToInt(id2);

		System.out.println("***********");
		System.out.println("Hierarquia");
		System.out.println("Id antes da criação: " + id1I);
		System.out.println("Id Após a criação: " + id2I);
		System.out.println("");
		System.out.println("***********");

		if (id2I > id1I) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		return sucesso;
	}
	
	public void ingresarDeUnSolo() {
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
		
		
		pesquisar.sendKeys("2840");
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2840\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2840\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
	
	
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(calculator);
		sleep(2000);
		
		
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
		System.out.println("Id Configurações antes da criação: "+ id);
		idInserir2(id); //antes de crear herarquia configuracao
		
		nova.click();
		sleep(3000);

		sleep(7000);

		nomeHirarquia.sendKeys("Origem BRB - TF");
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
			ufO.click();
			ufO.sendKeys(Keys.ESCAPE);
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
			filialO.click();
			filialO.sendKeys(Keys.ESCAPE);
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
		sleep(8000);
		
		biblioteca.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(3000);
		sleep(5000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		String idApos = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		idInserir3(idApos);
		System.out.println("Id Configurações apos da criação: "+ idApos);
		
		
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
		
		sleep(2000);

		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter3()+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter3()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
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
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> BRBcomFiltroBCBcomFiltro() {
		
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
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}

		//PRIMER SUBNIVEL
		
		System.out.println("--------------------------------------------SubNivel 1-------------------------------------");
		sleep(1000);
		sleep(3000);
		
		
		campolinha1.click();
		sleep(2000);
		campoLinhaO1.click();
		sleep(6000);
		
		sleep(3000);
		
		relatorio.click();
		sleep(1000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(9000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(6000);
		}else if(tq2==true){
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		sleep(10000);
		valor1.click();
		sleep(2000);
		opcValor1.click();
		sleep(3000);
		
		filtro.click();
		sleep(3000);
		
		adicionarFiltro.click();
		sleep(3000);
		
		combo.click();
		sleep(3000);
		
		comboOPC.click();
		sleep(3000);
		
		valorAjusteI.sendKeys("5000");
		sleep(3000);
		
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> subPeriodoAcumulado() {
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		

		System.out.println("--------------------------------------------SubNivel 2-------------------------------------");
		sleep(1000);

		
		segundoNivel.click();
		sleep(2000);
		
		
		campolinha2.click();
		sleep(2000);
		campoLinha2.click();
		sleep(6000);
		
		relatorio2.click();
		sleep(1000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(9000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(6000);
		}else if(tq2==true){
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		sleep(10000);
		valor2.click();
		sleep(2000);
		opcValor1.click();
		sleep(3000);
		
		subPeriodosAcumulados.click();
		sleep(3000);
		
		cantSubPeriodosAcumulados.click();
		sleep(2000);		
		opcCantSubPeriodosAcumulados.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> subPeriodoAnterior() {
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		

		
		System.out.println("--------------------------------------------SubNivel 3-------------------------------------");
		sleep(1000);

		
		tercerNivel.click();
		sleep(2000);
		
		campolinha3.click();
		sleep(2000);
		campoLinha3.click();
		sleep(6000);
		
		relatorio3.click();
		sleep(7000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		sleep(10000);
		valor3.click();
		sleep(2000);
		opcValor1.click();
		sleep(3000);


		subPeriodosAnteriores3.click();
		sleep(4000);
		
		cantSubPeriodosAnteriores3.click();
		sleep(2000);		
		opcCantSubPeriodosAnteriores3.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> filtroData() {
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		boolean tq2 = false;
		
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
		sleep(5000);
		
		
		relatorio4.click();
		sleep(9000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		sleep(10000);
		valor4.click();
		sleep(2000);
		opcValor1.click();
		sleep(4000);
		
		filtrosporData.click();
		sleep(3000);
		
		filtrosporDataCombo.click();
		sleep(2000);		
		opcFiltrosporDataCombo.click();
		sleep(2000);

	
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> campoDeLinha() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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

		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}

		System.out.println("--------------------------------------------SubNivel 5-------------------------------------");
		sleep(5000);
		
		quintoNivel.click();
		sleep(5000);
		
		campolinha5.click();
		sleep(2000);
		campoLinhaO5.click();
		sleep(6000);
		
		
		relatorio5.click();
		sleep(1000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		sleep(10000);
		valor5.click();
		sleep(2000);
		opcValor1.click();
		sleep(4000);
		
		camposLinha5.click();
		sleep(2000);
		
		camposLinha5OPC.click();
		sleep(2000);
	
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> ordenarCrescente() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		sleep(6000);
		ultimaPagina.click();
		sleep(2000);
		
		sleep(4000);
		sextoNivel.click();
		sleep(5000);
		
		campolinha6.click();
		sleep(2000);
		campoLinhaO6.click();
		sleep(4000);
		
		
		relatorio6.click();
		sleep(1000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(3000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		sleep(10000);
		valor6.click();
		sleep(2000);
		opcValor1.click();
		sleep(4000);

		camposLinha6.click();
		sleep(2000);
		
		camposLinha6OPC.click();
		sleep(2000);
		
		ordenar6.click();
		sleep(2000);
		
		ordenarOpc6.click();
		sleep(3000);
		
		CampoOrdenar6.click();
		sleep(2000);
		
		CampoOrdenarOPC6.click();
		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
	
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> ordenarDecrescente() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		sleep(6000);
		ultimaPagina.click();
		sleep(2000);
		sleep(5000);
		septimoNivel.click();
		sleep(5000);
		
		campolinha7.click();
		sleep(2000);
		campoLinhaO7.click();
		sleep(4000);
		
		
		relatorio7.click();
		sleep(1000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(3000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		sleep(10000);
		valor7.click();
		sleep(2000);
		opcValor1.click();
		sleep(4000);

		camposLinha7.click();
		sleep(2000);
		
		camposLinha7OPC.click();
		sleep(2000);
		
		ordenar7.click();
		sleep(2000);
		
		ordenarOpc7.click();
		sleep(3000);
		
		CampoOrdenar7.click();
		sleep(2000);
		
		CampoOrdenarOPC7.click();
		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
	
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> agrupamentoSemFiltro() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		sleep(6000);
		ultimaPagina.click();
		sleep(2000);
		sleep(5000);
		octavoNivel.click();
		sleep(5000);
		
		campolinha8.click();
		sleep(2000);
		campoLinhaO8.click();
		sleep(4000);
		
		
		relatorio8.click();
		sleep(1000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(3000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		sleep(10000);
		valor8.click();
		sleep(2000);
		opcValor1.click();
		sleep(4000);
		
		agrupamento.click();
		sleep(4000);
		
		selecAgrupamento.click();
		sleep(2000);		
		opcSelecAgrupamento.click();
		sleep(2000);
		closeSelect(selecAgrupamento);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
	
		
		return sucesso;
		
	}
	public ArrayList<Boolean> subAgrupamentoSemFiltro() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		sleep(6000);
		ultimaPagina.click();
		sleep(2000);
		sleep(5000);
	/*	novenoNivel.click();
		sleep(5000);*/
		
		campolinha9.click();
		sleep(2000);
		campoLinhaO9.click();
		sleep(4000);
		
		
		relatorio9.click();
		sleep(1000);
		if (tc2==true) {
			selectRela2.click();
			selectRela2.sendKeys(Keys.ESCAPE);
			sleep(3000);
		}else if(tq1==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBCB1.click();
			selectBCB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		sleep(10000);
		valor9.click();
		sleep(2000);
		opcValor1.click();
		sleep(4000);
		
		agrupamento2.click();
		sleep(4000);
		
		selecAgrupamento2.click();
		sleep(2000);		
		opcSelecAgrupamento2.click();
		sleep(2000);
		closeSelect(selecAgrupamento2);
		sleep(2000);
		
		subGrupo.click();
		sleep(4000);
		
		selectSubGrupo.click();
		sleep(2000);		
		opcSelectSubGrupo.click();
		sleep(2000);
		closeSelect(selecAgrupamento2);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
	
		
		return sucesso;
		
	}
	
	public void executar() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1=false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else {
			tq1=true;
		}
		
		sleep(1000);
		executar.click();
		sleep(3000);
		waitExpectElement(executarM);
		sleep(10000);
		executarM.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

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
			a1.click();
		}else {
			m1.click();
		}
		
		executarB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[contains(@class,\"base-dialog\")]");
		sleep(5000);
		aba1.click();
		sleep(1000);
		hierarquia1.click();
		sleep(1000);
		grupo1.click();
		sleep(1000);		
	}
	public ArrayList<Boolean> abrirSubnivel1() {
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		

		
		aba1.click();
		sleep(2000);
		hierarquia1.click();
		sleep(2000);
		grupo1.click();
		sleep(2000);
				
				
		
		System.out.println("---------------------------------Abrir SubNivel 1-------------------------------------");
		sleep(8000);
		
		subnivel1.click();
		sleep(2000);

		String valorCampoSaidaSubNivel1 = verCampoSaidaSubNivel1.getText();
		System.out.println("Campo Saida Subnivel1: "+ valorCampoSaidaSubNivel1);
		
		subnivel1.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(valorCampoSaidaSubNivel1.equals("1.000,00"));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> abrirSubnivel2() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 2-------------------------------------");
		sleep(1000);
		
		subnivel2.click();
		sleep(2000);

		String valorCampoSaidaSubNivel2 = verCampoSaidaSubNivel2.getText();
		System.out.println("Campo Saida Subnivel2: "+ valorCampoSaidaSubNivel2);
		
		String valorCampoPeriodoTiempoSubNivel2 = periodoTiempo2.getText();
		System.out.println("Campo Periodo Tiempo SubNivel2: "+ valorCampoPeriodoTiempoSubNivel2);
		
		subnivel2.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if (tc2==true) {
			sucesso.add(valorCampoSaidaSubNivel2.equals("2.000,00"));
			sucesso.add(valorCampoPeriodoTiempoSubNivel2.equals("(01/01/2014 - 31/12/2015)"));
		}else {
			sucesso.add(valorCampoSaidaSubNivel2.equals("2.000,00"));
			sucesso.add(valorCampoPeriodoTiempoSubNivel2.equals("(01/12/2015 - 31/01/2016)"));
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> abrirSubNivel3() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 3-------------------------------------");
		sleep(1000);
		
		subnivel3.click();
		sleep(2000);

		String valorCampoSaidaSubNivel3 = verCampoSaidaSubNivel3.getText();
		System.out.println("Campo Saida Subnivel3: "+ valorCampoSaidaSubNivel3);
		
		String valorCampoPeriodoTiempoSubNivel3 = periodoTiempo3.getText();
		System.out.println("Campo Periodo Tiempo SubNivel3: "+ valorCampoPeriodoTiempoSubNivel3);
		
		subnivel3.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if (tc2==true) {
			sucesso.add(valorCampoSaidaSubNivel3.equals("1.000,00"));
			sucesso.add(valorCampoPeriodoTiempoSubNivel3.equals("(Subperíodo 1/2014 - 1Y)"));
		}else {
			sucesso.add(valorCampoSaidaSubNivel3.equals("1.000,00"));
			sucesso.add(valorCampoPeriodoTiempoSubNivel3.equals("(Subperíodo 12/2015 - 1M)"));
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> abrirSubNivel4() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 4-------------------------------------");
		sleep(1000);
		
		subnivel4.click();
		sleep(2000);

		String valorCampoSaidaSubNivel4 = verCampoSaidaSubNivel4.getText();
		System.out.println("valorEntradaManual Editado"+ valorCampoSaidaSubNivel4);
		
		subnivel4.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(valorCampoSaidaSubNivel4.equals("1.000,00"));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> abrirSubnivel5() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 5-------------------------------------");
		sleep(1000);
		
		subnivel5.click();
		sleep(2000);
		
		String valorCampoSaidaSubNivel5 = verCampoSaidaSubNivel5.getText();
		System.out.println("Campo Saida Subnivel5: "+ valorCampoSaidaSubNivel5);
		
		String valortotalizadorSubNivel5 = totalizadorSubNivel5.getText();
		System.out.println("Totalizador SubNivel5: "+ valortotalizadorSubNivel5);
		
		subnivel5.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
		sucesso.add(valorCampoSaidaSubNivel5.equals("-1.000,00"));
		sucesso.add(valortotalizadorSubNivel5.equals("0,00"));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> abrirSubnivel6() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 6-------------------------------------");
		sleep(6000);
		
		subnivel6.click();
		sleep(5000);
		
		String valorCampoSaidaSubNivel6 = verCampoSaidaSubNivel6.getText();
		System.out.println("Campo Saida Subnivel5: "+ valorCampoSaidaSubNivel6);
		
		String valortotalizadorSubNivel6 = totalizadorSubNivel6.getText();
		System.out.println("Totalizador SubNivel5: "+ valortotalizadorSubNivel6);
		
		subnivel6.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
		sucesso.add(valorCampoSaidaSubNivel6.equals("1.000,00"));
		sucesso.add(valortotalizadorSubNivel6.equals("-1.000,00"));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	
	public ArrayList<Boolean> excluirConfiguracoes() {
		//EXCLUIR CONFIGURACOES

		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idConfiguracao = idObter3();
		System.out.println("");
		System.out.println("*******EXCLUIR CONFIGURACOES************");
		System.out.println("OBTER 3:" + idConfiguracao);
		System.out.println("");
		
		
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//idObter2();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);
		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1082\"]/div[1]/div"));
//		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1082\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
		
		menu.click();
		sleep(1000);
		lixeiraC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
	//	waitExpectXpath("//span[contains(text(),\"A Confiia foi enviada para a Lixeira\")]");
		sleep(2000);
		
	//	int exclucao = driver.findElements(By.xpath("guração de Hierarqu//span[contains(text(),\"A Confiia foi enviada para a Lixeira\")]")).size();
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		System.out.println(exclucao);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		pastaLexeiraC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement excluirC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluirC.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> excluirHierarquia() {
		//EXCLUIR HIERARQUIA
		
		sleep(2000);
		hierarquias.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		hierarquiaConfiguracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idHierarquia = idObter1();
		//String idHierarquia = "1100";
		System.out.println("");
		System.out.println("*******EXCLUIR HIERARQUIA************");
		System.out.println("OBTER 1:" + idHierarquia);
		System.out.println("");
		
		
	/*	pesquisar.sendKeys(idHierarquia);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/
		
		sleep(6000);
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1100\"]/div[1]/div"));
//		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1100\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div"));
		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(3000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]");
	
		
		
		
		//System.out.println(sucesso);
		pastaLexeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	/*	pesquisar.sendKeys(idHierarquia);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		sleep(3000);
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div"));
		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		excluirH.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A configuração hierarquia foi excluída com sucesso\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		return sucesso;
	}
	
	
	
}
