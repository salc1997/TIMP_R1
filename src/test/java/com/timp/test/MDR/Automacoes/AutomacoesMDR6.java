package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;
 
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotasDeTaxaDeActualizacaoPesquisaPorIDPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Confrontacao.ConfrontacaoCriarPO;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorCriar;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorDetalhes;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorEditar;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorExcluir;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorExcluirEmMassa;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorFiltroID;
import com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorVisualizar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosCriar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosExcluirEmMassa;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisEditar;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaExcluirEmMassa;
import com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoExcluirEmMassa;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosExcluirMassa;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosVisualizar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.statusParaBancoInd�bitosCriar;
import com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorExcluirEmMassa;
import com.timp.test.MDR.Empresas.EmpresaEditar;
import com.timp.test.MDR.Empresas.EmpresasDetalhes;
import com.timp.test.MDR.Empresas.EmpresasFiltros;
import com.timp.test.MDR.Empresas.EmpresasVisualizar;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisExcluirMassaPP;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilExcluirEmMassa;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoExcluirEmMassa;
import com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstitui��oContaEstoqueCen�riosCorre��es.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa;
import com.timp.test.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosFiltroPorID;
import com.timp.test.MDR.RateioDeConsorcio.RateioDeConsorcioPesquisaPorID;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaExcluirEmMassa;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASExcluirEmMassa;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFExcluirEmMassa;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFFiltroPorID;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPExcluirEmMassa;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosCriar;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosEditar;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamientoDeAposEspExcluiMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasExluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesVisualizar;
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
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.SubItensValidos.SubItensValidosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeLogradouros.TabelaLogradouroExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaServicos.TabelaServicosExcluirEmMassa;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoPesquisaPorID;
import com.timp.test.MDR.TaxasDeConversao.TaxasDeConversaoCriar;
import com.timp.test.MDR.TaxasDeConversao.TaxasDeConversaoDetalhes;
import com.timp.test.MDR.TaxasDeConversao.TaxasDeConversaoEditar;
import com.timp.test.MDR.TaxasDeConversao.TaxasDeConversaoExcluir;
import com.timp.test.MDR.TaxasDeConversao.TaxasDeConversaoExcluirEmMassa;
import com.timp.test.MDR.TaxasDeConversao.TaxasDeConversaoVisualizar;
import com.timp.test.MDR.ThinCapitalization.Subcapitalizacao.SubcapitalizacaoCriar;
import com.timp.test.MDR.ThinCapitalization.Subcapitalizacao.SubcapitalizacaoEditar;
import com.timp.test.MDR.ThinCapitalization.Subcapitalizacao.SubcapitalizacaoExcluir;
import com.timp.test.MDR.ThinCapitalization.Subcapitalizacao.SubcapitalizacaoExcluirEmMassa;
import com.timp.test.MDR.ValorAdicionado.Confrontacao.ConfratacaoCriar;
import com.timp.test.MDR.ValorAdicionado.Confrontacao.ConfrontacaoDetalhes;
import com.timp.test.MDR.ValorAdicionado.Confrontacao.ConfrontacaoEditar;
import com.timp.test.MDR.ValorAdicionado.Confrontacao.ConfrontacaoExcluir;
import com.timp.test.MDR.ValorAdicionado.Confrontacao.ConfrontacaoVisualizar;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluirEmMassa;

public class AutomacoesMDR6 extends TestBaseSteven{
	
	// Tabela 01 - Categorias De Trabalhadores
			CategoriasDeTrabalhadoresCriar categoriasDeTrabalhadoresCriar;
			CategoriasDeTrabalhadoresEditar categoriasDeTrabalhadoresEditar;
			CategoriasDeTrabalhadoresVisualizar categoriasDeTrabalhadoresVisualizar;
			CategoriasDeTrabalhadoresExcluir categoriasDeTrabalhadoresExcluir;
			CategoriasDeTrabalhadoresExcluirMassa categoriasDeTrabalhadoresExcluirMassa;
		// Tabela 02 - Financiamento De Apos Esp
			FinanciamentoDeAposEspCriar financiamentoDeAposEspCriar;
			FinanciamentoDeAposEspEditar financiamentoDeAposEspEditar;
			FinanciamentoDeAposEspVisualizar financiamentoDeAposEspVisualizar;
			FinanciamentoDeAposEspExcluir financiamentoDeAposEspExcluir;
			FinanciamientoDeAposEspExcluiMassa financiamientoDeAposEspExcluiMassa;
		// Tabela 03 - Natureza Das Rubricas
			NaturezaDasRubricasCriar naturezaDasRubricasCriar;
			NaturezaDasRubricasEditar naturezaDasRubricasEditar;
			NaturezaDasRubricasVisualizar naturezaDasRubricasVisualizar;
			NaturezaDasRubricasExcluir naturezaDasRubricasExcluir;
			NaturezaDasRubricasExluirMassa naturezaDasRubricasExluirMassa;
			
		//Tabela 04 - Codigos E Aliq. De FPRAS
			CodigosEAliqDeFPRASCriar codigosEAliqDeFPRASCriar;
			CodigosEAliqDeFPRASEditar codigosEAliqDeFPRASEditar;
			CodigosEAliqDeFPRASVisualizar codigosEAliqDeFPRASVisualizar;
			CodigosEAliqDeFPRASExcluir codigosEAliqDeFPRASExcluir;
			CodigosEAliqDeFPRASExcluirMassa codigosEAliqDeFPRASExcluirMassa;
			
		//Tabela 05 - Tipos de Registro
			TiposDeRegistroCriar tiposDeRegistroCriar;
			TiposDeRegistroEditar tiposDeRegistroEditar;
			TiposDeRegistroVisualizar tiposDeRegistroVisualizar;
			TiposDeRegistroExcluir tiposDeRegistroExcluir;
			TiposDeRegistroExcluirMassa tiposDeRegistroExcluirMassa;
			
		//Tabela 06 - Paises
			PaisesCriar paisesCriar;
			PaisesEditar paisesEditar;
			PaisesVisualizar paisesVisualizar;
			PaisesExcluir paisesExcluir;
			PaisesExcluirMassa paisesExcluirMassa;
		
		//Tabela 07 - Tipos de Dependentes
			TiposDeDependentesCriar tiposDeDependentesCriar;
			TiposDeDependentesEditar tiposDeDependentesEditar;
			TiposDeDependentesVisualizar tiposDeDependentesVisualizar;
			TiposDeDependentesExcluir tiposDeDependentesExcluir;
			TiposDeDependentesExcluirMassa tiposDeDependentesExcluirMassa;
			
		//Codigo receita
			CodigoReceitaExcluirEmMassa codigoReceitaExcluirEmMassa;
		//Siscoserv > Pais/Moeda
			PaisMoedaExcluirEmMassa paisMoedaExcluirEmMassa;
			
		//Siscoserv > Registro Ras
			RegistroRASExcluirEmMassa registroRASExcluirEmMassa;
		
