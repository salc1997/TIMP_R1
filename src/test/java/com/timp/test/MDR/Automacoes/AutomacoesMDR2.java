package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasCriarPO;
import com.timp.test.MDR.DetalheTipoTributo.DetalheCriar;
import com.timp.test.MDR.DetalheTipoTributo.DetalheDetalhes;
import com.timp.test.MDR.DetalheTipoTributo.DetalheEditar;
import com.timp.test.MDR.DetalheTipoTributo.DetalheExcluir;
import com.timp.test.MDR.DetalheTipoTributo.DetalheFiltroId;
import com.timp.test.MDR.DetalheTipoTributo.DetalheVisualizar;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoCriar;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoDetalhes;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoEditar;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoExcluir;
import com.timp.test.MDR.Empresas.EmpresaEditar;
import com.timp.test.MDR.Empresas.EmpresasDetalhes;
import com.timp.test.MDR.Empresas.EmpresasFiltros;
import com.timp.test.MDR.Empresas.EmpresasVisualizar;
import com.timp.test.MDR.Filiais.FiliaisEditar;
import com.timp.test.MDR.Filiais.FiliaisVisualizar;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoCriar;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoDetalhes;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoEditar;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoVisualizar;
import com.timp.test.MDR.ICMSSTTransporte.ICMSSTTransporteCriar;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaCriar;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaDetalhes;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaEditar;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaExcluir;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaVisualizar;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriar;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisDetalhes;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluir;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisVisualizar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriar;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsCriar;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsEditar;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsExcluir;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsVisualizar;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisCriar;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisDetalhes;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisEditar;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoCriar;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoDetalhes;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoEditar;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoExcluir;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoFiltroID;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoVisualizar;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultPorTributo.ContasDefaultPorTributoCriar;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultPorTributo.ContasDefaultPorTributoDetalhes;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultPorTributo.ContasDefaultPorTributoEditar;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultPorTributo.ContasDefaultPorTributoExcluir;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultPorTributo.ContasDefaultPorTributoVisualizar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilCriar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilEditar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilExcluir;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoCriar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoEditar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoExcluir;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoVisualizar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroId;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar;
import com.timp.test.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoCriar;
import com.timp.test.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoEditar;
import com.timp.test.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoExcluir;
import com.timp.test.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoFiltrosAvan�ados;
import com.timp.test.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoVisualizar;
import com.timp.test.MDR.RepresentanteLegais.RepresentanteLegaisCriar;
import com.timp.test.MDR.RepresentanteLegais.RepresentanteLegaisEditar;
import com.timp.test.MDR.RepresentanteLegais.RepresentanteLegaisVisualizar;
import com.timp.test.MDR.RepresentanteLegais.RepresentantesLegaisDetalhes;
import com.timp.test.MDR.RepresentanteLegais.RepresentantesLegaisExcluir;
import com.timp.test.MDR.SCANC.AjustesDosAnexos.AjustesDosAnexosCriar;
import com.timp.test.MDR.SCANC.AjustesDosAnexos.AjustesDosAnexosExcluir;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCCriar;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCEditar;
import com.timp.test.MDR.SCANC.MovimentoSCANC.MovimentoSCANCExcluir;
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
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasExcluir;
import com.timp.test.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasVisualizar;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoCriar;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoEditar;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoExcluir;
import com.timp.test.MDR.SaldoInicialDiferido.SaldoInicialDiferidoFiltroID;
import com.timp.test.MDR.SequenciaAcesso.SequenciaCriar;
import com.timp.test.MDR.SequenciaAcesso.SequenciaEditar;
import com.timp.test.MDR.SequenciaAcesso.SequenciaExcluir;
import com.timp.test.MDR.SequenciaAcesso.SequenciaFiltros;
import com.timp.test.MDR.SequenciaAcesso.SequenciaVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosVisualizar;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresCriar;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresDetalhes;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresEditar;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresExcluir;
import com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresVisualizar;

public class AutomacoesMDR2 extends TestBaseSteven {

	// Detalhe Tipo Tributo

	DetalheCriar detalheTipoTributoCriar;
	DetalheEditar detalheTipoTributoEditar;
	DetalheExcluir detalheTipoTributoExcluir;
	DetalheVisualizar detalheTipoTributoVisualizar;
	DetalheFiltroId detalheTipoTributoFiltroId;
	DetalheDetalhes detalheTipoTributoDetalhes;

	// Determina��o de Tipo de Condi��o

	DeterminacaoDeTipoDeCondicaoCriar determinacaoDeTipoDeCondicaoCriar;
	DeterminacaoDeTipoDeCondicaoDetalhes determinacaoDeTipoDeCondicaoDetalhes;
	DeterminacaoDeTipoDeCondicaoEditar determinacaoDeTipoDeCondicaoEditar;
	DeterminacaoDeTipoDeCondicaoExcluir determinacaoDeTipoDeCondicaoExcluir;

	// Empresas

	EmpresaEditar empresaEditar;
	EmpresasFiltros empresasFiltros;
	EmpresasVisualizar empresasVisualizar;
	EmpresasDetalhes empresasDetalhes;

	// Filiais

	FiliaisEditar filiaisEditar;
	FiliaisVisualizar filiaisVisualizar;

	// Hierarquia De Cenarios De Corre�ao

	HierarquiaDeCenariosDeCorre�aoCriar hierarquiaDeCenariosDeCorre�aoCriar;
	HierarquiaDeCenariosDeCorre�aoDetalhes hierarquiaDeCenariosDeCorre�aoDetalhes;
	HierarquiaDeCenariosDeCorre�aoEditar hierarquiaDeCenariosDeCorre�aoEditar;
	HierarquiaDeCenariosDeCorre�aoVisualizar hierarquiaDeCenariosDeCorre�aoVisualizar;

	// ICMS ST Transporte

	ICMSSTTransporteCriar iCMSSTTransporteCriar;

	// L�mite de Compet�ncia

	LimiteCompetenciaCriar limiteCompetenciaCriar;
	LimiteCompetenciaDetalhes limiteCompetenciaDetalhes;
	LimiteCompetenciaEditar limiteCompetenciaEditar;
	LimiteCompetenciaExcluir limiteCompetenciaExcluir;
	LimiteCompetenciaVisualizar limiteCompetenciaVisualizar;

	// Livros Fiscais > Livros Fiscais

	LivrosFiscaisCriar livrosFiscaisCriar;
	LivrosFiscaisDetalhes livrosFiscaisDetalhes;
	LivrosFiscaisExcluir livrosFiscaisExcluir;
	LivrosFiscaisVisualizar livrosFiscaisVisualizar;

	// Livros Fiscais > Parametros Para Livro ICMS ST
	ParametrosParaLivroICMSSTCriar parametrosParaLivroICMSSTCriar;

	// Mapeamento De Relevancia Para Pis Cofins

