package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.ContratoIOF.ContratoIOFEditarPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXEditarPO;
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
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosCriar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosDetalhes;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosEditar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosExcluir;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosVisualizar;
import com.timp.test.MDR.CEP.Bairro.BairroCriar;
import com.timp.test.MDR.CEP.Bairro.BairroEditar;
import com.timp.test.MDR.CEP.Bairro.BairroEliminar;
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
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabalizacaoVisualizar;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoCriar;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoEditar;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoExcluir;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaCriar;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaDetalhes;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaEditar;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaExcluir;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaVisualizar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailCriar;
import com.timp.test.MDR.ContratoIOF.ContratoIOFCriar;
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
import com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoVisualizar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraCriar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraDetalhes;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraEditar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluir;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraVisualizar;
import com.timp.test.MDR.Empresas.EmpresaEditar;
import com.timp.test.MDR.Empresas.EmpresasFiltros;
import com.timp.test.MDR.Empresas.EmpresasVisualizar;
import com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorCriar;
import com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorDetalhes;
import com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralExcluir;
import com.timp.test.MDR.Filiais.FiliaisEditar;
import com.timp.test.MDR.Filiais.FiliaisVisualizar;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVACriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVADetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVExcluir;
import com.timp.test.MDR.RegistroECAC.RegistroECACCriar;
import com.timp.test.MDR.RegistroECAC.RegistroECACEditar;
import com.timp.test.MDR.RegistroECAC.RegistroECACExcluir;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisCriar;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisDetalhes;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisEditar;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisExcluir;
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
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoEditar;
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

	// Preço de Transferencia > Parametros Modelo De Apuracao TP
	ParametrosModeloDeApuracaoTPCriar parametrosModeloDeApuracaoTPCriar;
	ParametrosModeloDeApuracaoTPEditar parametrosModeloDeApuracaoTPEditar;
	ParametrosModeloDeApuracaoTPDetalhes parametrosModeloDeApuracaoTPDetalhes;
	ParametrosModeloDeApuracaoTPExcluir parametrosModeloDeApuracaoTPExcluir;

	//// Preço de Transferencia > Parametros para TP
	ParametrosParaTPCriar parametrosParaTPCriar;
	ParametrosParaTPEditar parametrosParaTPEditar;
	ParametrosParaTPExcluir parametrosParaTPExcluir;

	//// Registro ECAC

		RegistroECACCriar registroECACCriar;
		RegistroECACEditar registroECACEditar;
		RegistroECACExcluir registroECACExcluir;
		
	//Atividades Para Tributacao > Tipos De Servicos
		TiposDeServicosCriar tiposDeServicosCriar;
		TiposDeServicosDetalhes tiposDeServicosDetalhes;
		TiposDeServicosEditar tiposDeServicosEditar;
		TiposDeServicosVisualizar tiposDeServicosVisualizar;
		TiposDeServicosExcluir tiposDeServicosExcluir;
		
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV
		ValoresParaMetodoPVVCriar valoresParaMetodoPVVCriar;
		ValoresParaMetodoPVVDetalhes valoresParaMetodoPVVDetalhes;
		ValoresParaMetodoPVVEditar valoresParaMetodoPVVEditar;
		ValoresParaMetodoPVVExcluir valoresParaMetodoPVVExcluir;
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX
		ValoresParaMetodoPVEXCriar valoresParaMetodoPVEXCriar;
		ValoresParaMetodoPVEXDetalhes valoresParaMetodoPVEXDetalhes;
		ValoresParaMetodoPVEXEditar valoresParaMetodoPVEXEditar;
		ValoresParaMetodoPVEXExcluir valoresParaMetodoPVEXExcluir;
		
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX
		ValoresParaMetodoPECEXCriar valoresParaMetodoPECEXCriar;
		ValoresParaMetodoPECEXDetalhes valoresParaMetodoPECEXDetalhes;
		ValoresParaMetodoPECEXEditar valoresParaMetodoPECEXEditar;
		ValoresParaMetodoPECEXExcluir valoresParaMetodoPECEXExcluir;
	
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
		
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVA
		ValoresParaMetodoPVACriar valoresParaMetodoPVACriar;
		ValoresParaMetodoPVADetalhes valoresParaMetodoPVADetalhes;
		ValoresParaMetodoPVAEditar valoresParaMetodoPVAEditar;
		ValoresParaMetodoPVAExcluir valoresParaMetodoPVAExcluir;
		

	
	


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
		System.out.println(
				"-------------------Tabelas Complementares para obrigaçoes acessorias >Tabela de Receitas (Credito Fiscal Antecipado) Fim-------------------------");

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
	public void registroECACExcluir() {
		registroECACExcluir = new RegistroECACExcluir();
		registroECACExcluir.beforeClass();
		registroECACExcluir.login();
		registroECACExcluir.acessarMDR();
		registroECACExcluir.excluir();
		registroECACExcluir.afterClass();
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

	@Test(priority = 159)
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

	
	//176
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP
	
	@Test(priority = 176)
	public void valoresParaMetodoCAPCriar() {
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP-------------------------");
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
	public void valoresParaMetodoCAPExcluir() {
		valoresParaMetodoCAPExcluir = new ValoresParaMetodoCAPExcluir();
		valoresParaMetodoCAPExcluir.beforeClass();
		valoresParaMetodoCAPExcluir.login();
		valoresParaMetodoCAPExcluir.acessarMDR();
		valoresParaMetodoCAPExcluir.excluir();
		valoresParaMetodoCAPExcluir.afterClass();
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP Fim-------------------------");
		

	}
	
	//183
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVA
	
	@Test(priority = 183)
	public void valoresParaMetodoPVACriar() {
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PVA-------------------------");
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
	public void valoresParaMetodoPVAExcluir() {
		
	    valoresParaMetodoPVAExcluir = new ValoresParaMetodoPVAExcluir();
	    valoresParaMetodoPVAExcluir.beforeClass();
	    valoresParaMetodoPVAExcluir.login();
	    valoresParaMetodoPVAExcluir.acessarMDR();
	    valoresParaMetodoPVAExcluir.excluir();
	    valoresParaMetodoPVAExcluir.afterClass();
	    
	    System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PVA Fim-------------------------");
		

	}
	
	//190


	

}