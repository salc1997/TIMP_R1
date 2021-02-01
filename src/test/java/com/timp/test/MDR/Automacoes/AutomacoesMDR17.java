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
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisExcluirMassaPP;
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
	



//Incentivos Fiscais > Projetos Patrocinados
	IncentivosFiscaisExcluirMassaPP incentivosFiscaisExcluirMassaPP;

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
		descricaoDeNatDeLes�oExcluirEmMassa.login();
		descricaoDeNatDeLes�oExcluirEmMassa.acessarMDR();
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
		classificacaoTributariaCriar.login();
		classificacaoTributariaCriar.acessarMDR();
		classificacaoTributariaCriar.criar();
		classificacaoTributariaCriar.afterClass();

	}
	
	
	@Test(priority = 2, dependsOnMethods = "classificacaoTributariaCriar")
	public void classificacaoTributariaEditar() {
		classificacaoTributariaEditar = new ClassificacaoTributariaEditar();
		classificacaoTributariaEditar.beforeClass();
		classificacaoTributariaEditar.login();
		classificacaoTributariaEditar.acessarMDR();
		classificacaoTributariaEditar.editar();
		classificacaoTributariaEditar.afterClass();

	}
	
	@Test(priority = 3, dependsOnMethods = "classificacaoTributariaCriar")
	public void classificacaoTributariaVisualizar() {
		classificacaoTributariaVisualizar = new ClassificacaoTributariaVisualizar();
		classificacaoTributariaVisualizar.beforeClass();
		classificacaoTributariaVisualizar.login();
		classificacaoTributariaVisualizar.acessarMDR();
		classificacaoTributariaVisualizar.Visualizar();
		classificacaoTributariaVisualizar.afterClass();

	}
	
	@Test(priority = 4, dependsOnMethods = "classificacaoTributariaCriar")
	public void classificacaoTributariaExcluirMassa() {
		classificacaoTributariaExcluirMassa = new ClassificacaoTributariaExcluirMassa();
		classificacaoTributariaExcluirMassa.beforeClass();
		classificacaoTributariaExcluirMassa.login();
		classificacaoTributariaExcluirMassa.acessarMDR();
		classificacaoTributariaExcluirMassa.criar();
		classificacaoTributariaExcluirMassa.afterClass();

	}
	
	@Test(priority = 5, dependsOnMethods = "classificacaoTributariaCriar")
	public void classificacaoTributariaExcluir() {
		classificacaoTributariaExcluir = new ClassificacaoTributariaExcluir();
		classificacaoTributariaExcluir.beforeClass();
		classificacaoTributariaExcluir.login();
		classificacaoTributariaExcluir.acessarMDR();
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
		compatibilidadeEntreLota��oExcluirEmMassa.login();
		compatibilidadeEntreLota��oExcluirEmMassa.acessarMDR();
		compatibilidadeEntreLota��oExcluirEmMassa.criar();
		compatibilidadeEntreLota��oExcluirEmMassa.afterClass();

	}
	//Tabela De Apoio E Social > Tabela 13  -  Parte Do Corpo Atingida
	@Test(priority = 9)
	public void parteDoCorpoAtingidaExcluirEmMassa() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 13  -  Parte Do Corpo Atingida-------------------------");
		parteDoCorpoAtingidaExcluirEmMassa = new ParteDoCorpoAtingidaExcluirEmMassa();
		parteDoCorpoAtingidaExcluirEmMassa.beforeClass();
		parteDoCorpoAtingidaExcluirEmMassa.login();
		parteDoCorpoAtingidaExcluirEmMassa.acessarMDR();
		parteDoCorpoAtingidaExcluirEmMassa.criar();
		parteDoCorpoAtingidaExcluirEmMassa.afterClass();

	}
	
	//Tabela De Apoio E Social > Tabela 14  - Agente Causador De Acidente 

	@Test(priority = 10)
	public void agenteCausadorDeAcidenteExcluirEmMassa() {
		System.out.println("-------------------Tabela De Apoio E Social > Tabela 14  - Agente Causador De Acidente -------------------------");
		agenteCausadorDeAcidenteExcluirEmMassa = new AgenteCausadorDeAcidenteExcluirEmMassa();
		agenteCausadorDeAcidenteExcluirEmMassa.beforeClass();
		agenteCausadorDeAcidenteExcluirEmMassa.login();
		agenteCausadorDeAcidenteExcluirEmMassa.acessarMDR();
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
		rateioDeConsorcioPesquisaPorID.login();
		rateioDeConsorcioPesquisaPorID.acessarMDR();
		rateioDeConsorcioPesquisaPorID.filtro();
		rateioDeConsorcioPesquisaPorID.afterClass();

	}
	
