package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

 
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO;
import com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPFiltroID;
import com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPICriar;
import com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPIDetalhes;
import com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPIEditar;
import com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPIFiltrosAvan�ados;
import com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPIVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�aoCreditosCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�aoCreditosExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�oesCreditosEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�oesCreditosExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPICriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPIDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPIEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPIExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPIExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPIVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoFiltrosAvan�ados;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObriga�oesDeICMSaRecolherCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObriga�oesDeICMSaRecolherDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObriga�oesDeICMSaRecolherEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObriga�oesDeICMSaRecolherExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObriga�oesDeICMSaRecolherVisualizar;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalCriar;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalDetalhes;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalEditar;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalExcluir;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalVisualizar;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSCriar;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSDetalhes;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSEditar;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSExcluir;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSVisualizar;
import com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisCriar;
import com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisDetalhes;
import com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisEditar;
import com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisExcluir;
import com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisVisualizar;
import com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Obserba�oesdoDocumentoFiscalExcluir;
import com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalCriar;
import com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalDetalhes;
import com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalEditar;
import com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalVisualizar;
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
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroVisualizar;

public class AutomacoesMDR3 extends TestBaseSteven {

	// Tabelas de Apoio do Sped > Classifica��o De Contribuentes Do IPI

	Classifica�aoDeContribuintesDoIPICriar classifica�aoDeContribuintesDoIPICriar;
	Classifica�aoDeContribuintesDoIPIDetalhes classifica�aoDeContribuintesDoIPIDetalhes;
	Classifica�aoDeContribuintesDoIPIEditar classifica�aoDeContribuintesDoIPIEditar;
	Classifica�aoDeContribuintesDoIPIFiltrosAvan�ados classifica�aoDeContribuintesDoIPIFiltrosAvan�ados;
	Classifica�aoDeContribuintesDoIPIVisualizar classifica�aoDeContribuintesDoIPIVisualizar;

	// Tabelas de Apoio do Sped > C�digo de Ajustes Contribui��es de Cr�ditos
	
	CodigoAjustesContribui�oesCreditosEditar codigoAjustesContribui�oesCreditosEditar;
	CodigoAjustesContribui�aoCreditosCriar codigoAjustesContribui�aoCreditosCriar;
	CodigoAjustesContribui�aoCreditosExcluir codigoAjustesContribui�aoCreditosExcluir;
	CodigoAjustesContribui�oesCreditosExcluirEmMassa codigoAjustesContribui�oesCreditosExcluirEmMassa;

	// Tabelas de Apoio do Sped > C�digo de Codigo de Contribui��o Social Apurada

	CodigoContribui�aoSocialApuradaCriar codigoContribui�aoSocialApuradaCriar;
	CodigoContribui�aoSocialApuradaDetalhes codigoContribui�aoSocialApuradaDetalhes;
	CodigoContribui�aoSocialApuradaEditar codigoContribui�aoSocialApuradaEditar;
	CodigoContribui�aoSocialApuradaExcluir codigoContribui�aoSocialApuradaExcluir;
	CodigoContribui�aoSocialApuradaVisualizar codigoContribui�aoSocialApuradaVisualizar;

	// 4.5.4 Tabelas de Apoio do Sped > C�digo de Ajuste da Apura��o do IPI

	CodigoDeAjusteDaApura�aoDoIPICriar codigoDeAjusteDaApura�aoDoIPICriar;
	CodigoDeAjusteDaApura�aoDoIPIDetalhes codigoDeAjusteDaApura�aoDoIPIDetalhes;
	CodigoDeAjusteDaApura�aoDoIPIEditar codigoDeAjusteDaApura�aoDoIPIEditar;
	CodigoDeAjusteDaApura�aoDoIPIExcluir codigoDeAjusteDaApura�aoDoIPIExcluir;
	CodigoDeAjusteDaApura�aoDoIPIVisualizar codigoDeAjusteDaApura�aoDoIPIVisualizar;
	CodigoDeAjusteDaApura�aoDoIPIExcluirEmMassa codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa;

	// 5.4 Tabelas de Apoio do Sped > C�digos das Obrigac�es de ICMS a Recolher

	CodigosDasObriga�oesDeICMSaRecolherCriar codigosDasObriga�oesDeICMSaRecolherCriar;
	CodigosDasObriga�oesDeICMSaRecolherDetalhes codigosDasObriga�oesDeICMSaRecolherDetalhes;
	CodigosDasObriga�oesDeICMSaRecolherEditar codigosDasObriga�oesDeICMSaRecolherEditar;
	CodigosDasObriga�oesDeICMSaRecolherExcluir codigosDasObriga�oesDeICMSaRecolherExcluir;
	CodigosDasObriga�oesDeICMSaRecolherVisualizar codigosDasObriga�oesDeICMSaRecolherVisualizar;

	// 4.3.6 Tabelas de Apoio do Sped > C�digo Tipo Cr�dito

	CodigoTipoCreditoCriar codigoTipoCreditoCriar;
	CodigoTipoCreditoDetalhes codigoTipoCreditoDetalhes;
	CodigoTipoCreditoEditar codigoTipoCreditoEditar;
	CodigoTipoCreditoExcluir codigoTipoCreditoExcluir;
	CodigoTipoCreditoFiltrosAvan�ados codigoTipoCreditoFiltrosAvan�ados;
	CodigoTipoCreditoVisualizar codigoTipoCreditoVisualizar;

	// Tabelas de Apoio do Sped > De Para Livro Apura��o X Sped Fiscal (DE X Para)

	DeParaLivroApura�aoXSpedFiscalCriar deParaLivroApura�aoXSpedFiscalCriar;
	DeParaLivroApura�aoXSpedFiscalDetalhes deParaLivroApura�aoXSpedFiscalDetalhes;
	DeParaLivroApura�aoXSpedFiscalEditar deParaLivroApura�aoXSpedFiscalEditar;
	DeParaLivroApura�aoXSpedFiscalExcluir deParaLivroApura�aoXSpedFiscalExcluir;
	DeParaLivroApura�aoXSpedFiscalVisualizar deParaLivroApura�aoXSpedFiscalVisualizar;

	// 4.1.1 Tabelas de Apoio do Sped > Documentos Fiscais ICMS

	DocumentosFiscaisICMSCriar documentosFiscaisICMSCriar;
	DocumentosFiscaisICMSDetalhes documentosFiscaisICMSDetalhes;
	DocumentosFiscaisICMSEditar documentosFiscaisICMSEditar;
	DocumentosFiscaisICMSExcluir documentosFiscaisICMSExcluir;
	DocumentosFiscaisICMSVisualizar documentosFiscaisICMSVisualizar;
	DocumentosFiscaisICMSExcluirEmMassa documentosFiscaisICMSExcluirEmMassa;

	// 5.2 Tabelas de Apoio do Sped > Informa��es Adicionais

