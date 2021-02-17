package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

 
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO;
import com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPFiltroID;
import com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPICriar;
import com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPIDetalhes;
import com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPIEditar;
import com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPIFiltrosAvançados;
import com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPIVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçaoCreditosCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçaoCreditosExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçoesCreditosEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçoesCreditosExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPICriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoFiltrosAvançados;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherCriar;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherDetalhes;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherEditar;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherExcluir;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherVisualizar;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalCriar;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalDetalhes;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalEditar;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalExcluir;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalVisualizar;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSCriar;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSDetalhes;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSEditar;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSExcluir;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSVisualizar;
import com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisCriar;
import com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisDetalhes;
import com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisEditar;
import com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisExcluir;
import com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisVisualizar;
import com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObserbaçoesdoDocumentoFiscalExcluir;
import com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObservaçoesdoDocumentoFiscalCriar;
import com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObservaçoesdoDocumentoFiscalDetalhes;
import com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObservaçoesdoDocumentoFiscalEditar;
import com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObservaçoesdoDocumentoFiscalVisualizar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaCriar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaDetalhes;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaEditar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaExcluir;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaVisualizar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisCriar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisDetalhes;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisEditar;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisExcluir;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluirMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFFiltrosAvan;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitaExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaCodigoReceitasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoDaReceitas.TabelaDeCodigosDeReceitasExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroVisualizar;

public class AutomacoesMDR3 extends TestBaseSteven {

	// Tabelas de Apoio do Sped > Classificação De Contribuentes Do IPI

	ClassificaçaoDeContribuintesDoIPICriar classificaçaoDeContribuintesDoIPICriar;
	ClassificaçaoDeContribuintesDoIPIDetalhes classificaçaoDeContribuintesDoIPIDetalhes;
	ClassificaçaoDeContribuintesDoIPIEditar classificaçaoDeContribuintesDoIPIEditar;
	ClassificaçaoDeContribuintesDoIPIFiltrosAvançados classificaçaoDeContribuintesDoIPIFiltrosAvançados;
	ClassificaçaoDeContribuintesDoIPIVisualizar classificaçaoDeContribuintesDoIPIVisualizar;

	// Tabelas de Apoio do Sped > Código de Ajustes Contribuições de Créditos
	
	CodigoAjustesContribuiçoesCreditosEditar codigoAjustesContribuiçoesCreditosEditar;
	CodigoAjustesContribuiçaoCreditosCriar codigoAjustesContribuiçaoCreditosCriar;
	CodigoAjustesContribuiçaoCreditosExcluir codigoAjustesContribuiçaoCreditosExcluir;
	CodigoAjustesContribuiçoesCreditosExcluirEmMassa codigoAjustesContribuiçoesCreditosExcluirEmMassa;

	// Tabelas de Apoio do Sped > Código de Codigo de Contribuição Social Apurada

	CodigoContribuiçaoSocialApuradaCriar codigoContribuiçaoSocialApuradaCriar;
	CodigoContribuiçaoSocialApuradaDetalhes codigoContribuiçaoSocialApuradaDetalhes;
	CodigoContribuiçaoSocialApuradaEditar codigoContribuiçaoSocialApuradaEditar;
	CodigoContribuiçaoSocialApuradaExcluir codigoContribuiçaoSocialApuradaExcluir;
	CodigoContribuiçaoSocialApuradaVisualizar codigoContribuiçaoSocialApuradaVisualizar;

	// 4.5.4 Tabelas de Apoio do Sped > Código de Ajuste da Apuração do IPI

	CodigoDeAjusteDaApuraçaoDoIPICriar codigoDeAjusteDaApuraçaoDoIPICriar;
	CodigoDeAjusteDaApuraçaoDoIPIDetalhes codigoDeAjusteDaApuraçaoDoIPIDetalhes;
	CodigoDeAjusteDaApuraçaoDoIPIEditar codigoDeAjusteDaApuraçaoDoIPIEditar;
	CodigoDeAjusteDaApuraçaoDoIPIExcluir codigoDeAjusteDaApuraçaoDoIPIExcluir;
	CodigoDeAjusteDaApuraçaoDoIPIVisualizar codigoDeAjusteDaApuraçaoDoIPIVisualizar;
	CodigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa;

	// 5.4 Tabelas de Apoio do Sped > Códigos das Obrigacões de ICMS a Recolher

	CodigosDasObrigaçoesDeICMSaRecolherCriar codigosDasObrigaçoesDeICMSaRecolherCriar;
	CodigosDasObrigaçoesDeICMSaRecolherDetalhes codigosDasObrigaçoesDeICMSaRecolherDetalhes;
	CodigosDasObrigaçoesDeICMSaRecolherEditar codigosDasObrigaçoesDeICMSaRecolherEditar;
	CodigosDasObrigaçoesDeICMSaRecolherExcluir codigosDasObrigaçoesDeICMSaRecolherExcluir;
	CodigosDasObrigaçoesDeICMSaRecolherVisualizar codigosDasObrigaçoesDeICMSaRecolherVisualizar;

