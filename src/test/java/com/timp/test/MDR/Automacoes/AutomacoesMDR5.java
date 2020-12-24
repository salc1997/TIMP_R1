
package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCECriar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEVisualizar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaDetalhes;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaExcluir;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaExcluirEmMassa;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaVisualizar;
import com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalCriar;
import com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalEditar;
import com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalExcluir;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroFornecedor.CadastroFornecedorCriar;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroFornecedor.CadastroFornecedorEditar;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroFornecedor.CadastroFornecedorExcluir;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroFornecedor.CadastroFornecedorVisualizar;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalCriar;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalEditar;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalExcluir;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalExcluirEmMassa;
import com.timp.test.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosCriar;
import com.timp.test.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosDetalhes;
import com.timp.test.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosEditar;
import com.timp.test.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosExcluir;
import com.timp.test.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosVisualizar;
import com.timp.test.MDR.TabelaDeApoioECF.TabelaDeApoioECFAtualizar;
import com.timp.test.MDR.TabelaDeApoioECF.TabelaDeApoioECFCriar;
import com.timp.test.MDR.TabelaDeApoioECF.TabelaDeApoioECFEditar;
import com.timp.test.MDR.TabelaDeApoioECF.TabelaDeApoioECFExcluir;
import com.timp.test.MDR.TabelaDeApoioECF.TabelaDeApoioECFNovaTabelaECF;
import com.timp.test.MDR.TabelaDeApoioECF.TabelaDeApoioECFNovaVersaoLeiaute;
import com.timp.test.MDR.TabelaDeApoioECF.TabelaDeApoioECFVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaCriar;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaDetalhes;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaEditar;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluir;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluirEmMasa;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaFiltroCodigo;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaVisualizar;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioCriar;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioDetalhes;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluir;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioVisualizar;
import com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.DefinicaoVinculacao.DefinicaoVinculacaoFiltroID;
import com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosCriar;
import com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosEditar;
import com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosExcluir;
import com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosExcluirMassa;
import com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosFiltroID;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFCriar;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFEditar;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFVisualizar;


public class AutomacoesMDR5 extends TestBaseSteven {

	// Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de
	// Motivos de Reabertura

	CadastroMotivosReaberturaCriar cadastroMotivosReaberturaCriar;
	CadastroMotivosReaberturaDetalhes cadastroMotivosReaberturaDetalhes;
	CadastroMotivosReaberturaEditar cadastroMotivosReaberturaEditar;
	CadastroMotivosReaberturaExcluir cadastroMotivosReaberturaExcluir;
	CadastroMotivosReaberturaVisualizar cadastroMotivosReaberturaVisualizar;
	CadastroMotivosReaberturaExcluirEmMassa cadastroMotivosReaberturaExcluirEmMassa;
	// Parâmetros de criação de NF > Cadastro de Nota Fiscal

	CadastroNotaFiscalCriar cadastroNotaFiscalCriar;
	CadastroNotaFiscalEditar cadastroNotaFiscalEditar;
	CadastroNotaFiscalExcluir cadastroNotaFiscalExcluir;
	CadastroNotaFiscalExcluirEmMassa cadastroNotaFiscalExcluirEmMassa;

	// Parâmetros de criação de NF > Cadastro de Fornecedor

	CadastroFornecedorCriar cadastroFornecedorcerCriar;
	CadastroFornecedorEditar cadastroFornecedorEditar;
	CadastroFornecedorVisualizar cadastroFornecedorVisualizar;
	CadastroFornecedorExcluir cadastroFornecedorExcluir;

	// Ocorrência Fiscal > Status de Ocorrência Fiscal

	StatusOcorrenciaFiscalCriar statusOcorrenciaFiscalCriar;
	StatusOcorrenciaFiscalEditar statusOcorrenciaFiscalEditar;
	StatusOcorrenciaFiscalExcluir statusOcorrenciaFiscalExcluir;

	// Parâmetros de Oficialização de Livros

	ParametrosOficializacaoLivrosCriar parametrosOficializacaoLivrosCriar;
	ParametrosOficializacaoLivrosDetalhes parametrosOficializacaoLivrosDetalhes;
	ParametrosOficializacaoLivrosEditar parametrosOficializacaoLivrosEditar;
	ParametrosOficializacaoLivrosExcluir parametrosOficializacaoLivrosExcluir;
	ParametrosOficializacaoLivrosVisualizar parametrosOficializacaoLivrosVisualizar;

	// Tabela de Apoio ECF
	TabelaDeApoioECFCriar tabelaDeApoioECFCriar;
	TabelaDeApoioECFEditar tabelaDeApoioECFEditar;
	TabelaDeApoioECFVisualizar tabelaDeApoioECFVisualizar;
	TabelaDeApoioECFExcluir tabelaDeApoioECFExcluir;
	TabelaDeApoioECFAtualizar tabelaDeApoioECFAtualizar;
	TabelaDeApoioECFNovaTabelaECF tabelaDeApoioECFNovaTabelaECF;
	TabelaDeApoioECFNovaVersaoLeiaute tabelaDeApoioECFNovaVersaoLeiaute;

	// Controle de Crédito Tributário > Status para BCE

	StatusParaBCECriar statusParaBCECriar;
	StatusParaBCEEditar statusParaBCEEditar;
	StatusParaBCEDetalhes statusParaBCEDetalhes;
	StatusParaBCEVisualizar statusParaBCEVisualizar;
	StatusParaBCEExcluir statusParaBCEExcluir;

	// Valor Adicionado > Municípios

	MunicipioCriar municipioCriar;
	MunicipioVisualizar municipioVisualizar;
	MunicipioExcluir municipioExcluir;
	MunicipioDetalhes municipioDetalhes;
	MunicipioEditar municipioEditar;
	
	//Preço de Transferência > Commoditie para TP
	CommoditieParaTPCriar  commoditieParaTPCriar;
	CommoditieParaTPFiltroID commoditieParaTPFiltroID;
	
	
	//Preço de Transferência > Definição de Vinculação
	DefinicaoVinculacaoFiltroID definicaoVinculacaoFiltroID;
	
	//SCANC > Relacionamento entre Quadros
	RelacionamentoEntreQuadrosCriar relacionamentoEntreQuadrosCriar;
	RelacionamentoEntreQuadrosEditar relacionamentoEntreQuadrosEditar;
	RelacionamentoEntreQuadrosExcluir relacionamentoEntreQuadrosExcluir;
	RelacionamentoEntreQuadrosFiltroID relacionamentoEntreQuadrosFiltroID;
	RelacionamentoEntreQuadrosExcluirMassa relacionamentoEntreQuadrosExcluirMassa;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 13 - Parte do Corpo Atingida
	
	ParteDoCorpoAtingidaCriar parteDoCorpoAtingidaCriar;
	ParteDoCorpoAtingidaEditar parteDoCorpoAtingidaEditar;
	ParteDoCorpoAtingidaExcluir parteDoCorpoAtingidaExcluir;
	ParteDoCorpoAtingidaVisualizar parteDoCorpoAtingidaVisualizar;
	
	
	//Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente
	
	AgenteCausadorDeAcidenteCriar agenteCausadorDeAcidenteCriar;
	AgenteCausadorDeAcidenteEditar agenteCausadorDeAcidenteEditar;
	AgenteCausadorDeAcidenteExcluir agenteCausadorDeAcidenteExcluir;
	AgenteCausadorDeAcidenteVisualizar agenteCausadorDeAcidenteVisualizar;
	
	
	//Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação
	
