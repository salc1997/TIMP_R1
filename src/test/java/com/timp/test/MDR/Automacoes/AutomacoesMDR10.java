package com.timp.test.MDR.Automacoes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoExcluirPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao.CodigoContabilizacaoDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.ContratoIOF.ContratoIOFEditarPO;
import com.sap.timp.pageObjectModel.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosCriarPO;
import com.timp.test.ADM.LoginBRB;
import com.timp.test.BRB.*;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteCriar;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteDetalhe;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteEditar;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteExcluir;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteVisualizar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesCriar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesDetalhes;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesEditar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesExcluir;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesVisualizar;
import com.timp.test.MDR.Antecipacao.AntecipacaoCriar;
import com.timp.test.MDR.Antecipacao.AntecipacaoDetalhe;
import com.timp.test.MDR.Antecipacao.AntecipacaoEditar;
import com.timp.test.MDR.Antecipacao.AntecipacaoEliminar;
import com.timp.test.MDR.Antecipacao.AntecipacaoFiltros;
import com.timp.test.MDR.Antecipacao.AntecipacaoVisualizar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioCriar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioDetalhes;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioEditar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioExcluir;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioFiltroID;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioVisualizar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoDetalhes;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoEditar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoExcluir;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoVisualizar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeCriar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeEditar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeEliminar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeExcluirMassa;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeFiltro;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeVisualizar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeCriar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeEditar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluir;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluirMassa;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeFiscalDetalle;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeVisualizar;
import com.timp.test.MDR.CEP.Bairro.BairroCriar;
import com.timp.test.MDR.CEP.Bairro.BairroEditar;
import com.timp.test.MDR.CEP.Bairro.BairroEliminar;
import com.timp.test.MDR.CEP.Bairro.BairroExcluirMassa;
import com.timp.test.MDR.CEP.Bairro.BairroFiltros;
import com.timp.test.MDR.CEP.Bairro.BairroVisualizar;
import com.timp.test.MDR.CEP.Logradouro.LogradouroCriar;
import com.timp.test.MDR.CEP.Logradouro.LogradouroEditar;
import com.timp.test.MDR.CEP.Logradouro.LogradouroExcluir;
import com.timp.test.MDR.CEP.Logradouro.LogradouroFiltros;
import com.timp.test.MDR.CEP.Logradouro.LogradouroVisualizar;
import com.timp.test.MDR.CEP.Municipio.MunicipioCriar;
import com.timp.test.MDR.CEP.Municipio.MunicipioEditar;
import com.timp.test.MDR.CEP.Municipio.MunicipioEliminar;
import com.timp.test.MDR.CEP.Municipio.MunicipioFiltros;
import com.timp.test.MDR.CEP.Municipio.MunicipioVisualizar;
import com.timp.test.MDR.CadastroCondiçao.*;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoCriar;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoEditar;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoFiltros;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoVisualizar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstitucaoDetalhes;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstitucaoVisualizar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoCriar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoEditar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoExcluir;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoFiltroId;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURExcluir;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURFiltroID;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoCriar;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoEditar;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoExcluir;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoExcluirMassa;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoFiltrosAvanzados;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoVisualizar;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoCriar;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoEditar;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoExcluir;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoFiltros;
import com.timp.test.MDR.Centralizacao.EstornoCredito.EstornoCreditoVisualizar;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoCriar;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoDetalhes;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoEditar;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoExcluir;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoExcluirEmMassa;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoFiltros;
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoVisualizar;
import com.timp.test.MDR.Centralizacao.Tributos.TributosCriar;
import com.timp.test.MDR.Centralizacao.Tributos.TributosDetalhes;
import com.timp.test.MDR.Centralizacao.Tributos.TributosEditar;
import com.timp.test.MDR.Centralizacao.Tributos.TributosExcluir;
import com.timp.test.MDR.Centralizacao.Tributos.TributosFiltrar;
import com.timp.test.MDR.Centralizacao.Tributos.TributosVisualizar;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabalizacaoDetalhes;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabalizacaoVisualizar;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoCriar;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoEditar;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoExcluir;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoFiltrosAvan;
import com.timp.test.MDR.CodigoContabilizacao.CódigoContabilizaçãoExcluirMassa;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaCriar;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaDetalhes;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaEditar;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaExcluir;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaFiltrosAvan;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaVisualizar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailCriar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailFiltroId;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracoesDeFundoSocialExcluirEmMassa;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialEditar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialExcluir;
import com.timp.test.MDR.ContratoIOF.ContratoIOFCriar;
import com.timp.test.MDR.ContratoIOF.ContratoIOFDetalhes;
import com.timp.test.MDR.ContratoIOF.ContratoIOFEditar;
import com.timp.test.MDR.ContratoIOF.ContratoIOFExcluir;
import com.timp.test.MDR.ContratoIOF.ContratoIOFVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarFiltroId;
import com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoExcluirEmMassa;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoFiltroId;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoVisualizar;
import com.timp.test.MDR.Empresas.EmpresaEditar;
import com.timp.test.MDR.Empresas.EmpresasFiltros;
import com.timp.test.MDR.Empresas.EmpresasVisualizar;
import com.timp.test.MDR.Filiais.FiliaisEditar;
import com.timp.test.MDR.Filiais.FiliaisVisualizar;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIICriar;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIDetalhe;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIEditar;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIExcluir;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIExcluirMassa;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosCriar;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosDetalhes;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosEditar;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosExcluir;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosExcluirMassa;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.LogradouroExcluirMassa;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluirEmMassa;

