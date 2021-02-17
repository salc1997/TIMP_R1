package com.timp.test.MDR.Automacoes;

import org.openqa.selenium.io.TemporaryFilesystem;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorCriar;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorDetalhes;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorEditar;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorExcluir;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorExcluirEmMassa;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorFiltroID;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoExcluirEmMassa;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosExcluirMassa;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.statusParaBancoInd�bitosCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilExcluirEmMassa;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoExcluirEmMassa;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa;
import com.timp.test.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosFiltroPorID;
import com.timp.test.MDR.RateioDeConsorcio.RateioDeConsorcioPesquisaPorID;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFExcluirEmMassa;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFFiltroPorID;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosCriar;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosEditar;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLota��oExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela16.SGDPCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela16.SGDPEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela16.SGDPExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela16.SGDPExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela16.SGDPVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.DescricaoDeNatDeLes�oExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela28.DadosDeRATExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObrigacoesDeICMSaRecolherExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApuracaoXSpedFiscalExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa��esdoDocumentoFiscalExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua��oTribut�riaExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeLogradouros.TabelaLogradouroExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaServicos.TabelaServicosExcluirEmMassa;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoPesquisaPorID;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluirEmMassa;

public class AutomacoesMDR17 extends TestBaseSteven{
	
	//Tabela De Apoio E Social > Tabela 17 - Descricao De Nat De Les�o
	DescricaoDeNatDeLes�oExcluirEmMassa descricaoDeNatDeLes�oExcluirEmMassa;

//Tabela De Apoio E Social > Tabela 08 - Classificacao Tributaria
	ClassificacaoTributariaCriar classificacaoTributariaCriar;
	ClassificacaoTributariaEditar classificacaoTributariaEditar;
	ClassificacaoTributariaExcluir classificacaoTributariaExcluir;
	ClassificacaoTributariaVisualizar classificacaoTributariaVisualizar;
	ClassificacaoTributariaExcluirMassa classificacaoTributariaExcluirMassa;
	
//Tabela De Apoio E Social > Tabela 12 - Compatibilidade Entre Lota��o