	CompatibilidadeEntreLotacaoCriar compatibilidadeEntreLotacaoCriar;
	CompatibilidadeEntreLotacaoEditar compatibilidadeEntreLotacaoEditar;
	CompatibilidadeEntreLotacaoExcluir compatibilidadeEntreLotacaoExcluir;
	CompatibilidadeEntreLotacaoVisualizar compatibilidadeEntreLotacaoVisualizar;
	
	//Siscoserv > Registro RF
	RegistroRFCriar registroRFCriar;
	RegistroRFEditar  registroRFEditar;
	RegistroRFDetalhes registroRFDetalhes;
	RegistroRFVisualizar registroRFVisualizar;
	RegistroRFExcluir registroRFExcluir;
	
	
	//Tabelas de Apoio E-SOCIAL	Tabela 09 - Tipos de Arquivos e-Social
	
	TiposDeArquivosESocialCriar tiposDeArquivosESocialCriar;
	TiposDeArquivosESocialEditar tiposDeArquivosESocialEditar;
	TiposDeArquivosESocialExcluir tiposDeArquivosESocialExcluir;
	TiposDeArquivosESocialExcluirEmMassa tiposDeArquivosESocialExcluirEmMassa;
	TiposDeArquivosESocialVisualizar tiposDeArquivosESocialVisualizar;
	
	
	//Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária
	
	TiposDeLotacaoTributarioCriar tiposDeLotacaoTributarioCriar;
	TiposDeLotacaoTributarioEditar tiposDeLotacaoTributarioEditar;
	TiposDeLotacaoTributarioExcluir tiposDeLotacaoTributarioExcluir;
	TiposDeLotacaoTributarioExcluirEmMassa tiposDeLotacaoTributarioExcluirEmMassa;
	TiposDeLotacaoTributarioVisualizar tiposDeLotacaoTributarioVisualizar;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 18 - Motivos de Afastamento
	MotivoDeAfastamentoCriar motivoDeAfastamentoCriar;
	MotivoDeAfastamentoEditar motivoDeAfastamentoEditar;
	MotivoDeAfastamentoExcluir motivoDeAfastamentoExcluir;
	MotivoDeAfastamentoExcluirEmMassa motivoDeAfastamentoExcluirEmMassa;
	MotivoDeAfastamentoVisualizar motivoDeAfastamentoVisualizar;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 20 - Tipos de Logradouro
	TiposDeLogradouroCriar tiposDeLogradouroCriar;
	TiposDeLogradouroEditar tiposDeLogradouroEditar;
	TiposDeLogradouroExcluir tiposDeLogradouroExcluir;
	TiposDeLogradouroExcluirEmMasa tiposDeLogradouroExcluirEmMasa;
	TiposDeLogradouroVisualizar tiposDeLogradouroVisualizar;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 21 - Natureza Juridica
	NaturezaJuridicaCriar naturezaJuridicaCriar;
	NaturezaJuridicaEditar naturezaJuridicaEditar;
	NaturezaJuridicaExcluir naturezaJuridicaExcluir;
	NaturezaJuridicaVisualizar naturezaJuridicaVisualizar;
	NaturezaJuridicaExcluirMassa naturezaJuridicaExcluirMassa;
	
	//Tabelas de Apoio E-SOCIAL > Unidade de Medida
	UnidadeDeMedidaCriar unidadeDeMedidaCriar;
	UnidadeDeMedidaEditar unidadeDeMedidaEditar;
	UnidadeDeMedidaDetalhes unidadeDeMedidaDetalhes;
	UnidadeDeMedidaVisualizar unidadeDeMedidaVisualizar;
	UnidadeDeMedidaExcluir unidadeDeMedidaExcluir;
	UnidadeDeMedidaExcluirEmMasa unidadeDeMedidaExcluirEmMasa;
	UnidadeDeMedidaFiltroCodigo unidadeDeMedidaFiltroCodigo;
	
	
	
	// 0

	// Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de
	// Motivos de Reabertura

	@Test(priority = 0)
	public void cadastroMotivosReaberturaCriar() {

		System.out.println(
				"-------------------Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de Motivos de Reabertura-------------------------");

		cadastroMotivosReaberturaCriar = new CadastroMotivosReaberturaCriar();
		cadastroMotivosReaberturaCriar.beforeClass();
		cadastroMotivosReaberturaCriar.login();
		cadastroMotivosReaberturaCriar.acessarMDR();
		cadastroMotivosReaberturaCriar.criar();
		cadastroMotivosReaberturaCriar.afterClass();

	}

	@Test(priority = 1)
	public void cadastroMotivosReaberturaEditar() {

		cadastroMotivosReaberturaEditar = new CadastroMotivosReaberturaEditar();
		cadastroMotivosReaberturaEditar.beforeClass();
		cadastroMotivosReaberturaEditar.login();
		cadastroMotivosReaberturaEditar.acessarMDR();
		cadastroMotivosReaberturaEditar.editar();
		cadastroMotivosReaberturaEditar.afterClass();

	}

	@Test(priority = 2)
	public void cadastroMotivosReaberturaVisualizar() {

		cadastroMotivosReaberturaVisualizar = new CadastroMotivosReaberturaVisualizar();
		cadastroMotivosReaberturaVisualizar.beforeClass();
		cadastroMotivosReaberturaVisualizar.login();
		cadastroMotivosReaberturaVisualizar.acessarMDR();
		cadastroMotivosReaberturaVisualizar.visualizar();
		cadastroMotivosReaberturaVisualizar.afterClass();

	}
	

	@Test(priority = 3)
	public void cadastroMotivosReaberturaDetalhes() {

		cadastroMotivosReaberturaDetalhes = new CadastroMotivosReaberturaDetalhes();
		cadastroMotivosReaberturaDetalhes.beforeClass();
		cadastroMotivosReaberturaDetalhes.login();
		cadastroMotivosReaberturaDetalhes.acessarMDR();
		cadastroMotivosReaberturaDetalhes.detalhes();
		cadastroMotivosReaberturaDetalhes.afterClass();

	}

	@Test(priority = 4)
	public void cadastroMotivosReaberturaExcluir() {

		cadastroMotivosReaberturaExcluir = new CadastroMotivosReaberturaExcluir();
		cadastroMotivosReaberturaExcluir.beforeClass();
		cadastroMotivosReaberturaExcluir.login();
		cadastroMotivosReaberturaExcluir.acessarMDR();
		cadastroMotivosReaberturaExcluir.excluir();
		cadastroMotivosReaberturaExcluir.afterClass();

		
	}
	
	@Test(priority = 5)
	public void cadastroMotivosReaberturaExcluirEmMassa() {

		cadastroMotivosReaberturaExcluirEmMassa = new CadastroMotivosReaberturaExcluirEmMassa();
		cadastroMotivosReaberturaExcluirEmMassa.beforeClass();
		cadastroMotivosReaberturaExcluirEmMassa.login();
		cadastroMotivosReaberturaExcluirEmMassa.acessarMDR();
		cadastroMotivosReaberturaExcluirEmMassa.criar();
		cadastroMotivosReaberturaExcluirEmMassa.afterClass();
		
		System.out.println(
				"-------------------Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de Motivos de Reabertura Fin-------------------------");

	}


	// 6

	// Parâmetros de criação de NF > Cadastro de Nota Fiscal

	@Test(priority = 6)
	public void cadastroNotaFiscalCriar() {

		System.out.println(
				"-------------------Parâmetros de criação de NF > Cadastro de Nota Fiscal-------------------------");

		cadastroNotaFiscalCriar = new CadastroNotaFiscalCriar();
		cadastroNotaFiscalCriar.beforeClass();
		cadastroNotaFiscalCriar.login();
		cadastroNotaFiscalCriar.acessarMDR();
		cadastroNotaFiscalCriar.criar();
		cadastroNotaFiscalCriar.afterClass();

	}