public class AutomacoesMDR10 extends TestBaseSteven {
	
	// Cadastros IRPJ/CSLL > Contas ParteB LALUR/LACS

	ContasParteBLALURCriar contasParteBLALURCriar;
	ContasParteBLALURExcluir contasParteBLALURExcluir;
	ContasParteBLALURFiltroID contasParteBLALURFiltroID;
	// Cenarios de Correção

	CenariosCorrecaoCriar cenariosCorrecaoCriar;
	CenariosCorrecaoEditar cenariosCorrecaoEditar;
	CenariosCorrecaoFiltrosAvanzados cenariosCorrecaoFiltrosAvanzados;
	CenariosCorrecaoVisualizar cenariosCorrecaoVisualizar;
	CenariosCorrecaoExcluir cenariosCorrecaoExcluir;
	CenariosCorrecaoExcluirMassa cenariosCorrecaoExcluirMassa;

	// Centralização > Estorno Crédito

	EstornoCreditoCriar estornoCreditoCriar;
	EstornoCreditoEditar estornoCreditoEditar;
	EstornoCreditoExcluir estornoCreditoExcluir;
	EstornoCreditoFiltros estornoCreditoFiltros;
	EstornoCreditoVisualizar estornoCreditoVisualizar;
	

	// Centralização > Fator de Crecimento do CIAP
	FatorCreditamentoCriar fatorCreditamentoCriar;
	FatorCreditamentoEditar fatorCreditamentoEditar;
	FatorCreditamentoDetalhes fatorCreditamentoDetalhes;
	FatorCreditamentoVisualizar fatorCreditamentoVisualizar;
	FatorCreditamentoExcluir fatorCreditamentoExcluir;
	FatorCreditamentoExcluirEmMassa fatorCreditamentoExcluirEmMassa;
	FatorCreditamentoFiltros fatorCreditamentoFiltros;

	// Centralização > Tributos

	TributosCriar tributosCriar;
	TributosDetalhes tributosDetalhes;
	TributosEditar tributosEditar;
	TributosVisualizar tributosVisualizar;
	TributosExcluir tributosExcluir;
	TributosFiltrar tributosFiltrar;

	// CEP> Bairro

	BairroCriar bairroCriar;
	BairroEditar bairroEditar;
	BairroFiltros bairroFiltros;
	BairroVisualizar bairroVisualizar;
	BairroEliminar bairroEliminar;
	BairroExcluirMassa bairroExcluirMassa;
	
	// CEP > Logradouro
	LogradouroCriar logradouroCriar;
	LogradouroEditar logradouroEditar;
	LogradouroExcluir logradouroExcluir;
	LogradouroFiltros logradouroFiltros;
	LogradouroVisualizar logradouroVisualizar;
	LogradouroExcluirMassa logradouroExcluirMassa;
	
	// CEP > Município
	MunicipioCriar municipioCriar;
	MunicipioEditar municipioEditar;
	MunicipioEliminar municipioEliminar;
	MunicipioFiltros municipioFiltros;
	MunicipioVisualizar MunicipioVisualizar;
	MunicipioExcluirEmMassa municipioExcluirEmMassa;
	