	CompatibilidadeEntreLota��oExcluirEmMassa compatibilidadeEntreLota��oExcluirEmMassa;
	
//Tabela De Apoio E Social > Tabela 13  -  Parte Do Corpo Atingida
	ParteDoCorpoAtingidaExcluirEmMassa parteDoCorpoAtingidaExcluirEmMassa;
	
//Tabela De Apoio E Social > Tabela 14  - Agente Causador De Acidente 
	AgenteCausadorDeAcidenteExcluirEmMassa agenteCausadorDeAcidenteExcluirEmMassa;
	
//Tabela De Apoio E Social > Tabela 16  - SGDP
	SGDPCriar sgdpCriar;
	SGDPEditar sgdpEditar;
	SGDPExcluir sGDPExcluir;
	SGDPVisualizar sgdpVisualizar;
	SGDPExcluirEmMassa sgdpExcluirEmMassa;

//Rateio De Consorcio
	RateioDeConsorcioPesquisaPorID rateioDeConsorcioPesquisaPorID;

//Parametros Oficializacao Livros
	ParametrosOficializacaoLivrosFiltroPorID parametrosOficializacaoLivrosFiltroPorID;
	
//Parametros Contabilizacao > Mapeamento Substituicao Conta Estoque Cenarios Correcoes
	MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa;
	
//Parametros Contabilizacao > Mapeamento Contabil Correcao
	MapeamentoContabilCorrecaoExcluirEmMassa mapeamentoContabilCorrecaoExcluirEmMassa;
	
//Parametros Contabilizacao > Mapeamento Contabil
	MapeamentoContabilExcluirEmMassa mapeamentoContabilExcluirEmMassa;
	
//Taxas De Actualizacao > Aliquotas De Taxa De Atualizacao
	AliquotaDeTaxaDeActualizacaoPesquisaPorID aliquotasDeTaxaDeActualizacaoPesquisaPorID;

//Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior
	UtilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa;

//Controle De Credito Tributario > Codigos De Credito
	CodigosDeCreditoExcluirEmMassa codigosDeCreditoExcluirEmMassa;
	
//Siscoserv  Registro RF
	RegistroRFFiltroPorID registroRFFiltroPorID;

//Tabelas Complementares Para Obriga��es Acess�rias > Tabela Servicos
	TabelaServicosExcluirEmMassa tabelaServicosExcluirEmMassa;

//Tabelas Complementares Para Obriga��es Acess�rias > Tabela Logradouros
	TabelaLogradouroExcluirEmMassa tabelaLogradouroExcluirEmMassa;
	
//Valor Adicionado > Munic�pio
	MunicipioExcluirEmMassa municipioExcluirEmMassa;
	




//Siscoserv  > Registro RVS
	RegistroRVSExcluirEmMassa registroRVSExcluirEmMassa;

//Tabela De Apoio E Social Diagnostico De Processos
	DiagnosticoDeProcessosCriar diagnosticoDeProcessosCriar;
	DiagnosticoDeProcessosEditar diagnosticoDeProcessosEditar;
	DiagnosticoDeProcessosVisualizar diagnosticoDeProcessosVisualizar;
	DiagnosticoDeProcessosExcluir diagnosticoDeProcessosExcluir;
	DiagnosticoDeProcessosExcluirEmMassa diagnosticoDeProcessosExcluirEmMassa;


//Controle de Cr�dito Tribut�rio > Status para Banco de Ind�bitos
	statusParaBancoInd�bitosCriar StatusParaBancoInd�bitosCriar;
	StatusParaBancoInd�bitosEditar statusParaBancoInd�bitosEditar;
	StatusParaBancoInd�bitosExcluirMassa statusParaBancoInd�bitosExcluirMassa;
	StatusParaBancoInd�bitosVisualizar statusParaBancoInd�bitosVisualizar;
	StatusParaBancoInd�bitosExcluir statusParaBancoInd�bitosExcluir;


//Siscoserv > Registro RF
	RegistroRFExcluirEmMassa registroRFExcluirEmMassa;

//Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	
	CodigoDeTreinamentoESimulacoesDeExerciciosCriar codigoDeTreinamentoESimulacoesDeExerciciosCriar;
	CodigoDeTreinamentoESimulacoesDeExerciciosEditar codigoDeTreinamentoESimulacoesDeExerciciosEditar;
	CodigoDeTreinamentoESimulacoesDeExerciciosVisualizar codigoDeTreinamentoESimulacoesDeExerciciosVisualizar;
	CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa;
	CodigoDeTreinamentoESimulacoesDeExerciciosExcluir codigoDeTreinamentoESimulacoesDeExerciciosExcluir;
//Tabela De Apoio E Social Tabela28 - Dados De RAT
	DadosDeRATExcluirEmMassa dadosDeRATExcluirEmMassa;
	
//Tabela Apoio SPED > Tabela Codigo Da Situa��o Tribut�ria
	TabelaCodigoDaSitua��oTribut�riaExcluirEmMassa tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa;
//Tabela Apoio SPED > Codigo Tipo Credito
	CodigoTipoCreditoExcluirEmMassa codigoTipoCreditoExcluirEmMassa;
	
//Tabela Apoio SPED > Observacoes do Documento Fiscal Registro 0460
	Observa��esdoDocumentoFiscalExcluirEmMassa observa��esdoDocumentoFiscalExcluirEmMassa;

//Tabela Apoio SPED >Tipos De Utiliza��o Dos Creditos Fiscais
	TiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa;
	
//TabelaApoioSPED > De Para Livro Apuracao X Sped Fiscal
	DeParaLivroApuracaoXSpedFiscalExcluirEmMassa deParaLivroApuracaoXSpedFiscalExcluirEmMassa;

//Tabela Apoio SPED > Codigos Das Obrigacoes De ICMS a Recolher
	CodigosDasObrigacoesDeICMSaRecolherExcluirEmMassa codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa;

//Atividades Para tributacao >Atividade De Tributacao X Fornecedor	
	AtividadeDeTributacaoXFornecedorCriar atividadeDeTributacaoXFornecedorCriar;
	AtividadeDeTributacaoXFornecedorEditar atividadeDeTributacaoXFornecedorEditar;
	AtividadeDeTributacaoXFornecedorFiltroID atividadeDeTributacaoXFornecedorFiltroID;
	AtividadeDeTributacaoXFornecedorDetalhes atividadeDeTributacaoXFornecedorDetalhes;
	AtividadeDeTributacaoXFornecedorVisualizar atividadeDeTributacaoXFornecedorVisualizar;
	AtividadeDeTributacaoXFornecedorExcluir atividadeDeTributacaoXFornecedorExcluir;
	AtividadeDeTributacaoXFornecedorExcluirEmMassa atividadeDeTributacaoXFornecedorExcluirEmMassa;
	
	
	
