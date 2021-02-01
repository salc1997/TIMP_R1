
package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasCriarPO;
import com.timp.test.MDR.DetalheTipoTributo.DetalheCriar;
import com.timp.test.MDR.DetalheTipoTributo.DetalheDetalhes;
import com.timp.test.MDR.DetalheTipoTributo.DetalheEditar;
import com.timp.test.MDR.DetalheTipoTributo.DetalheExcluir;
import com.timp.test.MDR.DetalheTipoTributo.DetalheExcluirMassa;
import com.timp.test.MDR.DetalheTipoTributo.DetalheFiltroId;
import com.timp.test.MDR.DetalheTipoTributo.DetalheVisualizar;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoCriar;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoDetalhes;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoEditar;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoExcluir;
import com.timp.test.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoExcluirMassa;
import com.timp.test.MDR.Empresas.EmpresaEditar;
import com.timp.test.MDR.Empresas.EmpresasDetalhes;
import com.timp.test.MDR.Empresas.EmpresasFiltros;
import com.timp.test.MDR.Empresas.EmpresasVisualizar;
import com.timp.test.MDR.Filiais.FiliaisDetalle;
import com.timp.test.MDR.Filiais.FiliaisEditar;
import com.timp.test.MDR.Filiais.FiliaisVisualizar;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoCriar;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoDetalhes;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoEditar;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirMasas;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoFiltroAbansado;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoVisualizar;
import com.timp.test.MDR.ICMSSTTransporte.ICMSSTTransporteCriar;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaCriar;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaDetalhes;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaEditar;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaExcluir;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaFiltroID;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaFiltrosAvansados;
import com.timp.test.MDR.LimiteCompetencia.LimiteCompetenciaVisualizar;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriar;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisDetalhes;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluir;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluirEmMassa;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisVisualizar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTDetalle;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTEditar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluir;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluirMasas;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTFiltrosAvan;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTVisualizar;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsCriar;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsEditar;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsExcluir;
import com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsVisualizar;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisCriar;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisDetalhes;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisEditar;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisExcluir;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisExcluirMassa;
import com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisVisualizar;
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
import com.timp.test.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabilExcluir;

public class AutomacoesMDR2 extends TestBaseSteven {

	// Detalhe Tipo Tributo

	DetalheCriar detalheTipoTributoCriar;
	DetalheEditar detalheTipoTributoEditar;
	DetalheExcluir detalheTipoTributoExcluir;
	DetalheVisualizar detalheTipoTributoVisualizar;
	DetalheFiltroId detalheTipoTributoFiltroId;
	DetalheDetalhes detalheTipoTributoDetalhes;
	DetalheExcluirMassa detalheExcluirMassa;
	// Determinação de Tipo de Condição

	DeterminacaoDeTipoDeCondicaoCriar determinacaoDeTipoDeCondicaoCriar;
	DeterminacaoDeTipoDeCondicaoDetalhes determinacaoDeTipoDeCondicaoDetalhes;
	DeterminacaoDeTipoDeCondicaoEditar determinacaoDeTipoDeCondicaoEditar;
	DeterminacaoDeTipoDeCondicaoExcluir determinacaoDeTipoDeCondicaoExcluir;
	DeterminacaoDeTipoDeCondicaoExcluirMassa determinacaoDeTipoDeCondicaoExcluirMassa;

	// Empresas

	EmpresaEditar empresaEditar;
	EmpresasFiltros empresasFiltros;
	EmpresasVisualizar empresasVisualizar;
	EmpresasDetalhes empresasDetalhes;

	// Filiais

	FiliaisEditar filiaisEditar;
	FiliaisVisualizar filiaisVisualizar;
	FiliaisDetalle     filiaisDetalle;

	// Hierarquia De Cenarios De Correçao

	HierarquiaDeCenariosDeCorreçaoCriar hierarquiaDeCenariosDeCorreçaoCriar;
	HierarquiaDeCenariosDeCorreçaoDetalhes hierarquiaDeCenariosDeCorreçaoDetalhes;
	HierarquiaDeCenariosDeCorreçaoEditar hierarquiaDeCenariosDeCorreçaoEditar;
	HierarquiaDeCenariosDeCorreçaoVisualizar hierarquiaDeCenariosDeCorreçaoVisualizar;
	HierarquiaDeCenariosDeCorreçaoFiltroAbansado hierarquiaDeCenariosDeCorreçaoFiltroAbansado;
	HierarquiaDeCenariosDeCorreçaoExcluirMasas  hierarquiaDeCenariosDeCorreçaoExcluirMasas;

	// ICMS ST Transporte

	ICMSSTTransporteCriar iCMSSTTransporteCriar;

	// Límite de Competência