	@Test(priority = 7)
	public void cadastroNotaFiscalEditar() {

		cadastroNotaFiscalEditar = new CadastroNotaFiscalEditar();
		cadastroNotaFiscalEditar.beforeClass();
		cadastroNotaFiscalEditar.login();
		cadastroNotaFiscalEditar.acessarMDR();
		cadastroNotaFiscalEditar.editar();
		cadastroNotaFiscalEditar.afterClass();

	}

	@Test(priority = 8)
	public void cadastroNotaFiscalExcluir() {

		cadastroNotaFiscalExcluir = new CadastroNotaFiscalExcluir();
		cadastroNotaFiscalExcluir.beforeClass();
		cadastroNotaFiscalExcluir.login();
		cadastroNotaFiscalExcluir.acessarMDR();
		cadastroNotaFiscalExcluir.excluir();
		cadastroNotaFiscalExcluir.afterClass();
}

	@Test(priority = 9)
	public void cadastroNotaFiscalExcluirEmMassa() {

		cadastroNotaFiscalExcluirEmMassa = new CadastroNotaFiscalExcluirEmMassa();
		cadastroNotaFiscalExcluirEmMassa.beforeClass();
		cadastroNotaFiscalExcluirEmMassa.ingresar();
		cadastroNotaFiscalExcluirEmMassa.mdrEntrar();
		cadastroNotaFiscalExcluirEmMassa.excluirEmMassa();
		cadastroNotaFiscalExcluirEmMassa.afterClass();
		
		System.out.println(
				"-------------------Parâmetros de criação de NF > Cadastro de Nota Fiscal Fin-------------------------");
	
	}
	
	// 12

	// Ocorrência Fiscal > Status de Ocorrência Fiscal

	@Test(priority = 12)
	public void statusOcorrenciaFiscalCriar() {

		System.out
				.println("-------------------Ocorrência Fiscal > Status de Ocorrência Fiscal-------------------------");

		statusOcorrenciaFiscalCriar = new StatusOcorrenciaFiscalCriar();
		statusOcorrenciaFiscalCriar.beforeClass();
		statusOcorrenciaFiscalCriar.login();
		statusOcorrenciaFiscalCriar.acessarMDR();
		statusOcorrenciaFiscalCriar.criar();
		statusOcorrenciaFiscalCriar.afterClass();

	}

	@Test(priority = 13)
	public void statusOcorrenciaFiscalEditar() {

		statusOcorrenciaFiscalEditar = new StatusOcorrenciaFiscalEditar();
		statusOcorrenciaFiscalEditar.beforeClass();
		statusOcorrenciaFiscalEditar.login();
		statusOcorrenciaFiscalEditar.acessarMDR();
		statusOcorrenciaFiscalEditar.editar();
		statusOcorrenciaFiscalEditar.afterClass();

	}

	@Test(priority = 14)
	public void statusOcorrenciaFiscalExcluir() {

		statusOcorrenciaFiscalExcluir = new StatusOcorrenciaFiscalExcluir();
		statusOcorrenciaFiscalExcluir.beforeClass();
		statusOcorrenciaFiscalExcluir.login();
		statusOcorrenciaFiscalExcluir.acessarMDR();
		statusOcorrenciaFiscalExcluir.excluir();
		statusOcorrenciaFiscalExcluir.afterClass();

		System.out.println(
				"-------------------Ocorrência Fiscal > Status de Ocorrência Fiscal Fin-------------------------");
	}

	// 18

	// Parâmetros de Oficialização de Livros

	@Test(priority = 20)
	public void parametrosOficializacaoLivrosCriar() {

		System.out.println("-------------------Parâmetros de Oficialização de Livros-------------------------");

		parametrosOficializacaoLivrosCriar = new ParametrosOficializacaoLivrosCriar();
		parametrosOficializacaoLivrosCriar.beforeClass();
		parametrosOficializacaoLivrosCriar.login();
		parametrosOficializacaoLivrosCriar.acessarMDR();
		parametrosOficializacaoLivrosCriar.criar();
		parametrosOficializacaoLivrosCriar.afterClass();

	}

	@Test(priority = 21)
	public void parametrosOficializacaoLivrosEditar() {

		parametrosOficializacaoLivrosEditar = new ParametrosOficializacaoLivrosEditar();
		parametrosOficializacaoLivrosEditar.beforeClass();
		parametrosOficializacaoLivrosEditar.login();
		parametrosOficializacaoLivrosEditar.acessarMDR();
		parametrosOficializacaoLivrosEditar.editar();
		parametrosOficializacaoLivrosEditar.afterClass();

	}

	@Test(priority = 22)
	public void parametrosOficializacaoLivrosVisualizar() {

		parametrosOficializacaoLivrosVisualizar = new ParametrosOficializacaoLivrosVisualizar();
		parametrosOficializacaoLivrosVisualizar.beforeClass();
		parametrosOficializacaoLivrosVisualizar.login();
		parametrosOficializacaoLivrosVisualizar.acessarMDR();
		parametrosOficializacaoLivrosVisualizar.visualizar();
		parametrosOficializacaoLivrosVisualizar.afterClass();

	}

	@Test(priority = 23)
	public void parametrosOficializacaoLivrosDetalhes() {

		parametrosOficializacaoLivrosDetalhes = new ParametrosOficializacaoLivrosDetalhes();
		parametrosOficializacaoLivrosDetalhes.beforeClass();
		parametrosOficializacaoLivrosDetalhes.login();
		parametrosOficializacaoLivrosDetalhes.acessarMDR();
		parametrosOficializacaoLivrosDetalhes.detalhes();
		parametrosOficializacaoLivrosDetalhes.afterClass();

	}

	@Test(priority = 24)
	public void parametrosOficializacaoLivrosExcluir() {

		parametrosOficializacaoLivrosExcluir = new ParametrosOficializacaoLivrosExcluir();
		parametrosOficializacaoLivrosExcluir.beforeClass();
		parametrosOficializacaoLivrosExcluir.login();
		parametrosOficializacaoLivrosExcluir.acessarMDR();
		parametrosOficializacaoLivrosExcluir.excluir();
		parametrosOficializacaoLivrosExcluir.afterClass();

		System.out.println("-------------------Parâmetros de Oficialização de Livros Fin-------------------------");
	}

	// 26

	// Tabela de Apoio ECF

	@Test(priority = 26)
	public void tabelaDeApoioECFCriar() {

		System.out.println("-------------------Tabela de Apoio ECF-------------------------");

		tabelaDeApoioECFCriar = new TabelaDeApoioECFCriar();
		tabelaDeApoioECFCriar.beforeClass();
		tabelaDeApoioECFCriar.login();
		tabelaDeApoioECFCriar.acessarMDR();
		tabelaDeApoioECFCriar.criar();
		tabelaDeApoioECFCriar.afterClass();

	}

	@Test(priority = 27)
	public void tabelaDeApoioECFEditar() {

		tabelaDeApoioECFEditar = new TabelaDeApoioECFEditar();
		tabelaDeApoioECFEditar.beforeClass();
		tabelaDeApoioECFEditar.login();
		tabelaDeApoioECFEditar.acessarMDR();
		tabelaDeApoioECFEditar.editar();
		tabelaDeApoioECFEditar.afterClass();

	}

	@Test(priority = 28)
	public void tabelaDeApoioECFVisualizar() {

		tabelaDeApoioECFVisualizar = new TabelaDeApoioECFVisualizar();
		tabelaDeApoioECFVisualizar.beforeClass();
		tabelaDeApoioECFVisualizar.login();
		tabelaDeApoioECFVisualizar.acessarMDR();
		tabelaDeApoioECFVisualizar.visualizar();
		tabelaDeApoioECFVisualizar.afterClass();

	}

