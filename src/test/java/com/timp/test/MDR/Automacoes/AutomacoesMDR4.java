package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;

import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosCriar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosDetalhes;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosEditar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosExcluir;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosFiltroID;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosVisualizar;

import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraCriar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraDetalhes;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraEditar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluir;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraVisualizar;
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
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPFiltroId;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametroModeloApuracaoTPFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCICriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVACriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVADetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLFiltroID;
import com.timp.test.MDR.RegistroECAC.RegistroECACCVisualizar;
import com.timp.test.MDR.RegistroECAC.RegistroECACCriar;
import com.timp.test.MDR.RegistroECAC.RegistroECACEditar;
import com.timp.test.MDR.RegistroECAC.RegistroECACExcluir;
import com.timp.test.MDR.RegistroECAC.RegistroECACExcluirMassa;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisCriar;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisDetalhes;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisEditar;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisExcluir;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoCriar;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoEditar;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoExcluir;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoVisualizar;
import com.timp.test.MDR.Siscoserv.NBS.NBSCriar;
import com.timp.test.MDR.Siscoserv.NBS.NBSDetalhes;
import com.timp.test.MDR.Siscoserv.NBS.NBSEditar;
import com.timp.test.MDR.Siscoserv.NBS.NBSExcluir;
import com.timp.test.MDR.Siscoserv.NBS.NBSExcluirMassa;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaCriar;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaDetalhes;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaEditar;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaExcluir;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaVisualizar;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASCriar;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASEditar;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASFiltroID;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASVisualizar;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPCriar;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPEditar;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPFiltroID;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSCriar;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSEditar;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSFiltroID;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Criar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Detalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Editar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Excluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Visualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Criar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Detalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Editar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Excluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Visualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Criar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Detalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Editar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Excluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Visualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos.TabelaDeProdutosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos.TabelaDeProdutosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos.TabelaDeProdutosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLogradouroCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLogradouroEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLogradouroExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLogradouroVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLograduroDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGECriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutosDebitosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosExcluir;
import com.timp.test.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabilCriar;
import com.timp.test.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabilExcluir;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarCriar;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarDetalhes;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarEditar;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarExcluir;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarFiltrosAvançados;
import com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarVisualizar;

public class AutomacoesMDR4 extends TestBaseSteven {

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de codigos de
	// tranferencias

	TabelaDeCodigosDeTransferenciasCriar tabelaDeCodigosDeTransferenciasCriar;
	TabelaDeCodigosDeTransferenciasDetalhes tabelaDeCodigosDeTransferenciasDetalhes;
	TabelaDeCodigosDeTransferenciasEditar tabelaDeCodigosDeTransferenciasEditar;
	TabelaDeCodigosDeTransferenciasExcluir tabelaDeCodigosDeTransferenciasExcluir;
	TabelaDeCodigosDeTransferenciasVisualizar tabelaDeCodigosDeTransferenciasVisualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de credito por
	// obrigaçao
	TabelaDeCreditosPorObrigacaoCriar tabelaDeCreditosPorObrigacaoCriar;
	TabelaDeCreditosPorObrigacaoDetalhes tabelaDeCreditosPorObrigacaoDetalhes;
	TabelaDeCreditosPorObrigacaoEditar tabelaDeCreditosPorObrigacaoEditar;
	TabelaDeCreditosPorObrigacaoExcluir tabelaDeCreditosPorObrigacaoExcluir;
	TabelaDeCreditosPorObrigacaoVisualizar tabelaDeCreditosPorObrigacaoVisualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamento
	// Para Registro 10
	TabelaDeDetalhamentosParaRegistro10Criar tabelaDeDetalhamentosParaRegistro10Criar;
	TabelaDeDetalhamentosParaRegistro10Detalhes tabelaDeDetalhamentosParaRegistro10Detalhes;
	TabelaDeDetalhamentosParaRegistro10Editar tabelaDeDetalhamentosParaRegistro10Editar;
	TabelaDeDetalhamentosParaRegistro10Excluir tabelaDeDetalhamentosParaRegistro10Excluir;
	TabelaDeDetalhamentosParaRegistro10Visualizar tabelaDeDetalhamentosParaRegistro10Visualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamento
	// Para Registro 11
	TabelaDeDetalhamentosParaRegistro11Criar tabelaDeDetalhamentosParaRegistro11Criar;
	TabelaDeDetalhamentosParaRegistro11Detalhes tabelaDeDetalhamentosParaRegistro11Detalhes;
	TabelaDeDetalhamentosParaRegistro11Editar tabelaDeDetalhamentosParaRegistro11Editar;
	TabelaDeDetalhamentosParaRegistro11Excluir tabelaDeDetalhamentosParaRegistro11Excluir;
	TabelaDeDetalhamentosParaRegistro11Visualizar tabelaDeDetalhamentosParaRegistro11Visualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de estoque para
	// registro 12
	TabelaDeEstoqueParaRegistro12Criar tabelaDeEstoqueParaRegistro12Criar;
	TabelaDeEstoqueParaRegistro12Editar tabelaDeEstoqueParaRegistro12Editar;
	TabelaDeEstoqueParaRegistro12Detalhes tabelaDeEstoqueParaRegistro12Detalhes;
	TabelaDeEstoqueParaRegistro12Excluir tabelaDeEstoqueParaRegistro12Excluir;
	TabelaDeEstoqueParaRegistro12Visualizar tabelaDeEstoqueParaRegistro12Visualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de isençoes

	TabelaDeIsencoesCriar tabelaDeIsencoesCriar;
	TabelaDeIsencoesDetalhes tabelaDeIsencoesDetalhes;
	TabelaDeIsencoesEditar tabelaDeIsencoesEditar;
	TabelaDeIsencoesExcluir tabelaDeIsencoesExcluir;
	TabelaDeIsencoesVisualizar tabelaDeIsencoesVisualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de outros creditos

	TabelaDeOutrosCreditosCriar tabelaDeOutrosCreditosCriar;
	TabelaDeOutrosCreditosDetalhes tabelaDeOutrosCreditosDetalhes;
	TabelaDeOutrosCreditosEditar tabelaDeOutrosCreditosEditar;
	TabelaDeOutrosCreditosExcluir tabelaDeOutrosCreditosExcluir;
	TabelaDeOutrosCreditosVisualizar tabelaDeOutrosCreditosVisualizar;
	
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Produtos

	TabelaDeProdutosCriar tabelaDeProdutosCriar;
	TabelaDeProdutosDetalhes tabelaDeProdutosDetalhes;
	TabelaDeProdutosExcluir tabelaDeProdutosExcluir;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Logradouros
	TabelaLogradouroCriar tabelaLogradouroCriar;
	TabelaLograduroDetalhes tabelaLograduroDetalhes;
	TabelaLogradouroEditar tabelaLogradouroEditar;
	TabelaLogradouroExcluir tabelaLogradouroExcluir;
	TabelaLogradouroVisualizar tabelaLogradouroVisualizar;

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

	// Tabelas Complementares para obrigaçoes acessorias >Tabela de Receitas
	// (Credito Fiscal Antecipado)

	TabelaReceitasCreditoFiscalAntecipadoCriar tabelaReceitasCreditoFiscalAntecipadoCriar;
	TabelaReceitasCreditoFiscalAntecipadoEditar tabelaReceitasCreditoFiscalAntecipadoEditar;
	TabelaReceitasCreditoFiscalAntecipadoDetalhes tabelaReceitasCreditoFiscalAntecipadoDetalhes;
	TabelaReceitasCreditoFiscalAntecipadoVisualizar tabelaReceitasCreditoFiscalAntecipadoVisualizar;
	TabelaReceitasCreditoFiscalAntecipadoExcluir tabelaReceitasCreditoFiscalAntecipadoExcluir;

	// Tabelas Complementares para obrigaçoes acessorias >Tabela da Receitas
	// permitidas
	TabelaReceitasPermitidasCriar tabelaReceitasPermitidasCriar;
	TabelaReceitasPermitidasDetalhes tabelaReceitasPermitidasDetalhes;
	TabelaReceitasPermitidasEditar tabelaReceitasPermitidasEditar;
	TabelaReceitasPermitidasExcluir tabelaReceitasPermitidasExcluir;
	TabelaReceitasPermitidasVisualizar tabelaReceitasPermitidasVisualizar;

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Serviços

	TabelaServicosCriar tabelaServicosCriar;
	TabelaServicosDetalhes tabelaServicosDetalhes;
	TabelaServicosExcluir tabelaServicosExcluir;

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



	// Preço de Transferencia > Parametros Modelo De Apuracao TP
	ParametrosModeloDeApuracaoTPCriar parametrosModeloDeApuracaoTPCriar;
	ParametrosModeloDeApuracaoTPEditar parametrosModeloDeApuracaoTPEditar;
	ParametrosModeloDeApuracaoTPDetalhes parametrosModeloDeApuracaoTPDetalhes;
	ParametrosModeloDeApuracaoTPExcluir parametrosModeloDeApuracaoTPExcluir;
	ParametroModeloApuracaoTPFiltroID parametroModeloApuracaoTPFiltroID;

	//// Preço de Transferencia > Parametros para TP
	ParametrosParaTPCriar parametrosParaTPCriar;
	ParametrosParaTPEditar parametrosParaTPEditar;
	ParametrosParaTPExcluir parametrosParaTPExcluir;
	ParametrosParaTPFiltroID parametrosParaTPFiltroID;

	// Registro ECAC

	RegistroECACCriar registroECACCriar;
	RegistroECACEditar registroECACEditar;
	RegistroECACExcluir registroECACExcluir;
	RegistroECACCVisualizar registroECACCVisualizar;
	RegistroECACExcluirMassa registroECACExcluirMassa;

	//Atividades Para Tributacao > Tipos De Servicos
	TiposDeServicosCriar tiposDeServicosCriar;
	TiposDeServicosDetalhes tiposDeServicosDetalhes;
	TiposDeServicosEditar tiposDeServicosEditar;
	TiposDeServicosVisualizar tiposDeServicosVisualizar;
	TiposDeServicosExcluir tiposDeServicosExcluir;
	TiposDeServicosFiltroID tiposDeServicosFiltroID;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV
	ValoresParaMetodoPVVCriar valoresParaMetodoPVVCriar;
	ValoresParaMetodoPVVDetalhes valoresParaMetodoPVVDetalhes;
	ValoresParaMetodoPVVEditar valoresParaMetodoPVVEditar;
	ValoresParaMetodoPVVExcluir valoresParaMetodoPVVExcluir;
	ValoresParaMetodoPVVFiltroID valoresParaMetodoPVVFiltroID;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX
	ValoresParaMetodoPVEXCriar valoresParaMetodoPVEXCriar;
	ValoresParaMetodoPVEXDetalhes valoresParaMetodoPVEXDetalhes;
	ValoresParaMetodoPVEXEditar valoresParaMetodoPVEXEditar;
	ValoresParaMetodoPVEXExcluir valoresParaMetodoPVEXExcluir;
	ValoresParaMetodoPVEXFiltroID valoresParaMetodoPVEXFiltroID;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX
	ValoresParaMetodoPECEXCriar valoresParaMetodoPECEXCriar;
	ValoresParaMetodoPECEXDetalhes valoresParaMetodoPECEXDetalhes;
	ValoresParaMetodoPECEXEditar valoresParaMetodoPECEXEditar;
	ValoresParaMetodoPECEXExcluir valoresParaMetodoPECEXExcluir;
	ValoresParaMetodoPECEXFiltroID valoresParaMetodoPECEXFiltroID;