	MapeamentoDeRelevanciaParaPisCofinsCriar mapeamentoDeRelevanciaParaPisCofinsCriar;
	MapeamentoDeRelevanciaParaPisCofinsEditar mapeamentoDeRelevanciaParaPisCofinsEditar;
	MapeamentoDeRelevanciaParaPisCofinsExcluir mapeamentoDeRelevanciaParaPisCofinsExcluir;
	MapeamentoDeRelevanciaParaPisCofinsVisualizar mapeamentoDeRelevanciaParaPisCofinsVisualizar;

	// Ocorrencia Fiscal.> Tipos De Objetos De Ocorrencias Fiscais

	TiposDeObjetosDeOcorrenciasFiscaisCriar tiposDeObjetosDeOcorrenciasFiscaisCriar;
	TiposDeObjetosDeOcorrenciasFiscaisDetalhes tiposDeObjetosDeOcorrenciasFiscaisDetalhes;
	TiposDeObjetosDeOcorrenciasFiscaisEditar tiposDeObjetosDeOcorrenciasFiscaisEditar;

	// Par�metros de Contabiliza��o > Contas Default Para Extemporaneo

	ContasDefaultParaExtemporaneoCriar contasDefaultParaExtemporaneoCriar;
	ContasDefaultParaExtemporaneoDetalhes contasDefaultParaExtemporaneoDetalhes;
	ContasDefaultParaExtemporaneoEditar contasDefaultParaExtemporaneoEditar;
	ContasDefaultParaExtemporaneoExcluir contasDefaultParaExtemporaneoExcluir;
	ContasDefaultParaExtemporaneoVisualizar contasDefaultParaExtemporaneoVisualizar;
	ContasDefaultParaExtemporaneoFiltroID contasDefaultParaExtemporaneoFiltroID;

	// Par�metros de Contabiliza��o > Contas Default Por Tributo

	ContasDefaultPorTributoCriar contasDefaultPorTributoCriar;
	ContasDefaultPorTributoDetalhes contasDefaultPorTributoDetalhes;
	ContasDefaultPorTributoEditar contasDefaultPorTributoEditar;
	ContasDefaultPorTributoExcluir contasDefaultPorTributoExcluir;
	ContasDefaultPorTributoVisualizar contasDefaultPorTributoVisualizar;

	// Par�metros de Contabiliza��o > Mapemaneto Cont�bil

	MapeamentoContabilCriar mapeamentoContabilCriar;
	MapeamentoContabilEditar mapeamentoContabilEditar;
	MapeamentoContabilExcluir mapeamentoContabilExcluir;

	// Par�metros de Contabiliza��o > Mapemaneto Cont�bil Por Corre��o

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
	
	
	// Registro de Exporta��o

	RegistroDeExporta�aoCriar registroDeExporta�aoCriar;
	RegistroDeExporta�aoEditar registroDeExporta�aoEditar;
	RegistroDeExporta�aoExcluir registroDeExporta�aoExcluir;
	RegistroDeExporta�aoFiltrosAvan�ados registroDeExporta�aoFiltrosAvan�ados;
	RegistroDeExporta�aoVisualizar registroDeExporta�aoVisualizar;

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

	// SCANC > Ajustes Dos Anexos

	AjustesDosAnexosCriar ajustesDosAnexosCriar;
	AjustesDosAnexosExcluir ajustesDosAnexosExcluir;

	// SCANC > Movimento SCANC
	MovimentoSCANCCriar movimentoSCANCCriar;
	MovimentoSCANCEditar movimentoSCANCEditar;
	MovimentoSCANCExcluir movimentoSCANCExcluir;
	MovimentoSCANCVisualizar movimentoSCANCVisualizar;
	MovimentoSCANCFiltroID movimentoSCANCFiltroID;

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
	SCANCDistribuidorasExcluir sCANCDistribuidorasExcluir;
	SCANCDistribuidorasVisualizar sCANCDistribuidorasVisualizar;

	// Sequ�ncia de Acesso

	SequenciaCriar sequenciaCriar;
	SequenciaEditar sequenciaEditar;
	SequenciaExcluir sequenciaExcluir;
	SequenciaFiltros sequenciaFiltros;
	SequenciaVisualizar sequenciaVisualizar;

	// Tabelas de Apoio E-Social > Motivos Ces Beneficios

	MotivosCesBeneficiosCriar motivosCesBeneficiosCriar;
	MotivosCesBeneficiosExcluir motivosCesBeneficiosExcluir;
	MotivosCesBeneficiosVisualizar motivosCesBeneficiosVisualizar;

	// TabelasApoioSped > Ajustes e Informa��o de Valores Provenientes de Documento
	// Fiscal

	AjusteEInforma�oesDeValoresCriar ajusteEInforma�oesDeValoresCriar;
	AjusteEInforma�oesDeValoresDetalhes ajusteEInforma�oesDeValoresDetalhes;
	AjusteEInforma�oesDeValoresEditar ajusteEInforma�oesDeValoresEditar;
	AjusteEInforma�oesDeValoresExcluir ajusteEInforma�oesDeValoresExcluir;
	AjusteEInforma�oesDeValoresVisualizar ajusteEInforma�oesDeValoresVisualizar;
	// 101

	// -----------------------------------------------------------------------------------------------

	// Detalhe Tipo Tributo
	@Test(priority = 0)
	public void detalheTipoTributoFiscalCriar() {

		System.out.println("-------------------Detalhe Tipo Tributo-------------------------");

		detalheTipoTributoCriar = new DetalheCriar();
		detalheTipoTributoCriar.beforeClass();
		detalheTipoTributoCriar.login();
		detalheTipoTributoCriar.acessarMDR();
		detalheTipoTributoCriar.criar();
		detalheTipoTributoCriar.afterClass();

	}

	@Test(priority = 1)
	public void detalheTipoTributoFiscalEditar() {

		detalheTipoTributoEditar = new DetalheEditar();
		detalheTipoTributoEditar.beforeClass();
		detalheTipoTributoEditar.login();
		detalheTipoTributoEditar.acessarMDR();
		detalheTipoTributoEditar.editar();
		detalheTipoTributoEditar.afterClass();

	}

	@Test(priority = 2)
	public void detalheTipoTributoFiscalVisualizar() {

		detalheTipoTributoVisualizar = new DetalheVisualizar();
		detalheTipoTributoVisualizar.beforeClass();
		detalheTipoTributoVisualizar.login();
		detalheTipoTributoVisualizar.acessarMDR();
		detalheTipoTributoVisualizar.visualizar();
		detalheTipoTributoVisualizar.afterClass();

	}

	@Test(priority = 3)
	public void detalheTipoTributoFiltroIdDetalhes() {

		detalheTipoTributoFiltroId = new DetalheFiltroId();
		detalheTipoTributoFiltroId.beforeClass();
		detalheTipoTributoFiltroId.login();
		detalheTipoTributoFiltroId.acessarMDR();
		detalheTipoTributoFiltroId.filtroId();
		detalheTipoTributoFiltroId.afterClass();

	}
	
