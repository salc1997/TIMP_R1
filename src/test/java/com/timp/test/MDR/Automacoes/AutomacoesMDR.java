package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosDetalhesPO;
import com.timp.test.ADM.LoginBRB;
import com.timp.test.BRB.*;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesCriar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesDetalhes;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesEditar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesExcluir;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesVisualizar;
import com.timp.test.MDR.Antecipacao.AntecipacaoCriar;
import com.timp.test.MDR.Antecipacao.AntecipacaoEditar;
import com.timp.test.MDR.Antecipacao.AntecipacaoEliminar;
import com.timp.test.MDR.Antecipacao.AntecipacaoFiltros;
import com.timp.test.MDR.Antecipacao.AntecipacaoVisualizar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioCriar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioDetalhes;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioEditar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioExcluir;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioVisualizar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeCriar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeEditar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeEliminar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeFiltro;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeVisualizar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeCriar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeEditar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeVisualizar;
import com.timp.test.MDR.CadastroCondiçao.*;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoCriar;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoEditar;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoFiltros;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoVisualizar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstitucaoVisualizar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoCriar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoEditar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoExcluir;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURExcluir;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoCriar;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoEditar;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoExcluir;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoFiltrosAvanzados;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoVisualizar;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoCriar;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoEditar;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoExcluir;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoFiltros;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoVisualizar;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoCriar;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoFiltros;
import com.timp.test.MDR.Centralizacao.Tributos.TributosCriar;
import com.timp.test.MDR.Centralizacao.Tributos.TributosDetalhes;
import com.timp.test.MDR.Centralizacao.Tributos.TributosEditar;
import com.timp.test.MDR.Centralizacao.Tributos.TributosExcluir;
import com.timp.test.MDR.Centralizacao.Tributos.TributosVisualizar;
import com.timp.test.MDR.Empresas.EmpresaEditar;
import com.timp.test.MDR.Empresas.EmpresasFiltros;
import com.timp.test.MDR.Empresas.EmpresasVisualizar;
import com.timp.test.MDR.Filiais.FiliaisEditar;
import com.timp.test.MDR.Filiais.FiliaisVisualizar;

public class AutomacoesMDR extends TestBaseSteven {

	// empresa
	EmpresaEditar empresaEditar;
	EmpresasVisualizar empresaVisualizar;
	EmpresasFiltros empresasFiltros;

	// Filiais
	FiliaisEditar filiaisEditar;
	FiliaisVisualizar filiaisVisualizar;

	// Ajustes > Código Ajustes
	CodigosAjustesCriar codigosAjustesCriar;
	CodigosAjustesDetalhes codigosAjustesDetalhes;
	CodigosAjustesEditar codigosAjustesEditar;
	CodigosAjustesExcluir codigosAjustesExcluir;
	CodigosAjustesVisualizar codigosAjustesVisualizar;

	// Antecipação

	AntecipacaoCriar antecipacaoCriar;
	AntecipacaoEditar antecipacaoEditar;
	AntecipacaoFiltros antecipacaoFiltros;
	AntecipacaoVisualizar antecipacaoVisualizar;
	AntecipacaoEliminar antecipacaoEliminar;

	// Ativação para Município

	AtivaçaoParaMunicipioCriar ativaçaoParaMunicipioCriar;
	AtivaçaoParaMunicipioEditar ativaçaoParaMunicipioEditar;
	AtivaçaoParaMunicipioDetalhes ativaçaoParaMunicipioDetalhes;
	AtivaçaoParaMunicipioVisualizar ativaçaoParaMunicipioVisualizar;
	AtivaçaoParaMunicipioExcluir ativaçaoParaMunicipioExcluir;

	// Atividades Fiscais > Atividades Fiscais

	AtividadeCriar atividadeCriar;
	AtividadeEditar atividadeEditar;
	AtividadeEliminar atividadeEliminar;
	AtividadeFiltro atividadeFiltro;
	AtividadeVisualizar atividadeVisualizar;

	// Atividades Fiscais > Grupo Atividades Fiscais

	GrupoAtividadeCriar grupoAtividadeCriar;
	GrupoAtividadeEditar grupoAtividadeEditar;
	GrupoAtividadeVisualizar grupoAtividadeVisualizar;

