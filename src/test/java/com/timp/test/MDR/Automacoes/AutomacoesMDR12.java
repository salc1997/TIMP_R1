package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaCriar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaDetalhes;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaEditar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaExcluir;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaVisualizar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisCriar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisDetalhes;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisEditar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisExcluir;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.SubItensValidos.SubItensValidosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.SubItensValidos.SubItensValidosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.SubItensValidos.SubItensValidosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluirMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFFiltrosAvan;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoDaReceitas.TabelaDeCodigosDeReceitasExcluirEmMassa;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AutomacoesMDR12 extends TestBaseSteven{

	// Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situa�ao Tributaria

	TabelaCodigoDaSitua�aoTributariaCriar tabelaCodigoDaSitua�aoTributariaCriar;
	TabelaCodigoDaSitua�aoTributariaDetalhes tabelaCodigoDaSitua�aoTributariaDetalhes;
	TabelaCodigoDaSitua�aoTributariaEditar tabelaCodigoDaSitua�aoTributariaEditar;
	TabelaCodigoDaSitua�aoTributariaExcluir tabelaCodigoDaSitua�aoTributariaExcluir;
	TabelaCodigoDaSitua�aoTributariaVisualizar tabelaCodigoDaSitua�aoTributariaVisualizar;

	// Tabela de Apoio do SPED > 5.5 Tipos De Utilizacao Dos Creditos Fiscais

	TiposDeUtilizacaoDosCreditosFiscaisCriar tiposDeUtilizacaoDosCreditosFiscaisCriar;
	TiposDeUtilizacaoDosCreditosFiscaisDetalhes tiposDeUtilizacaoDosCreditosFiscaisDetalhes;
	TiposDeUtilizacaoDosCreditosFiscaisEditar tiposDeUtilizacaoDosCreditosFiscaisEditar;
	TiposDeUtilizacaoDosCreditosFiscaisExcluir tiposDeUtilizacaoDosCreditosFiscaisExcluir;
	TiposDeUtilizacaoDosCreditosFiscaisVisualizar tiposDeUtilizacaoDosCreditosFiscaisVisualizar;

	// Tabelas Complementares Para Obriga�oes Acessorias > Agrupador De CFOP

	AgrupadorDeCFOPCriar agrupadorDeCFOPCriar;
	AgrupadorDeCFOPDetalhes agrupadorDeCFOPDetalhes;
	AgrupadorDeCFOPEditar agrupadorDeCFOPEditar;
	AgrupadorDeCFOPExcluir agrupadorDeCFOPExcluir;
	AgrupadorDeCFOPVisualizar agrupadorDeCFOPVisualizar;
	AgrupadorDeCFOPExcluirEmMassa agrupadorDeCFOPExcluirEmMassa;

	// Tabelas Complementares para Obriga��es Acess�rias > Atribui��o de Munic�pios
	// por Estado / IBGE

	AtribuicaoMunicipioEstadoCriar atribuicaoMunicipioEstadoCriar;
	AtribuicaoMunicipioEstadoDetalhes atribuicaoMunicipioEstadoDetalhes;
	AtribuicaoMunicipioEstadoEditar atribuicaoMunicipioEstadoEditar;
	AtribuicaoMunicipioEstadoExcluir atribuicaoMunicipioEstadoExcluir;
	AtribuicaoMunicipioEstadoVisualizar atribuicaoMunicipioEstadoVisualizar;
	AtribuicaoMunicipioEstadoExcluirEmMassa atribuicaoMunicipioEstadoExcluirEmMassa;

//Tabelas Complementares para Obriga��es Acess�rias > C�digo de Motivos de Ajustes
	// 

	CodigoDeMotivosDeAjustesCriar codigoDeMotivosDeAjustesCriar;
	CodigoDeMotivosDeAjustesEditar codigoDeMotivosDeAjustesEditar;
	CodigoDeMotivosDeAjustesExcluir codigoDeMotivosDeAjustesExcluir;
	CodigoDeMotivosDeAjustesExcluirEmMassa codigoDeMotivosDeAjustesExcluirEmMassa;

	// Tabelas Complementares para Obriga��es Acess�rias > C�digo de Outras Sa�das

	CodigoDeOutrasSaidasCriar codigoDeOutrasSaidasCriar;
	CodigoDeOutrasSaidasDetalhes codigoDeOutrasSaidasDetalhes;
	CodigoDeOutrasSaidasEditar codigoDeOutrasSaidasEditar;
	CodigoDeOutrasSaidasExcluir codigoDeOutrasSaidasExcluir;
	CodigoDeOutrasSaidasVisualizar codigoDeOutrasSaidasVisualizar;
	CodigoDeOutrasSaidasExcluirEmMassa codigoDeOutrasSaidasExcluirEmMassa;

	// Tabelas Complementares para Obriga��es Acess�rias > C�digo DIPAM

	CodigoDIPAMCriar codigoDIPAMCriar;
	CodigoDIPAMDetalhes codigoDIPAMDetalhes;
	CodigoDIPAMEditar codigoDIPAMEditar;
	CodigoDIPAMExcluir codigoDIPAMExcluir;
	CodigoDIPAMVisualizar codigoDIPAMVisualizar;
	CodigoDIPAMExcluirEmMassa codigoDIPAMExcluirEmMassa;

	// Tabelas Complementares para Obriga��es Acess�rias > SubItens V�lidos

	SubItensValidosCriar subItensValidosCriar;
	SubItensValidosEditar subItensValidosEditar;
	SubItensValidosExcluir subItensValidosExcluir;

	// Tabelas Complementares para Obriga��es Acess�rias > Tabela de C�digo da
	// Receitas

	TabelaCodigoReceitaCriar tabelaCodigoReceitaCriar;
	TabelaCodigoReceitaDetalhes tabelaCodigoReceitaDetalhes;
	TabelaCodigoReceitaExcluir tabelaCodigoReceitaExcluir;
	TabelaDeCodigosDeReceitasExcluirEmMassa tabelaDeCodigosDeReceitasExcluirEmMassa;
	TabelaCodigoReceitasEditar tabelaCodigoReceitasEditar;
	TabelaCodigoReceitasVisualizar tabelaCodigoReceitasVisualizar;


	
	// Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situa�ao Tributaria
		@Test(priority = 60)
		public void tabelaCodigoDaSitua�aoTributariaCriar() {

			System.out.println(
					"-------------------Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situa�ao Tributaria-------------------------");

			tabelaCodigoDaSitua�aoTributariaCriar = new TabelaCodigoDaSitua�aoTributariaCriar();
			tabelaCodigoDaSitua�aoTributariaCriar.beforeClass();
			tabelaCodigoDaSitua�aoTributariaCriar.login();
			tabelaCodigoDaSitua�aoTributariaCriar.acessarMDR();
			tabelaCodigoDaSitua�aoTributariaCriar.criar();
			tabelaCodigoDaSitua�aoTributariaCriar.afterClass();

		}

		@Test(priority = 61,dependsOnMethods = "tabelaCodigoDaSitua�aoTributariaCriar")
		public void tabelaCodigoDaSitua�aoTributariaEditar() {

			tabelaCodigoDaSitua�aoTributariaEditar = new TabelaCodigoDaSitua�aoTributariaEditar();
			tabelaCodigoDaSitua�aoTributariaEditar.beforeClass();
			tabelaCodigoDaSitua�aoTributariaEditar.login();
			tabelaCodigoDaSitua�aoTributariaEditar.acessarMDR();
			tabelaCodigoDaSitua�aoTributariaEditar.editar();
			tabelaCodigoDaSitua�aoTributariaEditar.afterClass();

		}

		@Test(priority = 62,dependsOnMethods = "tabelaCodigoDaSitua�aoTributariaCriar")
		public void tabelaCodigoDaSitua�aoTributariaVisualizar() {

			tabelaCodigoDaSitua�aoTributariaVisualizar = new TabelaCodigoDaSitua�aoTributariaVisualizar();
			tabelaCodigoDaSitua�aoTributariaVisualizar.beforeClass();
			tabelaCodigoDaSitua�aoTributariaVisualizar.login();
			tabelaCodigoDaSitua�aoTributariaVisualizar.acessarMDR();
			tabelaCodigoDaSitua�aoTributariaVisualizar.visualizar();
			tabelaCodigoDaSitua�aoTributariaVisualizar.afterClass();

		}

		@Test(priority = 63,dependsOnMethods = "tabelaCodigoDaSitua�aoTributariaCriar")
		public void tabelaCodigoDaSitua�aoTributariaDetalhes() {

			tabelaCodigoDaSitua�aoTributariaDetalhes = new TabelaCodigoDaSitua�aoTributariaDetalhes();
			tabelaCodigoDaSitua�aoTributariaDetalhes.beforeClass();
			tabelaCodigoDaSitua�aoTributariaDetalhes.login();
			tabelaCodigoDaSitua�aoTributariaDetalhes.acessarMDR();
			tabelaCodigoDaSitua�aoTributariaDetalhes.detalhes();
			tabelaCodigoDaSitua�aoTributariaDetalhes.afterClass();

		}

		@Test(priority = 64,dependsOnMethods = "tabelaCodigoDaSitua�aoTributariaCriar")
		public void tabelaCodigoDaSitua�aoTributariaExcluir() {

			tabelaCodigoDaSitua�aoTributariaExcluir = new TabelaCodigoDaSitua�aoTributariaExcluir();
			tabelaCodigoDaSitua�aoTributariaExcluir.beforeClass();
			tabelaCodigoDaSitua�aoTributariaExcluir.login();
			tabelaCodigoDaSitua�aoTributariaExcluir.acessarMDR();
			tabelaCodigoDaSitua�aoTributariaExcluir.excluir();
			tabelaCodigoDaSitua�aoTributariaExcluir.afterClass();

			System.out.println(
					"-------------------Tabela de Apoio do SPED > 4.3.3 Tabela Codigo Da Situa�ao Tributaria Fin-------------------------");
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

		// Tabelas Complementares Para Obriga�oes Acessorias > Agrupador De CFOP

		@Test(priority = 72)
		public void agrupadorDeCFOPCriar() {

			System.out.println(
					"-------------------Tabelas Complementares Para Obriga�oes Acessorias > Agrupador De CFOP-------------------------");

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
					"-------------------Tabelas Complementares Para Obriga�oes Acessorias > Agrupador De CFOP Fin-------------------------");
		}
		// 78

		// Tabelas Complementares para Obriga��es Acess�rias > Atribui��o de Munic�pios
		// por Estado / IBGE

		@Test(priority = 78)
		public void atribuicaoMunicipioEstadoCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > Atribui��o de Munic�pios por Estado / IBGE-------------------------");

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
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > Atribui��o de Munic�pios por Estado / IBGE-------------------------");
		}

		// 84

		// Tabelas Complementares para Obriga��es Acess�rias > C�digo de Motivos de
		// Ajustes

		@Test(priority = 84)
		public void codigoDeMotivosDeAjustesCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > C�digo de Motivos de Ajustes-------------------------");

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
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > C�digo de Motivos de Ajustes Fin-------------------------");
		}

		// 90

		// Tabelas Complementares para Obriga��es Acess�rias > C�digo de Outras Sa�das

		@Test(priority = 90)
		public void codigoDeOutrasSaidasCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > C�digo de Outras Sa�das-------------------------");

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
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > C�digo de Outras Sa�das Fin-------------------------");
		}

		// 96

		// Tabelas Complementares para Obriga��es Acess�rias > C�digo DIPAM

		@Test(priority = 96)
		public void codigoDIPAMCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > C�digo DIPAM-------------------------");

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
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > C�digo DIPAM Fin-------------------------");
		}

		// 102

		// Tabelas Complementares para Obriga��es Acess�rias > SubItens V�lidos

		@Test(priority = 102)
		public void subItensValidosCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obriga��es Acess�rias	> SubItens V�lidos-------------------------");

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
					"-------------------Tabelas Complementares para Obriga��es Acess�rias	> SubItens V�lidos Fin-------------------------");
		}

		// 108

		// Tabelas Complementares para Obriga��es Acess�rias > Tabela de C�digo da
		// Receitas

		@Test(priority = 108)
		public void tabelaCodigoReceitaCriar() {

			System.out.println(
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela de C�digo da Receitas-------------------------");

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
					"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela de C�digo da Receitas Fin-------------------------");
		}

		// 114

	
	

}
