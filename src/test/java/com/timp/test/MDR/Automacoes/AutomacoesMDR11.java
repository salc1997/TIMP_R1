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

public class AutomacoesMDR11 extends TestBaseSteven {
	

	// Código da Receita
	CodigoReceitaCriar codigoReceitaCriar;
	CodigoReceitaDetalhes codigoReceitaDetalhes;
	CodigoReceitaEditar codigoReceitaEditar;
	CodigoReceitaVisualizar codigoReceitaVisualizar;
	CodigoReceitaExcluir codigoReceitaExcluir;
	CodigoReceitaFiltrosAvan codigoReceitaFiltrosAvan;
//113
	// Configuração do Fundo Socail
	ConfiguracaoFundoSocailCriar configuracaoFundoSocailCriar;
	ConfiguracaoFundoSocailFiltroId configuracaoFundoSocailFiltroId;
	ConfiguracoesFundoSocialExcluir configuracoesFundoSocialExcluir;
	ConfiguracoesDeFundoSocialExcluirEmMassa configuracoesDeFundoSocialExcluirEmMassa;
	ConfiguracoesFundoSocialEditar configuracoesFundoSocialEditar;
	// Contrato IOF

	ContratoIOFCriar contratoIOFCriar;
	ContratoIOFEditar contratoIOFEditar;
	ContratoIOFVisualizar contratoIOFVisualizar;
	ContratoIOFDetalhes contratoIOFDetalhes;
	ContratoIOFExcluir contratoIOFExcluir;

	// Controle De crédito Tributario > Código Crédito

	CodigosDeCreditoCriar codigosDeCreditoCriar;
	CodigosDeCreditoDetalhes codigosDeCreditoDetalhes;
	CodigosDeCreditoEditar codigosDeCreditoEditar;
	CodigosDeCreditoExcluir codigosDeCreditoExcluir;
	CodigosDeCreditoVisualizar codigosDeCreditoVisualizar;

	// Controle De crédito Tributario > Limite de Crédito a Atulizar
	LimiteDeCreditoAUtilizarCriar limiteDeCreditoAUtilizarCriar;
	LimiteDeCreditoAUtilizarDetalhes limiteDeCreditoAUtilizarDetalhes;
	LimiteDeCreditoAUtilizarEditar limiteDeCreditoAUtilizarEditar;
	LimiteDeCreditoAUtilizarExcluir limiteDeCreditoAUtilizarExcluir;
	LimiteDeCreditoAUtilizarVisualizar limiteDeCreditoAUtilizarVisualizar;
	LimiteDeCreditoAUtilizarFiltroId limiteDeCreditoAUtilizarFiltroId;

	// Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior
	UtilizacaoDosCreditosEmPeriodoAnteriorCriar utilizacaoDosCreditosEmPeriodoAnteriorCriar;
	UtilizacaoDosCreditosEmPeriodoAnteriorDetalhes utilizacaoDosCreditosEmPeriodoAnteriorDetalhes;
	UtilizacaoDosCreditosEmPeriodoAnteriorEditar utilizacaoDosCreditosEmPeriodoAnteriorEditar;
	UtilizacaoDosCreditosEmPeriodoAnteriorVisualizar utilizacaoDosCreditosEmPeriodoAnteriorVisualizar;
	UtilizacaoDosCreditosEmPeriodoAnteriorExcluir utilizacaoDosCreditosEmPeriodoAnteriorExcluir;
	// Controle De Credito Tributario > Utilizacao Dos Creditos Na Apuração