	@Test(priority = 29)
	public void tabelaDeApoioECFNovaTabelaAtualizar() {

		tabelaDeApoioECFAtualizar = new TabelaDeApoioECFAtualizar();
		tabelaDeApoioECFAtualizar.beforeClass();
		tabelaDeApoioECFAtualizar.login();
		tabelaDeApoioECFAtualizar.acessarMDR();
		tabelaDeApoioECFAtualizar.atualizar();
		tabelaDeApoioECFAtualizar.afterClass();

	}

	@Test(priority = 30)
	public void tabelaDeApoioECFNovaTabelaNova() {

		tabelaDeApoioECFNovaTabelaECF = new TabelaDeApoioECFNovaTabelaECF();
		tabelaDeApoioECFNovaTabelaECF.beforeClass();
		tabelaDeApoioECFNovaTabelaECF.login();
		tabelaDeApoioECFNovaTabelaECF.acessarMDR();
		tabelaDeApoioECFNovaTabelaECF.novaTabela();
		tabelaDeApoioECFNovaTabelaECF.afterClass();

	}

	@Test(priority = 31)
	public void tabelaDeApoioECFNovaVersaoLeiaute() {

		tabelaDeApoioECFNovaVersaoLeiaute = new TabelaDeApoioECFNovaVersaoLeiaute();
		tabelaDeApoioECFNovaVersaoLeiaute.beforeClass();
		tabelaDeApoioECFNovaVersaoLeiaute.login();
		tabelaDeApoioECFNovaVersaoLeiaute.acessarMDR();
		tabelaDeApoioECFNovaVersaoLeiaute.novaTabela();
		tabelaDeApoioECFNovaVersaoLeiaute.afterClass();

	}

	@Test(priority = 32)
	public void tabelaDeApoioECFExcluir() {

		tabelaDeApoioECFExcluir = new TabelaDeApoioECFExcluir();
		tabelaDeApoioECFExcluir.beforeClass();
		tabelaDeApoioECFExcluir.login();
		tabelaDeApoioECFExcluir.acessarMDR();
		tabelaDeApoioECFExcluir.excluir();
		tabelaDeApoioECFExcluir.afterClass();

		System.out.println("------------------Tabela de Apoio ECF Fin-------------------------");
	}

	// 35

	// Controle de Crédito Tributário > Status para BCE

	@Test(priority = 35)
	public void statusParaBCECriar() {

		System.out.println(
				"-------------------Controle de Crédito Tributário > Status para BCE-------------------------");

		statusParaBCECriar = new StatusParaBCECriar();
		statusParaBCECriar.beforeClass();
		statusParaBCECriar.login();
		statusParaBCECriar.acessarMDR();
		statusParaBCECriar.criar();
		statusParaBCECriar.afterClass();

	}

	@Test(priority = 36)
	public void statusParaBCEEditar() {

		statusParaBCEEditar = new StatusParaBCEEditar();
		statusParaBCEEditar.beforeClass();
		statusParaBCEEditar.login();
		statusParaBCEEditar.acessarMDR();
		statusParaBCEEditar.editar();
		statusParaBCEEditar.afterClass();

	}

	@Test(priority = 37)
	public void statusParaBCEVisualizar() {

		statusParaBCEVisualizar = new StatusParaBCEVisualizar();
		statusParaBCEVisualizar.beforeClass();
		statusParaBCEVisualizar.login();
		statusParaBCEVisualizar.acessarMDR();
		statusParaBCEVisualizar.visualizar();
		statusParaBCEVisualizar.afterClass();

	}

	@Test(priority = 38)
	public void statusParaBCEDetalhes() {

		statusParaBCEDetalhes = new StatusParaBCEDetalhes();
		statusParaBCEDetalhes.beforeClass();
		statusParaBCEDetalhes.login();
		statusParaBCEDetalhes.acessarMDR();
		statusParaBCEDetalhes.detalhes();
		statusParaBCEDetalhes.afterClass();

	}

	@Test(priority = 39)
	public void statusParaBCEExcluir() {

		statusParaBCEExcluir = new StatusParaBCEExcluir();
		statusParaBCEExcluir.beforeClass();
		statusParaBCEExcluir.login();
		statusParaBCEExcluir.acessarMDR();
		statusParaBCEExcluir.excluir();
		statusParaBCEExcluir.afterClass();

		System.out.println(
				"-------------------Controle de Crédito Tributário > Status para BCE Fin-------------------------");
	}

	// 41

	// Valor Adicionado > municipios

	@Test(priority = 41)
	public void municipioCriar() {

		System.out.println("-------------------Valor Adicionado > municipios-------------------------");

		municipioCriar = new MunicipioCriar();
		municipioCriar.beforeClass();
		municipioCriar.login();
		municipioCriar.acessarMDR();
		municipioCriar.criar();
		municipioCriar.afterClass();

	}
	

	@Test(priority = 42)
	public void municipioEditar() {

		municipioEditar = new MunicipioEditar();
		municipioEditar.beforeClass();
		municipioEditar.ingresar();
		municipioEditar.ingresarMDR();
		municipioEditar.editar();
		municipioEditar.afterClass();

	}
	
	@Test(priority = 43)
	public void municipioVisualizar() {

		municipioVisualizar = new MunicipioVisualizar();
		municipioVisualizar.beforeClass();
		municipioVisualizar.login();
		municipioVisualizar.acessarMDR();
		municipioVisualizar.visualizar();
		municipioVisualizar.afterClass();

	}
	
	@Test(priority = 44)
	public void municipioDetalhes() {

		municipioDetalhes = new MunicipioDetalhes();
		municipioDetalhes.beforeClass();
		municipioDetalhes.login();
		municipioDetalhes.acessarMDR();
		municipioDetalhes.detalhes();
		municipioDetalhes.afterClass();

	}


	@Test(priority = 45)
	public void municipioExcluir() {

		municipioExcluir = new MunicipioExcluir();
		municipioExcluir.beforeClass();
		municipioExcluir.login();
		municipioExcluir.acessarMDR();
		municipioExcluir.excluir();
		municipioExcluir.afterClass();

		System.out.println("-------------------Valor Adicionado > municipios Fin-------------------------");
	}

	// 48

	// cadastroFornecedorcers Fiscais > cadastroFornecedorcers Fiscais

	@Test(priority = 48)
	public void cadastroFornecedorcerCriar() {

		System.out.println(
				"-------------------cadastroFornecedorcer Fiscal > cadastroFornecedorcer Fiscal-------------------------");

		cadastroFornecedorcerCriar = new CadastroFornecedorCriar();
		cadastroFornecedorcerCriar.beforeClass();
		cadastroFornecedorcerCriar.login();
		cadastroFornecedorcerCriar.acessarMDR();
		cadastroFornecedorcerCriar.criar();
		cadastroFornecedorcerCriar.afterClass();

	}

	@Test(priority = 49)
	public void cadastroFornecedorcerEditar() {

		cadastroFornecedorEditar = new CadastroFornecedorEditar();
		cadastroFornecedorEditar.beforeClass();
		cadastroFornecedorEditar.login();
		cadastroFornecedorEditar.acessarMDR();
		cadastroFornecedorEditar.editar();
		cadastroFornecedorEditar.afterClass();

	}

	@Test(priority = 50)
	public void cadastroFornecedorcerVisualizar() {

		cadastroFornecedorVisualizar = new CadastroFornecedorVisualizar();
		cadastroFornecedorVisualizar.beforeClass();
		cadastroFornecedorVisualizar.login();
		cadastroFornecedorVisualizar.acessarMDR();
		cadastroFornecedorVisualizar.visualizar();
		cadastroFornecedorVisualizar.afterClass();

	}