	// 4.3.6 Tabelas de Apoio do Sped > Código Tipo Crédito

	CodigoTipoCreditoCriar codigoTipoCreditoCriar;
	CodigoTipoCreditoDetalhes codigoTipoCreditoDetalhes;
	CodigoTipoCreditoEditar codigoTipoCreditoEditar;
	CodigoTipoCreditoExcluir codigoTipoCreditoExcluir;
	CodigoTipoCreditoFiltrosAvançados codigoTipoCreditoFiltrosAvançados;
	CodigoTipoCreditoVisualizar codigoTipoCreditoVisualizar;

	// Tabelas de Apoio do Sped > De Para Livro Apuração X Sped Fiscal (DE X Para)

	DeParaLivroApuraçaoXSpedFiscalCriar deParaLivroApuraçaoXSpedFiscalCriar;
	DeParaLivroApuraçaoXSpedFiscalDetalhes deParaLivroApuraçaoXSpedFiscalDetalhes;
	DeParaLivroApuraçaoXSpedFiscalEditar deParaLivroApuraçaoXSpedFiscalEditar;
	DeParaLivroApuraçaoXSpedFiscalExcluir deParaLivroApuraçaoXSpedFiscalExcluir;
	DeParaLivroApuraçaoXSpedFiscalVisualizar deParaLivroApuraçaoXSpedFiscalVisualizar;

	// 4.1.1 Tabelas de Apoio do Sped > Documentos Fiscais ICMS

	DocumentosFiscaisICMSCriar documentosFiscaisICMSCriar;
	DocumentosFiscaisICMSDetalhes documentosFiscaisICMSDetalhes;
	DocumentosFiscaisICMSEditar documentosFiscaisICMSEditar;
	DocumentosFiscaisICMSExcluir documentosFiscaisICMSExcluir;
	DocumentosFiscaisICMSVisualizar documentosFiscaisICMSVisualizar;
	DocumentosFiscaisICMSExcluirEmMassa documentosFiscaisICMSExcluirEmMassa;

	// 5.2 Tabelas de Apoio do Sped > Informações Adicionais

	InformaçoesAdicionaisCriar informaçoesAdicionaisCriar;
	InformaçoesAdicionaisDetalhes informaçoesAdicionaisDetalhes;
	InformaçoesAdicionaisEditar informaçoesAdicionaisEditar;
	InformaçoesAdicionaisExcluir informaçoesAdicionaisExcluir;
	InformaçoesAdicionaisVisualizar informaçoesAdicionaisVisualizar;
	InformaçoesAdicionaisExcluirEmMassa informaçoesAdicionaisExcluirEmMassa;

	// Tabela de Apoio do SPED > Observações do Documento Fiscal - Registro 0461

	ObservaçoesdoDocumentoFiscalCriar observaçoesdoDocumentoFiscalCriar;
	ObservaçoesdoDocumentoFiscalDetalhes observaçoesdoDocumentoFiscalDetalhes;
	ObservaçoesdoDocumentoFiscalEditar observaçoesdoDocumentoFiscalEditar;
	ObserbaçoesdoDocumentoFiscalExcluir obserbaçoesdoDocumentoFiscalExcluir;
	ObservaçoesdoDocumentoFiscalVisualizar observaçoesdoDocumentoFiscalVisualizar;


	// Tabelas Complementares para Obrigações Acessórias > Tabela Complementar para
	// DIRF

	TabelaComplementarParaDIRFCriar tabelaComplementarParaDIRFCriar;
	TabelaComplementarParaDIRFDetalhes tabelaComplementarParaDIRFDetalhes;
	TabelaComplementarParaDIRFEditar tabelaComplementarParaDIRFEditar;
	TabelaComplementarParaDIRFExcluir tabelaComplementarParaDIRFExcluir;
	TabelaComplementarParaDIRFVisualizar tabelaComplementarParaDIRFVisualizar;
	TabelaComplementarParaDIRFExcluirMassa tabelaComplementarParaDIRFExcluirMassa;
	TabelaComplementarParaDIRFFiltrosAvan tabelaComplementarParaDIRFFiltrosAvan;

	// Tabelas Complementares para Obrigações Acessórias > Tabela de Atribuição de
	// Código CFOP / Código de Ajuste para Obrigação

	TabelaDeAtribuicaoDeCodigoCFOPCriar tabelaDeAtribuicaoDeCodigoCFOPCriar;
	TabelaDeAtribuicaoDeCodigoCFOPDetalhes tabelaDeAtribuicaoDeCodigoCFOPDetalhes;
	TabelaDeAtribuicaoDeCodigoCFOPEditar tabelaDeAtribuicaoDeCodigoCFOPEditar;
	TabelaDeAtribuicaoDeCodigoCFOPExcluir tabelaDeAtribuicaoDeCodigoCFOPExcluir;
	TabelaDeAtribuicaoDeCodigoCFOPVisualizar tabelaDeAtribuicaoDeCodigoCFOPVisualizar;
	TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa;
	// Tabelas Complementares para Obrigações Acessórias Tabela de Código e Classe
	// para Quadro