	// Cadastro da Condição

	CadastroCondicaoCriar cadastroCondicaoCriar;
	CadasatroCondicaoVisualizar cadasatroCondicaoVisualizar;
	CadastroCondicaoEditar cadastroCondicaoEditar;
	CadastroCondicaoExcluir cadastroCondicaoExcluir;

	// Cadastro Derex > Responsavél Pelo Movimento
	ResponsavelMovimentoCriar cadastroresponsavelPeloMovimentoCriar;
	ResponsavelMovimentoEditar cadastroresponsavelPeloMovimentoEditar;
	ResponsavelMovimentoFiltros cadastroresponsavelPeloMovimentoFiltros;
	ResponsavelMovimentoVisualizar cadastroresponsavelPeloMovimentoVisualizar;

	// Cadastro Derex > Instituição Financeira
	InstituicaoCriar instituicaoCriar;
	InstitucaoVisualizar instituicaoVisualizar;
	InstituicaoEditar instituicaoEditar;
	InstituicaoExcluir instituicaoExcluir;

	// Cadastros IRPJ/CSLL > Contas ParteB LALUR/LACS

	ContasParteBLALURCriar contasParteBLALURCriar;
	ContasParteBLALURExcluir contasParteBLALURExcluir;

	// Cenarios de Correção

	CenariosCorrecaoCriar cenariosCorrecaoCriar;
	CenariosCorrecaoEditar cenariosCorrecaoEditar;
	CenariosCorrecaoFiltrosAvanzados cenariosCorrecaoFiltrosAvanzados;
	CenariosCorrecaoVisualizar cenariosCorrecaoVisualizar;
	CenariosCorrecaoExcluir cenariosCorrecaoExcluir;

	// Centralização > Estorno Crédito

	EstornoCreditoCriar estornoCreditoCriar;
	EstornoCreditoEditar estornoCreditoEditar;
	EstornoCreditoExcluir estornoCreditoExcluir;
	EstornoCreditoFiltros estornoCreditoFiltros;
	EstornoCreditoVisualizar estornoCreditoVisualizar;

	// Fator de Crecimento do CIAP
	FatorCreditamentoCriar fatorCreditamentoCriar;
	FatorCreditamentoFiltros fatorCreditamentoFiltros;

	TributosCriar tributosCriar;
	TributosDetalhes tributosDetalhes;
	TributosEditar tributosEditar;
	TributosVisualizar tributosVisualizar;
	TributosExcluir tributosExcluir;

	// --------------------------------------------------------------------------------------------------

	// Empresa

	@Test(priority = 0)
	public void empresaEditar() {
		System.out.println("-------------------Empresa-------------------------");
		empresaEditar = new EmpresaEditar();
		empresaEditar.beforeClass();
		empresaEditar.login();
		empresaEditar.acessarMDR();
		empresaEditar.editar();
		empresaEditar.afterClass();

	}

	@Test(priority = 1)
	public void empresaVisualizar() {

		empresaVisualizar = new EmpresasVisualizar();
		empresaVisualizar.beforeClass();
		empresaVisualizar.login();
		empresaVisualizar.acessarMDR();
		empresaVisualizar.visualizar();
		empresaVisualizar.afterClass();

	}

	@Test(priority = 2)
	public void empresaFiltrosAvanzados() {
		/*
		 * empresaVisualizar = new EmpresasVisualizar();
		 * empresaVisualizar.beforeClass(); empresaVisualizar.login();
		 * empresaVisualizar.acessarMDR(); empresaVisualizar.visualizar();
		 */
		System.out.println("-------------------Empresa Fin-------------------------");

	}

	// Filias

	@Test(priority = 3)
	public void filiaisEditar() {
		System.out.println("-------------------Filiais-------------------------");
		filiaisEditar = new FiliaisEditar();
		filiaisEditar.beforeClass();
		filiaisEditar.login();
		filiaisEditar.acessarMDR();
		filiaisEditar.editar();
		filiaisEditar.afterClass();

	}