		//Siscoserv > Registro RP
			RegistroRPExcluirEmMassa registroRPExcluirEmMassa;
		//Atividades Para Tributacao > Tipos De Servicos
			TiposDeServicosExcluirEmMassa tiposDeServicosExcluirEmMassa;
			
		//Valor Adicionado > Confrontacao 
			ConfratacaoCriar confratacaoCriar;
			ConfrontacaoDetalhes confrontacaoDetalhes;
			ConfrontacaoEditar confrontacaoEditar;
			ConfrontacaoExcluir confrontacaoExcluir;
			ConfrontacaoVisualizar confrontacaoVisualizar;
			
		//Taxas De Conversao
			TaxasDeConversaoCriar taxasDeConversaoCriar;
			TaxasDeConversaoEditar taxasDeConversaoEditar;
			TaxasDeConversaoVisualizar taxasDeConversaoVisualizar;
			TaxasDeConversaoExcluir taxasDeConversaoExcluir;
			TaxasDeConversaoExcluirEmMassa taxasDeConversaoExcluirEmMassa;
			TaxasDeConversaoDetalhes taxasDeConversaoDetalhes;
			
		//Thin Capitalization > Subcapitalizacao
			SubcapitalizacaoCriar subcapitalizacaoCriar;
			SubcapitalizacaoEditar subcapitalizacaoEditar;
			SubcapitalizacaoExcluir subcapitalizacaoExcluir;
			SubcapitalizacaoExcluirEmMassa subcapitalizacaoExcluirEmMassa;
			
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
		//--------------------------------------------------------------------------
			
			//0
			// Tabela 01 - Categorias De Trabalhadores
			
			@Test(priority = 0)
			public void categoriasDeTrabalhadoresCriar() {
				System.out.println("------------------- Tabela 01 - Categorias De Trabalhadores-------------------------");
				categoriasDeTrabalhadoresCriar = new CategoriasDeTrabalhadoresCriar();
				categoriasDeTrabalhadoresCriar.beforeClass();
				categoriasDeTrabalhadoresCriar.login();
				categoriasDeTrabalhadoresCriar.acessarMDR();
				categoriasDeTrabalhadoresCriar.criar();
				categoriasDeTrabalhadoresCriar.afterClass();

			}
			
			@Test(priority = 1, dependsOnMethods = "categoriasDeTrabalhadoresCriar")
			public void categoriasDeTrabalhadoresEditar() {
				categoriasDeTrabalhadoresEditar = new CategoriasDeTrabalhadoresEditar();
				categoriasDeTrabalhadoresEditar.beforeClass();
				categoriasDeTrabalhadoresEditar.login();
				categoriasDeTrabalhadoresEditar.acessarMDR();
				categoriasDeTrabalhadoresEditar.editar();
				categoriasDeTrabalhadoresEditar.afterClass();

			}
			
			@Test(priority = 2, dependsOnMethods = "categoriasDeTrabalhadoresCriar")
			public void categoriasDeTrabalhadoresExcluirMassa() {
				categoriasDeTrabalhadoresExcluirMassa = new CategoriasDeTrabalhadoresExcluirMassa();
				categoriasDeTrabalhadoresExcluirMassa.beforeClass();
				categoriasDeTrabalhadoresExcluirMassa.login();
				categoriasDeTrabalhadoresExcluirMassa.acessarMDR();
				categoriasDeTrabalhadoresExcluirMassa.criar();
				categoriasDeTrabalhadoresExcluirMassa.afterClass();

			}
			
			@Test(priority = 3, dependsOnMethods = "categoriasDeTrabalhadoresCriar")
			public void categoriasDeTrabalhadoresVisualizar() {
				categoriasDeTrabalhadoresVisualizar = new CategoriasDeTrabalhadoresVisualizar();
				categoriasDeTrabalhadoresVisualizar.beforeClass();
				categoriasDeTrabalhadoresVisualizar.login();
				categoriasDeTrabalhadoresVisualizar.acessarMDR();
				categoriasDeTrabalhadoresVisualizar.Visualizar();
				categoriasDeTrabalhadoresVisualizar.afterClass();

			}
			
			
			@Test(priority = 4, dependsOnMethods = "categoriasDeTrabalhadoresCriar")
			public void categoriasDeTrabalhadoresExcluir() {
				categoriasDeTrabalhadoresExcluir = new CategoriasDeTrabalhadoresExcluir();
				categoriasDeTrabalhadoresExcluir.beforeClass();
				categoriasDeTrabalhadoresExcluir.login();
				categoriasDeTrabalhadoresExcluir.acessarMDR();
				categoriasDeTrabalhadoresExcluir.excluir();
				categoriasDeTrabalhadoresExcluir.afterClass();
				System.out.println("------------------- Tabela 01 - Categorias De Trabalhadores Fim-------------------------");
				
			}
			
			//6
			// Tabela 02 - Financiamento De Apos Esp
			
			@Test(priority = 6)
			public void financiamentoDeAposEspCriar() {
				System.out.println("------------------- Tabela 02 - Financiamento De Apos Esp-------------------------");
				financiamentoDeAposEspCriar = new FinanciamentoDeAposEspCriar();
				financiamentoDeAposEspCriar.beforeClass();
				financiamentoDeAposEspCriar.login();
				financiamentoDeAposEspCriar.acessarMDR();
				financiamentoDeAposEspCriar.criar();
				financiamentoDeAposEspCriar.afterClass();

			}
			
			@Test(priority = 7, dependsOnMethods = "financiamentoDeAposEspCriar")
			public void financiamentoDeAposEspEditar() {
				financiamentoDeAposEspEditar = new FinanciamentoDeAposEspEditar();
				financiamentoDeAposEspEditar.beforeClass();
				financiamentoDeAposEspEditar.login();
				financiamentoDeAposEspEditar.acessarMDR();
				financiamentoDeAposEspEditar.editar();
				financiamentoDeAposEspEditar.afterClass();

			}
			
			@Test(priority = 8, dependsOnMethods = "financiamentoDeAposEspCriar")
			public void financiamentoDeAposEspVisualizar() {
				financiamentoDeAposEspVisualizar = new FinanciamentoDeAposEspVisualizar();
				financiamentoDeAposEspVisualizar.beforeClass();
				financiamentoDeAposEspVisualizar.login();
				financiamentoDeAposEspVisualizar.acessarMDR();
				financiamentoDeAposEspVisualizar.Visualizar();
				financiamentoDeAposEspVisualizar.afterClass();

			}
			
			@Test(priority = 9, dependsOnMethods = "financiamentoDeAposEspCriar")
			public void financiamentoDeAposEspExcluir() {
				financiamentoDeAposEspExcluir = new FinanciamentoDeAposEspExcluir();
				financiamentoDeAposEspExcluir.beforeClass();
				financiamentoDeAposEspExcluir.login();
				financiamentoDeAposEspExcluir.acessarMDR();
				financiamentoDeAposEspExcluir.excluir();
				financiamentoDeAposEspExcluir.afterClass();
				
				System.out.println("------------------- Tabela 02 - Financiamento De Apos Esp Fim-------------------------");
				

			}
			
