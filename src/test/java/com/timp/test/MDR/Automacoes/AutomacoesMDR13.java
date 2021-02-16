package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoExcluirMassa;
import com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorCriar;
import com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorDetalhes;
import com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPExcluirEnMasa;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPFiltroId;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametroModeloApuracaoTPFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPExcluirEmMasa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDaReceitasPermitidas.TabelaReceitasPermitidasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDaReceitasPermitidas.TabelaReceitasPermitidasDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDaReceitasPermitidas.TabelaReceitasPermitidasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDaReceitasPermitidas.TabelaReceitasPermitidasExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDaReceitasPermitidas.TabelaReceitasPermitidasExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDaReceitasPermitidas.TabelaReceitasPermitidasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGECriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutosDebitosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosVisualizar;
import com.timp.test.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabilCriar;
import com.timp.test.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabilExcluir;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarCriar;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarDetalhes;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarEditar;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarExcluir;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarFiltrosAvançados;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarVisualizar;

public class AutomacoesMDR13 extends TestBaseSteven{
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de municípios IBGE
	TabelaMunicipioIBGECriar tabelaMunicipioIBGECriar;
	TabelaMunicipioIBGEDetalhes tabelaMunicipioIBGEDetalhes;
	TabelaMunicipioIBGEEditar tabelaMunicipioIBGEEditar;
	TabelaMunicipioIBGEExcluir tabelaMunicipioIBGEExcluir;
	TabelaMunicipioIBGEVisualizar tabelaMunicipioIBGEVisualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de outros debitos
	TabelaOutrosDebitosCriar tabelaOutrosDebitosCriar;
	TabelaOutrosDebitosDetalhes tabelaOutrosDebitosDetalhes;
	TabelaOutosDebitosEditar tabelaOutosDebitosEditar;
	TabelaOutrosDebitosExcluir tabelaOutrosDebitosExcluir;
	TabelaOutrosDebitosVisualizar tabelaOutrosDebitosVisualizar;
	TabelaOutrosDebitosExcluirEmMassa tabelaOutrosDebitosExcluirEmMassa;

	// Tabelas Complementares para obrigaçoes acessorias >Tabela de Receitas
	// (Credito Fiscal Antecipado)

	TabelaReceitasCreditoFiscalAntecipadoCriar tabelaReceitasCreditoFiscalAntecipadoCriar;
	TabelaReceitasCreditoFiscalAntecipadoEditar tabelaReceitasCreditoFiscalAntecipadoEditar;
	TabelaReceitasCreditoFiscalAntecipadoDetalhes tabelaReceitasCreditoFiscalAntecipadoDetalhes;
	TabelaReceitasCreditoFiscalAntecipadoVisualizar tabelaReceitasCreditoFiscalAntecipadoVisualizar;
	TabelaReceitasCreditoFiscalAntecipadoExcluir tabelaReceitasCreditoFiscalAntecipadoExcluir;
	TabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa;

	// Tabelas Complementares para obrigaçoes acessorias >Tabela da Receitas
	// permitidas
	TabelaReceitasPermitidasCriar tabelaReceitasPermitidasCriar;
	TabelaReceitasPermitidasDetalhes tabelaReceitasPermitidasDetalhes;
	TabelaReceitasPermitidasEditar tabelaReceitasPermitidasEditar;
	TabelaReceitasPermitidasExcluir tabelaReceitasPermitidasExcluir;
	TabelaReceitasPermitidasVisualizar tabelaReceitasPermitidasVisualizar;
	TabelaReceitasPermitidasExcluirEmMassa tabelaReceitasPermitidasExcluirEmMassa;


	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Serviços

	TabelaServicosCriar tabelaServicosCriar;
	TabelaServicosDetalhes tabelaServicosDetalhes;
	TabelaServicosExcluir tabelaServicosExcluir;
	TabelaServicosEditar tabelaServicosEditar;
	TabelaServicosVisualizar tabelaServicosVisualizar;

	// Tipo de Tributo Conta Contabil
	TipoDeTributoContaContabilCriar tipoDeTributoContaContabilCriar;
	TipoDeTributoContaContabilExcluir tipoDeTributoContaContabilExcluir;

	// Valor Adicionado > Inclusao de Campos Mar

	InclusaoDeCamposMarCriar inclusaoDeCamposMarCriar;
	InclusaoDeCamposMarDetalhes inclusaoDeCamposMarDetalhes;
	InclusaoDeCamposMarEditar inclusaoDeCamposMarEditar;
	InclusaoDeCamposMarExcluir inclusaoDeCamposMarExcluir;
	InclusaoDeCamposMarFiltrosAvançados inclusaoDeCamposMarFiltrosAvançados;
	InclusaoDeCamposMarVisualizar inclusaoDeCamposMarVisualizar;

	// Eventos e-social > S1060 - Ambientes de Trabalho
	S1060AmbientesDeTrablhoExcluirMassa s1060AmbientesDeTrablhoExcluirMassa;