	@Test(priority = 4)
	public void filiaisVisualizar() {

		filiaisVisualizar = new FiliaisVisualizar();
		filiaisVisualizar.beforeClass();
		filiaisVisualizar.login();
		filiaisVisualizar.acessarMDR();
		filiaisVisualizar.visualizar();
		filiaisVisualizar.afterClass();

		System.out.println("-------------------Filiais Fin-------------------------");
	}

	// Ajustes > Código Ajustes

	@Test(priority = 5)
	public void codigosAjusteCriar() {

		System.out.println("-------------------Código Ajustes-------------------------");

		codigosAjustesCriar = new CodigosAjustesCriar();
		codigosAjustesCriar.beforeClass();
		codigosAjustesCriar.login();
		codigosAjustesCriar.acessarMDR();
		codigosAjustesCriar.criar();
		codigosAjustesCriar.afterClass();

	}

	@Test(priority = 6)
	public void codigosAjustesVisualizar() {

		codigosAjustesVisualizar = new CodigosAjustesVisualizar();
		codigosAjustesVisualizar.beforeClass();
		codigosAjustesVisualizar.login();
		codigosAjustesVisualizar.acessarMDR();
		codigosAjustesVisualizar.visualizar();
		codigosAjustesVisualizar.afterClass();

	}

	@Test(priority = 7)
	public void codigosAjustesEditar() {

		codigosAjustesEditar = new CodigosAjustesEditar();
		codigosAjustesEditar.beforeClass();
		codigosAjustesEditar.login();
		codigosAjustesEditar.acessarMDR();
		codigosAjustesEditar.editar();
		codigosAjustesEditar.afterClass();

	}

	@Test(priority = 8)
	public void codigosAjustesDetalhes() {

		codigosAjustesDetalhes = new CodigosAjustesDetalhes();
		codigosAjustesDetalhes.beforeClass();
		codigosAjustesDetalhes.login();
		codigosAjustesDetalhes.acessarMDR();
		codigosAjustesDetalhes.detalhes();
		codigosAjustesDetalhes.afterClass();

	}

	@Test(priority = 9)
	public void codigosAjustesExcluir() {

		codigosAjustesExcluir = new CodigosAjustesExcluir();
		codigosAjustesExcluir.beforeClass();
		codigosAjustesExcluir.login();
		codigosAjustesExcluir.acessarMDR();
		codigosAjustesExcluir.excluir();
		codigosAjustesExcluir.afterClass();

		System.out.println("-------------------Ajustes > Código Ajustes Fin-------------------------");
	}

	// Antecipacao

	@Test(priority = 10)
	public void antecipacaoCriar() {

		System.out.println("-------------------Antecipação-------------------------");

		antecipacaoCriar = new AntecipacaoCriar();
		antecipacaoCriar.beforeClass();
		antecipacaoCriar.login();
		antecipacaoCriar.acessarMDR();
		antecipacaoCriar.criar();
		antecipacaoCriar.afterClass();

	}

	@Test(priority = 11)
	public void antecipacaoEditar() {

		antecipacaoEditar = new AntecipacaoEditar();
		antecipacaoEditar.beforeClass();
		antecipacaoEditar.login();
		antecipacaoEditar.acessarMDR();
		antecipacaoEditar.editar();
		antecipacaoEditar.afterClass();

	}

	@Test(priority = 12)
	public void antecipacaoVisualizar() {

		antecipacaoVisualizar = new AntecipacaoVisualizar();
		antecipacaoVisualizar.beforeClass();
		antecipacaoVisualizar.login();
		antecipacaoVisualizar.acessarMDR();
		antecipacaoVisualizar.visualizar();
		antecipacaoVisualizar.afterClass();

	}

	@Test(priority = 13)
	public void antecipacaoFiltros() {

		antecipacaoFiltros = new AntecipacaoFiltros();
		antecipacaoFiltros.beforeClass();
		antecipacaoFiltros.login();
		antecipacaoFiltros.acessarMDR();
		antecipacaoFiltros.filtros();
		antecipacaoFiltros.afterClass();

	}

	@Test(priority = 14)
	public void antecipacaoExcluir() {

		antecipacaoEliminar = new AntecipacaoEliminar();
		antecipacaoEliminar.beforeClass();
		antecipacaoEliminar.login();
		antecipacaoEliminar.acessarMDR();
		antecipacaoEliminar.excluir();
		antecipacaoEliminar.afterClass();

		System.out.println("-------------------Antecipacão Fin-------------------------");
	}