	UtilizacaoDosCreditosNaApuracaoCriar utilizacaoDosCreditosNaApuracaoCriar;
	UtilizacaoDosCreditosNaApuracaoDetalhes utilizacaoDosCreditosNaApuracaoDetalhes;
	UtilizacaoDosCreditosNaApuracaoEditar utilizacaoDosCreditosNaApuracaoEditar;
	UtilizacaoDosCreditosNaApuracaoExcluir utilizacaoDosCreditosNaApuracaoExcluir;
	UtilizacaoDosCreditosNaApuracaoVisualizar utilizacaoDosCreditosNaApuracaoVisualizar;
	UtilizacaoDosCreditosNaApuracaoFiltroId utilizacaoDosCreditosNaApuracaoFiltroId;
	UtilizacaoDosCreditosNaApuracaoExcluirEmMassa utilizacaoDosCreditosNaApuracaoExcluirEmMassa;
	//SPCB - Federais Retidos
	SPCBFederaisRetidosCriar sPCBFederaisRetidosCriar;
	SPCBFederaisRetidosEditar sPCBFederaisRetidosEditar;
	SPCBFederaisRetidosExcluir sPCBFederaisRetidosExcluir;
	SPCBFederaisRetidosDetalhes spcbFederaisRetidosDetalhes;
	SPCBFederaisRetidosVisualizar spcbFederaisRetidosVisualizar;
	SPCBFederaisRetidosExcluirMassa sPCBFederaisRetidosExcluirMassa;
	
	// Notas a Declarar Anexo III DIA-AM
	NotasDeclararAnexoIIICriar notasDeclararAnexoIIICriar;
	NotasDeclararAnexoIIIDetalhe notasDeclararAnexoIIIDetalhe;
	NotasDeclararAnexoIIIExcluir notasDeclararAnexoIIIExcluir;
	NotasDeclararAnexoIIIExcluirMassa notasDeclararAnexoIIIExcluirMassa;
	NotasDeclararAnexoIIIEditar notasDeclararAnexoIIIEditar;
	
	// --------------------------------------------------------------------------------------------------
	

	// Código da Receita

	@Test(priority = 79)
	public void codigoReceitaCriar() {

		System.out.println("-------------------Código da Receita-------------------------");

		codigoReceitaCriar = new CodigoReceitaCriar();
		codigoReceitaCriar.beforeClass();
		codigoReceitaCriar.login();
		codigoReceitaCriar.acessarMDR();
		codigoReceitaCriar.criar();
		codigoReceitaCriar.afterClass();

	}

	@Test(priority = 80)
	public void codigoReceitaEditar() {

		codigoReceitaEditar = new CodigoReceitaEditar();
		codigoReceitaEditar.beforeClass();
		codigoReceitaEditar.login();
		codigoReceitaEditar.acessarMDR();
		codigoReceitaEditar.editar();
		codigoReceitaEditar.afterClass();

	}

	@Test(priority = 80)
	public void codigoReceitaDetalhes() {

		codigoReceitaDetalhes = new CodigoReceitaDetalhes();
		codigoReceitaDetalhes.beforeClass();
		codigoReceitaDetalhes.login();
		codigoReceitaDetalhes.acessarMDR();
		codigoReceitaDetalhes.detalhes();
		codigoReceitaDetalhes.afterClass();

	}

	@Test(priority = 80)
	public void codigoReceitaVisualizar() {

		codigoReceitaVisualizar = new CodigoReceitaVisualizar();
		codigoReceitaVisualizar.beforeClass();
		codigoReceitaVisualizar.login();
		codigoReceitaVisualizar.acessarMDR();
		codigoReceitaVisualizar.visualizar();
		codigoReceitaVisualizar.afterClass();

	}

	@Test(priority = 81)
	public void codigoReceitaExcluir() {

		codigoReceitaExcluir = new CodigoReceitaExcluir();
		codigoReceitaExcluir.beforeClass();
		codigoReceitaExcluir.login();
		codigoReceitaExcluir.acessarMDR();
		codigoReceitaExcluir.excluir();
		codigoReceitaExcluir.afterClass();
	}
	