	@Test(priority = 3)
	public void detalheTipoTributoDetalhes() {

		detalheTipoTributoDetalhes = new DetalheDetalhes();
		detalheTipoTributoDetalhes.beforeClass();
		detalheTipoTributoDetalhes.login();
		detalheTipoTributoDetalhes.acessarMDR();
		detalheTipoTributoDetalhes.detalhes();
		detalheTipoTributoDetalhes.afterClass();

	}


	@Test(priority = 4)
	public void detalheTipoTributoFiscalExcluir() {

		detalheTipoTributoExcluir = new DetalheExcluir();
		detalheTipoTributoExcluir.beforeClass();
		detalheTipoTributoExcluir.login();
		detalheTipoTributoExcluir.acessarMDR();
		detalheTipoTributoExcluir.excluir();
		detalheTipoTributoExcluir.afterClass();

		System.out.println("-------------------Detalhe Tipo Tributo Fin-------------------------");
	}

	// Determina��o de Tipo de Condi��o

	@Test(priority = 6)
	public void determinacaoDeTipoDeCondicaoCriarCriar() {

		System.out.println("-------------------Determina��o de Tipo de Condi��o-------------------------");

		determinacaoDeTipoDeCondicaoCriar = new DeterminacaoDeTipoDeCondicaoCriar();
		determinacaoDeTipoDeCondicaoCriar.beforeClass();
		determinacaoDeTipoDeCondicaoCriar.login();
		determinacaoDeTipoDeCondicaoCriar.acessarMDR();
		determinacaoDeTipoDeCondicaoCriar.criar();
		determinacaoDeTipoDeCondicaoCriar.afterClass();

	}

	@Test(priority = 7)
	public void determinacaoDeTipoDeCondicaoCriarEditar() {

		determinacaoDeTipoDeCondicaoEditar = new DeterminacaoDeTipoDeCondicaoEditar();
		determinacaoDeTipoDeCondicaoEditar.beforeClass();
		determinacaoDeTipoDeCondicaoEditar.login();
		determinacaoDeTipoDeCondicaoEditar.acessarMDR();
		determinacaoDeTipoDeCondicaoEditar.editar();
		determinacaoDeTipoDeCondicaoEditar.afterClass();

	}

	@Test(priority = 8)
	public void determinacaoDeTipoDeCondicaoCriarDetalhes() {

		determinacaoDeTipoDeCondicaoDetalhes = new DeterminacaoDeTipoDeCondicaoDetalhes();
		determinacaoDeTipoDeCondicaoDetalhes.beforeClass();
		determinacaoDeTipoDeCondicaoDetalhes.login();
		determinacaoDeTipoDeCondicaoDetalhes.acessarMDR();
		determinacaoDeTipoDeCondicaoDetalhes.Detalhes();
		determinacaoDeTipoDeCondicaoDetalhes.afterClass();

	}

	@Test(priority = 9)
	public void determinacaoDeTipoDeCondicaoCriarExcluir() {

		determinacaoDeTipoDeCondicaoExcluir = new DeterminacaoDeTipoDeCondicaoExcluir();
		determinacaoDeTipoDeCondicaoExcluir.beforeClass();
		determinacaoDeTipoDeCondicaoExcluir.login();
		determinacaoDeTipoDeCondicaoExcluir.acessarMDR();
		determinacaoDeTipoDeCondicaoExcluir.excluir();
		determinacaoDeTipoDeCondicaoExcluir.afterClass();

		System.out.println("-------------------Determina��o de Tipo de Condi��o Fin-------------------------");
	}

	// Empresas

	@Test(priority = 12)
	public void empresaEditar() {

		System.out.println("-------------------Empresas-------------------------");

		empresaEditar = new com.timp.test.MDR.Empresas.EmpresaEditar();
		empresaEditar.beforeClass();
		empresaEditar.login();
		empresaEditar.acessarMDR();
		empresaEditar.editar();
		empresaEditar.afterClass();

	}

	@Test(priority = 13)
	public void empresaVisualizar() {

		empresasVisualizar = new EmpresasVisualizar();
		empresasVisualizar.beforeClass();
		empresasVisualizar.login();
		empresasVisualizar.acessarMDR();
		empresasVisualizar.visualizar();
		empresasVisualizar.afterClass();

	}
	
	@Test(priority = 13)
	public void empresasDetalhes() {

		empresasDetalhes = new EmpresasDetalhes();
		empresasDetalhes.beforeClass();
		empresasDetalhes.login();
		empresasDetalhes.acessarMDR();
		empresasDetalhes.detalhes();
		empresasDetalhes.afterClass();

	}


	@Test(priority = 14)
	public void empresaFiltros() {

		empresasFiltros = new EmpresasFiltros();
		empresasFiltros.beforeClass();
		empresasFiltros.login();
		empresasFiltros.acessarMDR();
		empresasFiltros.filtros();
		empresasFiltros.afterClass();

		System.out.println("-------------------Empresas Fin-------------------------");
	}

	// Filiais

	@Test(priority = 15)
	public void filiaisEditar() {

		System.out.println("-------------------Filiais-------------------------");

		filiaisEditar = new FiliaisEditar();
		filiaisEditar.beforeClass();
		filiaisEditar.login();
		filiaisEditar.acessarMDR();
		filiaisEditar.editar();
		filiaisEditar.afterClass();

	}

	@Test(priority = 16)
	public void filiaisVisualizar() {

		filiaisVisualizar = new FiliaisVisualizar();
		filiaisVisualizar.beforeClass();
		filiaisVisualizar.login();
		filiaisVisualizar.acessarMDR();
		filiaisVisualizar.visualizar();
		filiaisVisualizar.afterClass();

		System.out.println("-------------------Filiais Fin-------------------------");
	}

	// Hierarquia De Cenarios De Corre��o

	@Test(priority = 18)
	public void hierarquiaDeCenariosDeCorre�aoCriar() {

		System.out.println("-------------------Hierarquia De Cenarios De Corre��o-------------------------");

		hierarquiaDeCenariosDeCorre�aoCriar = new HierarquiaDeCenariosDeCorre�aoCriar();
		hierarquiaDeCenariosDeCorre�aoCriar.beforeClass();
		hierarquiaDeCenariosDeCorre�aoCriar.login();
		hierarquiaDeCenariosDeCorre�aoCriar.acessarMDR();
		hierarquiaDeCenariosDeCorre�aoCriar.criar();
		hierarquiaDeCenariosDeCorre�aoCriar.afterClass();

	}

	@Test(priority = 19)
	public void hierarquiaDeCenariosDeCorre�aoEditar() {

		hierarquiaDeCenariosDeCorre�aoEditar = new HierarquiaDeCenariosDeCorre�aoEditar();
		hierarquiaDeCenariosDeCorre�aoEditar.beforeClass();
		hierarquiaDeCenariosDeCorre�aoEditar.login();
		hierarquiaDeCenariosDeCorre�aoEditar.acessarMDR();
		hierarquiaDeCenariosDeCorre�aoEditar.editar();
		hierarquiaDeCenariosDeCorre�aoEditar.afterClass();

	}

