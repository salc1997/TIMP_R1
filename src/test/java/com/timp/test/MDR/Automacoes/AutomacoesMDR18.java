package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoCriar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoEditar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoExcluir;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoVisualizar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroId;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar;
import com.timp.test.MDR.RegistroDeExportaçao.RegistroDeExportaçaoCriar;
import com.timp.test.MDR.RegistroDeExportaçao.RegistroDeExportaçaoEditar;
import com.timp.test.MDR.RegistroDeExportaçao.RegistroDeExportaçaoExcluir;
import com.timp.test.MDR.RegistroDeExportaçao.RegistroDeExportaçaoExcluirMassa;
import com.timp.test.MDR.RegistroDeExportaçao.RegistroDeExportaçaoFiltrosAvançados;
import com.timp.test.MDR.RegistroDeExportaçao.RegistroDeExportaçaoVisualizar;
import com.timp.test.MDR.RepresentanteLegais.RepresentanteLegaisCriar;
import com.timp.test.MDR.RepresentanteLegais.RepresentanteLegaisEditar;
import com.timp.test.MDR.RepresentanteLegais.RepresentanteLegaisVisualizar;
import com.timp.test.MDR.RepresentanteLegais.RepresentantesLegaisDetalhes;
import com.timp.test.MDR.RepresentanteLegais.RepresentantesLegaisExcluir;
import com.timp.test.MDR.SCANC.AjustesDosAnexos.AjustesDosAnexosCriar;
import com.timp.test.MDR.SCANC.AjustesDosAnexos.AjustesDosAnexosExcluir;
import com.timp.test.MDR.SCANC.AjustesDosAnexos.AjustesDosAnexosExcluirEmMasa;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCAtualizar;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCCriar;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCEditar;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCExcluir;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCExcluirMasas;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCFiltroID;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCVisualizar;
import com.timp.test.MDR.SCANC.OPPropiasRessarcimentos.OPPropriosRessarcimentosCriar;
import com.timp.test.MDR.SCANC.ProdutosSCANC.ProductosSCANCCriar;
import com.timp.test.MDR.SCANC.ProdutosSCANC.ProductosSCANCEditar;
import com.timp.test.MDR.SCANC.ProdutosSCANC.ProductosSCANCExcluir;
import com.timp.test.MDR.SCANC.ProdutosSCANC.ProductosSCANCVisualizar;
import com.timp.test.MDR.SCANC.ProdutosSCANC.ProdutosSCANCDetalhes;
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasCriar;
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasDetalhes;
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasEditar;
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasExcluir;
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasExcluirEmMasa;
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasVisualizar;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoCriar;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoEditar;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoExcluir;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoExcluirMassa;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoFiltroID;
import com.timp.test.MDR.SequenciaAcesso.SequenciaCriar;
import com.timp.test.MDR.SequenciaAcesso.SequenciaEditar;
import com.timp.test.MDR.SequenciaAcesso.SequenciaExcluir;
import com.timp.test.MDR.SequenciaAcesso.SequenciaFiltros;
import com.timp.test.MDR.SequenciaAcesso.SequenciaVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosVisualizar;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformacoesDeValoresExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresCriar;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresDetalhes;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresEditar;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresExcluir;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresVisualizar;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AutomacoesMDR18 extends TestBaseSteven{
	// Parâmetros de Contabilização > Mapemaneto Contábil Por Correção

		MapeamentoContabilCorrecaoCriar mapeamentoContabilCorrecaoCriar;
		MapeamentoContabilCorrecaoEditar mapeamentoContabilCorrecaoEditar;
		MapeamentoContabilCorrecaoVisualizar mapeamentoContabilCorrecaoVisualizar;
		MapeamentoContabilCorrecaoExcluir mapeamentoContabilCorrecaoExcluir;

		// ParametrosContabilizacao > Mapeamento Substituicao Conta Estoque Cenarios
		// Correcoes

		MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar;
		MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes;
		MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar;
		MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir;
		MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar;
		MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroId mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId;
		
		
		// Registro de Exportação

		RegistroDeExportaçaoCriar registroDeExportaçaoCriar;
		RegistroDeExportaçaoEditar registroDeExportaçaoEditar;
		RegistroDeExportaçaoExcluir registroDeExportaçaoExcluir;
		RegistroDeExportaçaoFiltrosAvançados registroDeExportaçaoFiltrosAvançados;
		RegistroDeExportaçaoVisualizar registroDeExportaçaoVisualizar;
		RegistroDeExportaçaoExcluirMassa registroDeExportaçaoExcluirMassa;

		// Representantes Legais

		RepresentanteLegaisCriar representanteLegaisCriar;
		RepresentanteLegaisEditar representanteLegaisEditar;
		RepresentanteLegaisVisualizar representanteLegaisVisualizar;
		RepresentantesLegaisDetalhes representantesLegaisDetalhes;
		RepresentantesLegaisExcluir representantesLegaisExcluir;

		// Saldo Inicial Diferido

		SaldoInicialDiferidoCriar saldoInicialDiferidoCriar;
		SaldoInicialDiferidoEditar saldoInicialDiferidoEditar;
		SaldoInicialDiferidoExcluir saldoInicialDiferidoExcluir;
		SaldoInicialDiferidoFiltroID saldoInicialDiferidoFiltroID;
		SaldoInicialDiferidoExcluirMassa saldoInicialDiferidoExcluirMassa;
		
		// SCANC > Ajustes Dos Anexos

		AjustesDosAnexosCriar ajustesDosAnexosCriar;
		AjustesDosAnexosExcluir ajustesDosAnexosExcluir;
		AjustesDosAnexosExcluirEmMasa ajustesDosAnexosExcluirEmMasa;
		
		// SCANC > Movimento SCANC
		MovimentoSCANCCriar movimentoSCANCCriar;
		MovimentoSCANCEditar movimentoSCANCEditar;
		MovimentoSCANCExcluir movimentoSCANCExcluir;
		MovimentoSCANCVisualizar movimentoSCANCVisualizar;
		MovimentoSCANCFiltroID movimentoSCANCFiltroID;
		MovimentoSCANCAtualizar movimentoSCANCAtualizar;
		MovimentoSCANCExcluirMasas movimentoSCANCExcluirMasas;
		// SCANC > OP Proprios Ressarcimentos

		OPPropriosRessarcimentosCriar oPPropriosRessarcimentosCriar;

		// SCANC > Productos SCANC

		ProductosSCANCCriar productosSCANCCriar;
		ProductosSCANCEditar productosSCANCEditar;
		ProductosSCANCExcluir productosSCANCExcluir;
		ProductosSCANCVisualizar productosSCANCVisualizar;
		ProdutosSCANCDetalhes productosSCANCDetalhes;

		// SCANC > SCANC Distribuidoras

		SCANCDistribuidorasCriar sCANCDistribuidorasCriar;
		SCANCDistribuidorasDetalhes sCANCDistribuidorasDetalhes;
		SCANCDistribuidorasEditar scancDistribuidorasEditar;
		SCANCDistribuidorasExcluir sCANCDistribuidorasExcluir;
		SCANCDistribuidorasVisualizar sCANCDistribuidorasVisualizar;
		SCANCDistribuidorasExcluirEmMasa scancDistribuidorasExcluirEmMasa;

		// Sequência de Acesso

		SequenciaCriar sequenciaCriar;
		SequenciaEditar sequenciaEditar;
		SequenciaExcluir sequenciaExcluir;
		SequenciaFiltros sequenciaFiltros;
		SequenciaVisualizar sequenciaVisualizar;

		// Tabelas de Apoio E-Social > Motivos Ces Beneficios

		MotivosCesBeneficiosCriar motivosCesBeneficiosCriar;
		MotivosCesBeneficiosExcluir motivosCesBeneficiosExcluir;
		MotivosCesBeneficiosVisualizar motivosCesBeneficiosVisualizar;

		// TabelasApoioSped > Ajustes e Informação de Valores Provenientes de Documento Fiscal

		AjusteEInformaçoesDeValoresCriar ajusteEInformaçoesDeValoresCriar;
		AjusteEInformaçoesDeValoresDetalhes ajusteEInformaçoesDeValoresDetalhes;
		AjusteEInformaçoesDeValoresEditar ajusteEInformaçoesDeValoresEditar;
		AjusteEInformaçoesDeValoresExcluir ajusteEInformaçoesDeValoresExcluir;
		AjusteEInformaçoesDeValoresVisualizar ajusteEInformaçoesDeValoresVisualizar;
		AjusteEInformacoesDeValoresExcluirEmMassa ajusteEInformacoesDeValoresExcluirEmMassa;
		// 101

		// -----------------------------------------------------------------------------------------------
  
	// 78

	// Parâmetros de Contabilização > Mapemaneto Contábil por Correção

	@Test(priority = 78)
	public void mapeamentoContabilCorrecaoCriar() {

		System.out.println(
				"-------------------Parâmetros de Contabilização > Mapemaneto Contábil por Correção-------------------------");

		mapeamentoContabilCorrecaoCriar = new MapeamentoContabilCorrecaoCriar();
		mapeamentoContabilCorrecaoCriar.beforeClass();
		mapeamentoContabilCorrecaoCriar.login();
		mapeamentoContabilCorrecaoCriar.acessarMDR();
		mapeamentoContabilCorrecaoCriar.criar();
		mapeamentoContabilCorrecaoCriar.afterClass();

	}

	@Test(priority = 79, dependsOnMethods = "mapeamentoContabilCorrecaoCriar")
	public void mapeamentoContabilCorrecaoEditar() {

		mapeamentoContabilCorrecaoEditar = new MapeamentoContabilCorrecaoEditar();
		mapeamentoContabilCorrecaoEditar.beforeClass();
		mapeamentoContabilCorrecaoEditar.login();
		mapeamentoContabilCorrecaoEditar.acessarMDR();
		mapeamentoContabilCorrecaoEditar.editar();
		mapeamentoContabilCorrecaoEditar.afterClass();

	}

	@Test(priority = 80, dependsOnMethods = "mapeamentoContabilCorrecaoCriar")
	public void mapeamentoContabilCorrecaoVisualizar() {

		mapeamentoContabilCorrecaoVisualizar = new MapeamentoContabilCorrecaoVisualizar();
		mapeamentoContabilCorrecaoVisualizar.beforeClass();
		mapeamentoContabilCorrecaoVisualizar.login();
		mapeamentoContabilCorrecaoVisualizar.acessarMDR();
		mapeamentoContabilCorrecaoVisualizar.visualizar();
		mapeamentoContabilCorrecaoVisualizar.afterClass();

		System.out.println(
				"-------------------Parâmetros de Contabilização > Mapemaneto Contábil Por Correção Fin-------------------------");
	}
	
	@Test(priority = 81, dependsOnMethods = "mapeamentoContabilCorrecaoCriar")
	public void mapeamentoContabilCorrecaoExcluir() {

		mapeamentoContabilCorrecaoExcluir = new MapeamentoContabilCorrecaoExcluir();
		mapeamentoContabilCorrecaoExcluir.beforeClass();
		mapeamentoContabilCorrecaoExcluir.login();
		mapeamentoContabilCorrecaoExcluir.acessarMDR();
		mapeamentoContabilCorrecaoExcluir.excluir();
		mapeamentoContabilCorrecaoExcluir.afterClass();

	}


	// 84

	// ParametrosContabilizacao > Mapeamento Substituicao Conta Estoque Cenarios
	// Correcoes

	@Test(priority = 84)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar() {

		System.out.println(
				"-------------------ParametrosContabilizacao > Mapeamento Substituicao Conta Estoque Cenarios Correcoes-------------------------");

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar.criar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar.afterClass();

	}

	@Test(priority = 85, dependsOnMethods = "mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar")
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.editar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.afterClass();

	}

	@Test(priority = 86, dependsOnMethods = "mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar")
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.visualizar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.afterClass();

	}

	@Test(priority = 87, dependsOnMethods = "mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar")
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.detalhes();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.afterClass();

	}

	@Test(priority = 88, dependsOnMethods = "mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar")
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.excluir();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.afterClass();
	
	}
	
	@Test(priority = 89)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroId();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.filtroId();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.afterClass();
		
		System.out.println(
				"-------------------ParametrosContabilizacao > Mapeamento Substituicao Conta Estoque Cenarios Correcoes Fin-------------------------");

	}


	
	// 90

	// Registro de Exportação

	@Test(priority = 90)
	public void registroDeExportaçaoCriar() {

		System.out.println("-------------------Registro de Exportação-------------------------");

		registroDeExportaçaoCriar = new RegistroDeExportaçaoCriar();
		registroDeExportaçaoCriar.beforeClass();
		registroDeExportaçaoCriar.login();
		registroDeExportaçaoCriar.acessarMDR();
		registroDeExportaçaoCriar.criar();
		registroDeExportaçaoCriar.afterClass();

	}

	@Test(priority = 91, dependsOnMethods = "registroDeExportaçaoCriar")
	public void registroDeExportaçaoEditar() {

		registroDeExportaçaoEditar = new RegistroDeExportaçaoEditar();
		registroDeExportaçaoEditar.beforeClass();
		registroDeExportaçaoEditar.login();
		registroDeExportaçaoEditar.acessarMDR();
		registroDeExportaçaoEditar.editar();
		registroDeExportaçaoEditar.afterClass();

	}

	@Test(priority = 92, dependsOnMethods = "registroDeExportaçaoCriar")
	public void registroDeExportaçaoVisualizar() {

		registroDeExportaçaoVisualizar = new RegistroDeExportaçaoVisualizar();
		registroDeExportaçaoVisualizar.beforeClass();
		registroDeExportaçaoVisualizar.login();
		registroDeExportaçaoVisualizar.acessarMDR();
		registroDeExportaçaoVisualizar.Visualizar();
		registroDeExportaçaoVisualizar.afterClass();

	}

	@Test(priority = 93, dependsOnMethods = "registroDeExportaçaoCriar")
	public void registroDeExportaçaoDetalhes() {

		registroDeExportaçaoFiltrosAvançados = new RegistroDeExportaçaoFiltrosAvançados();
		registroDeExportaçaoFiltrosAvançados.beforeClass();
		registroDeExportaçaoFiltrosAvançados.login();
		registroDeExportaçaoFiltrosAvançados.acessarMDR();
		registroDeExportaçaoFiltrosAvançados.filtros();
		registroDeExportaçaoFiltrosAvançados.afterClass();

	}

	@Test(priority = 94, dependsOnMethods = "registroDeExportaçaoCriar")
	public void registroDeExportaçaoExcluir() {

		registroDeExportaçaoExcluir = new RegistroDeExportaçaoExcluir();
		registroDeExportaçaoExcluir.beforeClass();
		registroDeExportaçaoExcluir.login();
		registroDeExportaçaoExcluir.acessarMDR();
		registroDeExportaçaoExcluir.Excluir();
		registroDeExportaçaoExcluir.afterClass();
	}
	
	@Test(priority = 95)
	public void registroDeExportaçaoExcluirMassa() {

		registroDeExportaçaoExcluirMassa = new RegistroDeExportaçaoExcluirMassa();
		registroDeExportaçaoExcluirMassa.beforeClass();
		registroDeExportaçaoExcluirMassa.login();
		registroDeExportaçaoExcluirMassa.acessarMDR();
		registroDeExportaçaoExcluirMassa.criar();
		registroDeExportaçaoExcluirMassa.excluirMassa();
		registroDeExportaçaoExcluirMassa.afterClass();

		System.out.println("-------------------Registro de Exportação Fin-------------------------");
	}

	// 97
	// Representantes Legais

	@Test(priority = 98)
	public void representanteLegaisCriar() {

		System.out.println("-------------------Representantes Legais-------------------------");

		representanteLegaisCriar = new RepresentanteLegaisCriar();
		representanteLegaisCriar.beforeClass();
		representanteLegaisCriar.login();
		representanteLegaisCriar.acessarMDR();
		representanteLegaisCriar.criar();
		representanteLegaisCriar.afterClass();

	}

	@Test(priority = 99, dependsOnMethods = "representanteLegaisCriar")
	public void representanteLegaisEditar() {

		representanteLegaisEditar = new RepresentanteLegaisEditar();
		representanteLegaisEditar.beforeClass();
		representanteLegaisEditar.login();
		representanteLegaisEditar.acessarMDR();
		representanteLegaisEditar.editar();
		representanteLegaisEditar.afterClass();

	}

	@Test(priority = 100, dependsOnMethods = "representanteLegaisCriar")
	public void representanteLegaisVisualizar() {

		representanteLegaisVisualizar = new RepresentanteLegaisVisualizar();
		representanteLegaisVisualizar.beforeClass();
		representanteLegaisVisualizar.login();
		representanteLegaisVisualizar.acessarMDR();
		representanteLegaisVisualizar.Visualizar();
		representanteLegaisVisualizar.afterClass();

	}

	@Test(priority = 101, dependsOnMethods = "representanteLegaisCriar")
	public void representanteLegaisDetalhes() {

		representantesLegaisDetalhes = new RepresentantesLegaisDetalhes();
		representantesLegaisDetalhes.beforeClass();
		representantesLegaisDetalhes.login();
		representantesLegaisDetalhes.acessarMDR();
		representantesLegaisDetalhes.detalhes();
		representantesLegaisDetalhes.afterClass();

	}

	@Test(priority = 102, dependsOnMethods = "representanteLegaisCriar")
	public void representanteLegaisExcluir() {

		representantesLegaisExcluir = new RepresentantesLegaisExcluir();
		representantesLegaisExcluir.beforeClass();
		representantesLegaisExcluir.login();
		representantesLegaisExcluir.acessarMDR();
		representantesLegaisExcluir.excluir();
		representantesLegaisExcluir.afterClass();

		System.out.println("-------------------Representantes Legais Fin-------------------------");
	}

	// 104

	// Saldo Inicial Diferido

	@Test(priority = 104)
	public void saldoInicialDiferidoCriar() {

		System.out.println("-------------------Saldo Inicial Diferido-------------------------");

		saldoInicialDiferidoCriar = new SaldoInicialDiferidoCriar();
		saldoInicialDiferidoCriar.beforeClass();
		saldoInicialDiferidoCriar.login();
		saldoInicialDiferidoCriar.acessarMDR();
		saldoInicialDiferidoCriar.criar();
		saldoInicialDiferidoCriar.afterClass();

	}

	@Test(priority = 105, dependsOnMethods = "saldoInicialDiferidoCriar")
	public void saldoInicialDiferidoEditar() {

		saldoInicialDiferidoEditar = new SaldoInicialDiferidoEditar();
		saldoInicialDiferidoEditar.beforeClass();
		saldoInicialDiferidoEditar.login();
		saldoInicialDiferidoEditar.acessarMDR();
		saldoInicialDiferidoEditar.editar();
		saldoInicialDiferidoEditar.afterClass();

	}

	@Test(priority = 105)
	public void saldoInicialDiferidoFiltroID() {

		saldoInicialDiferidoFiltroID = new SaldoInicialDiferidoFiltroID();
		saldoInicialDiferidoFiltroID.beforeClass();
		saldoInicialDiferidoFiltroID.login();
		saldoInicialDiferidoFiltroID.acessarMDR();
		saldoInicialDiferidoFiltroID.filtro();
		saldoInicialDiferidoFiltroID.afterClass();

	}
	@Test(priority = 107)
	public void saldoInicialDiferidoExcluirMassa() {

		saldoInicialDiferidoExcluirMassa = new SaldoInicialDiferidoExcluirMassa();
		saldoInicialDiferidoExcluirMassa.beforeClass();
		saldoInicialDiferidoExcluirMassa.login();
		saldoInicialDiferidoExcluirMassa.acessarMDR();
		saldoInicialDiferidoExcluirMassa.criar();
		saldoInicialDiferidoExcluirMassa.afterClass();

	}
	@Test(priority = 106, dependsOnMethods = "saldoInicialDiferidoCriar")
	public void saldoInicialDiferidoExcluir() {

		saldoInicialDiferidoExcluir = new SaldoInicialDiferidoExcluir();
		saldoInicialDiferidoExcluir.beforeClass();
		saldoInicialDiferidoExcluir.login();
		saldoInicialDiferidoExcluir.acessarMDR();
		saldoInicialDiferidoExcluir.excluir();
		saldoInicialDiferidoExcluir.afterClass();

		System.out.println("-------------------Saldo Inicial Diferido Fin-------------------------");

	}

	// 110

	// SCANC > Ajustes Dos Anexos Fiscal

	@Test(priority = 110)
	public void ajustesDosAnexosCriar() {

		System.out.println("-------------------SCANC > Ajustes Dos Anexos Fiscal-------------------------");

		ajustesDosAnexosCriar = new AjustesDosAnexosCriar();
		ajustesDosAnexosCriar.beforeClass();
		ajustesDosAnexosCriar.login();
		ajustesDosAnexosCriar.acessarMDR();
		ajustesDosAnexosCriar.criar();
		ajustesDosAnexosCriar.afterClass();

	}
	
	@Test(priority = 112)
	public void ajustesDosAnexosExcluirEmMasa() {

		ajustesDosAnexosExcluirEmMasa = new AjustesDosAnexosExcluirEmMasa();
		ajustesDosAnexosExcluirEmMasa.beforeClass();
		ajustesDosAnexosExcluirEmMasa.login();
		ajustesDosAnexosExcluirEmMasa.acessarMDR();
		ajustesDosAnexosExcluirEmMasa.excluir();
		ajustesDosAnexosExcluirEmMasa.afterClass();

	}
	

	@Test(priority = 111, dependsOnMethods = "ajustesDosAnexosCriar")
	public void ajustesDosAnexosExcluir() {

		ajustesDosAnexosExcluir = new AjustesDosAnexosExcluir();
		ajustesDosAnexosExcluir.beforeClass();
		ajustesDosAnexosExcluir.login();
		ajustesDosAnexosExcluir.acessarMDR();
		ajustesDosAnexosExcluir.excluir();
		ajustesDosAnexosExcluir.afterClass();

		System.out.println("-------------------SCANC > Ajustes Dos Anexos Fiscal Fin-------------------------");
	}

	// 116

	// SCANC > Movimento SCANC

	@Test(priority = 116)
	public void movimentoSCANCCriar() {

		System.out.println("-------------------SCANC > Movimento SCANC-------------------------");

		movimentoSCANCCriar = new MovimentoSCANCCriar();
		movimentoSCANCCriar.beforeClass();
		movimentoSCANCCriar.login();
		movimentoSCANCCriar.acessarMDR();
		movimentoSCANCCriar.criar();
		movimentoSCANCCriar.afterClass();

	}

	@Test(priority = 117, dependsOnMethods = "movimentoSCANCCriar")
	public void movimentoSCANCEditar() {

		movimentoSCANCEditar = new MovimentoSCANCEditar();
		movimentoSCANCEditar.beforeClass();
		movimentoSCANCEditar.login();
		movimentoSCANCEditar.acessarMDR();
		movimentoSCANCEditar.editar();
		movimentoSCANCEditar.afterClass();

	}

	@Test(priority = 118, dependsOnMethods = "movimentoSCANCCriar")
	public void movimentoSCANCVisualizar() {

		movimentoSCANCVisualizar = new MovimentoSCANCVisualizar();
		movimentoSCANCVisualizar.beforeClass();
		movimentoSCANCVisualizar.login();
		movimentoSCANCVisualizar.acessarMDR();
		movimentoSCANCVisualizar.visualizar();
		movimentoSCANCVisualizar.afterClass();

	}
	
	@Test(priority = 119)
	public void movimentoSCANCFiltroID() {

		movimentoSCANCFiltroID = new MovimentoSCANCFiltroID();
		movimentoSCANCFiltroID.beforeClass();
		movimentoSCANCFiltroID.login();
		movimentoSCANCFiltroID.acessarMDR();
		movimentoSCANCFiltroID.filtro();
		movimentoSCANCFiltroID.afterClass();

	}
	
	@Test(priority = 120)
	public void movimentoSCANCAtualizar() {

		movimentoSCANCAtualizar = new MovimentoSCANCAtualizar();
		movimentoSCANCAtualizar.beforeClass();
		movimentoSCANCAtualizar.login();
		movimentoSCANCAtualizar.acessarMDR();
		movimentoSCANCAtualizar.atualizar();
		movimentoSCANCAtualizar.afterClass();

	}
	
	
	@Test(priority = 121)
	public void movimentoSCANCExcluirMasas() {

		movimentoSCANCExcluirMasas = new MovimentoSCANCExcluirMasas();
		movimentoSCANCExcluirMasas.beforeClass();
		movimentoSCANCExcluirMasas.login();
		movimentoSCANCExcluirMasas.acessarMDR();
		movimentoSCANCExcluirMasas.criar();
		movimentoSCANCExcluirMasas.afterClass();

	}


	

	@Test(priority = 122, dependsOnMethods = "movimentoSCANCCriar")
	public void movimentoSCANCExcluir() {

		movimentoSCANCExcluir = new MovimentoSCANCExcluir();
		movimentoSCANCExcluir.beforeClass();
		movimentoSCANCExcluir.login();
		movimentoSCANCExcluir.acessarMDR();
		movimentoSCANCExcluir.excluir();
		movimentoSCANCExcluir.afterClass();

		System.out.println("-------------------SCANC > Movimento SCANC Fin-------------------------");
	}

	// 122

	// oPPropriosRessarcimentoss Fiscais > oPPropriosRessarcimentoss Fiscais

	@Test(priority = 122)
	public void oPPropriosRessarcimentosCriar() {

		System.out.println("------------------- SCANC > OP PropriosRessarcimentos -------------------------");

		oPPropriosRessarcimentosCriar = new OPPropriosRessarcimentosCriar();
		oPPropriosRessarcimentosCriar.beforeClass();
		oPPropriosRessarcimentosCriar.login();
		oPPropriosRessarcimentosCriar.acessarMDR();
		oPPropriosRessarcimentosCriar.criar();
		oPPropriosRessarcimentosCriar.afterClass();

		System.out.println("-------------------SCANC > OP Proprios Ressarcimentos Fin-------------------------");
	}

	// 128

	// SCANC > Productos SCANC

	@Test(priority = 128)
	public void productosSCANCCriar() {

		System.out.println("-------------------SCANC > Productos SCANC-------------------------");

		productosSCANCCriar = new ProductosSCANCCriar();
		productosSCANCCriar.beforeClass();
		productosSCANCCriar.login();
		productosSCANCCriar.acessarMDR();
		productosSCANCCriar.criar();
		productosSCANCCriar.afterClass();

	}

	@Test(priority = 129, dependsOnMethods = "productosSCANCCriar")
	public void productosSCANCEditar() {

		productosSCANCEditar = new ProductosSCANCEditar();
		productosSCANCEditar.beforeClass();
		productosSCANCEditar.login();
		productosSCANCEditar.acessarMDR();
		productosSCANCEditar.editar();
		productosSCANCEditar.afterClass();

	}

	@Test(priority = 130, dependsOnMethods = "productosSCANCCriar")
	public void productosSCANCVisualizar() {

		productosSCANCVisualizar = new ProductosSCANCVisualizar();
		productosSCANCVisualizar.beforeClass();
		productosSCANCVisualizar.login();
		productosSCANCVisualizar.acessarMDR();
		productosSCANCVisualizar.visualizar();
		productosSCANCVisualizar.afterClass();

	}

	@Test(priority = 131, dependsOnMethods = "productosSCANCCriar")
	public void productosSCANCDetalhes() {

		productosSCANCDetalhes = new ProdutosSCANCDetalhes();
		productosSCANCDetalhes.beforeClass();
		productosSCANCDetalhes.login();
		productosSCANCDetalhes.acessarMDR();
		productosSCANCDetalhes.detalhes();
		productosSCANCDetalhes.afterClass();

	}

	@Test(priority = 132, dependsOnMethods = "productosSCANCCriar")
	public void productosSCANCExcluir() {

		productosSCANCExcluir = new ProductosSCANCExcluir();
		productosSCANCExcluir.beforeClass();
		productosSCANCExcluir.login();
		productosSCANCExcluir.acessarMDR();
		productosSCANCExcluir.excluir();
		productosSCANCExcluir.afterClass();

		System.out.println("-------------------SCANC > Productos SCANC Fin-------------------------");
	}

	// 134
	// SCANC > SCANC Distribuidoras

	@Test(priority = 134)
	public void sCANCDistribuidorasCriar() {

		System.out.println("-------------------SCANC > SCANC Distribuidoras-------------------------");

		sCANCDistribuidorasCriar = new SCANCDistribuidorasCriar();
		sCANCDistribuidorasCriar.beforeClass();
		sCANCDistribuidorasCriar.login();
		sCANCDistribuidorasCriar.acessarMDR();
		sCANCDistribuidorasCriar.criar();
		sCANCDistribuidorasCriar.afterClass();

	}

	@Test(priority = 135, dependsOnMethods = "sCANCDistribuidorasCriar")
	public void sCANCDistribuidorasVisualizar() {

		sCANCDistribuidorasVisualizar = new SCANCDistribuidorasVisualizar();
		sCANCDistribuidorasVisualizar.beforeClass();
		sCANCDistribuidorasVisualizar.login();
		sCANCDistribuidorasVisualizar.acessarMDR();
		sCANCDistribuidorasVisualizar.visualizar();
		sCANCDistribuidorasVisualizar.afterClass();

	}

	@Test(priority = 136, dependsOnMethods = "sCANCDistribuidorasCriar")
	public void sCANCDistribuidorasDetalhes() {

		sCANCDistribuidorasDetalhes = new SCANCDistribuidorasDetalhes();
		sCANCDistribuidorasDetalhes.beforeClass();
		sCANCDistribuidorasDetalhes.login();
		sCANCDistribuidorasDetalhes.acessarMDR();
		sCANCDistribuidorasDetalhes.detalhes();
		sCANCDistribuidorasDetalhes.afterClass();

	}
	

	@Test(priority = 137, dependsOnMethods = "sCANCDistribuidorasCriar")
	public void scancDistribuidorasEditar() {

		scancDistribuidorasEditar = new SCANCDistribuidorasEditar();
		scancDistribuidorasEditar.beforeClass();
		scancDistribuidorasEditar.ingresar();
		scancDistribuidorasEditar.ingresarMDR();
		scancDistribuidorasEditar.editar();
		scancDistribuidorasEditar.afterClass();

	}
	

	@Test(priority = 139)
	public void scancDistribuidorasExcluirEmMasa() {

		scancDistribuidorasExcluirEmMasa = new SCANCDistribuidorasExcluirEmMasa();
		scancDistribuidorasExcluirEmMasa.beforeClass();
		scancDistribuidorasExcluirEmMasa.login();
		scancDistribuidorasExcluirEmMasa.acessarMDR();
		scancDistribuidorasExcluirEmMasa.excluir();
		scancDistribuidorasExcluirEmMasa.afterClass();

	}

	@Test(priority = 138, dependsOnMethods = "sCANCDistribuidorasCriar")
	public void sCANCDistribuidorasExcluir() {

		sCANCDistribuidorasExcluir = new SCANCDistribuidorasExcluir();
		sCANCDistribuidorasExcluir.beforeClass();
		sCANCDistribuidorasExcluir.login();
		sCANCDistribuidorasExcluir.acessarMDR();
		sCANCDistribuidorasExcluir.excluir();
		sCANCDistribuidorasExcluir.afterClass();

		System.out.println("-------------------SCANC > SCANC Distribuidoras Fin-------------------------");
	}

	// 140
	// Sequencia de Acesso

	@Test(priority = 140)
	public void sequenciaCriar() {

		System.out.println("-------------------Sequencia de Acesso-------------------------");

		sequenciaCriar = new SequenciaCriar();
		sequenciaCriar.beforeClass();
		sequenciaCriar.login();
		sequenciaCriar.acessarMDR();
		sequenciaCriar.criar();
		sequenciaCriar.afterClass();

	}

	@Test(priority = 141, dependsOnMethods = "sequenciaCriar")
	public void sequenciaEditar() {

		sequenciaEditar = new SequenciaEditar();
		sequenciaEditar.beforeClass();
		sequenciaEditar.login();
		sequenciaEditar.acessarMDR();
		sequenciaEditar.Editar();
		sequenciaEditar.afterClass();

	}

	@Test(priority = 142, dependsOnMethods = "sequenciaCriar")
	public void sequenciaVisualizar() {

		sequenciaVisualizar = new SequenciaVisualizar();
		sequenciaVisualizar.beforeClass();
		sequenciaVisualizar.login();
		sequenciaVisualizar.acessarMDR();
		sequenciaVisualizar.Visualizar();
		sequenciaVisualizar.afterClass();

	}

	@Test(priority = 143)
	public void sequenciaFiltros() {

		sequenciaFiltros = new SequenciaFiltros();
		sequenciaFiltros.beforeClass();
		sequenciaFiltros.login();
		sequenciaFiltros.acessarMDR();
		sequenciaFiltros.filtro();
		sequenciaFiltros.afterClass();

	}

	@Test(priority = 144, dependsOnMethods = "sequenciaCriar")
	public void sequenciaExcluir() {

		sequenciaExcluir = new SequenciaExcluir();
		sequenciaExcluir.beforeClass();
		sequenciaExcluir.login();
		sequenciaExcluir.acessarMDR();
		sequenciaExcluir.Excluir();
		sequenciaExcluir.afterClass();

		System.out.println("-------------------Sequencia de Acesso Fin-------------------------");
	}

	// 145
	// Tabelas de Apoio E-Social > Motivos Ces Beneficios

	@Test(priority = 145)
	public void motivosCesBeneficiosCriar() {

		System.out.println(
				"------------------- Tabelas de Apoio E-Social > Motivos Ces Beneficios-------------------------");

		motivosCesBeneficiosCriar = new MotivosCesBeneficiosCriar();
		motivosCesBeneficiosCriar.beforeClass();
		motivosCesBeneficiosCriar.login();
		motivosCesBeneficiosCriar.acessarMDR();
		motivosCesBeneficiosCriar.criar();
		motivosCesBeneficiosCriar.afterClass();

	}

	@Test(priority = 146, dependsOnMethods = "motivosCesBeneficiosCriar")
	public void motivosCesBeneficiosVisualizar() {

		motivosCesBeneficiosVisualizar = new MotivosCesBeneficiosVisualizar();
		motivosCesBeneficiosVisualizar.beforeClass();
		motivosCesBeneficiosVisualizar.login();
		motivosCesBeneficiosVisualizar.acessarMDR();
		motivosCesBeneficiosVisualizar.visualizar();
		motivosCesBeneficiosVisualizar.afterClass();

	}

	@Test(priority = 147, dependsOnMethods = "motivosCesBeneficiosCriar")
	public void motivosCesBeneficiosExcluir() {

		motivosCesBeneficiosExcluir = new MotivosCesBeneficiosExcluir();
		motivosCesBeneficiosExcluir.beforeClass();
		motivosCesBeneficiosExcluir.login();
		motivosCesBeneficiosExcluir.acessarMDR();
		motivosCesBeneficiosExcluir.excluir();
		motivosCesBeneficiosExcluir.afterClass();

		System.out.println(
				"------------------- Tabelas de Apoio E-Social > Motivos Ces Beneficios Fin-------------------------");
	}

	// 151

	// TabelasApoioSped > Ajustes e Informação de Valores Provenientes de Documento
	// Fiscal

	@Test(priority = 151)
	public void ajusteEInformaçoesDeValoresCriar() {

		System.out.println(
				"-------------------TabelasApoioSped > Ajustes e Informação de Valores Provenientes de Documento Fiscal-------------------------");

		ajusteEInformaçoesDeValoresCriar = new AjusteEInformaçoesDeValoresCriar();
		ajusteEInformaçoesDeValoresCriar.beforeClass();
		ajusteEInformaçoesDeValoresCriar.login();
		ajusteEInformaçoesDeValoresCriar.acessarMDR();
		ajusteEInformaçoesDeValoresCriar.criar();
		ajusteEInformaçoesDeValoresCriar.afterClass();

	}

	@Test(priority = 152, dependsOnMethods = "ajusteEInformaçoesDeValoresCriar")
	public void ajusteEInformaçoesDeValoresEditar() {

		ajusteEInformaçoesDeValoresEditar = new AjusteEInformaçoesDeValoresEditar();
		ajusteEInformaçoesDeValoresEditar.beforeClass();
		ajusteEInformaçoesDeValoresEditar.login();
		ajusteEInformaçoesDeValoresEditar.acessarMDR();
		ajusteEInformaçoesDeValoresEditar.editar();
		ajusteEInformaçoesDeValoresEditar.afterClass();

	}

	@Test(priority = 153, dependsOnMethods = "ajusteEInformaçoesDeValoresCriar")
	public void ajusteEInformaçoesDeValoresVisualizar() {

		ajusteEInformaçoesDeValoresVisualizar = new AjusteEInformaçoesDeValoresVisualizar();
		ajusteEInformaçoesDeValoresVisualizar.beforeClass();
		ajusteEInformaçoesDeValoresVisualizar.login();
		ajusteEInformaçoesDeValoresVisualizar.acessarMDR();
		ajusteEInformaçoesDeValoresVisualizar.Visualizar();
		ajusteEInformaçoesDeValoresVisualizar.afterClass();

	}

	@Test(priority = 154, dependsOnMethods = "ajusteEInformaçoesDeValoresCriar")
	public void ajusteEInformaçoesDeValoresDetalhes() {

		ajusteEInformaçoesDeValoresDetalhes = new AjusteEInformaçoesDeValoresDetalhes();
		ajusteEInformaçoesDeValoresDetalhes.beforeClass();
		ajusteEInformaçoesDeValoresDetalhes.login();
		ajusteEInformaçoesDeValoresDetalhes.acessarMDR();
		ajusteEInformaçoesDeValoresDetalhes.detalhes();
		ajusteEInformaçoesDeValoresDetalhes.afterClass();

	}

	@Test(priority = 155, dependsOnMethods = "ajusteEInformaçoesDeValoresCriar")
	public void ajusteEInformaçoesDeValoresExcluir() {

		ajusteEInformaçoesDeValoresExcluir = new AjusteEInformaçoesDeValoresExcluir();
		ajusteEInformaçoesDeValoresExcluir.beforeClass();
		ajusteEInformaçoesDeValoresExcluir.login();
		ajusteEInformaçoesDeValoresExcluir.acessarMDR();
		ajusteEInformaçoesDeValoresExcluir.excluir();
		ajusteEInformaçoesDeValoresExcluir.afterClass();

		}
	
	@Test(priority = 156)
	public void ajusteEInformacoesDeValoresExcluirEmMassa() {

		ajusteEInformacoesDeValoresExcluirEmMassa = new AjusteEInformacoesDeValoresExcluirEmMassa();
		ajusteEInformacoesDeValoresExcluirEmMassa.beforeClass();
		ajusteEInformacoesDeValoresExcluirEmMassa.login();
		ajusteEInformacoesDeValoresExcluirEmMassa.acessarMDR();
		ajusteEInformacoesDeValoresExcluirEmMassa.criar();
		ajusteEInformacoesDeValoresExcluirEmMassa.afterClass();

		System.out.println(
				"------------------TabelasApoioSped > Ajustes e Informação de Valores Provenientes de Documento Fiscal Fin-------------------------");
	}


}