	// Ativação para Município

	@Test(priority = 15)
	public void ativacaoParaMunicipioCriar() {

		System.out.println("-------------------Ativação para Município-------------------------");

		ativaçaoParaMunicipioCriar = new AtivaçaoParaMunicipioCriar();
		ativaçaoParaMunicipioCriar.beforeClass();
		ativaçaoParaMunicipioCriar.login();
		ativaçaoParaMunicipioCriar.acessarMDR();
		ativaçaoParaMunicipioCriar.criar();
		ativaçaoParaMunicipioCriar.afterClass();

	}

	@Test(priority = 16)
	public void ativacaoParaMunicipioEditar() {

		ativaçaoParaMunicipioEditar = new AtivaçaoParaMunicipioEditar();
		ativaçaoParaMunicipioEditar.beforeClass();
		ativaçaoParaMunicipioEditar.login();
		ativaçaoParaMunicipioEditar.acessarMDR();
		ativaçaoParaMunicipioEditar.editar();
		ativaçaoParaMunicipioEditar.afterClass();

	}

	@Test(priority = 17)
	public void ativacaoParaMunicipioVisualizar() {

		ativaçaoParaMunicipioVisualizar = new AtivaçaoParaMunicipioVisualizar();
		ativaçaoParaMunicipioVisualizar.beforeClass();
		ativaçaoParaMunicipioVisualizar.login();
		ativaçaoParaMunicipioVisualizar.acessarMDR();
		ativaçaoParaMunicipioVisualizar.visualizar();
		ativaçaoParaMunicipioVisualizar.afterClass();

	}

	@Test(priority = 18)
	public void ativacaoParaMunicipioDetalhes() {

		ativaçaoParaMunicipioDetalhes = new AtivaçaoParaMunicipioDetalhes();
		ativaçaoParaMunicipioDetalhes.beforeClass();
		ativaçaoParaMunicipioDetalhes.login();
		ativaçaoParaMunicipioDetalhes.acessarMDR();
		ativaçaoParaMunicipioDetalhes.detalhes();
		ativaçaoParaMunicipioDetalhes.afterClass();

	}

	@Test(priority = 19)
	public void ativacaoParaMunicipioExcluir() {

		ativaçaoParaMunicipioExcluir = new AtivaçaoParaMunicipioExcluir();
		ativaçaoParaMunicipioExcluir.beforeClass();
		ativaçaoParaMunicipioExcluir.login();
		ativaçaoParaMunicipioExcluir.acessarMDR();
		ativaçaoParaMunicipioExcluir.excluir();
		ativaçaoParaMunicipioExcluir.afterClass();

		System.out.println("-------------------Ativação para Município Fin-------------------------");
	}

	// Atividades Fiscais > Atividades Fiscais

	@Test(priority = 20)
	public void atividadeFiscalCriar() {

		System.out.println("-------------------Atividade Fiscal > Atividade Fiscal-------------------------");

		atividadeCriar = new AtividadeCriar();
		atividadeCriar.beforeClass();
		atividadeCriar.login();
		atividadeCriar.acessarMDR();
		atividadeCriar.criar();
		atividadeCriar.afterClass();

	}

	@Test(priority = 21)
	public void atividadeFiscalEditar() {

		atividadeEditar = new AtividadeEditar();
		atividadeEditar.beforeClass();
		atividadeEditar.login();
		atividadeEditar.acessarMDR();
		atividadeEditar.editar();
		atividadeEditar.afterClass();

	}

	@Test(priority = 22)
	public void atividadeFiscalVisualizar() {

		atividadeVisualizar = new AtividadeVisualizar();
		atividadeVisualizar.beforeClass();
		atividadeVisualizar.login();
		atividadeVisualizar.acessarMDR();
		atividadeVisualizar.visualizar();
		atividadeVisualizar.afterClass();

	}

	@Test(priority = 23)
	public void atividadeFiscalFiltro() {

		atividadeFiltro = new AtividadeFiltro();
		atividadeFiltro.beforeClass();
		atividadeFiltro.login();
		atividadeFiltro.acessarMDR();
		atividadeFiltro.filtro();
		atividadeFiltro.afterClass();

	}