	LimiteCompetenciaCriar limiteCompetenciaCriar;
	LimiteCompetenciaDetalhes limiteCompetenciaDetalhes;
	LimiteCompetenciaEditar limiteCompetenciaEditar;
	LimiteCompetenciaExcluir limiteCompetenciaExcluir;
	LimiteCompetenciaVisualizar limiteCompetenciaVisualizar;
	LimiteCompetenciaFiltroID limiteCompetenciaFiltroID;
	LimiteCompetenciaFiltrosAvansados limiteCompetenciaFiltrosAvansados;

	// Livros Fiscais > Livros Fiscais

	LivrosFiscaisCriar livrosFiscaisCriar;
	LivrosFiscaisDetalhes livrosFiscaisDetalhes;
	LivrosFiscaisExcluir livrosFiscaisExcluir;
	LivrosFiscaisVisualizar livrosFiscaisVisualizar;
	LivrosFiscaisExcluirEmMassa livrosFiscaisExcluirEmMassa;

	// Livros Fiscais > Parametros Para Livro ICMS ST
	ParametrosParaLivroICMSSTCriar parametrosParaLivroICMSSTCriar;
	ParametrosParaLivroICMSSTEditar parametrosParaLivroICMSSTEditar;
	ParametrosParaLivroICMSSTDetalle parametrosParaLivroICMSSTDetalle;
	ParametrosParaLivroICMSSTVisualizar parametrosParaLivroICMSSTVisualizar;
	ParametrosParaLivroICMSSTExcluir parametrosParaLivroICMSSTExcluir;
	ParametrosParaLivroICMSSTExcluirMasas parametrosParaLivroICMSSTExcluirMasas;
	ParametrosParaLivroICMSSTFiltrosAvan parametrosParaLivroICMSSTFiltrosAvan;

	// Mapeamento De Relevancia Para Pis Cofins

	MapeamentoDeRelevanciaParaPisCofinsCriar mapeamentoDeRelevanciaParaPisCofinsCriar;
	MapeamentoDeRelevanciaParaPisCofinsEditar mapeamentoDeRelevanciaParaPisCofinsEditar;
	MapeamentoDeRelevanciaParaPisCofinsExcluir mapeamentoDeRelevanciaParaPisCofinsExcluir;
	MapeamentoDeRelevanciaParaPisCofinsVisualizar mapeamentoDeRelevanciaParaPisCofinsVisualizar;

	// Ocorrencia Fiscal.> Tipos De Objetos De Ocorrencias Fiscais

	TiposDeObjetosDeOcorrenciasFiscaisCriar tiposDeObjetosDeOcorrenciasFiscaisCriar;
	TiposDeObjetosDeOcorrenciasFiscaisDetalhes tiposDeObjetosDeOcorrenciasFiscaisDetalhes;
	TiposDeObjetosDeOcorrenciasFiscaisEditar tiposDeObjetosDeOcorrenciasFiscaisEditar;
	TiposDeObjetosDeOcorrenciasFiscaisExcluirMassa tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa;
	TiposDeObjetosDeOcorrenciasFiscaisExcluir tiposDeObjetosDeOcorrenciasFiscaisExcluir;
	TiposDeObjetosDeOcorrenciasFiscaisVisualizar tiposDeObjetosDeOcorrenciasFiscaisVisualizar;
	
	// Parâmetros de Contabilização > Contas Default Para Extemporaneo

	ContasDefaultParaExtemporaneoCriar contasDefaultParaExtemporaneoCriar;
	ContasDefaultParaExtemporaneoDetalhes contasDefaultParaExtemporaneoDetalhes;
	ContasDefaultParaExtemporaneoEditar contasDefaultParaExtemporaneoEditar;
	ContasDefaultParaExtemporaneoExcluir contasDefaultParaExtemporaneoExcluir;
	ContasDefaultParaExtemporaneoVisualizar contasDefaultParaExtemporaneoVisualizar;
	ContasDefaultParaExtemporaneoFiltroID contasDefaultParaExtemporaneoFiltroID;

	// Parâmetros de Contabilização > Contas Default Por Tributo

	ContasDefaultPorTributoCriar contasDefaultPorTributoCriar;
	ContasDefaultPorTributoDetalhes contasDefaultPorTributoDetalhes;
	ContasDefaultPorTributoEditar contasDefaultPorTributoEditar;
	ContasDefaultPorTributoExcluir contasDefaultPorTributoExcluir;
	ContasDefaultPorTributoVisualizar contasDefaultPorTributoVisualizar;

	// Parâmetros de Contabilização > Mapemaneto Contábil

	MapeamentoContabilCriar mapeamentoContabilCriar;
	MapeamentoContabilEditar mapeamentoContabilEditar;
	MapeamentoContabilExcluir mapeamentoContabilExcluir;

	

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

	@Test(priority = 1, dependsOnMethods = "detalheTipoTributoFiscalCriar" )
	public void detalheTipoTributoFiscalEditar() {

		detalheTipoTributoEditar = new DetalheEditar();
		detalheTipoTributoEditar.beforeClass();
		detalheTipoTributoEditar.login();
		detalheTipoTributoEditar.acessarMDR();
		detalheTipoTributoEditar.editar();
		detalheTipoTributoEditar.afterClass();

	}