	@Test(priority = 51)
	public void cadastroFornecedorcerExcluir() {

		cadastroFornecedorExcluir = new CadastroFornecedorExcluir();
		cadastroFornecedorExcluir.beforeClass();
		cadastroFornecedorExcluir.login();
		cadastroFornecedorExcluir.acessarMDR();
		cadastroFornecedorExcluir.excluir();
		cadastroFornecedorExcluir.afterClass();

		System.out.println(
				"-------------------cadastroFornecedorcer Fiscal > cadastroFornecedorcer Fiscal Fin-------------------------");
	}
	
	//55
	
	//Preço de Transferência > Commoditie para TP
	@Test(priority = 55)
	public void commoditieParaTPFiltroID() {
		
		System.out.println("-------------------Preço de Transferência > Commoditie para TP-------------------------");

		commoditieParaTPFiltroID = new CommoditieParaTPFiltroID();
		commoditieParaTPFiltroID.beforeClass();
		commoditieParaTPFiltroID.login();
		commoditieParaTPFiltroID.acessarMDR();
		commoditieParaTPFiltroID.filtro();
		commoditieParaTPFiltroID.afterClass();
	}
	
	@Test(priority = 56)
	public void commoditieParaTPCriar() {
		
		 commoditieParaTPCriar = new CommoditieParaTPCriar();
		 commoditieParaTPCriar.beforeClass();
		 commoditieParaTPCriar.ingresar();
		 commoditieParaTPCriar.ingresarMDR();
		 commoditieParaTPCriar.criar();
		 commoditieParaTPCriar.afterClass();
		System.out.println("-------------------Preço de Transferência > Commoditie para TP Fin-------------------------");
	}
	
	//62
	@Test(priority = 62)
	public void definicaoVinculacaoFiltroID() {

		definicaoVinculacaoFiltroID = new DefinicaoVinculacaoFiltroID();
		definicaoVinculacaoFiltroID.beforeClass();
		definicaoVinculacaoFiltroID.login();
		definicaoVinculacaoFiltroID.acessarMDR();
		definicaoVinculacaoFiltroID.filtro();
		definicaoVinculacaoFiltroID.afterClass();

	}

	
	//69
	
	// SCANC > Relacionamento entre Quadros

		@Test(priority = 69)
		public void relacionamentoEntreQuadrosCriar() {

			System.out.println("-------------------SCANC > Relacionamento entre Quadros-------------------------");

			relacionamentoEntreQuadrosCriar = new RelacionamentoEntreQuadrosCriar();
			relacionamentoEntreQuadrosCriar.beforeClass();
			relacionamentoEntreQuadrosCriar.login();
			relacionamentoEntreQuadrosCriar.acessarMDR();
			relacionamentoEntreQuadrosCriar.criar();
			relacionamentoEntreQuadrosCriar.afterClass();

		}

		@Test(priority = 70)
		public void relacionamentoEntreQuadrosEditar() {

			relacionamentoEntreQuadrosEditar = new RelacionamentoEntreQuadrosEditar();
			relacionamentoEntreQuadrosEditar.beforeClass();
			relacionamentoEntreQuadrosEditar.login();
			relacionamentoEntreQuadrosEditar.acessarMDR();
			relacionamentoEntreQuadrosEditar.editar();
			relacionamentoEntreQuadrosEditar.afterClass();

		}
		
		@Test(priority = 71)
		public void relacionamentoEntreQuadrosFiltroID() {

			relacionamentoEntreQuadrosFiltroID = new RelacionamentoEntreQuadrosFiltroID();
			relacionamentoEntreQuadrosFiltroID.beforeClass();
			relacionamentoEntreQuadrosFiltroID.login();
			relacionamentoEntreQuadrosFiltroID.acessarMDR();
			relacionamentoEntreQuadrosFiltroID.filtro();
			relacionamentoEntreQuadrosFiltroID.afterClass();

		}



		@Test(priority = 72)
		public void relacionamentoEntreQuadrosExcluir() {

			relacionamentoEntreQuadrosExcluir = new RelacionamentoEntreQuadrosExcluir();
			relacionamentoEntreQuadrosExcluir.beforeClass();
			relacionamentoEntreQuadrosExcluir.login();
			relacionamentoEntreQuadrosExcluir.acessarMDR();
			relacionamentoEntreQuadrosExcluir.excluir();
			relacionamentoEntreQuadrosExcluir.afterClass();

		}
		
		@Test(priority = 73)
		public void relacionamentoEntreQuadrosExcluirMassa() {

			relacionamentoEntreQuadrosExcluirMassa = new RelacionamentoEntreQuadrosExcluirMassa();
			relacionamentoEntreQuadrosExcluirMassa.beforeClass();
			relacionamentoEntreQuadrosExcluirMassa.login();
			relacionamentoEntreQuadrosExcluirMassa.acessarMDR();
			relacionamentoEntreQuadrosExcluirMassa.criar();
			relacionamentoEntreQuadrosExcluirMassa.afterClass();

			System.out.println("-------------------SCANC > Relacionamento entre Quadros Fin-------------------------");
		}

	
	//75
		
		
		//Tabelas de Apoio E-SOCIAL > Tabela 13 - Parte do Corpo Atingida
		
	

		@Test(priority = 75)
		public void parteDoCorpoAtingidaCriar() {

			System.out.println("-------------------//Tabelas de Apoio E-SOCIAL > Tabela 13 - Parte do Corpo Atingida-------------------------");

			parteDoCorpoAtingidaCriar = new ParteDoCorpoAtingidaCriar();
			parteDoCorpoAtingidaCriar.beforeClass();
			parteDoCorpoAtingidaCriar.login();
			parteDoCorpoAtingidaCriar.acessarMDR();
			parteDoCorpoAtingidaCriar.criar();
			parteDoCorpoAtingidaCriar.afterClass();

		}

		@Test(priority = 76)
		public void parteDoCorpoAtingidaEditar() {

			parteDoCorpoAtingidaEditar = new ParteDoCorpoAtingidaEditar();
			parteDoCorpoAtingidaEditar.beforeClass();
			parteDoCorpoAtingidaEditar.login();
			parteDoCorpoAtingidaEditar.acessarMDR();
			parteDoCorpoAtingidaEditar.editar();
			parteDoCorpoAtingidaEditar.afterClass();

		}

		@Test(priority = 77)
		public void parteDoCorpoAtingidaVisualizar() {

			parteDoCorpoAtingidaVisualizar = new ParteDoCorpoAtingidaVisualizar();
			parteDoCorpoAtingidaVisualizar.beforeClass();
			parteDoCorpoAtingidaVisualizar.login();
			parteDoCorpoAtingidaVisualizar.acessarMDR();
			parteDoCorpoAtingidaVisualizar.visualizar();
			parteDoCorpoAtingidaVisualizar.afterClass();

		}


		@Test(priority = 78)
		public void parteDoCorpoAtingidaExcluir() {

			parteDoCorpoAtingidaExcluir = new ParteDoCorpoAtingidaExcluir();
			parteDoCorpoAtingidaExcluir.beforeClass();
			parteDoCorpoAtingidaExcluir.login();
			parteDoCorpoAtingidaExcluir.acessarMDR();
			parteDoCorpoAtingidaExcluir.excluir();
			parteDoCorpoAtingidaExcluir.afterClass();

			System.out.println("-------------------//Tabelas de Apoio E-SOCIAL > Tabela 13 - Parte do Corpo Atingida Fin-------------------------");
		}

	//81
		
		// Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente

		@Test(priority = 81)
		public void agenteCausadorDeAcidenteCriar() {

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente-------------------------");

			agenteCausadorDeAcidenteCriar = new AgenteCausadorDeAcidenteCriar();
			agenteCausadorDeAcidenteCriar.beforeClass();
			agenteCausadorDeAcidenteCriar.login();
			agenteCausadorDeAcidenteCriar.acessarMDR();
			agenteCausadorDeAcidenteCriar.criar();
			agenteCausadorDeAcidenteCriar.afterClass();

		}

		@Test(priority = 82)
		public void agenteCausadorDeAcidenteEditar() {

			agenteCausadorDeAcidenteEditar = new AgenteCausadorDeAcidenteEditar();
			agenteCausadorDeAcidenteEditar.beforeClass();
			agenteCausadorDeAcidenteEditar.login();
			agenteCausadorDeAcidenteEditar.acessarMDR();
			agenteCausadorDeAcidenteEditar.editar();
			agenteCausadorDeAcidenteEditar.afterClass();

		}

		@Test(priority = 83)
		public void agenteCausadorDeAcidenteVisualizar() {

			agenteCausadorDeAcidenteVisualizar = new AgenteCausadorDeAcidenteVisualizar();
			agenteCausadorDeAcidenteVisualizar.beforeClass();
			agenteCausadorDeAcidenteVisualizar.login();
			agenteCausadorDeAcidenteVisualizar.acessarMDR();
			agenteCausadorDeAcidenteVisualizar.visualizar();
			agenteCausadorDeAcidenteVisualizar.afterClass();

		}

		@Test(priority = 84)
		public void agenteCausadorDeAcidenteExcluir() {

			agenteCausadorDeAcidenteExcluir = new AgenteCausadorDeAcidenteExcluir();
			agenteCausadorDeAcidenteExcluir.beforeClass();
			agenteCausadorDeAcidenteExcluir.login();
			agenteCausadorDeAcidenteExcluir.acessarMDR();
			agenteCausadorDeAcidenteExcluir.excluir();
			agenteCausadorDeAcidenteExcluir.afterClass();

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente  Fin-------------------------");
		}

		
	//88
		
		// Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação

		@Test(priority = 88)
		public void compatibilidadeEntreLotacaoCriar() {

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação-------------------------");

			compatibilidadeEntreLotacaoCriar = new CompatibilidadeEntreLotacaoCriar();
			compatibilidadeEntreLotacaoCriar.beforeClass();
			compatibilidadeEntreLotacaoCriar.login();
			compatibilidadeEntreLotacaoCriar.acessarMDR();
			compatibilidadeEntreLotacaoCriar.criar();
			compatibilidadeEntreLotacaoCriar.afterClass();

		}

		@Test(priority = 89)
		public void compatibilidadeEntreLotacaoEditar() {

			compatibilidadeEntreLotacaoEditar = new CompatibilidadeEntreLotacaoEditar();
			compatibilidadeEntreLotacaoEditar.beforeClass();
			compatibilidadeEntreLotacaoEditar.login();
			compatibilidadeEntreLotacaoEditar.acessarMDR();
			compatibilidadeEntreLotacaoEditar.editar();
			compatibilidadeEntreLotacaoEditar.afterClass();

		}

		@Test(priority = 90)
		public void compatibilidadeEntreLotacaoVisualizar() {

			compatibilidadeEntreLotacaoVisualizar = new CompatibilidadeEntreLotacaoVisualizar();
			compatibilidadeEntreLotacaoVisualizar.beforeClass();
			compatibilidadeEntreLotacaoVisualizar.login();
			compatibilidadeEntreLotacaoVisualizar.acessarMDR();
			compatibilidadeEntreLotacaoVisualizar.visualizar();
			compatibilidadeEntreLotacaoVisualizar.afterClass();

		}



		@Test(priority = 91)
		public void compatibilidadeEntreLotacaoExcluir() {

			compatibilidadeEntreLotacaoExcluir = new CompatibilidadeEntreLotacaoExcluir();
			compatibilidadeEntreLotacaoExcluir.beforeClass();
			compatibilidadeEntreLotacaoExcluir.login();
			compatibilidadeEntreLotacaoExcluir.acessarMDR();
			compatibilidadeEntreLotacaoExcluir.excluir();
			compatibilidadeEntreLotacaoExcluir.afterClass();

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação Fin-------------------------");
		}

	//95
		//Siscoserv > Registro RF Fin
		@Test(priority = 95)
		public void registroRFCriar() {
			
			System.out.println("-------------------Siscoserv > Registro RF -------------------------");

			registroRFCriar = new RegistroRFCriar();
			registroRFCriar.beforeClass();
			registroRFCriar.login();
			registroRFCriar.acessarMDR();
			registroRFCriar.criar();
			registroRFCriar.afterClass();

		}
		
		@Test(priority = 96)
		public void registroRFVisualizar() {

			registroRFVisualizar = new RegistroRFVisualizar();
			registroRFVisualizar.beforeClass();
			registroRFVisualizar.login();
			registroRFVisualizar.acessarMDR();
			registroRFVisualizar.visualizar();
			registroRFVisualizar.afterClass();

		}

		@Test(priority = 97)
		public void registroRFDetalhes() {

			registroRFDetalhes = new RegistroRFDetalhes();
			registroRFDetalhes.beforeClass();
			registroRFDetalhes.login();
			registroRFDetalhes.acessarMDR();
			registroRFDetalhes.detalhes();
			registroRFDetalhes.afterClass();

		}

		@Test(priority = 98)
		public void registroRFEditar() {

			registroRFEditar = new RegistroRFEditar();
			registroRFEditar.beforeClass();
			registroRFEditar.login();
			registroRFEditar.acessarMDR();
			registroRFEditar.Editar();
			registroRFEditar.afterClass();

		}
		
		@Test(priority = 99)
		public void registroRFExcluir() {

			registroRFExcluir = new RegistroRFExcluir();
			registroRFExcluir.beforeClass();
			registroRFExcluir.login();
			registroRFExcluir.acessarMDR();
			registroRFExcluir.excluir();
			registroRFExcluir.afterClass();

			System.out.println("-------------------Siscoserv > Registro RF Fin-------------------------");
		}

		
	//102
		
		// Tabelas de Apoio E-SOCIAL > Tabela 09 - Tipos de Arquivos e-Social

		@Test(priority = 102)
		public void tiposDeArquivosESocialCriar() {

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 09 - Tipos de Arquivos e-Social-------------------------");

			tiposDeArquivosESocialCriar = new TiposDeArquivosESocialCriar();
			tiposDeArquivosESocialCriar.beforeClass();
			tiposDeArquivosESocialCriar.login();
			tiposDeArquivosESocialCriar.acessarMDR();
			tiposDeArquivosESocialCriar.criar();
			tiposDeArquivosESocialCriar.afterClass();

		}

		@Test(priority = 103)
		public void tiposDeArquivosESocialEditar() {

			tiposDeArquivosESocialEditar = new TiposDeArquivosESocialEditar();
			tiposDeArquivosESocialEditar.beforeClass();
			tiposDeArquivosESocialEditar.login();
			tiposDeArquivosESocialEditar.acessarMDR();
			tiposDeArquivosESocialEditar.editar();
			tiposDeArquivosESocialEditar.afterClass();

		}

		@Test(priority = 104)
		public void tiposDeArquivosESocialVisualizar() {

			tiposDeArquivosESocialVisualizar = new TiposDeArquivosESocialVisualizar();
			tiposDeArquivosESocialVisualizar.beforeClass();
			tiposDeArquivosESocialVisualizar.login();
			tiposDeArquivosESocialVisualizar.acessarMDR();
			tiposDeArquivosESocialVisualizar.visualizar();
			tiposDeArquivosESocialVisualizar.afterClass();

		}




