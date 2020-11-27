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
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoExcluir;
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
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURExcluir;
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
import com.timp.test.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoFiltros;
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
import com.timp.test.MDR.CodigoContabilizacao.CódigoContabilizaçãoExcluirMassa;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaCriar;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaDetalhes;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaEditar;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaExcluir;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaVisualizar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailCriar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailFiltroId;
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
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIExcluir;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIExcluirMassa;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosCriar;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosEditar;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosExcluir;
import com.timp.test.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosExcluirMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.LogradouroExcluirMassa;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluirEmMassa;

public class AutomacoesMDR1 extends TestBaseSteven {
	
	// Ajustes > Associação de Códigos de Ajustes
	AssociaçãoCodigoAjusteCriar associaçãoCodigoAjusteCriar;
	AssociaçãoCodigoAjusteEditar associaçãoCodigoAjusteEditar;
	AssociaçãoCodigoAjusteExcluir associaçãoCodigoAjusteExcluir;
	AssociaçãoCodigoAjusteDetalhe associaçãoCodigoAjusteDetalhe;
	AssociaçãoCodigoAjusteVisualizar associaçãoCodigoAjusteVisualizar;

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
	AtivaçaoParaMunicipioFiltroID ativaçaoParaMunicipioFiltroID;

	// Atividades Fiscais > Atividades Fiscais

	AtividadeCriar atividadeCriar;
	AtividadeEditar atividadeEditar;
	AtividadeEliminar atividadeEliminar;
	AtividadeFiltro atividadeFiltro;
	AtividadeVisualizar atividadeVisualizar;
	AtividadeExcluirMassa atividadeExcluirMassa;
	
	// Atividades Fiscais > Associação de Atividades Fiscais

	AssociaçãoExcluir associaçãoExcluir;
	
	// Atividades Fiscais > Grupo Atividades Fiscais

	GrupoAtividadeCriar grupoAtividadeCriar;
	GrupoAtividadeEditar grupoAtividadeEditar;
	GrupoAtividadeVisualizar grupoAtividadeVisualizar;
	GrupoAtividadeExcluir grupoAtividadeExcluir;
	GrupoAtividadeExcluirMassa grupoAtividadeExcluirMassa;
	GrupoAtividadeFiscalDetalle grupoAtividadeFiscalDetalle;
	
	// Cadastro da Condição

	CadastroCondicaoCriar cadastroCondicaoCriar;
	CadasatroCondicaoVisualizar cadasatroCondicaoVisualizar;
	CadastroCondicaoEditar cadastroCondicaoEditar;
	CadastroCondicaoExcluir cadastroCondicaoExcluir;
	cadastrocondicaoDetalle cadastroCondicaoDetalle;

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
	InstitucaoDetalhes institucaoDetalhes;
	
	// Cadastros IRPJ/CSLL > Contas ParteB LALUR/LACS

	ContasParteBLALURCriar contasParteBLALURCriar;
	ContasParteBLALURExcluir contasParteBLALURExcluir;

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

	// Código da Receita
	CodigoReceitaCriar codigoReceitaCriar;
	CodigoReceitaDetalhes codigoReceitaDetalhes;
	CodigoReceitaEditar codigoReceitaEditar;
	CodigoReceitaVisualizar codigoReceitaVisualizar;
	CodigoReceitaExcluir codigoReceitaExcluir;

	// Configuração do Fundo Socail
	ConfiguracaoFundoSocailCriar configuracaoFundoSocailCriar;
	ConfiguracaoFundoSocailFiltroId configuracaoFundoSocailFiltroId;
	
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
	SPCBFederaisRetidosExcluirMassa sPCBFederaisRetidosExcluirMassa;
	
	// Notas a Declarar Anexo III DIA-AM
	NotasDeclararAnexoIIICriar notasDeclararAnexoIIICriar;
	NotasDeclararAnexoIIIDetalhe notasDeclararAnexoIIIDetalhe;
	NotasDeclararAnexoIIIExcluir notasDeclararAnexoIIIExcluir;
	NotasDeclararAnexoIIIExcluirMassa notasDeclararAnexoIIIExcluirMassa;
	