	@Test(priority = 2, dependsOnMethods = "detalheTipoTributoFiscalCriar")
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
	
	@Test(priority = 3, dependsOnMethods = "detalheTipoTributoFiscalCriar")
	public void detalheTipoTributoDetalhes() {

		detalheTipoTributoDetalhes = new DetalheDetalhes();
		detalheTipoTributoDetalhes.beforeClass();
		detalheTipoTributoDetalhes.login();
		detalheTipoTributoDetalhes.acessarMDR();
		detalheTipoTributoDetalhes.detalhes();
		detalheTipoTributoDetalhes.afterClass();

	}


	@Test(priority = 5)
	public void detalheExcluirMassa() {

		detalheExcluirMassa = new DetalheExcluirMassa();
		detalheExcluirMassa.beforeClass();
		detalheExcluirMassa.login();
		detalheExcluirMassa.acessarMDR();
		detalheExcluirMassa.criar();
		detalheExcluirMassa.afterClass();

		}
	
	@Test(priority = 4, dependsOnMethods = "detalheTipoTributoFiscalCriar")
	public void detalheTipoTributoFiscalExcluir() {

		detalheTipoTributoExcluir = new DetalheExcluir();
		detalheTipoTributoExcluir.beforeClass();
		detalheTipoTributoExcluir.login();
		detalheTipoTributoExcluir.acessarMDR();
		detalheTipoTributoExcluir.excluir();
		detalheTipoTributoExcluir.afterClass();

		System.out.println("-------------------Detalhe Tipo Tributo Fin-------------------------");
	}

	// Determinação de Tipo de Condição

	@Test(priority = 6)
	public void determinacaoDeTipoDeCondicaoCriarCriar() {

		System.out.println("-------------------Determinação de Tipo de Condição-------------------------");

		determinacaoDeTipoDeCondicaoCriar = new DeterminacaoDeTipoDeCondicaoCriar();
		determinacaoDeTipoDeCondicaoCriar.beforeClass();
		determinacaoDeTipoDeCondicaoCriar.login();
		determinacaoDeTipoDeCondicaoCriar.acessarMDR();
		determinacaoDeTipoDeCondicaoCriar.criar();
		determinacaoDeTipoDeCondicaoCriar.afterClass();

	}

	@Test(priority = 7, dependsOnMethods = "determinacaoDeTipoDeCondicaoCriarCriar")
	public void determinacaoDeTipoDeCondicaoCriarEditar() {

		determinacaoDeTipoDeCondicaoEditar = new DeterminacaoDeTipoDeCondicaoEditar();
		determinacaoDeTipoDeCondicaoEditar.beforeClass();
		determinacaoDeTipoDeCondicaoEditar.login();
		determinacaoDeTipoDeCondicaoEditar.acessarMDR();
		determinacaoDeTipoDeCondicaoEditar.editar();
		determinacaoDeTipoDeCondicaoEditar.afterClass();

	}

	@Test(priority = 8, dependsOnMethods = "determinacaoDeTipoDeCondicaoCriarCriar")
	public void determinacaoDeTipoDeCondicaoCriarDetalhes() {

		determinacaoDeTipoDeCondicaoDetalhes = new DeterminacaoDeTipoDeCondicaoDetalhes();
		determinacaoDeTipoDeCondicaoDetalhes.beforeClass();
		determinacaoDeTipoDeCondicaoDetalhes.login();
		determinacaoDeTipoDeCondicaoDetalhes.acessarMDR();
		determinacaoDeTipoDeCondicaoDetalhes.Detalhes();
		determinacaoDeTipoDeCondicaoDetalhes.afterClass();

	}
	@Test(priority = 9)
	public void DeterminacaoDeTipoDeCondicaoExcluirMassa() {

		determinacaoDeTipoDeCondicaoExcluirMassa = new DeterminacaoDeTipoDeCondicaoExcluirMassa();
		determinacaoDeTipoDeCondicaoExcluirMassa.beforeClass();
		determinacaoDeTipoDeCondicaoExcluirMassa.login();
		determinacaoDeTipoDeCondicaoExcluirMassa.acessarMDR();
		determinacaoDeTipoDeCondicaoExcluirMassa.criar();
		determinacaoDeTipoDeCondicaoExcluirMassa.afterClass();

	}