	@Test(priority = 82)
	public void codigoReceitaFiltrosAvan() {
		
		codigoReceitaFiltrosAvan = new CodigoReceitaFiltrosAvan();
		codigoReceitaFiltrosAvan.beforeClass();
		codigoReceitaFiltrosAvan.login();
		codigoReceitaFiltrosAvan.acessarMDR();
		codigoReceitaFiltrosAvan.filtrosAvanzados();
		codigoReceitaFiltrosAvan.afterClass();
		
		System.out.println("-------------------Código da Receita Fin-------------------------");
	}
	
	

	// Configuração do Fundo Social

	@Test(priority = 83)
	public void configuracaoFundoSocialCriar() {

		System.out.println("-------------------Configuração do Fundo Social-------------------------");

		configuracaoFundoSocailCriar = new ConfiguracaoFundoSocailCriar();
		configuracaoFundoSocailCriar.beforeClass();
		configuracaoFundoSocailCriar.login();
		configuracaoFundoSocailCriar.acessarMDR();
		configuracaoFundoSocailCriar.criar();
		configuracaoFundoSocailCriar.afterClass();

	}
	
	@Test(priority = 84)
	public void  configuracoesFundoSocialEditar() {

		configuracoesFundoSocialEditar = new ConfiguracoesFundoSocialEditar();
		configuracoesFundoSocialEditar.beforeClass();
		configuracoesFundoSocialEditar.ingresar();
		configuracoesFundoSocialEditar.ingresarMDR();
		configuracoesFundoSocialEditar.editar();
		configuracoesFundoSocialEditar.afterClass();

	}
	
	
	@Test(priority = 84)
	public void configuracaoFundoSocailFiltroId() {

		configuracaoFundoSocailFiltroId = new ConfiguracaoFundoSocailFiltroId();
		configuracaoFundoSocailFiltroId.beforeClass();
		configuracaoFundoSocailFiltroId.login();
		configuracaoFundoSocailFiltroId.acessarMDR();
		configuracaoFundoSocailFiltroId.filtroId();
		configuracaoFundoSocailFiltroId.afterClass();

	}
	
	@Test(priority = 85)
	public void configuracoesFundoSocialExcluir() {

		configuracoesFundoSocialExcluir = new ConfiguracoesFundoSocialExcluir();
		configuracoesFundoSocialExcluir.beforeClass();
		configuracoesFundoSocialExcluir.login();
		configuracoesFundoSocialExcluir.acessarMDR();
		configuracoesFundoSocialExcluir.excluir();
		configuracoesFundoSocialExcluir.afterClass();
		

	}
	
	@Test(priority = 86)
	public void configuracoesDeFundoSocialExcluirEmMassa() {

		configuracoesDeFundoSocialExcluirEmMassa = new ConfiguracoesDeFundoSocialExcluirEmMassa();
		configuracoesDeFundoSocialExcluirEmMassa.beforeClass();
		configuracoesDeFundoSocialExcluirEmMassa.login();
		configuracoesDeFundoSocialExcluirEmMassa.acessarMDR();
		configuracoesDeFundoSocialExcluirEmMassa.criar();
		configuracoesDeFundoSocialExcluirEmMassa.afterClass();
		System.out.println("-------------------Configuração do Fundo Social Fim-------------------------");


	}


	// Contrato IOF

	@Test(priority = 86)
	public void contratoIOFCriar() {

		System.out.println("-------------------Contrato IOF-------------------------");

		contratoIOFCriar = new ContratoIOFCriar();
		contratoIOFCriar.beforeClass();
		contratoIOFCriar.login();
		contratoIOFCriar.acessarMDR();
		contratoIOFCriar.criar();
		contratoIOFCriar.afterClass();

	}

	@Test(priority = 87)
	public void contratoIOFEditar() {

		contratoIOFEditar = new ContratoIOFEditar();
		contratoIOFEditar.beforeClass();
		contratoIOFEditar.login();
		contratoIOFEditar.acessarMDR();
		contratoIOFEditar.editar();
		contratoIOFEditar.afterClass();

	}