			//12
			//Tabela 03 - Natureza Das Rubricas
			
			@Test(priority = 12)
			public void naturezaDasRubricasCriar() {
				System.out.println("------------------- Tabela 03 - Natureza Das Rubricas-------------------------");
				naturezaDasRubricasCriar = new NaturezaDasRubricasCriar();
				naturezaDasRubricasCriar.beforeClass();
				naturezaDasRubricasCriar.login();
				naturezaDasRubricasCriar.acessarMDR();
				naturezaDasRubricasCriar.criar();
				naturezaDasRubricasCriar.afterClass();

			}
			
			@Test(priority = 13, dependsOnMethods = "naturezaDasRubricasCriar")
			public void naturezaDasRubricasEditar() {
			    
				naturezaDasRubricasEditar = new NaturezaDasRubricasEditar();
				naturezaDasRubricasEditar.beforeClass();
				naturezaDasRubricasEditar.login();
				naturezaDasRubricasEditar.acessarMDR();
				naturezaDasRubricasEditar.editar();
				naturezaDasRubricasEditar.afterClass();

			}
			
			@Test(priority = 14, dependsOnMethods = "naturezaDasRubricasCriar")
			public void naturezaDasRubricasVisualizar() {
			    
				naturezaDasRubricasVisualizar = new NaturezaDasRubricasVisualizar();
				naturezaDasRubricasVisualizar.beforeClass();
				naturezaDasRubricasVisualizar.login();
				naturezaDasRubricasVisualizar.acessarMDR();
				naturezaDasRubricasVisualizar.Visualizar();
				naturezaDasRubricasVisualizar.afterClass();

			}
			
			@Test(priority = 15, dependsOnMethods = "naturezaDasRubricasCriar")
			public void naturezaDasRubricasExcluir() {
			    
				naturezaDasRubricasExcluir = new NaturezaDasRubricasExcluir();
				naturezaDasRubricasExcluir.beforeClass();
				naturezaDasRubricasExcluir.login();
				naturezaDasRubricasExcluir.acessarMDR();
				naturezaDasRubricasExcluir.excluir();
				naturezaDasRubricasExcluir.afterClass();
			}
			
			@Test(priority = 16, dependsOnMethods = "naturezaDasRubricasCriar")
			public void naturezaDasRubricasExcluirMassa() {
			    
				naturezaDasRubricasExluirMassa = new NaturezaDasRubricasExluirMassa();
				naturezaDasRubricasExluirMassa.beforeClass();
				naturezaDasRubricasExluirMassa.login();
				naturezaDasRubricasExluirMassa.acessarMDR();
				naturezaDasRubricasExluirMassa.criar();
				naturezaDasRubricasExluirMassa.excluirMassa();
				naturezaDasRubricasExluirMassa.afterClass();
				System.out.println("------------------- Tabela 03 - Natureza Das Rubricas Fim-------------------------");
			}
			
			//18
			//Tabela 04 - Codigos E Aliq. De FPRAS
			@Test(priority = 18)
			public void codigosEAliqDeFPRASCriar() {
				System.out.println("------------------- Tabela 04 - Codigos E Aliq. De FPRAS-------------------------");
				codigosEAliqDeFPRASCriar = new CodigosEAliqDeFPRASCriar();
				codigosEAliqDeFPRASCriar.beforeClass();
				codigosEAliqDeFPRASCriar.login();
				codigosEAliqDeFPRASCriar.acessarMDR();
				codigosEAliqDeFPRASCriar.criar();
				codigosEAliqDeFPRASCriar.afterClass();

			}
			
			@Test(priority = 19, dependsOnMethods = "codigosEAliqDeFPRASCriar")
			public void codigosEAliqDeFPRASEditar() {
				codigosEAliqDeFPRASEditar = new CodigosEAliqDeFPRASEditar();
				codigosEAliqDeFPRASEditar.beforeClass();
				codigosEAliqDeFPRASEditar.login();
				codigosEAliqDeFPRASEditar.acessarMDR();
				codigosEAliqDeFPRASEditar.editar();
				codigosEAliqDeFPRASEditar.afterClass();

			}
			
			@Test(priority = 20, dependsOnMethods = "codigosEAliqDeFPRASCriar")
			public void codigosEAliqDeFPRASVisualizar() {
				codigosEAliqDeFPRASVisualizar = new CodigosEAliqDeFPRASVisualizar();
				codigosEAliqDeFPRASVisualizar.beforeClass();
				codigosEAliqDeFPRASVisualizar.login();
				codigosEAliqDeFPRASVisualizar.acessarMDR();
				codigosEAliqDeFPRASVisualizar.Visualizar();
				codigosEAliqDeFPRASVisualizar.afterClass();

			}
			
			@Test(priority = 21, dependsOnMethods = "codigosEAliqDeFPRASCriar")
			public void codigosEAliqDeFPRASExcluir() {
				codigosEAliqDeFPRASExcluir = new CodigosEAliqDeFPRASExcluir();
				codigosEAliqDeFPRASExcluir.beforeClass();
				codigosEAliqDeFPRASExcluir.login();
				codigosEAliqDeFPRASExcluir.acessarMDR();
				codigosEAliqDeFPRASExcluir.excluir();
				codigosEAliqDeFPRASExcluir.afterClass();
				
			}
			
			@Test(priority = 22, dependsOnMethods = "codigosEAliqDeFPRASCriar")
			public void codigosEAliqDeFPRASExcluirMassa() {
				codigosEAliqDeFPRASExcluirMassa = new CodigosEAliqDeFPRASExcluirMassa();
				codigosEAliqDeFPRASExcluirMassa.beforeClass();
				codigosEAliqDeFPRASExcluirMassa.login();
				codigosEAliqDeFPRASExcluirMassa.acessarMDR();
				codigosEAliqDeFPRASExcluirMassa.criar();
				codigosEAliqDeFPRASExcluirMassa.excluirMassa();
				codigosEAliqDeFPRASExcluirMassa.afterClass();
				System.out.println("------------------- Tabela 04 - Codigos E Aliq. De FPRAS Fim-------------------------");
				
			}
			//24
			//Tabela 05 - Tipos de Registro
			
			
			@Test(priority = 24)
			public void tiposDeRegistroCriar() {
				System.out.println("------------------- Tabela 05 - Tipos de Registro-------------------------");
				tiposDeRegistroCriar = new TiposDeRegistroCriar();
				tiposDeRegistroCriar.beforeClass();
				tiposDeRegistroCriar.login();
				tiposDeRegistroCriar.acessarMDR();
				tiposDeRegistroCriar.criar();
				tiposDeRegistroCriar.afterClass();

			}
			
			@Test(priority = 25, dependsOnMethods = "tiposDeRegistroCriar")
			public void tiposDeRegistroEditar() {
				tiposDeRegistroEditar = new TiposDeRegistroEditar();
				tiposDeRegistroEditar.beforeClass();
				tiposDeRegistroEditar.login();
				tiposDeRegistroEditar.acessarMDR();
				tiposDeRegistroEditar.editar();
				tiposDeRegistroEditar.afterClass();

			}
			