	@Test(priority = 8, dependsOnMethods = "determinacaoDeTipoDeCondicaoCriarCriar")
	public void determinacaoDeTipoDeCondicaoCriarExcluir() {

		determinacaoDeTipoDeCondicaoExcluir = new DeterminacaoDeTipoDeCondicaoExcluir();
		determinacaoDeTipoDeCondicaoExcluir.beforeClass();
		determinacaoDeTipoDeCondicaoExcluir.login();
		determinacaoDeTipoDeCondicaoExcluir.acessarMDR();
		determinacaoDeTipoDeCondicaoExcluir.excluir();
		determinacaoDeTipoDeCondicaoExcluir.afterClass();

		System.out.println("-------------------Determinação de Tipo de Condição Fin-------------------------");
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

	
	}

	@Test(priority = 17)
	public void filiaisDetalle() {

		filiaisDetalle = new FiliaisDetalle();
		filiaisDetalle.beforeClass();
		filiaisDetalle.ingresar();
		filiaisDetalle.ingresarMDR();
		filiaisDetalle.detalle();
		filiaisDetalle.afterClass();

		System.out.println("-------------------Filiais Fin-------------------------");
	}
	// Hierarquia De Cenarios De Correção

	@Test(priority = 18)
	public void hierarquiaDeCenariosDeCorreçaoCriar() {

		System.out.println("-------------------Hierarquia De Cenarios De Correção-------------------------");

		hierarquiaDeCenariosDeCorreçaoCriar = new HierarquiaDeCenariosDeCorreçaoCriar();
		hierarquiaDeCenariosDeCorreçaoCriar.beforeClass();
		hierarquiaDeCenariosDeCorreçaoCriar.login();
		hierarquiaDeCenariosDeCorreçaoCriar.acessarMDR();
		hierarquiaDeCenariosDeCorreçaoCriar.criar();
		hierarquiaDeCenariosDeCorreçaoCriar.afterClass();

	}

	@Test(priority = 19, dependsOnMethods = "hierarquiaDeCenariosDeCorreçaoCriar")
	public void hierarquiaDeCenariosDeCorreçaoEditar() {

		hierarquiaDeCenariosDeCorreçaoEditar = new HierarquiaDeCenariosDeCorreçaoEditar();
		hierarquiaDeCenariosDeCorreçaoEditar.beforeClass();
		hierarquiaDeCenariosDeCorreçaoEditar.login();
		hierarquiaDeCenariosDeCorreçaoEditar.acessarMDR();
		hierarquiaDeCenariosDeCorreçaoEditar.editar();
		hierarquiaDeCenariosDeCorreçaoEditar.afterClass();

	}

	@Test(priority = 20, dependsOnMethods = "hierarquiaDeCenariosDeCorreçaoCriar")
	public void hierarquiaDeCenariosDeCorreçaoVisualizar() {

		hierarquiaDeCenariosDeCorreçaoVisualizar = new HierarquiaDeCenariosDeCorreçaoVisualizar();
		hierarquiaDeCenariosDeCorreçaoVisualizar.beforeClass();
		hierarquiaDeCenariosDeCorreçaoVisualizar.login();
		hierarquiaDeCenariosDeCorreçaoVisualizar.acessarMDR();
		hierarquiaDeCenariosDeCorreçaoVisualizar.visualizar();
		hierarquiaDeCenariosDeCorreçaoVisualizar.afterClass();

	}

	@Test(priority = 21,dependsOnMethods = "hierarquiaDeCenariosDeCorreçaoCriar")
	public void hierarquiaDeCenariosDeCorreçaoDetalhes() {

		hierarquiaDeCenariosDeCorreçaoDetalhes = new HierarquiaDeCenariosDeCorreçaoDetalhes();
		hierarquiaDeCenariosDeCorreçaoDetalhes.beforeClass();
		hierarquiaDeCenariosDeCorreçaoDetalhes.login();
		hierarquiaDeCenariosDeCorreçaoDetalhes.acessarMDR();
		hierarquiaDeCenariosDeCorreçaoDetalhes.Detalhes();
		hierarquiaDeCenariosDeCorreçaoDetalhes.afterClass();

	}
	