		@Test(priority = 105)
		public void tiposDeArquivosESocialExcluir() {

			tiposDeArquivosESocialExcluir = new TiposDeArquivosESocialExcluir();
			tiposDeArquivosESocialExcluir.beforeClass();
			tiposDeArquivosESocialExcluir.login();
			tiposDeArquivosESocialExcluir.acessarMDR();
			tiposDeArquivosESocialExcluir.excluir();
			tiposDeArquivosESocialExcluir.afterClass();

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 09 - Tipos de Arquivos e-Social Fin-------------------------");
		}
		
		
		@Test(priority = 106)
		public void tiposDeArquivosESocialExcluirEmMassa() {

			tiposDeArquivosESocialExcluirEmMassa = new TiposDeArquivosESocialExcluirEmMassa();
			tiposDeArquivosESocialExcluirEmMassa.beforeClass();
			tiposDeArquivosESocialExcluirEmMassa.login();
			tiposDeArquivosESocialExcluirEmMassa.acessarMDR();
			tiposDeArquivosESocialExcluirEmMassa.criar();
			tiposDeArquivosESocialExcluirEmMassa.afterClass();

		}

	
		
	//109
		
		// Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária

		@Test(priority = 109)
		public void tiposDeLotacaoTributarioCriar() {

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária-------------------------");

			tiposDeLotacaoTributarioCriar = new TiposDeLotacaoTributarioCriar();
			tiposDeLotacaoTributarioCriar.beforeClass();
			tiposDeLotacaoTributarioCriar.login();
			tiposDeLotacaoTributarioCriar.acessarMDR();
			tiposDeLotacaoTributarioCriar.criar();
			tiposDeLotacaoTributarioCriar.afterClass();

		}

		@Test(priority = 110)
		public void tiposDeLotacaoTributarioEditar() {

			tiposDeLotacaoTributarioEditar = new TiposDeLotacaoTributarioEditar();
			tiposDeLotacaoTributarioEditar.beforeClass();
			tiposDeLotacaoTributarioEditar.login();
			tiposDeLotacaoTributarioEditar.acessarMDR();
			tiposDeLotacaoTributarioEditar.editar();
			tiposDeLotacaoTributarioEditar.afterClass();

		}

		@Test(priority = 111)
		public void tiposDeLotacaoTributarioVisualizar() {

			tiposDeLotacaoTributarioVisualizar = new TiposDeLotacaoTributarioVisualizar();
			tiposDeLotacaoTributarioVisualizar.beforeClass();
			tiposDeLotacaoTributarioVisualizar.login();
			tiposDeLotacaoTributarioVisualizar.acessarMDR();
			tiposDeLotacaoTributarioVisualizar.visualizar();
			tiposDeLotacaoTributarioVisualizar.afterClass();

		}



		@Test(priority = 112)
		public void tiposDeLotacaoTributarioExcluir() {

			tiposDeLotacaoTributarioExcluir = new TiposDeLotacaoTributarioExcluir();
			tiposDeLotacaoTributarioExcluir.beforeClass();
			tiposDeLotacaoTributarioExcluir.login();
			tiposDeLotacaoTributarioExcluir.acessarMDR();
			tiposDeLotacaoTributarioExcluir.excluir();
			tiposDeLotacaoTributarioExcluir.afterClass();

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária Fin-------------------------");
		}
		

		@Test(priority = 113)
		public void tiposDeLotacaoTributarioExcluirEmMassa() {

			tiposDeLotacaoTributarioExcluirEmMassa = new TiposDeLotacaoTributarioExcluirEmMassa();
			tiposDeLotacaoTributarioExcluirEmMassa.beforeClass();
			tiposDeLotacaoTributarioExcluirEmMassa.login();
			tiposDeLotacaoTributarioExcluirEmMassa.acessarMDR();
			tiposDeLotacaoTributarioExcluirEmMassa.criar();
			tiposDeLotacaoTributarioExcluirEmMassa.afterClass();

		}

		
		
	//116
		
		// Tabelas de Apoio E-SOCIAL	Tabela 18 - Motivos de Afastamento

		@Test(priority = 116)
		public void motivoDeAfastamentoCriar() {

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 18 - Motivos de Afastamento-------------------------");

			motivoDeAfastamentoCriar = new MotivoDeAfastamentoCriar();
			motivoDeAfastamentoCriar.beforeClass();
			motivoDeAfastamentoCriar.login();
			motivoDeAfastamentoCriar.acessarMDR();
			motivoDeAfastamentoCriar.criar();
			motivoDeAfastamentoCriar.afterClass();

		}

		@Test(priority = 117)
		public void motivoDeAfastamentoEditar() {

			motivoDeAfastamentoEditar = new MotivoDeAfastamentoEditar();
			motivoDeAfastamentoEditar.beforeClass();
			motivoDeAfastamentoEditar.login();
			motivoDeAfastamentoEditar.acessarMDR();
			motivoDeAfastamentoEditar.editar();
			motivoDeAfastamentoEditar.afterClass();

		}

		@Test(priority = 118)
		public void motivoDeAfastamentoVisualizar() {

			motivoDeAfastamentoVisualizar = new MotivoDeAfastamentoVisualizar();
			motivoDeAfastamentoVisualizar.beforeClass();
			motivoDeAfastamentoVisualizar.login();
			motivoDeAfastamentoVisualizar.acessarMDR();
			motivoDeAfastamentoVisualizar.visualizar();
			motivoDeAfastamentoVisualizar.afterClass();

		}



		@Test(priority = 119)
		public void motivoDeAfastamentoExcluir() {

			motivoDeAfastamentoExcluir = new MotivoDeAfastamentoExcluir();
			motivoDeAfastamentoExcluir.beforeClass();
			motivoDeAfastamentoExcluir.login();
			motivoDeAfastamentoExcluir.acessarMDR();
			motivoDeAfastamentoExcluir.excluir();
			motivoDeAfastamentoExcluir.afterClass();

			
		}
		

		@Test(priority = 120)
		public void motivoDeAfastamentoExcluirEmMassa() {

			motivoDeAfastamentoExcluirEmMassa = new MotivoDeAfastamentoExcluirEmMassa();
			motivoDeAfastamentoExcluirEmMassa.beforeClass();
			motivoDeAfastamentoExcluirEmMassa.login();
			motivoDeAfastamentoExcluirEmMassa.acessarMDR();
			motivoDeAfastamentoExcluirEmMassa.criar();
			motivoDeAfastamentoExcluirEmMassa.afterClass();
			
			System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 18 - Motivos de Afastamento Fin-------------------------");
		}

		//123
		
		@Test(priority = 123)
		public void tiposDeLogradouroCriar() {

			System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 20 - Tipos de Logradouro-------------------------");

			tiposDeLogradouroCriar = new TiposDeLogradouroCriar();
			tiposDeLogradouroCriar.beforeClass();
			tiposDeLogradouroCriar.login();
			tiposDeLogradouroCriar.acessarMDR();
			tiposDeLogradouroCriar.criar();
			tiposDeLogradouroCriar.afterClass();

		}

		@Test(priority = 124)
		public void tiposDeLogradouroEditar() {

			tiposDeLogradouroEditar = new TiposDeLogradouroEditar();
			tiposDeLogradouroEditar.beforeClass();
			tiposDeLogradouroEditar.login();
			tiposDeLogradouroEditar.acessarMDR();
			tiposDeLogradouroEditar.editar();
			tiposDeLogradouroEditar.afterClass();

		}