			@Test(priority = 25, dependsOnMethods = "tiposDeRegistroCriar")
			public void tiposDeRegistroVisualizar() {
				tiposDeRegistroVisualizar = new TiposDeRegistroVisualizar();
				tiposDeRegistroVisualizar.beforeClass();
				tiposDeRegistroVisualizar.login();
				tiposDeRegistroVisualizar.acessarMDR();
				tiposDeRegistroVisualizar.Visualizar();
				tiposDeRegistroVisualizar.afterClass();

			}
			
			@Test(priority = 26, dependsOnMethods = "tiposDeRegistroCriar")
			public void tiposDeRegistroExcluir() {
				tiposDeRegistroExcluir = new TiposDeRegistroExcluir();
				tiposDeRegistroExcluir.beforeClass();
				tiposDeRegistroExcluir.login();
				tiposDeRegistroExcluir.acessarMDR();
				tiposDeRegistroExcluir.excluir();
				tiposDeRegistroExcluir.afterClass();
			}
			
			@Test(priority = 27, dependsOnMethods = "tiposDeRegistroCriar")
			public void tiposDeRegistroExcluirMassa() {
				tiposDeRegistroExcluirMassa = new TiposDeRegistroExcluirMassa();
				tiposDeRegistroExcluirMassa.beforeClass();
				tiposDeRegistroExcluirMassa.login();
				tiposDeRegistroExcluirMassa.acessarMDR();
				tiposDeRegistroExcluirMassa.criar();
				tiposDeRegistroExcluirMassa.excluirMassa();
				tiposDeRegistroExcluirMassa.afterClass();
				
				System.out.println("------------------- Tabela 05 - Tipos de Registro Fim-------------------------");
			}
			
			//28
			//Tabela 06 - Paises
			
			@Test(priority = 28)
			public void paisesCriar() {
				System.out.println("------------------- Tabela 06 - Paises-------------------------");
				paisesCriar = new PaisesCriar();
				paisesCriar.beforeClass();
				paisesCriar.login();
				paisesCriar.acessarMDR();
				paisesCriar.criar();
				paisesCriar.afterClass();

			}
			
			@Test(priority = 29, dependsOnMethods = "paisesCriar")
			public void paisesEditar() {
				
				paisesEditar = new PaisesEditar();
				paisesEditar.beforeClass();
				paisesEditar.login();
				paisesEditar.acessarMDR();
				paisesEditar.editar();
				paisesEditar.afterClass();

			}
			
			@Test(priority = 30, dependsOnMethods = "paisesCriar")
			public void paisesVisualizar() {
				
				paisesVisualizar = new PaisesVisualizar();
				paisesVisualizar.beforeClass();
				paisesVisualizar.login();
				paisesVisualizar.acessarMDR();
				paisesVisualizar.Visualizar();
				paisesVisualizar.afterClass();

			}
			
			@Test(priority = 31, dependsOnMethods = "paisesCriar")
			public void paisesExcluir() {
				
				paisesExcluir = new PaisesExcluir();
				paisesExcluir.beforeClass();
				paisesExcluir.login();
				paisesExcluir.acessarMDR();
				paisesExcluir.excluir();
				paisesExcluir.afterClass();
				
			}
			
			@Test(priority = 32, dependsOnMethods = "paisesCriar")
			public void paisesExcluirMassa() {
				paisesExcluirMassa = new PaisesExcluirMassa();
				paisesExcluirMassa.beforeClass();
				paisesExcluirMassa.login();
				paisesExcluirMassa.acessarMDR();
				paisesExcluirMassa.criar();
				paisesExcluirMassa.excluirMassa();
				paisesExcluirMassa.afterClass();
				System.out.println("------------------- Tabela 06 - Paises Fim-------------------------");
				
			}
			//34
			//Tabela 07 - Tipos de Dependentes
			@Test(priority = 34)
			public void tiposDeDependentesCriar() {
				System.out.println("-------------------Tabela 07 - Tipos de Dependentes-------------------------");
				tiposDeDependentesCriar = new TiposDeDependentesCriar();
				tiposDeDependentesCriar.beforeClass();
				tiposDeDependentesCriar.login();
				tiposDeDependentesCriar.acessarMDR();
				tiposDeDependentesCriar.criar();
				tiposDeDependentesCriar.afterClass();

			}
			
			
			@Test(priority = 35, dependsOnMethods = "tiposDeDependentesCriar")
			public void tiposDeDependentesEditar() {
			tiposDeDependentesEditar = new TiposDeDependentesEditar();
				tiposDeDependentesEditar.beforeClass();
				tiposDeDependentesEditar.login();
				tiposDeDependentesEditar.acessarMDR();
				tiposDeDependentesEditar.editar();
				tiposDeDependentesEditar.afterClass();

			}
			
			@Test(priority = 36, dependsOnMethods = "tiposDeDependentesCriar")
			public void tiposDeDependentesVisualizar() {
				tiposDeDependentesVisualizar = new TiposDeDependentesVisualizar();
				tiposDeDependentesVisualizar.beforeClass();
				tiposDeDependentesVisualizar.login();
				tiposDeDependentesVisualizar.acessarMDR();
				tiposDeDependentesVisualizar.Visualizar();
				tiposDeDependentesVisualizar.afterClass();

			}
			
			@Test(priority = 37, dependsOnMethods = "tiposDeDependentesCriar")
			public void tiposDeDependentesExcluir() {
				tiposDeDependentesExcluir = new TiposDeDependentesExcluir();
				tiposDeDependentesExcluir.beforeClass();
				tiposDeDependentesExcluir.login();
				tiposDeDependentesExcluir.acessarMDR();
				tiposDeDependentesExcluir.excluir();
				tiposDeDependentesExcluir.afterClass();
			}
			
			@Test(priority = 38, dependsOnMethods = "tiposDeDependentesCriar")
			public void tiposDeDependentesExcluirMassa() {
				tiposDeDependentesExcluirMassa = new TiposDeDependentesExcluirMassa();
				tiposDeDependentesExcluirMassa.beforeClass();
				tiposDeDependentesExcluirMassa.login();
				tiposDeDependentesExcluirMassa.acessarMDR();
				tiposDeDependentesExcluirMassa.criar();
				tiposDeDependentesExcluirMassa.excluirMassa();
				tiposDeDependentesExcluirMassa.afterClass();
				System.out.println("-------------------Tabela 07 - Tipos de Dependentes Fim-------------------------");
			}
			//39
			//Codigo receita	
			@Test(priority = 39)
			public void codigoReceitaExcluirEmMassa() {
				System.out.println("-------------------Codigo receita-------------------------");
				codigoReceitaExcluirEmMassa = new CodigoReceitaExcluirEmMassa();
				codigoReceitaExcluirEmMassa.beforeClass();
				codigoReceitaExcluirEmMassa.login();
				codigoReceitaExcluirEmMassa.acessarMDR();
				codigoReceitaExcluirEmMassa.criar();
				codigoReceitaExcluirEmMassa.afterClass();

			}
			