	@Test(priority = 24)
	public void atividadeFiscalExcluir() {

		atividadeEliminar = new AtividadeEliminar();
		atividadeEliminar.beforeClass();
		atividadeEliminar.login();
		atividadeEliminar.acessarMDR();
		atividadeEliminar.eliminar();
		atividadeEliminar.afterClass();

		System.out.println("-------------------Atividade Fiscal > Atividade Fiscal Fin-------------------------");
	}

	// Atividades Fiscais > Grupo Atividades Fiscais

	@Test(priority = 25)
	public void grupoAtividadeFiscalCriar() {

		System.out.println("-------------------Atividade Fiscal > Grupo Atividade Fiscal-------------------------");

		grupoAtividadeCriar = new GrupoAtividadeCriar();
		grupoAtividadeCriar.beforeClass();
		grupoAtividadeCriar.login();
		grupoAtividadeCriar.acessarMDR();
		grupoAtividadeCriar.criar();
		grupoAtividadeCriar.afterClass();

	}

	@Test(priority = 26)
	public void grupoAtividadeFiscalEditar() {

		grupoAtividadeEditar = new GrupoAtividadeEditar();
		grupoAtividadeEditar.beforeClass();
		grupoAtividadeEditar.login();
		grupoAtividadeEditar.acessarMDR();
		grupoAtividadeEditar.editar();
		grupoAtividadeEditar.afterClass();

	}

	@Test(priority = 27)
	public void grupoAtividadeFiscalVisualizar() {

		grupoAtividadeVisualizar = new GrupoAtividadeVisualizar();
		grupoAtividadeVisualizar.beforeClass();
		grupoAtividadeVisualizar.login();
		grupoAtividadeVisualizar.acessarMDR();
		grupoAtividadeVisualizar.visualizar();
		grupoAtividadeVisualizar.afterClass();

		System.out.println("-------------------Atividade Fiscal > Grupo Atividade Fiscal Fin-------------------------");
	}

	// Cadastro da Condição

	@Test(priority = 28)
	public void cadastroCondicaoCriar() {

		System.out.println("-------------------Cadastro da Condição-------------------------");

		cadastroCondicaoCriar = new CadastroCondicaoCriar();
		cadastroCondicaoCriar.beforeClass();
		cadastroCondicaoCriar.login();
		cadastroCondicaoCriar.acessarMDR();
		cadastroCondicaoCriar.criar();
		cadastroCondicaoCriar.afterClass();

	}

	@Test(priority = 29)
	public void cadastroCondicaoEditar() {

		cadastroCondicaoEditar = new CadastroCondicaoEditar();
		cadastroCondicaoEditar.beforeClass();
		cadastroCondicaoEditar.login();
		cadastroCondicaoEditar.acessarMDR();
		cadastroCondicaoEditar.editar();
		cadastroCondicaoEditar.afterClass();

	}

	@Test(priority = 30)
	public void cadastroCondicaoVisualizar() {

		cadasatroCondicaoVisualizar = new CadasatroCondicaoVisualizar();
		cadasatroCondicaoVisualizar.beforeClass();
		cadasatroCondicaoVisualizar.login();
		cadasatroCondicaoVisualizar.acessarMDR();
		cadasatroCondicaoVisualizar.visualizar();
		cadasatroCondicaoVisualizar.afterClass();

	}

	@Test(priority = 31)
	public void cadastroCondicaoExcluir() {

		cadastroCondicaoExcluir = new CadastroCondicaoExcluir();
		cadastroCondicaoExcluir.beforeClass();
		cadastroCondicaoExcluir.login();
		cadastroCondicaoExcluir.acessarMDR();
		cadastroCondicaoExcluir.Excluir();
		cadastroCondicaoExcluir.afterClass();

		System.out.println("-------------------Cadastro da Condição Fin-------------------------");
	}

	// Cadastro Derex > Insituição Financeira

	@Test(priority = 32)
	public void instituicaoFinanceiraCriar() {

		System.out.println("-------------------Cadastro Derex > Insituição Financeira-------------------------");

		instituicaoCriar = new InstituicaoCriar();
		instituicaoCriar.beforeClass();
		instituicaoCriar.login();
		instituicaoCriar.acessarMDR();
		instituicaoCriar.criar();
		instituicaoCriar.afterClass();

	}