	@Test(priority = 20)
	public void hierarquiaDeCenariosDeCorre�aoVisualizar() {

		hierarquiaDeCenariosDeCorre�aoVisualizar = new HierarquiaDeCenariosDeCorre�aoVisualizar();
		hierarquiaDeCenariosDeCorre�aoVisualizar.beforeClass();
		hierarquiaDeCenariosDeCorre�aoVisualizar.login();
		hierarquiaDeCenariosDeCorre�aoVisualizar.acessarMDR();
		hierarquiaDeCenariosDeCorre�aoVisualizar.visualizar();
		hierarquiaDeCenariosDeCorre�aoVisualizar.afterClass();

	}

	@Test(priority = 21)
	public void hierarquiaDeCenariosDeCorre�aoDetalhes() {

		hierarquiaDeCenariosDeCorre�aoDetalhes = new HierarquiaDeCenariosDeCorre�aoDetalhes();
		hierarquiaDeCenariosDeCorre�aoDetalhes.beforeClass();
		hierarquiaDeCenariosDeCorre�aoDetalhes.login();
		hierarquiaDeCenariosDeCorre�aoDetalhes.acessarMDR();
		hierarquiaDeCenariosDeCorre�aoDetalhes.Detalhes();
		hierarquiaDeCenariosDeCorre�aoDetalhes.afterClass();

		System.out.println("-------------------Hierarquia De Cenarios De Corre��o Fin-------------------------");

	}
	/*
	 * 
	 * @Test(priority = 22) public void hierarquiaDeCenariosDeCorre�aoExcluir() {
	 * 
	 * hierarquiaDeCenariosDeCorre�aoEliminar = new
	 * hierarquiaDeCenariosDeCorre�aoEliminar();
	 * hierarquiaDeCenariosDeCorre�aoEliminar.beforeClass();
	 * hierarquiaDeCenariosDeCorre�aoEliminar.login();
	 * hierarquiaDeCenariosDeCorre�aoEliminar.acessarMDR();
	 * hierarquiaDeCenariosDeCorre�aoEliminar.eliminar();
	 * hierarquiaDeCenariosDeCorre�aoEliminar.afterClass();
	 * 
	 * 
	 * }
	 * 
	 */

	/*
	 * Bloqueado
	 * 
	 * //ICMS ST Transporte
	 * 
	 * 
	 * @Test(priority = 24) public void iCMSSTTransporteCriar() {
	 * 
	 * System.out.
	 * println("-------------------Hierarquia De Cenarios De Corre��o-------------------------"
	 * );
	 * 
	 * iCMSSTTransporteCriar = new ICMSSTTransporteCriar();
	 * iCMSSTTransporteCriar.beforeClass(); iCMSSTTransporteCriar.login();
	 * iCMSSTTransporteCriar.acessarMDR(); iCMSSTTransporteCriar.criar();
	 * iCMSSTTransporteCriar.afterClass();
	 * 
	 * }
	 * 
	 */

	// L�mite de Compet�ncia

	@Test(priority = 31)
	public void limiteCompetenciaCriar() {

		System.out.println("-------------------L�mite de Compet�ncia-------------------------");

		limiteCompetenciaCriar = new LimiteCompetenciaCriar();
		limiteCompetenciaCriar.beforeClass();
		limiteCompetenciaCriar.login();
		limiteCompetenciaCriar.acessarMDR();
		limiteCompetenciaCriar.criar();
		limiteCompetenciaCriar.afterClass();

	}

	@Test(priority = 32)
	public void limiteCompetenciaEditar() {

		limiteCompetenciaEditar = new LimiteCompetenciaEditar();
		limiteCompetenciaEditar.beforeClass();
		limiteCompetenciaEditar.login();
		limiteCompetenciaEditar.acessarMDR();
		limiteCompetenciaEditar.editar();
		limiteCompetenciaEditar.afterClass();

	}

	@Test(priority = 33)
	public void limiteCompetenciaVisualizar() {

		limiteCompetenciaVisualizar = new LimiteCompetenciaVisualizar();
		limiteCompetenciaVisualizar.beforeClass();
		limiteCompetenciaVisualizar.login();
		limiteCompetenciaVisualizar.acessarMDR();
		limiteCompetenciaVisualizar.visualizar();
		limiteCompetenciaVisualizar.afterClass();

	}

	@Test(priority = 34)
	public void limiteCompetenciaDetalhes() {

		limiteCompetenciaDetalhes = new LimiteCompetenciaDetalhes();
		limiteCompetenciaDetalhes.beforeClass();
		limiteCompetenciaDetalhes.login();
		limiteCompetenciaDetalhes.acessarMDR();
		limiteCompetenciaDetalhes.detalhes();
		limiteCompetenciaDetalhes.afterClass();

	}

	@Test(priority = 35)
	public void limiteCompetenciaExcluir() {

		limiteCompetenciaExcluir = new LimiteCompetenciaExcluir();
		limiteCompetenciaExcluir.beforeClass();
		limiteCompetenciaExcluir.login();
		limiteCompetenciaExcluir.acessarMDR();
		limiteCompetenciaExcluir.excluir();
		limiteCompetenciaExcluir.afterClass();

		System.out.println("-------------------L�mite de Compet�ncia Fin-------------------------");
	}

	// Livros Fiscais > Livros Fiscais

	@Test(priority = 37)
	public void livrosFiscaisCriar() {

		System.out.println("-------------------Livros Fiscais > Livros Fiscais-------------------------");

		livrosFiscaisCriar = new LivrosFiscaisCriar();
		livrosFiscaisCriar.beforeClass();
		livrosFiscaisCriar.login();
		livrosFiscaisCriar.acessarMDR();
		livrosFiscaisCriar.criar();
		livrosFiscaisCriar.afterClass();

	}

	/*
	 * @Test(priority = 38) public void livrosFiscaisEditar() {
	 * 
	 * livrosFiscaisEditar = new livrosFiscaisEditar();
	 * livrosFiscaisEditar.beforeClass(); livrosFiscaisEditar.login();
	 * livrosFiscaisEditar.acessarMDR(); livrosFiscaisEditar.editar();
	 * livrosFiscaisEditar.afterClass();
	 * 
	 * }
	 */
	@Test(priority = 39)
	public void livrosFiscaisVisualizar() {

		livrosFiscaisVisualizar = new LivrosFiscaisVisualizar();
		livrosFiscaisVisualizar.beforeClass();
		livrosFiscaisVisualizar.login();
		livrosFiscaisVisualizar.acessarMDR();
		livrosFiscaisVisualizar.visualizar();
		livrosFiscaisVisualizar.afterClass();

	}

	@Test(priority = 40)
	public void livrosFiscaisDetalhes() {

		livrosFiscaisDetalhes = new LivrosFiscaisDetalhes();
		livrosFiscaisDetalhes.beforeClass();
		livrosFiscaisDetalhes.login();
		livrosFiscaisDetalhes.acessarMDR();
		livrosFiscaisDetalhes.detalhes();
		livrosFiscaisDetalhes.afterClass();

	}