	@Test(priority = 88)
	public void contratoIOFVisualizar() {

		contratoIOFVisualizar = new ContratoIOFVisualizar();
		contratoIOFVisualizar.beforeClass();
		contratoIOFVisualizar.login();
		contratoIOFVisualizar.acessarMDR();
		contratoIOFVisualizar.visualizar();
		contratoIOFVisualizar.afterClass();

	}
	@Test(priority = 89)
	public void contratoIOFDetalhes() {

		contratoIOFDetalhes = new ContratoIOFDetalhes();
		contratoIOFDetalhes.beforeClass();
		contratoIOFDetalhes.login();
		contratoIOFDetalhes.acessarMDR();
		contratoIOFDetalhes.Detalhes();
		contratoIOFDetalhes.afterClass();

	}

	@Test(priority = 90)
	public void contratoIOFExcluir() {

		contratoIOFExcluir = new ContratoIOFExcluir();
		contratoIOFExcluir.beforeClass();
		contratoIOFExcluir.login();
		contratoIOFExcluir.acessarMDR();
		contratoIOFExcluir.excluir();
		contratoIOFExcluir.afterClass();

		System.out.println("-------------------Contrato IOF Fin-------------------------");
	}

	// Controle De crédito Tributario > Código Crédito

	@Test(priority = 91)
	public void codigosDeCreditoCriar() {

		System.out
				.println("-------------------Controle De crédito Tributario > Código Crédito-------------------------");

		codigosDeCreditoCriar = new CodigosDeCreditoCriar();
		codigosDeCreditoCriar.beforeClass();
		codigosDeCreditoCriar.login();
		codigosDeCreditoCriar.acessarMDR();
		codigosDeCreditoCriar.criar();
		codigosDeCreditoCriar.afterClass();

	}

	@Test(priority = 92)
	public void codigosDeCreditoEditar() {

		codigosDeCreditoEditar = new CodigosDeCreditoEditar();
		codigosDeCreditoEditar.beforeClass();
		codigosDeCreditoEditar.login();
		codigosDeCreditoEditar.acessarMDR();
		codigosDeCreditoEditar.editar();
		codigosDeCreditoEditar.afterClass();

	}

	@Test(priority = 93)
	public void codigosDeCreditoVisualizar() {

		codigosDeCreditoVisualizar = new CodigosDeCreditoVisualizar();
		codigosDeCreditoVisualizar.beforeClass();
		codigosDeCreditoVisualizar.login();
		codigosDeCreditoVisualizar.acessarMDR();
		codigosDeCreditoVisualizar.visualizar();
		codigosDeCreditoVisualizar.afterClass();

	}

	@Test(priority = 94)
	public void codigosDeCreditoDetalhes() {

		codigosDeCreditoDetalhes = new CodigosDeCreditoDetalhes();
		codigosDeCreditoDetalhes.beforeClass();
		codigosDeCreditoDetalhes.login();
		codigosDeCreditoDetalhes.acessarMDR();
		codigosDeCreditoDetalhes.Detalhes();
		codigosDeCreditoDetalhes.afterClass();

	}

	@Test(priority = 95)
	public void codigosDeCreditoExcluir() {

		codigosDeCreditoExcluir = new CodigosDeCreditoExcluir();
		codigosDeCreditoExcluir.beforeClass();
		codigosDeCreditoExcluir.login();
		codigosDeCreditoExcluir.acessarMDR();
		codigosDeCreditoExcluir.excluir();
		codigosDeCreditoExcluir.afterClass();

		System.out.println(
				"-------------------Controle De crédito Tributario > Código Crédito Fin-------------------------");
	}

	// ControleDeCreditoTributario > Limite De Credito A Utilizar