	@Test(priority = 33)
	public void instituicaoFinanceiraEditar() {

		instituicaoEditar = new InstituicaoEditar();
		instituicaoEditar.beforeClass();
		instituicaoEditar.login();
		instituicaoEditar.acessarMDR();
		instituicaoEditar.editar();
		instituicaoEditar.afterClass();

	}

	@Test(priority = 34)
	public void instituicaoFinanceiraVisualizar() {

		instituicaoVisualizar = new InstitucaoVisualizar();
		instituicaoVisualizar.beforeClass();
		instituicaoVisualizar.login();
		instituicaoVisualizar.acessarMDR();
		instituicaoVisualizar.visualizar();
		instituicaoVisualizar.afterClass();

	}

//Cadastro Derex > Cadastro Responsável Pelo Movimento

	@Test(priority = 35)
	public void cadastroResponsavelPeloMovimentoCriar() {

		System.out.println(
				"-------------------Cadastro Derex > Cadastro Responsável Pelo Movimento-------------------------");

		cadastroresponsavelPeloMovimentoCriar = new ResponsavelMovimentoCriar();
		cadastroresponsavelPeloMovimentoCriar.beforeClass();
		cadastroresponsavelPeloMovimentoCriar.login();
		cadastroresponsavelPeloMovimentoCriar.acessarMDR();
		cadastroresponsavelPeloMovimentoCriar.criar();
		cadastroresponsavelPeloMovimentoCriar.afterClass();

	}

	@Test(priority = 36)
	public void cadastroResponsavelPeloMovimentoEditar() {

		cadastroresponsavelPeloMovimentoEditar = new ResponsavelMovimentoEditar();
		cadastroresponsavelPeloMovimentoEditar.beforeClass();
		cadastroresponsavelPeloMovimentoEditar.login();
		cadastroresponsavelPeloMovimentoEditar.acessarMDR();
		cadastroresponsavelPeloMovimentoEditar.editar();
		cadastroresponsavelPeloMovimentoEditar.afterClass();

	}

	@Test(priority = 37)
	public void cadastroResponsavelPeloMovimentoVisualizar() {

		cadastroresponsavelPeloMovimentoVisualizar = new ResponsavelMovimentoVisualizar();
		cadastroresponsavelPeloMovimentoVisualizar.beforeClass();
		cadastroresponsavelPeloMovimentoVisualizar.login();
		cadastroresponsavelPeloMovimentoVisualizar.acessarMDR();
		cadastroresponsavelPeloMovimentoVisualizar.visualizar();
		cadastroresponsavelPeloMovimentoVisualizar.afterClass();

	}

	@Test(priority = 38)
	public void cadastroResponsavelPeloMovimentoFiltro() {

		cadastroresponsavelPeloMovimentoFiltros = new ResponsavelMovimentoFiltros();
		cadastroresponsavelPeloMovimentoFiltros.beforeClass();
		cadastroresponsavelPeloMovimentoFiltros.login();
		cadastroresponsavelPeloMovimentoFiltros.acessarMDR();
		cadastroresponsavelPeloMovimentoFiltros.filtros();
		cadastroresponsavelPeloMovimentoFiltros.afterClass();

		System.out.println(
				"-------------------Cadastro Derex > Cadastro Responsável Pelo Movimento Fin-------------------------");

	}

	@Test(priority = 39)
	public void instituicaoFinanceiraExcluir() {

		instituicaoExcluir = new InstituicaoExcluir();
		instituicaoExcluir.beforeClass();
		instituicaoExcluir.login();
		instituicaoExcluir.acessarMDR();
		instituicaoExcluir.excluir();
		instituicaoExcluir.afterClass();

		System.out.println("-------------------Cadastro Derex > Insituição Financeira Fin-------------------------");

	}

	// Cadastros IRPJ/CSLL > Contas ParteB LALUR/LACS