	// Eventos e-social > S1200 Remuneracao De Trabalhador...
	S1200RemuneracaoDeTrabalhadorCriar s1200RemuneracaoDeTrabalhadorCriar;
	S1200RemuneracaoDeTrabalhadorDetalhes s1200RemuneracaoDeTrabalhadorDetalhes;
	S1200RemuneracaoDeTrabalhadorExcluir s1200RemuneracaoDeTrabalhadorExcluir;

	// Eventos e-social > S1250 Aquisicao De Producao Rural
	S1250AquisicaoDeProducaoRuralCriar s1250AquisicaoDeProducaoRuralCriar;
	S1250AquisicaoDeProducaoRuralEditar s1250AquisicaoDeProducaoRuralEditar;
	S1250AquisicaoDeProducaoRuralExcluir s1250AquisicaoDeProducaoRuralExcluir;

	// Preço de Transferencia > Modelo De Apuraçao TP
	ModeloDeApuracaoTPCriar modeloDeApuracaoTPCriar;
	ModeloDeApuracaoTPDetalhes modeloDeApuracaoTPDetalhes;
	ModeloDeApuracaoTPEditar modeloDeApuracaoTPEditar;
	ModeloDeApuracaoTPExcluir modeloDeApuracaoTPExcluir;
	ModeloDeApuracaoTPFiltroId modeloDeApuracaoTPFiltroId;
	ModeloDeApuracaoTPExcluirEnMasa modeloDeApuracaoTPExcluirEnMasa;


	// Preço de Transferencia > Parametros Modelo De Apuracao TP
	ParametrosModeloDeApuracaoTPCriar parametrosModeloDeApuracaoTPCriar;
	ParametrosModeloDeApuracaoTPEditar parametrosModeloDeApuracaoTPEditar;
	ParametrosModeloDeApuracaoTPDetalhes parametrosModeloDeApuracaoTPDetalhes;
	ParametrosModeloDeApuracaoTPExcluir parametrosModeloDeApuracaoTPExcluir;
	ParametroModeloApuracaoTPFiltroID parametroModeloApuracaoTPFiltroID;
	ParametrosModeloDeApuracaoTPExcluirEmMasa parametrosModeloDeApuracaoTPExcluirEmMasa;
	