			//Siscoserv > Pais/Moeda
			@Test(priority = 40)
			public void paisMoedaExcluirEmMassa() {
				System.out.println("-------------------Siscoserv > Pais/Moeda-------------------------");
				paisMoedaExcluirEmMassa = new PaisMoedaExcluirEmMassa();
				paisMoedaExcluirEmMassa.beforeClass();
				paisMoedaExcluirEmMassa.login();
				paisMoedaExcluirEmMassa.acessarMDR();
				paisMoedaExcluirEmMassa.criar();
				paisMoedaExcluirEmMassa.afterClass();

			}
			
			//Siscoserv > RegistroRAS
			@Test(priority = 41)
			public void registroRASExcluirEmMassa() {
				System.out.println("-------------------Siscoserv > RegistroRAS-------------------------");
				registroRASExcluirEmMassa = new RegistroRASExcluirEmMassa();
				registroRASExcluirEmMassa.beforeClass();
				registroRASExcluirEmMassa.login();
				registroRASExcluirEmMassa.acessarMDR();
				registroRASExcluirEmMassa.criar();
				registroRASExcluirEmMassa.afterClass();

			}
			
			//Siscoserv > RegistroRP
			@Test(priority = 42)
			public void registroRPExcluirEmMassa() {
				System.out.println("-------------------Siscoserv > RegistroRP-------------------------");
				registroRPExcluirEmMassa = new RegistroRPExcluirEmMassa();
				registroRPExcluirEmMassa.beforeClass();
				registroRPExcluirEmMassa.login();
				registroRPExcluirEmMassa.acessarMDR();
				registroRPExcluirEmMassa.criar();
				registroRPExcluirEmMassa.afterClass();

			}
			
			//Atividades Para Tributacao > Tipos De Servicos 
			@Test(priority = 43)
			public void tiposDeServicosExcluirEmMassa() {
				System.out.println("-------------------Atividades Para Tributacao > Tipos De Servicos-------------------------");
				tiposDeServicosExcluirEmMassa = new TiposDeServicosExcluirEmMassa();
				tiposDeServicosExcluirEmMassa.beforeClass();
				tiposDeServicosExcluirEmMassa.login();
				tiposDeServicosExcluirEmMassa.acessarMDR();
				tiposDeServicosExcluirEmMassa.criar();
				tiposDeServicosExcluirEmMassa.afterClass();

			}
		
			
			//Valor Adicionado > Confrontacao
			@Test(priority = 44)
			public void confratacaoCriar() {
				System.out.println("-------------------Valor Adicionado > Confrontacao-------------------------");
				confratacaoCriar = new ConfratacaoCriar();
				confratacaoCriar.beforeClass();
				confratacaoCriar.login();
				confratacaoCriar.acessarMDR();
				confratacaoCriar.criar();
				confratacaoCriar.afterClass();

			}
			
			@Test(priority = 45, dependsOnMethods = "confratacaoCriar")
			public void confrontacaoDetalhes() {
				confrontacaoDetalhes = new ConfrontacaoDetalhes();
				confrontacaoDetalhes.beforeClass();
				confrontacaoDetalhes.login();
				confrontacaoDetalhes.acessarMDR();
				confrontacaoDetalhes.detalhes();
				confrontacaoDetalhes.afterClass();

			}
			
			@Test(priority = 46, dependsOnMethods = "confratacaoCriar")
			public void confrontacaoEditar() {
				confrontacaoEditar = new ConfrontacaoEditar();
				confrontacaoEditar.beforeClass();
				confrontacaoEditar.login();
				confrontacaoEditar.acessarMDR();
				confrontacaoEditar.editar();
				confrontacaoEditar.afterClass();
				
			}
		
			
			@Test(priority = 47, dependsOnMethods = "confratacaoCriar")
			public void confrontacaoVisualizar() {
				confrontacaoVisualizar = new ConfrontacaoVisualizar();
				confrontacaoVisualizar.beforeClass();
				confrontacaoVisualizar.ingresar();
				confrontacaoVisualizar.ingresarMDR();
				confrontacaoVisualizar.visualizar();
				confrontacaoVisualizar.afterClass();
				
			}
			@Test(priority = 48, dependsOnMethods = "confratacaoCriar")
			public void confrontacaoExcluir() {
				confrontacaoExcluir = new ConfrontacaoExcluir();
				confrontacaoExcluir.beforeClass();
				confrontacaoExcluir.ingresar();
				confrontacaoExcluir.ingresarMDR();
				confrontacaoExcluir.Excluir();
				confrontacaoExcluir.afterClass();
				System.out.println("-------------------Valor Adicionado > Confrontacao fim-------------------------");
				
			}
			//50
			//Taxas De Conversao
			@Test(priority = 50)
			public void taxasDeConversaoCriar() {
				System.out.println("-------------------Taxas De Conversao-------------------------");
				taxasDeConversaoCriar = new TaxasDeConversaoCriar();
				taxasDeConversaoCriar.beforeClass();
				taxasDeConversaoCriar.login();
				taxasDeConversaoCriar.acessarMDR();
				taxasDeConversaoCriar.criar();
				taxasDeConversaoCriar.afterClass();

			}
			
			
			@Test(priority = 51, dependsOnMethods = "taxasDeConversaoCriar")
			public void taxasDeConversaoEditar() {
				taxasDeConversaoEditar = new TaxasDeConversaoEditar();
				taxasDeConversaoEditar.beforeClass();
				taxasDeConversaoEditar.login();
				taxasDeConversaoEditar.acessarMDR();
				taxasDeConversaoEditar.editar();
				taxasDeConversaoEditar.afterClass();

			}
			
			@Test(priority = 52, dependsOnMethods = "taxasDeConversaoCriar")
			public void taxasDeConversaoVisualizar() {
				taxasDeConversaoVisualizar = new TaxasDeConversaoVisualizar();
				taxasDeConversaoVisualizar.beforeClass();
				taxasDeConversaoVisualizar.login();
				taxasDeConversaoVisualizar.acessarMDR();
				taxasDeConversaoVisualizar.Visualizar();
				taxasDeConversaoVisualizar.afterClass();

			}
			
			@Test(priority = 53, dependsOnMethods = "taxasDeConversaoCriar")
			public void taxasDeConversaoExcluirEmMassa() {
				taxasDeConversaoExcluirEmMassa = new TaxasDeConversaoExcluirEmMassa();
				taxasDeConversaoExcluirEmMassa.beforeClass();
				taxasDeConversaoExcluirEmMassa.login();
				taxasDeConversaoExcluirEmMassa.acessarMDR();
				taxasDeConversaoExcluirEmMassa.criar();
				taxasDeConversaoExcluirEmMassa.afterClass();
			}
			