	@Test(priority = 40)
	public void contasParteBLALURCriarFiscalCriar() {

		System.out
				.println("-------------------Cadastros IRPJ/CSLL > Contas ParteB LALUR/LACS-------------------------");

		contasParteBLALURCriar = new ContasParteBLALURCriar();
		contasParteBLALURCriar.beforeClass();
		contasParteBLALURCriar.login();
		contasParteBLALURCriar.acessarMDR();
		contasParteBLALURCriar.criar();
		contasParteBLALURCriar.afterClass();

	}

	@Test(priority = 41)
	public void contasParteBLALURCriarFiscalExcluir() {

		contasParteBLALURExcluir = new ContasParteBLALURExcluir();
		contasParteBLALURExcluir.beforeClass();
		contasParteBLALURExcluir.login();
		contasParteBLALURExcluir.acessarMDR();
		contasParteBLALURExcluir.excluir();
		contasParteBLALURExcluir.afterClass();

		System.out.println(
				"-------------------Cadastros IRPJ/CSLL > Contas ParteB LALUR/LACS Fin-------------------------");

	}

	// Cenários de Correcão

	@Test(priority = 42)
	public void cenarioCorrecaoCriar() {

		System.out.println("-------------------Cenários de Correcão-------------------------");

		cenariosCorrecaoCriar = new CenariosCorrecaoCriar();
		cenariosCorrecaoCriar.beforeClass();
		cenariosCorrecaoCriar.login();
		cenariosCorrecaoCriar.acessarMDR();
		cenariosCorrecaoCriar.criar();
		cenariosCorrecaoCriar.afterClass();

	}

	@Test(priority = 43)
	public void cenarioCorrecaoEditar() {

		cenariosCorrecaoEditar = new CenariosCorrecaoEditar();
		cenariosCorrecaoEditar.beforeClass();
		cenariosCorrecaoEditar.login();
		cenariosCorrecaoEditar.acessarMDR();
		cenariosCorrecaoEditar.editar();
		cenariosCorrecaoEditar.afterClass();

	}

	@Test(priority = 44)
	public void cenarioCorrecaoVisualizar() {

		cenariosCorrecaoVisualizar = new CenariosCorrecaoVisualizar();
		cenariosCorrecaoVisualizar.beforeClass();
		cenariosCorrecaoVisualizar.login();
		cenariosCorrecaoVisualizar.acessarMDR();
		cenariosCorrecaoVisualizar.visualizar();
		cenariosCorrecaoVisualizar.afterClass();

	}

	@Test(priority = 45)
	public void cenarioCorrecaoFiltro() {

		cenariosCorrecaoFiltrosAvanzados = new CenariosCorrecaoFiltrosAvanzados();
		cenariosCorrecaoFiltrosAvanzados.beforeClass();
		cenariosCorrecaoFiltrosAvanzados.login();
		cenariosCorrecaoFiltrosAvanzados.acessarMDR();
		cenariosCorrecaoFiltrosAvanzados.filtros();
		cenariosCorrecaoFiltrosAvanzados.afterClass();

	}

	@Test(priority = 46)
	public void cenarioCorrecaoExcluir() {

		cenariosCorrecaoExcluir = new CenariosCorrecaoExcluir();
		cenariosCorrecaoExcluir.beforeClass();
		cenariosCorrecaoExcluir.login();
		cenariosCorrecaoExcluir.acessarMDR();
		cenariosCorrecaoExcluir.excluir();
		cenariosCorrecaoExcluir.afterClass();

		System.out.println("-------------------Cenários de Correcão Fin-------------------------");
	}

	// Centralização > Estorno de Crédito

	@Test(priority = 47)
	public void estornoCreditoCriar() {

		System.out.println("-------------------Centralização > Estorno de Crédito-------------------------");

		estornoCreditoCriar = new EstornoCreditoCriar();
		estornoCreditoCriar.beforeClass();
		estornoCreditoCriar.login();
		estornoCreditoCriar.acessarMDR();
		estornoCreditoCriar.criar();
		estornoCreditoCriar.afterClass();

	}

	@Test(priority = 48)
	public void estornoCreditoEditar() {

		estornoCreditoEditar = new EstornoCreditoEditar();
		estornoCreditoEditar.beforeClass();
		estornoCreditoEditar.login();
		estornoCreditoEditar.acessarMDR();
		estornoCreditoEditar.editar();
		estornoCreditoEditar.afterClass();

	}