	// 54
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de municípios IBGE
	@Test(priority = 54)
	public void tabelaMunicipioIBGECriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de municípios IBGE-------------------------");
		tabelaMunicipioIBGECriar = new TabelaMunicipioIBGECriar();
		tabelaMunicipioIBGECriar.beforeClass();
		tabelaMunicipioIBGECriar.login();
		tabelaMunicipioIBGECriar.acessarMDR();
		tabelaMunicipioIBGECriar.criar();
		tabelaMunicipioIBGECriar.afterClass();

	}

	@Test(priority = 55)
	public void tabelaMunicipioIBGEDetalhes() {

		tabelaMunicipioIBGEDetalhes = new TabelaMunicipioIBGEDetalhes();
		tabelaMunicipioIBGEDetalhes.beforeClass();
		tabelaMunicipioIBGEDetalhes.login();
		tabelaMunicipioIBGEDetalhes.acessarMDR();
		tabelaMunicipioIBGEDetalhes.detalhes();
		tabelaMunicipioIBGEDetalhes.afterClass();

	}

	@Test(priority = 56)
	public void tabelaMunicipioIBGEEditar() {

		tabelaMunicipioIBGEEditar = new TabelaMunicipioIBGEEditar();
		tabelaMunicipioIBGEEditar.beforeClass();
		tabelaMunicipioIBGEEditar.login();
		tabelaMunicipioIBGEEditar.acessarMDR();
		tabelaMunicipioIBGEEditar.editar();
		tabelaMunicipioIBGEEditar.afterClass();

	}

	@Test(priority = 57)
	public void tabelaMunicipioIBGEVisualizar() {

		tabelaMunicipioIBGEVisualizar = new TabelaMunicipioIBGEVisualizar();
		tabelaMunicipioIBGEVisualizar.beforeClass();
		tabelaMunicipioIBGEVisualizar.login();
		tabelaMunicipioIBGEVisualizar.acessarMDR();
		tabelaMunicipioIBGEVisualizar.visualizar();
		tabelaMunicipioIBGEVisualizar.afterClass();

	}

	@Test(priority = 58)
	public void tabelaMunicipioIBGEExcluir() {

		tabelaMunicipioIBGEExcluir = new TabelaMunicipioIBGEExcluir();
		tabelaMunicipioIBGEExcluir.beforeClass();
		tabelaMunicipioIBGEExcluir.login();
		tabelaMunicipioIBGEExcluir.acessarMDR();
		tabelaMunicipioIBGEExcluir.excluir();
		tabelaMunicipioIBGEExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de municípios IBGE Fim-------------------------");

	}

	// 60
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de outros debitos

	@Test(priority = 60)
	public void tabelaOutrosDebitosCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de outros debitos-------------------------");
		tabelaOutrosDebitosCriar = new TabelaOutrosDebitosCriar();
		tabelaOutrosDebitosCriar.beforeClass();
		tabelaOutrosDebitosCriar.login();
		tabelaOutrosDebitosCriar.acessarMDR();
		tabelaOutrosDebitosCriar.criar();
		tabelaOutrosDebitosCriar.afterClass();

	}

	@Test(priority = 61)
	public void tabelaOutrosDebitosDetalhes() {

		tabelaOutrosDebitosDetalhes = new TabelaOutrosDebitosDetalhes();
		tabelaOutrosDebitosDetalhes.beforeClass();
		tabelaOutrosDebitosDetalhes.login();
		tabelaOutrosDebitosDetalhes.acessarMDR();
		tabelaOutrosDebitosDetalhes.detalhes();
		tabelaOutrosDebitosDetalhes.afterClass();

	}

	@Test(priority = 62)
	public void tabelaOutosDebitosEditar() {

		tabelaOutosDebitosEditar = new TabelaOutosDebitosEditar();
		tabelaOutosDebitosEditar.beforeClass();
		tabelaOutosDebitosEditar.login();
		tabelaOutosDebitosEditar.acessarMDR();
		tabelaOutosDebitosEditar.editar();
		tabelaOutosDebitosEditar.afterClass();

	}

	@Test(priority = 63)
	public void tabelaOutrosDebitosVisualizar() {

		tabelaOutrosDebitosVisualizar = new TabelaOutrosDebitosVisualizar();
		tabelaOutrosDebitosVisualizar.beforeClass();
		tabelaOutrosDebitosVisualizar.login();
		tabelaOutrosDebitosVisualizar.acessarMDR();
		tabelaOutrosDebitosVisualizar.visualizar();
		tabelaOutrosDebitosVisualizar.afterClass();

	}

	@Test(priority = 64)
	public void tabelaOutrosDebitosExcluir() {

		tabelaOutrosDebitosExcluir = new TabelaOutrosDebitosExcluir();
		tabelaOutrosDebitosExcluir.beforeClass();
		tabelaOutrosDebitosExcluir.login();
		tabelaOutrosDebitosExcluir.acessarMDR();
		tabelaOutrosDebitosExcluir.excluir();
		tabelaOutrosDebitosExcluir.afterClass();

	}

	@Test(priority = 65)
	public void tabelaOutrosDebitosExcluirEmMassa() {

		tabelaOutrosDebitosExcluirEmMassa = new TabelaOutrosDebitosExcluirEmMassa();
		tabelaOutrosDebitosExcluirEmMassa.beforeClass();
		tabelaOutrosDebitosExcluirEmMassa.login();
		tabelaOutrosDebitosExcluirEmMassa.acessarMDR();
		tabelaOutrosDebitosExcluirEmMassa.criar();
		tabelaOutrosDebitosExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de outros debitos fim-------------------------");

	}

	// 66
	// Tabelas Complementares para obrigaçoes acessorias >Tabela de Receitas
	// (Credito Fiscal Antecipado)

	@Test(priority = 66)
	public void tabelaReceitasCreditoFiscalAntecipadoCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias >Tabela de Receitas (Credito Fiscal Antecipado)-------------------------");
		tabelaReceitasCreditoFiscalAntecipadoCriar = new TabelaReceitasCreditoFiscalAntecipadoCriar();
		tabelaReceitasCreditoFiscalAntecipadoCriar.beforeClass();
		tabelaReceitasCreditoFiscalAntecipadoCriar.login();
		tabelaReceitasCreditoFiscalAntecipadoCriar.acessarMDR();
		tabelaReceitasCreditoFiscalAntecipadoCriar.criar();
		tabelaReceitasCreditoFiscalAntecipadoCriar.afterClass();

	}

	@Test(priority = 67)
	public void tabelaReceitasCreditoFiscalAntecipadoEditar() {

		tabelaReceitasCreditoFiscalAntecipadoEditar = new TabelaReceitasCreditoFiscalAntecipadoEditar();
		tabelaReceitasCreditoFiscalAntecipadoEditar.beforeClass();
		tabelaReceitasCreditoFiscalAntecipadoEditar.login();
		tabelaReceitasCreditoFiscalAntecipadoEditar.acessarMDR();
		tabelaReceitasCreditoFiscalAntecipadoEditar.editar();
		tabelaReceitasCreditoFiscalAntecipadoEditar.afterClass();

	}

	@Test(priority = 68)
	public void tabelaReceitasCreditoFiscalAntecipadoVisualizar() {

		tabelaReceitasCreditoFiscalAntecipadoVisualizar = new TabelaReceitasCreditoFiscalAntecipadoVisualizar();
		tabelaReceitasCreditoFiscalAntecipadoVisualizar.beforeClass();
		tabelaReceitasCreditoFiscalAntecipadoVisualizar.login();
		tabelaReceitasCreditoFiscalAntecipadoVisualizar.acessarMDR();
		tabelaReceitasCreditoFiscalAntecipadoVisualizar.visualizar();
		tabelaReceitasCreditoFiscalAntecipadoVisualizar.afterClass();

	}

	@Test(priority = 69)
	public void tabelaReceitasCreditoFiscalAntecipadoDetalhes() {

		tabelaReceitasCreditoFiscalAntecipadoDetalhes = new TabelaReceitasCreditoFiscalAntecipadoDetalhes();
		tabelaReceitasCreditoFiscalAntecipadoDetalhes.beforeClass();
		tabelaReceitasCreditoFiscalAntecipadoDetalhes.login();
		tabelaReceitasCreditoFiscalAntecipadoDetalhes.acessarMDR();
		tabelaReceitasCreditoFiscalAntecipadoDetalhes.detalhes();
		tabelaReceitasCreditoFiscalAntecipadoDetalhes.afterClass();

	}



	@Test(priority = 70)
	public void tabelaReceitasCreditoFiscalAntecipadoExcluir() {

		tabelaReceitasCreditoFiscalAntecipadoExcluir = new TabelaReceitasCreditoFiscalAntecipadoExcluir();
		tabelaReceitasCreditoFiscalAntecipadoExcluir.beforeClass();
		tabelaReceitasCreditoFiscalAntecipadoExcluir.login();
		tabelaReceitasCreditoFiscalAntecipadoExcluir.acessarMDR();
		tabelaReceitasCreditoFiscalAntecipadoExcluir.excluir();
		tabelaReceitasCreditoFiscalAntecipadoExcluir.afterClass();

	}

	@Test(priority = 71)
	public void tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa() {

		tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa = new TabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa();
		tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa.beforeClass();
		tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa.login();
		tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa.acessarMDR();
		tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa.criar();
		tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa.afterClass();

		System.out.println(
				"------------------- Tabelas Complementares para obrigaçoes acessorias >Tabela de Receitas (Credito Fiscal Antecipado) Fin-------------------------");
	}

	// 72
	// Tabelas Complementares para obrigaçoes acessorias >Tabela da Receitas
	// permitidas

	@Test(priority = 72)
	public void tabelaReceitasPermitidasCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias >Tabela da Receitas permitidas-------------------------");
		tabelaReceitasPermitidasCriar = new TabelaReceitasPermitidasCriar();
		tabelaReceitasPermitidasCriar.beforeClass();
		tabelaReceitasPermitidasCriar.login();
		tabelaReceitasPermitidasCriar.acessarMDR();
		tabelaReceitasPermitidasCriar.criar();
		tabelaReceitasPermitidasCriar.afterClass();

	}

	@Test(priority = 73)
	public void tabelaReceitasPermitidasDetalhes() {

		tabelaReceitasPermitidasDetalhes = new TabelaReceitasPermitidasDetalhes();
		tabelaReceitasPermitidasDetalhes.beforeClass();
		tabelaReceitasPermitidasDetalhes.login();
		tabelaReceitasPermitidasDetalhes.acessarMDR();
		tabelaReceitasPermitidasDetalhes.Detalhes();
		tabelaReceitasPermitidasDetalhes.afterClass();

	}

	@Test(priority = 74)
	public void tabelaReceitasPermitidasEditar() {

		tabelaReceitasPermitidasEditar = new TabelaReceitasPermitidasEditar();
		tabelaReceitasPermitidasEditar.beforeClass();
		tabelaReceitasPermitidasEditar.login();
		tabelaReceitasPermitidasEditar.acessarMDR();
		tabelaReceitasPermitidasEditar.editar();
		tabelaReceitasPermitidasEditar.afterClass();

	}

	@Test(priority = 75)
	public void tabelaReceitasPermitidasVisualizar() {

		tabelaReceitasPermitidasVisualizar = new TabelaReceitasPermitidasVisualizar();
		tabelaReceitasPermitidasVisualizar.beforeClass();
		tabelaReceitasPermitidasVisualizar.login();
		tabelaReceitasPermitidasVisualizar.acessarMDR();
		tabelaReceitasPermitidasVisualizar.visualizar();
		tabelaReceitasPermitidasVisualizar.afterClass();

	}

	@Test(priority = 76)
	public void tabelaReceitasPermitidasExcluir() {

		tabelaReceitasPermitidasExcluir = new TabelaReceitasPermitidasExcluir();
		tabelaReceitasPermitidasExcluir.beforeClass();
		tabelaReceitasPermitidasExcluir.login();
		tabelaReceitasPermitidasExcluir.acessarMDR();
		tabelaReceitasPermitidasExcluir.excluir();
		tabelaReceitasPermitidasExcluir.afterClass();

	}

	@Test(priority = 77)
	public void tabelaReceitasPermitidasExcluirEmMassa() {

		tabelaReceitasPermitidasExcluirEmMassa = new TabelaReceitasPermitidasExcluirEmMassa();
		tabelaReceitasPermitidasExcluirEmMassa.beforeClass();
		tabelaReceitasPermitidasExcluirEmMassa.login();
		tabelaReceitasPermitidasExcluirEmMassa.acessarMDR();
		tabelaReceitasPermitidasExcluirEmMassa.criar();
		tabelaReceitasPermitidasExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias >Tabela da Receitas permitidas Fim-------------------------");

	}

	// 78
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Serviços

	@Test(priority = 78)
	public void tabelaServicosCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Serviços-------------------------");
		tabelaServicosCriar = new TabelaServicosCriar();
		tabelaServicosCriar.beforeClass();
		tabelaServicosCriar.login();
		tabelaServicosCriar.acessarMDR();
		tabelaServicosCriar.criar();
		tabelaServicosCriar.afterClass();

	}

	@Test(priority = 79)
	public void tabelaServicosDetalhes() {

		tabelaServicosDetalhes = new TabelaServicosDetalhes();
		tabelaServicosDetalhes.beforeClass();
		tabelaServicosDetalhes.login();
		tabelaServicosDetalhes.acessarMDR();
		tabelaServicosDetalhes.detalhes();
		tabelaServicosDetalhes.afterClass();

	}

	@Test(priority = 80)
	public void tabelaServicosEditar() {

		tabelaServicosEditar = new TabelaServicosEditar();
		tabelaServicosEditar.beforeClass();
		tabelaServicosEditar.login();
		tabelaServicosEditar.acessarMDR();
		tabelaServicosEditar.editar();
		tabelaServicosEditar.afterClass();

	}

	@Test(priority = 81)
	public void tabelaServicosVisualizar() {

		tabelaServicosVisualizar = new TabelaServicosVisualizar();
		tabelaServicosVisualizar.beforeClass();
		tabelaServicosVisualizar.login();
		tabelaServicosVisualizar.acessarMDR();
		tabelaServicosVisualizar.visualizar();
		tabelaServicosVisualizar.afterClass();

	}

	@Test(priority = 82)
	public void tabelaServicosExcluir() {

		tabelaServicosExcluir = new TabelaServicosExcluir();
		tabelaServicosExcluir.beforeClass();
		tabelaServicosExcluir.login();
		tabelaServicosExcluir.acessarMDR();
		tabelaServicosExcluir.excluir();
		tabelaServicosExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Serviços Fim-------------------------");
	}

	// 84
	// Tipo de Tributo Conta Contabil

	@Test(priority = 84)
	public void tipoDeTributoContaContabilCriar() {
		System.out.println("-------------------Tipo de Tributo X Conta Contabil-------------------------");
		tipoDeTributoContaContabilCriar = new TipoDeTributoContaContabilCriar();
		tipoDeTributoContaContabilCriar.beforeClass();
		tipoDeTributoContaContabilCriar.login();
		tipoDeTributoContaContabilCriar.acessarMDR();
		tipoDeTributoContaContabilCriar.criar();
		tipoDeTributoContaContabilCriar.afterClass();

	}

	@Test(priority = 85)
	public void tipoDeTributoContaContabilExcluir() {

		tipoDeTributoContaContabilExcluir = new TipoDeTributoContaContabilExcluir();
		tipoDeTributoContaContabilExcluir.beforeClass();
		tipoDeTributoContaContabilExcluir.login();
		tipoDeTributoContaContabilExcluir.acessarMDR();
		tipoDeTributoContaContabilExcluir.excluir();
		tipoDeTributoContaContabilExcluir.afterClass();
		System.out.println("-------------------Tipo de Tributo X Conta Contabil Fim-------------------------");
	}

	// 90
	// Valor Adicionado > Inclusao de Campos Mar

	@Test(priority = 90)
	public void inclusaoDeCamposMarCriar() {
		System.out.println("-------------------Valor Adicionado > Inclusao de Campos Mar-------------------------");
		inclusaoDeCamposMarCriar = new InclusaoDeCamposMarCriar();
		inclusaoDeCamposMarCriar.beforeClass();
		inclusaoDeCamposMarCriar.login();
		inclusaoDeCamposMarCriar.acessarMDR();
		inclusaoDeCamposMarCriar.criar();
		inclusaoDeCamposMarCriar.afterClass();

	}

	@Test(priority = 91)
	public void inclusaoDeCamposMarDetalhes() {

		inclusaoDeCamposMarDetalhes = new InclusaoDeCamposMarDetalhes();
		inclusaoDeCamposMarDetalhes.beforeClass();
		inclusaoDeCamposMarDetalhes.login();
		inclusaoDeCamposMarDetalhes.acessarMDR();
		inclusaoDeCamposMarDetalhes.detalhes();
		inclusaoDeCamposMarDetalhes.afterClass();

	}

	@Test(priority = 92)
	public void inclusaoDeCamposMarEditar() {

		inclusaoDeCamposMarEditar = new InclusaoDeCamposMarEditar();
		inclusaoDeCamposMarEditar.beforeClass();
		inclusaoDeCamposMarEditar.login();
		inclusaoDeCamposMarEditar.acessarMDR();
		inclusaoDeCamposMarEditar.editar();
		inclusaoDeCamposMarEditar.afterClass();

	}

	@Test(priority = 93)
	public void inclusaoDeCamposMarFiltrosAvançados() {

		inclusaoDeCamposMarFiltrosAvançados = new InclusaoDeCamposMarFiltrosAvançados();
		inclusaoDeCamposMarFiltrosAvançados.beforeClass();
		inclusaoDeCamposMarFiltrosAvançados.login();
		inclusaoDeCamposMarFiltrosAvançados.acessarMDR();
		inclusaoDeCamposMarFiltrosAvançados.filtros();
		inclusaoDeCamposMarFiltrosAvançados.afterClass();

	}

	@Test(priority = 94)
	public void inclusaoDeCamposMarVisualizar() {

		inclusaoDeCamposMarVisualizar = new InclusaoDeCamposMarVisualizar();
		inclusaoDeCamposMarVisualizar.beforeClass();
		inclusaoDeCamposMarVisualizar.login();
		inclusaoDeCamposMarVisualizar.acessarMDR();
		inclusaoDeCamposMarVisualizar.Visualizar();
		inclusaoDeCamposMarVisualizar.afterClass();

	}

	@Test(priority = 95)
	public void inclusaoDeCamposMarExcluir() {

		inclusaoDeCamposMarExcluir = new InclusaoDeCamposMarExcluir();
		inclusaoDeCamposMarExcluir.beforeClass();
		inclusaoDeCamposMarExcluir.login();
		inclusaoDeCamposMarExcluir.acessarMDR();
		inclusaoDeCamposMarExcluir.Excluir();
		inclusaoDeCamposMarExcluir.afterClass();
		System.out.println("-------------------Valor Adicionado > Inclusao de Campos Mar Fim-------------------------");
	}

	// 96
	// Eventos e-social > S1200 Remuneracao De Trabalhador...

	@Test(priority = 96)
	public void s1200RemuneracaoDeTrabalhadorCriar() {
		System.out.println(
				"-------------------Eventos e-social >  S1200 Remuneracao De Trabalhador...-------------------------");
		s1200RemuneracaoDeTrabalhadorCriar = new S1200RemuneracaoDeTrabalhadorCriar();
		s1200RemuneracaoDeTrabalhadorCriar.beforeClass();
		s1200RemuneracaoDeTrabalhadorCriar.login();
		s1200RemuneracaoDeTrabalhadorCriar.acessarMDR();
		s1200RemuneracaoDeTrabalhadorCriar.criar();
		s1200RemuneracaoDeTrabalhadorCriar.afterClass();

	}

	@Test(priority = 97)
	public void s1200RemuneracaoDeTrabalhadorDetalhes() {

		s1200RemuneracaoDeTrabalhadorDetalhes = new S1200RemuneracaoDeTrabalhadorDetalhes();
		s1200RemuneracaoDeTrabalhadorDetalhes.beforeClass();
		s1200RemuneracaoDeTrabalhadorDetalhes.login();
		s1200RemuneracaoDeTrabalhadorDetalhes.acessarMDR();
		s1200RemuneracaoDeTrabalhadorDetalhes.detalhes();
		s1200RemuneracaoDeTrabalhadorDetalhes.afterClass();

	}

	@Test(priority = 98)
	public void s1200RemuneracaoDeTrabalhadorExcluir() {

		s1200RemuneracaoDeTrabalhadorExcluir = new S1200RemuneracaoDeTrabalhadorExcluir();
		s1200RemuneracaoDeTrabalhadorExcluir.beforeClass();
		s1200RemuneracaoDeTrabalhadorExcluir.login();
		s1200RemuneracaoDeTrabalhadorExcluir.acessarMDR();
		s1200RemuneracaoDeTrabalhadorExcluir.excluir();
		s1200RemuneracaoDeTrabalhadorExcluir.afterClass();
		System.out.println(
				"-------------------Eventos e-social >  S1200 Remuneracao De Trabalhador... Fim-------------------------");
	}

	// 103
	// Eventos e-social > S1250 Aquisicao De Producao Rural

	@Test(priority = 103)
	public void s1250AquisicaoDeProducaoRuralCriar() {
		System.out.println(
				"-------------------Eventos e-social >  S1250 Aquisicao De Producao Rural-------------------------");
		s1250AquisicaoDeProducaoRuralCriar = new S1250AquisicaoDeProducaoRuralCriar();
		s1250AquisicaoDeProducaoRuralCriar.beforeClass();
		s1250AquisicaoDeProducaoRuralCriar.login();
		s1250AquisicaoDeProducaoRuralCriar.acessarMDR();
		s1250AquisicaoDeProducaoRuralCriar.criar();
		s1250AquisicaoDeProducaoRuralCriar.afterClass();

	}

	@Test(priority = 104)
	public void s1250AquisicaoDeProducaoRuralEditar() {

		s1250AquisicaoDeProducaoRuralEditar = new S1250AquisicaoDeProducaoRuralEditar();
		s1250AquisicaoDeProducaoRuralEditar.beforeClass();
		s1250AquisicaoDeProducaoRuralEditar.login();
		s1250AquisicaoDeProducaoRuralEditar.acessarMDR();
		s1250AquisicaoDeProducaoRuralEditar.editar();
		s1250AquisicaoDeProducaoRuralEditar.afterClass();

	}

	@Test(priority = 105)
	public void s1250AquisicaoDeProducaoRuralExcluir() {

		s1250AquisicaoDeProducaoRuralExcluir = new S1250AquisicaoDeProducaoRuralExcluir();
		s1250AquisicaoDeProducaoRuralExcluir.beforeClass();
		s1250AquisicaoDeProducaoRuralExcluir.login();
		s1250AquisicaoDeProducaoRuralExcluir.acessarMDR();
		s1250AquisicaoDeProducaoRuralExcluir.excluir();
		s1250AquisicaoDeProducaoRuralExcluir.afterClass();
		System.out.println(
				"-------------------Eventos e-social >  S1250 Aquisicao De Producao Rural Fim-------------------------");
	}

	// 109
	// Preço de Transferencia > Modelo De Apuraçao TP
	@Test(priority = 109)
	public void modeloDeApuracaoTPCriar() {
		System.out
		.println("-------------------Preço de Transferencia > Modelo De Apuraçao TP-------------------------");
		modeloDeApuracaoTPCriar = new ModeloDeApuracaoTPCriar();
		modeloDeApuracaoTPCriar.beforeClass();
		modeloDeApuracaoTPCriar.login();
		modeloDeApuracaoTPCriar.acessarMDR();
		modeloDeApuracaoTPCriar.criar();
		modeloDeApuracaoTPCriar.afterClass();

	}

	@Test(priority = 110)
	public void modeloDeApuracaoTPDetalhes() {

		modeloDeApuracaoTPDetalhes = new ModeloDeApuracaoTPDetalhes();
		modeloDeApuracaoTPDetalhes.beforeClass();
		modeloDeApuracaoTPDetalhes.login();
		modeloDeApuracaoTPDetalhes.acessarMDR();
		modeloDeApuracaoTPDetalhes.Detalhes();
		modeloDeApuracaoTPDetalhes.afterClass();

	}

	@Test(priority = 111)
	public void modeloDeApuracaoTPEditar() {

		modeloDeApuracaoTPEditar = new ModeloDeApuracaoTPEditar();
		modeloDeApuracaoTPEditar.beforeClass();
		modeloDeApuracaoTPEditar.login();
		modeloDeApuracaoTPEditar.acessarMDR();
		modeloDeApuracaoTPEditar.editar();
		modeloDeApuracaoTPEditar.afterClass();

	}

	@Test(priority = 112)
	public void modeloDeApuracaoFiltroId() {

		modeloDeApuracaoTPFiltroId = new ModeloDeApuracaoTPFiltroId();
		modeloDeApuracaoTPFiltroId.beforeClass();
		modeloDeApuracaoTPFiltroId.login();
		modeloDeApuracaoTPFiltroId.acessarMDR();
		modeloDeApuracaoTPFiltroId.filtroId();
		modeloDeApuracaoTPFiltroId.afterClass();

	}

	@Test(priority = 113)
	public void modeloDeApuracaoTPExcluirEnMasa() {

		modeloDeApuracaoTPExcluirEnMasa = new ModeloDeApuracaoTPExcluirEnMasa();
		modeloDeApuracaoTPExcluirEnMasa.beforeClass();
		modeloDeApuracaoTPExcluirEnMasa.ingresar();
		modeloDeApuracaoTPExcluirEnMasa.mdrEntrar();
		modeloDeApuracaoTPExcluirEnMasa.excluirEnMasaModeloApuracaoTP();
		modeloDeApuracaoTPExcluirEnMasa.afterClass();

	}

	@Test(priority = 114)
	public void modeloDeApuracaoTPExcluir() {

		modeloDeApuracaoTPExcluir = new ModeloDeApuracaoTPExcluir();
		modeloDeApuracaoTPExcluir.beforeClass();
		modeloDeApuracaoTPExcluir.login();
		modeloDeApuracaoTPExcluir.acessarMDR();
		modeloDeApuracaoTPExcluir.excluir();
		modeloDeApuracaoTPExcluir.afterClass();
		System.out.println(
				"-------------------Preço de Transferencia > Modelo De Apuraçao TP Fim-------------------------");
	}

	// 116
	// Preço de Transferencia > Parametros Modelo De Apuracao TP

	@Test(priority = 116)
	public void parametrosModeloDeApuracaoTPCriar() {
		System.out.println(
				"-------------------Preço de Transferencia >  Parametros Modelo De Apuracao TP-------------------------");
		parametrosModeloDeApuracaoTPCriar = new ParametrosModeloDeApuracaoTPCriar();
		parametrosModeloDeApuracaoTPCriar.beforeClass();
		parametrosModeloDeApuracaoTPCriar.login();
		parametrosModeloDeApuracaoTPCriar.acessarMDR();
		parametrosModeloDeApuracaoTPCriar.criar();
		parametrosModeloDeApuracaoTPCriar.afterClass();

	}

	@Test(priority = 117)
	public void parametrosModeloDeApuracaoTPDetalhes() {

		parametrosModeloDeApuracaoTPDetalhes = new ParametrosModeloDeApuracaoTPDetalhes();
		parametrosModeloDeApuracaoTPDetalhes.beforeClass();
		parametrosModeloDeApuracaoTPDetalhes.login();
		parametrosModeloDeApuracaoTPDetalhes.acessarMDR();
		parametrosModeloDeApuracaoTPDetalhes.Detalhes();
		parametrosModeloDeApuracaoTPDetalhes.afterClass();

	}

	@Test(priority = 118)
	public void parametrosModeloDeApuracaoTPEditar() {

		parametrosModeloDeApuracaoTPEditar = new ParametrosModeloDeApuracaoTPEditar();
		parametrosModeloDeApuracaoTPEditar.beforeClass();
		parametrosModeloDeApuracaoTPEditar.login();
		parametrosModeloDeApuracaoTPEditar.acessarMDR();
		parametrosModeloDeApuracaoTPEditar.editar();
		parametrosModeloDeApuracaoTPEditar.afterClass();

	}

	@Test(priority = 119)
	public void parametroModeloApuracaoTPFiltroID() {

		parametroModeloApuracaoTPFiltroID = new ParametroModeloApuracaoTPFiltroID();
		parametroModeloApuracaoTPFiltroID.beforeClass();
		parametroModeloApuracaoTPFiltroID.login();
		parametroModeloApuracaoTPFiltroID.acessarMDR();
		parametroModeloApuracaoTPFiltroID.filtro();
		parametroModeloApuracaoTPFiltroID.afterClass();

	}


	@Test(priority = 120)
	public void parametrosModeloDeApuracaoTPExcluir() {

		parametrosModeloDeApuracaoTPExcluir = new ParametrosModeloDeApuracaoTPExcluir();
		parametrosModeloDeApuracaoTPExcluir.beforeClass();
		parametrosModeloDeApuracaoTPExcluir.login();
		parametrosModeloDeApuracaoTPExcluir.acessarMDR();
		parametrosModeloDeApuracaoTPExcluir.excluir();
		parametrosModeloDeApuracaoTPExcluir.afterClass();
	}

	@Test(priority = 121)
	public void parametrosModeloDeApuracaoTPExcluirEmMasa() {

		parametrosModeloDeApuracaoTPExcluirEmMasa = new ParametrosModeloDeApuracaoTPExcluirEmMasa();
		parametrosModeloDeApuracaoTPExcluirEmMasa.beforeClass();
		parametrosModeloDeApuracaoTPExcluirEmMasa.ingresar();
		parametrosModeloDeApuracaoTPExcluirEmMasa.mdrEntrar();
		parametrosModeloDeApuracaoTPExcluirEmMasa.excluirEmMasaParametrosModeloApuracaoTP();
		parametrosModeloDeApuracaoTPExcluirEmMasa.afterClass();

		System.out.println(
				"-------------------Preço de Transferencia >  Parametros Modelo De Apuracao TP Fim-------------------------");

	}
	
	//258
	//Eventos e-Social	S1060 > Ambientes de Trabalho



	@Test(priority = 262)
	public void S1060AmbientesDeTrablhoExcluirMassa() {

		s1060AmbientesDeTrablhoExcluirMassa = new S1060AmbientesDeTrablhoExcluirMassa();
		s1060AmbientesDeTrablhoExcluirMassa.beforeClass();
		/*s1060AmbientesDeTrablhoExcluirMassa.login();
		s1060AmbientesDeTrablhoExcluirMassa.acessarMDR();*/
		s1060AmbientesDeTrablhoExcluirMassa.criar();
		s1060AmbientesDeTrablhoExcluirMassa.afterClass();

		System.out.println("-------------------Eventos e-Social	S1060 > Ambientes de Trabalho Fim-------------------------");


	}
}