	@Test(priority = 96)
	public void limiteDeCreditoAUtilizarCriar() {

		System.out.println(
				"-------------------ControleDeCreditoTributario > Limite De Credito A Utilizar-------------------------");

		limiteDeCreditoAUtilizarCriar = new LimiteDeCreditoAUtilizarCriar();
		limiteDeCreditoAUtilizarCriar.beforeClass();
		limiteDeCreditoAUtilizarCriar.login();
		limiteDeCreditoAUtilizarCriar.acessarMDR();
		limiteDeCreditoAUtilizarCriar.criar();
		limiteDeCreditoAUtilizarCriar.afterClass();

	}

	@Test(priority = 97)
	public void limiteDeCreditoAUtilizarEditar() {

		limiteDeCreditoAUtilizarEditar = new LimiteDeCreditoAUtilizarEditar();
		limiteDeCreditoAUtilizarEditar.beforeClass();
		limiteDeCreditoAUtilizarEditar.login();
		limiteDeCreditoAUtilizarEditar.acessarMDR();
		limiteDeCreditoAUtilizarEditar.editar();
		limiteDeCreditoAUtilizarEditar.afterClass();

	}

	@Test(priority = 98)
	public void limiteDeCreditoAUtilizarVisualizar() {

		limiteDeCreditoAUtilizarVisualizar = new LimiteDeCreditoAUtilizarVisualizar();
		limiteDeCreditoAUtilizarVisualizar.beforeClass();
		limiteDeCreditoAUtilizarVisualizar.login();
		limiteDeCreditoAUtilizarVisualizar.acessarMDR();
		limiteDeCreditoAUtilizarVisualizar.visualizar();
		limiteDeCreditoAUtilizarVisualizar.afterClass();

	}

	@Test(priority = 99)
	public void limiteDeCreditoAUtilizarDetalhes() {

		limiteDeCreditoAUtilizarDetalhes = new LimiteDeCreditoAUtilizarDetalhes();
		limiteDeCreditoAUtilizarDetalhes.beforeClass();
		limiteDeCreditoAUtilizarDetalhes.login();
		limiteDeCreditoAUtilizarDetalhes.acessarMDR();
		limiteDeCreditoAUtilizarDetalhes.detalhes();
		limiteDeCreditoAUtilizarDetalhes.afterClass();

	}
	
	@Test(priority = 100)
	public void limiteDeCreditoAUtilizarFiltroID() {

		limiteDeCreditoAUtilizarFiltroId = new LimiteDeCreditoAUtilizarFiltroId();
		limiteDeCreditoAUtilizarFiltroId.beforeClass();
		limiteDeCreditoAUtilizarFiltroId.login();
		limiteDeCreditoAUtilizarFiltroId.acessarMDR();
		limiteDeCreditoAUtilizarFiltroId.filtroId();
		limiteDeCreditoAUtilizarFiltroId.afterClass();

	}


	@Test(priority = 101)
	public void limiteDeCreditoAUtilizarExcluir() {

		limiteDeCreditoAUtilizarExcluir = new LimiteDeCreditoAUtilizarExcluir();
		limiteDeCreditoAUtilizarExcluir.beforeClass();
		limiteDeCreditoAUtilizarExcluir.login();
		limiteDeCreditoAUtilizarExcluir.acessarMDR();
		limiteDeCreditoAUtilizarExcluir.excluir();
		limiteDeCreditoAUtilizarExcluir.afterClass();

		System.out.println(
				"-------------------ControleDeCreditoTributario > Limite De Credito A Utilizar Fin-------------------------");
	}

	// Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior

	@Test(priority = 102)
	public void utilizacaoDosCreditosEmPeriodoAnteriorCriar() {

		System.out.println(
				"-------------------Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior-------------------------");

		utilizacaoDosCreditosEmPeriodoAnteriorCriar = new UtilizacaoDosCreditosEmPeriodoAnteriorCriar();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.login();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.criar();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.afterClass();

	}

	@Test(priority = 103)
	public void utilizacaoDosCreditosEmPeriodoAnteriorEditar() {

		utilizacaoDosCreditosEmPeriodoAnteriorEditar = new UtilizacaoDosCreditosEmPeriodoAnteriorEditar();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.login();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.editar();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.afterClass();

	}