	// --------------------------------------------------------------------------------------------------
	
	// Ajustes > Associação de Códigos de Ajustes

	@Test(priority = 0)
	public void associaçãoCodigoAjusteCriar() {

		System.out.println("-------------------Ajustes > Associação de Códigos de Ajustes-------------------------");

		associaçãoCodigoAjusteCriar = new AssociaçãoCodigoAjusteCriar();
		associaçãoCodigoAjusteCriar.beforeClass();
		associaçãoCodigoAjusteCriar.ingresar();
		associaçãoCodigoAjusteCriar.ingresarMDR();
		associaçãoCodigoAjusteCriar.criarAssociaçãoCodigoAjuste();
		associaçãoCodigoAjusteCriar.afterClass();

	}
	
	@Test(priority = 1)
	public void associaçãoCodigoAjusteEditar() {

		associaçãoCodigoAjusteEditar = new AssociaçãoCodigoAjusteEditar();
		associaçãoCodigoAjusteEditar.beforeClass();
		associaçãoCodigoAjusteEditar.ingresar();
		associaçãoCodigoAjusteEditar.ingresarMDR();
		associaçãoCodigoAjusteEditar.associaçãoCodigoAjusteEditar();
		associaçãoCodigoAjusteEditar.afterClass();

	}
	
	@Test(priority = 2)
	public void associaçãoCodigoAjusteExcluir() {

		associaçãoCodigoAjusteExcluir = new AssociaçãoCodigoAjusteExcluir();
		associaçãoCodigoAjusteExcluir.beforeClass();
		associaçãoCodigoAjusteExcluir.ingresar();
		associaçãoCodigoAjusteExcluir.ingresarMDR();
		associaçãoCodigoAjusteExcluir.excluirAssociaçãoCodigoAjuste();
		associaçãoCodigoAjusteExcluir.afterClass();

	}
	
	@Test(priority = 3)
	public void associaçãoCodigoAjusteDetalhe() {

		associaçãoCodigoAjusteDetalhe = new AssociaçãoCodigoAjusteDetalhe();
		associaçãoCodigoAjusteDetalhe.beforeClass();
		associaçãoCodigoAjusteDetalhe.ingresar();
		associaçãoCodigoAjusteDetalhe.ingresarMDR();
		associaçãoCodigoAjusteDetalhe.detalhe();
		associaçãoCodigoAjusteDetalhe.afterClass();

	}
	