	// Código de Contabiliazação
	CodigoContabilizacaoCriar codigoContabilizacaoCriar;
	CodigoContabalizacaoVisualizar codigoContabalizacaoVisualizar;
	CodigoContabilizacaoEditar codigoContabilizacaoEditar;
	CodigoContabalizacaoDetalhes codigoContabalizacaoDetalhes;
	CodigoContabilizacaoExcluir codigoContabilizacaoExcluir;
	CódigoContabilizaçãoExcluirMassa códigoContabilizaçãoExcluirMassa;
	CodigoContabilizacaoFiltrosAvan codigoContabilizacaoFiltrosAvan;

	
	// --------------------------------------------------------------------------------------------------
	
	// Ajustes > Associação de Códigos de Ajustes

	

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
	
	@Test(priority = 4)
	public void contasParteBLALURFiltroID() {

		contasParteBLALURFiltroID = new ContasParteBLALURFiltroID();
		contasParteBLALURFiltroID.beforeClass();
		contasParteBLALURFiltroID.login();
		contasParteBLALURFiltroID.acessarMDR();
		contasParteBLALURFiltroID.filtro();
		contasParteBLALURFiltroID.afterClass();

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

	@Test(priority = 43)
	public void cenarioCorrecaoVisualizar() {

		cenariosCorrecaoVisualizar = new CenariosCorrecaoVisualizar();
		cenariosCorrecaoVisualizar.beforeClass();
		cenariosCorrecaoVisualizar.login();
		cenariosCorrecaoVisualizar.acessarMDR();
		cenariosCorrecaoVisualizar.visualizar();
		cenariosCorrecaoVisualizar.afterClass();

	}

	@Test(priority = 44)
	public void cenarioCorrecaoFiltro() {

		cenariosCorrecaoFiltrosAvanzados = new CenariosCorrecaoFiltrosAvanzados();
		cenariosCorrecaoFiltrosAvanzados.beforeClass();
		cenariosCorrecaoFiltrosAvanzados.login();
		cenariosCorrecaoFiltrosAvanzados.acessarMDR();
		cenariosCorrecaoFiltrosAvanzados.filtros();
		cenariosCorrecaoFiltrosAvanzados.afterClass();

	}

	@Test(priority = 45)
	public void cenarioCorrecaoExcluir() {

		cenariosCorrecaoExcluir = new CenariosCorrecaoExcluir();
		cenariosCorrecaoExcluir.beforeClass();
		cenariosCorrecaoExcluir.login();
		cenariosCorrecaoExcluir.acessarMDR();
		cenariosCorrecaoExcluir.excluir();
		cenariosCorrecaoExcluir.afterClass();

	}
	
	@Test(priority = 46)
	public void cenarioCorrecaoExcluirMassa() {

		cenariosCorrecaoExcluirMassa = new CenariosCorrecaoExcluirMassa();
		cenariosCorrecaoExcluirMassa.beforeClass();
		cenariosCorrecaoExcluirMassa.login();
		cenariosCorrecaoExcluirMassa.acessarMDR();
		cenariosCorrecaoExcluirMassa.criar();
		cenariosCorrecaoExcluirMassa.excluirMassa();
		cenariosCorrecaoExcluirMassa.afterClass();

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
	public void FatorCrecimentoCIAPEditar() {

		fatorCreditamentoEditar = new FatorCreditamentoEditar();
		fatorCreditamentoEditar.beforeClass();
		fatorCreditamentoEditar.login();
		fatorCreditamentoEditar.acessarMDR();
		fatorCreditamentoEditar.editar();
		fatorCreditamentoEditar.afterClass();

	}
	
	@Test(priority = 53)
	public void FatorCrecimentoCIAPDetalhes() {

		fatorCreditamentoDetalhes = new FatorCreditamentoDetalhes();
		fatorCreditamentoDetalhes.beforeClass();
		fatorCreditamentoDetalhes.login();
		fatorCreditamentoDetalhes.acessarMDR();
		fatorCreditamentoDetalhes.detalhes();
		fatorCreditamentoDetalhes.afterClass();

	}
	
	@Test(priority = 53)
	public void FatorCrecimentoCIAPVisualizar() {

		fatorCreditamentoVisualizar = new FatorCreditamentoVisualizar();
		fatorCreditamentoVisualizar.beforeClass();
		fatorCreditamentoVisualizar.login();
		fatorCreditamentoVisualizar.acessarMDR();
		fatorCreditamentoVisualizar.visualizar();
		fatorCreditamentoVisualizar.afterClass();

	}
	
	

	@Test(priority = 53)
	public void FatorCrecimentoCIAPFiltro() {

		fatorCreditamentoFiltros = new FatorCreditamentoFiltros();
		fatorCreditamentoFiltros.beforeClass();
		fatorCreditamentoFiltros.login();
		fatorCreditamentoFiltros.acessarMDR();
		fatorCreditamentoFiltros.filtros();
		fatorCreditamentoFiltros.afterClass();

	}
	
	@Test(priority = 54)
	public void FatorCrecimentoCIAPExcluir() {

		fatorCreditamentoExcluir = new FatorCreditamentoExcluir();
		fatorCreditamentoExcluir.beforeClass();
		fatorCreditamentoExcluir.login();
		fatorCreditamentoExcluir.acessarMDR();
		fatorCreditamentoExcluir.excluir();
		fatorCreditamentoExcluir.afterClass();

	}
	
	@Test(priority = 55)
	public void FatorCrecimentoCIAPExcluirEmMassa() {

		fatorCreditamentoExcluirEmMassa = new FatorCreditamentoExcluirEmMassa();
		fatorCreditamentoExcluirEmMassa.beforeClass();
		fatorCreditamentoExcluirEmMassa.login();
		fatorCreditamentoExcluirEmMassa.acessarMDR();
		fatorCreditamentoExcluirEmMassa.criar();
		fatorCreditamentoExcluirEmMassa.afterClass();
		
		System.out.println("-------------------Centralização > Fator de Crecimento do CIAP Fin-------------------------");

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

	@Test(priority = 55)
	public void tributosVisualizar() {

		tributosVisualizar = new TributosVisualizar();
		tributosVisualizar.beforeClass();
		tributosVisualizar.login();
		tributosVisualizar.acessarMDR();
		tributosVisualizar.visualizar();
		tributosVisualizar.afterClass();

	}

	@Test(priority = 56)
	public void tributosDetalhes() {

		tributosDetalhes = new TributosDetalhes();
		tributosDetalhes.beforeClass();
		tributosDetalhes.login();
		tributosDetalhes.acessarMDR();
		tributosDetalhes.detalhes();
		tributosDetalhes.afterClass();

	}
	
	@Test(priority = 57)
	public void tributosFiltrar() {

		tributosFiltrar = new TributosFiltrar();
		tributosFiltrar.beforeClass();
		tributosFiltrar.ingresar();
		tributosFiltrar.ingresarMDR();
		tributosFiltrar.filtrar();
		tributosFiltrar.afterClass();

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

	// CEP > Bairro

	@Test(priority = 59)
	public void bairroCriar() {

		System.out.println("------------------- CEP > Bairro-------------------------");

		bairroCriar = new BairroCriar();
		bairroCriar.beforeClass();
		bairroCriar.login();
		bairroCriar.acessarMDR();
		bairroCriar.criar();
		bairroCriar.afterClass();

	}

	@Test(priority = 60)
	public void bairroEditar() {

		bairroEditar = new BairroEditar();
		bairroEditar.beforeClass();
		bairroEditar.login();
		bairroEditar.acessarMDR();
		bairroEditar.editar();
		bairroEditar.afterClass();

	}

	@Test(priority = 60)
	public void bairroVisualizar() {

		bairroVisualizar = new BairroVisualizar();
		bairroVisualizar.beforeClass();
		bairroVisualizar.login();
		bairroVisualizar.acessarMDR();
		bairroVisualizar.visualizar();
		bairroVisualizar.afterClass();

	}

	@Test(priority = 61)
	public void bairroFiltro() {

		bairroFiltros = new BairroFiltros();
		bairroFiltros.beforeClass();
		bairroFiltros.login();
		bairroFiltros.acessarMDR();
		bairroFiltros.filtro();
		bairroFiltros.afterClass();

	}

	@Test(priority = 62)
	public void bairroExcluir() {

		bairroEliminar = new BairroEliminar();
		bairroEliminar.beforeClass();
		bairroEliminar.login();
		bairroEliminar.acessarMDR();
		bairroEliminar.eliminar();
		bairroEliminar.afterClass();
	}
	
	@Test(priority = 63)
	public void bairroExcluirMassa() {

		bairroExcluirMassa = new BairroExcluirMassa();
		bairroExcluirMassa.beforeClass();
		bairroExcluirMassa.login();
		bairroExcluirMassa.acessarMDR();
		bairroExcluirMassa.criar();
		bairroExcluirMassa.excluirMassa();
		bairroExcluirMassa.afterClass();

		System.out.println("-------------------CEP > Bairro Fin-------------------------");
	}

	// CEP > Logradouro

	@Test(priority = 64)
	public void logradouroCriar() {

		System.out.println("-------------------CEP > Logradouro-------------------------");

		logradouroCriar = new LogradouroCriar();
		logradouroCriar.beforeClass();
		logradouroCriar.login();
		logradouroCriar.acessarMDR();
		logradouroCriar.criar();
		logradouroCriar.afterClass();

	}

	@Test(priority = 65)
	public void logradouroEditar() {

		logradouroEditar = new LogradouroEditar();
		logradouroEditar.beforeClass();
		logradouroEditar.login();
		logradouroEditar.acessarMDR();
		logradouroEditar.editar();
		logradouroEditar.afterClass();

	}

	@Test(priority = 65)
	public void logradouroVisualizar() {

		logradouroVisualizar = new LogradouroVisualizar();
		logradouroVisualizar.beforeClass();
		logradouroVisualizar.login();
		logradouroVisualizar.acessarMDR();
		logradouroVisualizar.visualizar();
		logradouroVisualizar.afterClass();

	}

	@Test(priority = 66)
	public void logradouroFiltro() {

		logradouroFiltros = new LogradouroFiltros();
		logradouroFiltros.beforeClass();
		logradouroFiltros.login();
		logradouroFiltros.acessarMDR();
		logradouroFiltros.filtros();
		logradouroFiltros.afterClass();

	}

	@Test(priority = 67)
	public void logradouroExcluir() {

		logradouroExcluir = new LogradouroExcluir();
		logradouroExcluir.beforeClass();
		logradouroExcluir.login();
		logradouroExcluir.acessarMDR();
		logradouroExcluir.excluir();
		logradouroExcluir.afterClass();

	}
	
	@Test(priority = 68)
	public void logradouroExcluirMassa() {

		logradouroExcluirMassa = new LogradouroExcluirMassa();
		logradouroExcluirMassa.beforeClass();
		logradouroExcluirMassa.login();
		logradouroExcluirMassa.acessarMDR();
		logradouroExcluirMassa.criar();
		logradouroExcluirMassa.excluirMassa();
		logradouroExcluirMassa.afterClass();

		System.out.println("-------------------CEP > Logradouro Fin-------------------------");
	}

	// CEP > Município

	@Test(priority = 69)
	public void municipioCriar() {

		System.out.println("-------------------CEP > Município-------------------------");

		municipioCriar = new MunicipioCriar();
		municipioCriar.beforeClass();
		municipioCriar.login();
		municipioCriar.acessarMDR();
		municipioCriar.criar();
		municipioCriar.afterClass();

	}

	@Test(priority = 70)
	public void municipioEditar() {

		municipioEditar = new MunicipioEditar();
		municipioEditar.beforeClass();
		municipioEditar.login();
		municipioEditar.acessarMDR();
		municipioEditar.editar();
		municipioEditar.afterClass();

	}

	@Test(priority = 70)
	public void municipioVisualizar() {

		MunicipioVisualizar = new MunicipioVisualizar();
		MunicipioVisualizar.beforeClass();
		MunicipioVisualizar.login();
		MunicipioVisualizar.acessarMDR();
		MunicipioVisualizar.visualizar();
		MunicipioVisualizar.afterClass();

	}

	@Test(priority = 71)
	public void municipioFiltro() {

		municipioFiltros = new MunicipioFiltros();
		municipioFiltros.beforeClass();
		municipioFiltros.login();
		municipioFiltros.acessarMDR();
		municipioFiltros.filtros();
		municipioFiltros.afterClass();

	}

	@Test(priority = 72)
	public void municipioExcluir() {

		municipioEliminar = new MunicipioEliminar();
		municipioEliminar.beforeClass();
		municipioEliminar.login();
		municipioEliminar.acessarMDR();
		municipioEliminar.excluir();
		municipioEliminar.afterClass();
	}
	
	@Test(priority = 73)
	public void municipioExcluirMassa() {

		municipioExcluirEmMassa = new MunicipioExcluirEmMassa();
		municipioExcluirEmMassa.beforeClass();
		municipioExcluirEmMassa.login();
		municipioExcluirEmMassa.acessarMDR();
		municipioExcluirEmMassa.criar();
		municipioExcluirEmMassa.afterClass();

		System.out.println("-------------------CEP > Município Fin-------------------------");
	}

	// Codigo Contabilização

	@Test(priority = 74)
	public void codigoContabilizacaoCriar() {

		System.out.println("-------------------Codigo Contabilização-------------------------");

		codigoContabilizacaoCriar = new CodigoContabilizacaoCriar();
		codigoContabilizacaoCriar.beforeClass();
		codigoContabilizacaoCriar.login();
		codigoContabilizacaoCriar.acessarMDR();
		codigoContabilizacaoCriar.criar();
		codigoContabilizacaoCriar.afterClass();

	}

	@Test(priority = 75)
	public void codigoContabilizacaoEditar() {

		codigoContabilizacaoEditar = new CodigoContabilizacaoEditar();
		codigoContabilizacaoEditar.beforeClass();
		codigoContabilizacaoEditar.login();
		codigoContabilizacaoEditar.acessarMDR();
		codigoContabilizacaoEditar.editar();
		codigoContabilizacaoEditar.afterClass();

	}

	@Test(priority = 75)
	public void codigoContabilizacaoVisualizar() {

		codigoContabalizacaoVisualizar = new CodigoContabalizacaoVisualizar();
		codigoContabalizacaoVisualizar.beforeClass();
		codigoContabalizacaoVisualizar.login();
		codigoContabalizacaoVisualizar.acessarMDR();
		codigoContabalizacaoVisualizar.visualizar();
		codigoContabalizacaoVisualizar.afterClass();

	}
	
	@Test(priority = 75)
	public void codigoContabalizacaoDetalhes() {

		codigoContabalizacaoDetalhes = new CodigoContabalizacaoDetalhes();
		codigoContabalizacaoDetalhes.beforeClass();
		codigoContabalizacaoDetalhes.login();
		codigoContabalizacaoDetalhes.acessarMDR();
		codigoContabalizacaoDetalhes.detalhes();
		codigoContabalizacaoDetalhes.afterClass();

	}


	@Test(priority = 76)
	public void codigoContabilizacaoExcluir() {

		codigoContabilizacaoExcluir = new CodigoContabilizacaoExcluir();
		codigoContabilizacaoExcluir.beforeClass();
		codigoContabilizacaoExcluir.login();
		codigoContabilizacaoExcluir.acessarMDR();
		codigoContabilizacaoExcluir.excluir();
		codigoContabilizacaoExcluir.afterClass();

		System.out.println("-------------------Codigo Contabilização Fin-------------------------");
	}
	
	
	@Test(priority = 77)
	public void códigoContabilizaçãoExcluirMassa() {

		códigoContabilizaçãoExcluirMassa = new CódigoContabilizaçãoExcluirMassa();
		códigoContabilizaçãoExcluirMassa.beforeClass();
		códigoContabilizaçãoExcluirMassa.login();
		códigoContabilizaçãoExcluirMassa.acessarMDR();
		códigoContabilizaçãoExcluirMassa.criar();
		códigoContabilizaçãoExcluirMassa.afterClass();

	}
	
	@Test(priority = 78)
	public void codigoContabilizacaoFiltrosAvan() {
		System.out.println(
				"-------------------Código de Contabilização-------------------------");
		codigoContabilizacaoFiltrosAvan = new CodigoContabilizacaoFiltrosAvan();
		codigoContabilizacaoFiltrosAvan.beforeClass();
		codigoContabilizacaoFiltrosAvan.login();
		codigoContabilizacaoFiltrosAvan.acessarMDR();
		codigoContabilizacaoFiltrosAvan.filtrarAvanCodigoContabilizacao();
		codigoContabilizacaoFiltrosAvan.afterClass();
	}
	

		

}