	@Test(priority = 22)
	public void hierarquiaDeCenariosDeCorreçaoFiltroAbansado() {

		hierarquiaDeCenariosDeCorreçaoFiltroAbansado = new HierarquiaDeCenariosDeCorreçaoFiltroAbansado();
		hierarquiaDeCenariosDeCorreçaoFiltroAbansado.beforeClass();
		hierarquiaDeCenariosDeCorreçaoFiltroAbansado.ingresar();
		hierarquiaDeCenariosDeCorreçaoFiltroAbansado.ingresarMDR();
		hierarquiaDeCenariosDeCorreçaoFiltroAbansado.Filtro();
		hierarquiaDeCenariosDeCorreçaoFiltroAbansado.afterClass();

		System.out.println("-------------------Hierarquia De Cenarios De Correção Fin-------------------------");

	}
	/*
	 * 
	 * @Test(priority = 22) public void hierarquiaDeCenariosDeCorreçaoExcluir() {
	 * 
	 * hierarquiaDeCenariosDeCorreçaoEliminar = new
	 * hierarquiaDeCenariosDeCorreçaoEliminar();
	 * hierarquiaDeCenariosDeCorreçaoEliminar.beforeClass();
	 * hierarquiaDeCenariosDeCorreçaoEliminar.login();
	 * hierarquiaDeCenariosDeCorreçaoEliminar.acessarMDR();
	 * hierarquiaDeCenariosDeCorreçaoEliminar.eliminar();
	 * hierarquiaDeCenariosDeCorreçaoEliminar.afterClass();
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
	 * println("-------------------Hierarquia De Cenarios De Correção-------------------------"
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

	// Límite de Competência

	@Test(priority = 31)
	public void limiteCompetenciaCriar() {

		System.out.println("-------------------Límite de Competência-------------------------");

		limiteCompetenciaCriar = new LimiteCompetenciaCriar();
		limiteCompetenciaCriar.beforeClass();
		limiteCompetenciaCriar.login();
		limiteCompetenciaCriar.acessarMDR();
		limiteCompetenciaCriar.criar();
		limiteCompetenciaCriar.afterClass();

	}

	@Test(priority = 32, dependsOnMethods = "limiteCompetenciaCriar")
	public void limiteCompetenciaEditar() {

		limiteCompetenciaEditar = new LimiteCompetenciaEditar();
		limiteCompetenciaEditar.beforeClass();
		limiteCompetenciaEditar.login();
		limiteCompetenciaEditar.acessarMDR();
		limiteCompetenciaEditar.editar();
		limiteCompetenciaEditar.afterClass();

	}

	@Test(priority = 33, dependsOnMethods = "limiteCompetenciaCriar")
	public void limiteCompetenciaVisualizar() {

		limiteCompetenciaVisualizar = new LimiteCompetenciaVisualizar();
		limiteCompetenciaVisualizar.beforeClass();
		limiteCompetenciaVisualizar.login();
		limiteCompetenciaVisualizar.acessarMDR();
		limiteCompetenciaVisualizar.visualizar();
		limiteCompetenciaVisualizar.afterClass();

	}

	@Test(priority = 34, dependsOnMethods = "limiteCompetenciaCriar")
	public void limiteCompetenciaDetalhes() {

		limiteCompetenciaDetalhes = new LimiteCompetenciaDetalhes();
		limiteCompetenciaDetalhes.beforeClass();
		limiteCompetenciaDetalhes.login();
		limiteCompetenciaDetalhes.acessarMDR();
		limiteCompetenciaDetalhes.detalhes();
		limiteCompetenciaDetalhes.afterClass();

	}
	
	@Test(priority = 35, dependsOnMethods = "limiteCompetenciaCriar")
	public void limiteCompetenciaFiltrosAvansados() {

		limiteCompetenciaFiltrosAvansados = new LimiteCompetenciaFiltrosAvansados();
		limiteCompetenciaFiltrosAvansados.beforeClass();
		limiteCompetenciaFiltrosAvansados.ingresar();
		limiteCompetenciaFiltrosAvansados.ingresarMDR();
		limiteCompetenciaFiltrosAvansados.Filtro();
		limiteCompetenciaFiltrosAvansados.afterClass();

	}
	
	@Test(priority = 36)
	public void limiteCompetenciaFiltroID() {

		limiteCompetenciaFiltroID = new LimiteCompetenciaFiltroID();
		limiteCompetenciaFiltroID.beforeClass();
		limiteCompetenciaFiltroID.login();
		limiteCompetenciaFiltroID.acessarMDR();
		limiteCompetenciaFiltroID.filtro();
		limiteCompetenciaFiltroID.afterClass();

	}

	@Test(priority = 37, dependsOnMethods = "limiteCompetenciaCriar")
	public void limiteCompetenciaExcluir() {

		limiteCompetenciaExcluir = new LimiteCompetenciaExcluir();
		limiteCompetenciaExcluir.beforeClass();
		limiteCompetenciaExcluir.login();
		limiteCompetenciaExcluir.acessarMDR();
		limiteCompetenciaExcluir.excluir();
		limiteCompetenciaExcluir.afterClass();

		System.out.println("-------------------Límite de Competência Fin-------------------------");
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

	
//	  @Test(priority = 38) public void livrosFiscaisEditar() {
//	 
//	  livrosFiscaisEditar = new livrosFiscaisEditar();
//	  livrosFiscaisEditar.beforeClass(); 
//	  livrosFiscaisEditar.login();
//	  livrosFiscaisEditar.acessarMDR(); 
//	  livrosFiscaisEditar.editar();
//	  livrosFiscaisEditar.afterClass();
//	  
//	 }
	
	@Test(priority = 39, dependsOnMethods = "livrosFiscaisCriar")
	public void livrosFiscaisVisualizar() {

		livrosFiscaisVisualizar = new LivrosFiscaisVisualizar();
		livrosFiscaisVisualizar.beforeClass();
		livrosFiscaisVisualizar.login();
		livrosFiscaisVisualizar.acessarMDR();
		livrosFiscaisVisualizar.visualizar();
		livrosFiscaisVisualizar.afterClass();

	}

	@Test(priority = 40, dependsOnMethods = "livrosFiscaisCriar")
	public void livrosFiscaisDetalhes() {

		livrosFiscaisDetalhes = new LivrosFiscaisDetalhes();
		livrosFiscaisDetalhes.beforeClass();
		livrosFiscaisDetalhes.login();
		livrosFiscaisDetalhes.acessarMDR();
		livrosFiscaisDetalhes.detalhes();
		livrosFiscaisDetalhes.afterClass();

	}

	@Test(priority = 41, dependsOnMethods = "livrosFiscaisCriar")
	public void livrosFiscaisExcluir() {

		livrosFiscaisExcluir = new LivrosFiscaisExcluir();
		livrosFiscaisExcluir.beforeClass();
		livrosFiscaisExcluir.login();
		livrosFiscaisExcluir.acessarMDR();
		livrosFiscaisExcluir.excluir();
		livrosFiscaisExcluir.afterClass();

	}

	@Test(priority = 42)
	public void livrosFiscaisExcluirEmMassa() {
		livrosFiscaisExcluirEmMassa = new LivrosFiscaisExcluirEmMassa();
		livrosFiscaisExcluirEmMassa.beforeClass();
		livrosFiscaisExcluirEmMassa.ingresar();
		livrosFiscaisExcluirEmMassa.mdrEntrar();
		livrosFiscaisExcluirEmMassa.excluirEmMassa();
		livrosFiscaisExcluirEmMassa.afterClass();
		
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

	}
	
	@Test(priority = 44, dependsOnMethods = "parametrosParaLivroICMSSTCriarCriar")
	public void parametrosParaLivroICMSSTEditar() {
		
		parametrosParaLivroICMSSTEditar = new ParametrosParaLivroICMSSTEditar();
		parametrosParaLivroICMSSTEditar.beforeClass();
		parametrosParaLivroICMSSTEditar.login();
		parametrosParaLivroICMSSTEditar.acessarMDR();
		parametrosParaLivroICMSSTEditar.editar();
		parametrosParaLivroICMSSTEditar.afterClass();

	}
	
	
	@Test(priority = 44, dependsOnMethods = "parametrosParaLivroICMSSTCriarCriar")
	public void parametrosParaLivroICMSSTDetalhes() {
		
		parametrosParaLivroICMSSTDetalle = new ParametrosParaLivroICMSSTDetalle();
		parametrosParaLivroICMSSTDetalle.beforeClass();
		parametrosParaLivroICMSSTDetalle.login();
		parametrosParaLivroICMSSTDetalle.acessarMDR();
		parametrosParaLivroICMSSTDetalle.detalhes();
		parametrosParaLivroICMSSTDetalle.afterClass();

	}
	
	
	@Test(priority = 45, dependsOnMethods = "parametrosParaLivroICMSSTCriarCriar")
	public void parametrosParaLivroICMSSTVisualizar() {
		
		parametrosParaLivroICMSSTVisualizar = new ParametrosParaLivroICMSSTVisualizar();
		parametrosParaLivroICMSSTVisualizar.beforeClass();
		parametrosParaLivroICMSSTVisualizar.login();
		parametrosParaLivroICMSSTVisualizar.acessarMDR();
		parametrosParaLivroICMSSTVisualizar.visualizar();
		parametrosParaLivroICMSSTVisualizar.afterClass();

	}
	
	
	@Test(priority = 46)
	public void parametrosParaLivroICMSSTFiltrosAvan() {
		
		parametrosParaLivroICMSSTFiltrosAvan = new ParametrosParaLivroICMSSTFiltrosAvan();
		parametrosParaLivroICMSSTFiltrosAvan.beforeClass();
		parametrosParaLivroICMSSTFiltrosAvan.login();
		parametrosParaLivroICMSSTFiltrosAvan.acessarMDR();
		parametrosParaLivroICMSSTFiltrosAvan.filtrosAvanzados();
		parametrosParaLivroICMSSTFiltrosAvan.afterClass();

	}
	
	@Test(priority = 47, dependsOnMethods = "parametrosParaLivroICMSSTCriarCriar")
	public void parametrosParaLivroICMSSTExcluir() {
		
		parametrosParaLivroICMSSTExcluir = new ParametrosParaLivroICMSSTExcluir();
		parametrosParaLivroICMSSTExcluir.beforeClass();
		parametrosParaLivroICMSSTExcluir.login();
		parametrosParaLivroICMSSTExcluir.acessarMDR();
		parametrosParaLivroICMSSTExcluir.Excluir();
		parametrosParaLivroICMSSTExcluir.afterClass();
		
	}
	
	@Test(priority = 47)
	public void parametrosParaLivroICMSSTExcluirEmMassa() {
		
		parametrosParaLivroICMSSTExcluirMasas = new ParametrosParaLivroICMSSTExcluirMasas();
		parametrosParaLivroICMSSTExcluirMasas.beforeClass();
		parametrosParaLivroICMSSTExcluirMasas.login();
		parametrosParaLivroICMSSTExcluirMasas.acessarMDR();
		parametrosParaLivroICMSSTExcluirMasas.criar();
		parametrosParaLivroICMSSTExcluirMasas.afterClass();
		
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

	@Test(priority = 50, dependsOnMethods = "mapeamentoDeRelevanciaParaPisCofinsCriar")
	public void mapeamentoDeRelevanciaParaPisCofinsEditar() {

		mapeamentoDeRelevanciaParaPisCofinsEditar = new MapeamentoDeRelevanciaParaPisCofinsEditar();
		mapeamentoDeRelevanciaParaPisCofinsEditar.beforeClass();
		mapeamentoDeRelevanciaParaPisCofinsEditar.login();
		mapeamentoDeRelevanciaParaPisCofinsEditar.acessarMDR();
		mapeamentoDeRelevanciaParaPisCofinsEditar.editar();
		mapeamentoDeRelevanciaParaPisCofinsEditar.afterClass();

	}

	@Test(priority = 51, dependsOnMethods = "mapeamentoDeRelevanciaParaPisCofinsCriar")
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
	@Test(priority = 53, dependsOnMethods = "mapeamentoDeRelevanciaParaPisCofinsCriar")
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

	@Test(priority = 56, dependsOnMethods = "tiposDeObjetosDeOcorrenciasFiscaisCriar")
	public void tiposDeObjetosDeOcorrenciasFiscaisEditar() {

		tiposDeObjetosDeOcorrenciasFiscaisEditar = new TiposDeObjetosDeOcorrenciasFiscaisEditar();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.beforeClass();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.login();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.acessarMDR();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.editar();
		tiposDeObjetosDeOcorrenciasFiscaisEditar.afterClass();

	}
	
	@Test(priority = 57)
	public void tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa() {

		tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa = new TiposDeObjetosDeOcorrenciasFiscaisExcluirMassa();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa.beforeClass();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa.login();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa.acessarMDR();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa.criar();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirMassa.afterClass();

	}

	@Test(priority = 56, dependsOnMethods = "tiposDeObjetosDeOcorrenciasFiscaisCriar")
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

	// Parâmetros de Contabilização > Contas Default Para Extemporaneo

	@Test(priority = 61)
	public void contasDefaultParaExtemporaneoCriar() {

		System.out.println(
				"-------------------Parâmetros de Contabilização > Contas Default Para Extemporaneo-------------------------");

		contasDefaultParaExtemporaneoCriar = new ContasDefaultParaExtemporaneoCriar();
		contasDefaultParaExtemporaneoCriar.beforeClass();
		contasDefaultParaExtemporaneoCriar.login();
		contasDefaultParaExtemporaneoCriar.acessarMDR();
		contasDefaultParaExtemporaneoCriar.criar();
		contasDefaultParaExtemporaneoCriar.afterClass();

	}

	@Test(priority = 62, dependsOnMethods = "contasDefaultParaExtemporaneoCriar")
	public void contasDefaultParaExtemporaneoEditar() {
		contasDefaultParaExtemporaneoEditar = new ContasDefaultParaExtemporaneoEditar();
		contasDefaultParaExtemporaneoEditar.beforeClass();
		contasDefaultParaExtemporaneoEditar.login();
		contasDefaultParaExtemporaneoEditar.acessarMDR();
		contasDefaultParaExtemporaneoEditar.editar();
		contasDefaultParaExtemporaneoEditar.afterClass();

	}

	@Test(priority = 63, dependsOnMethods = "contasDefaultParaExtemporaneoCriar")
	public void contasDefaultParaExtemporaneoVisualizar() {

		contasDefaultParaExtemporaneoVisualizar = new ContasDefaultParaExtemporaneoVisualizar();
		contasDefaultParaExtemporaneoVisualizar.beforeClass();
		contasDefaultParaExtemporaneoVisualizar.login();
		contasDefaultParaExtemporaneoVisualizar.acessarMDR();
		contasDefaultParaExtemporaneoVisualizar.Visualizar();
		contasDefaultParaExtemporaneoVisualizar.afterClass();

	}

	@Test(priority = 64, dependsOnMethods = "contasDefaultParaExtemporaneoCriar")
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

	@Test(priority = 65, dependsOnMethods = "contasDefaultParaExtemporaneoCriar")
	public void contasDefaultParaExtemporaneoExcluir() {

		contasDefaultParaExtemporaneoExcluir = new ContasDefaultParaExtemporaneoExcluir();
		contasDefaultParaExtemporaneoExcluir.beforeClass();
		contasDefaultParaExtemporaneoExcluir.login();
		contasDefaultParaExtemporaneoExcluir.acessarMDR();
		contasDefaultParaExtemporaneoExcluir.excluir();
		contasDefaultParaExtemporaneoExcluir.afterClass();

		System.out.println(
				"-------------------Parâmetros de Contabilização > Contas Default Para Extemporaneo Fin-------------------------");
	}

	// 67

	// Parâmetros de Contabilização > Contas Default Por Tributo

	@Test(priority = 67)
	public void contasDefaultPorTributoCriar() {

		System.out.println(
				"-------------------Parâmetros de Contabilização > Contas Default Por Tributo-------------------------");

		contasDefaultPorTributoCriar = new ContasDefaultPorTributoCriar();
		contasDefaultPorTributoCriar.beforeClass();
		contasDefaultPorTributoCriar.login();
		contasDefaultPorTributoCriar.acessarMDR();
		contasDefaultPorTributoCriar.criar();
		contasDefaultPorTributoCriar.afterClass();

	}

	@Test(priority = 68, dependsOnMethods = "contasDefaultPorTributoCriar")
	public void contasDefaultPorTributoEditar() {

		contasDefaultPorTributoEditar = new ContasDefaultPorTributoEditar();
		contasDefaultPorTributoEditar.beforeClass();
		contasDefaultPorTributoEditar.login();
		contasDefaultPorTributoEditar.acessarMDR();
		contasDefaultPorTributoEditar.editar();
		contasDefaultPorTributoEditar.afterClass();

	}

	@Test(priority = 69, dependsOnMethods = "contasDefaultPorTributoCriar")
	public void contasDefaultPorTributoVisualizar() {

		contasDefaultPorTributoVisualizar = new ContasDefaultPorTributoVisualizar();
		contasDefaultPorTributoVisualizar.beforeClass();
		contasDefaultPorTributoVisualizar.login();
		contasDefaultPorTributoVisualizar.acessarMDR();
		contasDefaultPorTributoVisualizar.Visualizar();
		contasDefaultPorTributoVisualizar.afterClass();

	}

	@Test(priority = 70, dependsOnMethods = "contasDefaultPorTributoCriar")
	public void contasDefaultPorTributoDetalhes() {

		contasDefaultPorTributoDetalhes = new ContasDefaultPorTributoDetalhes();
		contasDefaultPorTributoDetalhes.beforeClass();
		contasDefaultPorTributoDetalhes.login();
		contasDefaultPorTributoDetalhes.acessarMDR();
		contasDefaultPorTributoDetalhes.Detalhes();
		contasDefaultPorTributoDetalhes.afterClass();

	}

	@Test(priority = 71, dependsOnMethods = "contasDefaultPorTributoCriar")
	public void contasDefaultPorTributoExcluir() {

		contasDefaultPorTributoExcluir = new ContasDefaultPorTributoExcluir();
		contasDefaultPorTributoExcluir.beforeClass();
		contasDefaultPorTributoExcluir.login();
		contasDefaultPorTributoExcluir.acessarMDR();
		contasDefaultPorTributoExcluir.excluir();
		contasDefaultPorTributoExcluir.afterClass();

		System.out.println(
				"-------------------Parâmetros de Contabilização > Contas Default Por Tributo Fin-------------------------");
	}

	// 72

	@Test(priority = 72)
	public void mapeamentoContabilCriar() {

		System.out.println(
				"-------------------Parâmetros de Contabilização > Mapemaneto Contábil-------------------------");

		mapeamentoContabilCriar = new MapeamentoContabilCriar();
		mapeamentoContabilCriar.beforeClass();
		mapeamentoContabilCriar.login();
		mapeamentoContabilCriar.acessarMDR();
		mapeamentoContabilCriar.criar();
		mapeamentoContabilCriar.afterClass();

	}

	@Test(priority = 73, dependsOnMethods = "mapeamentoContabilCriar")
	public void mapeamentoContabilEditar() {

		mapeamentoContabilEditar = new MapeamentoContabilEditar();
		mapeamentoContabilEditar.beforeClass();
		mapeamentoContabilEditar.login();
		mapeamentoContabilEditar.acessarMDR();
		mapeamentoContabilEditar.editar();
		mapeamentoContabilEditar.afterClass();

	}

	@Test(priority = 74, dependsOnMethods = "mapeamentoContabilCriar")
	public void mapeamentoContabilExcluir() {

		mapeamentoContabilExcluir = new MapeamentoContabilExcluir();
		mapeamentoContabilExcluir.beforeClass();
		mapeamentoContabilExcluir.login();
		mapeamentoContabilExcluir.acessarMDR();
		mapeamentoContabilExcluir.excluir();
		mapeamentoContabilExcluir.afterClass();

		System.out.println(
				"-------------------Parâmetros de Contabilização > Mapemaneto Contábil Fin-------------------------");
	}


}