	@Test(priority = 3)
	public void associaçãoCodigoAjusteVisualizar() {

		associaçãoCodigoAjusteVisualizar = new AssociaçãoCodigoAjusteVisualizar();
		associaçãoCodigoAjusteVisualizar.beforeClass();
		associaçãoCodigoAjusteVisualizar.ingresar();
		associaçãoCodigoAjusteVisualizar.ingresarMDR();
		associaçãoCodigoAjusteVisualizar.visualizarAssociaçãoCodigoAjuste();
		associaçãoCodigoAjusteVisualizar.afterClass();
		
		System.out.println("-------------------Ajustes > Associação de Códigos de Ajustes Fin-------------------------");
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
	
	@Test(priority = 17)
	public void ativacaoParaMunicipioFiltroID() {

		ativaçaoParaMunicipioFiltroID = new AtivaçaoParaMunicipioFiltroID();
		ativaçaoParaMunicipioFiltroID.beforeClass();
		ativaçaoParaMunicipioFiltroID.login();
		ativaçaoParaMunicipioFiltroID.acessarMDR();
		ativaçaoParaMunicipioFiltroID.filtro();
		ativaçaoParaMunicipioFiltroID.afterClass();

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

	@Test(priority = 21)
	public void atividadeFiscalVisualizar() {

		atividadeVisualizar = new AtividadeVisualizar();
		atividadeVisualizar.beforeClass();
		atividadeVisualizar.login();
		atividadeVisualizar.acessarMDR();
		atividadeVisualizar.visualizar();
		atividadeVisualizar.afterClass();

	}

	@Test(priority = 22)
	public void atividadeFiscalFiltro() {

		atividadeFiltro = new AtividadeFiltro();
		atividadeFiltro.beforeClass();
		atividadeFiltro.login();
		atividadeFiltro.acessarMDR();
		atividadeFiltro.filtro();
		atividadeFiltro.afterClass();

	}

	@Test(priority = 23)
	public void atividadeFiscalExcluir() {

		atividadeEliminar = new AtividadeEliminar();
		atividadeEliminar.beforeClass();
		atividadeEliminar.login();
		atividadeEliminar.acessarMDR();
		atividadeEliminar.eliminar();
		atividadeEliminar.afterClass();

	}
	
	@Test(priority = 24)
	public void atividadeExcluirMassa() {

		atividadeExcluirMassa = new AtividadeExcluirMassa();
		atividadeExcluirMassa.beforeClass();
		atividadeExcluirMassa.login();
		atividadeExcluirMassa.acessarMDR();
		atividadeExcluirMassa.criar();
		atividadeExcluirMassa.excluirMassa();
		atividadeExcluirMassa.afterClass();

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
	
	@Test(priority = 26)
	public void grupoAtividadeFiscalDetalle() {

		grupoAtividadeFiscalDetalle = new GrupoAtividadeFiscalDetalle();
		grupoAtividadeFiscalDetalle.beforeClass();
		grupoAtividadeFiscalDetalle.ingresar();
		grupoAtividadeFiscalDetalle.ingresarMDR();
		grupoAtividadeFiscalDetalle.detalle();
		grupoAtividadeFiscalDetalle.afterClass();

	}

	@Test(priority = 26)
	public void grupoAtividadeFiscalVisualizar() {

		grupoAtividadeVisualizar = new GrupoAtividadeVisualizar();
		grupoAtividadeVisualizar.beforeClass();
		grupoAtividadeVisualizar.login();
		grupoAtividadeVisualizar.acessarMDR();
		grupoAtividadeVisualizar.visualizar();
		grupoAtividadeVisualizar.afterClass();
	}
	
	@Test(priority = 27)
	public void grupoAtividadeFiscalExcluir() {

		grupoAtividadeExcluir = new GrupoAtividadeExcluir();
		grupoAtividadeExcluir.beforeClass();
		grupoAtividadeExcluir.ingresar();
		grupoAtividadeExcluir.mdrEntrar();
		grupoAtividadeExcluir.excluir();
		grupoAtividadeExcluir.afterClass();

	}
	
	@Test(priority = 28)
	public void grupoAtividadeFiscalExcluirMassa() {

		grupoAtividadeExcluirMassa = new GrupoAtividadeExcluirMassa();
		grupoAtividadeExcluirMassa.beforeClass();
		grupoAtividadeExcluirMassa.login();
		grupoAtividadeExcluirMassa.acessarMDR();
		grupoAtividadeExcluirMassa.excluirMassa();
		grupoAtividadeExcluirMassa.afterClass();

		System.out.println("-------------------Atividade Fiscal > Grupo Atividade Fiscal Fin-------------------------");
	}

	// Cadastro da Condição

	@Test(priority = 29)
	public void cadastroCondicaoCriar() {

		System.out.println("-------------------Cadastro da Condição-------------------------");

		cadastroCondicaoCriar = new CadastroCondicaoCriar();
		cadastroCondicaoCriar.beforeClass();
		cadastroCondicaoCriar.login();
		cadastroCondicaoCriar.acessarMDR();
		cadastroCondicaoCriar.criar();
		cadastroCondicaoCriar.afterClass();

	}

	@Test(priority = 30)
	public void cadastroCondicaoEditar() {

		cadastroCondicaoEditar = new CadastroCondicaoEditar();
		cadastroCondicaoEditar.beforeClass();
		cadastroCondicaoEditar.login();
		cadastroCondicaoEditar.acessarMDR();
		cadastroCondicaoEditar.editar();
		cadastroCondicaoEditar.afterClass();

	}

	@Test(priority = 30)
	public void cadastroCondicaoDetalle() {

		cadastroCondicaoDetalle = new cadastrocondicaoDetalle();
		cadastroCondicaoDetalle.beforeClass();
		cadastroCondicaoDetalle.ingresar();
		cadastroCondicaoDetalle.ingresarMDR();
		cadastroCondicaoDetalle.detalle();
		cadastroCondicaoDetalle.afterClass();

	}
	@Test(priority = 31)
	public void cadastroCondicaoVisualizar() {

		cadasatroCondicaoVisualizar = new CadasatroCondicaoVisualizar();
		cadasatroCondicaoVisualizar.beforeClass();
		cadasatroCondicaoVisualizar.login();
		cadasatroCondicaoVisualizar.acessarMDR();
		cadasatroCondicaoVisualizar.visualizar();
		cadasatroCondicaoVisualizar.afterClass();

	}

	@Test(priority = 32)
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

	@Test(priority = 33)
	public void instituicaoFinanceiraCriar() {

		System.out.println("-------------------Cadastro Derex > Insituição Financeira-------------------------");

		instituicaoCriar = new InstituicaoCriar();
		instituicaoCriar.beforeClass();
		instituicaoCriar.login();
		instituicaoCriar.acessarMDR();
		instituicaoCriar.criar();
		instituicaoCriar.afterClass();

	}

	@Test(priority = 34)
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
	
	@Test(priority = 35)
	public void institucaoDetalhes() {

		institucaoDetalhes = new InstitucaoDetalhes();
		institucaoDetalhes.beforeClass();
		institucaoDetalhes.login();
		institucaoDetalhes.acessarMDR();
		institucaoDetalhes.detalhes();
		institucaoDetalhes.afterClass();

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

	@Test(priority = 76)
	public void codigoContabilizacaoVisualizar() {

		codigoContabalizacaoVisualizar = new CodigoContabalizacaoVisualizar();
		codigoContabalizacaoVisualizar.beforeClass();
		codigoContabalizacaoVisualizar.login();
		codigoContabalizacaoVisualizar.acessarMDR();
		codigoContabalizacaoVisualizar.visualizar();
		codigoContabalizacaoVisualizar.afterClass();

	}
	
	@Test(priority = 76)
	public void codigoContabalizacaoDetalhes() {

		codigoContabalizacaoDetalhes = new CodigoContabalizacaoDetalhes();
		codigoContabalizacaoDetalhes.beforeClass();
		codigoContabalizacaoDetalhes.login();
		codigoContabalizacaoDetalhes.acessarMDR();
		codigoContabalizacaoDetalhes.detalhes();
		codigoContabalizacaoDetalhes.afterClass();

	}
	@Test(priority = 76)
	public void códigoContabilizaçãoExcluirMassa() {

		códigoContabilizaçãoExcluirMassa = new CódigoContabilizaçãoExcluirMassa();
		códigoContabilizaçãoExcluirMassa.beforeClass();
		códigoContabilizaçãoExcluirMassa.login();
		códigoContabilizaçãoExcluirMassa.acessarMDR();
		códigoContabilizaçãoExcluirMassa.criar();
		códigoContabilizaçãoExcluirMassa.afterClass();

	}


	@Test(priority = 77)
	public void codigoContabilizacaoExcluir() {

		codigoContabilizacaoExcluir = new CodigoContabilizacaoExcluir();
		codigoContabilizacaoExcluir.beforeClass();
		codigoContabilizacaoExcluir.login();
		codigoContabilizacaoExcluir.acessarMDR();
		codigoContabilizacaoExcluir.excluir();
		codigoContabilizacaoExcluir.afterClass();

		System.out.println("-------------------Codigo Contabilização Fin-------------------------");
	}

	// Código da Receita

	@Test(priority = 78)
	public void codigoReceitaCriar() {

		System.out.println("-------------------Código da Receita-------------------------");

		codigoReceitaCriar = new CodigoReceitaCriar();
		codigoReceitaCriar.beforeClass();
		codigoReceitaCriar.login();
		codigoReceitaCriar.acessarMDR();
		codigoReceitaCriar.criar();
		codigoReceitaCriar.afterClass();

	}

	@Test(priority = 79)
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

	@Test(priority = 81)
	public void codigoReceitaVisualizar() {

		codigoReceitaVisualizar = new CodigoReceitaVisualizar();
		codigoReceitaVisualizar.beforeClass();
		codigoReceitaVisualizar.login();
		codigoReceitaVisualizar.acessarMDR();
		codigoReceitaVisualizar.visualizar();
		codigoReceitaVisualizar.afterClass();

	}

	@Test(priority = 82)
	public void codigoReceitaExcluir() {

		codigoReceitaExcluir = new CodigoReceitaExcluir();
		codigoReceitaExcluir.beforeClass();
		codigoReceitaExcluir.login();
		codigoReceitaExcluir.acessarMDR();
		codigoReceitaExcluir.excluir();
		codigoReceitaExcluir.afterClass();

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
	
	@Test(priority = 83)
	public void configuracaoFundoSocailFiltroId() {

		configuracaoFundoSocailFiltroId = new ConfiguracaoFundoSocailFiltroId();
		configuracaoFundoSocailFiltroId.beforeClass();
		configuracaoFundoSocailFiltroId.login();
		configuracaoFundoSocailFiltroId.acessarMDR();
		configuracaoFundoSocailFiltroId.filtroId();
		configuracaoFundoSocailFiltroId.afterClass();

	}


	// Contrato IOF

	@Test(priority = 84)
	public void contratoIOFCriar() {

		System.out.println("-------------------Contrato IOF-------------------------");

		contratoIOFCriar = new ContratoIOFCriar();
		contratoIOFCriar.beforeClass();
		contratoIOFCriar.login();
		contratoIOFCriar.acessarMDR();
		contratoIOFCriar.criar();
		contratoIOFCriar.afterClass();

	}

	@Test(priority = 85)
	public void contratoIOFEditar() {

		contratoIOFEditar = new ContratoIOFEditar();
		contratoIOFEditar.beforeClass();
		contratoIOFEditar.login();
		contratoIOFEditar.acessarMDR();
		contratoIOFEditar.editar();
		contratoIOFEditar.afterClass();

	}

	@Test(priority = 86)
	public void contratoIOFVisualizar() {

		contratoIOFVisualizar = new ContratoIOFVisualizar();
		contratoIOFVisualizar.beforeClass();
		contratoIOFVisualizar.login();
		contratoIOFVisualizar.acessarMDR();
		contratoIOFVisualizar.visualizar();
		contratoIOFVisualizar.afterClass();

	}
	@Test(priority = 86)
	public void contratoIOFDetalhes() {

		contratoIOFDetalhes = new ContratoIOFDetalhes();
		contratoIOFDetalhes.beforeClass();
		contratoIOFDetalhes.login();
		contratoIOFDetalhes.acessarMDR();
		contratoIOFDetalhes.Detalhes();
		contratoIOFDetalhes.afterClass();

	}

	@Test(priority = 87)
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

	@Test(priority = 88)
	public void codigosDeCreditoCriarFiscalCriar() {

		System.out
				.println("-------------------Controle De crédito Tributario > Código Crédito-------------------------");

		codigosDeCreditoCriar = new CodigosDeCreditoCriar();
		codigosDeCreditoCriar.beforeClass();
		codigosDeCreditoCriar.login();
		codigosDeCreditoCriar.acessarMDR();
		codigosDeCreditoCriar.criar();
		codigosDeCreditoCriar.afterClass();

	}

	@Test(priority = 89)
	public void codigosDeCreditoEditar() {

		codigosDeCreditoEditar = new CodigosDeCreditoEditar();
		codigosDeCreditoEditar.beforeClass();
		codigosDeCreditoEditar.login();
		codigosDeCreditoEditar.acessarMDR();
		codigosDeCreditoEditar.editar();
		codigosDeCreditoEditar.afterClass();

	}

	@Test(priority = 90)
	public void codigosDeCreditoVisualizar() {

		codigosDeCreditoVisualizar = new CodigosDeCreditoVisualizar();
		codigosDeCreditoVisualizar.beforeClass();
		codigosDeCreditoVisualizar.login();
		codigosDeCreditoVisualizar.acessarMDR();
		codigosDeCreditoVisualizar.visualizar();
		codigosDeCreditoVisualizar.afterClass();

	}

	@Test(priority = 91)
	public void codigosDeCreditoDetalhes() {

		codigosDeCreditoDetalhes = new CodigosDeCreditoDetalhes();
		codigosDeCreditoDetalhes.beforeClass();
		codigosDeCreditoDetalhes.login();
		codigosDeCreditoDetalhes.acessarMDR();
		codigosDeCreditoDetalhes.Detalhes();
		codigosDeCreditoDetalhes.afterClass();

	}

	@Test(priority = 92)
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

	@Test(priority = 93)
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

	@Test(priority = 94)
	public void limiteDeCreditoAUtilizarEditar() {

		limiteDeCreditoAUtilizarEditar = new LimiteDeCreditoAUtilizarEditar();
		limiteDeCreditoAUtilizarEditar.beforeClass();
		limiteDeCreditoAUtilizarEditar.login();
		limiteDeCreditoAUtilizarEditar.acessarMDR();
		limiteDeCreditoAUtilizarEditar.editar();
		limiteDeCreditoAUtilizarEditar.afterClass();

	}

	@Test(priority = 95)
	public void limiteDeCreditoAUtilizarVisualizar() {

		limiteDeCreditoAUtilizarVisualizar = new LimiteDeCreditoAUtilizarVisualizar();
		limiteDeCreditoAUtilizarVisualizar.beforeClass();
		limiteDeCreditoAUtilizarVisualizar.login();
		limiteDeCreditoAUtilizarVisualizar.acessarMDR();
		limiteDeCreditoAUtilizarVisualizar.visualizar();
		limiteDeCreditoAUtilizarVisualizar.afterClass();

	}

	@Test(priority = 96)
	public void limiteDeCreditoAUtilizarDetalhes() {

		limiteDeCreditoAUtilizarDetalhes = new LimiteDeCreditoAUtilizarDetalhes();
		limiteDeCreditoAUtilizarDetalhes.beforeClass();
		limiteDeCreditoAUtilizarDetalhes.login();
		limiteDeCreditoAUtilizarDetalhes.acessarMDR();
		limiteDeCreditoAUtilizarDetalhes.detalhes();
		limiteDeCreditoAUtilizarDetalhes.afterClass();

	}
	
	@Test(priority = 22)
	public void limiteDeCreditoAUtilizarFiltroID() {

		limiteDeCreditoAUtilizarFiltroId = new LimiteDeCreditoAUtilizarFiltroId();
		limiteDeCreditoAUtilizarFiltroId.beforeClass();
		limiteDeCreditoAUtilizarFiltroId.login();
		limiteDeCreditoAUtilizarFiltroId.acessarMDR();
		limiteDeCreditoAUtilizarFiltroId.filtroId();
		limiteDeCreditoAUtilizarFiltroId.afterClass();

	}


	@Test(priority = 97)
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

	@Test(priority = 98)
	public void utilizacaoDosCreditosEmPeriodoAnteriorCriarCriar() {

		System.out.println(
				"-------------------Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior-------------------------");

		utilizacaoDosCreditosEmPeriodoAnteriorCriar = new UtilizacaoDosCreditosEmPeriodoAnteriorCriar();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.login();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.criar();
		utilizacaoDosCreditosEmPeriodoAnteriorCriar.afterClass();

	}

	@Test(priority = 99)
	public void utilizacaoDosCreditosEmPeriodoAnteriorCriarEditar() {

		utilizacaoDosCreditosEmPeriodoAnteriorEditar = new UtilizacaoDosCreditosEmPeriodoAnteriorEditar();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.login();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.editar();
		utilizacaoDosCreditosEmPeriodoAnteriorEditar.afterClass();

	}

	@Test(priority = 100)
	public void utilizacaoDosCreditosEmPeriodoAnteriorCriarDetalhes() {

		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes = new UtilizacaoDosCreditosEmPeriodoAnteriorDetalhes();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.login();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.detalhes();
		utilizacaoDosCreditosEmPeriodoAnteriorDetalhes.afterClass();

	}

	@Test(priority = 101)
	public void utilizacaoDosCreditosEmPeriodoAnteriorVisualizar() {

		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar = new UtilizacaoDosCreditosEmPeriodoAnteriorVisualizar();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.login();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.Visualizar();
		utilizacaoDosCreditosEmPeriodoAnteriorVisualizar.afterClass();

	}

	@Test(priority = 102)
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

	@Test(priority = 103)
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

	@Test(priority = 104)
	public void utilizacaoDosCreditosNaApuracaoEditar() {

		utilizacaoDosCreditosNaApuracaoEditar = new UtilizacaoDosCreditosNaApuracaoEditar();
		utilizacaoDosCreditosNaApuracaoEditar.beforeClass();
		utilizacaoDosCreditosNaApuracaoEditar.login();
		utilizacaoDosCreditosNaApuracaoEditar.acessarMDR();
		utilizacaoDosCreditosNaApuracaoEditar.editar();
		utilizacaoDosCreditosNaApuracaoEditar.afterClass();

	}

	@Test(priority = 105)
	public void utilizacaoDosCreditosNaApuracaoVisualizar() {

		utilizacaoDosCreditosNaApuracaoVisualizar = new UtilizacaoDosCreditosNaApuracaoVisualizar();
		utilizacaoDosCreditosNaApuracaoVisualizar.beforeClass();
		utilizacaoDosCreditosNaApuracaoVisualizar.login();
		utilizacaoDosCreditosNaApuracaoVisualizar.acessarMDR();
		utilizacaoDosCreditosNaApuracaoVisualizar.visualizar();
		utilizacaoDosCreditosNaApuracaoVisualizar.afterClass();

	}

	@Test(priority = 106)
	public void utilizacaoDosCreditosNaApuracaoDetalhes() {

		utilizacaoDosCreditosNaApuracaoDetalhes = new UtilizacaoDosCreditosNaApuracaoDetalhes();
		utilizacaoDosCreditosNaApuracaoDetalhes.beforeClass();
		utilizacaoDosCreditosNaApuracaoDetalhes.login();
		utilizacaoDosCreditosNaApuracaoDetalhes.acessarMDR();
		utilizacaoDosCreditosNaApuracaoDetalhes.Detalhes();
		utilizacaoDosCreditosNaApuracaoDetalhes.afterClass();

	}

	@Test(priority = 107)
	public void utilizacaoDosCreditosNaApuracaoExcluir() {

		utilizacaoDosCreditosNaApuracaoExcluir = new UtilizacaoDosCreditosNaApuracaoExcluir();
		utilizacaoDosCreditosNaApuracaoExcluir.beforeClass();
		utilizacaoDosCreditosNaApuracaoExcluir.login();
		utilizacaoDosCreditosNaApuracaoExcluir.acessarMDR();
		utilizacaoDosCreditosNaApuracaoExcluir.excluir();
		utilizacaoDosCreditosNaApuracaoExcluir.afterClass();

		
	}
	
	@Test(priority = 22)
	public void utilizacaoDosCreditosNaApuracaoFiltroId() {

		utilizacaoDosCreditosNaApuracaoFiltroId = new UtilizacaoDosCreditosNaApuracaoFiltroId();
		utilizacaoDosCreditosNaApuracaoFiltroId.beforeClass();
		utilizacaoDosCreditosNaApuracaoFiltroId.login();
		utilizacaoDosCreditosNaApuracaoFiltroId.acessarMDR();
		utilizacaoDosCreditosNaApuracaoFiltroId.filtroId();
		utilizacaoDosCreditosNaApuracaoFiltroId.afterClass();

	}
	
	@Test(priority = 108)
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
	
	// Atividades Fiscais > Associação de Atividades Fiscais
	//108
	@Test(priority = 109)
	public void excluirAssociacao() {
		associaçãoExcluir = new AssociaçãoExcluir();
		associaçãoExcluir.beforeClass();
		associaçãoExcluir.login();
		associaçãoExcluir.acessarMDR();
		associaçãoExcluir.excluirr();
		associaçãoExcluir.afterClass();
		

	}

	//112
	
	// SPCB - Federais Retidos
		
	@Test(priority = 113)
	public void criarSPCB() {
		sPCBFederaisRetidosCriar = new SPCBFederaisRetidosCriar();
		sPCBFederaisRetidosCriar.beforeClass();
		sPCBFederaisRetidosCriar.login();
		sPCBFederaisRetidosCriar.acessarMDR();
		sPCBFederaisRetidosCriar.criar();
		sPCBFederaisRetidosCriar.afterClass();
	}
	
	@Test(priority = 114)
	public void editarSPCB() {
		sPCBFederaisRetidosEditar = new SPCBFederaisRetidosEditar();
		sPCBFederaisRetidosEditar.beforeClass();
		sPCBFederaisRetidosEditar.login();
		sPCBFederaisRetidosEditar.acessarMDR();
		sPCBFederaisRetidosEditar.editar();
		sPCBFederaisRetidosEditar.afterClass();
	}
	@Test(priority = 115)
	public void excluirSPCB() {
		sPCBFederaisRetidosExcluir = new SPCBFederaisRetidosExcluir();
		sPCBFederaisRetidosExcluir.beforeClass();
		sPCBFederaisRetidosExcluir.login();
		sPCBFederaisRetidosExcluir.acessarMDR();
		sPCBFederaisRetidosExcluir.excluirr();
		sPCBFederaisRetidosExcluir.afterClass();
	}
	@Test(priority = 116)
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
	
	@Test(priority = 117)
	public void criarMassaNotas() {
		System.out.println("-------------------Notas a Declarar Anexo III DIA-AM -------------------------");
		notasDeclararAnexoIIICriar = new NotasDeclararAnexoIIICriar();
		notasDeclararAnexoIIICriar.beforeClass();
		notasDeclararAnexoIIICriar.ingresar();
		notasDeclararAnexoIIICriar.mdrEntrar();
		notasDeclararAnexoIIICriar.criar();
		notasDeclararAnexoIIICriar.afterClass();
	}
	
	@Test(priority = 118)
	public void detalheMassaNotas() {
		notasDeclararAnexoIIIDetalhe = new NotasDeclararAnexoIIIDetalhe();
		notasDeclararAnexoIIIDetalhe.beforeClass();
		notasDeclararAnexoIIIDetalhe.ingresar();
		notasDeclararAnexoIIIDetalhe.mdrEntrar();
		notasDeclararAnexoIIIDetalhe.detalhe();
		notasDeclararAnexoIIIDetalhe.afterClass();
	}
	
	@Test(priority = 119)
	public void excluirNotas() {
		notasDeclararAnexoIIIExcluir = new NotasDeclararAnexoIIIExcluir();
		notasDeclararAnexoIIIExcluir.beforeClass();
		notasDeclararAnexoIIIExcluir.ingresar();
		notasDeclararAnexoIIIExcluir.mdrEntrar();
		notasDeclararAnexoIIIExcluir.excluir();
		notasDeclararAnexoIIIExcluir.afterClass();
	}
	
	@Test(priority = 120)
	public void excluirMassaNotas() {
		notasDeclararAnexoIIIExcluirMassa = new NotasDeclararAnexoIIIExcluirMassa();
		notasDeclararAnexoIIIExcluirMassa.beforeClass();
		notasDeclararAnexoIIIExcluirMassa.login();
		notasDeclararAnexoIIIExcluirMassa.acessarMDR();
		notasDeclararAnexoIIIExcluirMassa.criar();
		notasDeclararAnexoIIIExcluirMassa.afterClass();
		System.out.println("-------------------Notas a Declarar Anexo III DIA-AM FIN-------------------------");
	}
	//120
		

}