	@Test(priority = 41)
	public void livrosFiscaisExcluir() {

		livrosFiscaisExcluir = new LivrosFiscaisExcluir();
		livrosFiscaisExcluir.beforeClass();
		livrosFiscaisExcluir.login();
		livrosFiscaisExcluir.acessarMDR();
		livrosFiscaisExcluir.excluir();
		livrosFiscaisExcluir.afterClass();

		System.out.println("-------------------Livros Fiscais > Livros Fiscais Fin-------------------------");
	}

	// Livros Fiscais > Parametros Para Livro ICMS ST

	@Test(priority = 43)
	public void parametrosParaLivroICMSSTCriarCriar() {

		System.out
				.println("-------------------Livros Fiscais > Parametros Para Livro ICMS ST-------------------------");

		parametrosParaLivroICMSSTCriar = new ParametrosParaLivroICMSSTCriar();
		parametrosParaLivroICMSSTCriar.beforeClass();
		parametrosParaLivroICMSSTCriar.login();
		parametrosParaLivroICMSSTCriar.acessarMDR();
		parametrosParaLivroICMSSTCriar.criar();
		parametrosParaLivroICMSSTCriar.afterClass();

		System.out.println(
				"-------------------Livros Fiscais > Parametros Para Livro ICMS ST Fin-------------------------");
	}

	// Mapeamento De Relevancia Para Pis Cofins

	@Test(priority = 49)
	public void mapeamentoDeRelevanciaParaPisCofinsCriar() {

		System.out.println("-------------------Mapeamento De Relevancia Para Pis Cofins-------------------------");

		mapeamentoDeRelevanciaParaPisCofinsCriar = new MapeamentoDeRelevanciaParaPisCofinsCriar();
		mapeamentoDeRelevanciaParaPisCofinsCriar.beforeClass();
		mapeamentoDeRelevanciaParaPisCofinsCriar.login();
		mapeamentoDeRelevanciaParaPisCofinsCriar.acessarMDR();
		mapeamentoDeRelevanciaParaPisCofinsCriar.criar();
		mapeamentoDeRelevanciaParaPisCofinsCriar.afterClass();

	}

	@Test(priority = 50)
	public void mapeamentoDeRelevanciaParaPisCofinsEditar() {

		mapeamentoDeRelevanciaParaPisCofinsEditar = new MapeamentoDeRelevanciaParaPisCofinsEditar();
		mapeamentoDeRelevanciaParaPisCofinsEditar.beforeClass();
		mapeamentoDeRelevanciaParaPisCofinsEditar.login();
		mapeamentoDeRelevanciaParaPisCofinsEditar.acessarMDR();
		mapeamentoDeRelevanciaParaPisCofinsEditar.editar();
		mapeamentoDeRelevanciaParaPisCofinsEditar.afterClass();

	}

	@Test(priority = 51)
	public void mapeamentoDeRelevanciaParaPisCofinsVisualizar() {

		mapeamentoDeRelevanciaParaPisCofinsVisualizar = new MapeamentoDeRelevanciaParaPisCofinsVisualizar();
		mapeamentoDeRelevanciaParaPisCofinsVisualizar.beforeClass();
		mapeamentoDeRelevanciaParaPisCofinsVisualizar.login();
		mapeamentoDeRelevanciaParaPisCofinsVisualizar.acessarMDR();
		mapeamentoDeRelevanciaParaPisCofinsVisualizar.visualizar();
		mapeamentoDeRelevanciaParaPisCofinsVisualizar.afterClass();

	}

	/*
	 * Bloqueado
	 * 
	 * @Test(priority = 52) public void
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes() {
	 * 
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes = new
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes();
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes.beforeClass();
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes.login();
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes.acessarMDR();
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes.Detalhes();
	 * mapeamentoDeRelevanciaParaPisCofinsDetalhes.afterClass();
	 * 
	 * }
	 * 
	 */
	@Test(priority = 53)
	public void mapeamentoDeRelevanciaParaPisCofinsExcluir() {

		mapeamentoDeRelevanciaParaPisCofinsExcluir = new MapeamentoDeRelevanciaParaPisCofinsExcluir();
		mapeamentoDeRelevanciaParaPisCofinsExcluir.beforeClass();
		mapeamentoDeRelevanciaParaPisCofinsExcluir.login();
		mapeamentoDeRelevanciaParaPisCofinsExcluir.acessarMDR();
		mapeamentoDeRelevanciaParaPisCofinsExcluir.excluir();
		mapeamentoDeRelevanciaParaPisCofinsExcluir.afterClass();

		System.out.println("-------------------Mapeamento De Relevancia Para Pis Cofins Fin-------------------------");
	}

	// Ocurrencia Fiscal > Tipos De Objetos De Ocorrencias Fiscais

	@Test(priority = 55)
	public void tiposDeObjetosDeOcorrenciasFiscaisCriar() {

		System.out.println(
				"-------------------Ocurrencia Fiscal > Tipos De Objetos De Ocorrencias Fiscais-------------------------");

		tiposDeObjetosDeOcorrenciasFiscaisCriar = new TiposDeObjetosDeOcorrenciasFiscaisCriar();
		tiposDeObjetosDeOcorrenciasFiscaisCriar.beforeClass();
		tiposDeObjetosDeOcorrenciasFiscaisCriar.login();
		tiposDeObjetosDeOcorrenciasFiscaisCriar.acessarMDR();
		tiposDeObjetosDeOcorrenciasFiscaisCriar.criar();
		tiposDeObjetosDeOcorrenciasFiscaisCriar.afterClass();

	}

	@Test(priority = 56)
	public void tiposDeObjetosDeOcorrenciasFiscaisEditar() {

		tiposDeObjetosDeOcorrenciasFiscaisEditar = new TiposDeObjetosDeOcorrenciasFiscaisEditar();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.beforeClass();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.login();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.acessarMDR();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.editar();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.afterClass();

	}

	@Test(priority = 57)
	public void tiposDeObjetosDeOcorrenciasFiscaisDetalhes() {

		tiposDeObjetosDeOcorrenciasFiscaisDetalhes = new TiposDeObjetosDeOcorrenciasFiscaisDetalhes();
		tiposDeObjetosDeOcorrenciasFiscaisDetalhes.beforeClass();
		tiposDeObjetosDeOcorrenciasFiscaisDetalhes.login();
		tiposDeObjetosDeOcorrenciasFiscaisDetalhes.acessarMDR();
		tiposDeObjetosDeOcorrenciasFiscaisDetalhes.Detalhes();
		tiposDeObjetosDeOcorrenciasFiscaisDetalhes.afterClass();

		System.out.println(
				"-------------------Ocurrencia Fiscal > Tipos De Objetos De Ocorrencias Fiscais Fin-------------------------");

	}

	// 61

	// Par�metros de Contabiliza��o > Contas Default Para Extemporaneo