	//Reinf > Processos Adm/Judiciais
	ProcessosAdmJudiciaisCriar processosAdmJudiciaisCriar;
	ProcessosAdmJudiciaisEditar processosAdmJudiciaisEditar;
	ProcessosAdmJudiciaisDetalhes processosAdmJudiciaisDetalhes;
	ProcessosAdmJudiciaisExcluir processosAdmJudiciaisExcluir;

	//Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra
	DeterminacaoDeRelevanciaPorRegraCriar determinacaoDeRelevanciaPorRegraCriar;
	DeterminacaoDeRelevanciaPorRegraDetalhes determinacaoDeRelevanciaPorRegraDetalhes;
	DeterminacaoDeRelevanciaPorRegraEditar determinacaoDeRelevanciaPorRegraEditar;
	DeterminacaoDeRelevanciaPorRegraVisualizar determinacaoDeRelevanciaPorRegraVisualizar;
	DeterminacaoDeRelevanciaPorRegraExcluir determinacaoDeRelevanciaPorRegraExcluir;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP
	ValoresParaMetodoCAPCriar valoresParaMetodoCAPCriar;
	ValoresParaMetodoCAPDetalhes valoresParaMetodoCAPDetalhes;
	ValoresParaMetodoCAPEditar valoresParaMetodoCAPEditar;
	ValoresParaMetodoCAPExcluir valoresParaMetodoCAPExcluir;
	ValoresParaMetodoCAPFiltroID valoresParaMetodoCAPFiltroID;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVA
	ValoresParaMetodoPVACriar valoresParaMetodoPVACriar;
	ValoresParaMetodoPVADetalhes valoresParaMetodoPVADetalhes;
	ValoresParaMetodoPVAEditar valoresParaMetodoPVAEditar;
	ValoresParaMetodoPVAExcluir valoresParaMetodoPVAExcluir;
	ValoresParaMetodoPVAFiltroID valoresParaMetodoPVAFiltroID;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CPL
	ValoresParaMetodoCPLCriar valoresParaMetodoCPLCriar;
	ValoresParaMetodoCPLEditar valoresParaMetodoCPLEditar;
	ValoresParaMetodoCPLDetalhes valoresParaMetodoCPLDetalhes;
	ValoresParaMetodoCPLExcluir valoresParaMetodoCPLExcluir;
	ValoresParaMetodoCPLFiltroID valoresParaMetodoCPLFiltroID;


	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PCI
	ValoresParaMetodoPCICriar valoresParaMetodoPCICriar;
	ValoresParaMetodoPCIEditar valoresParaMetodoPCIEditar;
	ValoresParaMetodoPCIDetalhes valoresParaMetodoPCIDetalhes;
	ValoresParaMetodoPCIExcluir valoresParaMetodoPCIExcluir;
	ValoresParaMetodoPCIFiltroID valoresParaMetodoPCIFiltroID;

	//Preco De Transferencia > Valores Para Metodo de Importaçao >Valores Para Metodo PIC
	ValoresParaMetodoPICCriar valoresParaMetodoPICCriar;
	ValoresParaMetodoPICDetalhes valoresParaMetodoPICDetalhes;
	ValoresParaMetodoPICEditar valoresParaMetodoPICEditar;
	ValoresParaMetodoPICExcluir valoresParaMetodoPICExcluir;


	//Preco De Transferencia > Valores Para Metodo de Importaçao >Valores Para Metodo PRL
	ValoresParaMetodoPRLCriar valoresParaMetodoPRLCriar;
	ValoresParaMetodoPRLEditar valoresParaMetodoPRLEditar;
	ValoresParaMetodoPRLDetalhes valoresParaMetodoPRLDetalhes;
	ValoresParaMetodoPRLExcluir valoresParaMetodoPRLExcluir;
	ValoresParaMetodoPRLFiltroID valoresParaMetodoPRLFiltroID;

	//Siscoserv > Pais/Moeda
	PaisMoedaCriar paisMoedaCriar;
	PaisMoedaEditar paisMoedaEditar;
	PaisMoedaDetalhes paisMoedaDetalhes;
	PaisMoedaVisualizar paisMoedaVisualizar;
	PaisMoedaExcluir paisMoedaExcluir;

	//Siscoserv > NBS
	NBSCriar nbsCriar;
	NBSEditar nbsEditar;
	NBSDetalhes nbsDetalhes;
	NBSExcluir nbsExcluir;
	NBSExcluirMassa nBSExcluirMassa;

	//Siscoserv > Enquadramento
	EnquadramentoCriar enquadramentoCriar;
	EnquadramentoEditar enquadramentoEditar;
	EnquadramentoVisualizar enquadramentoVisualizar;
	EnquadramentoExcluir enquadramentoExcluir;

	//Siscoserv > Registro RAS
	RegistroRASCriar registroRASCriar;
	RegistroRASEditar registroRASEditar;
	RegistroRASDetalhes registroRASDetalhes;
	RegistroRASVisualizar registroRASVisualizar;
	RegistroRASFiltroID registroRASFiltroID;
	RegistroRASExcluir registroRASExcluir;

	//Siscoserv > Registro RP
	RegistroRPCriar registroRPCriar;
	RegistroRPDetalhes registroRPDetalhes;
	RegistroRPEditar registroRPEditar;
	RegistroRPFiltroID registroRPFiltroID;
	RegistroRPExcluir registroRPExcluir;

	// Siscoserv > Registro RVS
	RegistroRVSCriar registroRVSCriar;
	RegistroRVSDetalhes registroRVSDetalhes;
	RegistroRVSEditar registroRVSEditar;
	RegistroRVSExcluir registroRVSExcluir;
	RegistroRVSFiltroID registroRVSFiltroID;
	RegistroRVSVisualizar registroRVSVisualizar;
		
	
		
	// --------------------------------------------------------------------------------------------------

	// Tabelas Complementares para obrigaçoes acessorias > Tabela de codigos de
	// tranferencias