	Informa�oesAdicionaisCriar informa�oesAdicionaisCriar;
	Informa�oesAdicionaisDetalhes informa�oesAdicionaisDetalhes;
	Informa�oesAdicionaisEditar informa�oesAdicionaisEditar;
	Informa�oesAdicionaisExcluir informa�oesAdicionaisExcluir;
	Informa�oesAdicionaisVisualizar informa�oesAdicionaisVisualizar;
	Informa�oesAdicionaisExcluirEmMassa informa�oesAdicionaisExcluirEmMassa;

	// Tabela de Apoio do SPED > Observa��es do Documento Fiscal - Registro 0461

	Observa�oesdoDocumentoFiscalCriar observa�oesdoDocumentoFiscalCriar;
	Observa�oesdoDocumentoFiscalDetalhes observa�oesdoDocumentoFiscalDetalhes;
	Observa�oesdoDocumentoFiscalEditar observa�oesdoDocumentoFiscalEditar;
	Obserba�oesdoDocumentoFiscalExcluir obserba�oesdoDocumentoFiscalExcluir;
	Observa�oesdoDocumentoFiscalVisualizar observa�oesdoDocumentoFiscalVisualizar;


	// Tabelas Complementares para Obriga��es Acess�rias > Tabela Complementar para
	// DIRF

	TabelaComplementarParaDIRFCriar tabelaComplementarParaDIRFCriar;
	TabelaComplementarParaDIRFDetalhes tabelaComplementarParaDIRFDetalhes;
	TabelaComplementarParaDIRFEditar tabelaComplementarParaDIRFEditar;
	TabelaComplementarParaDIRFExcluir tabelaComplementarParaDIRFExcluir;
	TabelaComplementarParaDIRFVisualizar tabelaComplementarParaDIRFVisualizar;
	TabelaComplementarParaDIRFExcluirMassa tabelaComplementarParaDIRFExcluirMassa;
	TabelaComplementarParaDIRFFiltrosAvan tabelaComplementarParaDIRFFiltrosAvan;

	// Tabelas Complementares para Obriga��es Acess�rias > Tabela de Atribui��o de
	// C�digo CFOP / C�digo de Ajuste para Obriga��o

	TabelaDeAtribuicaoDeCodigoCFOPCriar tabelaDeAtribuicaoDeCodigoCFOPCriar;
	TabelaDeAtribuicaoDeCodigoCFOPDetalhes tabelaDeAtribuicaoDeCodigoCFOPDetalhes;
	TabelaDeAtribuicaoDeCodigoCFOPEditar tabelaDeAtribuicaoDeCodigoCFOPEditar;
	TabelaDeAtribuicaoDeCodigoCFOPExcluir tabelaDeAtribuicaoDeCodigoCFOPExcluir;
	TabelaDeAtribuicaoDeCodigoCFOPVisualizar tabelaDeAtribuicaoDeCodigoCFOPVisualizar;
	TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa;
	// Tabelas Complementares para Obriga��es Acess�rias Tabela de C�digo e Classe
	// para Quadro

	TabelaDeCodigoEClasseParaQuadroCriar tabelaDeCodigoEClasseParaQuadroCriar;
	TabelaDeCodigoEClasseParaQuadroDetalhes tabelaDeCodigoEClasseParaQuadroDetalhes;
	TabelaDeCodigoEClasseParaQuadroEditar tabelaDeCodigoEClasseParaQuadroEditar;
	TabelaDeCodigoEClasseParaQuadroExcluir tabelaDeCodigoEClasseParaQuadroExcluir;
	TabelaDeCodigoEClasseParaQuadroVisualizar tabelaDeCodigoEClasseParaQuadroVisualizar;
	TabelaDeCodigoEClasseParaQuadroExcluirEmMassa tabelaDeCodigoEClasseParaQuadroExcluirEmMassa;
	

	// --------------------------------------------------------------------------------------------------------------------

	// Tabelas de Apoio do Sped > Classifica��o De Contribuentes Do IPI

	@Test(priority = 0)
	public void classifica�aoDeContribuintesDoIPICriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > 4.5.5 Classifica��o De Contribuentes Do IPI-------------------------");