	@Test(priority = 49)
	public void estornoCreditoVisualizar() {

		estornoCreditoVisualizar = new EstornoCreditoVisualizar();
		estornoCreditoVisualizar.beforeClass();
		estornoCreditoVisualizar.login();
		estornoCreditoVisualizar.acessarMDR();
		estornoCreditoVisualizar.Visualizar();
		estornoCreditoVisualizar.afterClass();

	}

	@Test(priority = 50)
	public void estornoCreditoFiltro() {

		estornoCreditoFiltros = new EstornoCreditoFiltros();
		estornoCreditoFiltros.beforeClass();
		estornoCreditoFiltros.login();
		estornoCreditoFiltros.acessarMDR();
		estornoCreditoFiltros.filtro();
		estornoCreditoFiltros.afterClass();

	}

	@Test(priority = 51)
	public void estornoCreditoExcluir() {

		estornoCreditoExcluir = new EstornoCreditoExcluir();
		estornoCreditoExcluir.beforeClass();
		estornoCreditoExcluir.login();
		estornoCreditoExcluir.acessarMDR();
		estornoCreditoExcluir.Excluir();
		estornoCreditoExcluir.afterClass();

		System.out.println("-------------------Centralização > Estorno de Crédito Fin-------------------------");
	}

	// Centralização > Fator de Crecimento do CIAP

	@Test(priority = 52)
	public void FatorCrecimentoCIAPCriar() {

		System.out.println("-------------------Centralização > Fator de Crecimento do CIAP-------------------------");

		fatorCreditamentoCriar = new FatorCreditamentoCriar();
		fatorCreditamentoCriar.beforeClass();
		fatorCreditamentoCriar.login();
		fatorCreditamentoCriar.acessarMDR();
		fatorCreditamentoCriar.criar();
		fatorCreditamentoCriar.afterClass();

	}

	@Test(priority = 53)
	public void FatorCrecimentoCIAPFiltro() {

		fatorCreditamentoFiltros = new FatorCreditamentoFiltros();
		fatorCreditamentoFiltros.beforeClass();
		fatorCreditamentoFiltros.login();
		fatorCreditamentoFiltros.acessarMDR();
		fatorCreditamentoFiltros.filtros();
		fatorCreditamentoFiltros.afterClass();

		System.out
				.println("-------------------Centralização > Fator de Crecimento do CIAP Fin-------------------------");
	}

	// Centralização > Tributos

	@Test(priority = 54)
	public void tributosCriar() {

		System.out.println("-------------------Centralização > Tributos-------------------------");

		tributosCriar = new com.timp.test.MDR.Centralizacao.Tributos.TributosCriar();
		tributosCriar.beforeClass();
		tributosCriar.login();
		tributosCriar.acessarMDR();
		tributosCriar.criar();
		tributosCriar.afterClass();

	}

	@Test(priority = 55)
	public void tributosEditar() {

		tributosEditar = new TributosEditar();
		tributosEditar.beforeClass();
		tributosEditar.login();
		tributosEditar.acessarMDR();
		tributosEditar.editar();
		tributosEditar.afterClass();

	}

	@Test(priority = 56)
	public void tributosVisualizar() {

		tributosVisualizar = new TributosVisualizar();
		tributosVisualizar.beforeClass();
		tributosVisualizar.login();
		tributosVisualizar.acessarMDR();
		tributosVisualizar.visualizar();
		tributosVisualizar.afterClass();

	}

	@Test(priority = 57)
	public void tributosDetalhes() {

		tributosDetalhes = new TributosDetalhes();
		tributosDetalhes.beforeClass();
		tributosDetalhes.login();
		tributosDetalhes.acessarMDR();
		tributosDetalhes.detalhes();
		tributosDetalhes.afterClass();

	}

	@Test(priority = 58)
	public void tributosExcluir() {

		tributosExcluir = new TributosExcluir();
		tributosExcluir.beforeClass();
		tributosExcluir.login();
		tributosExcluir.acessarMDR();
		tributosExcluir.excluir();
		tributosExcluir.afterClass();

		System.out.println("-------------------Centralização > Tributos Fin-------------------------");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}