	@Test(priority = 104)
	public void utilizacaoDosCreditosEmPeriodoAnteriorDetalhes() {

		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes = new UtilizacaoDosCreditosEmPeriodoAnteriorDetalhes();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.login();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.detalhes();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.afterClass();

	}

	@Test(priority = 105)
	public void utilizacaoDosCreditosEmPeriodoAnteriorVisualizar() {

		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar = new UtilizacaoDosCreditosEmPeriodoAnteriorVisualizar();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.login();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.Visualizar();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.afterClass();

	}

	@Test(priority = 106)
	public void utilizacaoDosCreditosEmPeriodoAnteriorExcluir() {

		utilizacaoDosCreditosEmPeriodoAnteriorExcluir = new UtilizacaoDosCreditosEmPeriodoAnteriorExcluir();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluir.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluir.login();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluir.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluir.excluir();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluir.afterClass();

		System.out.println(
				"-------------------Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior Fin-------------------------");

	}

	// Controle De Credito Tributario > Utilizacao Dos Creditos Na Apuração

	@Test(priority = 107)
	public void utilizacaoDosCreditosNaApuracaoCriar() {

		System.out.println(
				"-------------------Controle De Credito Tributario > Utilizacao Dos Creditos Na Apuração-------------------------");

		utilizacaoDosCreditosNaApuracaoCriar = new UtilizacaoDosCreditosNaApuracaoCriar();
		utilizacaoDosCreditosNaApuracaoCriar.beforeClass();
		utilizacaoDosCreditosNaApuracaoCriar.login();
		utilizacaoDosCreditosNaApuracaoCriar.acessarMDR();
		utilizacaoDosCreditosNaApuracaoCriar.criar();
		utilizacaoDosCreditosNaApuracaoCriar.afterClass();

	}

	@Test(priority = 108)
	public void utilizacaoDosCreditosNaApuracaoEditar() {

		utilizacaoDosCreditosNaApuracaoEditar = new UtilizacaoDosCreditosNaApuracaoEditar();
		utilizacaoDosCreditosNaApuracaoEditar.beforeClass();
		utilizacaoDosCreditosNaApuracaoEditar.login();
		utilizacaoDosCreditosNaApuracaoEditar.acessarMDR();
		utilizacaoDosCreditosNaApuracaoEditar.editar();
		utilizacaoDosCreditosNaApuracaoEditar.afterClass();

	}

	@Test(priority = 109)
	public void utilizacaoDosCreditosNaApuracaoVisualizar() {

		utilizacaoDosCreditosNaApuracaoVisualizar = new UtilizacaoDosCreditosNaApuracaoVisualizar();
		utilizacaoDosCreditosNaApuracaoVisualizar.beforeClass();
		utilizacaoDosCreditosNaApuracaoVisualizar.login();
		utilizacaoDosCreditosNaApuracaoVisualizar.acessarMDR();
		utilizacaoDosCreditosNaApuracaoVisualizar.visualizar();
		utilizacaoDosCreditosNaApuracaoVisualizar.afterClass();

	}

	@Test(priority = 110)
	public void utilizacaoDosCreditosNaApuracaoDetalhes() {

		utilizacaoDosCreditosNaApuracaoDetalhes = new UtilizacaoDosCreditosNaApuracaoDetalhes();
		utilizacaoDosCreditosNaApuracaoDetalhes.beforeClass();
		utilizacaoDosCreditosNaApuracaoDetalhes.login();
		utilizacaoDosCreditosNaApuracaoDetalhes.acessarMDR();
		utilizacaoDosCreditosNaApuracaoDetalhes.Detalhes();
		utilizacaoDosCreditosNaApuracaoDetalhes.afterClass();

	}