	//Tabela De Apoio E Social > Tabela 17 - Descricao De Nat De Les�o
	
	@Test(priority = 0)
	public void descricaoDeNatDeLes�oExcluirEmMassa() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 17 - Descricao De Nat De Les�o-------------------------");
		descricaoDeNatDeLes�oExcluirEmMassa = new DescricaoDeNatDeLes�oExcluirEmMassa();
		descricaoDeNatDeLes�oExcluirEmMassa.beforeClass();
		descricaoDeNatDeLes�oExcluirEmMassa.criar();
		descricaoDeNatDeLes�oExcluirEmMassa.afterClass();

	}
//64
//Tabela De Apoio E Social > Tabela 08 - Classificacao Tributaria
	
	@Test(priority = 1)
	public void classificacaoTributariaCriar() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 08 - Classificacao Tributaria-------------------------");
		classificacaoTributariaCriar = new ClassificacaoTributariaCriar();
		classificacaoTributariaCriar.beforeClass();
		classificacaoTributariaCriar.criar();
		classificacaoTributariaCriar.afterClass();

	}
	
	
	@Test(priority = 2)
	public void classificacaoTributariaEditar() {
		classificacaoTributariaEditar = new ClassificacaoTributariaEditar();
		classificacaoTributariaEditar.beforeClass();
		classificacaoTributariaEditar.editar();
		classificacaoTributariaEditar.afterClass();

	}
	
	@Test(priority = 3)
	public void classificacaoTributariaVisualizar() {
		classificacaoTributariaVisualizar = new ClassificacaoTributariaVisualizar();
		classificacaoTributariaVisualizar.beforeClass();
		classificacaoTributariaVisualizar.Visualizar();
		classificacaoTributariaVisualizar.afterClass();

	}
	
	@Test(priority = 4)
	public void classificacaoTributariaExcluirMassa() {
		classificacaoTributariaExcluirMassa = new ClassificacaoTributariaExcluirMassa();
		classificacaoTributariaExcluirMassa.beforeClass();
		classificacaoTributariaExcluirMassa.criar();
		classificacaoTributariaExcluirMassa.afterClass();

	}
	
	@Test(priority = 5)
	public void classificacaoTributariaExcluir() {
		classificacaoTributariaExcluir = new ClassificacaoTributariaExcluir();
		classificacaoTributariaExcluir.beforeClass();
		classificacaoTributariaExcluir.excluir();
		classificacaoTributariaExcluir.afterClass();
		
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 08 - Classificacao Tributaria Fim-------------------------");
		

	}
	
	///8
	//Tabela De Apoio E Social > Tabela 12 - Compatibilidade Entre Lota��o
	@Test(priority = 8)
	public void compatibilidadeEntreLota��oExcluirEmMassa() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 08 - Classificacao Tributaria-------------------------");
		compatibilidadeEntreLota��oExcluirEmMassa = new CompatibilidadeEntreLota��oExcluirEmMassa();
		compatibilidadeEntreLota��oExcluirEmMassa.beforeClass();
		compatibilidadeEntreLota��oExcluirEmMassa.criar();
		compatibilidadeEntreLota��oExcluirEmMassa.afterClass();

	}
	//Tabela De Apoio E Social > Tabela 13  -  Parte Do Corpo Atingida
	@Test(priority = 9)
	public void parteDoCorpoAtingidaExcluirEmMassa() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 13  -  Parte Do Corpo Atingida-------------------------");
		parteDoCorpoAtingidaExcluirEmMassa = new ParteDoCorpoAtingidaExcluirEmMassa();
		parteDoCorpoAtingidaExcluirEmMassa.beforeClass();
		parteDoCorpoAtingidaExcluirEmMassa.criar();
		parteDoCorpoAtingidaExcluirEmMassa.afterClass();

	}
	
	//Tabela De Apoio E Social > Tabela 14  - Agente Causador De Acidente 

	@Test(priority = 10)
	public void agenteCausadorDeAcidenteExcluirEmMassa() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 14  - Agente Causador De Acidente -------------------------");
		agenteCausadorDeAcidenteExcluirEmMassa = new AgenteCausadorDeAcidenteExcluirEmMassa();
		agenteCausadorDeAcidenteExcluirEmMassa.beforeClass();
		agenteCausadorDeAcidenteExcluirEmMassa.criar();
		agenteCausadorDeAcidenteExcluirEmMassa.afterClass();

	}
	
	
	