	TabelaDeCodigoEClasseParaQuadroCriar tabelaDeCodigoEClasseParaQuadroCriar;
	TabelaDeCodigoEClasseParaQuadroDetalhes tabelaDeCodigoEClasseParaQuadroDetalhes;
	TabelaDeCodigoEClasseParaQuadroEditar tabelaDeCodigoEClasseParaQuadroEditar;
	TabelaDeCodigoEClasseParaQuadroExcluir tabelaDeCodigoEClasseParaQuadroExcluir;
	TabelaDeCodigoEClasseParaQuadroVisualizar tabelaDeCodigoEClasseParaQuadroVisualizar;
	TabelaDeCodigoEClasseParaQuadroExcluirEmMassa tabelaDeCodigoEClasseParaQuadroExcluirEmMassa;
	

	// --------------------------------------------------------------------------------------------------------------------

	// Tabelas de Apoio do Sped > Classificação De Contribuentes Do IPI

	@Test(priority = 0)
	public void classificaçaoDeContribuintesDoIPICriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > 4.5.5 Classificação De Contribuentes Do IPI-------------------------");

		classificaçaoDeContribuintesDoIPICriar = new ClassificaçaoDeContribuintesDoIPICriar();
		classificaçaoDeContribuintesDoIPICriar.beforeClass();
		classificaçaoDeContribuintesDoIPICriar.login();
		classificaçaoDeContribuintesDoIPICriar.acessarMDR();
		classificaçaoDeContribuintesDoIPICriar.criar();
		classificaçaoDeContribuintesDoIPICriar.afterClass();

	}

	@Test(priority = 1)
	public void classificaçaoDeContribuintesDoIPIEditar() {

		classificaçaoDeContribuintesDoIPIEditar = new ClassificaçaoDeContribuintesDoIPIEditar();
		classificaçaoDeContribuintesDoIPIEditar.beforeClass();
		classificaçaoDeContribuintesDoIPIEditar.login();
		classificaçaoDeContribuintesDoIPIEditar.acessarMDR();
		classificaçaoDeContribuintesDoIPIEditar.editar();
		classificaçaoDeContribuintesDoIPIEditar.afterClass();

	}

	@Test(priority = 2)
	public void classificaçaoDeContribuintesDoIPIVisualizar() {

		classificaçaoDeContribuintesDoIPIVisualizar = new ClassificaçaoDeContribuintesDoIPIVisualizar();
		classificaçaoDeContribuintesDoIPIVisualizar.beforeClass();
		classificaçaoDeContribuintesDoIPIVisualizar.login();
		classificaçaoDeContribuintesDoIPIVisualizar.acessarMDR();
		classificaçaoDeContribuintesDoIPIVisualizar.visualizar();
		classificaçaoDeContribuintesDoIPIVisualizar.afterClass();

	}

	@Test(priority = 3)
	public void classificaçaoDeContribuintesDoIPIDetalhes() {

		classificaçaoDeContribuintesDoIPIDetalhes = new ClassificaçaoDeContribuintesDoIPIDetalhes();
		classificaçaoDeContribuintesDoIPIDetalhes.beforeClass();
		classificaçaoDeContribuintesDoIPIDetalhes.login();
		classificaçaoDeContribuintesDoIPIDetalhes.acessarMDR();
		classificaçaoDeContribuintesDoIPIDetalhes.detalhes();
		classificaçaoDeContribuintesDoIPIDetalhes.afterClass();

	}

	@Test(priority = 4)
	public void classificaçaoDeContribuintesDoIPIFiltros() {

		classificaçaoDeContribuintesDoIPIFiltrosAvançados = new ClassificaçaoDeContribuintesDoIPIFiltrosAvançados();
		classificaçaoDeContribuintesDoIPIFiltrosAvançados.beforeClass();
		classificaçaoDeContribuintesDoIPIFiltrosAvançados.login();
		classificaçaoDeContribuintesDoIPIFiltrosAvançados.acessarMDR();
		classificaçaoDeContribuintesDoIPIFiltrosAvançados.filtros();
		classificaçaoDeContribuintesDoIPIFiltrosAvançados.afterClass();

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > Classificação De Contribuentes Do IPI Fin-------------------------");
	}

	// 6

	// Tabelas de Apoio do Sped > Código de Ajustes Contribuições de Créditos
	@Test(priority = 6)
	public void codigoAjustesContribuiçaoCreditosCriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > 4.3.8 Código de Ajustes Contribuições de Créditos------------------------");

		codigoAjustesContribuiçaoCreditosCriar = new CodigoAjustesContribuiçaoCreditosCriar();
		codigoAjustesContribuiçaoCreditosCriar.beforeClass();
		codigoAjustesContribuiçaoCreditosCriar.login();
		codigoAjustesContribuiçaoCreditosCriar.acessarMDR();
		codigoAjustesContribuiçaoCreditosCriar.criar();
		codigoAjustesContribuiçaoCreditosCriar.afterClass();

	}
	
	@Test(priority = 7)
	public void codigoAjustesContribuiçoesCreditosEditar() {		
		codigoAjustesContribuiçoesCreditosEditar = new CodigoAjustesContribuiçoesCreditosEditar();
		codigoAjustesContribuiçoesCreditosEditar.beforeClass();
		codigoAjustesContribuiçoesCreditosEditar.ingresar();
		codigoAjustesContribuiçoesCreditosEditar.mdrEntrar();
		codigoAjustesContribuiçoesCreditosEditar.editar();
		codigoAjustesContribuiçoesCreditosEditar.afterClass();		
	}

	@Test(priority = 8)
	public void codigoAjustesContribuiçaoCreditosExcluir() {

		codigoAjustesContribuiçaoCreditosExcluir = new CodigoAjustesContribuiçaoCreditosExcluir();
		codigoAjustesContribuiçaoCreditosExcluir.beforeClass();
		codigoAjustesContribuiçaoCreditosExcluir.login();
		codigoAjustesContribuiçaoCreditosExcluir.acessarMDR();
		codigoAjustesContribuiçaoCreditosExcluir.excluir();
		codigoAjustesContribuiçaoCreditosExcluir.afterClass();

		}
	
	@Test(priority = 9)
	public void codigoAjustesContribuiçoesCreditosExcluirEmMassa() {

		codigoAjustesContribuiçoesCreditosExcluirEmMassa = new CodigoAjustesContribuiçoesCreditosExcluirEmMassa();
		codigoAjustesContribuiçoesCreditosExcluirEmMassa.beforeClass();
		codigoAjustesContribuiçoesCreditosExcluirEmMassa.login();
		codigoAjustesContribuiçoesCreditosExcluirEmMassa.acessarMDR();
		codigoAjustesContribuiçoesCreditosExcluirEmMassa.criar();
		codigoAjustesContribuiçoesCreditosExcluirEmMassa.afterClass();

		System.out.println(
				"------------------Tabelas de Apoio do Sped > Código de Ajustes Contribuições de Créditos Fin-------------------------");
	}

	// 12

	// Tabelas de Apoio do Sped > Código de Codigo de Contribuição Social Apurada

	@Test(priority = 12)
	public void codigoContribuiçaoSocialApuradaCriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > 4.3.5 Código de Codigo de Contribuição Social Apurada-------------------------");

		codigoContribuiçaoSocialApuradaCriar = new CodigoContribuiçaoSocialApuradaCriar();
		codigoContribuiçaoSocialApuradaCriar.beforeClass();
		codigoContribuiçaoSocialApuradaCriar.login();
		codigoContribuiçaoSocialApuradaCriar.acessarMDR();
		codigoContribuiçaoSocialApuradaCriar.criar();
		codigoContribuiçaoSocialApuradaCriar.afterClass();

	}

	@Test(priority = 13)
	public void codigoContribuiçaoSocialApuradaEditar() {

		codigoContribuiçaoSocialApuradaEditar = new CodigoContribuiçaoSocialApuradaEditar();
		codigoContribuiçaoSocialApuradaEditar.beforeClass();
		codigoContribuiçaoSocialApuradaEditar.login();
		codigoContribuiçaoSocialApuradaEditar.acessarMDR();
		codigoContribuiçaoSocialApuradaEditar.editar();
		codigoContribuiçaoSocialApuradaEditar.afterClass();

	}

	@Test(priority = 14)
	public void codigoContribuiçaoSocialApuradaVisualizar() {

		codigoContribuiçaoSocialApuradaVisualizar = new CodigoContribuiçaoSocialApuradaVisualizar();
		codigoContribuiçaoSocialApuradaVisualizar.beforeClass();
		codigoContribuiçaoSocialApuradaVisualizar.login();
		codigoContribuiçaoSocialApuradaVisualizar.acessarMDR();
		codigoContribuiçaoSocialApuradaVisualizar.visualizar();
		codigoContribuiçaoSocialApuradaVisualizar.afterClass();

	}

	@Test(priority = 15)
	public void codigoContribuiçaoSocialApuradaDetalhes() {

		codigoContribuiçaoSocialApuradaDetalhes = new CodigoContribuiçaoSocialApuradaDetalhes();
		codigoContribuiçaoSocialApuradaDetalhes.beforeClass();
		codigoContribuiçaoSocialApuradaDetalhes.login();
		codigoContribuiçaoSocialApuradaDetalhes.acessarMDR();
		codigoContribuiçaoSocialApuradaDetalhes.detalhes();
		codigoContribuiçaoSocialApuradaDetalhes.afterClass();

	}

	@Test(priority = 16)
	public void codigoContribuiçaoSocialApuradaExcluir() {

		codigoContribuiçaoSocialApuradaExcluir = new CodigoContribuiçaoSocialApuradaExcluir();
		codigoContribuiçaoSocialApuradaExcluir.beforeClass();
		codigoContribuiçaoSocialApuradaExcluir.login();
		codigoContribuiçaoSocialApuradaExcluir.acessarMDR();
		codigoContribuiçaoSocialApuradaExcluir.excluir();
		codigoContribuiçaoSocialApuradaExcluir.afterClass();

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > Código de Codigo de Contribuição Social Apurada Fin-------------------------");
	}

	// 18

	// 4.5.4 Tabelas de Apoio do Sped > Código de Ajuste da Apuração do IPI

	@Test(priority = 18)
	public void codigoDeAjusteDaApuraçaoDoIPICriar() {

		System.out.println(
				"-------------------4.5.4 Tabelas de Apoio do Sped > Código de Ajuste da Apuração do IPI-------------------------");

		codigoDeAjusteDaApuraçaoDoIPICriar = new CodigoDeAjusteDaApuraçaoDoIPICriar();
		codigoDeAjusteDaApuraçaoDoIPICriar.beforeClass();
		codigoDeAjusteDaApuraçaoDoIPICriar.login();
		codigoDeAjusteDaApuraçaoDoIPICriar.acessarMDR();
		codigoDeAjusteDaApuraçaoDoIPICriar.criar();
		codigoDeAjusteDaApuraçaoDoIPICriar.afterClass();

	}

	@Test(priority = 19)
	public void codigoDeAjusteDaApuraçaoDoIPIEditar() {

		codigoDeAjusteDaApuraçaoDoIPIEditar = new CodigoDeAjusteDaApuraçaoDoIPIEditar();
		codigoDeAjusteDaApuraçaoDoIPIEditar.beforeClass();
		codigoDeAjusteDaApuraçaoDoIPIEditar.login();
		codigoDeAjusteDaApuraçaoDoIPIEditar.acessarMDR();
		codigoDeAjusteDaApuraçaoDoIPIEditar.editar();
		codigoDeAjusteDaApuraçaoDoIPIEditar.afterClass();

	}

	@Test(priority = 20)
	public void codigoDeAjusteDaApuraçaoDoIPIVisualizar() {

		codigoDeAjusteDaApuraçaoDoIPIVisualizar = new CodigoDeAjusteDaApuraçaoDoIPIVisualizar();
		codigoDeAjusteDaApuraçaoDoIPIVisualizar.beforeClass();
		codigoDeAjusteDaApuraçaoDoIPIVisualizar.login();
		codigoDeAjusteDaApuraçaoDoIPIVisualizar.acessarMDR();
		codigoDeAjusteDaApuraçaoDoIPIVisualizar.visualizar();
		codigoDeAjusteDaApuraçaoDoIPIVisualizar.afterClass();

	}

	@Test(priority = 21)
	public void codigoDeAjusteDaApuraçaoDoIPIDetalhes() {

		codigoDeAjusteDaApuraçaoDoIPIDetalhes = new CodigoDeAjusteDaApuraçaoDoIPIDetalhes();
		codigoDeAjusteDaApuraçaoDoIPIDetalhes.beforeClass();
		codigoDeAjusteDaApuraçaoDoIPIDetalhes.login();
		codigoDeAjusteDaApuraçaoDoIPIDetalhes.acessarMDR();
		codigoDeAjusteDaApuraçaoDoIPIDetalhes.detalhes();
		codigoDeAjusteDaApuraçaoDoIPIDetalhes.afterClass();

	}

	@Test(priority = 22)
	public void codigoDeAjusteDaApuraçaoDoIPIExcluir() {

		codigoDeAjusteDaApuraçaoDoIPIExcluir = new CodigoDeAjusteDaApuraçaoDoIPIExcluir();
		codigoDeAjusteDaApuraçaoDoIPIExcluir.beforeClass();
		codigoDeAjusteDaApuraçaoDoIPIExcluir.login();
		codigoDeAjusteDaApuraçaoDoIPIExcluir.acessarMDR();
		codigoDeAjusteDaApuraçaoDoIPIExcluir.excluir();
		codigoDeAjusteDaApuraçaoDoIPIExcluir.afterClass();

			}
	
	@Test(priority = 23)
	public void codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa() {

		codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa = new CodigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa();
		codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa.beforeClass();
		codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa.login();
		codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa.acessarMDR();
		codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa.criar();
		codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------4.5.4 Tabelas de Apoio do Sped > Código de Ajuste da Apuração do IPI Fin-------------------------");
	}

	// 24

	// 5.4 Tabelas de Apoio do Sped > Códigos das Obrigacões de ICMS a Recolher

	@Test(priority = 24)
	public void codigosDasObrigaçoesDeICMSaRecolherCriar() {

		System.out.println(
				"-------------------5.4 Tabelas de Apoio do Sped > Códigos das Obrigacões de ICMS a Recolher-------------------------");

		codigosDasObrigaçoesDeICMSaRecolherCriar = new CodigosDasObrigaçoesDeICMSaRecolherCriar();
		codigosDasObrigaçoesDeICMSaRecolherCriar.beforeClass();
		codigosDasObrigaçoesDeICMSaRecolherCriar.login();
		codigosDasObrigaçoesDeICMSaRecolherCriar.acessarMDR();
		codigosDasObrigaçoesDeICMSaRecolherCriar.criar();
		codigosDasObrigaçoesDeICMSaRecolherCriar.afterClass();

	}

	@Test(priority = 25)
	public void codigosDasObrigaçoesDeICMSaRecolherEditar() {

		codigosDasObrigaçoesDeICMSaRecolherEditar = new CodigosDasObrigaçoesDeICMSaRecolherEditar();
		codigosDasObrigaçoesDeICMSaRecolherEditar.beforeClass();
		codigosDasObrigaçoesDeICMSaRecolherEditar.login();
		codigosDasObrigaçoesDeICMSaRecolherEditar.acessarMDR();
		codigosDasObrigaçoesDeICMSaRecolherEditar.editar();
		codigosDasObrigaçoesDeICMSaRecolherEditar.afterClass();

	}

	@Test(priority = 26)
	public void codigosDasObrigaçoesDeICMSaRecolherVisualizar() {

		codigosDasObrigaçoesDeICMSaRecolherVisualizar = new CodigosDasObrigaçoesDeICMSaRecolherVisualizar();
		codigosDasObrigaçoesDeICMSaRecolherVisualizar.beforeClass();
		codigosDasObrigaçoesDeICMSaRecolherVisualizar.login();
		codigosDasObrigaçoesDeICMSaRecolherVisualizar.acessarMDR();
		codigosDasObrigaçoesDeICMSaRecolherVisualizar.visualizar();
		codigosDasObrigaçoesDeICMSaRecolherVisualizar.afterClass();

	}

	@Test(priority = 27)
	public void codigosDasObrigaçoesDeICMSaRecolherDetalhes() {

		codigosDasObrigaçoesDeICMSaRecolherDetalhes = new CodigosDasObrigaçoesDeICMSaRecolherDetalhes();
		codigosDasObrigaçoesDeICMSaRecolherDetalhes.beforeClass();
		codigosDasObrigaçoesDeICMSaRecolherDetalhes.login();
		codigosDasObrigaçoesDeICMSaRecolherDetalhes.acessarMDR();
		codigosDasObrigaçoesDeICMSaRecolherDetalhes.detalhes();
		codigosDasObrigaçoesDeICMSaRecolherDetalhes.afterClass();

	}

	@Test(priority = 28)
	public void codigosDasObrigaçoesDeICMSaRecolherExcluir() {

		codigosDasObrigaçoesDeICMSaRecolherExcluir = new CodigosDasObrigaçoesDeICMSaRecolherExcluir();
		codigosDasObrigaçoesDeICMSaRecolherExcluir.beforeClass();
		codigosDasObrigaçoesDeICMSaRecolherExcluir.login();
		codigosDasObrigaçoesDeICMSaRecolherExcluir.acessarMDR();
		codigosDasObrigaçoesDeICMSaRecolherExcluir.excluir();
		codigosDasObrigaçoesDeICMSaRecolherExcluir.afterClass();

		System.out.println(
				"-------------------5.4 Tabelas de Apoio do Sped > Códigos das Obrigacões de ICMS a Recolher Fin-------------------------");
	}

	// 30

	// 4.3.6 Tabelas de Apoio do Sped > Código Tipo Crédito

	@Test(priority = 30)
	public void CodigoTipoCreditoCriar() {

		System.out.println(
				"-------------------4.3.6 Tabelas de Apoio do Sped > Código Tipo Crédito-------------------------");

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

		codigoTipoCreditoFiltrosAvançados = new CodigoTipoCreditoFiltrosAvançados();
		codigoTipoCreditoFiltrosAvançados.beforeClass();
		codigoTipoCreditoFiltrosAvançados.login();
		codigoTipoCreditoFiltrosAvançados.acessarMDR();
		codigoTipoCreditoFiltrosAvançados.filtros();
		codigoTipoCreditoFiltrosAvançados.afterClass();

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
				"-------------------4.3.6 Tabelas de Apoio do Sped > Código Tipo Crédito Fin-------------------------");
	}

	// 36

	// Tabelas de Apoio do Sped > De Para Livro Apuração X Sped Fiscal (DE X Para)

	@Test(priority = 36)
	public void deParaLivroApuraçaoXSpedFiscalCriar() {

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > De Para Livro Apuração X Sped Fiscal (DE X Para)-------------------------");

		deParaLivroApuraçaoXSpedFiscalCriar = new DeParaLivroApuraçaoXSpedFiscalCriar();
		deParaLivroApuraçaoXSpedFiscalCriar.beforeClass();
		deParaLivroApuraçaoXSpedFiscalCriar.login();
		deParaLivroApuraçaoXSpedFiscalCriar.acessarMDR();
		deParaLivroApuraçaoXSpedFiscalCriar.criar();
		deParaLivroApuraçaoXSpedFiscalCriar.afterClass();

	}

	@Test(priority = 37)
	public void deParaLivroApuraçaoXSpedFiscalEditar() {

		deParaLivroApuraçaoXSpedFiscalEditar = new DeParaLivroApuraçaoXSpedFiscalEditar();
		deParaLivroApuraçaoXSpedFiscalEditar.beforeClass();
		deParaLivroApuraçaoXSpedFiscalEditar.login();
		deParaLivroApuraçaoXSpedFiscalEditar.acessarMDR();
		deParaLivroApuraçaoXSpedFiscalEditar.editar();
		deParaLivroApuraçaoXSpedFiscalEditar.afterClass();

	}

	@Test(priority = 38)
	public void deParaLivroApuraçaoXSpedFiscalVisualizar() {

		deParaLivroApuraçaoXSpedFiscalVisualizar = new DeParaLivroApuraçaoXSpedFiscalVisualizar();
		deParaLivroApuraçaoXSpedFiscalVisualizar.beforeClass();
		deParaLivroApuraçaoXSpedFiscalVisualizar.login();
		deParaLivroApuraçaoXSpedFiscalVisualizar.acessarMDR();
		deParaLivroApuraçaoXSpedFiscalVisualizar.visualizar();
		deParaLivroApuraçaoXSpedFiscalVisualizar.afterClass();

	}

	@Test(priority = 39)
	public void deParaLivroApuraçaoXSpedFiscalDetalhes() {

		deParaLivroApuraçaoXSpedFiscalDetalhes = new DeParaLivroApuraçaoXSpedFiscalDetalhes();
		deParaLivroApuraçaoXSpedFiscalDetalhes.beforeClass();
		deParaLivroApuraçaoXSpedFiscalDetalhes.login();
		deParaLivroApuraçaoXSpedFiscalDetalhes.acessarMDR();
		deParaLivroApuraçaoXSpedFiscalDetalhes.detalhes();
		deParaLivroApuraçaoXSpedFiscalDetalhes.afterClass();

	}

	@Test(priority = 40)
	public void deParaLivroApuraçaoXSpedFiscalExcluir() {

		deParaLivroApuraçaoXSpedFiscalExcluir = new DeParaLivroApuraçaoXSpedFiscalExcluir();
		deParaLivroApuraçaoXSpedFiscalExcluir.beforeClass();
		deParaLivroApuraçaoXSpedFiscalExcluir.login();
		deParaLivroApuraçaoXSpedFiscalExcluir.acessarMDR();
		deParaLivroApuraçaoXSpedFiscalExcluir.excluir();
		deParaLivroApuraçaoXSpedFiscalExcluir.afterClass();

		System.out.println(
				"-------------------Tabelas de Apoio do Sped > De Para Livro Apuração X Sped Fiscal (DE X Para) Fin-------------------------");
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

	// 5.2 Tabelas de Apoio do Sped > Informações Adicionais

	@Test(priority = 48)
	public void informaçoesAdicionaisCriar() {

		System.out.println(
				"-------------------5.2 Tabelas de Apoio do Sped > Informações Adicionais-------------------------");

		informaçoesAdicionaisCriar = new InformaçoesAdicionaisCriar();
		informaçoesAdicionaisCriar.beforeClass();
		informaçoesAdicionaisCriar.login();
		informaçoesAdicionaisCriar.acessarMDR();
		informaçoesAdicionaisCriar.criar();
		informaçoesAdicionaisCriar.afterClass();

	}

	@Test(priority = 49)
	public void informaçoesAdicionaisEditar() {

		informaçoesAdicionaisEditar = new InformaçoesAdicionaisEditar();
		informaçoesAdicionaisEditar.beforeClass();
		informaçoesAdicionaisEditar.login();
		informaçoesAdicionaisEditar.acessarMDR();
		informaçoesAdicionaisEditar.editar();
		informaçoesAdicionaisEditar.afterClass();

	}

	@Test(priority = 50)
	public void informaçoesAdicionaisVisualizar() {

		informaçoesAdicionaisVisualizar = new InformaçoesAdicionaisVisualizar();
		informaçoesAdicionaisVisualizar.beforeClass();
		informaçoesAdicionaisVisualizar.login();
		informaçoesAdicionaisVisualizar.acessarMDR();
		informaçoesAdicionaisVisualizar.visualizar();
		informaçoesAdicionaisVisualizar.afterClass();

	}

	@Test(priority = 51)
	public void informaçoesAdicionaisDetalhes() {

		informaçoesAdicionaisDetalhes = new InformaçoesAdicionaisDetalhes();
		informaçoesAdicionaisDetalhes.beforeClass();
		informaçoesAdicionaisDetalhes.login();
		informaçoesAdicionaisDetalhes.acessarMDR();
		informaçoesAdicionaisDetalhes.detalhes();
		informaçoesAdicionaisDetalhes.afterClass();

	}

	@Test(priority = 52)
	public void informaçoesAdicionaisExcluir() {

		informaçoesAdicionaisExcluir = new InformaçoesAdicionaisExcluir();
		informaçoesAdicionaisExcluir.beforeClass();
		informaçoesAdicionaisExcluir.login();
		informaçoesAdicionaisExcluir.acessarMDR();
		informaçoesAdicionaisExcluir.excluir();
		informaçoesAdicionaisExcluir.afterClass();

		
	}
	@Test(priority = 53)
	public void informaçoesAdicionaisExcluirEmMassa() {

		informaçoesAdicionaisExcluirEmMassa = new InformaçoesAdicionaisExcluirEmMassa();
		informaçoesAdicionaisExcluirEmMassa.beforeClass();
		informaçoesAdicionaisExcluirEmMassa.login();
		informaçoesAdicionaisExcluirEmMassa.acessarMDR();
		informaçoesAdicionaisExcluirEmMassa.criar();
		informaçoesAdicionaisExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------5.2 Tabelas de Apoio do Sped > Informações Adicionais Fim-------------------------");
	}

	// 54

	// Tabela de Apoio do SPED > Observações do Documento Fiscal - Registro 0461

	@Test(priority = 54)
	public void observaçoesdoDocumentoFiscalCriar() {

		System.out.println(
				"-------------------Tabela de Apoio do SPED > Observações do Documento Fiscal - Registro 0461-------------------------");

		observaçoesdoDocumentoFiscalCriar = new ObservaçoesdoDocumentoFiscalCriar();
		observaçoesdoDocumentoFiscalCriar.beforeClass();
		observaçoesdoDocumentoFiscalCriar.login();
		observaçoesdoDocumentoFiscalCriar.acessarMDR();
		observaçoesdoDocumentoFiscalCriar.criar();
		observaçoesdoDocumentoFiscalCriar.afterClass();

	}

	@Test(priority = 55)
	public void observaçoesdoDocumentoFiscalEditar() {

		observaçoesdoDocumentoFiscalEditar = new ObservaçoesdoDocumentoFiscalEditar();
		observaçoesdoDocumentoFiscalEditar.beforeClass();
		observaçoesdoDocumentoFiscalEditar.login();
		observaçoesdoDocumentoFiscalEditar.acessarMDR();
		observaçoesdoDocumentoFiscalEditar.editar();
		observaçoesdoDocumentoFiscalEditar.afterClass();

	}

	@Test(priority = 56)
	public void observaçoesdoDocumentoFiscalVisualizar() {

		observaçoesdoDocumentoFiscalVisualizar = new ObservaçoesdoDocumentoFiscalVisualizar();
		observaçoesdoDocumentoFiscalVisualizar.beforeClass();
		observaçoesdoDocumentoFiscalVisualizar.login();
		observaçoesdoDocumentoFiscalVisualizar.acessarMDR();
		observaçoesdoDocumentoFiscalVisualizar.visualizar();
		observaçoesdoDocumentoFiscalVisualizar.afterClass();

	}

	@Test(priority = 57)
	public void observaçoesdoDocumentoFiscalDetalhes() {

		observaçoesdoDocumentoFiscalDetalhes = new ObservaçoesdoDocumentoFiscalDetalhes();
		observaçoesdoDocumentoFiscalDetalhes.beforeClass();
		observaçoesdoDocumentoFiscalDetalhes.login();
		observaçoesdoDocumentoFiscalDetalhes.acessarMDR();
		observaçoesdoDocumentoFiscalDetalhes.detalhes();
		observaçoesdoDocumentoFiscalDetalhes.afterClass();

	}

	@Test(priority = 58)
	public void observaçoesdoDocumentoFiscalExcluir() {

		obserbaçoesdoDocumentoFiscalExcluir = new ObserbaçoesdoDocumentoFiscalExcluir();
		obserbaçoesdoDocumentoFiscalExcluir.beforeClass();
		obserbaçoesdoDocumentoFiscalExcluir.login();
		obserbaçoesdoDocumentoFiscalExcluir.acessarMDR();
		obserbaçoesdoDocumentoFiscalExcluir.excluir();
		obserbaçoesdoDocumentoFiscalExcluir.afterClass();

		System.out.println(
				"-------------------Tabela de Apoio do SPED > Observações do Documento Fiscal - Registro 0461 Fin-------------------------");
	}

	// 60
	
	// Tabelas Complementares para Obrigações Acessórias > Tabela Complementar para
	// DIRF

	@Test(priority = 114)
	public void tabelaComplementarParaDIRFCriar() {

		System.out.println(
				"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela Complementar para DIRF-------------------------");

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
				"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela Complementar para DIRF Fin-------------------------");
	}
	
	// 120

	// Tabelas Complementares para Obrigações Acessórias > Tabela de Atribuição de
	// Código CFOP / Código de Ajuste para Obrigação

	@Test(priority = 120)
	public void tabelaDeAtribuicaoDeCodigoCFOPCriar() {

		System.out.println(
				"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela de Atribuição de Código CFOP / Código de Ajuste para Obrigação-------------------------");

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
				"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela de Atribuição de Código CFOP / Código de Ajuste para Obrigação Fin-------------------------");
	}
	// 126

	// Tabelas Complementares para Obrigações Acessórias > Tabela de Código e Classe
	// para Quadro

	@Test(priority = 126)
	public void tabelaDeCodigoEClasseParaQuadroCriar() {

		System.out.println(
				"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela de Código e Classe para Quadro-------------------------");

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
				"-------------------Tabelas Complementares para Obrigações Acessórias > Tabela de Código e Classe para Quadro Fin-------------------------");
	}


	


	

}