			@Test(priority = 54, dependsOnMethods = "taxasDeConversaoCriar")
			public void taxasDeConversaoDetalhes() {
				taxasDeConversaoDetalhes = new TaxasDeConversaoDetalhes();
				taxasDeConversaoDetalhes.beforeClass();
				taxasDeConversaoDetalhes.login();
				taxasDeConversaoDetalhes.acessarMDR();
				taxasDeConversaoDetalhes.detalhes();
				taxasDeConversaoDetalhes.afterClass();
			}
			
			@Test(priority = 55, dependsOnMethods = "taxasDeConversaoCriar")
			public void taxasDeConversaoExcluir() {
				taxasDeConversaoExcluir = new TaxasDeConversaoExcluir();
				taxasDeConversaoExcluir.beforeClass();
				taxasDeConversaoExcluir.login();
				taxasDeConversaoExcluir.acessarMDR();
				taxasDeConversaoExcluir.excluir();
				taxasDeConversaoExcluir.afterClass();
				System.out.println("-------------------Taxas De Conversao Fim-------------------------");
				
			}
			
		//57
		//Thin Capitalization > Subcapitalizacao
			
			@Test(priority = 57)
			public void subcapitalizacaoCriar() {
				System.out.println("-------------------Thin Capitalization > Subcapitalizacao-------------------------");
				subcapitalizacaoCriar = new SubcapitalizacaoCriar();
				subcapitalizacaoCriar.beforeClass();
				subcapitalizacaoCriar.login();
				subcapitalizacaoCriar.acessarMDR();
				subcapitalizacaoCriar.criar();
				subcapitalizacaoCriar.afterClass();

			}
			
			@Test(priority = 58, dependsOnMethods = "subcapitalizacaoCriar")
			public void subcapitalizacaoEditar() {
				subcapitalizacaoEditar = new SubcapitalizacaoEditar();
				subcapitalizacaoEditar.beforeClass();
				subcapitalizacaoEditar.login();
				subcapitalizacaoEditar.acessarMDR();
				subcapitalizacaoEditar.editar();
				subcapitalizacaoEditar.afterClass();

			}
			
			@Test(priority = 59, dependsOnMethods = "subcapitalizacaoCriar")
			public void subcapitalizacaoExcluirEmMassa() {
				subcapitalizacaoExcluirEmMassa = new SubcapitalizacaoExcluirEmMassa();
				subcapitalizacaoExcluirEmMassa.beforeClass();
				subcapitalizacaoExcluirEmMassa.login();
				subcapitalizacaoExcluirEmMassa.acessarMDR();
				subcapitalizacaoExcluirEmMassa.criar();
				subcapitalizacaoExcluirEmMassa.afterClass();

			}
			