//74
//Rateio De Consorcio
	

	@Test(priority = 11)
	public void rateioDeConsorcioPesquisaPorID() {
		System.out.println("-------------------Rateio De Consorcio-------------------------");
		rateioDeConsorcioPesquisaPorID = new RateioDeConsorcioPesquisaPorID();
		rateioDeConsorcioPesquisaPorID.beforeClass();
		rateioDeConsorcioPesquisaPorID.filtro();
		rateioDeConsorcioPesquisaPorID.afterClass();

	}
	
////Parametros Oficializacao Livros
	
	@Test(priority = 12)
	public void parametrosOficializacaoLivrosFiltroPorID() {
		System.out.println("-------------------Parametros Oficializacao Livros-------------------------");
		parametrosOficializacaoLivrosFiltroPorID = new ParametrosOficializacaoLivrosFiltroPorID();
		parametrosOficializacaoLivrosFiltroPorID.beforeClass();
		parametrosOficializacaoLivrosFiltroPorID.filtro();
		parametrosOficializacaoLivrosFiltroPorID.afterClass();
	}
//Parametros Contabilizacao Mapeamento Substituicao Conta Estoque Cenarios Correcoes
	
	@Test(priority = 13)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa() {
		System.out.println("-------------------Parametros Contabilizacao Mapeamento Substituicao Conta Estoque Cenarios Correcoes-------------------------");
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.criar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.afterClass();
	}
	
	//Parametros Contabilizacao Mapeamento Contabil Correcao
	
	@Test(priority = 14)
	public void mapeamentoContabilCorrecaoExcluirEmMassa() {
		System.out.println("-------------------Parametros Contabilizacao Mapeamento Contabil Correcao-------------------------");
		mapeamentoContabilCorrecaoExcluirEmMassa = new MapeamentoContabilCorrecaoExcluirEmMassa();
		mapeamentoContabilCorrecaoExcluirEmMassa.beforeClass();
		mapeamentoContabilCorrecaoExcluirEmMassa.criar();
		mapeamentoContabilCorrecaoExcluirEmMassa.afterClass();
	}
	
	//Parametros Contabilizacao Mapeamento Contabil 
	
	@Test(priority = 15)
	public void mapeamentoContabilExcluirEmMassa() {
		System.out.println("-------------------Parametros Contabilizacao Mapeamento Contabil -------------------------");
		mapeamentoContabilExcluirEmMassa = new MapeamentoContabilExcluirEmMassa();
		mapeamentoContabilExcluirEmMassa.beforeClass();
		mapeamentoContabilExcluirEmMassa.criar();
		mapeamentoContabilExcluirEmMassa.afterClass();
	}
	

	//Siscoserv > Registro RF
	
	@Test(priority = 19)
	public void registroRFFiltroPorID() {
		System.out.println("-------------------Siscoserv > Registro RF-------------------------");
		registroRFFiltroPorID = new RegistroRFFiltroPorID();
		registroRFFiltroPorID.beforeClass();
		registroRFFiltroPorID.filtro();
		registroRFFiltroPorID.afterClass();
	}
	
	//Tabelas Complementares Para Obriga��es Acess�rias > Tabela Servicos
	
	@Test(priority = 20)
	public void tabelaServicosExcluirEmMassa() {
		System.out.println("-------------------Tabelas Complementares Para Obriga��es Acess�rias > Tabela Servicos-------------------------");
		tabelaServicosExcluirEmMassa = new TabelaServicosExcluirEmMassa();
		tabelaServicosExcluirEmMassa.beforeClass();
		tabelaServicosExcluirEmMassa.criar();
		tabelaServicosExcluirEmMassa.afterClass();
	}
	//Tabelas Complementares Para Obriga��es Acess�rias > Tabela Logradouros
	
	@Test(priority = 21)
	public void tabelaLogradouroExcluirEmMassa() {
		System.out.println("-------------------Tabelas Complementares Para Obriga��es Acess�rias > Tabela Logradouros-------------------------");
		tabelaLogradouroExcluirEmMassa = new TabelaLogradouroExcluirEmMassa();
		tabelaLogradouroExcluirEmMassa.beforeClass();
		tabelaLogradouroExcluirEmMassa.criar();
		tabelaLogradouroExcluirEmMassa.afterClass();
	}
	
	//Valor Adicionado > Munic�pio
	
	@Test(priority = 22)
	public void municipioExcluirEmMassa() {
		System.out.println("-------------------Valor Adicionado > Munic�pio-------------------------");
		municipioExcluirEmMassa = new MunicipioExcluirEmMassa();
		municipioExcluirEmMassa.beforeClass();
		municipioExcluirEmMassa.criar();
		municipioExcluirEmMassa.afterClass();
	}

	//Incentivos Fiscais > Projetos Patrocinados
	//86
	
	
	
	//95

	//Siscoserv  > Registro RVS

	@Test(priority = 24)
	public void registroRVSExcluirEmMassa() {
		System.out.println("-------------------Siscoserv  > Registro RVS-------------------------");
		registroRVSExcluirEmMassa = new RegistroRVSExcluirEmMassa();
		registroRVSExcluirEmMassa.beforeClass();
		registroRVSExcluirEmMassa.criar();
		registroRVSExcluirEmMassa.afterClass();
	}
	//Tabela De Apoio E Social > Diagnostico De Processos
	
	@Test(priority = 25)
	public void diagnosticoDeProcessosCriar() {
		System.out.println("-------------------Tabela De Apoio E Social > Diagnostico De Processos-------------------------");
		diagnosticoDeProcessosCriar = new DiagnosticoDeProcessosCriar();
		diagnosticoDeProcessosCriar.beforeClass();
		diagnosticoDeProcessosCriar.criar();
		diagnosticoDeProcessosCriar.afterClass();
	}
	
	@Test(priority = 26)
	public void diagnosticoDeProcessosEditar() {
		diagnosticoDeProcessosEditar = new DiagnosticoDeProcessosEditar();
		diagnosticoDeProcessosEditar.beforeClass();
		diagnosticoDeProcessosEditar.editar();
		diagnosticoDeProcessosEditar.afterClass();
	}
	

	@Test(priority = 27)
	public void diagnosticoDeProcessosVisualizar() {
		diagnosticoDeProcessosVisualizar = new DiagnosticoDeProcessosVisualizar();
		diagnosticoDeProcessosVisualizar.beforeClass();
		diagnosticoDeProcessosVisualizar.Visualizar();
		diagnosticoDeProcessosVisualizar.afterClass();
	}
	
	@Test(priority = 28)
	public void diagnosticoDeProcessosExcluir() {
		diagnosticoDeProcessosExcluir = new DiagnosticoDeProcessosExcluir();
		diagnosticoDeProcessosExcluir.beforeClass();
		diagnosticoDeProcessosExcluir.excluir();
		diagnosticoDeProcessosExcluir.afterClass();
	}
	
	@Test(priority = 29)
	public void diagnosticoDeProcessosExcluirEmMassa() {
		diagnosticoDeProcessosExcluirEmMassa = new DiagnosticoDeProcessosExcluirEmMassa();
		diagnosticoDeProcessosExcluirEmMassa.beforeClass();
		diagnosticoDeProcessosExcluirEmMassa.criar();
		diagnosticoDeProcessosExcluirEmMassa.afterClass();
		System.out.println("-------------------Tabela De Apoio E Social > Diagnostico De Processos Fim-------------------------");
		
	}
	
	//Siscoserv > Registro RF
	@Test(priority = 30)	
	public void registroRFExcluirEmMassa() {
		System.out.println("-------------------Siscoserv > Registro RF-------------------------");
		registroRFExcluirEmMassa = new RegistroRFExcluirEmMassa();
		registroRFExcluirEmMassa.beforeClass();
		registroRFExcluirEmMassa.criar();
		registroRFExcluirEmMassa.afterClass();
	}
	//Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	
	
	@Test(priority = 31)	
	public void codigoDeTreinamentoESimulacoesDeExerciciosCriar() {
		System.out.println("-------------------Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	-------------------------");
		codigoDeTreinamentoESimulacoesDeExerciciosCriar = new CodigoDeTreinamentoESimulacoesDeExerciciosCriar();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.criar();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.afterClass();
	}
	
	@Test(priority = 32)	
	public void codigoDeTreinamentoESimulacoesDeExerciciosEditar() {
		codigoDeTreinamentoESimulacoesDeExerciciosEditar = new CodigoDeTreinamentoESimulacoesDeExerciciosEditar();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.editar();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.afterClass();
	}
	
	@Test(priority = 33)	
	public void codigoDeTreinamentoESimulacoesDeExerciciosVisualizar() {
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar= new CodigoDeTreinamentoESimulacoesDeExerciciosVisualizar();
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.beforeClass();

		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.Visualizar();
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.afterClass();
	}
	

	@Test(priority = 34)	
	public void codigoDeTreinamentoESimulacoesDeExerciciosExcluir() {
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir= new CodigoDeTreinamentoESimulacoesDeExerciciosExcluir();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.excluir();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.afterClass();
	}

	@Test(priority = 35)	
	public void codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa() {
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa= new CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.criar();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.afterClass();
		System.out.println("-------------------Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	Fim-------------------------");
		
	}
	