		@Test(priority = 125)
		public void tiposDeLogradouroVisualizar() {

			tiposDeLogradouroVisualizar = new TiposDeLogradouroVisualizar();
			tiposDeLogradouroVisualizar.beforeClass();
			tiposDeLogradouroVisualizar.login();
			tiposDeLogradouroVisualizar.acessarMDR();
			tiposDeLogradouroVisualizar.visualizar();
			tiposDeLogradouroVisualizar.afterClass();

		}



		@Test(priority = 126)
		public void tiposDeLogradouroExcluir() {

			tiposDeLogradouroExcluir = new TiposDeLogradouroExcluir();
			tiposDeLogradouroExcluir.beforeClass();
			tiposDeLogradouroExcluir.login();
			tiposDeLogradouroExcluir.acessarMDR();
			tiposDeLogradouroExcluir.excluir();
			tiposDeLogradouroExcluir.afterClass();

			
		}
		

		@Test(priority = 127)
		public void tiposDeLogradouroExcluirEmMassa() {

			tiposDeLogradouroExcluirEmMasa = new TiposDeLogradouroExcluirEmMasa();
			tiposDeLogradouroExcluirEmMasa.beforeClass();
			tiposDeLogradouroExcluirEmMasa.login();
			tiposDeLogradouroExcluirEmMasa.acessarMDR();
			tiposDeLogradouroExcluirEmMasa.excluir();
			tiposDeLogradouroExcluirEmMasa.afterClass();
			
			System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 20 - Tipos de Logradouro fin-------------------------");

		}



		//129
		
		
		@Test(priority = 129)
		public void naturezaJuridicaCriar() {

			System.out.println("-------------------naturezaJuridica Fiscal > naturezaJuridica Fiscal-------------------------");

			naturezaJuridicaCriar = new NaturezaJuridicaCriar();
			naturezaJuridicaCriar.beforeClass();
			naturezaJuridicaCriar.login();
			naturezaJuridicaCriar.acessarMDR();
			naturezaJuridicaCriar.criar();
			naturezaJuridicaCriar.afterClass();

		}

		@Test(priority = 130)
		public void naturezaJuridicaEditar() {

			naturezaJuridicaEditar = new NaturezaJuridicaEditar();
			naturezaJuridicaEditar.beforeClass();
			naturezaJuridicaEditar.login();
			naturezaJuridicaEditar.acessarMDR();
			naturezaJuridicaEditar.editar();
			naturezaJuridicaEditar.afterClass();

		}

		@Test(priority = 131)
		public void naturezaJuridicaVisualizar() {

			naturezaJuridicaVisualizar = new NaturezaJuridicaVisualizar();
			naturezaJuridicaVisualizar.beforeClass();
			naturezaJuridicaVisualizar.login();
			naturezaJuridicaVisualizar.acessarMDR();
			naturezaJuridicaVisualizar.visualizar();
			naturezaJuridicaVisualizar.afterClass();

		}



		@Test(priority = 132)
		public void naturezaJuridicaExcluir() {

			naturezaJuridicaExcluir = new NaturezaJuridicaExcluir();
			naturezaJuridicaExcluir.beforeClass();
			naturezaJuridicaExcluir.login();
			naturezaJuridicaExcluir.acessarMDR();
			naturezaJuridicaExcluir.excluir();
			naturezaJuridicaExcluir.afterClass();
		}
		
		
		@Test(priority = 133)
		public void naturezaJuridicaExcluirMassa() {

			naturezaJuridicaExcluirMassa = new NaturezaJuridicaExcluirMassa();
			naturezaJuridicaExcluirMassa.beforeClass();
			naturezaJuridicaExcluirMassa.login();
			naturezaJuridicaExcluirMassa.acessarMDR();
			naturezaJuridicaExcluirMassa.criar();
			naturezaJuridicaExcluirMassa.excluirMassa();
			naturezaJuridicaExcluirMassa.afterClass();

			System.out.println("-------------------naturezaJuridica Fiscal > naturezaJuridica Fiscal Fin-------------------------");
		}


		//135
		
		// Tabelas de Apoio E-SOCIAL > Unidade de Medida

		@Test(priority = 135)
		public void unidadeDeMedidaCriar() {

			System.out.println("-------------------unidadeDeMedida Fiscal > unidadeDeMedida Fiscal-------------------------");

			unidadeDeMedidaCriar = new UnidadeDeMedidaCriar();
			unidadeDeMedidaCriar.beforeClass();
			unidadeDeMedidaCriar.login();
			unidadeDeMedidaCriar.acessarMDR();
			unidadeDeMedidaCriar.criar();
			unidadeDeMedidaCriar.afterClass();

		}

		@Test(priority = 136)
		public void unidadeDeMedidaEditar() {

			unidadeDeMedidaEditar = new UnidadeDeMedidaEditar();
			unidadeDeMedidaEditar.beforeClass();
			unidadeDeMedidaEditar.login();
			unidadeDeMedidaEditar.acessarMDR();
			unidadeDeMedidaEditar.editar();
			unidadeDeMedidaEditar.afterClass();

		}

		@Test(priority = 137)
		public void unidadeDeMedidaVisualizar() {

			unidadeDeMedidaVisualizar = new UnidadeDeMedidaVisualizar();
			unidadeDeMedidaVisualizar.beforeClass();
			unidadeDeMedidaVisualizar.login();
			unidadeDeMedidaVisualizar.acessarMDR();
			unidadeDeMedidaVisualizar.visualizar();
			unidadeDeMedidaVisualizar.afterClass();

		}

		@Test(priority = 138)
		public void unidadeDeMedidaDetalhes() {

			unidadeDeMedidaDetalhes = new UnidadeDeMedidaDetalhes();
			unidadeDeMedidaDetalhes.beforeClass();
			unidadeDeMedidaDetalhes.login();
			unidadeDeMedidaDetalhes.acessarMDR();
			unidadeDeMedidaDetalhes.detalhes();
			unidadeDeMedidaDetalhes.afterClass();

		}


		@Test(priority = 139)
		public void unidadeDeMedidaExcluir() {

			unidadeDeMedidaExcluir = new UnidadeDeMedidaExcluir();
			unidadeDeMedidaExcluir.beforeClass();
			unidadeDeMedidaExcluir.login();
			unidadeDeMedidaExcluir.acessarMDR();
			unidadeDeMedidaExcluir.excluir();
			unidadeDeMedidaExcluir.afterClass();

			
		}
		
		@Test(priority = 140)
		public void unidadeDeMedidaExcluirEmMassa() {

			unidadeDeMedidaExcluirEmMasa = new UnidadeDeMedidaExcluirEmMasa();
			unidadeDeMedidaExcluirEmMasa.beforeClass();
			unidadeDeMedidaExcluirEmMasa.login();
			unidadeDeMedidaExcluirEmMasa.acessarMDR();
			unidadeDeMedidaExcluirEmMasa.excluir();
			unidadeDeMedidaExcluirEmMasa.afterClass();

		}
		
		@Test(priority = 141)
		public void unidadeDeMedidaFiltroCodigo() {

			unidadeDeMedidaFiltroCodigo = new UnidadeDeMedidaFiltroCodigo();
			unidadeDeMedidaFiltroCodigo.beforeClass();
			unidadeDeMedidaFiltroCodigo.login();
			unidadeDeMedidaFiltroCodigo.acessarMDR();
			unidadeDeMedidaFiltroCodigo.filtroCodigo();
			unidadeDeMedidaFiltroCodigo.afterClass();
			
			System.out.println("-------------------unidadeDeMedida Fiscal > unidadeDeMedida Fiscal Fin-------------------------");

		}

		


		
		
		//142
		
		
		

}