	@Test(priority = 61)
	public void contasDefaultParaExtemporaneoCriar() {

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Contas Default Para Extemporaneo-------------------------");

		contasDefaultParaExtemporaneoCriar = new ContasDefaultParaExtemporaneoCriar();
		contasDefaultParaExtemporaneoCriar.beforeClass();
		contasDefaultParaExtemporaneoCriar.login();
		contasDefaultParaExtemporaneoCriar.acessarMDR();
		contasDefaultParaExtemporaneoCriar.criar();
		contasDefaultParaExtemporaneoCriar.afterClass();

	}

	@Test(priority = 62)
	public void contasDefaultParaExtemporaneoEditar() {
		contasDefaultParaExtemporaneoEditar = new ContasDefaultParaExtemporaneoEditar();
		contasDefaultParaExtemporaneoEditar.beforeClass();
		contasDefaultParaExtemporaneoEditar.login();
		contasDefaultParaExtemporaneoEditar.acessarMDR();
		contasDefaultParaExtemporaneoEditar.editar();
		contasDefaultParaExtemporaneoEditar.afterClass();

	}

	@Test(priority = 63)
	public void contasDefaultParaExtemporaneoVisualizar() {

		contasDefaultParaExtemporaneoVisualizar = new ContasDefaultParaExtemporaneoVisualizar();
		contasDefaultParaExtemporaneoVisualizar.beforeClass();
		contasDefaultParaExtemporaneoVisualizar.login();
		contasDefaultParaExtemporaneoVisualizar.acessarMDR();
		contasDefaultParaExtemporaneoVisualizar.Visualizar();
		contasDefaultParaExtemporaneoVisualizar.afterClass();

	}

	@Test(priority = 64)
	public void contasDefaultParaExtemporaneoDetalhes() {

		contasDefaultParaExtemporaneoDetalhes = new ContasDefaultParaExtemporaneoDetalhes();
		contasDefaultParaExtemporaneoDetalhes.beforeClass();
		contasDefaultParaExtemporaneoDetalhes.login();
		contasDefaultParaExtemporaneoDetalhes.acessarMDR();
		contasDefaultParaExtemporaneoDetalhes.Detalhes();
		contasDefaultParaExtemporaneoDetalhes.afterClass();

	}

	@Test(priority = 23)
	public void contasDefaultParaExtemporaneoFiltroID() {

		contasDefaultParaExtemporaneoFiltroID = new ContasDefaultParaExtemporaneoFiltroID();
		contasDefaultParaExtemporaneoFiltroID.beforeClass();
		contasDefaultParaExtemporaneoFiltroID.login();
		contasDefaultParaExtemporaneoFiltroID.acessarMDR();
		contasDefaultParaExtemporaneoFiltroID.filtroId();
		contasDefaultParaExtemporaneoFiltroID.afterClass();

	}

	@Test(priority = 65)
	public void contasDefaultParaExtemporaneoExcluir() {

		contasDefaultParaExtemporaneoExcluir = new ContasDefaultParaExtemporaneoExcluir();
		contasDefaultParaExtemporaneoExcluir.beforeClass();
		contasDefaultParaExtemporaneoExcluir.login();
		contasDefaultParaExtemporaneoExcluir.acessarMDR();
		contasDefaultParaExtemporaneoExcluir.excluir();
		contasDefaultParaExtemporaneoExcluir.afterClass();

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Contas Default Para Extemporaneo Fin-------------------------");
	}

	// 67

	// Par�metros de Contabiliza��o > Contas Default Por Tributo

	@Test(priority = 67)
	public void contasDefaultPorTributoCriar() {

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Contas Default Por Tributo-------------------------");

		contasDefaultPorTributoCriar = new ContasDefaultPorTributoCriar();
		contasDefaultPorTributoCriar.beforeClass();
		contasDefaultPorTributoCriar.login();
		contasDefaultPorTributoCriar.acessarMDR();
		contasDefaultPorTributoCriar.criar();
		contasDefaultPorTributoCriar.afterClass();

	}

	@Test(priority = 68)
	public void contasDefaultPorTributoEditar() {

		contasDefaultPorTributoEditar = new ContasDefaultPorTributoEditar();
		contasDefaultPorTributoEditar.beforeClass();
		contasDefaultPorTributoEditar.login();
		contasDefaultPorTributoEditar.acessarMDR();
		contasDefaultPorTributoEditar.editar();
		contasDefaultPorTributoEditar.afterClass();

	}

	@Test(priority = 69)
	public void contasDefaultPorTributoVisualizar() {

		contasDefaultPorTributoVisualizar = new ContasDefaultPorTributoVisualizar();
		contasDefaultPorTributoVisualizar.beforeClass();
		contasDefaultPorTributoVisualizar.login();
		contasDefaultPorTributoVisualizar.acessarMDR();
		contasDefaultPorTributoVisualizar.Visualizar();
		contasDefaultPorTributoVisualizar.afterClass();

	}

	@Test(priority = 70)
	public void contasDefaultPorTributoDetalhes() {

		contasDefaultPorTributoDetalhes = new ContasDefaultPorTributoDetalhes();
		contasDefaultPorTributoDetalhes.beforeClass();
		contasDefaultPorTributoDetalhes.login();
		contasDefaultPorTributoDetalhes.acessarMDR();
		contasDefaultPorTributoDetalhes.Detalhes();
		contasDefaultPorTributoDetalhes.afterClass();

	}

	@Test(priority = 71)
	public void contasDefaultPorTributoExcluir() {

		contasDefaultPorTributoExcluir = new ContasDefaultPorTributoExcluir();
		contasDefaultPorTributoExcluir.beforeClass();
		contasDefaultPorTributoExcluir.login();
		contasDefaultPorTributoExcluir.acessarMDR();
		contasDefaultPorTributoExcluir.excluir();
		contasDefaultPorTributoExcluir.afterClass();

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Contas Default Por Tributo Fin-------------------------");
	}

	// 72

	@Test(priority = 72)
	public void mapeamentoContabilCriar() {

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Mapemaneto Cont�bil-------------------------");

		mapeamentoContabilCriar = new MapeamentoContabilCriar();
		mapeamentoContabilCriar.beforeClass();
		mapeamentoContabilCriar.login();
		mapeamentoContabilCriar.acessarMDR();
		mapeamentoContabilCriar.criar();
		mapeamentoContabilCriar.afterClass();

	}

	@Test(priority = 73)
	public void mapeamentoContabilEditar() {

		mapeamentoContabilEditar = new MapeamentoContabilEditar();
		mapeamentoContabilEditar.beforeClass();
		mapeamentoContabilEditar.login();
		mapeamentoContabilEditar.acessarMDR();
		mapeamentoContabilEditar.editar();
		mapeamentoContabilEditar.afterClass();

	}

	@Test(priority = 74)
	public void mapeamentoContabilExcluir() {

		mapeamentoContabilExcluir = new MapeamentoContabilExcluir();
		mapeamentoContabilExcluir.beforeClass();
		mapeamentoContabilExcluir.login();
		mapeamentoContabilExcluir.acessarMDR();
		mapeamentoContabilExcluir.excluir();
		mapeamentoContabilExcluir.afterClass();

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Mapemaneto Cont�bil Fin-------------------------");
	}