//Tabela Apoio SPED > Tabela Codigo Da Situa��o Tribut�ria
	
	@Test(priority = 37)	
	public void tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Tabela Codigo Da Situa��o Tribut�ria-------------------------");
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa = new TabelaCodigoDaSitua��oTribut�riaExcluirEmMassa();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.beforeClass();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.criar();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.afterClass();
	}
	
	//Tabela Apoio SPED > Codigo Tipo Credito
	
	@Test(priority = 38)	
	public void codigoTipoCreditoExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Codigo Tipo Credito-------------------------");
		codigoTipoCreditoExcluirEmMassa = new CodigoTipoCreditoExcluirEmMassa();
		codigoTipoCreditoExcluirEmMassa.beforeClass();
		codigoTipoCreditoExcluirEmMassa.criar();
		codigoTipoCreditoExcluirEmMassa.afterClass();
	}
	
	//Tabela Apoio SPED > Observacoes do Documento Fiscal Registro 0460
	
	@Test(priority = 39)	
	public void observa��esdoDocumentoFiscalExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Observacoes do Documento Fiscal Registro 0460-------------------------");
		observa��esdoDocumentoFiscalExcluirEmMassa = new Observa��esdoDocumentoFiscalExcluirEmMassa();
		observa��esdoDocumentoFiscalExcluirEmMassa.beforeClass();
		observa��esdoDocumentoFiscalExcluirEmMassa.criar();
		observa��esdoDocumentoFiscalExcluirEmMassa.afterClass();
	}
	
	//Tabela Apoio SPED > Tipos De Utiliza��o Dos Creditos Fiscais
	
	@Test(priority = 40)	
	public void tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Tipos De Utiliza��o Dos Creditos Fiscais-------------------------");
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa = new TiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.beforeClass();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.criar();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.afterClass();
	}
	
	//TabelaApoioSPED > De Para Livro Apuracao X Sped Fiscal
	
	@Test(priority = 41)	
	public void deParaLivroApuracaoXSpedFiscalExcluirEmMassa() {
		System.out.println("-------------------TabelaApoioSPED > De Para Livro Apuracao X Sped Fiscal-------------------------");
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa = new DeParaLivroApuracaoXSpedFiscalExcluirEmMassa();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.beforeClass();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.criar();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.afterClass();
	}
	//Tabela Apoio SPED > Codigos Das Obrigacoes De ICMS a Recolher
	
	@Test(priority = 42)	
	public void codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Codigos Das Obrigacoes De ICMS a Recolher-------------------------");
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa = new CodigosDasObrigacoesDeICMSaRecolherExcluirEmMassa();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.beforeClass();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.criar();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.afterClass();
	}
	
	//Atividades Para tributacao >Atividade De Tributacao X Fornecedor
	
	@Test(priority = 43)	
	public void atividadeDeTributacaoXFornecedorCriar() {
		System.out.println("-------------------Atividades Para tributacao >Atividade De Tributacao X Fornecedor-------------------------");
		atividadeDeTributacaoXFornecedorCriar = new AtividadeDeTributacaoXFornecedorCriar();
		atividadeDeTributacaoXFornecedorCriar.beforeClass();
		atividadeDeTributacaoXFornecedorCriar.criar();
		atividadeDeTributacaoXFornecedorCriar.afterClass();
	}
	
	@Test(priority = 44)	
	public void atividadeDeTributacaoXFornecedorFiltroID() {
		atividadeDeTributacaoXFornecedorFiltroID = new AtividadeDeTributacaoXFornecedorFiltroID();
		atividadeDeTributacaoXFornecedorFiltroID.beforeClass();
		atividadeDeTributacaoXFornecedorFiltroID.filtro();
		atividadeDeTributacaoXFornecedorFiltroID.afterClass();
	}
	
	@Test(priority = 45)	
	public void atividadeDeTributacaoXFornecedorDetalhes() {
		atividadeDeTributacaoXFornecedorDetalhes = new AtividadeDeTributacaoXFornecedorDetalhes();
		atividadeDeTributacaoXFornecedorDetalhes.beforeClass();
		atividadeDeTributacaoXFornecedorDetalhes.Detalhes();
		atividadeDeTributacaoXFornecedorDetalhes.afterClass();
	}
	
	@Test(priority = 46)	
	public void atividadeDeTributacaoXFornecedorVisualizar() {
		atividadeDeTributacaoXFornecedorVisualizar = new AtividadeDeTributacaoXFornecedorVisualizar();
		atividadeDeTributacaoXFornecedorVisualizar.beforeClass();
		atividadeDeTributacaoXFornecedorVisualizar.Visualizar();
		atividadeDeTributacaoXFornecedorVisualizar.afterClass();
	}
	
	@Test(priority = 47)	
	public void atividadeDeTributacaoXFornecedorEditar() {
		atividadeDeTributacaoXFornecedorEditar = new AtividadeDeTributacaoXFornecedorEditar();
		atividadeDeTributacaoXFornecedorEditar.beforeClass();
		atividadeDeTributacaoXFornecedorEditar.editar();
		atividadeDeTributacaoXFornecedorEditar.afterClass();
	}
	
	
	
	
	@Test(priority = 48)	
	public void atividadeDeTributacaoXFornecedorExcluir() {
		atividadeDeTributacaoXFornecedorExcluir = new AtividadeDeTributacaoXFornecedorExcluir();
		atividadeDeTributacaoXFornecedorExcluir.beforeClass();
		atividadeDeTributacaoXFornecedorExcluir.excluir();
		atividadeDeTributacaoXFornecedorExcluir.afterClass();
	}
	
	@Test(priority = 49)	
	public void atividadeDeTributacaoXFornecedorExcluirEmMassa() {
		atividadeDeTributacaoXFornecedorExcluirEmMassa = new AtividadeDeTributacaoXFornecedorExcluirEmMassa();
		atividadeDeTributacaoXFornecedorExcluirEmMassa.beforeClass();
		atividadeDeTributacaoXFornecedorExcluirEmMassa.criar();
		atividadeDeTributacaoXFornecedorExcluirEmMassa.afterClass();
		System.out.println("-------------------Atividades Para tributacao >Atividade De Tributacao X Fornecedor Fim-------------------------");
		
	}
	

	//Tabela De Apoio E Social > Tabela 16  - SGDP
	
	
	
	@Test(priority = 50)
	public void sgdpCriar() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 16  - SGDP-------------------------");
		sgdpCriar = new SGDPCriar();
		sgdpCriar.beforeClass();
		sgdpCriar.criar();
		sgdpCriar.afterClass();

	}
	
	
	@Test(priority = 51)
	public void sgdpEditar() {
		sgdpEditar = new SGDPEditar();
		sgdpEditar.beforeClass();
		sgdpEditar.editar();
		sgdpEditar.afterClass();

	}
	
	
	@Test(priority = 52)
	public void sgdpVisualizar() {
		sgdpVisualizar = new SGDPVisualizar();
		sgdpVisualizar.beforeClass();
		sgdpVisualizar.visualizar();
		sgdpVisualizar.afterClass();

	}
	@Test(priority = 53)
	public void sgdpExcluir() {
		sGDPExcluir = new SGDPExcluir();
		sGDPExcluir.beforeClass();
		sGDPExcluir.excluir();
		sGDPExcluir.afterClass();

	}
	
	@Test(priority = 54)
	public void sgdpExcluirEmMassa() {
		
		sgdpExcluirEmMassa = new SGDPExcluirEmMassa();
		sgdpExcluirEmMassa.beforeClass();
		sgdpExcluirEmMassa.criar();
		sgdpExcluirEmMassa.afterClass();
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 16  - SGDP FIN-------------------------");
	}
	
	//Controle de Cr�dito Tribut�rio > Status para Banco de Ind�bitos
	//91
	@Test(priority = 55)
	public void statusParaBancoInd�bitosCriar() {
		System.out.println("-------------------Controle de Cr�dito Tribut�rio > Status para Banco de Ind�bitos-------------------------");
		StatusParaBancoInd�bitosCriar = new statusParaBancoInd�bitosCriar();
		StatusParaBancoInd�bitosCriar.beforeClass();
		StatusParaBancoInd�bitosCriar.criar();
		StatusParaBancoInd�bitosCriar.afterClass();
	}
	@Test(priority = 56)
	public void StatusParaBancoInd�bitosEditar() {
		
		statusParaBancoInd�bitosEditar = new StatusParaBancoInd�bitosEditar();
		statusParaBancoInd�bitosEditar.beforeClass();
		statusParaBancoInd�bitosEditar.editar();
		statusParaBancoInd�bitosEditar.afterClass();
	}
	@Test(priority = 57)
	public void StatusParaBancoInd�bitosVisualizar() {
		
		statusParaBancoInd�bitosVisualizar = new StatusParaBancoInd�bitosVisualizar();
		statusParaBancoInd�bitosVisualizar.beforeClass();
		statusParaBancoInd�bitosVisualizar.visualizar();
		statusParaBancoInd�bitosVisualizar.afterClass();
	}
	@Test(priority = 58)
	public void StatusParaBancoInd�bitosExcluir() {
		
		statusParaBancoInd�bitosExcluir = new StatusParaBancoInd�bitosExcluir();
		statusParaBancoInd�bitosExcluir.beforeClass();
		statusParaBancoInd�bitosExcluir.excluir();
		statusParaBancoInd�bitosExcluir.afterClass();
	}
	@Test(priority = 59)
	public void StatusParaBancoInd�bitosExcluirMassa() {
		
		statusParaBancoInd�bitosExcluirMassa = new StatusParaBancoInd�bitosExcluirMassa();
		statusParaBancoInd�bitosExcluirMassa.beforeClass();
		statusParaBancoInd�bitosExcluirMassa.criar();
		statusParaBancoInd�bitosExcluirMassa.afterClass();
		System.out.println("-------------------Controle de Cr�dito Tribut�rio > Status para Banco de Ind�bitos Fim-------------------------");
	}
	
 
}
