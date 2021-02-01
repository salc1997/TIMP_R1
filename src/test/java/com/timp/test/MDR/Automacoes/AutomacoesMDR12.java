package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaCriar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaDetalhes;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaEditar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaExcluir;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaVisualizar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisCriar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisDetalhes;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisEditar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisExcluir;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluirMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFFiltrosAvan;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaDeCodigosDeReceitasExcluirEmMassa;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AutomacoesMDR12 extends TestBaseSteven{

	// Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situaçao Tributaria

	TabelaCodigoDaSituaçaoTributariaCriar tabelaCodigoDaSituaçaoTributariaCriar;
	TabelaCodigoDaSituaçaoTributariaDetalhes tabelaCodigoDaSituaçaoTributariaDetalhes;
	TabelaCodigoDaSituaçaoTributariaEditar tabelaCodigoDaSituaçaoTributariaEditar;
	TabelaCodigoDaSituaçaoTributariaExcluir tabelaCodigoDaSituaçaoTributariaExcluir;
	TabelaCodigoDaSituaçaoTributariaVisualizar tabelaCodigoDaSituaçaoTributariaVisualizar;

	// Tabela de Apoio do SPED > 5.5 Tipos De Utilizacao Dos Creditos Fiscais

	TiposDeUtilizacaoDosCreditosFiscaisCriar tiposDeUtilizacaoDosCreditosFiscaisCriar;
	TiposDeUtilizacaoDosCreditosFiscaisDetalhes tiposDeUtilizacaoDosCreditosFiscaisDetalhes;
	TiposDeUtilizacaoDosCreditosFiscaisEditar tiposDeUtilizacaoDosCreditosFiscaisEditar;
	TiposDeUtilizacaoDosCreditosFiscaisExcluir tiposDeUtilizacaoDosCreditosFiscaisExcluir;
	TiposDeUtilizacaoDosCreditosFiscaisVisualizar tiposDeUtilizacaoDosCreditosFiscaisVisualizar;

	// Tabelas Complementares Para Obrigaçoes Acessorias > Agrupador De CFOP

	AgrupadorDeCFOPCriar agrupadorDeCFOPCriar;
	AgrupadorDeCFOPDetalhes agrupadorDeCFOPDetalhes;
	AgrupadorDeCFOPEditar agrupadorDeCFOPEditar;
	AgrupadorDeCFOPExcluir agrupadorDeCFOPExcluir;
	AgrupadorDeCFOPVisualizar agrupadorDeCFOPVisualizar;
	AgrupadorDeCFOPExcluirEmMassa agrupadorDeCFOPExcluirEmMassa;

	// Tabelas Complementares para Obrigações Acessórias > Atribuição de Municípios
	// por Estado / IBGE

	AtribuicaoMunicipioEstadoCriar atribuicaoMunicipioEstadoCriar;
	AtribuicaoMunicipioEstadoDetalhes atribuicaoMunicipioEstadoDetalhes;
	AtribuicaoMunicipioEstadoEditar atribuicaoMunicipioEstadoEditar;
	AtribuicaoMunicipioEstadoExcluir atribuicaoMunicipioEstadoExcluir;
	AtribuicaoMunicipioEstadoVisualizar atribuicaoMunicipioEstadoVisualizar;
	AtribuicaoMunicipioEstadoExcluirEmMassa atribuicaoMunicipioEstadoExcluirEmMassa;

//Tabelas Complementares para Obrigações Acessórias > Código de Motivos de Ajustes
	// 

	CodigoDeMotivosDeAjustesCriar codigoDeMotivosDeAjustesCriar;
	CodigoDeMotivosDeAjustesEditar codigoDeMotivosDeAjustesEditar;
	CodigoDeMotivosDeAjustesExcluir codigoDeMotivosDeAjustesExcluir;
	CodigoDeMotivosDeAjustesExcluirEmMassa codigoDeMotivosDeAjustesExcluirEmMassa;

	// Tabelas Complementares para Obrigações Acessórias > Código de Outras Saídas

	CodigoDeOutrasSaidasCriar codigoDeOutrasSaidasCriar;
	CodigoDeOutrasSaidasDetalhes codigoDeOutrasSaidasDetalhes;
	CodigoDeOutrasSaidasEditar codigoDeOutrasSaidasEditar;
	CodigoDeOutrasSaidasExcluir codigoDeOutrasSaidasExcluir;
	CodigoDeOutrasSaidasVisualizar codigoDeOutrasSaidasVisualizar;
	CodigoDeOutrasSaidasExcluirEmMassa codigoDeOutrasSaidasExcluirEmMassa;

	// Tabelas Complementares para Obrigações Acessórias > Código DIPAM

	CodigoDIPAMCriar codigoDIPAMCriar;
	CodigoDIPAMDetalhes codigoDIPAMDetalhes;
	CodigoDIPAMEditar codigoDIPAMEditar;
	CodigoDIPAMExcluir codigoDIPAMExcluir;
	CodigoDIPAMVisualizar codigoDIPAMVisualizar;
	CodigoDIPAMExcluirEmMassa codigoDIPAMExcluirEmMassa;

	// Tabelas Complementares para Obrigações Acessórias > SubItens Válidos

	SubItensValidosCriar subItensValidosCriar;
	SubItensValidosEditar subItensValidosEditar;
	SubItensValidosExcluir subItensValidosExcluir;

	// Tabelas Complementares para Obrigações Acessórias > Tabela de Código da
	// Receitas

	TabelaCodigoReceitaCriar tabelaCodigoReceitaCriar;
	TabelaCodigoReceitaDetalhes tabelaCodigoReceitaDetalhes;
	TabelaCodigoReceitaExcluir tabelaCodigoReceitaExcluir;
	TabelaDeCodigosDeReceitasExcluirEmMassa tabelaDeCodigosDeReceitasExcluirEmMassa;
	TabelaCodigoReceitasEditar tabelaCodigoReceitasEditar;
	TabelaCodigoReceitasVisualizar tabelaCodigoReceitasVisualizar;


	
	// Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situaçao Tributaria
		@Test(priority = 60)
		public void tabelaCodigoDaSituaçaoTributariaCriar() {

			System.out.println(
					"-------------------Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situaçao Tributaria-------------------------");

			tabelaCodigoDaSituaçaoTributariaCriar = new TabelaCodigoDaSituaçaoTributariaCriar();
			tabelaCodigoDaSituaçaoTributariaCriar.beforeClass();
			tabelaCodigoDaSituaçaoTributariaCriar.login();
			tabelaCodigoDaSituaçaoTributariaCriar.acessarMDR();
			tabelaCodigoDaSituaçaoTributariaCriar.criar();
			tabelaCodigoDaSituaçaoTributariaCriar.afterClass();

		}

		@Test(priority = 61,dependsOnMethods = "tabelaCodigoDaSituaçaoTributariaCriar")
		public void tabelaCodigoDaSituaçaoTributariaEditar() {

			tabelaCodigoDaSituaçaoTributariaEditar = new TabelaCodigoDaSituaçaoTributariaEditar();
			tabelaCodigoDaSituaçaoTributariaEditar.beforeClass();
			tabelaCodigoDaSituaçaoTributariaEditar.login();
			tabelaCodigoDaSituaçaoTributariaEditar.acessarMDR();
			tabelaCodigoDaSituaçaoTributariaEditar.editar();
			tabelaCodigoDaSituaçaoTributariaEditar.afterClass();

		}

		@Test(priority = 62,dependsOnMethods = "tabelaCodigoDaSituaçaoTributariaCriar")
		public void tabelaCodigoDaSituaçaoTributariaVisualizar() {

			tabelaCodigoDaSituaçaoTributariaVisualizar = new TabelaCodigoDaSituaçaoTributariaVisualizar();
			tabelaCodigoDaSituaçaoTributariaVisualizar.beforeClass();
			tabelaCodigoDaSituaçaoTributariaVisualizar.login();
			tabelaCodigoDaSituaçaoTributariaVisualizar.acessarMDR();
			tabelaCodigoDaSituaçaoTributariaVisualizar.visualizar();
			tabelaCodigoDaSituaçaoTributariaVisualizar.afterClass();

		}

		@Test(priority = 63,dependsOnMethods = "tabelaCodigoDaSituaçaoTributariaCriar")
		public void tabelaCodigoDaSituaçaoTributariaDetalhes() {

			tabelaCodigoDaSituaçaoTributariaDetalhes = new TabelaCodigoDaSituaçaoTributariaDetalhes();
			tabelaCodigoDaSituaçaoTributariaDetalhes.beforeClass();
			tabelaCodigoDaSituaçaoTributariaDetalhes.login();
			tabelaCodigoDaSituaçaoTributariaDetalhes.acessarMDR();
			tabelaCodigoDaSituaçaoTributariaDetalhes.detalhes();
			tabelaCodigoDaSituaçaoTributariaDetalhes.afterClass();

		}

		@Test(priority = 64,dependsOnMethods = "tabelaCodigoDaSituaçaoTributariaCriar")
		public void tabelaCodigoDaSituaçaoTributariaExcluir() {

			tabelaCodigoDaSituaçaoTributariaExcluir = new TabelaCodigoDaSituaçaoTributariaExcluir();
			tabelaCodigoDaSituaçaoTributariaExcluir.beforeClass();
			tabelaCodigoDaSituaçaoTributariaExcluir.login();
			tabelaCodigoDaSituaçaoTributariaExcluir.acessarMDR();
			tabelaCodigoDaSituaçaoTributariaExcluir.excluir();
			tabelaCodigoDaSituaçaoTributariaExcluir.afterClass();

			System.out.println(
					"-------------------Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situaçao Tributaria Fin-------------------------");
		}

		// 66

		// Tabela de Apoio do SPED > 5.5 Tipos De Utilizacao Dos Creditos Fiscais

		@Test(priority = 66)
		public void tiposDeUtilizacaoDosCreditosFiscaisCriar() {

			System.out.println(
					"-------------------Tabela de Apoio do SPED	> 5.5 Tipos De Utilizacao Dos Creditos Fiscais-------------------------");

			tiposDeUtilizacaoDosCreditosFiscaisCriar = new TiposDeUtilizacaoDosCreditosFiscaisCriar();
			tiposDeUtilizacaoDosCreditosFiscaisCriar.beforeClass();
			tiposDeUtilizacaoDosCreditosFiscaisCriar.login();
			tiposDeUtilizacaoDosCreditosFiscaisCriar.acessarMDR();
			tiposDeUtilizacaoDosCreditosFiscaisCriar.criar();
			tiposDeUtilizacaoDosCreditosFiscaisCriar.afterClass();

		}

		@Test(priority = 67,dependsOnMethods = "tiposDeUtilizacaoDosCreditosFiscaisCriar")
		public void tiposDeUtilizacaoDosCreditosFiscaisEditar() {

			tiposDeUtilizacaoDosCreditosFiscaisEditar = new TiposDeUtilizacaoDosCreditosFiscaisEditar();
			tiposDeUtilizacaoDosCreditosFiscaisEditar.beforeClass();
			tiposDeUtilizacaoDosCreditosFiscaisEditar.login();
			tiposDeUtilizacaoDosCreditosFiscaisEditar.acessarMDR();
			tiposDeUtilizacaoDosCreditosFiscaisEditar.editar();
			tiposDeUtilizacaoDosCreditosFiscaisEditar.afterClass();

		}

		@Test(priority = 68,dependsOnMethods = "tiposDeUtilizacaoDosCreditosFiscaisCriar")
		public void tiposDeUtilizacaoDosCreditosFiscaisVisualizar() {

			tiposDeUtilizacaoDosCreditosFiscaisVisualizar = new TiposDeUtilizacaoDosCreditosFiscaisVisualizar();
			tiposDeUtilizacaoDosCreditosFiscaisVisualizar.beforeClass();
			tiposDeUtilizacaoDosCreditosFiscaisVisualizar.login();
			tiposDeUtilizacaoDosCreditosFiscaisVisualizar.acessarMDR();
			tiposDeUtilizacaoDosCreditosFiscaisVisualizar.visualizar();
			tiposDeUtilizacaoDosCreditosFiscaisVisualizar.afterClass();

		}

		@Test(priority = 69,dependsOnMethods = "tiposDeUtilizacaoDosCreditosFiscaisCriar")
		public void tiposDeUtilizacaoDosCreditosFiscaisDetalhes() {

			tiposDeUtilizacaoDosCreditosFiscaisDetalhes = new TiposDeUtilizacaoDosCreditosFiscaisDetalhes();
			tiposDeUtilizacaoDosCreditosFiscaisDetalhes.beforeClass();
			tiposDeUtilizacaoDosCreditosFiscaisDetalhes.login();
			tiposDeUtilizacaoDosCreditosFiscaisDetalhes.acessarMDR();
			tiposDeUtilizacaoDosCreditosFiscaisDetalhes.detalhes();
			tiposDeUtilizacaoDosCreditosFiscaisDetalhes.afterClass();

		}

		@Test(priority = 70,dependsOnMethods = "tiposDeUtilizacaoDosCreditosFiscaisCriar")
		public void tiposDeUtilizacaoDosCreditosFiscaisExcluir() {

			tiposDeUtilizacaoDosCreditosFiscaisExcluir = new TiposDeUtilizacaoDosCreditosFiscaisExcluir();
			tiposDeUtilizacaoDosCreditosFiscaisExcluir.beforeClass();
			tiposDeUtilizacaoDosCreditosFiscaisExcluir.login();
			tiposDeUtilizacaoDosCreditosFiscaisExcluir.acessarMDR();
			tiposDeUtilizacaoDosCreditosFiscaisExcluir.excluir();
			tiposDeUtilizacaoDosCreditosFiscaisExcluir.afterClass();

			System.out.println(
					"-------------------Tabela de Apoio do SPED	> 5.5 Tipos De Utilizacao Dos Creditos Fiscais Fin-------------------------");
		}

		// 72

		// Tabelas Complementares Para Obrigaçoes Acessorias > Agrupador De CFOP

		@Test(priority = 72)
		public void agrupadorDeCFOPCriar() {

			System.out.println(
					"-------------------Tabelas Complementares Para Obrigaçoes Acessorias > Agrupador De CFOP-------------------------");

			agrupadorDeCFOPCriar = new AgrupadorDeCFOPCriar();
			agrupadorDeCFOPCriar.beforeClass();
			agrupadorDeCFOPCriar.login();
			agrupadorDeCFOPCriar.acessarMDR();
			agrupadorDeCFOPCriar.criar();
			agrupadorDeCFOPCriar.afterClass();

		}

		@Test(priority = 73,dependsOnMethods = "agrupadorDeCFOPCriar")
		public void agrupadorDeCFOPEditar() {

			agrupadorDeCFOPEditar = new AgrupadorDeCFOPEditar();
			agrupadorDeCFOPEditar.beforeClass();
			agrupadorDeCFOPEditar.login();
			agrupadorDeCFOPEditar.acessarMDR();
			agrupadorDeCFOPEditar.editar();
			agrupadorDeCFOPEditar.afterClass();

		}

		@Test(priority = 74,dependsOnMethods = "agrupadorDeCFOPCriar")
		public void agrupadorDeCFOPVisualizar() {

			agrupadorDeCFOPVisualizar = new AgrupadorDeCFOPVisualizar();
			agrupadorDeCFOPVisualizar.beforeClass();
			agrupadorDeCFOPVisualizar.login();
			agrupadorDeCFOPVisualizar.acessarMDR();
			agrupadorDeCFOPVisualizar.Visualizar();
			agrupadorDeCFOPVisualizar.afterClass();

		}

		@Test(priority = 75,dependsOnMethods = "agrupadorDeCFOPCriar")
		public void agrupadorDeCFOPDetalhes() {

			agrupadorDeCFOPDetalhes = new AgrupadorDeCFOPDetalhes();
			agrupadorDeCFOPDetalhes.beforeClass();
			agrupadorDeCFOPDetalhes.login();
			agrupadorDeCFOPDetalhes.acessarMDR();
			agrupadorDeCFOPDetalhes.detalhes();
			agrupadorDeCFOPDetalhes.afterClass();

		}

		@Test(priority = 76,dependsOnMethods = "agrupadorDeCFOPCriar")
		public void agrupadorDeCFOPExcluir() {

			agrupadorDeCFOPExcluir = new AgrupadorDeCFOPExcluir();
			agrupadorDeCFOPExcluir.beforeClass();
			agrupadorDeCFOPExcluir.login();
			agrupadorDeCFOPExcluir.acessarMDR();
			agrupadorDeCFOPExcluir.excluir();
			agrupadorDeCFOPExcluir.afterClass();

			}

		@Test(priority = 77)
		public void agrupadorDeCFOPExcluirEmMassa() {

			agrupadorDeCFOPExcluirEmMassa = new AgrupadorDeCFOPExcluirEmMassa();
			agrupadorDeCFOPExcluirEmMassa.beforeClass();
			agrupadorDeCFOPExcluirEmMassa.login();
			agrupadorDeCFOPExcluirEmMassa.acessarMDR();
			agrupadorDeCFOPExcluirEmMassa.criar();
			agrupadorDeCFOPExcluirEmMassa.afterClass();

			System.out.println(
					"-------------------Tabelas Complementares Para Obrigaçoes Acessorias > Agrupador De CFOP Fin-------------------------");
		}
		// 78

		// Tabelas Complementares para Obrigações Acessórias > Atribuição de Municípios
		// por Estado / IBGE

		@Test(priority = 78)
		public void atribuicaoMunicipioEstadoCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Atribuição de Municípios por Estado / IBGE-------------------------");

			atribuicaoMunicipioEstadoCriar = new AtribuicaoMunicipioEstadoCriar();
			atribuicaoMunicipioEstadoCriar.beforeClass();
			atribuicaoMunicipioEstadoCriar.login();
			atribuicaoMunicipioEstadoCriar.acessarMDR();
			atribuicaoMunicipioEstadoCriar.criar();
			atribuicaoMunicipioEstadoCriar.afterClass();

		}

		@Test(priority = 79,dependsOnMethods = "atribuicaoMunicipioEstadoCriar")
		public void atribuicaoMunicipioEstadoEditar() {

			atribuicaoMunicipioEstadoEditar = new AtribuicaoMunicipioEstadoEditar();
			atribuicaoMunicipioEstadoEditar.beforeClass();
			atribuicaoMunicipioEstadoEditar.login();
			atribuicaoMunicipioEstadoEditar.acessarMDR();
			atribuicaoMunicipioEstadoEditar.editar();
			atribuicaoMunicipioEstadoEditar.afterClass();

		}

		@Test(priority = 80,dependsOnMethods = "atribuicaoMunicipioEstadoCriar")
		public void atribuicaoMunicipioEstadoVisualizar() {

			atribuicaoMunicipioEstadoVisualizar = new AtribuicaoMunicipioEstadoVisualizar();
			atribuicaoMunicipioEstadoVisualizar.beforeClass();
			atribuicaoMunicipioEstadoVisualizar.login();
			atribuicaoMunicipioEstadoVisualizar.acessarMDR();
			atribuicaoMunicipioEstadoVisualizar.visualizar();
			atribuicaoMunicipioEstadoVisualizar.afterClass();

		}

		@Test(priority = 81,dependsOnMethods = "atribuicaoMunicipioEstadoCriar")
		public void atribuicaoMunicipioEstadoDetalhes() {

			atribuicaoMunicipioEstadoDetalhes = new AtribuicaoMunicipioEstadoDetalhes();
			atribuicaoMunicipioEstadoDetalhes.beforeClass();
			atribuicaoMunicipioEstadoDetalhes.login();
			atribuicaoMunicipioEstadoDetalhes.acessarMDR();
			atribuicaoMunicipioEstadoDetalhes.detalhes();
			atribuicaoMunicipioEstadoDetalhes.afterClass();

		}
		
		

		@Test(priority = 82,dependsOnMethods = "atribuicaoMunicipioEstadoCriar")
		public void atribuicaoMunicipioEstadoExcluir() {

			atribuicaoMunicipioEstadoExcluir = new AtribuicaoMunicipioEstadoExcluir();
			atribuicaoMunicipioEstadoExcluir.beforeClass();
			atribuicaoMunicipioEstadoExcluir.login();
			atribuicaoMunicipioEstadoExcluir.acessarMDR();
			atribuicaoMunicipioEstadoExcluir.excluir();
			atribuicaoMunicipioEstadoExcluir.afterClass();

			}
		
		@Test(priority = 83)
		public void atribuicaoMunicipioEstadoExcluirEmMassa() {

			atribuicaoMunicipioEstadoExcluirEmMassa = new AtribuicaoMunicipioEstadoExcluirEmMassa();
			atribuicaoMunicipioEstadoExcluirEmMassa.beforeClass();
			atribuicaoMunicipioEstadoExcluirEmMassa.login();
			atribuicaoMunicipioEstadoExcluirEmMassa.acessarMDR();
			atribuicaoMunicipioEstadoExcluirEmMassa.criar();
			atribuicaoMunicipioEstadoExcluirEmMassa.afterClass();

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Atribuição de Municípios por Estado / IBGE-------------------------");
		}

		// 84

		// Tabelas Complementares para Obrigações Acessórias > Código de Motivos de
		// Ajustes

		@Test(priority = 84)
		public void codigoDeMotivosDeAjustesCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Código de Motivos de Ajustes-------------------------");

			codigoDeMotivosDeAjustesCriar = new CodigoDeMotivosDeAjustesCriar();
			codigoDeMotivosDeAjustesCriar.beforeClass();
			codigoDeMotivosDeAjustesCriar.login();
			codigoDeMotivosDeAjustesCriar.acessarMDR();
			codigoDeMotivosDeAjustesCriar.criar();
			codigoDeMotivosDeAjustesCriar.afterClass();

		}

		@Test(priority = 85,dependsOnMethods = "codigoDeMotivosDeAjustesCriar")
		public void codigoDeMotivosDeAjustesEditar() {

			codigoDeMotivosDeAjustesEditar = new CodigoDeMotivosDeAjustesEditar();
			codigoDeMotivosDeAjustesEditar.beforeClass();
			codigoDeMotivosDeAjustesEditar.login();
			codigoDeMotivosDeAjustesEditar.acessarMDR();
			codigoDeMotivosDeAjustesEditar.editar();
			codigoDeMotivosDeAjustesEditar.afterClass();

		}

		@Test(priority = 86,dependsOnMethods = "codigoDeMotivosDeAjustesCriar")
		public void codigoDeMotivosDeAjustesExcluir() {

			codigoDeMotivosDeAjustesExcluir = new CodigoDeMotivosDeAjustesExcluir();
			codigoDeMotivosDeAjustesExcluir.beforeClass();
			codigoDeMotivosDeAjustesExcluir.login();
			codigoDeMotivosDeAjustesExcluir.acessarMDR();
			codigoDeMotivosDeAjustesExcluir.excluir();
			codigoDeMotivosDeAjustesExcluir.afterClass();

				}
		
		@Test(priority = 87)
		public void codigoDeMotivosDeAjustesExcluirEmMassa() {

			codigoDeMotivosDeAjustesExcluirEmMassa = new CodigoDeMotivosDeAjustesExcluirEmMassa();
			codigoDeMotivosDeAjustesExcluirEmMassa.beforeClass();
			codigoDeMotivosDeAjustesExcluirEmMassa.login();
			codigoDeMotivosDeAjustesExcluirEmMassa.acessarMDR();
			codigoDeMotivosDeAjustesExcluirEmMassa.criar();
			codigoDeMotivosDeAjustesExcluirEmMassa.afterClass();

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Código de Motivos de Ajustes Fin-------------------------");
		}

		// 90

		// Tabelas Complementares para Obrigações Acessórias > Código de Outras Saídas

		@Test(priority = 90)
		public void codigoDeOutrasSaidasCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Código de Outras Saídas-------------------------");

			codigoDeOutrasSaidasCriar = new CodigoDeOutrasSaidasCriar();
			codigoDeOutrasSaidasCriar.beforeClass();
			codigoDeOutrasSaidasCriar.login();
			codigoDeOutrasSaidasCriar.acessarMDR();
			codigoDeOutrasSaidasCriar.criar();
			codigoDeOutrasSaidasCriar.afterClass();

		}

		@Test(priority = 91,dependsOnMethods = "codigoDeOutrasSaidasCriar")
		public void codigoDeOutrasSaidasEditar() {

			codigoDeOutrasSaidasEditar = new CodigoDeOutrasSaidasEditar();
			codigoDeOutrasSaidasEditar.beforeClass();
			codigoDeOutrasSaidasEditar.login();
			codigoDeOutrasSaidasEditar.acessarMDR();
			codigoDeOutrasSaidasEditar.editar();
			codigoDeOutrasSaidasEditar.afterClass();

		}

		@Test(priority = 92,dependsOnMethods = "codigoDeOutrasSaidasCriar")
		public void codigoDeOutrasSaidasVisualizar() {

			codigoDeOutrasSaidasVisualizar = new CodigoDeOutrasSaidasVisualizar();
			codigoDeOutrasSaidasVisualizar.beforeClass();
			codigoDeOutrasSaidasVisualizar.login();
			codigoDeOutrasSaidasVisualizar.acessarMDR();
			codigoDeOutrasSaidasVisualizar.visualizar();
			codigoDeOutrasSaidasVisualizar.afterClass();

		}

		@Test(priority = 93,dependsOnMethods = "codigoDeOutrasSaidasCriar")
		public void codigoDeOutrasSaidasDetalhes() {

			codigoDeOutrasSaidasDetalhes = new CodigoDeOutrasSaidasDetalhes();
			codigoDeOutrasSaidasDetalhes.beforeClass();
			codigoDeOutrasSaidasDetalhes.login();
			codigoDeOutrasSaidasDetalhes.acessarMDR();
			codigoDeOutrasSaidasDetalhes.detalhes();
			codigoDeOutrasSaidasDetalhes.afterClass();

		}

		@Test(priority = 94,dependsOnMethods = "codigoDeOutrasSaidasCriar")
		public void codigoDeOutrasSaidasExcluir() {

			codigoDeOutrasSaidasExcluir = new CodigoDeOutrasSaidasExcluir();
			codigoDeOutrasSaidasExcluir.beforeClass();
			codigoDeOutrasSaidasExcluir.login();
			codigoDeOutrasSaidasExcluir.acessarMDR();
			codigoDeOutrasSaidasExcluir.excluir();
			codigoDeOutrasSaidasExcluir.afterClass();

				}
		
		@Test(priority = 95)
		public void codigoDeOutrasSaidasExcluirEmMassa() {

			codigoDeOutrasSaidasExcluirEmMassa = new CodigoDeOutrasSaidasExcluirEmMassa();
			codigoDeOutrasSaidasExcluirEmMassa.beforeClass();
			codigoDeOutrasSaidasExcluirEmMassa.login();
			codigoDeOutrasSaidasExcluirEmMassa.acessarMDR();
			codigoDeOutrasSaidasExcluirEmMassa.criar();
			codigoDeOutrasSaidasExcluirEmMassa.afterClass();

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Código de Outras Saídas Fin-------------------------");
		}

		// 96

		// Tabelas Complementares para Obrigações Acessórias > Código DIPAM

		@Test(priority = 96)
		public void codigoDIPAMCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Código DIPAM-------------------------");

			codigoDIPAMCriar = new CodigoDIPAMCriar();
			codigoDIPAMCriar.beforeClass();
			codigoDIPAMCriar.login();
			codigoDIPAMCriar.acessarMDR();
			codigoDIPAMCriar.criar();
			codigoDIPAMCriar.afterClass();

		}

		@Test(priority = 97,dependsOnMethods = "codigoDIPAMCriar")
		public void codigoDIPAMEditar() {

			codigoDIPAMEditar = new CodigoDIPAMEditar();
			codigoDIPAMEditar.beforeClass();
			codigoDIPAMEditar.login();
			codigoDIPAMEditar.acessarMDR();
			codigoDIPAMEditar.editar();
			codigoDIPAMEditar.afterClass();

		}

		@Test(priority = 98,dependsOnMethods = "codigoDIPAMCriar")
		public void codigoDIPAMVisualizar() {

			codigoDIPAMVisualizar = new CodigoDIPAMVisualizar();
			codigoDIPAMVisualizar.beforeClass();
			codigoDIPAMVisualizar.login();
			codigoDIPAMVisualizar.acessarMDR();
			codigoDIPAMVisualizar.visualizar();
			codigoDIPAMVisualizar.afterClass();

		}

		@Test(priority = 99,dependsOnMethods = "codigoDIPAMCriar")
		public void codigoDIPAMDetalhes() {

			codigoDIPAMDetalhes = new CodigoDIPAMDetalhes();
			codigoDIPAMDetalhes.beforeClass();
			codigoDIPAMDetalhes.login();
			codigoDIPAMDetalhes.acessarMDR();
			codigoDIPAMDetalhes.detalhes();
			codigoDIPAMDetalhes.afterClass();

		}

		@Test(priority = 100,dependsOnMethods = "codigoDIPAMCriar")
		public void codigoDIPAMExcluir() {

			codigoDIPAMExcluir = new CodigoDIPAMExcluir();
			codigoDIPAMExcluir.beforeClass();
			codigoDIPAMExcluir.login();
			codigoDIPAMExcluir.acessarMDR();
			codigoDIPAMExcluir.excluir();
			codigoDIPAMExcluir.afterClass();

			}
		
		@Test(priority = 101)
		public void codigoDIPAMExcluirEmMassa() {

			codigoDIPAMExcluirEmMassa = new CodigoDIPAMExcluirEmMassa();
			codigoDIPAMExcluirEmMassa.beforeClass();
			codigoDIPAMExcluirEmMassa.login();
			codigoDIPAMExcluirEmMassa.acessarMDR();
			codigoDIPAMExcluirEmMassa.criar();
			codigoDIPAMExcluirEmMassa.afterClass();

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Código DIPAM Fin-------------------------");
		}

		// 102

		// Tabelas Complementares para Obrigações Acessórias > SubItens Válidos

		@Test(priority = 102)
		public void subItensValidosCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias	> SubItens Válidos-------------------------");

			subItensValidosCriar = new SubItensValidosCriar();
			subItensValidosCriar.beforeClass();
			subItensValidosCriar.login();
			subItensValidosCriar.acessarMDR();
			subItensValidosCriar.criar();
			subItensValidosCriar.afterClass();

		}

		@Test(priority = 103,dependsOnMethods = "subItensValidosCriar")
		public void subItensValidosEditar() {

			subItensValidosEditar = new SubItensValidosEditar();
			subItensValidosEditar.beforeClass();
			subItensValidosEditar.login();
			subItensValidosEditar.acessarMDR();
			subItensValidosEditar.editar();
			subItensValidosEditar.afterClass();

		}

		@Test(priority = 104,dependsOnMethods = "subItensValidosCriar")
		public void subItensValidosExcluir() {

			subItensValidosExcluir = new SubItensValidosExcluir();
			subItensValidosExcluir.beforeClass();
			subItensValidosExcluir.login();
			subItensValidosExcluir.acessarMDR();
			subItensValidosExcluir.excluir();
			subItensValidosExcluir.afterClass();

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias	> SubItens Válidos Fin-------------------------");
		}

		// 108

		// Tabelas Complementares para Obrigações Acessórias > Tabela de Código da
		// Receitas

		@Test(priority = 108)
		public void tabelaCodigoReceitaCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela de Código da Receitas-------------------------");

			tabelaCodigoReceitaCriar = new TabelaCodigoReceitaCriar();
			tabelaCodigoReceitaCriar.beforeClass();
			tabelaCodigoReceitaCriar.login();
			tabelaCodigoReceitaCriar.acessarMDR();
			tabelaCodigoReceitaCriar.criar();
			tabelaCodigoReceitaCriar.afterClass();

		}

		@Test(priority = 109,dependsOnMethods = "tabelaCodigoReceitaCriar")
		public void tabelaCodigoReceitaDetalhes() {

			tabelaCodigoReceitaDetalhes = new TabelaCodigoReceitaDetalhes();
			tabelaCodigoReceitaDetalhes.beforeClass();
			tabelaCodigoReceitaDetalhes.login();
			tabelaCodigoReceitaDetalhes.acessarMDR();
			tabelaCodigoReceitaDetalhes.detalhes();
			tabelaCodigoReceitaDetalhes.afterClass();

		}
		
		@Test(priority = 110,dependsOnMethods = "tabelaCodigoReceitaCriar")
		public void tabelaCodigoReceitasEditar() {

			tabelaCodigoReceitasEditar = new TabelaCodigoReceitasEditar();
			tabelaCodigoReceitasEditar.beforeClass();
			tabelaCodigoReceitasEditar.login();
			tabelaCodigoReceitasEditar.acessarMDR();
			tabelaCodigoReceitasEditar.editar();
			tabelaCodigoReceitasEditar.afterClass();

		}
		
		@Test(priority = 111,dependsOnMethods = "tabelaCodigoReceitaCriar")
		public void tabelaCodigoReceitasVisualizar() {

			tabelaCodigoReceitasVisualizar = new TabelaCodigoReceitasVisualizar();
			tabelaCodigoReceitasVisualizar.beforeClass();
			tabelaCodigoReceitasVisualizar.login();
			tabelaCodigoReceitasVisualizar.acessarMDR();
			tabelaCodigoReceitasVisualizar.visualizar();
			tabelaCodigoReceitasVisualizar.afterClass();

		}
		
		

		@Test(priority = 112,dependsOnMethods = "tabelaCodigoReceitaCriar")
		public void tabelaCodigoReceitaExcluir() {

			tabelaCodigoReceitaExcluir = new TabelaCodigoReceitaExcluir();
			tabelaCodigoReceitaExcluir.beforeClass();
			tabelaCodigoReceitaExcluir.login();
			tabelaCodigoReceitaExcluir.acessarMDR();
			tabelaCodigoReceitaExcluir.excluir();
			tabelaCodigoReceitaExcluir.afterClass();

			
		}
		
		@Test(priority = 113)
		public void tabelaDeCodigosDeReceitasExcluirEmMassa() {

			tabelaDeCodigosDeReceitasExcluirEmMassa= new TabelaDeCodigosDeReceitasExcluirEmMassa();
			tabelaDeCodigosDeReceitasExcluirEmMassa.beforeClass();
			tabelaDeCodigosDeReceitasExcluirEmMassa.login();
			tabelaDeCodigosDeReceitasExcluirEmMassa.acessarMDR();
			tabelaDeCodigosDeReceitasExcluirEmMassa.criar();
			tabelaDeCodigosDeReceitasExcluirEmMassa.afterClass();

			System.out.println(
					"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela de Código da Receitas Fin-------------------------");
		}

		// 114

	
	

}