	// 78

	// Par�metros de Contabiliza��o > Mapemaneto Cont�bil por Corre��o

	@Test(priority = 78)
	public void mapeamentoContabilCorrecaoCriar() {

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Mapemaneto Cont�bil por Corre��o-------------------------");

		mapeamentoContabilCorrecaoCriar = new MapeamentoContabilCorrecaoCriar();
		mapeamentoContabilCorrecaoCriar.beforeClass();
		mapeamentoContabilCorrecaoCriar.login();
		mapeamentoContabilCorrecaoCriar.acessarMDR();
		mapeamentoContabilCorrecaoCriar.criar();
		mapeamentoContabilCorrecaoCriar.afterClass();

	}

	@Test(priority = 79)
	public void mapeamentoContabilCorrecaoEditar() {

		mapeamentoContabilCorrecaoEditar = new MapeamentoContabilCorrecaoEditar();
		mapeamentoContabilCorrecaoEditar.beforeClass();
		mapeamentoContabilCorrecaoEditar.login();
		mapeamentoContabilCorrecaoEditar.acessarMDR();
		mapeamentoContabilCorrecaoEditar.editar();
		mapeamentoContabilCorrecaoEditar.afterClass();

	}

	@Test(priority = 80)
	public void mapeamentoContabilCorrecaoVisualizar() {

		mapeamentoContabilCorrecaoVisualizar = new MapeamentoContabilCorrecaoVisualizar();
		mapeamentoContabilCorrecaoVisualizar.beforeClass();
		mapeamentoContabilCorrecaoVisualizar.login();
		mapeamentoContabilCorrecaoVisualizar.acessarMDR();
		mapeamentoContabilCorrecaoVisualizar.visualizar();
		mapeamentoContabilCorrecaoVisualizar.afterClass();

		System.out.println(
				"-------------------Par�metros de Contabiliza��o > Mapemaneto Cont�bil Por Corre��o Fin-------------------------");
	}
	
	@Test(priority = 81)
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