		classifica�aoDeContribuintesDoIPICriar = new Classifica�aoDeContribuintesDoIPICriar();
		classifica�aoDeContribuintesDoIPICriar.beforeClass();
		classifica�aoDeContribuintesDoIPICriar.login();
		classifica�aoDeContribuintesDoIPICriar.acessarMDR();
		classifica�aoDeContribuintesDoIPICriar.criar();
		classifica�aoDeContribuintesDoIPICriar.afterClass();

	}

	@Test(priority = 1)
	public void classifica�aoDeContribuintesDoIPIEditar() {

		classifica�aoDeContribuintesDoIPIEditar = new Classifica�aoDeContribuintesDoIPIEditar();
		classifica�aoDeContribuintesDoIPIEditar.beforeClass();
		classifica�aoDeContribuintesDoIPIEditar.login();
		classifica�aoDeContribuintesDoIPIEditar.acessarMDR();
		classifica�aoDeContribuintesDoIPIEditar.editar();
		classifica�aoDeContribuintesDoIPIEditar.afterClass();

	}

	@Test(priority = 2)
	public void classifica�aoDeContribuintesDoIPIVisualizar() {

		classifica�aoDeContribuintesDoIPIVisualizar = new Classifica�aoDeContribuintesDoIPIVisualizar();
		classifica�aoDeContribuintesDoIPIVisualizar.beforeClass();
		classifica�aoDeContribuintesDoIPIVisualizar.login();
		classifica�aoDeContribuintesDoIPIVisualizar.acessarMDR();
		classifica�aoDeContribuintesDoIPIVisualizar.visualizar();
		classifica�aoDeContribuintesDoIPIVisualizar.afterClass();

	}

	@Test(priority = 3)
	public void classifica�aoDeContribuintesDoIPIDetalhes() {

		classifica�aoDeContribuintesDoIPIDetalhes = new Classifica�aoDeContribuintesDoIPIDetalhes();
		classifica�aoDeContribuintesDoIPIDetalhes.beforeClass();
		classifica�aoDeContribuintesDoIPIDetalhes.login();
		classifica�aoDeContribuintesDoIPIDetalhes.acessarMDR();
		classifica�aoDeContribuintesDoIPIDetalhes.detalhes();
		classifica�aoDeContribuintesDoIPIDetalhes.afterClass();

	}

	@Test(priority = 4)
	public void classifica�aoDeContribuintesDoIPIFiltros() {

		classifica�aoDeContribuintesDoIPIFiltrosAvan�ados = new Classifica�aoDeContribuintesDoIPIFiltrosAvan�ados();
		classifica�aoDeContribuintesDoIPIFiltrosAvan�ados.beforeClass();
		classifica�aoDeContribuintesDoIPIFiltrosAvan�ados.login();
		classifica�aoDeContribuintesDoIPIFiltrosAvan�ados.acessarMDR();
		classifica�aoDeContribuintesDoIPIFiltrosAvan�ados.filtros();
		classifica�aoDeContribuintesDoIPIFiltrosAvan�ados.afterClass();

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > Classifica��o De Contribuentes Do IPI Fin-------------------------");
	}

	// 6

	// Tabelas de Apoio do Sped > C�digo de Ajustes Contribui��es de Cr�ditos
	@Test(priority = 6)
	public void codigoAjustesContribui�aoCreditosCriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > 4.3.8 C�digo de Ajustes Contribui��es de Cr�ditos------------------------");

		codigoAjustesContribui�aoCreditosCriar = new CodigoAjustesContribui�aoCreditosCriar();
		codigoAjustesContribui�aoCreditosCriar.beforeClass();
		codigoAjustesContribui�aoCreditosCriar.login();
		codigoAjustesContribui�aoCreditosCriar.acessarMDR();
		codigoAjustesContribui�aoCreditosCriar.criar();
		codigoAjustesContribui�aoCreditosCriar.afterClass();

	}
	
	@Test(priority = 7)
	public void codigoAjustesContribui�oesCreditosEditar() {		
		codigoAjustesContribui�oesCreditosEditar = new CodigoAjustesContribui�oesCreditosEditar();
		codigoAjustesContribui�oesCreditosEditar.beforeClass();
		codigoAjustesContribui�oesCreditosEditar.ingresar();
		codigoAjustesContribui�oesCreditosEditar.mdrEntrar();
		codigoAjustesContribui�oesCreditosEditar.editar();
		codigoAjustesContribui�oesCreditosEditar.afterClass();		
	}

	@Test(priority = 8)
	public void codigoAjustesContribui�aoCreditosExcluir() {

		codigoAjustesContribui�aoCreditosExcluir = new CodigoAjustesContribui�aoCreditosExcluir();
		codigoAjustesContribui�aoCreditosExcluir.beforeClass();
		codigoAjustesContribui�aoCreditosExcluir.login();
		codigoAjustesContribui�aoCreditosExcluir.acessarMDR();
		codigoAjustesContribui�aoCreditosExcluir.excluir();
		codigoAjustesContribui�aoCreditosExcluir.afterClass();

		}
	
	@Test(priority = 9)
	public void codigoAjustesContribui�oesCreditosExcluirEmMassa() {

		codigoAjustesContribui�oesCreditosExcluirEmMassa = new CodigoAjustesContribui�oesCreditosExcluirEmMassa();
		codigoAjustesContribui�oesCreditosExcluirEmMassa.beforeClass();
		codigoAjustesContribui�oesCreditosExcluirEmMassa.login();
		codigoAjustesContribui�oesCreditosExcluirEmMassa.acessarMDR();
		codigoAjustesContribui�oesCreditosExcluirEmMassa.criar();
		codigoAjustesContribui�oesCreditosExcluirEmMassa.afterClass();

		System.out.println(
				"------------------Tabelas de Apoio do Sped > C�digo de Ajustes Contribui��es de Cr�ditos Fin-------------------------");
	}

	// 12

	// Tabelas de Apoio do Sped > C�digo de Codigo de Contribui��o Social Apurada

	@Test(priority = 12)
	public void codigoContribui�aoSocialApuradaCriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > 4.3.5 C�digo de Codigo de Contribui��o Social Apurada-------------------------");

		codigoContribui�aoSocialApuradaCriar = new CodigoContribui�aoSocialApuradaCriar();
		codigoContribui�aoSocialApuradaCriar.beforeClass();
		codigoContribui�aoSocialApuradaCriar.login();
		codigoContribui�aoSocialApuradaCriar.acessarMDR();
		codigoContribui�aoSocialApuradaCriar.criar();
		codigoContribui�aoSocialApuradaCriar.afterClass();

	}

	@Test(priority = 13)
	public void codigoContribui�aoSocialApuradaEditar() {

		codigoContribui�aoSocialApuradaEditar = new CodigoContribui�aoSocialApuradaEditar();
		codigoContribui�aoSocialApuradaEditar.beforeClass();
		codigoContribui�aoSocialApuradaEditar.login();
		codigoContribui�aoSocialApuradaEditar.acessarMDR();
		codigoContribui�aoSocialApuradaEditar.editar();
		codigoContribui�aoSocialApuradaEditar.afterClass();

	}

	@Test(priority = 14)
	public void codigoContribui�aoSocialApuradaVisualizar() {

		codigoContribui�aoSocialApuradaVisualizar = new CodigoContribui�aoSocialApuradaVisualizar();
		codigoContribui�aoSocialApuradaVisualizar.beforeClass();
		codigoContribui�aoSocialApuradaVisualizar.login();
		codigoContribui�aoSocialApuradaVisualizar.acessarMDR();
		codigoContribui�aoSocialApuradaVisualizar.visualizar();
		codigoContribui�aoSocialApuradaVisualizar.afterClass();

	}

	@Test(priority = 15)
	public void codigoContribui�aoSocialApuradaDetalhes() {

		codigoContribui�aoSocialApuradaDetalhes = new CodigoContribui�aoSocialApuradaDetalhes();
		codigoContribui�aoSocialApuradaDetalhes.beforeClass();
		codigoContribui�aoSocialApuradaDetalhes.login();
		codigoContribui�aoSocialApuradaDetalhes.acessarMDR();
		codigoContribui�aoSocialApuradaDetalhes.detalhes();
		codigoContribui�aoSocialApuradaDetalhes.afterClass();

	}

	@Test(priority = 16)
	public void codigoContribui�aoSocialApuradaExcluir() {

		codigoContribui�aoSocialApuradaExcluir = new CodigoContribui�aoSocialApuradaExcluir();
		codigoContribui�aoSocialApuradaExcluir.beforeClass();
		codigoContribui�aoSocialApuradaExcluir.login();
		codigoContribui�aoSocialApuradaExcluir.acessarMDR();
		codigoContribui�aoSocialApuradaExcluir.excluir();
		codigoContribui�aoSocialApuradaExcluir.afterClass();

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > C�digo de Codigo de Contribui��o Social Apurada Fin-------------------------");
	}

	// 18

	// 4.5.4 Tabelas de Apoio do Sped > C�digo de Ajuste da Apura��o do IPI

	@Test(priority = 18)
	public void codigoDeAjusteDaApura�aoDoIPICriar() {

		System.out.println(
				"-------------------4.5.4 Tabelas de Apoio do Sped > C�digo de Ajuste da Apura��o do IPI-------------------------");

		codigoDeAjusteDaApura�aoDoIPICriar = new CodigoDeAjusteDaApura�aoDoIPICriar();
		codigoDeAjusteDaApura�aoDoIPICriar.beforeClass();
		codigoDeAjusteDaApura�aoDoIPICriar.login();
		codigoDeAjusteDaApura�aoDoIPICriar.acessarMDR();
		codigoDeAjusteDaApura�aoDoIPICriar.criar();
		codigoDeAjusteDaApura�aoDoIPICriar.afterClass();

	}

	@Test(priority = 19)
	public void codigoDeAjusteDaApura�aoDoIPIEditar() {

		codigoDeAjusteDaApura�aoDoIPIEditar = new CodigoDeAjusteDaApura�aoDoIPIEditar();
		codigoDeAjusteDaApura�aoDoIPIEditar.beforeClass();
		codigoDeAjusteDaApura�aoDoIPIEditar.login();
		codigoDeAjusteDaApura�aoDoIPIEditar.acessarMDR();
		codigoDeAjusteDaApura�aoDoIPIEditar.editar();
		codigoDeAjusteDaApura�aoDoIPIEditar.afterClass();

	}

	@Test(priority = 20)
	public void codigoDeAjusteDaApura�aoDoIPIVisualizar() {

		codigoDeAjusteDaApura�aoDoIPIVisualizar = new CodigoDeAjusteDaApura�aoDoIPIVisualizar();
		codigoDeAjusteDaApura�aoDoIPIVisualizar.beforeClass();
		codigoDeAjusteDaApura�aoDoIPIVisualizar.login();
		codigoDeAjusteDaApura�aoDoIPIVisualizar.acessarMDR();
		codigoDeAjusteDaApura�aoDoIPIVisualizar.visualizar();
		codigoDeAjusteDaApura�aoDoIPIVisualizar.afterClass();

	}

	@Test(priority = 21)
	public void codigoDeAjusteDaApura�aoDoIPIDetalhes() {

		codigoDeAjusteDaApura�aoDoIPIDetalhes = new CodigoDeAjusteDaApura�aoDoIPIDetalhes();
		codigoDeAjusteDaApura�aoDoIPIDetalhes.beforeClass();
		codigoDeAjusteDaApura�aoDoIPIDetalhes.login();
		codigoDeAjusteDaApura�aoDoIPIDetalhes.acessarMDR();
		codigoDeAjusteDaApura�aoDoIPIDetalhes.detalhes();
		codigoDeAjusteDaApura�aoDoIPIDetalhes.afterClass();

	}

	@Test(priority = 22)
	public void codigoDeAjusteDaApura�aoDoIPIExcluir() {

		codigoDeAjusteDaApura�aoDoIPIExcluir = new CodigoDeAjusteDaApura�aoDoIPIExcluir();
		codigoDeAjusteDaApura�aoDoIPIExcluir.beforeClass();
		codigoDeAjusteDaApura�aoDoIPIExcluir.login();
		codigoDeAjusteDaApura�aoDoIPIExcluir.acessarMDR();
		codigoDeAjusteDaApura�aoDoIPIExcluir.excluir();
		codigoDeAjusteDaApura�aoDoIPIExcluir.afterClass();

			}
	
	@Test(priority = 23)
	public void codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa() {

		codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa = new CodigoDeAjusteDaApura�aoDoIPIExcluirEmMassa();
		codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa.beforeClass();
		codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa.login();
		codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa.acessarMDR();
		codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa.criar();
		codigoDeAjusteDaApura�aoDoIPIExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------4.5.4 Tabelas de Apoio do Sped > C�digo de Ajuste da Apura��o do IPI Fin-------------------------");
	}

	// 24

	// 5.4 Tabelas de Apoio do Sped > C�digos das Obrigac�es de ICMS a Recolher

	@Test(priority = 24)
	public void codigosDasObriga�oesDeICMSaRecolherCriar() {

		System.out.println(
				"-------------------5.4 Tabelas de Apoio do Sped > C�digos das Obrigac�es de ICMS a Recolher-------------------------");

		codigosDasObriga�oesDeICMSaRecolherCriar = new CodigosDasObriga�oesDeICMSaRecolherCriar();
		codigosDasObriga�oesDeICMSaRecolherCriar.beforeClass();
		codigosDasObriga�oesDeICMSaRecolherCriar.login();
		codigosDasObriga�oesDeICMSaRecolherCriar.acessarMDR();
		codigosDasObriga�oesDeICMSaRecolherCriar.criar();
		codigosDasObriga�oesDeICMSaRecolherCriar.afterClass();

	}

	@Test(priority = 25)
	public void codigosDasObriga�oesDeICMSaRecolherEditar() {

		codigosDasObriga�oesDeICMSaRecolherEditar = new CodigosDasObriga�oesDeICMSaRecolherEditar();
		codigosDasObriga�oesDeICMSaRecolherEditar.beforeClass();
		codigosDasObriga�oesDeICMSaRecolherEditar.login();
		codigosDasObriga�oesDeICMSaRecolherEditar.acessarMDR();
		codigosDasObriga�oesDeICMSaRecolherEditar.editar();
		codigosDasObriga�oesDeICMSaRecolherEditar.afterClass();

	}

	@Test(priority = 26)
	public void codigosDasObriga�oesDeICMSaRecolherVisualizar() {

		codigosDasObriga�oesDeICMSaRecolherVisualizar = new CodigosDasObriga�oesDeICMSaRecolherVisualizar();
		codigosDasObriga�oesDeICMSaRecolherVisualizar.beforeClass();
		codigosDasObriga�oesDeICMSaRecolherVisualizar.login();
		codigosDasObriga�oesDeICMSaRecolherVisualizar.acessarMDR();
		codigosDasObriga�oesDeICMSaRecolherVisualizar.visualizar();
		codigosDasObriga�oesDeICMSaRecolherVisualizar.afterClass();

	}

	@Test(priority = 27)
	public void codigosDasObriga�oesDeICMSaRecolherDetalhes() {

		codigosDasObriga�oesDeICMSaRecolherDetalhes = new CodigosDasObriga�oesDeICMSaRecolherDetalhes();
		codigosDasObriga�oesDeICMSaRecolherDetalhes.beforeClass();
		codigosDasObriga�oesDeICMSaRecolherDetalhes.login();
		codigosDasObriga�oesDeICMSaRecolherDetalhes.acessarMDR();
		codigosDasObriga�oesDeICMSaRecolherDetalhes.detalhes();
		codigosDasObriga�oesDeICMSaRecolherDetalhes.afterClass();

	}

	@Test(priority = 28)
	public void codigosDasObriga�oesDeICMSaRecolherExcluir() {

		codigosDasObriga�oesDeICMSaRecolherExcluir = new CodigosDasObriga�oesDeICMSaRecolherExcluir();
		codigosDasObriga�oesDeICMSaRecolherExcluir.beforeClass();
		codigosDasObriga�oesDeICMSaRecolherExcluir.login();
		codigosDasObriga�oesDeICMSaRecolherExcluir.acessarMDR();
		codigosDasObriga�oesDeICMSaRecolherExcluir.excluir();
		codigosDasObriga�oesDeICMSaRecolherExcluir.afterClass();

		System.out.println(
				"-------------------5.4 Tabelas de Apoio do Sped > C�digos das Obrigac�es de ICMS a Recolher Fin-------------------------");
	}

	// 30

	// 4.3.6 Tabelas de Apoio do Sped > C�digo Tipo Cr�dito

	@Test(priority = 30)
	public void CodigoTipoCreditoCriar() {

		System.out.println(
				"-------------------4.3.6 Tabelas de Apoio do Sped > C�digo Tipo Cr�dito-------------------------");

		codigoTipoCreditoCriar = new CodigoTipoCreditoCriar();
		codigoTipoCreditoCriar.beforeClass();
		codigoTipoCreditoCriar.login();
		codigoTipoCreditoCriar.acessarMDR();
		codigoTipoCreditoCriar.criar();
		codigoTipoCreditoCriar.afterClass();

	}

	@Test(priority = 31)
	public void CodigoTipoCreditoEditar() {

		codigoTipoCreditoEditar = new CodigoTipoCreditoEditar();
		codigoTipoCreditoEditar.beforeClass();
		codigoTipoCreditoEditar.login();
		codigoTipoCreditoEditar.acessarMDR();
		codigoTipoCreditoEditar.editar();
		codigoTipoCreditoEditar.afterClass();

	}

	@Test(priority = 32)
	public void CodigoTipoCreditoVisualizar() {

		codigoTipoCreditoVisualizar = new CodigoTipoCreditoVisualizar();
		codigoTipoCreditoVisualizar.beforeClass();
		codigoTipoCreditoVisualizar.login();
		codigoTipoCreditoVisualizar.acessarMDR();
		codigoTipoCreditoVisualizar.visualizar();
		codigoTipoCreditoVisualizar.afterClass();

	}

	@Test(priority = 33)
	public void CodigoTipoCreditoDetalhes() {

		codigoTipoCreditoDetalhes = new CodigoTipoCreditoDetalhes();
		codigoTipoCreditoDetalhes.beforeClass();
		codigoTipoCreditoDetalhes.login();
		codigoTipoCreditoDetalhes.acessarMDR();
		codigoTipoCreditoDetalhes.detalhes();
		codigoTipoCreditoDetalhes.afterClass();

	}

	@Test(priority = 34)
	public void CodigoTipoCreditoFiltros() {

		codigoTipoCreditoFiltrosAvan�ados = new CodigoTipoCreditoFiltrosAvan�ados();
		codigoTipoCreditoFiltrosAvan�ados.beforeClass();
		codigoTipoCreditoFiltrosAvan�ados.login();
		codigoTipoCreditoFiltrosAvan�ados.acessarMDR();
		codigoTipoCreditoFiltrosAvan�ados.filtros();
		codigoTipoCreditoFiltrosAvan�ados.afterClass();

	}

	@Test(priority = 35)
	public void CodigoTipoCreditoExcluir() {

		codigoTipoCreditoExcluir = new CodigoTipoCreditoExcluir();
		codigoTipoCreditoExcluir.beforeClass();
		codigoTipoCreditoExcluir.login();
		codigoTipoCreditoExcluir.acessarMDR();
		codigoTipoCreditoExcluir.excluir();
		codigoTipoCreditoExcluir.afterClass();

		System.out.println(
				"-------------------4.3.6 Tabelas de Apoio do Sped > C�digo Tipo Cr�dito Fin-------------------------");
	}

	// 36

	// Tabelas de Apoio do Sped > De Para Livro Apura��o X Sped Fiscal (DE X Para)

	@Test(priority = 36)
	public void deParaLivroApura�aoXSpedFiscalCriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > De Para Livro Apura��o X Sped Fiscal (DE X Para)-------------------------");

		deParaLivroApura�aoXSpedFiscalCriar = new DeParaLivroApura�aoXSpedFiscalCriar();
		deParaLivroApura�aoXSpedFiscalCriar.beforeClass();
		deParaLivroApura�aoXSpedFiscalCriar.login();
		deParaLivroApura�aoXSpedFiscalCriar.acessarMDR();
		deParaLivroApura�aoXSpedFiscalCriar.criar();
		deParaLivroApura�aoXSpedFiscalCriar.afterClass();

	}

	@Test(priority = 37)
	public void deParaLivroApura�aoXSpedFiscalEditar() {

		deParaLivroApura�aoXSpedFiscalEditar = new DeParaLivroApura�aoXSpedFiscalEditar();
		deParaLivroApura�aoXSpedFiscalEditar.beforeClass();
		deParaLivroApura�aoXSpedFiscalEditar.login();
		deParaLivroApura�aoXSpedFiscalEditar.acessarMDR();
		deParaLivroApura�aoXSpedFiscalEditar.editar();
		deParaLivroApura�aoXSpedFiscalEditar.afterClass();

	}

	@Test(priority = 38)
	public void deParaLivroApura�aoXSpedFiscalVisualizar() {

		deParaLivroApura�aoXSpedFiscalVisualizar = new DeParaLivroApura�aoXSpedFiscalVisualizar();
		deParaLivroApura�aoXSpedFiscalVisualizar.beforeClass();
		deParaLivroApura�aoXSpedFiscalVisualizar.login();
		deParaLivroApura�aoXSpedFiscalVisualizar.acessarMDR();
		deParaLivroApura�aoXSpedFiscalVisualizar.visualizar();
		deParaLivroApura�aoXSpedFiscalVisualizar.afterClass();

	}

	@Test(priority = 39)
	public void deParaLivroApura�aoXSpedFiscalDetalhes() {

		deParaLivroApura�aoXSpedFiscalDetalhes = new DeParaLivroApura�aoXSpedFiscalDetalhes();
		deParaLivroApura�aoXSpedFiscalDetalhes.beforeClass();
		deParaLivroApura�aoXSpedFiscalDetalhes.login();
		deParaLivroApura�aoXSpedFiscalDetalhes.acessarMDR();
		deParaLivroApura�aoXSpedFiscalDetalhes.detalhes();
		deParaLivroApura�aoXSpedFiscalDetalhes.afterClass();

	}

	@Test(priority = 40)
	public void deParaLivroApura�aoXSpedFiscalExcluir() {

		deParaLivroApura�aoXSpedFiscalExcluir = new DeParaLivroApura�aoXSpedFiscalExcluir();
		deParaLivroApura�aoXSpedFiscalExcluir.beforeClass();
		deParaLivroApura�aoXSpedFiscalExcluir.login();
		deParaLivroApura�aoXSpedFiscalExcluir.acessarMDR();
		deParaLivroApura�aoXSpedFiscalExcluir.excluir();
		deParaLivroApura�aoXSpedFiscalExcluir.afterClass();

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > De Para Livro Apura��o X Sped Fiscal (DE X Para) Fin-------------------------");
	}

	// 42

	// 4.1.1 Tabelas de Apoio do Sped > Documentos Fiscais ICMS

	@Test(priority = 42)
	public void documentosFiscaisICMSCriar() {

		System.out.println(
				"-------------------4.1.1 Tabelas de Apoio do Sped > Documentos Fiscais ICMS-------------------------");

		documentosFiscaisICMSCriar = new DocumentosFiscaisICMSCriar();
		documentosFiscaisICMSCriar.beforeClass();
		documentosFiscaisICMSCriar.login();
		documentosFiscaisICMSCriar.acessarMDR();
		documentosFiscaisICMSCriar.criar();
		documentosFiscaisICMSCriar.afterClass();

	}

	@Test(priority = 43)
	public void documentosFiscaisICMSEditar() {

		documentosFiscaisICMSEditar = new DocumentosFiscaisICMSEditar();
		documentosFiscaisICMSEditar.beforeClass();
		documentosFiscaisICMSEditar.login();
		documentosFiscaisICMSEditar.acessarMDR();
		documentosFiscaisICMSEditar.editar();
		documentosFiscaisICMSEditar.afterClass();

	}

	@Test(priority = 44)
	public void documentosFiscaisICMSVisualizar() {

		documentosFiscaisICMSVisualizar = new DocumentosFiscaisICMSVisualizar();
		documentosFiscaisICMSVisualizar.beforeClass();
		documentosFiscaisICMSVisualizar.login();
		documentosFiscaisICMSVisualizar.acessarMDR();
		documentosFiscaisICMSVisualizar.visualizar();
		documentosFiscaisICMSVisualizar.afterClass();

	}

	@Test(priority = 45)
	public void documentosFiscaisICMSDetalhes() {

		documentosFiscaisICMSDetalhes = new DocumentosFiscaisICMSDetalhes();
		documentosFiscaisICMSDetalhes.beforeClass();
		documentosFiscaisICMSDetalhes.login();
		documentosFiscaisICMSDetalhes.acessarMDR();
		documentosFiscaisICMSDetalhes.detalhes();
		documentosFiscaisICMSDetalhes.afterClass();

	}

	@Test(priority = 46)
	public void documentosFiscaisICMSExcluir() {

		documentosFiscaisICMSExcluir = new DocumentosFiscaisICMSExcluir();
		documentosFiscaisICMSExcluir.beforeClass();
		documentosFiscaisICMSExcluir.login();
		documentosFiscaisICMSExcluir.acessarMDR();
		documentosFiscaisICMSExcluir.excluir();
		documentosFiscaisICMSExcluir.afterClass();

		}
	
	@Test(priority = 47)
	public void documentosFiscaisICMSExcluirEmMassa() {

		documentosFiscaisICMSExcluirEmMassa = new DocumentosFiscaisICMSExcluirEmMassa();
		documentosFiscaisICMSExcluirEmMassa.beforeClass();
		documentosFiscaisICMSExcluirEmMassa.login();
		documentosFiscaisICMSExcluirEmMassa.acessarMDR();
		documentosFiscaisICMSExcluirEmMassa.criar();
		documentosFiscaisICMSExcluirEmMassa.afterClass();

		System.out.println(
				"------------------- 4.1.1 Tabelas de Apoio do Sped > Documentos Fiscais ICMS Fin-------------------------");
	}

	// 48

	// 5.2 Tabelas de Apoio do Sped > Informa��es Adicionais

	@Test(priority = 48)
	public void informa�oesAdicionaisCriar() {

		System.out.println(
				"-------------------5.2 Tabelas de Apoio do Sped > Informa��es Adicionais-------------------------");

		informa�oesAdicionaisCriar = new Informa�oesAdicionaisCriar();
		informa�oesAdicionaisCriar.beforeClass();
		informa�oesAdicionaisCriar.login();
		informa�oesAdicionaisCriar.acessarMDR();
		informa�oesAdicionaisCriar.criar();
		informa�oesAdicionaisCriar.afterClass();

	}

	@Test(priority = 49)
	public void informa�oesAdicionaisEditar() {

		informa�oesAdicionaisEditar = new Informa�oesAdicionaisEditar();
		informa�oesAdicionaisEditar.beforeClass();
		informa�oesAdicionaisEditar.login();
		informa�oesAdicionaisEditar.acessarMDR();
		informa�oesAdicionaisEditar.editar();
		informa�oesAdicionaisEditar.afterClass();

	}

	@Test(priority = 50)
	public void informa�oesAdicionaisVisualizar() {

		informa�oesAdicionaisVisualizar = new Informa�oesAdicionaisVisualizar();
		informa�oesAdicionaisVisualizar.beforeClass();
		informa�oesAdicionaisVisualizar.login();
		informa�oesAdicionaisVisualizar.acessarMDR();
		informa�oesAdicionaisVisualizar.visualizar();
		informa�oesAdicionaisVisualizar.afterClass();

	}

	@Test(priority = 51)
	public void informa�oesAdicionaisDetalhes() {

		informa�oesAdicionaisDetalhes = new Informa�oesAdicionaisDetalhes();
		informa�oesAdicionaisDetalhes.beforeClass();
		informa�oesAdicionaisDetalhes.login();
		informa�oesAdicionaisDetalhes.acessarMDR();
		informa�oesAdicionaisDetalhes.detalhes();
		informa�oesAdicionaisDetalhes.afterClass();

	}

	@Test(priority = 52)
	public void informa�oesAdicionaisExcluir() {

		informa�oesAdicionaisExcluir = new Informa�oesAdicionaisExcluir();
		informa�oesAdicionaisExcluir.beforeClass();
		informa�oesAdicionaisExcluir.login();
		informa�oesAdicionaisExcluir.acessarMDR();
		informa�oesAdicionaisExcluir.excluir();
		informa�oesAdicionaisExcluir.afterClass();

		
	}
	@Test(priority = 53)
	public void informa�oesAdicionaisExcluirEmMassa() {

		informa�oesAdicionaisExcluirEmMassa = new Informa�oesAdicionaisExcluirEmMassa();
		informa�oesAdicionaisExcluirEmMassa.beforeClass();
		informa�oesAdicionaisExcluirEmMassa.login();
		informa�oesAdicionaisExcluirEmMassa.acessarMDR();
		informa�oesAdicionaisExcluirEmMassa.criar();
		informa�oesAdicionaisExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------5.2 Tabelas de Apoio do Sped > Informa��es Adicionais Fim-------------------------");
	}

	// 54

	// Tabela de Apoio do SPED > Observa��es do Documento Fiscal - Registro 0461

	@Test(priority = 54)
	public void observa�oesdoDocumentoFiscalCriar() {

		System.out.println(
				"-------------------Tabela de Apoio do SPED > Observa��es do Documento Fiscal - Registro 0461-------------------------");

		observa�oesdoDocumentoFiscalCriar = new Observa�oesdoDocumentoFiscalCriar();
		observa�oesdoDocumentoFiscalCriar.beforeClass();
		observa�oesdoDocumentoFiscalCriar.login();
		observa�oesdoDocumentoFiscalCriar.acessarMDR();
		observa�oesdoDocumentoFiscalCriar.criar();
		observa�oesdoDocumentoFiscalCriar.afterClass();

	}

	@Test(priority = 55)
	public void observa�oesdoDocumentoFiscalEditar() {

		observa�oesdoDocumentoFiscalEditar = new Observa�oesdoDocumentoFiscalEditar();
		observa�oesdoDocumentoFiscalEditar.beforeClass();
		observa�oesdoDocumentoFiscalEditar.login();
		observa�oesdoDocumentoFiscalEditar.acessarMDR();
		observa�oesdoDocumentoFiscalEditar.editar();
		observa�oesdoDocumentoFiscalEditar.afterClass();

	}

	@Test(priority = 56)
	public void observa�oesdoDocumentoFiscalVisualizar() {

		observa�oesdoDocumentoFiscalVisualizar = new Observa�oesdoDocumentoFiscalVisualizar();
		observa�oesdoDocumentoFiscalVisualizar.beforeClass();
		observa�oesdoDocumentoFiscalVisualizar.login();
		observa�oesdoDocumentoFiscalVisualizar.acessarMDR();
		observa�oesdoDocumentoFiscalVisualizar.visualizar();
		observa�oesdoDocumentoFiscalVisualizar.afterClass();

	}

	@Test(priority = 57)
	public void observa�oesdoDocumentoFiscalDetalhes() {

		observa�oesdoDocumentoFiscalDetalhes = new Observa�oesdoDocumentoFiscalDetalhes();
		observa�oesdoDocumentoFiscalDetalhes.beforeClass();
		observa�oesdoDocumentoFiscalDetalhes.login();
		observa�oesdoDocumentoFiscalDetalhes.acessarMDR();
		observa�oesdoDocumentoFiscalDetalhes.detalhes();
		observa�oesdoDocumentoFiscalDetalhes.afterClass();

	}

	@Test(priority = 58)
	public void observa�oesdoDocumentoFiscalExcluir() {

		obserba�oesdoDocumentoFiscalExcluir = new Obserba�oesdoDocumentoFiscalExcluir();
		obserba�oesdoDocumentoFiscalExcluir.beforeClass();
		obserba�oesdoDocumentoFiscalExcluir.login();
		obserba�oesdoDocumentoFiscalExcluir.acessarMDR();
		obserba�oesdoDocumentoFiscalExcluir.excluir();
		obserba�oesdoDocumentoFiscalExcluir.afterClass();

		System.out.println(
				"-------------------Tabela de Apoio do SPED > Observa��es do Documento Fiscal - Registro 0461 Fin-------------------------");
	}

	// 60
	
	// Tabelas Complementares para Obriga��es Acess�rias > Tabela Complementar para
	// DIRF

	@Test(priority = 114)
	public void tabelaComplementarParaDIRFCriar() {

		System.out.println(
				"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela Complementar para DIRF-------------------------");

		tabelaComplementarParaDIRFCriar = new TabelaComplementarParaDIRFCriar();
		tabelaComplementarParaDIRFCriar.beforeClass();
		tabelaComplementarParaDIRFCriar.login();
		tabelaComplementarParaDIRFCriar.acessarMDR();
		tabelaComplementarParaDIRFCriar.criar();
		tabelaComplementarParaDIRFCriar.afterClass();

	}

	@Test(priority = 115)
	public void tabelaComplementarParaDIRFEditar() {

		tabelaComplementarParaDIRFEditar = new TabelaComplementarParaDIRFEditar();
		tabelaComplementarParaDIRFEditar.beforeClass();
		tabelaComplementarParaDIRFEditar.login();
		tabelaComplementarParaDIRFEditar.acessarMDR();
		tabelaComplementarParaDIRFEditar.editar();
		tabelaComplementarParaDIRFEditar.afterClass();

	}

	@Test(priority = 116)
	public void tabelaComplementarParaDIRFVisualizar() {

		tabelaComplementarParaDIRFVisualizar = new TabelaComplementarParaDIRFVisualizar();
		tabelaComplementarParaDIRFVisualizar.beforeClass();
		tabelaComplementarParaDIRFVisualizar.login();
		tabelaComplementarParaDIRFVisualizar.acessarMDR();
		tabelaComplementarParaDIRFVisualizar.visualizar();
		tabelaComplementarParaDIRFVisualizar.afterClass();

	}

	@Test(priority = 116)
	public void tabelaComplementarParaDIRFDetalhes() {

		tabelaComplementarParaDIRFDetalhes = new TabelaComplementarParaDIRFDetalhes();
		tabelaComplementarParaDIRFDetalhes.beforeClass();
		tabelaComplementarParaDIRFDetalhes.login();
		tabelaComplementarParaDIRFDetalhes.acessarMDR();
		tabelaComplementarParaDIRFDetalhes.detalhes();
		tabelaComplementarParaDIRFDetalhes.afterClass();

	}

	@Test(priority = 117)
	public void tabelaComplementarParaDIRFExcluir() {

		tabelaComplementarParaDIRFExcluir = new TabelaComplementarParaDIRFExcluir();
		tabelaComplementarParaDIRFExcluir.beforeClass();
		tabelaComplementarParaDIRFExcluir.login();
		tabelaComplementarParaDIRFExcluir.acessarMDR();
		tabelaComplementarParaDIRFExcluir.excluir();
		tabelaComplementarParaDIRFExcluir.afterClass();

	}
	
	@Test(priority = 118)
	public void tabelaComplementarParaDIRFExcluirMassa() {

		tabelaComplementarParaDIRFExcluirMassa = new TabelaComplementarParaDIRFExcluirMassa();
		tabelaComplementarParaDIRFExcluirMassa.beforeClass();
		tabelaComplementarParaDIRFExcluirMassa.login();
		tabelaComplementarParaDIRFExcluirMassa.acessarMDR();
		tabelaComplementarParaDIRFExcluirMassa.criar();
		tabelaComplementarParaDIRFExcluirMassa.excluirMassa();
		tabelaComplementarParaDIRFExcluirMassa.afterClass();

	}
	
	@Test(priority = 119)
	public void tabelaComplementarParaDIRFFiltrosAvan() {
		
		tabelaComplementarParaDIRFFiltrosAvan = new TabelaComplementarParaDIRFFiltrosAvan();
		tabelaComplementarParaDIRFFiltrosAvan.beforeClass();
		tabelaComplementarParaDIRFFiltrosAvan.login();
		tabelaComplementarParaDIRFFiltrosAvan.acessarMDR();
		tabelaComplementarParaDIRFFiltrosAvan.filtrosAvanTabelaComplementarParaDIRF();
		tabelaComplementarParaDIRFFiltrosAvan.afterClass();
		
		System.out.println(
				"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela Complementar para DIRF Fin-------------------------");
	}
	
	// 120

	// Tabelas Complementares para Obriga��es Acess�rias > Tabela de Atribui��o de
	// C�digo CFOP / C�digo de Ajuste para Obriga��o

	@Test(priority = 120)
	public void tabelaDeAtribuicaoDeCodigoCFOPCriar() {

		System.out.println(
				"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela de Atribui��o de C�digo CFOP / C�digo de Ajuste para Obriga��o-------------------------");

		tabelaDeAtribuicaoDeCodigoCFOPCriar = new TabelaDeAtribuicaoDeCodigoCFOPCriar();
		tabelaDeAtribuicaoDeCodigoCFOPCriar.beforeClass();
		tabelaDeAtribuicaoDeCodigoCFOPCriar.login();
		tabelaDeAtribuicaoDeCodigoCFOPCriar.acessarMDR();
		tabelaDeAtribuicaoDeCodigoCFOPCriar.criar();
		tabelaDeAtribuicaoDeCodigoCFOPCriar.afterClass();

	}

	@Test(priority = 121)
	public void tabelaDeAtribuicaoDeCodigoCFOPEditar() {

		tabelaDeAtribuicaoDeCodigoCFOPEditar = new TabelaDeAtribuicaoDeCodigoCFOPEditar();
		tabelaDeAtribuicaoDeCodigoCFOPEditar.beforeClass();
		tabelaDeAtribuicaoDeCodigoCFOPEditar.login();
		tabelaDeAtribuicaoDeCodigoCFOPEditar.acessarMDR();
		tabelaDeAtribuicaoDeCodigoCFOPEditar.editar();
		tabelaDeAtribuicaoDeCodigoCFOPEditar.afterClass();

	}

	@Test(priority = 122)
	public void tabelaDeAtribuicaoDeCodigoCFOPVisualzar() {

		tabelaDeAtribuicaoDeCodigoCFOPVisualizar = new TabelaDeAtribuicaoDeCodigoCFOPVisualizar();
		tabelaDeAtribuicaoDeCodigoCFOPVisualizar.beforeClass();
		tabelaDeAtribuicaoDeCodigoCFOPVisualizar.login();
		tabelaDeAtribuicaoDeCodigoCFOPVisualizar.acessarMDR();
		tabelaDeAtribuicaoDeCodigoCFOPVisualizar.Visualizar();
		tabelaDeAtribuicaoDeCodigoCFOPVisualizar.afterClass();

	}

	@Test(priority = 123)
	public void tabelaDeAtribuicaoDeCodigoCFOPDetalhes() {

		tabelaDeAtribuicaoDeCodigoCFOPDetalhes = new TabelaDeAtribuicaoDeCodigoCFOPDetalhes();
		tabelaDeAtribuicaoDeCodigoCFOPDetalhes.beforeClass();
		tabelaDeAtribuicaoDeCodigoCFOPDetalhes.login();
		tabelaDeAtribuicaoDeCodigoCFOPDetalhes.acessarMDR();
		tabelaDeAtribuicaoDeCodigoCFOPDetalhes.detalhes();
		tabelaDeAtribuicaoDeCodigoCFOPDetalhes.afterClass();

	}

	@Test(priority = 124)
	public void tabelaDeAtribuicaoDeCodigoCFOPExcluir() {

		tabelaDeAtribuicaoDeCodigoCFOPExcluir = new TabelaDeAtribuicaoDeCodigoCFOPExcluir();
		tabelaDeAtribuicaoDeCodigoCFOPExcluir.beforeClass();
		tabelaDeAtribuicaoDeCodigoCFOPExcluir.login();
		tabelaDeAtribuicaoDeCodigoCFOPExcluir.acessarMDR();
		tabelaDeAtribuicaoDeCodigoCFOPExcluir.excluir();
		tabelaDeAtribuicaoDeCodigoCFOPExcluir.afterClass();
	}

	@Test(priority = 125)
	public void tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa() {

		tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa = new TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa();
		tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa.beforeClass();
		tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa.login();
		tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa.acessarMDR();
		tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa.criar();
		tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela de Atribui��o de C�digo CFOP / C�digo de Ajuste para Obriga��o Fin-------------------------");
	}
	// 126

	// Tabelas Complementares para Obriga��es Acess�rias > Tabela de C�digo e Classe
	// para Quadro

	@Test(priority = 126)
	public void tabelaDeCodigoEClasseParaQuadroCriar() {

		System.out.println(
				"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela de C�digo e Classe para Quadro-------------------------");

		tabelaDeCodigoEClasseParaQuadroCriar = new TabelaDeCodigoEClasseParaQuadroCriar();
		tabelaDeCodigoEClasseParaQuadroCriar.beforeClass();
		tabelaDeCodigoEClasseParaQuadroCriar.login();
		tabelaDeCodigoEClasseParaQuadroCriar.acessarMDR();
		tabelaDeCodigoEClasseParaQuadroCriar.criar();
		tabelaDeCodigoEClasseParaQuadroCriar.afterClass();

	}

	@Test(priority = 127)
	public void tabelaDeCodigoEClasseParaQuadroEditar() {

		tabelaDeCodigoEClasseParaQuadroEditar = new TabelaDeCodigoEClasseParaQuadroEditar();
		tabelaDeCodigoEClasseParaQuadroEditar.beforeClass();
		tabelaDeCodigoEClasseParaQuadroEditar.login();
		tabelaDeCodigoEClasseParaQuadroEditar.acessarMDR();
		tabelaDeCodigoEClasseParaQuadroEditar.editar();
		tabelaDeCodigoEClasseParaQuadroEditar.afterClass();

	}

	@Test(priority = 128)
	public void tabelaDeCodigoEClasseParaQuadroVisualizar() {

		tabelaDeCodigoEClasseParaQuadroVisualizar = new TabelaDeCodigoEClasseParaQuadroVisualizar();
		tabelaDeCodigoEClasseParaQuadroVisualizar.beforeClass();
		tabelaDeCodigoEClasseParaQuadroVisualizar.login();
		tabelaDeCodigoEClasseParaQuadroVisualizar.acessarMDR();
		tabelaDeCodigoEClasseParaQuadroVisualizar.Visualizar();
		tabelaDeCodigoEClasseParaQuadroVisualizar.afterClass();

	}

	@Test(priority = 129)
	public void tabelaDeCodigoEClasseParaQuadroDetalhes() {

		tabelaDeCodigoEClasseParaQuadroDetalhes = new TabelaDeCodigoEClasseParaQuadroDetalhes();
		tabelaDeCodigoEClasseParaQuadroDetalhes.beforeClass();
		tabelaDeCodigoEClasseParaQuadroDetalhes.login();
		tabelaDeCodigoEClasseParaQuadroDetalhes.acessarMDR();
		tabelaDeCodigoEClasseParaQuadroDetalhes.detalhes();
		tabelaDeCodigoEClasseParaQuadroDetalhes.afterClass();

	}
	
	
	

	@Test(priority = 130)
	public void tabelaDeCodigoEClasseParaQuadroExcluir() {

		tabelaDeCodigoEClasseParaQuadroExcluir = new TabelaDeCodigoEClasseParaQuadroExcluir();
		tabelaDeCodigoEClasseParaQuadroExcluir.beforeClass();
		tabelaDeCodigoEClasseParaQuadroExcluir.login();
		tabelaDeCodigoEClasseParaQuadroExcluir.acessarMDR();
		tabelaDeCodigoEClasseParaQuadroExcluir.excluir();
		tabelaDeCodigoEClasseParaQuadroExcluir.afterClass();

			}
	
	@Test(priority = 131)
	public void tabelaDeCodigoEClasseParaQuadroExcluirEmMassa() {

		tabelaDeCodigoEClasseParaQuadroExcluirEmMassa = new TabelaDeCodigoEClasseParaQuadroExcluirEmMassa();
		tabelaDeCodigoEClasseParaQuadroExcluirEmMassa.beforeClass();
		tabelaDeCodigoEClasseParaQuadroExcluirEmMassa.login();
		tabelaDeCodigoEClasseParaQuadroExcluirEmMassa.acessarMDR();
		tabelaDeCodigoEClasseParaQuadroExcluirEmMassa.criar();
		tabelaDeCodigoEClasseParaQuadroExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------Tabelas Complementares para Obriga��es Acess�rias > Tabela de C�digo e Classe para Quadro Fin-------------------------");
	}


	


	

}