	@Test(priority = 0)
	public void tabelaDeCodigosDeTransferenciasCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de codigos de tranferencias-------------------------");
		tabelaDeCodigosDeTransferenciasCriar = new TabelaDeCodigosDeTransferenciasCriar();
		tabelaDeCodigosDeTransferenciasCriar.beforeClass();
		tabelaDeCodigosDeTransferenciasCriar.login();
		tabelaDeCodigosDeTransferenciasCriar.acessarMDR();
		tabelaDeCodigosDeTransferenciasCriar.criar();
		tabelaDeCodigosDeTransferenciasCriar.afterClass();

	}

	@Test(priority = 1)
	public void tabelaDeCodigosDeTransferenciasDetalhes() {

		tabelaDeCodigosDeTransferenciasDetalhes = new TabelaDeCodigosDeTransferenciasDetalhes();
		tabelaDeCodigosDeTransferenciasDetalhes.beforeClass();
		tabelaDeCodigosDeTransferenciasDetalhes.login();
		tabelaDeCodigosDeTransferenciasDetalhes.acessarMDR();
		tabelaDeCodigosDeTransferenciasDetalhes.detalhes();
		tabelaDeCodigosDeTransferenciasDetalhes.afterClass();

	}

	@Test(priority = 2)
	public void tabelaDeCodigosDeTransferenciasEditar() {

		tabelaDeCodigosDeTransferenciasEditar = new TabelaDeCodigosDeTransferenciasEditar();
		tabelaDeCodigosDeTransferenciasEditar.beforeClass();
		tabelaDeCodigosDeTransferenciasEditar.login();
		tabelaDeCodigosDeTransferenciasEditar.acessarMDR();
		tabelaDeCodigosDeTransferenciasEditar.editar();
		tabelaDeCodigosDeTransferenciasEditar.afterClass();

	}

	@Test(priority = 3)
	public void tabelaDeCodigosDeTransferenciasVisualizar() {
		tabelaDeCodigosDeTransferenciasVisualizar = new TabelaDeCodigosDeTransferenciasVisualizar();
		tabelaDeCodigosDeTransferenciasVisualizar.beforeClass();
		tabelaDeCodigosDeTransferenciasVisualizar.login();
		tabelaDeCodigosDeTransferenciasVisualizar.acessarMDR();
		tabelaDeCodigosDeTransferenciasVisualizar.visualizar();
		tabelaDeCodigosDeTransferenciasVisualizar.afterClass();

	}

	@Test(priority = 4)
	public void tabelaDeCodigosDeTransferenciasExcluir() {

		tabelaDeCodigosDeTransferenciasExcluir = new TabelaDeCodigosDeTransferenciasExcluir();
		tabelaDeCodigosDeTransferenciasExcluir.beforeClass();
		tabelaDeCodigosDeTransferenciasExcluir.login();
		tabelaDeCodigosDeTransferenciasExcluir.acessarMDR();
		tabelaDeCodigosDeTransferenciasExcluir.excluir();
		tabelaDeCodigosDeTransferenciasExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de codigos de tranferencias Fim-------------------------");

	}
	// priority 6
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de credito por
	// obrigaçao

	@Test(priority = 6)
	public void tabelaDeCreditosPorObrigacaoCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de credito por obrigaçao-------------------------");
		tabelaDeCreditosPorObrigacaoCriar = new TabelaDeCreditosPorObrigacaoCriar();
		tabelaDeCreditosPorObrigacaoCriar.beforeClass();
		tabelaDeCreditosPorObrigacaoCriar.login();
		tabelaDeCreditosPorObrigacaoCriar.acessarMDR();
		tabelaDeCreditosPorObrigacaoCriar.criar();
		tabelaDeCreditosPorObrigacaoCriar.afterClass();

	}

	@Test(priority = 7)
	public void tabelaDeCreditosPorObrigacaoDetalhes() {

		tabelaDeCreditosPorObrigacaoDetalhes = new TabelaDeCreditosPorObrigacaoDetalhes();
		tabelaDeCreditosPorObrigacaoDetalhes.beforeClass();
		tabelaDeCreditosPorObrigacaoDetalhes.login();
		tabelaDeCreditosPorObrigacaoDetalhes.acessarMDR();
		tabelaDeCreditosPorObrigacaoDetalhes.detalhes();
		tabelaDeCreditosPorObrigacaoDetalhes.afterClass();

	}

	@Test(priority = 8)
	public void tabelaDeCreditosPorObrigacaoEditar() {

		tabelaDeCreditosPorObrigacaoEditar = new TabelaDeCreditosPorObrigacaoEditar();
		tabelaDeCreditosPorObrigacaoEditar.beforeClass();
		tabelaDeCreditosPorObrigacaoEditar.login();
		tabelaDeCreditosPorObrigacaoEditar.acessarMDR();
		tabelaDeCreditosPorObrigacaoEditar.editar();
		tabelaDeCreditosPorObrigacaoEditar.afterClass();

	}

	@Test(priority = 9)
	public void tabelaDeCreditosPorObrigacaoVisulizar() {

		tabelaDeCreditosPorObrigacaoVisualizar = new TabelaDeCreditosPorObrigacaoVisualizar();
		tabelaDeCreditosPorObrigacaoVisualizar.beforeClass();
		tabelaDeCreditosPorObrigacaoVisualizar.login();
		tabelaDeCreditosPorObrigacaoVisualizar.acessarMDR();
		tabelaDeCreditosPorObrigacaoVisualizar.visualizar();
		tabelaDeCreditosPorObrigacaoVisualizar.afterClass();

	}

	@Test(priority = 10)
	public void tabelaDeCreditosPorObrigacaoExcluir() {

		tabelaDeCreditosPorObrigacaoExcluir = new TabelaDeCreditosPorObrigacaoExcluir();
		tabelaDeCreditosPorObrigacaoExcluir.beforeClass();
		tabelaDeCreditosPorObrigacaoExcluir.login();
		tabelaDeCreditosPorObrigacaoExcluir.acessarMDR();
		tabelaDeCreditosPorObrigacaoExcluir.excluir();
		tabelaDeCreditosPorObrigacaoExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de credito por obrigaçao Fim-------------------------");
	}

	// 12
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamentos
	// Para Registro 10

	@Test(priority = 12)
	public void tabelaDeDetalhamentosParaRegistro10Criar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamentos Para Registro 10-------------------------");
		tabelaDeDetalhamentosParaRegistro10Criar = new TabelaDeDetalhamentosParaRegistro10Criar();
		tabelaDeDetalhamentosParaRegistro10Criar.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Criar.login();
		tabelaDeDetalhamentosParaRegistro10Criar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Criar.criar();
		tabelaDeDetalhamentosParaRegistro10Criar.afterClass();

	}

	@Test(priority = 13)
	public void tabelaDeDetalhamentosParaRegistro10Detalhes() {

		tabelaDeDetalhamentosParaRegistro10Detalhes = new TabelaDeDetalhamentosParaRegistro10Detalhes();
		tabelaDeDetalhamentosParaRegistro10Detalhes.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Detalhes.login();
		tabelaDeDetalhamentosParaRegistro10Detalhes.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Detalhes.detalhes();
		tabelaDeDetalhamentosParaRegistro10Detalhes.afterClass();

	}

	@Test(priority = 14)
	public void tabelaDeDetalhamentosParaRegistro10Editar() {

		tabelaDeDetalhamentosParaRegistro10Editar = new TabelaDeDetalhamentosParaRegistro10Editar();
		tabelaDeDetalhamentosParaRegistro10Editar.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Editar.login();
		tabelaDeDetalhamentosParaRegistro10Editar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Editar.editar();
		tabelaDeDetalhamentosParaRegistro10Editar.afterClass();

	}

	@Test(priority = 15)
	public void tabelaDeDetalhamentosParaRegistro10Visualizar() {

		tabelaDeDetalhamentosParaRegistro10Visualizar = new TabelaDeDetalhamentosParaRegistro10Visualizar();
		tabelaDeDetalhamentosParaRegistro10Visualizar.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Visualizar.login();
		tabelaDeDetalhamentosParaRegistro10Visualizar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Visualizar.visualizar();
		tabelaDeDetalhamentosParaRegistro10Visualizar.afterClass();

	}

	@Test(priority = 16)
	public void tabelaDeDetalhamentosParaRegistro10Excluir() {

		tabelaDeDetalhamentosParaRegistro10Excluir = new TabelaDeDetalhamentosParaRegistro10Excluir();
		tabelaDeDetalhamentosParaRegistro10Excluir.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Excluir.login();
		tabelaDeDetalhamentosParaRegistro10Excluir.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Excluir.excluir();
		tabelaDeDetalhamentosParaRegistro10Excluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamentos Para Registro 10 Fim-------------------------");

	}

	// 18
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamentos
	// Para Registro 11

	@Test(priority = 18)
	public void tabelaDeDetalhamentosParaRegistro11Criar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamentos Para Registro 11-------------------------");
		tabelaDeDetalhamentosParaRegistro11Criar = new TabelaDeDetalhamentosParaRegistro11Criar();
		tabelaDeDetalhamentosParaRegistro11Criar.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Criar.login();
		tabelaDeDetalhamentosParaRegistro11Criar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Criar.criar();
		tabelaDeDetalhamentosParaRegistro11Criar.afterClass();

	}

	@Test(priority = 19)
	public void tabelaDeDetalhamentosParaRegistro11Detalhes() {

		tabelaDeDetalhamentosParaRegistro11Detalhes = new TabelaDeDetalhamentosParaRegistro11Detalhes();
		tabelaDeDetalhamentosParaRegistro11Detalhes.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Detalhes.login();
		tabelaDeDetalhamentosParaRegistro11Detalhes.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Detalhes.detalhes();
		tabelaDeDetalhamentosParaRegistro11Detalhes.afterClass();

	}

	@Test(priority = 20)
	public void tabelaDeDetalhamentosParaRegistro11Editar() {

		tabelaDeDetalhamentosParaRegistro11Editar = new TabelaDeDetalhamentosParaRegistro11Editar();
		tabelaDeDetalhamentosParaRegistro11Editar.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Editar.login();
		tabelaDeDetalhamentosParaRegistro11Editar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Editar.editar();
		tabelaDeDetalhamentosParaRegistro11Editar.afterClass();

	}

	@Test(priority = 21)
	public void tabelaDeDetalhamentosParaRegistro11Visualizar() {

		tabelaDeDetalhamentosParaRegistro11Visualizar = new TabelaDeDetalhamentosParaRegistro11Visualizar();
		tabelaDeDetalhamentosParaRegistro11Visualizar.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Visualizar.login();
		tabelaDeDetalhamentosParaRegistro11Visualizar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Visualizar.visualizar();
		tabelaDeDetalhamentosParaRegistro11Visualizar.afterClass();

	}

	@Test(priority = 22)
	public void tabelaDeDetalhamentosParaRegistro11Excluir() {

		tabelaDeDetalhamentosParaRegistro11Excluir = new TabelaDeDetalhamentosParaRegistro11Excluir();
		tabelaDeDetalhamentosParaRegistro11Excluir.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Excluir.login();
		tabelaDeDetalhamentosParaRegistro11Excluir.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Excluir.excluir();
		tabelaDeDetalhamentosParaRegistro11Excluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Detalhamentos Para Registro 11 Fim-------------------------");

	}

	// 24
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Estoque para
	// registro 12

	@Test(priority = 24)
	public void tabelaDeEstoqueParaRegistro12Criar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de estoque para registro 12-------------------------");
		tabelaDeEstoqueParaRegistro12Criar = new TabelaDeEstoqueParaRegistro12Criar();
		tabelaDeEstoqueParaRegistro12Criar.beforeClass();
		tabelaDeEstoqueParaRegistro12Criar.login();
		tabelaDeEstoqueParaRegistro12Criar.acessarMDR();
		tabelaDeEstoqueParaRegistro12Criar.criar();
		tabelaDeEstoqueParaRegistro12Criar.afterClass();

	}

	@Test(priority = 25)
	public void tabelaDeEstoqueParaRegistro12Detalhes() {

		tabelaDeEstoqueParaRegistro12Detalhes = new TabelaDeEstoqueParaRegistro12Detalhes();
		tabelaDeEstoqueParaRegistro12Detalhes.beforeClass();
		tabelaDeEstoqueParaRegistro12Detalhes.login();
		tabelaDeEstoqueParaRegistro12Detalhes.acessarMDR();
		tabelaDeEstoqueParaRegistro12Detalhes.detalhes();
		tabelaDeEstoqueParaRegistro12Detalhes.afterClass();

	}

	@Test(priority = 26)
	public void tabelaDeEstoqueParaRegistro12Editar() {

		tabelaDeEstoqueParaRegistro12Editar = new TabelaDeEstoqueParaRegistro12Editar();
		tabelaDeEstoqueParaRegistro12Editar.beforeClass();
		tabelaDeEstoqueParaRegistro12Editar.login();
		tabelaDeEstoqueParaRegistro12Editar.acessarMDR();
		tabelaDeEstoqueParaRegistro12Editar.editar();
		tabelaDeEstoqueParaRegistro12Editar.afterClass();

	}

	@Test(priority = 27)
	public void tabelaDeEstoqueParaRegistro12Visualizar() {

		tabelaDeEstoqueParaRegistro12Visualizar = new TabelaDeEstoqueParaRegistro12Visualizar();
		tabelaDeEstoqueParaRegistro12Visualizar.beforeClass();
		tabelaDeEstoqueParaRegistro12Visualizar.login();
		tabelaDeEstoqueParaRegistro12Visualizar.acessarMDR();
		tabelaDeEstoqueParaRegistro12Visualizar.visualizar();
		tabelaDeEstoqueParaRegistro12Visualizar.afterClass();

	}

	@Test(priority = 28)
	public void tabelaDeEstoqueParaRegistro12Excluir() {

		tabelaDeEstoqueParaRegistro12Excluir = new TabelaDeEstoqueParaRegistro12Excluir();
		tabelaDeEstoqueParaRegistro12Excluir.beforeClass();
		tabelaDeEstoqueParaRegistro12Excluir.login();
		tabelaDeEstoqueParaRegistro12Excluir.acessarMDR();
		tabelaDeEstoqueParaRegistro12Excluir.excluir();
		tabelaDeEstoqueParaRegistro12Excluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de estoque para registro 12 Fim-------------------------");
	}

	// 30
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de isençoes

	@Test(priority = 30)
	public void tabelaDeIsencoesCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de isençoes-------------------------");
		tabelaDeIsencoesCriar = new TabelaDeIsencoesCriar();
		tabelaDeIsencoesCriar.beforeClass();
		tabelaDeIsencoesCriar.login();
		tabelaDeIsencoesCriar.acessarMDR();
		tabelaDeIsencoesCriar.criar();
		tabelaDeIsencoesCriar.afterClass();

	}

	@Test(priority = 31)
	public void tabelaDeIsencoesDetalhes() {

		tabelaDeIsencoesDetalhes = new TabelaDeIsencoesDetalhes();
		tabelaDeIsencoesDetalhes.beforeClass();
		tabelaDeIsencoesDetalhes.login();
		tabelaDeIsencoesDetalhes.acessarMDR();
		tabelaDeIsencoesDetalhes.Detalhes();
		tabelaDeIsencoesDetalhes.afterClass();

	}

	@Test(priority = 32)
	public void tabelaDeIsencoesEditar() {

		tabelaDeIsencoesEditar = new TabelaDeIsencoesEditar();
		tabelaDeIsencoesEditar.beforeClass();
		tabelaDeIsencoesEditar.login();
		tabelaDeIsencoesEditar.acessarMDR();
		tabelaDeIsencoesEditar.editar();
		tabelaDeIsencoesEditar.afterClass();

	}

	@Test(priority = 33)
	public void tabelaDeIsencoesVisualizar() {

		tabelaDeIsencoesVisualizar = new TabelaDeIsencoesVisualizar();
		tabelaDeIsencoesVisualizar.beforeClass();
		tabelaDeIsencoesVisualizar.login();
		tabelaDeIsencoesVisualizar.acessarMDR();
		tabelaDeIsencoesVisualizar.Visualizar();
		tabelaDeIsencoesVisualizar.afterClass();

	}

	@Test(priority = 34)
	public void tabelaDeIsencoesExcluir() {

		tabelaDeIsencoesExcluir = new TabelaDeIsencoesExcluir();
		tabelaDeIsencoesExcluir.beforeClass();
		tabelaDeIsencoesExcluir.login();
		tabelaDeIsencoesExcluir.acessarMDR();
		tabelaDeIsencoesExcluir.excluir();
		tabelaDeIsencoesExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de inseçoes Fim-------------------------");

	}

	// 36
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de outros creditos

	@Test(priority = 36)
	public void tabelaDeOutrosCreditosCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de outros creditos-------------------------");
		tabelaDeOutrosCreditosCriar = new TabelaDeOutrosCreditosCriar();
		tabelaDeOutrosCreditosCriar.beforeClass();
		tabelaDeOutrosCreditosCriar.login();
		tabelaDeOutrosCreditosCriar.acessarMDR();
		tabelaDeOutrosCreditosCriar.criar();
		tabelaDeOutrosCreditosCriar.afterClass();

	}

	@Test(priority = 37)
	public void tabelaDeOutrosCreditosDetalhes() {

		tabelaDeOutrosCreditosDetalhes = new TabelaDeOutrosCreditosDetalhes();
		tabelaDeOutrosCreditosDetalhes.beforeClass();
		tabelaDeOutrosCreditosDetalhes.login();
		tabelaDeOutrosCreditosDetalhes.acessarMDR();
		tabelaDeOutrosCreditosDetalhes.Detalhes();
		tabelaDeOutrosCreditosDetalhes.afterClass();

	}

	@Test(priority = 38)
	public void tabelaDeOutrosCreditosEditar() {

		tabelaDeOutrosCreditosEditar = new TabelaDeOutrosCreditosEditar();
		tabelaDeOutrosCreditosEditar.beforeClass();
		tabelaDeOutrosCreditosEditar.login();
		tabelaDeOutrosCreditosEditar.acessarMDR();
		tabelaDeOutrosCreditosEditar.editar();
		tabelaDeOutrosCreditosEditar.afterClass();

	}

	@Test(priority = 39)
	public void tabelaDeOutrosCreditosVisualizar() {

		tabelaDeOutrosCreditosVisualizar = new TabelaDeOutrosCreditosVisualizar();
		tabelaDeOutrosCreditosVisualizar.beforeClass();
		tabelaDeOutrosCreditosVisualizar.login();
		tabelaDeOutrosCreditosVisualizar.acessarMDR();
		tabelaDeOutrosCreditosVisualizar.Visualizar();
		tabelaDeOutrosCreditosVisualizar.afterClass();
	}

	@Test(priority = 40)
	public void tabelaDeOutrosCreditosExcluir() {

		tabelaDeOutrosCreditosExcluir = new TabelaDeOutrosCreditosExcluir();
		tabelaDeOutrosCreditosExcluir.beforeClass();
		tabelaDeOutrosCreditosExcluir.login();
		tabelaDeOutrosCreditosExcluir.acessarMDR();
		tabelaDeOutrosCreditosExcluir.excluir();
		tabelaDeOutrosCreditosExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de outros creditos Fim-------------------------");
	}

	// 42
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Produtos
	@Test(priority = 42)
	public void tabelaDeProdutosCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Produtos-------------------------");
		tabelaDeProdutosCriar = new TabelaDeProdutosCriar();
		tabelaDeProdutosCriar.beforeClass();
		tabelaDeProdutosCriar.login();
		tabelaDeProdutosCriar.acessarMDR();
		tabelaDeProdutosCriar.criar();
		tabelaDeProdutosCriar.afterClass();

	}

	@Test(priority = 43)
	public void tabelaDeProdutosDetalhes() {
		tabelaDeProdutosDetalhes = new TabelaDeProdutosDetalhes();
		tabelaDeProdutosDetalhes.beforeClass();
		tabelaDeProdutosDetalhes.login();
		tabelaDeProdutosDetalhes.acessarMDR();
		tabelaDeProdutosDetalhes.Detalhes();
		tabelaDeProdutosDetalhes.afterClass();

	}

	@Test(priority = 44)
	public void tabelaDeProdutosExcluir() {
		tabelaDeProdutosExcluir = new TabelaDeProdutosExcluir();
		tabelaDeProdutosExcluir.beforeClass();
		tabelaDeProdutosExcluir.login();
		tabelaDeProdutosExcluir.acessarMDR();
		tabelaDeProdutosExcluir.excluir();
		tabelaDeProdutosExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Produtos Fim-------------------------");

	}

	// 48
	// Tabelas Complementares para obrigaçoes acessorias > Tabela de Logradouro
	@Test(priority = 48)
	public void tabelaLogradouroCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Logradouro-------------------------");
		tabelaLogradouroCriar = new TabelaLogradouroCriar();
		tabelaLogradouroCriar.beforeClass();
		tabelaLogradouroCriar.login();
		tabelaLogradouroCriar.acessarMDR();
		tabelaLogradouroCriar.criar();
		tabelaLogradouroCriar.afterClass();

	}

	@Test(priority = 49)
	public void tabelaLograduroDetalhes() {

		tabelaLograduroDetalhes = new TabelaLograduroDetalhes();
		tabelaLograduroDetalhes.beforeClass();
		tabelaLograduroDetalhes.login();
		tabelaLograduroDetalhes.acessarMDR();
		tabelaLograduroDetalhes.detalhes();
		tabelaLograduroDetalhes.afterClass();

	}

	@Test(priority = 50)
	public void tabelaLogradouroEditar() {

		tabelaLogradouroEditar = new TabelaLogradouroEditar();
		tabelaLogradouroEditar.beforeClass();
		tabelaLogradouroEditar.login();
		tabelaLogradouroEditar.acessarMDR();
		tabelaLogradouroEditar.editar();
		tabelaLogradouroEditar.afterClass();

	}

	@Test(priority = 51)
	public void tabelaLogradouroVisuzalizar() {

		tabelaLogradouroVisualizar = new TabelaLogradouroVisualizar();
		tabelaLogradouroVisualizar.beforeClass();
		tabelaLogradouroVisualizar.login();
		tabelaLogradouroVisualizar.acessarMDR();
		tabelaLogradouroVisualizar.visualizar();
		tabelaLogradouroVisualizar.afterClass();
	}

	@Test(priority = 52)
	public void tabelaLogradouroExcluir() {

		tabelaLogradouroExcluir = new TabelaLogradouroExcluir();
		tabelaLogradouroExcluir.beforeClass();
		tabelaLogradouroExcluir.login();
		tabelaLogradouroExcluir.acessarMDR();
		tabelaLogradouroExcluir.excluir();
		tabelaLogradouroExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias > Tabela de Logradouro Fim-------------------------");

	}

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
		System.out.println(
				"-------------------Preço de Transferencia >  Parametros Modelo De Apuracao TP Fim-------------------------");

	}

	// 123
	// Preço de Transferencia > Parametros para TP

	@Test(priority = 123)
	public void parametrosParaTPCriar() {
		System.out.println("-------------------Preço de Transferencia > Parametros para TP-------------------------");
		parametrosParaTPCriar = new ParametrosParaTPCriar();
		parametrosParaTPCriar.beforeClass();
		parametrosParaTPCriar.login();
		parametrosParaTPCriar.acessarMDR();
		parametrosParaTPCriar.criar();
		parametrosParaTPCriar.afterClass();

	}

	@Test(priority = 124)
	public void parametrosParaTPEditar() {
		parametrosParaTPEditar = new ParametrosParaTPEditar();
		parametrosParaTPEditar.beforeClass();
		parametrosParaTPEditar.login();
		parametrosParaTPEditar.acessarMDR();
		parametrosParaTPEditar.editar();
		parametrosParaTPEditar.afterClass();

	}
	
	@Test(priority = 125)
	public void parametrosParaTPFiltroId() {
		
		parametrosParaTPFiltroID = new ParametrosParaTPFiltroID();
		parametrosParaTPFiltroID.beforeClass();
		parametrosParaTPFiltroID.login();
		parametrosParaTPFiltroID.acessarMDR();
		parametrosParaTPFiltroID.filtroId();
		parametrosParaTPFiltroID.afterClass();

	}

	@Test(priority = 126)
	public void parametrosParaTPExcluir() {
		parametrosParaTPExcluir = new ParametrosParaTPExcluir();
		parametrosParaTPExcluir.beforeClass();
		parametrosParaTPExcluir.login();
		parametrosParaTPExcluir.acessarMDR();
		parametrosParaTPExcluir.excluir();
		parametrosParaTPExcluir.afterClass();

		System.out
				.println("-------------------Preço de Transferencia > Parametros para TP Fim-------------------------");

	}

	// 130
	// Registro ECAC

	@Test(priority = 130)
	public void registroECACCriar() {
		System.out.println("-------------------Registro ECAC-------------------------");
		registroECACCriar = new RegistroECACCriar();
		registroECACCriar.beforeClass();
		registroECACCriar.login();
		registroECACCriar.acessarMDR();
		registroECACCriar.criar();
		registroECACCriar.afterClass();

	}

	
	@Test(priority = 131)
	public void registroECACEditar() {
		registroECACEditar = new RegistroECACEditar();
		registroECACEditar.beforeClass();
		registroECACEditar.login();
		registroECACEditar.acessarMDR();
		registroECACEditar.editar();
		registroECACEditar.afterClass();

	}
	
	@Test(priority = 132)
	public void registroECACCVisualizar() {
		registroECACCVisualizar = new RegistroECACCVisualizar();
		registroECACCVisualizar.beforeClass();
		registroECACCVisualizar.ingresar();
		registroECACCVisualizar.ingresarMDR();
		registroECACCVisualizar.Visualizar();
		registroECACCVisualizar.afterClass();

	}

	@Test(priority = 133)
	public void registroECACExcluir() {
		registroECACExcluir = new RegistroECACExcluir();
		registroECACExcluir.beforeClass();
		registroECACExcluir.login();
		registroECACExcluir.acessarMDR();
		registroECACExcluir.excluir();
		registroECACExcluir.afterClass();
	}
	
	@Test(priority = 134)
	public void registroECACExcluirMassa() {
		registroECACExcluirMassa = new RegistroECACExcluirMassa();
		registroECACExcluirMassa.beforeClass();
		registroECACExcluirMassa.login();
		registroECACExcluirMassa.acessarMDR();
		registroECACExcluirMassa.criar();
		registroECACExcluirMassa.excluirMassa();
		registroECACExcluirMassa.afterClass();
		System.out.println("-------------------Registro ECAC Fim-------------------------");
	}

	// 136
	// Atividades Para Tributacao > Tipos De Servicos
	@Test(priority = 136)
	public void tiposDeServicosCriar() {
		System.out
				.println("-------------------Atividades Para Tributacao > Tipos De Servicos-------------------------");
		tiposDeServicosCriar = new TiposDeServicosCriar();
		tiposDeServicosCriar.beforeClass();
		tiposDeServicosCriar.login();
		tiposDeServicosCriar.acessarMDR();
		tiposDeServicosCriar.criar();
		tiposDeServicosCriar.afterClass();

	}

	@Test(priority = 137)
	public void tiposDeServicosDetalhes() {
		tiposDeServicosDetalhes = new TiposDeServicosDetalhes();
		tiposDeServicosDetalhes.beforeClass();
		tiposDeServicosDetalhes.login();
		tiposDeServicosDetalhes.acessarMDR();
		tiposDeServicosDetalhes.detalhes();
		tiposDeServicosDetalhes.afterClass();

	}

	@Test(priority = 138)
	public void tiposDeServicosEditar() {
		tiposDeServicosEditar = new TiposDeServicosEditar();
		tiposDeServicosEditar.beforeClass();
		tiposDeServicosEditar.login();
		tiposDeServicosEditar.acessarMDR();
		tiposDeServicosEditar.editar();
		tiposDeServicosEditar.afterClass();

	}

	@Test(priority = 139)
	public void tiposDeServicosVisualizar() {
		tiposDeServicosVisualizar = new TiposDeServicosVisualizar();
		tiposDeServicosVisualizar.beforeClass();
		tiposDeServicosVisualizar.login();
		tiposDeServicosVisualizar.acessarMDR();
		tiposDeServicosVisualizar.Visualizar();
		tiposDeServicosVisualizar.afterClass();

	}

	@Test(priority = 140)
	public void tiposDeServicos() {
		tiposDeServicosExcluir = new TiposDeServicosExcluir();
		tiposDeServicosExcluir.beforeClass();
		tiposDeServicosExcluir.login();
		tiposDeServicosExcluir.acessarMDR();
		tiposDeServicosExcluir.excluir();
		tiposDeServicosExcluir.afterClass();
		

	}
	
	@Test(priority = 141)
	public void tiposDeServicosFiltroID() {

		tiposDeServicosFiltroID = new TiposDeServicosFiltroID();
		tiposDeServicosFiltroID.beforeClass();
		tiposDeServicosFiltroID.login();
		tiposDeServicosFiltroID.acessarMDR();
		tiposDeServicosFiltroID.filtro();
		tiposDeServicosFiltroID.afterClass();

	}

	// 142
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV

	@Test(priority = 142)
	public void valoresParaMetodoPVVCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV-------------------------");
		valoresParaMetodoPVVCriar = new ValoresParaMetodoPVVCriar();
		valoresParaMetodoPVVCriar.beforeClass();
		valoresParaMetodoPVVCriar.login();
		valoresParaMetodoPVVCriar.acessarMDR();
		valoresParaMetodoPVVCriar.criar();
		valoresParaMetodoPVVCriar.afterClass();

	}

	@Test(priority = 142)
	public void valoresParaMetodoPVVDetalhes() {

		valoresParaMetodoPVVDetalhes = new ValoresParaMetodoPVVDetalhes();
		valoresParaMetodoPVVDetalhes.beforeClass();
		valoresParaMetodoPVVDetalhes.login();
		valoresParaMetodoPVVDetalhes.acessarMDR();
		valoresParaMetodoPVVDetalhes.Detalhes();
		valoresParaMetodoPVVDetalhes.afterClass();

	}

	@Test(priority = 143)
	public void valoresParaMetodoPVVEditar() {

		valoresParaMetodoPVVEditar = new ValoresParaMetodoPVVEditar();
		valoresParaMetodoPVVEditar.beforeClass();
		valoresParaMetodoPVVEditar.login();
		valoresParaMetodoPVVEditar.acessarMDR();
		valoresParaMetodoPVVEditar.editar();
		valoresParaMetodoPVVEditar.afterClass();

	}
	

	@Test(priority = 144)
	public void valoresParaMetodoPVVFiltroID() {

		valoresParaMetodoPVVFiltroID = new ValoresParaMetodoPVVFiltroID();
		valoresParaMetodoPVVFiltroID.beforeClass();
		valoresParaMetodoPVVFiltroID.login();
		valoresParaMetodoPVVFiltroID.acessarMDR();
		valoresParaMetodoPVVFiltroID.filtro();
		valoresParaMetodoPVVFiltroID.afterClass();

	}


	@Test(priority = 145)
	public void valoresParaMetodoPVVExcluir() {

		valoresParaMetodoPVVExcluir = new ValoresParaMetodoPVVExcluir();
		valoresParaMetodoPVVExcluir.beforeClass();
		valoresParaMetodoPVVExcluir.login();
		valoresParaMetodoPVVExcluir.acessarMDR();
		valoresParaMetodoPVVExcluir.excluir();
		valoresParaMetodoPVVExcluir.afterClass();
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV Fim-------------------------");

	}

	// 149
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX

	@Test(priority = 149)
	public void valoresParaMetodoPVEXCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX-------------------------");
		valoresParaMetodoPVEXCriar = new ValoresParaMetodoPVEXCriar();
		valoresParaMetodoPVEXCriar.beforeClass();
		valoresParaMetodoPVEXCriar.login();
		valoresParaMetodoPVEXCriar.acessarMDR();
		valoresParaMetodoPVEXCriar.criar();
		valoresParaMetodoPVEXCriar.afterClass();

	}

	@Test(priority = 150)
	public void valoresParaMetodoPVEXDetalhes() {

		valoresParaMetodoPVEXDetalhes = new ValoresParaMetodoPVEXDetalhes();
		valoresParaMetodoPVEXDetalhes.beforeClass();
		valoresParaMetodoPVEXDetalhes.login();
		valoresParaMetodoPVEXDetalhes.acessarMDR();
		valoresParaMetodoPVEXDetalhes.Detalhes();
		valoresParaMetodoPVEXDetalhes.afterClass();

	}

	@Test(priority = 151)
	public void valoresParaMetodoPVEXEditar() {

		valoresParaMetodoPVEXEditar = new ValoresParaMetodoPVEXEditar();
		valoresParaMetodoPVEXEditar.beforeClass();
		valoresParaMetodoPVEXEditar.login();
		valoresParaMetodoPVEXEditar.acessarMDR();
		valoresParaMetodoPVEXEditar.editar();
		valoresParaMetodoPVEXEditar.afterClass();

	}
	

	@Test(priority = 152)
	public void valoresParaMetodoPVEXFiltroID() {

		valoresParaMetodoPVEXFiltroID = new ValoresParaMetodoPVEXFiltroID();
		valoresParaMetodoPVEXFiltroID.beforeClass();
		valoresParaMetodoPVEXFiltroID.login();
		valoresParaMetodoPVEXFiltroID.acessarMDR();
		valoresParaMetodoPVEXFiltroID.filtro();
		valoresParaMetodoPVEXFiltroID.afterClass();

	}


	@Test(priority = 153)
	public void valoresParaMetodoPVEXExcluir() {

		valoresParaMetodoPVEXExcluir = new ValoresParaMetodoPVEXExcluir();
		valoresParaMetodoPVEXExcluir.beforeClass();
		valoresParaMetodoPVEXExcluir.login();
		valoresParaMetodoPVEXExcluir.acessarMDR();
		valoresParaMetodoPVEXExcluir.excluir();
		valoresParaMetodoPVEXExcluir.afterClass();
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX Fim-------------------------");
	}

	// 156
	//// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX

	@Test(priority = 156)
	public void valoresParaMetodoPECEXCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX-------------------------");
		valoresParaMetodoPECEXCriar = new ValoresParaMetodoPECEXCriar();
		valoresParaMetodoPECEXCriar.beforeClass();
		valoresParaMetodoPECEXCriar.login();
		valoresParaMetodoPECEXCriar.acessarMDR();
		valoresParaMetodoPECEXCriar.criar();
		valoresParaMetodoPECEXCriar.afterClass();

	}

	@Test(priority = 157)
	public void valoresParaMetodoPECEXDetalhes() {

		valoresParaMetodoPECEXDetalhes = new ValoresParaMetodoPECEXDetalhes();
		valoresParaMetodoPECEXDetalhes.beforeClass();
		valoresParaMetodoPECEXDetalhes.login();
		valoresParaMetodoPECEXDetalhes.acessarMDR();
		valoresParaMetodoPECEXDetalhes.Detalhes();
		valoresParaMetodoPECEXDetalhes.afterClass();

	}

	@Test(priority = 158)
	public void valoresParaMetodoPECEXEditar() {

		valoresParaMetodoPECEXEditar = new ValoresParaMetodoPECEXEditar();
		valoresParaMetodoPECEXEditar.beforeClass();
		valoresParaMetodoPECEXEditar.login();
		valoresParaMetodoPECEXEditar.acessarMDR();
		valoresParaMetodoPECEXEditar.editar();
		valoresParaMetodoPECEXEditar.afterClass();

	}
	
	//Preço de Transferência > Valores para Método / Valores para Método PECEX
	@Test(priority = 159)
	public void valoresParaMetodoPECEXFiltroID() {

		valoresParaMetodoPECEXFiltroID = new ValoresParaMetodoPECEXFiltroID();
		valoresParaMetodoPECEXFiltroID.beforeClass();
		valoresParaMetodoPECEXFiltroID.login();
		valoresParaMetodoPECEXFiltroID.acessarMDR();
		valoresParaMetodoPECEXFiltroID.filtro();
		valoresParaMetodoPECEXFiltroID.afterClass();

	}


	@Test(priority = 160)
	public void valoresParaMetodoPECEXExcluir() {

		valoresParaMetodoPECEXExcluir = new ValoresParaMetodoPECEXExcluir();
		valoresParaMetodoPECEXExcluir.beforeClass();
		valoresParaMetodoPECEXExcluir.login();
		valoresParaMetodoPECEXExcluir.acessarMDR();
		valoresParaMetodoPECEXExcluir.excluir();
		valoresParaMetodoPECEXExcluir.afterClass();
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX Fim-------------------------");

	}

	// 163
	// Reinf > Processos Adm/Judiciais

	@Test(priority = 163)
	public void processosAdmJudiciaisCriar() {
		System.out.println("-------------------Reinf > Processos Adm/Judiciais-------------------------");
		processosAdmJudiciaisCriar = new ProcessosAdmJudiciaisCriar();
		processosAdmJudiciaisCriar.beforeClass();
		processosAdmJudiciaisCriar.login();
		processosAdmJudiciaisCriar.acessarMDR();
		processosAdmJudiciaisCriar.criar();
		processosAdmJudiciaisCriar.afterClass();

	}

	@Test(priority = 164)
	public void processosAdmJudiciaisEditar() {

		processosAdmJudiciaisEditar = new ProcessosAdmJudiciaisEditar();
		processosAdmJudiciaisEditar.beforeClass();
		processosAdmJudiciaisEditar.login();
		processosAdmJudiciaisEditar.acessarMDR();
		processosAdmJudiciaisEditar.editar();
		processosAdmJudiciaisEditar.afterClass();

	}

	@Test(priority = 165)
	public void processosAdmJudiciaisDetalhes() {

		processosAdmJudiciaisDetalhes = new ProcessosAdmJudiciaisDetalhes();
		processosAdmJudiciaisDetalhes.beforeClass();
		processosAdmJudiciaisDetalhes.login();
		processosAdmJudiciaisDetalhes.acessarMDR();
		processosAdmJudiciaisDetalhes.detalhes();
		processosAdmJudiciaisDetalhes.afterClass();

	}

	@Test(priority = 166)
	public void processosAdmJudiciaisExcluir() {

		processosAdmJudiciaisExcluir = new ProcessosAdmJudiciaisExcluir();
		processosAdmJudiciaisExcluir.beforeClass();
		processosAdmJudiciaisExcluir.login();
		processosAdmJudiciaisExcluir.acessarMDR();
		processosAdmJudiciaisExcluir.excluir();
		processosAdmJudiciaisExcluir.afterClass();

		System.out.println("-------------------Reinf > Processos Adm/Judiciais Fim-------------------------");

	}
	// 169
	// Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra

	@Test(priority = 169)
	public void determinacaoDeRelevanciaPorRegraCriar() {
		System.out.println(
				"-------------------Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra-------------------------");
		determinacaoDeRelevanciaPorRegraCriar = new DeterminacaoDeRelevanciaPorRegraCriar();
		determinacaoDeRelevanciaPorRegraCriar.beforeClass();
		determinacaoDeRelevanciaPorRegraCriar.login();
		determinacaoDeRelevanciaPorRegraCriar.acessarMDR();
		determinacaoDeRelevanciaPorRegraCriar.criar();
		determinacaoDeRelevanciaPorRegraCriar.afterClass();

	}

	@Test(priority = 170)
	public void determinacaoDeRelevanciaPorRegraEditar() {
		determinacaoDeRelevanciaPorRegraEditar = new DeterminacaoDeRelevanciaPorRegraEditar();
		determinacaoDeRelevanciaPorRegraEditar.beforeClass();
		determinacaoDeRelevanciaPorRegraEditar.login();
		determinacaoDeRelevanciaPorRegraEditar.acessarMDR();
		determinacaoDeRelevanciaPorRegraEditar.editar();
		determinacaoDeRelevanciaPorRegraEditar.afterClass();

	}

	@Test(priority = 171)
	public void determinacaoDeRelevanciaPorRegraDetalhes() {
		determinacaoDeRelevanciaPorRegraDetalhes = new DeterminacaoDeRelevanciaPorRegraDetalhes();
		determinacaoDeRelevanciaPorRegraDetalhes.beforeClass();
		determinacaoDeRelevanciaPorRegraDetalhes.login();
		determinacaoDeRelevanciaPorRegraDetalhes.acessarMDR();
		determinacaoDeRelevanciaPorRegraDetalhes.detalhes();
		determinacaoDeRelevanciaPorRegraDetalhes.afterClass();

	}

	@Test(priority = 172)
	public void determinacaoDeRelevanciaPorRegraVisualizar() {
		determinacaoDeRelevanciaPorRegraVisualizar = new DeterminacaoDeRelevanciaPorRegraVisualizar();
		determinacaoDeRelevanciaPorRegraVisualizar.beforeClass();
		determinacaoDeRelevanciaPorRegraVisualizar.login();
		determinacaoDeRelevanciaPorRegraVisualizar.acessarMDR();
		determinacaoDeRelevanciaPorRegraVisualizar.Visualizar();
		determinacaoDeRelevanciaPorRegraVisualizar.afterClass();

	}

	@Test(priority = 173)
	public void determinacaoDeRelevanciaPorRegraExcluir() {
		determinacaoDeRelevanciaPorRegraExcluir = new DeterminacaoDeRelevanciaPorRegraExcluir();
		determinacaoDeRelevanciaPorRegraExcluir.beforeClass();
		determinacaoDeRelevanciaPorRegraExcluir.login();
		determinacaoDeRelevanciaPorRegraExcluir.acessarMDR();
		determinacaoDeRelevanciaPorRegraExcluir.excluir();
		determinacaoDeRelevanciaPorRegraExcluir.afterClass();
		System.out.println(
				"-------------------Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra Fim-------------------------");

	}

	// 176
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP

	@Test(priority = 176)
	public void valoresParaMetodoCAPCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP-------------------------");
		valoresParaMetodoCAPCriar = new ValoresParaMetodoCAPCriar();
		valoresParaMetodoCAPCriar.beforeClass();
		valoresParaMetodoCAPCriar.login();
		valoresParaMetodoCAPCriar.acessarMDR();
		valoresParaMetodoCAPCriar.criar();
		valoresParaMetodoCAPCriar.afterClass();

	}

	@Test(priority = 177)
	public void valoresParaMetodoCAPEditar() {
		valoresParaMetodoCAPEditar = new ValoresParaMetodoCAPEditar();
		valoresParaMetodoCAPEditar.beforeClass();
		valoresParaMetodoCAPEditar.login();
		valoresParaMetodoCAPEditar.acessarMDR();
		valoresParaMetodoCAPEditar.editar();
		valoresParaMetodoCAPEditar.afterClass();

	}

	@Test(priority = 178)
	public void valoresParaMetodoCAPDetalhes() {
		valoresParaMetodoCAPDetalhes = new ValoresParaMetodoCAPDetalhes();
		valoresParaMetodoCAPDetalhes.beforeClass();
		valoresParaMetodoCAPDetalhes.login();
		valoresParaMetodoCAPDetalhes.acessarMDR();
		valoresParaMetodoCAPDetalhes.Detalhes();
		valoresParaMetodoCAPDetalhes.afterClass();

	}
	
	
	@Test(priority = 179)
	public void valoresParaMetodoCAPFiltroID() {

		valoresParaMetodoCAPFiltroID = new ValoresParaMetodoCAPFiltroID();
		valoresParaMetodoCAPFiltroID.beforeClass();
		valoresParaMetodoCAPFiltroID.login();
		valoresParaMetodoCAPFiltroID.acessarMDR();
		valoresParaMetodoCAPFiltroID.filtro();
		valoresParaMetodoCAPFiltroID.afterClass();

	}


	@Test(priority = 180)
	public void valoresParaMetodoCAPExcluir() {
		valoresParaMetodoCAPExcluir = new ValoresParaMetodoCAPExcluir();
		valoresParaMetodoCAPExcluir.beforeClass();
		valoresParaMetodoCAPExcluir.login();
		valoresParaMetodoCAPExcluir.acessarMDR();
		valoresParaMetodoCAPExcluir.excluir();
		valoresParaMetodoCAPExcluir.afterClass();
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP Fim-------------------------");

	}

	// 183
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVA

	@Test(priority = 183)
	public void valoresParaMetodoPVACriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PVA-------------------------");
		valoresParaMetodoPVACriar = new ValoresParaMetodoPVACriar();
		valoresParaMetodoPVACriar.beforeClass();
		valoresParaMetodoPVACriar.login();
		valoresParaMetodoPVACriar.acessarMDR();
		valoresParaMetodoPVACriar.criar();
		valoresParaMetodoPVACriar.afterClass();

	}

	@Test(priority = 184)
	public void valoresParaMetodoPVAEditar() {

		valoresParaMetodoPVAEditar = new ValoresParaMetodoPVAEditar();
		valoresParaMetodoPVAEditar.beforeClass();
		valoresParaMetodoPVAEditar.login();
		valoresParaMetodoPVAEditar.acessarMDR();
		valoresParaMetodoPVAEditar.editar();
		valoresParaMetodoPVAEditar.afterClass();

	}

	@Test(priority = 185)
	public void valoresParaMetodoPVADetalhes() {

		valoresParaMetodoPVADetalhes = new ValoresParaMetodoPVADetalhes();
		valoresParaMetodoPVADetalhes.beforeClass();
		valoresParaMetodoPVADetalhes.login();
		valoresParaMetodoPVADetalhes.acessarMDR();
		valoresParaMetodoPVADetalhes.Detalhes();
		valoresParaMetodoPVADetalhes.afterClass();

	}
	

	@Test(priority = 186)
	public void valoresParaMetodoPVAFiltroID() {

		valoresParaMetodoPVAFiltroID = new ValoresParaMetodoPVAFiltroID();
		valoresParaMetodoPVAFiltroID.beforeClass();
		valoresParaMetodoPVAFiltroID.login();
		valoresParaMetodoPVAFiltroID.acessarMDR();
		valoresParaMetodoPVAFiltroID.filtro();
		valoresParaMetodoPVAFiltroID.afterClass();

	}


	@Test(priority = 187)
	public void valoresParaMetodoPVAExcluir() {

		valoresParaMetodoPVAExcluir = new ValoresParaMetodoPVAExcluir();
		valoresParaMetodoPVAExcluir.beforeClass();
		valoresParaMetodoPVAExcluir.login();
		valoresParaMetodoPVAExcluir.acessarMDR();
		valoresParaMetodoPVAExcluir.excluir();
		valoresParaMetodoPVAExcluir.afterClass();

		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PVA Fim-------------------------");

	}

	// 190
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CPL
	
		@Test(priority = 190)
		public void valoresParaMetodoCPLCriar() {
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo CPL-------------------------");
			valoresParaMetodoCPLCriar = new ValoresParaMetodoCPLCriar();
			valoresParaMetodoCPLCriar.beforeClass();
			valoresParaMetodoCPLCriar.login();
			valoresParaMetodoCPLCriar.acessarMDR();
			valoresParaMetodoCPLCriar.criar();
			valoresParaMetodoCPLCriar.afterClass();


		}
	
		@Test(priority = 191)
		public void valoresParaMetodoCPLEditar() {
			valoresParaMetodoCPLEditar = new ValoresParaMetodoCPLEditar();
			valoresParaMetodoCPLEditar.beforeClass();
			valoresParaMetodoCPLEditar.login();
			valoresParaMetodoCPLEditar.acessarMDR();
			valoresParaMetodoCPLEditar.editar();
			valoresParaMetodoCPLEditar.afterClass();

		}
		
		@Test(priority = 192)
		public void valoresParaMetodoCPLDetalhes() {
			valoresParaMetodoCPLDetalhes = new ValoresParaMetodoCPLDetalhes();
			valoresParaMetodoCPLDetalhes.beforeClass();
			valoresParaMetodoCPLDetalhes.login();
			valoresParaMetodoCPLDetalhes.acessarMDR();
			valoresParaMetodoCPLDetalhes.Detalhes();
			valoresParaMetodoCPLDetalhes.afterClass();

		}
		
		
		@Test(priority = 193)
		public void valoresParaMetodoCPLFiltroID() {

			valoresParaMetodoCPLFiltroID = new ValoresParaMetodoCPLFiltroID();
			valoresParaMetodoCPLFiltroID.beforeClass();
			valoresParaMetodoCPLFiltroID.login();
			valoresParaMetodoCPLFiltroID.acessarMDR();
			valoresParaMetodoCPLFiltroID.filtro();
			valoresParaMetodoCPLFiltroID.afterClass();

		}

		
		@Test(priority = 194)
		public void valoresParaMetodoCPLExcluir() {
			valoresParaMetodoCPLExcluir = new ValoresParaMetodoCPLExcluir();
			valoresParaMetodoCPLExcluir.beforeClass();
			valoresParaMetodoCPLExcluir.login();
			valoresParaMetodoCPLExcluir.acessarMDR();
			valoresParaMetodoCPLExcluir.excluir();
			valoresParaMetodoCPLExcluir.afterClass();
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo CPL Fim-------------------------");
			
		}
	//197
	//Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PCI	
		
		@Test(priority = 197)
		public void valoresParaMetodoPCICriar() {
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PCI-------------------------");
			valoresParaMetodoPCICriar = new ValoresParaMetodoPCICriar();
			valoresParaMetodoPCICriar.beforeClass();
			valoresParaMetodoPCICriar.login();
			valoresParaMetodoPCICriar.acessarMDR();
			valoresParaMetodoPCICriar.criar();
			valoresParaMetodoPCICriar.afterClass();

		}
		
		@Test(priority = 198)
		public void valoresParaMetodoPCIEditar() {
			valoresParaMetodoPCIEditar = new ValoresParaMetodoPCIEditar();
			valoresParaMetodoPCIEditar.beforeClass();
			valoresParaMetodoPCIEditar.login();
			valoresParaMetodoPCIEditar.acessarMDR();
			valoresParaMetodoPCIEditar.editar();
			valoresParaMetodoPCIEditar.afterClass();

		}
		
		@Test(priority = 199)
		public void valoresParaMetodoPCIDetalhes() {
			valoresParaMetodoPCIDetalhes = new ValoresParaMetodoPCIDetalhes();
			valoresParaMetodoPCIDetalhes.beforeClass();
			valoresParaMetodoPCIDetalhes.login();
			valoresParaMetodoPCIDetalhes.acessarMDR();
			valoresParaMetodoPCIDetalhes.Detalhes();
			valoresParaMetodoPCIDetalhes.afterClass();

		}
		

		@Test(priority = 200)
		public void valoresParaMetodoPCIFiltroID() {

			valoresParaMetodoPCIFiltroID = new ValoresParaMetodoPCIFiltroID();
			valoresParaMetodoPCIFiltroID.beforeClass();
			valoresParaMetodoPCIFiltroID.login();
			valoresParaMetodoPCIFiltroID.acessarMDR();
			valoresParaMetodoPCIFiltroID.filtro();
			valoresParaMetodoPCIFiltroID.afterClass();

		}

		
		@Test(priority = 201)
		public void valoresParaMetodoPCIExcluir() {
			valoresParaMetodoPCIExcluir = new ValoresParaMetodoPCIExcluir();
			valoresParaMetodoPCIExcluir.beforeClass();
			valoresParaMetodoPCIExcluir.login();
			valoresParaMetodoPCIExcluir.acessarMDR();
			valoresParaMetodoPCIExcluir.excluir();
			valoresParaMetodoPCIExcluir.afterClass();
			
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PCI Fim-------------------------");
			

		}
		
		//204
		//Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PIC
		
		@Test(priority = 204)
		public void valoresParaMetodoPICCriar() {
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PIC-------------------------");
			valoresParaMetodoPICCriar = new ValoresParaMetodoPICCriar();
			valoresParaMetodoPICCriar.beforeClass();
			valoresParaMetodoPICCriar.login();
			valoresParaMetodoPICCriar.acessarMDR();
			valoresParaMetodoPICCriar.criar();
			valoresParaMetodoPICCriar.afterClass();

		}
		
		@Test(priority = 205)
		public void valoresParaMetodoPICEditar() {
			
			valoresParaMetodoPICEditar = new ValoresParaMetodoPICEditar();
			valoresParaMetodoPICEditar.beforeClass();
			valoresParaMetodoPICEditar.login();
			valoresParaMetodoPICEditar.acessarMDR();
			valoresParaMetodoPICEditar.editar();
			valoresParaMetodoPICEditar.afterClass();

		}
		
		@Test(priority = 206)
		public void valoresParaMetodoPICDetalhes() {
			
			valoresParaMetodoPICDetalhes = new ValoresParaMetodoPICDetalhes();
			valoresParaMetodoPICDetalhes.beforeClass();
			valoresParaMetodoPICDetalhes.login();
			valoresParaMetodoPICDetalhes.acessarMDR();
			valoresParaMetodoPICDetalhes.Detalhes();
			valoresParaMetodoPICDetalhes.afterClass();

		}
		
		@Test(priority = 207)
		public void valoresParaMetodoPICExcluir() {
			
			valoresParaMetodoPICExcluir = new ValoresParaMetodoPICExcluir();
			valoresParaMetodoPICExcluir.beforeClass();
			valoresParaMetodoPICExcluir.login();
			valoresParaMetodoPICExcluir.acessarMDR();
			valoresParaMetodoPICExcluir.excluir();
			valoresParaMetodoPICExcluir.afterClass();
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PIC Fim-------------------------");
			

		}
		
		//211
		//Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PRL
		@Test(priority = 211)
		public void valoresParaMetodoPRLCriar() {
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PRL-------------------------");
			valoresParaMetodoPRLCriar = new ValoresParaMetodoPRLCriar();
			valoresParaMetodoPRLCriar.beforeClass();
			valoresParaMetodoPRLCriar.login();
			valoresParaMetodoPRLCriar.acessarMDR();
			valoresParaMetodoPRLCriar.criar();
			valoresParaMetodoPRLCriar.afterClass();

		}
		
		@Test(priority = 212)
		public void valoresParaMetodoPRLEditar() {
			valoresParaMetodoPRLEditar = new ValoresParaMetodoPRLEditar();
			valoresParaMetodoPRLEditar.beforeClass();
			valoresParaMetodoPRLEditar.login();
			valoresParaMetodoPRLEditar.acessarMDR();
			valoresParaMetodoPRLEditar.editar();
			valoresParaMetodoPRLEditar.afterClass();

		}
		
		@Test(priority = 213)
		public void valoresParaMetodoPRLDetalhes() {
			valoresParaMetodoPRLDetalhes = new ValoresParaMetodoPRLDetalhes();
			valoresParaMetodoPRLDetalhes.beforeClass();
			valoresParaMetodoPRLDetalhes.login();
			valoresParaMetodoPRLDetalhes.acessarMDR();
			valoresParaMetodoPRLDetalhes.Detalhes();
			valoresParaMetodoPRLDetalhes.afterClass();

		}
		
		@Test(priority = 214)
		public void valoresParaMetodoPRLFiltroID() {
			valoresParaMetodoPRLFiltroID = new ValoresParaMetodoPRLFiltroID();
			valoresParaMetodoPRLFiltroID.beforeClass();
			valoresParaMetodoPRLFiltroID.login();
			valoresParaMetodoPRLFiltroID.acessarMDR();
			valoresParaMetodoPRLFiltroID.filtro();
			valoresParaMetodoPRLFiltroID.afterClass();

		}
		
		@Test(priority = 215)
		public void valoresParaMetodoPRLExcluir() {
			valoresParaMetodoPRLExcluir = new ValoresParaMetodoPRLExcluir();
			valoresParaMetodoPRLExcluir.beforeClass();
			valoresParaMetodoPRLExcluir.login();
			valoresParaMetodoPRLExcluir.acessarMDR();
			valoresParaMetodoPRLExcluir.excluir();
			valoresParaMetodoPRLExcluir.afterClass();
			System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PRL Fim-------------------------");
			
		}
		
		//218
		//Siscoserv > Pais/Moeda
		@Test(priority = 218)
		public void paisMoedaCriar() {
			System.out.println("-------------------Siscoserv > Pais/Moeda-------------------------");
			paisMoedaCriar = new PaisMoedaCriar();
			paisMoedaCriar.beforeClass();
			paisMoedaCriar.login();
			paisMoedaCriar.acessarMDR();
			paisMoedaCriar.criar();
			paisMoedaCriar.afterClass();

		}
		
		@Test(priority = 219)
		public void paisMoedaEditar() {
			paisMoedaEditar = new PaisMoedaEditar();
			paisMoedaEditar.beforeClass();
			paisMoedaEditar.login();
			paisMoedaEditar.acessarMDR();
			paisMoedaEditar.editar();
			paisMoedaEditar.afterClass();

		}
		
		@Test(priority = 220)
		public void paisMoedaDetalhes() {
			paisMoedaDetalhes = new PaisMoedaDetalhes();
			paisMoedaDetalhes.beforeClass();
			paisMoedaDetalhes.login();
			paisMoedaDetalhes.acessarMDR();
			paisMoedaDetalhes.detalhes();
			paisMoedaDetalhes.afterClass();

		}
		
		@Test(priority = 221)
		public void paisMoedaVisualizar() {
			paisMoedaVisualizar = new PaisMoedaVisualizar();
			paisMoedaVisualizar.beforeClass();
			paisMoedaVisualizar.login();
			paisMoedaVisualizar.acessarMDR();
			paisMoedaVisualizar.Visualizar();
			paisMoedaVisualizar.afterClass();

		}
		
		@Test(priority = 222)
		public void paisMoedaExcluir() {
			paisMoedaExcluir = new PaisMoedaExcluir();
			paisMoedaExcluir.beforeClass();
			paisMoedaExcluir.login();
			paisMoedaExcluir.acessarMDR();
			paisMoedaExcluir.excluir();
			paisMoedaExcluir.afterClass();
			System.out.println("-------------------Siscoserv > Pais/Moeda Fim-------------------------");
			
		}
		
		//224
		////Siscoserv > NBS
		
		@Test(priority = 224)
		public void nbsCriar() {
			System.out.println("-------------------Siscoserv > NBS-------------------------");
			nbsCriar = new NBSCriar();
			nbsCriar.beforeClass();
			nbsCriar.login();
			nbsCriar.acessarMDR();
			nbsCriar.criar();
			nbsCriar.afterClass();

		}
		
		@Test(priority = 225)
		public void nbsEditar() {
			nbsEditar = new NBSEditar();
			nbsEditar.beforeClass();
			nbsEditar.login();
			nbsEditar.acessarMDR();
			nbsEditar.editar();
			nbsEditar.afterClass();

		}
		
		@Test(priority = 226)
		public void nbsDetalhes() {
			nbsDetalhes = new NBSDetalhes();
			nbsDetalhes.beforeClass();
			nbsDetalhes.login();
			nbsDetalhes.acessarMDR();
			nbsDetalhes.detalhes();
			nbsDetalhes.afterClass();

		}
		
		@Test(priority = 227)
		public void nbsExcluir() {
			nbsExcluir = new NBSExcluir();
			nbsExcluir.beforeClass();
			nbsExcluir.login();
			nbsExcluir.acessarMDR();
			nbsExcluir.excluir();
			nbsExcluir.afterClass();		
		}
		
		@Test(priority = 228)
		public void nbsExcluirMassa() {
			nBSExcluirMassa = new NBSExcluirMassa();
			nBSExcluirMassa.beforeClass();
			nBSExcluirMassa.login();
			nBSExcluirMassa.acessarMDR();
			nBSExcluirMassa.criar();
			nBSExcluirMassa.excluirMassa();
			nBSExcluirMassa.afterClass();
			System.out.println("-------------------Siscoserv > NBS FIM-------------------------");			
		}
		
		//231
		//Siscoserv > Enquadramento
		
		@Test(priority = 231)
		public void enquadramentoCriar() {
			System.out.println("-------------------Siscoserv > Enquadramento-------------------------");
			enquadramentoCriar = new EnquadramentoCriar();
			enquadramentoCriar.beforeClass();
			enquadramentoCriar.login();
			enquadramentoCriar.acessarMDR();
			enquadramentoCriar.criar();
			enquadramentoCriar.afterClass();

		}
		
		@Test(priority = 232)
		public void enquadramentoEditar() {
			enquadramentoEditar = new EnquadramentoEditar();
			enquadramentoEditar.beforeClass();
			enquadramentoEditar.login();
			enquadramentoEditar.acessarMDR();
			enquadramentoEditar.editar();
			enquadramentoEditar.afterClass();

		}
		
		@Test(priority = 233)
		public void enquadramentoVisualizar() {
			enquadramentoVisualizar = new EnquadramentoVisualizar();
			enquadramentoVisualizar.beforeClass();
			enquadramentoVisualizar.login();
			enquadramentoVisualizar.acessarMDR();
			enquadramentoVisualizar.Visualizar();
			enquadramentoVisualizar.afterClass();

		}
		
		
		@Test(priority = 234)
		public void enquadramentoExcluir() {
			enquadramentoExcluir = new EnquadramentoExcluir();
			enquadramentoExcluir.beforeClass();
			enquadramentoExcluir.login();
			enquadramentoExcluir.acessarMDR();
			enquadramentoExcluir.excluir();
			enquadramentoExcluir.afterClass();
			System.out.println("-------------------Siscoserv > Enquadramento Fim-------------------------");
			
		}
		
		//237
		@Test(priority = 237)
		public void registroRASCriar() {
			System.out.println("-------------------Siscoserv > Registro RAS-------------------------");
			registroRASCriar = new RegistroRASCriar();
			registroRASCriar.beforeClass();
			registroRASCriar.login();
			registroRASCriar.acessarMDR();
			registroRASCriar.criar();
			registroRASCriar.afterClass();

		}
		
		@Test(priority = 238)
		public void registroRASEditar() {
			registroRASEditar = new RegistroRASEditar();
			registroRASEditar.beforeClass();
			registroRASEditar.login();
			registroRASEditar.acessarMDR();
			registroRASEditar.editar();
			registroRASEditar.afterClass();

		}
		
		@Test(priority = 239)
		public void registroRASDetalhes() {
			registroRASDetalhes = new RegistroRASDetalhes();
			registroRASDetalhes.beforeClass();
			registroRASDetalhes.login();
			registroRASDetalhes.acessarMDR();
			registroRASDetalhes.detalhes();
			registroRASDetalhes.afterClass();

		}
		
		@Test(priority = 240)
		public void registroRASFiltroID() {
			registroRASFiltroID = new RegistroRASFiltroID();
			registroRASFiltroID.beforeClass();
			registroRASFiltroID.login();
			registroRASFiltroID.acessarMDR();
			registroRASFiltroID.filtroId();
			registroRASFiltroID.afterClass();

		}
		
		@Test(priority = 241)
		public void registroRASVisualizar() {
			registroRASVisualizar = new RegistroRASVisualizar();
			registroRASVisualizar.beforeClass();
			registroRASVisualizar.login();
			registroRASVisualizar.acessarMDR();
			registroRASVisualizar.Visualizar();
			registroRASVisualizar.afterClass();

		}
		
		@Test(priority = 242)
		public void registroRASExcluir() {
			registroRASExcluir = new RegistroRASExcluir();
			registroRASExcluir.beforeClass();
			registroRASExcluir.login();
			registroRASExcluir.acessarMDR();
			registroRASExcluir.excluir();
			registroRASExcluir.afterClass();
			System.out.println("-------------------Siscoserv > Registro RAS FIM-------------------------");
			

		}
		
		//244
		//Siscoserv > Registro RP
		@Test(priority = 244)
		public void registroRPCriar() {
			System.out.println("-------------------Siscoserv > Registro RP-------------------------");
			registroRPCriar = new RegistroRPCriar();
			registroRPCriar.beforeClass();
			registroRPCriar.login();
			registroRPCriar.acessarMDR();
			registroRPCriar.criar();
			registroRPCriar.afterClass();

		}
		
		@Test(priority = 245)
		public void registroRPEditar() {
			registroRPEditar = new RegistroRPEditar();
			registroRPEditar.beforeClass();
			registroRPEditar.login();
			registroRPEditar.acessarMDR();
			registroRPEditar.editar();
			registroRPEditar.afterClass();

		}
		
		@Test(priority = 246)
		public void registroRPDetalhes() {
			registroRPDetalhes = new RegistroRPDetalhes();
			registroRPDetalhes.beforeClass();
			registroRPDetalhes.login();
			registroRPDetalhes.acessarMDR();
			registroRPDetalhes.detalhes();
			registroRPDetalhes.afterClass();

		}
		
		@Test(priority = 247)
		public void registroRPFiltroID() {
			registroRPFiltroID = new RegistroRPFiltroID();
			registroRPFiltroID.beforeClass();
			registroRPFiltroID.login();
			registroRPFiltroID.acessarMDR();
			registroRPFiltroID.filtroId();
			registroRPFiltroID.afterClass();

		}
		
		@Test(priority = 248)
		public void registroRPExcluir() {
			registroRPExcluir = new RegistroRPExcluir();
			registroRPExcluir.beforeClass();
			registroRPExcluir.login();
			registroRPExcluir.acessarMDR();
			registroRPExcluir.excluir();
			registroRPExcluir.afterClass();
			System.out.println("-------------------Siscoserv > Registro RP Fim-------------------------");
			

		}
		
		//251
		//Siscoserv > Registro RVS
		@Test(priority = 251)
		public void registroRVSCriar() {
			System.out.println("-------------------Siscoserv > Registro RVS-------------------------");
			registroRVSCriar = new RegistroRVSCriar();
			registroRVSCriar.beforeClass();
			registroRVSCriar.login();
			registroRVSCriar.acessarMDR();
			registroRVSCriar.criar();
			registroRVSCriar.afterClass();

		}
		
		@Test(priority = 252)
		public void registroRVSDetalhes() {
			
			registroRVSDetalhes = new RegistroRVSDetalhes();
			registroRVSDetalhes.beforeClass();
			registroRVSDetalhes.login();
			registroRVSDetalhes.acessarMDR();
			registroRVSDetalhes.detalhes();
			registroRVSDetalhes.afterClass();

		}
		
		@Test(priority = 253)
		public void registroRVSEditar() {
			
			registroRVSEditar = new RegistroRVSEditar();
			registroRVSEditar.beforeClass();
			registroRVSEditar.login();
			registroRVSEditar.acessarMDR();
			registroRVSEditar.editar();
			registroRVSEditar.afterClass();

		}
		
		@Test(priority = 254)
		public void registroRVSVisualizar() {
			
			registroRVSVisualizar = new RegistroRVSVisualizar();
			registroRVSVisualizar.beforeClass();
			registroRVSVisualizar.login();
			registroRVSVisualizar.acessarMDR();
			registroRVSVisualizar.Visualizar();
			registroRVSVisualizar.afterClass();

		}
		
		@Test(priority = 255)
		public void registroRVSFiltroID() {
			
			registroRVSFiltroID = new RegistroRVSFiltroID();
			registroRVSFiltroID.beforeClass();
			registroRVSFiltroID.login();
			registroRVSFiltroID.acessarMDR();
			registroRVSFiltroID.filtroId();
			registroRVSFiltroID.afterClass();

		}
		
		@Test(priority = 256)
		public void registroRVSExcluir() {
			
			registroRVSExcluir = new RegistroRVSExcluir();
			registroRVSExcluir.beforeClass();
			registroRVSExcluir.login();
			registroRVSExcluir.acessarMDR();
			registroRVSExcluir.excluir();
			registroRVSExcluir.afterClass();
			
			System.out.println("-------------------Siscoserv > Registro RVS Fim-------------------------");
			

		}
		
		//258
		//Eventos e-Social	S1060 > Ambientes de Trabalho

		
		
		@Test(priority = 262)
		public void S1060AmbientesDeTrablhoExcluirMassa() {
			
			s1060AmbientesDeTrablhoExcluirMassa = new S1060AmbientesDeTrablhoExcluirMassa();
			s1060AmbientesDeTrablhoExcluirMassa.beforeClass();
			s1060AmbientesDeTrablhoExcluirMassa.login();
			s1060AmbientesDeTrablhoExcluirMassa.acessarMDR();
			s1060AmbientesDeTrablhoExcluirMassa.criar();
			s1060AmbientesDeTrablhoExcluirMassa.afterClass();
			
			System.out.println("-------------------Eventos e-Social	S1060 > Ambientes de Trabalho Fim-------------------------");
			

		}
	
		//262


}