	@Test(priority = 85)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.editar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesEditar.afterClass();

	}

	@Test(priority = 86)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.visualizar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar.afterClass();

	}

	@Test(priority = 87)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.detalhes();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhes.afterClass();

	}

	@Test(priority = 88)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.excluir();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluir.afterClass();

		System.out.println(
				"-------------------ParametrosContabilizacao > Mapeamento Substituicao Conta Estoque Cenarios Correcoes Fin-------------------------");
	}
	
	@Test(priority = 89)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId() {

		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroId();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.filtroId();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesexCenariosCorrecoesFiltroId.afterClass();

	}


	// 90

	// Registro de Exporta��o

	@Test(priority = 90)
	public void registroDeExporta�aoCriar() {

		System.out.println("-------------------Registro de Exporta��o-------------------------");

		registroDeExporta�aoCriar = new RegistroDeExporta�aoCriar();
		registroDeExporta�aoCriar.beforeClass();
		registroDeExporta�aoCriar.login();
		registroDeExporta�aoCriar.acessarMDR();
		registroDeExporta�aoCriar.criar();
		registroDeExporta�aoCriar.afterClass();

	}

	@Test(priority = 91)
	public void registroDeExporta�aoEditar() {

		registroDeExporta�aoEditar = new RegistroDeExporta�aoEditar();
		registroDeExporta�aoEditar.beforeClass();
		registroDeExporta�aoEditar.login();
		registroDeExporta�aoEditar.acessarMDR();
		registroDeExporta�aoEditar.editar();
		registroDeExporta�aoEditar.afterClass();

	}

	@Test(priority = 92)
	public void registroDeExporta�aoVisualizar() {

		registroDeExporta�aoVisualizar = new RegistroDeExporta�aoVisualizar();
		registroDeExporta�aoVisualizar.beforeClass();
		registroDeExporta�aoVisualizar.login();
		registroDeExporta�aoVisualizar.acessarMDR();
		registroDeExporta�aoVisualizar.Visualizar();
		registroDeExporta�aoVisualizar.afterClass();

	}

	@Test(priority = 93)
	public void registroDeExporta�aoDetalhes() {

		registroDeExporta�aoFiltrosAvan�ados = new RegistroDeExporta�aoFiltrosAvan�ados();
		registroDeExporta�aoFiltrosAvan�ados.beforeClass();
		registroDeExporta�aoFiltrosAvan�ados.login();
		registroDeExporta�aoFiltrosAvan�ados.acessarMDR();
		registroDeExporta�aoFiltrosAvan�ados.filtros();
		registroDeExporta�aoFiltrosAvan�ados.afterClass();

	}

	@Test(priority = 94)
	public void registroDeExporta�aoExcluir() {

		registroDeExporta�aoExcluir = new RegistroDeExporta�aoExcluir();
		registroDeExporta�aoExcluir.beforeClass();
		registroDeExporta�aoExcluir.login();
		registroDeExporta�aoExcluir.acessarMDR();
		registroDeExporta�aoExcluir.Excluir();
		registroDeExporta�aoExcluir.afterClass();

		System.out.println("-------------------Registro de Exporta��o Fin-------------------------");
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

	@Test(priority = 99)
	public void representanteLegaisEditar() {

		representanteLegaisEditar = new RepresentanteLegaisEditar();
		representanteLegaisEditar.beforeClass();
		representanteLegaisEditar.login();
		representanteLegaisEditar.acessarMDR();
		representanteLegaisEditar.editar();
		representanteLegaisEditar.afterClass();

	}

	@Test(priority = 100)
	public void representanteLegaisVisualizar() {

		representanteLegaisVisualizar = new RepresentanteLegaisVisualizar();
		representanteLegaisVisualizar.beforeClass();
		representanteLegaisVisualizar.login();
		representanteLegaisVisualizar.acessarMDR();
		representanteLegaisVisualizar.Visualizar();
		representanteLegaisVisualizar.afterClass();

	}

	@Test(priority = 101)
	public void representanteLegaisDetalhes() {

		representantesLegaisDetalhes = new RepresentantesLegaisDetalhes();
		representantesLegaisDetalhes.beforeClass();
		representantesLegaisDetalhes.login();
		representantesLegaisDetalhes.acessarMDR();
		representantesLegaisDetalhes.detalhes();
		representantesLegaisDetalhes.afterClass();

	}

	@Test(priority = 102)
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

	@Test(priority = 105)
	public void saldoInicialDiferidoEditar() {

		saldoInicialDiferidoEditar = new SaldoInicialDiferidoEditar();
		saldoInicialDiferidoEditar.beforeClass();
		saldoInicialDiferidoEditar.login();
		saldoInicialDiferidoEditar.acessarMDR();
		saldoInicialDiferidoEditar.editar();
		saldoInicialDiferidoEditar.afterClass();

	}

	@Test(priority = 106)
	public void saldoInicialDiferidoFiltroID() {

		saldoInicialDiferidoFiltroID = new SaldoInicialDiferidoFiltroID();
		saldoInicialDiferidoFiltroID.beforeClass();
		saldoInicialDiferidoFiltroID.login();
		saldoInicialDiferidoFiltroID.acessarMDR();
		saldoInicialDiferidoFiltroID.filtro();
		saldoInicialDiferidoFiltroID.afterClass();

	}

	@Test(priority = 107)
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

	@Test(priority = 111)
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

	@Test(priority = 117)
	public void movimentoSCANCEditar() {

		movimentoSCANCEditar = new MovimentoSCANCEditar();
		movimentoSCANCEditar.beforeClass();
		movimentoSCANCEditar.login();
		movimentoSCANCEditar.acessarMDR();
		movimentoSCANCEditar.editar();
		movimentoSCANCEditar.afterClass();

	}

	@Test(priority = 118)
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

	@Test(priority = 129)
	public void productosSCANCEditar() {

		productosSCANCEditar = new ProductosSCANCEditar();
		productosSCANCEditar.beforeClass();
		productosSCANCEditar.login();
		productosSCANCEditar.acessarMDR();
		productosSCANCEditar.editar();
		productosSCANCEditar.afterClass();

	}

	@Test(priority = 130)
	public void productosSCANCVisualizar() {

		productosSCANCVisualizar = new ProductosSCANCVisualizar();
		productosSCANCVisualizar.beforeClass();
		productosSCANCVisualizar.login();
		productosSCANCVisualizar.acessarMDR();
		productosSCANCVisualizar.visualizar();
		productosSCANCVisualizar.afterClass();

	}

	@Test(priority = 131)
	public void productosSCANCDetalhes() {

		productosSCANCDetalhes = new ProdutosSCANCDetalhes();
		productosSCANCDetalhes.beforeClass();
		productosSCANCDetalhes.login();
		productosSCANCDetalhes.acessarMDR();
		productosSCANCDetalhes.detalhes();
		productosSCANCDetalhes.afterClass();

	}

	@Test(priority = 132)
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

	@Test(priority = 135)
	public void sCANCDistribuidorasVisualizar() {

		sCANCDistribuidorasVisualizar = new SCANCDistribuidorasVisualizar();
		sCANCDistribuidorasVisualizar.beforeClass();
		sCANCDistribuidorasVisualizar.login();
		sCANCDistribuidorasVisualizar.acessarMDR();
		sCANCDistribuidorasVisualizar.visualizar();
		sCANCDistribuidorasVisualizar.afterClass();

	}

	@Test(priority = 136)
	public void sCANCDistribuidorasDetalhes() {

		sCANCDistribuidorasDetalhes = new SCANCDistribuidorasDetalhes();
		sCANCDistribuidorasDetalhes.beforeClass();
		sCANCDistribuidorasDetalhes.login();
		sCANCDistribuidorasDetalhes.acessarMDR();
		sCANCDistribuidorasDetalhes.detalhes();
		sCANCDistribuidorasDetalhes.afterClass();

	}

	@Test(priority = 137)
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

	@Test(priority = 141)
	public void sequenciaEditar() {

		sequenciaEditar = new SequenciaEditar();
		sequenciaEditar.beforeClass();
		sequenciaEditar.login();
		sequenciaEditar.acessarMDR();
		sequenciaEditar.Editar();
		sequenciaEditar.afterClass();

	}

	@Test(priority = 142)
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

	@Test(priority = 144)
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

	@Test(priority = 146)
	public void motivosCesBeneficiosVisualizar() {

		motivosCesBeneficiosVisualizar = new MotivosCesBeneficiosVisualizar();
		motivosCesBeneficiosVisualizar.beforeClass();
		motivosCesBeneficiosVisualizar.login();
		motivosCesBeneficiosVisualizar.acessarMDR();
		motivosCesBeneficiosVisualizar.visualizar();
		motivosCesBeneficiosVisualizar.afterClass();

	}

	@Test(priority = 147)
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

	// TabelasApoioSped > Ajustes e Informa��o de Valores Provenientes de Documento
	// Fiscal

	@Test(priority = 151)
	public void ajusteEInforma�oesDeValoresCriar() {

		System.out.println(
				"-------------------TabelasApoioSped > Ajustes e Informa��o de Valores Provenientes de Documento Fiscal-------------------------");

		ajusteEInforma�oesDeValoresCriar = new AjusteEInforma�oesDeValoresCriar();
		ajusteEInforma�oesDeValoresCriar.beforeClass();
		ajusteEInforma�oesDeValoresCriar.login();
		ajusteEInforma�oesDeValoresCriar.acessarMDR();
		ajusteEInforma�oesDeValoresCriar.criar();
		ajusteEInforma�oesDeValoresCriar.afterClass();

	}

	@Test(priority = 152)
	public void ajusteEInforma�oesDeValoresEditar() {

		ajusteEInforma�oesDeValoresEditar = new AjusteEInforma�oesDeValoresEditar();
		ajusteEInforma�oesDeValoresEditar.beforeClass();
		ajusteEInforma�oesDeValoresEditar.login();
		ajusteEInforma�oesDeValoresEditar.acessarMDR();
		ajusteEInforma�oesDeValoresEditar.editar();
		ajusteEInforma�oesDeValoresEditar.afterClass();

	}

	@Test(priority = 153)
	public void ajusteEInforma�oesDeValoresVisualizar() {

		ajusteEInforma�oesDeValoresVisualizar = new AjusteEInforma�oesDeValoresVisualizar();
		ajusteEInforma�oesDeValoresVisualizar.beforeClass();
		ajusteEInforma�oesDeValoresVisualizar.login();
		ajusteEInforma�oesDeValoresVisualizar.acessarMDR();
		ajusteEInforma�oesDeValoresVisualizar.Visualizar();
		ajusteEInforma�oesDeValoresVisualizar.afterClass();

	}

	@Test(priority = 154)
	public void ajusteEInforma�oesDeValoresDetalhes() {

		ajusteEInforma�oesDeValoresDetalhes = new AjusteEInforma�oesDeValoresDetalhes();
		ajusteEInforma�oesDeValoresDetalhes.beforeClass();
		ajusteEInforma�oesDeValoresDetalhes.login();
		ajusteEInforma�oesDeValoresDetalhes.acessarMDR();
		ajusteEInforma�oesDeValoresDetalhes.detalhes();
		ajusteEInforma�oesDeValoresDetalhes.afterClass();

	}

	@Test(priority = 155)
	public void ajusteEInforma�oesDeValoresExcluir() {

		ajusteEInforma�oesDeValoresExcluir = new AjusteEInforma�oesDeValoresExcluir();
		ajusteEInforma�oesDeValoresExcluir.beforeClass();
		ajusteEInforma�oesDeValoresExcluir.login();
		ajusteEInforma�oesDeValoresExcluir.acessarMDR();
		ajusteEInforma�oesDeValoresExcluir.excluir();
		ajusteEInforma�oesDeValoresExcluir.afterClass();

		System.out.println(
				"------------------TabelasApoioSped > Ajustes e Informa��o de Valores Provenientes de Documento Fiscal Fin-------------------------");
	}

}