	@Test(priority = 111)
	public void utilizacaoDosCreditosNaApuracaoExcluir() {

		utilizacaoDosCreditosNaApuracaoExcluir = new UtilizacaoDosCreditosNaApuracaoExcluir();
		utilizacaoDosCreditosNaApuracaoExcluir.beforeClass();
		utilizacaoDosCreditosNaApuracaoExcluir.login();
		utilizacaoDosCreditosNaApuracaoExcluir.acessarMDR();
		utilizacaoDosCreditosNaApuracaoExcluir.excluir();
		utilizacaoDosCreditosNaApuracaoExcluir.afterClass();

		
	}
	
	@Test(priority = 112)
	public void utilizacaoDosCreditosNaApuracaoFiltroId() {

		utilizacaoDosCreditosNaApuracaoFiltroId = new UtilizacaoDosCreditosNaApuracaoFiltroId();
		utilizacaoDosCreditosNaApuracaoFiltroId.beforeClass();
		utilizacaoDosCreditosNaApuracaoFiltroId.login();
		utilizacaoDosCreditosNaApuracaoFiltroId.acessarMDR();
		utilizacaoDosCreditosNaApuracaoFiltroId.filtroId();
		utilizacaoDosCreditosNaApuracaoFiltroId.afterClass();

	}
	
	@Test(priority = 113)
	public void utilizacaoDosCreditosNaApuracaoExcluirEmMassa() {

		utilizacaoDosCreditosNaApuracaoExcluirEmMassa = new UtilizacaoDosCreditosNaApuracaoExcluirEmMassa();
		utilizacaoDosCreditosNaApuracaoExcluirEmMassa.beforeClass();
		utilizacaoDosCreditosNaApuracaoExcluirEmMassa.login();
		utilizacaoDosCreditosNaApuracaoExcluirEmMassa.acessarMDR();
		utilizacaoDosCreditosNaApuracaoExcluirEmMassa.criar();
		utilizacaoDosCreditosNaApuracaoExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------Controle De Credito Tributario > Utilizacao Dos Creditos Na Apuração Fin-------------------------");
	}
	

	//112
	
	// SPCB - Federais Retidos
		
	@Test(priority = 115)
	public void criarSPCB() {
		sPCBFederaisRetidosCriar = new SPCBFederaisRetidosCriar();
		sPCBFederaisRetidosCriar.beforeClass();
		sPCBFederaisRetidosCriar.login();
		sPCBFederaisRetidosCriar.acessarMDR();
		sPCBFederaisRetidosCriar.criar();
		sPCBFederaisRetidosCriar.afterClass();
	}
	
	@Test(priority = 116)
	public void editarSPCB() {
		sPCBFederaisRetidosEditar = new SPCBFederaisRetidosEditar();
		sPCBFederaisRetidosEditar.beforeClass();
		sPCBFederaisRetidosEditar.login();
		sPCBFederaisRetidosEditar.acessarMDR();
		sPCBFederaisRetidosEditar.editar();
		sPCBFederaisRetidosEditar.afterClass();
	}
	
	@Test(priority = 116)
	public void spcbFederaisRetidosDetalhes() {
		spcbFederaisRetidosDetalhes = new SPCBFederaisRetidosDetalhes();
		spcbFederaisRetidosDetalhes.beforeClass();
		spcbFederaisRetidosDetalhes.ingresar();
		spcbFederaisRetidosDetalhes.mdrEntrar();
		spcbFederaisRetidosDetalhes.detalhe();
		spcbFederaisRetidosDetalhes.afterClass();
	}
	
	@Test(priority = 116)
	public void spcbFederaisRetidosVisualizar() {
		spcbFederaisRetidosVisualizar = new SPCBFederaisRetidosVisualizar();
		spcbFederaisRetidosVisualizar.beforeClass();
		spcbFederaisRetidosVisualizar.ingresar();
		spcbFederaisRetidosVisualizar.mdrEntrar();
		spcbFederaisRetidosVisualizar.visualizar();
		spcbFederaisRetidosVisualizar.afterClass();
	}
	