////Parametros Oficializacao Livros
	
	@Test(priority = 12)
	public void parametrosOficializacaoLivrosFiltroPorID() {
		System.out.println("-------------------Parametros Oficializacao Livros-------------------------");
		parametrosOficializacaoLivrosFiltroPorID = new ParametrosOficializacaoLivrosFiltroPorID();
		parametrosOficializacaoLivrosFiltroPorID.beforeClass();
		parametrosOficializacaoLivrosFiltroPorID.login();
		parametrosOficializacaoLivrosFiltroPorID.acessarMDR();
		parametrosOficializacaoLivrosFiltroPorID.filtro();
		parametrosOficializacaoLivrosFiltroPorID.afterClass();
	}
//Parametros Contabilizacao Mapeamento Substituicao Conta Estoque Cenarios Correcoes
	
	@Test(priority = 13)
	public void mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa() {
		System.out.println("-------------------Parametros Contabilizacao Mapeamento Substituicao Conta Estoque Cenarios Correcoes-------------------------");
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.beforeClass();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.login();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.acessarMDR();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.criar();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa.afterClass();
	}
	
	//Parametros Contabilizacao Mapeamento Contabil Correcao
	
	@Test(priority = 14)
	public void mapeamentoContabilCorrecaoExcluirEmMassa() {
		System.out.println("-------------------Parametros Contabilizacao Mapeamento Contabil Correcao-------------------------");
		mapeamentoContabilCorrecaoExcluirEmMassa = new MapeamentoContabilCorrecaoExcluirEmMassa();
		mapeamentoContabilCorrecaoExcluirEmMassa.beforeClass();
		mapeamentoContabilCorrecaoExcluirEmMassa.login();
		mapeamentoContabilCorrecaoExcluirEmMassa.acessarMDR();
		mapeamentoContabilCorrecaoExcluirEmMassa.criar();
		mapeamentoContabilCorrecaoExcluirEmMassa.afterClass();
	}
	
	//Parametros Contabilizacao Mapeamento Contabil 
	
	@Test(priority = 15)
	public void mapeamentoContabilExcluirEmMassa() {
		System.out.println("-------------------Parametros Contabilizacao Mapeamento Contabil -------------------------");
		mapeamentoContabilExcluirEmMassa = new MapeamentoContabilExcluirEmMassa();
		mapeamentoContabilExcluirEmMassa.beforeClass();
		mapeamentoContabilExcluirEmMassa.login();
		mapeamentoContabilExcluirEmMassa.acessarMDR();
		mapeamentoContabilExcluirEmMassa.criar();
		mapeamentoContabilExcluirEmMassa.afterClass();
	}
	
	//Taxas De Actualizacao Aliquotas De Taxa De Atualizacao
	
	@Test(priority = 16)
	public void aliquotasDeTaxaDeActualizacaoPesquisaPorID() {
		System.out.println("-------------------Parametros Contabilizacao Mapeamento Contabil -------------------------");
		aliquotasDeTaxaDeActualizacaoPesquisaPorID = new AliquotaDeTaxaDeActualizacaoPesquisaPorID();
		aliquotasDeTaxaDeActualizacaoPesquisaPorID.beforeClass();
		aliquotasDeTaxaDeActualizacaoPesquisaPorID.login();
		aliquotasDeTaxaDeActualizacaoPesquisaPorID.acessarMDR();
		aliquotasDeTaxaDeActualizacaoPesquisaPorID.filtro();
		aliquotasDeTaxaDeActualizacaoPesquisaPorID.afterClass();
	}
//Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior
	
	@Test(priority = 17)
	public void utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa() {
		System.out.println("-------------------Controle De Credito Tributario > Utilizacao Dos Creditos Em Periodo Anterior-------------------------");
		utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa = new UtilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa.beforeClass();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa.login();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa.acessarMDR();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa.criar();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa.afterClass();
	}

	//Controle De Credito Tributario > Codigos De Credito
	
	@Test(priority = 18)
	public void codigosDeCreditoExcluirEmMassa() {
		System.out.println("-------------------Controle De Credito Tributario > Codigos De Credito-------------------------");
		codigosDeCreditoExcluirEmMassa = new CodigosDeCreditoExcluirEmMassa();
		codigosDeCreditoExcluirEmMassa.beforeClass();
		codigosDeCreditoExcluirEmMassa.login();
		codigosDeCreditoExcluirEmMassa.acessarMDR();
		codigosDeCreditoExcluirEmMassa.criar();
		codigosDeCreditoExcluirEmMassa.afterClass();
	}
	
	//Siscoserv > Registro RF
	
	@Test(priority = 19)
	public void registroRFFiltroPorID() {
		System.out.println("-------------------Siscoserv > Registro RF-------------------------");
		registroRFFiltroPorID = new RegistroRFFiltroPorID();
		registroRFFiltroPorID.beforeClass();
		registroRFFiltroPorID.login();
		registroRFFiltroPorID.acessarMDR();
		registroRFFiltroPorID.filtro();
		registroRFFiltroPorID.afterClass();
	}
	
	//Tabelas Complementares Para Obriga��es Acess�rias > Tabela Servicos
	
	@Test(priority = 20)
	public void tabelaServicosExcluirEmMassa() {
		System.out.println("-------------------Tabelas Complementares Para Obriga��es Acess�rias > Tabela Servicos-------------------------");
		tabelaServicosExcluirEmMassa = new TabelaServicosExcluirEmMassa();
		tabelaServicosExcluirEmMassa.beforeClass();
		tabelaServicosExcluirEmMassa.login();
		tabelaServicosExcluirEmMassa.acessarMDR();
		tabelaServicosExcluirEmMassa.criar();
		tabelaServicosExcluirEmMassa.afterClass();
	}
	//Tabelas Complementares Para Obriga��es Acess�rias > Tabela Logradouros
	
	@Test(priority = 21)
	public void tabelaLogradouroExcluirEmMassa() {
		System.out.println("-------------------Tabelas Complementares Para Obriga��es Acess�rias > Tabela Logradouros-------------------------");
		tabelaLogradouroExcluirEmMassa = new TabelaLogradouroExcluirEmMassa();
		tabelaLogradouroExcluirEmMassa.beforeClass();
		tabelaLogradouroExcluirEmMassa.login();
		tabelaLogradouroExcluirEmMassa.acessarMDR();
		tabelaLogradouroExcluirEmMassa.criar();
		tabelaLogradouroExcluirEmMassa.afterClass();
	}
	
	//Valor Adicionado > Munic�pio
	
	@Test(priority = 22)
	public void municipioExcluirEmMassa() {
		System.out.println("-------------------Valor Adicionado > Munic�pio-------------------------");
		municipioExcluirEmMassa = new MunicipioExcluirEmMassa();
		municipioExcluirEmMassa.beforeClass();
		municipioExcluirEmMassa.login();
		municipioExcluirEmMassa.acessarMDR();
		municipioExcluirEmMassa.criar();
		municipioExcluirEmMassa.afterClass();
	}

	//Incentivos Fiscais > Projetos Patrocinados
	//86
	
	@Test(priority = 23)
	public void incentivosFiscaisPPExcluirEmMassa() {
		System.out.println("-------------------Incentivos Fiscais > Projetos Patrocinados-------------------------");
		incentivosFiscaisExcluirMassaPP = new IncentivosFiscaisExcluirMassaPP();
		incentivosFiscaisExcluirMassaPP.beforeClass();
		incentivosFiscaisExcluirMassaPP.login();
		incentivosFiscaisExcluirMassaPP.acessarMDR();
		incentivosFiscaisExcluirMassaPP.criar();
		incentivosFiscaisExcluirMassaPP.afterClass();
	}
	//90
	
	
	//95

	//Siscoserv  > Registro RVS

	@Test(priority = 24)
	public void registroRVSExcluirEmMassa() {
		System.out.println("-------------------Siscoserv  > Registro RVS-------------------------");
		registroRVSExcluirEmMassa = new RegistroRVSExcluirEmMassa();
		registroRVSExcluirEmMassa.beforeClass();
		registroRVSExcluirEmMassa.login();
		registroRVSExcluirEmMassa.acessarMDR();
		registroRVSExcluirEmMassa.criar();
		registroRVSExcluirEmMassa.afterClass();
	}
	//Tabela De Apoio E Social > Diagnostico De Processos
	
	@Test(priority = 25)
	public void diagnosticoDeProcessosCriar() {
		System.out.println("-------------------Tabela De Apoio E Social > Diagnostico De Processos-------------------------");
		diagnosticoDeProcessosCriar = new DiagnosticoDeProcessosCriar();
		diagnosticoDeProcessosCriar.beforeClass();
		diagnosticoDeProcessosCriar.login();
		diagnosticoDeProcessosCriar.acessarMDR();
		diagnosticoDeProcessosCriar.criar();
		diagnosticoDeProcessosCriar.afterClass();
	}
	
	@Test(priority = 26, dependsOnMethods = "diagnosticoDeProcessosCriar")
	public void diagnosticoDeProcessosEditar() {
		diagnosticoDeProcessosEditar = new DiagnosticoDeProcessosEditar();
		diagnosticoDeProcessosEditar.beforeClass();
		diagnosticoDeProcessosEditar.login();
		diagnosticoDeProcessosEditar.acessarMDR();
		diagnosticoDeProcessosEditar.editar();
		diagnosticoDeProcessosEditar.afterClass();
	}
	

	@Test(priority = 27, dependsOnMethods = "diagnosticoDeProcessosCriar")
	public void diagnosticoDeProcessosVisualizar() {
		diagnosticoDeProcessosVisualizar = new DiagnosticoDeProcessosVisualizar();
		diagnosticoDeProcessosVisualizar.beforeClass();
		diagnosticoDeProcessosVisualizar.login();
		diagnosticoDeProcessosVisualizar.acessarMDR();
		diagnosticoDeProcessosVisualizar.Visualizar();
		diagnosticoDeProcessosVisualizar.afterClass();
	}
	
	@Test(priority = 28, dependsOnMethods = "diagnosticoDeProcessosCriar")
	public void diagnosticoDeProcessosExcluir() {
		diagnosticoDeProcessosExcluir = new DiagnosticoDeProcessosExcluir();
		diagnosticoDeProcessosExcluir.beforeClass();
		diagnosticoDeProcessosExcluir.login();
		diagnosticoDeProcessosExcluir.acessarMDR();
		diagnosticoDeProcessosExcluir.excluir();
		diagnosticoDeProcessosExcluir.afterClass();
	}
	
	@Test(priority = 29, dependsOnMethods = "diagnosticoDeProcessosCriar")
	public void diagnosticoDeProcessosExcluirEmMassa() {
		diagnosticoDeProcessosExcluirEmMassa = new DiagnosticoDeProcessosExcluirEmMassa();
		diagnosticoDeProcessosExcluirEmMassa.beforeClass();
		diagnosticoDeProcessosExcluirEmMassa.login();
		diagnosticoDeProcessosExcluirEmMassa.acessarMDR();
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
		registroRFExcluirEmMassa.login();
		registroRFExcluirEmMassa.acessarMDR();
		registroRFExcluirEmMassa.criar();
		registroRFExcluirEmMassa.afterClass();
	}
	//Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	
	
	@Test(priority = 31)	
	public void codigoDeTreinamentoESimulacoesDeExerciciosCriar() {
		System.out.println("-------------------Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	-------------------------");
		codigoDeTreinamentoESimulacoesDeExerciciosCriar = new CodigoDeTreinamentoESimulacoesDeExerciciosCriar();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.login();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.acessarMDR();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.criar();
		codigoDeTreinamentoESimulacoesDeExerciciosCriar.afterClass();
	}
	
	@Test(priority = 32, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
	public void codigoDeTreinamentoESimulacoesDeExerciciosEditar() {
		codigoDeTreinamentoESimulacoesDeExerciciosEditar = new CodigoDeTreinamentoESimulacoesDeExerciciosEditar();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.login();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.acessarMDR();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.editar();
		codigoDeTreinamentoESimulacoesDeExerciciosEditar.afterClass();
	}
	
	@Test(priority = 33, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
	public void codigoDeTreinamentoESimulacoesDeExerciciosVisualizar() {
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar= new CodigoDeTreinamentoESimulacoesDeExerciciosVisualizar();
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.login();
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.acessarMDR();
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.Visualizar();
		codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.afterClass();
	}
	

	@Test(priority = 34, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
	public void codigoDeTreinamentoESimulacoesDeExerciciosExcluir() {
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir= new CodigoDeTreinamentoESimulacoesDeExerciciosExcluir();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.login();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.acessarMDR();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.excluir();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluir.afterClass();
	}

	@Test(priority = 35, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
	public void codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa() {
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa= new CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.beforeClass();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.login();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.acessarMDR();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.criar();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa.afterClass();
		System.out.println("-------------------Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	Fim-------------------------");
		
	}
	
//Tabela De Apoio E Social Tabela28 - Dados De RAT
	@Test(priority = 36)	
	public void dadosDeRATExcluirEmMassa() {
		System.out.println("-------------------Tabela De Apoio E Social Tabela28 - Dados De RAT-------------------------");
		dadosDeRATExcluirEmMassa = new DadosDeRATExcluirEmMassa();
		dadosDeRATExcluirEmMassa.beforeClass();
		dadosDeRATExcluirEmMassa.login();
		dadosDeRATExcluirEmMassa.acessarMDR();
		dadosDeRATExcluirEmMassa.criar();
		dadosDeRATExcluirEmMassa.afterClass();
	}
//Tabela Apoio SPED > Tabela Codigo Da Situa��o Tribut�ria
	
	@Test(priority = 37)	
	public void tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Tabela Codigo Da Situa��o Tribut�ria-------------------------");
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa = new TabelaCodigoDaSitua��oTribut�riaExcluirEmMassa();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.beforeClass();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.login();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.acessarMDR();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.criar();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassa.afterClass();
	}
	
	//Tabela Apoio SPED > Codigo Tipo Credito
	
	@Test(priority = 38)	
	public void codigoTipoCreditoExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Codigo Tipo Credito-------------------------");
		codigoTipoCreditoExcluirEmMassa = new CodigoTipoCreditoExcluirEmMassa();
		codigoTipoCreditoExcluirEmMassa.beforeClass();
		codigoTipoCreditoExcluirEmMassa.login();
		codigoTipoCreditoExcluirEmMassa.acessarMDR();
		codigoTipoCreditoExcluirEmMassa.criar();
		codigoTipoCreditoExcluirEmMassa.afterClass();
	}
	
	//Tabela Apoio SPED > Observacoes do Documento Fiscal Registro 0460
	
	@Test(priority = 39)	
	public void observa��esdoDocumentoFiscalExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Observacoes do Documento Fiscal Registro 0460-------------------------");
		observa��esdoDocumentoFiscalExcluirEmMassa = new Observa��esdoDocumentoFiscalExcluirEmMassa();
		observa��esdoDocumentoFiscalExcluirEmMassa.beforeClass();
		observa��esdoDocumentoFiscalExcluirEmMassa.login();
		observa��esdoDocumentoFiscalExcluirEmMassa.acessarMDR();
		observa��esdoDocumentoFiscalExcluirEmMassa.criar();
		observa��esdoDocumentoFiscalExcluirEmMassa.afterClass();
	}
	
	//Tabela Apoio SPED > Tipos De Utiliza��o Dos Creditos Fiscais
	
	@Test(priority = 40)	
	public void tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Tipos De Utiliza��o Dos Creditos Fiscais-------------------------");
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa = new TiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.beforeClass();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.login();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.acessarMDR();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.criar();
		tiposDeUtiliza��oDosCreditosFiscaisExcluirEmMassa.afterClass();
	}
	
	//TabelaApoioSPED > De Para Livro Apuracao X Sped Fiscal
	
	@Test(priority = 41)	
	public void deParaLivroApuracaoXSpedFiscalExcluirEmMassa() {
		System.out.println("-------------------TabelaApoioSPED > De Para Livro Apuracao X Sped Fiscal-------------------------");
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa = new DeParaLivroApuracaoXSpedFiscalExcluirEmMassa();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.beforeClass();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.login();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.acessarMDR();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.criar();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassa.afterClass();
	}
	//Tabela Apoio SPED > Codigos Das Obrigacoes De ICMS a Recolher
	
	@Test(priority = 42)	
	public void codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa() {
		System.out.println("-------------------Tabela Apoio SPED > Codigos Das Obrigacoes De ICMS a Recolher-------------------------");
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa = new CodigosDasObrigacoesDeICMSaRecolherExcluirEmMassa();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.beforeClass();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.login();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.acessarMDR();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.criar();
		codigosDasObrigacoesDeICMSaRecolherExcluirEmMassa.afterClass();
	}
	
	//Atividades Para tributacao >Atividade De Tributacao X Fornecedor
	
	@Test(priority = 43)	
	public void atividadeDeTributacaoXFornecedorCriar() {
		System.out.println("-------------------Atividades Para tributacao >Atividade De Tributacao X Fornecedor-------------------------");
		atividadeDeTributacaoXFornecedorCriar = new AtividadeDeTributacaoXFornecedorCriar();
		atividadeDeTributacaoXFornecedorCriar.beforeClass();
		atividadeDeTributacaoXFornecedorCriar.login();
		atividadeDeTributacaoXFornecedorCriar.acessarMDR();
		atividadeDeTributacaoXFornecedorCriar.criar();
		atividadeDeTributacaoXFornecedorCriar.afterClass();
	}
	
	@Test(priority = 44, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
	public void atividadeDeTributacaoXFornecedorFiltroID() {
		atividadeDeTributacaoXFornecedorFiltroID = new AtividadeDeTributacaoXFornecedorFiltroID();
		atividadeDeTributacaoXFornecedorFiltroID.beforeClass();
		atividadeDeTributacaoXFornecedorFiltroID.login();
		atividadeDeTributacaoXFornecedorFiltroID.acessarMDR();
		atividadeDeTributacaoXFornecedorFiltroID.filtro();
		atividadeDeTributacaoXFornecedorFiltroID.afterClass();
	}
	
	@Test(priority = 45, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
	public void atividadeDeTributacaoXFornecedorDetalhes() {
		atividadeDeTributacaoXFornecedorDetalhes = new AtividadeDeTributacaoXFornecedorDetalhes();
		atividadeDeTributacaoXFornecedorDetalhes.beforeClass();
		atividadeDeTributacaoXFornecedorDetalhes.login();
		atividadeDeTributacaoXFornecedorDetalhes.acessarMDR();
		atividadeDeTributacaoXFornecedorDetalhes.Detalhes();
		atividadeDeTributacaoXFornecedorDetalhes.afterClass();
	}
	
	@Test(priority = 46, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
	public void atividadeDeTributacaoXFornecedorVisualizar() {
		atividadeDeTributacaoXFornecedorVisualizar = new AtividadeDeTributacaoXFornecedorVisualizar();
		atividadeDeTributacaoXFornecedorVisualizar.beforeClass();
		atividadeDeTributacaoXFornecedorVisualizar.login();
		atividadeDeTributacaoXFornecedorVisualizar.acessarMDR();
		atividadeDeTributacaoXFornecedorVisualizar.Visualizar();
		atividadeDeTributacaoXFornecedorVisualizar.afterClass();
	}
	
	@Test(priority = 47, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
	public void atividadeDeTributacaoXFornecedorEditar() {
		atividadeDeTributacaoXFornecedorEditar = new AtividadeDeTributacaoXFornecedorEditar();
		atividadeDeTributacaoXFornecedorEditar.beforeClass();
		atividadeDeTributacaoXFornecedorEditar.login();
		atividadeDeTributacaoXFornecedorEditar.acessarMDR();
		atividadeDeTributacaoXFornecedorEditar.editar();
		atividadeDeTributacaoXFornecedorEditar.afterClass();
	}
	
	
	
	
	@Test(priority = 48, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
	public void atividadeDeTributacaoXFornecedorExcluir() {
		atividadeDeTributacaoXFornecedorExcluir = new AtividadeDeTributacaoXFornecedorExcluir();
		atividadeDeTributacaoXFornecedorExcluir.beforeClass();
		atividadeDeTributacaoXFornecedorExcluir.login();
		atividadeDeTributacaoXFornecedorExcluir.acessarMDR();
		atividadeDeTributacaoXFornecedorExcluir.excluir();
		atividadeDeTributacaoXFornecedorExcluir.afterClass();
	}
	
	@Test(priority = 49, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
	public void atividadeDeTributacaoXFornecedorExcluirEmMassa() {
		atividadeDeTributacaoXFornecedorExcluirEmMassa = new AtividadeDeTributacaoXFornecedorExcluirEmMassa();
		atividadeDeTributacaoXFornecedorExcluirEmMassa.beforeClass();
		atividadeDeTributacaoXFornecedorExcluirEmMassa.login();
		atividadeDeTributacaoXFornecedorExcluirEmMassa.acessarMDR();
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
		sgdpCriar.login();
		sgdpCriar.acessarMDR();
		sgdpCriar.criar();
		sgdpCriar.afterClass();

	}
	
	
	@Test(priority = 51, dependsOnMethods = "sgdpCriar")
	public void sgdpEditar() {
		sgdpEditar = new SGDPEditar();
		sgdpEditar.beforeClass();
		sgdpEditar.login();
		sgdpEditar.acessarMDR();
		sgdpEditar.editar();
		sgdpEditar.afterClass();

	}
	
	
	@Test(priority = 52, dependsOnMethods = "sgdpCriar")
	public void sgdpVisualizar() {
		sgdpVisualizar = new SGDPVisualizar();
		sgdpVisualizar.beforeClass();
		sgdpVisualizar.login();
		sgdpVisualizar.acessarMDR();
		sgdpVisualizar.visualizar();
		sgdpVisualizar.afterClass();

	}
	@Test(priority = 53, dependsOnMethods = "sgdpCriar")
	public void sgdpExcluir() {
		sGDPExcluir = new SGDPExcluir();
		sGDPExcluir.beforeClass();
		sGDPExcluir.login();
		sGDPExcluir.acessarMDR();
		sGDPExcluir.excluir();
		sGDPExcluir.afterClass();

	}
	
	@Test(priority = 54, dependsOnMethods = "sgdpCriar")
	public void sgdpExcluirEmMassa() {
		
		sgdpExcluirEmMassa = new SGDPExcluirEmMassa();
		sgdpExcluirEmMassa.beforeClass();
		sgdpExcluirEmMassa.login();
		sgdpExcluirEmMassa.acessarMDR();
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
		StatusParaBancoInd�bitosCriar.login();
		StatusParaBancoInd�bitosCriar.acessarMDR();
		StatusParaBancoInd�bitosCriar.criar();
		StatusParaBancoInd�bitosCriar.afterClass();
	}
	@Test(priority = 56, dependsOnMethods = "statusParaBancoInd�bitosCriar")
	public void StatusParaBancoInd�bitosEditar() {
		
		statusParaBancoInd�bitosEditar = new StatusParaBancoInd�bitosEditar();
		statusParaBancoInd�bitosEditar.beforeClass();
		statusParaBancoInd�bitosEditar.login();
		statusParaBancoInd�bitosEditar.acessarMDR();
		statusParaBancoInd�bitosEditar.editar();
		statusParaBancoInd�bitosEditar.afterClass();
	}
	@Test(priority = 57, dependsOnMethods = "statusParaBancoInd�bitosCriar")
	public void StatusParaBancoInd�bitosVisualizar() {
		
		statusParaBancoInd�bitosVisualizar = new StatusParaBancoInd�bitosVisualizar();
		statusParaBancoInd�bitosVisualizar.beforeClass();
		statusParaBancoInd�bitosVisualizar.login();
		statusParaBancoInd�bitosVisualizar.acessarMDR();
		statusParaBancoInd�bitosVisualizar.visualizar();
		statusParaBancoInd�bitosVisualizar.afterClass();
	}
	@Test(priority = 58, dependsOnMethods = "statusParaBancoInd�bitosCriar")
	public void StatusParaBancoInd�bitosExcluir() {
		
		statusParaBancoInd�bitosExcluir = new StatusParaBancoInd�bitosExcluir();
		statusParaBancoInd�bitosExcluir.beforeClass();
		statusParaBancoInd�bitosExcluir.login();
		statusParaBancoInd�bitosExcluir.acessarMDR();
		statusParaBancoInd�bitosExcluir.excluir();
		statusParaBancoInd�bitosExcluir.afterClass();
	}
	@Test(priority = 59, dependsOnMethods = "statusParaBancoInd�bitosCriar")
	public void StatusParaBancoInd�bitosExcluirMassa() {
		
		statusParaBancoInd�bitosExcluirMassa = new StatusParaBancoInd�bitosExcluirMassa();
		statusParaBancoInd�bitosExcluirMassa.beforeClass();
		statusParaBancoInd�bitosExcluirMassa.login();
		statusParaBancoInd�bitosExcluirMassa.acessarMDR();
		statusParaBancoInd�bitosExcluirMassa.criar();
		statusParaBancoInd�bitosExcluirMassa.afterClass();
		System.out.println("-------------------Controle de Cr�dito Tribut�rio > Status para Banco de Ind�bitos Fim-------------------------");
	}
	
 
}