			@Test(priority = 60, dependsOnMethods = "subcapitalizacaoCriar")
			public void subcapitalizacaoExcluir() {
				subcapitalizacaoExcluir = new SubcapitalizacaoExcluir();
				subcapitalizacaoExcluir.beforeClass();
				subcapitalizacaoExcluir.login();
				subcapitalizacaoExcluir.acessarMDR();
				subcapitalizacaoExcluir.excluir();
				subcapitalizacaoExcluir.afterClass();
				System.out.println("-------------------Thin Capitalization > Subcapitalizacao Fim-------------------------");
				

			}
			/*
			//63
			//Tabela De Apoio E Social > Tabela 17 - Descricao De Nat De Les�o
			
			@Test(priority = 63)
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
			
			@Test(priority = 64)
			public void classificacaoTributariaCriar() {
				System.out.println("-------------------Tabela De Apoio E Social > Tabela 08 - Classificacao Tributaria-------------------------");
				classificacaoTributariaCriar = new ClassificacaoTributariaCriar();
				classificacaoTributariaCriar.beforeClass();
				classificacaoTributariaCriar.login();
				classificacaoTributariaCriar.acessarMDR();
				classificacaoTributariaCriar.criar();
				classificacaoTributariaCriar.afterClass();

			}
			
			
			@Test(priority = 65, dependsOnMethods = "classificacaoTributariaCriar")
			public void classificacaoTributariaEditar() {
				classificacaoTributariaEditar = new ClassificacaoTributariaEditar();
				classificacaoTributariaEditar.beforeClass();
				classificacaoTributariaEditar.login();
				classificacaoTributariaEditar.acessarMDR();
				classificacaoTributariaEditar.editar();
				classificacaoTributariaEditar.afterClass();

			}
			
			@Test(priority = 66, dependsOnMethods = "classificacaoTributariaCriar")
			public void classificacaoTributariaVisualizar() {
				classificacaoTributariaVisualizar = new ClassificacaoTributariaVisualizar();
				classificacaoTributariaVisualizar.beforeClass();
				classificacaoTributariaVisualizar.login();
				classificacaoTributariaVisualizar.acessarMDR();
				classificacaoTributariaVisualizar.Visualizar();
				classificacaoTributariaVisualizar.afterClass();

			}
			
			@Test(priority = 67, dependsOnMethods = "classificacaoTributariaCriar")
			public void classificacaoTributariaExcluirMassa() {
				classificacaoTributariaExcluirMassa = new ClassificacaoTributariaExcluirMassa();
				classificacaoTributariaExcluirMassa.beforeClass();
				classificacaoTributariaExcluirMassa.login();
				classificacaoTributariaExcluirMassa.acessarMDR();
				classificacaoTributariaExcluirMassa.criar();
				classificacaoTributariaExcluirMassa.afterClass();

			}
			
			@Test(priority = 68, dependsOnMethods = "classificacaoTributariaCriar")
			public void classificacaoTributariaExcluir() {
				classificacaoTributariaExcluir = new ClassificacaoTributariaExcluir();
				classificacaoTributariaExcluir.beforeClass();
				classificacaoTributariaExcluir.login();
				classificacaoTributariaExcluir.acessarMDR();
				classificacaoTributariaExcluir.excluir();
				classificacaoTributariaExcluir.afterClass();
				
				System.out.println("-------------------Tabela De Apoio E Social > Tabela 08 - Classificacao Tributaria Fim-------------------------");
				

			}
			
			//70
			//Tabela De Apoio E Social > Tabela 12 - Compatibilidade Entre Lota��o
			@Test(priority = 70)
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
			@Test(priority = 71)
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

			@Test(priority = 72)
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
			

			@Test(priority = 74)
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
			
			@Test(priority = 75)
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
			
			@Test(priority = 76)
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
			
			@Test(priority = 77)
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
			
			@Test(priority = 78)
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
			
			@Test(priority = 79)
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
			
			@Test(priority = 80)
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
			
			@Test(priority = 81)
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
			
			@Test(priority = 82)
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
			
			@Test(priority = 83)
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
			
			@Test(priority = 84)
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
			
			@Test(priority = 85)
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
			
			@Test(priority = 86)
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
		
			@Test(priority = 86)
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
			
			@Test(priority = 87)
			public void diagnosticoDeProcessosCriar() {
				System.out.println("-------------------Tabela De Apoio E Social > Diagnostico De Processos-------------------------");
				diagnosticoDeProcessosCriar = new DiagnosticoDeProcessosCriar();
				diagnosticoDeProcessosCriar.beforeClass();
				diagnosticoDeProcessosCriar.login();
				diagnosticoDeProcessosCriar.acessarMDR();
				diagnosticoDeProcessosCriar.criar();
				diagnosticoDeProcessosCriar.afterClass();
			}
			
			@Test(priority = 88, dependsOnMethods = "diagnosticoDeProcessosCriar")
			public void diagnosticoDeProcessosEditar() {
				diagnosticoDeProcessosEditar = new DiagnosticoDeProcessosEditar();
				diagnosticoDeProcessosEditar.beforeClass();
				diagnosticoDeProcessosEditar.login();
				diagnosticoDeProcessosEditar.acessarMDR();
				diagnosticoDeProcessosEditar.editar();
				diagnosticoDeProcessosEditar.afterClass();
			}
			
		
			@Test(priority = 89, dependsOnMethods = "diagnosticoDeProcessosCriar")
			public void diagnosticoDeProcessosVisualizar() {
				diagnosticoDeProcessosVisualizar = new DiagnosticoDeProcessosVisualizar();
				diagnosticoDeProcessosVisualizar.beforeClass();
				diagnosticoDeProcessosVisualizar.login();
				diagnosticoDeProcessosVisualizar.acessarMDR();
				diagnosticoDeProcessosVisualizar.Visualizar();
				diagnosticoDeProcessosVisualizar.afterClass();
			}
			
			@Test(priority = 90, dependsOnMethods = "diagnosticoDeProcessosCriar")
			public void diagnosticoDeProcessosExcluir() {
				diagnosticoDeProcessosExcluir = new DiagnosticoDeProcessosExcluir();
				diagnosticoDeProcessosExcluir.beforeClass();
				diagnosticoDeProcessosExcluir.login();
				diagnosticoDeProcessosExcluir.acessarMDR();
				diagnosticoDeProcessosExcluir.excluir();
				diagnosticoDeProcessosExcluir.afterClass();
			}
			
			@Test(priority = 91, dependsOnMethods = "diagnosticoDeProcessosCriar")
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
			@Test(priority = 92)	
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
			
			@Test(priority = 93)	
			public void codigoDeTreinamentoESimulacoesDeExerciciosCriar() {
				System.out.println("-------------------Tabela De Apoio E Social Tabela29 - Codigo De Treinamento E Simulacoes De Exercicios	-------------------------");
				codigoDeTreinamentoESimulacoesDeExerciciosCriar = new CodigoDeTreinamentoESimulacoesDeExerciciosCriar();
				codigoDeTreinamentoESimulacoesDeExerciciosCriar.beforeClass();
				codigoDeTreinamentoESimulacoesDeExerciciosCriar.login();
				codigoDeTreinamentoESimulacoesDeExerciciosCriar.acessarMDR();
				codigoDeTreinamentoESimulacoesDeExerciciosCriar.criar();
				codigoDeTreinamentoESimulacoesDeExerciciosCriar.afterClass();
			}
			
			@Test(priority = 94, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
			public void codigoDeTreinamentoESimulacoesDeExerciciosEditar() {
				codigoDeTreinamentoESimulacoesDeExerciciosEditar = new CodigoDeTreinamentoESimulacoesDeExerciciosEditar();
				codigoDeTreinamentoESimulacoesDeExerciciosEditar.beforeClass();
				codigoDeTreinamentoESimulacoesDeExerciciosEditar.login();
				codigoDeTreinamentoESimulacoesDeExerciciosEditar.acessarMDR();
				codigoDeTreinamentoESimulacoesDeExerciciosEditar.editar();
				codigoDeTreinamentoESimulacoesDeExerciciosEditar.afterClass();
			}
			
			@Test(priority = 95, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
			public void codigoDeTreinamentoESimulacoesDeExerciciosVisualizar() {
				codigoDeTreinamentoESimulacoesDeExerciciosVisualizar= new CodigoDeTreinamentoESimulacoesDeExerciciosVisualizar();
				codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.beforeClass();
				codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.login();
				codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.acessarMDR();
				codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.Visualizar();
				codigoDeTreinamentoESimulacoesDeExerciciosVisualizar.afterClass();
			}
			

			@Test(priority = 96, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
			public void codigoDeTreinamentoESimulacoesDeExerciciosExcluir() {
				codigoDeTreinamentoESimulacoesDeExerciciosExcluir= new CodigoDeTreinamentoESimulacoesDeExerciciosExcluir();
				codigoDeTreinamentoESimulacoesDeExerciciosExcluir.beforeClass();
				codigoDeTreinamentoESimulacoesDeExerciciosExcluir.login();
				codigoDeTreinamentoESimulacoesDeExerciciosExcluir.acessarMDR();
				codigoDeTreinamentoESimulacoesDeExerciciosExcluir.excluir();
				codigoDeTreinamentoESimulacoesDeExerciciosExcluir.afterClass();
			}

			@Test(priority = 96, dependsOnMethods = "codigoDeTreinamentoESimulacoesDeExerciciosCriar")	
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
			@Test(priority = 97)	
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
			
			@Test(priority = 98)	
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
			
			@Test(priority = 99)	
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
			
			@Test(priority = 100)	
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
			
			@Test(priority = 101)	
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
			
			@Test(priority = 102)	
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
			
			@Test(priority = 103)	
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
			
			@Test(priority = 104)	
			public void atividadeDeTributacaoXFornecedorCriar() {
				System.out.println("-------------------Atividades Para tributacao >Atividade De Tributacao X Fornecedor-------------------------");
				atividadeDeTributacaoXFornecedorCriar = new AtividadeDeTributacaoXFornecedorCriar();
				atividadeDeTributacaoXFornecedorCriar.beforeClass();
				atividadeDeTributacaoXFornecedorCriar.login();
				atividadeDeTributacaoXFornecedorCriar.acessarMDR();
				atividadeDeTributacaoXFornecedorCriar.criar();
				atividadeDeTributacaoXFornecedorCriar.afterClass();
			}
			
			@Test(priority = 105, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
			public void atividadeDeTributacaoXFornecedorFiltroID() {
				atividadeDeTributacaoXFornecedorFiltroID = new AtividadeDeTributacaoXFornecedorFiltroID();
				atividadeDeTributacaoXFornecedorFiltroID.beforeClass();
				atividadeDeTributacaoXFornecedorFiltroID.login();
				atividadeDeTributacaoXFornecedorFiltroID.acessarMDR();
				atividadeDeTributacaoXFornecedorFiltroID.filtro();
				atividadeDeTributacaoXFornecedorFiltroID.afterClass();
			}
			
			@Test(priority = 106, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
			public void atividadeDeTributacaoXFornecedorDetalhes() {
				atividadeDeTributacaoXFornecedorDetalhes = new AtividadeDeTributacaoXFornecedorDetalhes();
				atividadeDeTributacaoXFornecedorDetalhes.beforeClass();
				atividadeDeTributacaoXFornecedorDetalhes.login();
				atividadeDeTributacaoXFornecedorDetalhes.acessarMDR();
				atividadeDeTributacaoXFornecedorDetalhes.Detalhes();
				atividadeDeTributacaoXFornecedorDetalhes.afterClass();
			}
			
			@Test(priority = 107, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
			public void atividadeDeTributacaoXFornecedorVisualizar() {
				atividadeDeTributacaoXFornecedorVisualizar = new AtividadeDeTributacaoXFornecedorVisualizar();
				atividadeDeTributacaoXFornecedorVisualizar.beforeClass();
				atividadeDeTributacaoXFornecedorVisualizar.login();
				atividadeDeTributacaoXFornecedorVisualizar.acessarMDR();
				atividadeDeTributacaoXFornecedorVisualizar.Visualizar();
				atividadeDeTributacaoXFornecedorVisualizar.afterClass();
			}
			
			@Test(priority = 108, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
			public void atividadeDeTributacaoXFornecedorEditar() {
				atividadeDeTributacaoXFornecedorEditar = new AtividadeDeTributacaoXFornecedorEditar();
				atividadeDeTributacaoXFornecedorEditar.beforeClass();
				atividadeDeTributacaoXFornecedorEditar.login();
				atividadeDeTributacaoXFornecedorEditar.acessarMDR();
				atividadeDeTributacaoXFornecedorEditar.editar();
				atividadeDeTributacaoXFornecedorEditar.afterClass();
			}
			
			
			
			
			@Test(priority = 109, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
			public void atividadeDeTributacaoXFornecedorExcluir() {
				atividadeDeTributacaoXFornecedorExcluir = new AtividadeDeTributacaoXFornecedorExcluir();
				atividadeDeTributacaoXFornecedorExcluir.beforeClass();
				atividadeDeTributacaoXFornecedorExcluir.login();
				atividadeDeTributacaoXFornecedorExcluir.acessarMDR();
				atividadeDeTributacaoXFornecedorExcluir.excluir();
				atividadeDeTributacaoXFornecedorExcluir.afterClass();
			}
			
			@Test(priority = 110, dependsOnMethods = "atividadeDeTributacaoXFornecedorCriar")	
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
			
			
			
			@Test(priority = 111)
			public void sgdpCriar() {
				System.out.println("-------------------Tabela De Apoio E Social > Tabela 16  - SGDP-------------------------");
				sgdpCriar = new SGDPCriar();
				sgdpCriar.beforeClass();
				sgdpCriar.login();
				sgdpCriar.acessarMDR();
				sgdpCriar.criar();
				sgdpCriar.afterClass();

			}
			
			
			@Test(priority = 112, dependsOnMethods = "sgdpCriar")
			public void sgdpEditar() {
				sgdpEditar = new SGDPEditar();
				sgdpEditar.beforeClass();
				sgdpEditar.login();
				sgdpEditar.acessarMDR();
				sgdpEditar.editar();
				sgdpEditar.afterClass();

			}
			
			
			@Test(priority = 113, dependsOnMethods = "sgdpCriar")
			public void sgdpVisualizar() {
				sgdpVisualizar = new SGDPVisualizar();
				sgdpVisualizar.beforeClass();
				sgdpVisualizar.login();
				sgdpVisualizar.acessarMDR();
				sgdpVisualizar.visualizar();
				sgdpVisualizar.afterClass();

			}
			@Test(priority = 114, dependsOnMethods = "sgdpCriar")
			public void sgdpExcluir() {
				sGDPExcluir = new SGDPExcluir();
				sGDPExcluir.beforeClass();
				sGDPExcluir.login();
				sGDPExcluir.acessarMDR();
				sGDPExcluir.excluir();
				sGDPExcluir.afterClass();

			}
			
			@Test(priority = 115, dependsOnMethods = "sgdpCriar")
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
			@Test(priority = 116)
			public void statusParaBancoInd�bitosCriar() {
				System.out.println("-------------------Controle de Cr�dito Tribut�rio > Status para Banco de Ind�bitos-------------------------");
				StatusParaBancoInd�bitosCriar = new statusParaBancoInd�bitosCriar();
				StatusParaBancoInd�bitosCriar.beforeClass();
				StatusParaBancoInd�bitosCriar.login();
				StatusParaBancoInd�bitosCriar.acessarMDR();
				StatusParaBancoInd�bitosCriar.criar();
				StatusParaBancoInd�bitosCriar.afterClass();
			}
			@Test(priority = 117, dependsOnMethods = "statusParaBancoInd�bitosCriar")
			public void StatusParaBancoInd�bitosEditar() {
				
				statusParaBancoInd�bitosEditar = new StatusParaBancoInd�bitosEditar();
				statusParaBancoInd�bitosEditar.beforeClass();
				statusParaBancoInd�bitosEditar.login();
				statusParaBancoInd�bitosEditar.acessarMDR();
				statusParaBancoInd�bitosEditar.editar();
				statusParaBancoInd�bitosEditar.afterClass();
			}
			@Test(priority = 118, dependsOnMethods = "statusParaBancoInd�bitosCriar")
			public void StatusParaBancoInd�bitosVisualizar() {
				
				statusParaBancoInd�bitosVisualizar = new StatusParaBancoInd�bitosVisualizar();
				statusParaBancoInd�bitosVisualizar.beforeClass();
				statusParaBancoInd�bitosVisualizar.login();
				statusParaBancoInd�bitosVisualizar.acessarMDR();
				statusParaBancoInd�bitosVisualizar.visualizar();
				statusParaBancoInd�bitosVisualizar.afterClass();
			}
			@Test(priority = 119, dependsOnMethods = "statusParaBancoInd�bitosCriar")
			public void StatusParaBancoInd�bitosExcluir() {
				
				statusParaBancoInd�bitosExcluir = new StatusParaBancoInd�bitosExcluir();
				statusParaBancoInd�bitosExcluir.beforeClass();
				statusParaBancoInd�bitosExcluir.login();
				statusParaBancoInd�bitosExcluir.acessarMDR();
				statusParaBancoInd�bitosExcluir.excluir();
				statusParaBancoInd�bitosExcluir.afterClass();
			}
			@Test(priority = 120, dependsOnMethods = "statusParaBancoInd�bitosCriar")
			public void StatusParaBancoInd�bitosExcluirMassa() {
				
				statusParaBancoInd�bitosExcluirMassa = new StatusParaBancoInd�bitosExcluirMassa();
				statusParaBancoInd�bitosExcluirMassa.beforeClass();
				statusParaBancoInd�bitosExcluirMassa.login();
				statusParaBancoInd�bitosExcluirMassa.acessarMDR();
				statusParaBancoInd�bitosExcluirMassa.criar();
				statusParaBancoInd�bitosExcluirMassa.afterClass();
				System.out.println("-------------------Controle de Cr�dito Tribut�rio > Status para Banco de Ind�bitos Fim-------------------------");
			}*/
			
		 

}