	@Test(priority = 117)
	public void excluirSPCB() {
		sPCBFederaisRetidosExcluir = new SPCBFederaisRetidosExcluir();
		sPCBFederaisRetidosExcluir.beforeClass();
		sPCBFederaisRetidosExcluir.login();
		sPCBFederaisRetidosExcluir.acessarMDR();
		sPCBFederaisRetidosExcluir.excluirr();
		sPCBFederaisRetidosExcluir.afterClass();
	}
	

	@Test(priority = 118)
	public void excluirMassaSPCB() {
		sPCBFederaisRetidosExcluirMassa = new SPCBFederaisRetidosExcluirMassa();
		sPCBFederaisRetidosExcluirMassa.beforeClass();
		sPCBFederaisRetidosExcluirMassa.login();
		sPCBFederaisRetidosExcluirMassa.acessarMDR();
		sPCBFederaisRetidosExcluirMassa.criar();
		sPCBFederaisRetidosExcluirMassa.afterClass();
		System.out.println(
				"-------------------SPCB - Federais Retidos FIN-------------------------");
	}
	
	// Notas a Declarar Anexo III DIA-AM
	
	@Test(priority = 119)
	public void criarNotas() {
		System.out.println("-------------------Notas a Declarar Anexo III DIA-AM -------------------------");
		notasDeclararAnexoIIICriar = new NotasDeclararAnexoIIICriar();
		notasDeclararAnexoIIICriar.beforeClass();
		notasDeclararAnexoIIICriar.ingresar();
		notasDeclararAnexoIIICriar.mdrEntrar();
		notasDeclararAnexoIIICriar.criar();
		notasDeclararAnexoIIICriar.afterClass();
	}
	
	
	@Test(priority = 120)
	public void notasDeclararAnexoIIIEditar() {
		notasDeclararAnexoIIIEditar = new NotasDeclararAnexoIIIEditar();
		notasDeclararAnexoIIIEditar.beforeClass();
		notasDeclararAnexoIIIEditar.ingresar();
		notasDeclararAnexoIIIEditar.ingresarMDR();
		notasDeclararAnexoIIIEditar.editar();
		notasDeclararAnexoIIIEditar.afterClass();
	}
	
	@Test(priority = 121)
	public void detalheNotas() {
		notasDeclararAnexoIIIDetalhe = new NotasDeclararAnexoIIIDetalhe();
		notasDeclararAnexoIIIDetalhe.beforeClass();
		notasDeclararAnexoIIIDetalhe.ingresar();
		notasDeclararAnexoIIIDetalhe.mdrEntrar();
		notasDeclararAnexoIIIDetalhe.detalhe();
		notasDeclararAnexoIIIDetalhe.afterClass();
	}
	
	
	@Test(priority = 122)
	public void excluirNotas() {
		notasDeclararAnexoIIIExcluir = new NotasDeclararAnexoIIIExcluir();
		notasDeclararAnexoIIIExcluir.beforeClass();
		notasDeclararAnexoIIIExcluir.ingresar();
		notasDeclararAnexoIIIExcluir.mdrEntrar();
		notasDeclararAnexoIIIExcluir.excluir();
		notasDeclararAnexoIIIExcluir.afterClass();
	}

	
	@Test(priority = 123)
	public void excluirMassaNotas() {
		notasDeclararAnexoIIIExcluirMassa = new NotasDeclararAnexoIIIExcluirMassa();
		notasDeclararAnexoIIIExcluirMassa.beforeClass();
		notasDeclararAnexoIIIExcluirMassa.login();
		notasDeclararAnexoIIIExcluirMassa.acessarMDR();
		notasDeclararAnexoIIIExcluirMassa.criar();
		notasDeclararAnexoIIIExcluirMassa.afterClass();
		System.out.println("-------------------Notas a Declarar Anexo III DIA-AM FIN-------------------------");
	}


		

}