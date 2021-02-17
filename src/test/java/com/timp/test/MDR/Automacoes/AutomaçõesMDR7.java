package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;


import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoDetalhes;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoEditar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoVisualizar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeExcluirMassa;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluir;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluirMassa;
import com.timp.test.MDR.CEP.Bairro.BairroCriar;
import com.timp.test.MDR.CEP.Bairro.BairroExcluirMassa;
import com.timp.test.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF.TabelaDeApoioECFCriar;
import com.timp.test.MDR.CenariosCorrecao.CenariosCorrecaoExcluirMassa;
import com.timp.test.MDR.Centralizacao.Tributos.TributosFiltrar;
import com.sap.timp.pageObjectModel.MDR.ContasEspeciaisIRPJCSLL.ContasEspeciaisIRPJCSLLCriarPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPCriarPO;
import com.timp.test.MDR.ContasEspeciaisIRPJCSLL.ContasEspeciaisIRPJCSLL;
import com.timp.test.MDR.EventosESocial.S1070ProcessosAdmJudiciais.S1070ProcessosAdmJudiciaisCriar;
import com.timp.test.MDR.EventosESocial.S1070ProcessosAdmJudiciais.S1070ProcessosAdmJudiciaisEditar;
import com.timp.test.MDR.EventosESocial.S1070ProcessosAdmJudiciais.S1070ProcessosAdmJudiciaisExluir;
import com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoCriar;
import com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoDetalhe;
import com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoEditar;
import com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoExcluir;
import com.timp.test.MDR.EventosESocial.S1270ContrataçãDeTrabalhadoresAvulsosNãoPortuários.ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar;
import com.timp.test.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho.S2210ComunicaçãoDeAcidenteDeTrabalhoCriar;
import com.timp.test.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho.S2210ComunicaçãoDeAcidenteDeTrabalhoEditar;
import com.timp.test.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho.S2210ComunicaçãoDeAcidenteDeTrabalhoExcluir;
import com.timp.test.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho.S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriar;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluir;
import com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialEditar;
import com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialVisualizar;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIICriar;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIDetalhe;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoExcluirMassa;
import com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensCriar;
import com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensDetalhes;
import com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensEditar;
import com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensExcluir;
import com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensExcluirMassa;
import com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensFiltrosId;
import com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensVisualizar;
import com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXExcluirMassas;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXExcluirMassa;
import com.timp.test.MDR.RateiroConsorcio.RateiroConsorcio;
import com.timp.test.MDR.RegistroDeExportaçao.RegistroDeExportaçaoExcluirMassa;
import com.timp.test.MDR.RegistroECAC.RegistroECACExcluirMassa;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoExcluirMassa;
import com.timp.test.MDR.Siscoserv.NBS.NBSExcluirMassa;
import com.timp.test.MDR.TabelaApoioECD.BalançoConsolidado.BalançoConsolidadoEditar;
import com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisCriar;
import com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisDetalhe;
import com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisEditar;
import com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisExluir;
import com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisFiltrar;
import com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisVisualizar;
import com.timp.test.MDR.TabelaApoioECD.DeXParaContraPartida.DeXParaContraPartidaExcluirEmMassa;
import com.timp.test.MDR.TabelaApoioECD.FatosContabeis.FatosContabeisFiltrar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasExluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela16.SGDPExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBeneficiosEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenefíciosCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenefíciosCriarExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenefíciosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenefíciosVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFODetalhe;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFOPEditar;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFOPFiltrosAvancados;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFOVisualizar;

import com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPIExcluirMassa;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçoesCreditosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.LogradouroExcluirMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluirMassa;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoCriar;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoEditar;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluir;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetalle;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizar;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluirEmMassa;


public class AutomaçõesMDR7 {	
	// Atividades fiscais >	Associação de Atividades Fiscais
	AssociaçãoCriar associaçãoCriar;
	AssociaçãoEditar associaçãoEditar;
	AssociaçãoDetalhes associaçãoDetalhes;
	AssociaçãoVisualizar associaçãoVisualizar;
	
	// Cadastros IRPJ/CSLL > Tabela de Apoio ECF
	TabelaDeApoioECFCriar tabelaDeApoioECFCriar;

	// Eventos e-Social > S1070 - Processos Adm. / Judiciais
	S1070ProcessosAdmJudiciaisCriar s1070ProcessosAdmJudiciaisCriar;
	S1070ProcessosAdmJudiciaisEditar s1070ProcessosAdmJudiciaisEditar;
	S1070ProcessosAdmJudiciaisExluir s1070ProcessosAdmJudiciaisExluir;
	
	// Eventos e-Social >  S1210 - Pagamentos de Rendimentos do Trabalho
	S1210PagamentosDeRendimientosDoTrabalhoCriar s1210PagamentosDeRendimientosDoTrabalhoCriar;
	S1210PagamentosDeRendimientosDoTrabalhoEditar s1210PagamentosDeRendimientosDoTrabalhoCEditar;
	S1210PagamentosDeRendimientosDoTrabalhoExcluir s1210PagamentosDeRendimientosDoTrabalhoExcluir;
	S1210PagamentosDeRendimientosDoTrabalhoDetalhe s1210PagamentosDeRendimientosDoTrabalhoDetalhe;
	
	// Eventos e-Social > S2210 – Comunicação de Acidente de Trabalho
	S2210ComunicaçãoDeAcidenteDeTrabalhoCriar s2210ComunicaçãoDeAcidenteDeTrabalhoCriar;
	S2210ComunicaçãoDeAcidenteDeTrabalhoEditar s2210ComunicaçãoDeAcidenteDeTrabalhoEditar;
	S2210ComunicaçãoDeAcidenteDeTrabalhoExcluir s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir;
	S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID;
	
	// Eventos e-Social > S1270 - Contratação de Trabalhadores Avulsos Não Portuários
	ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar;
	
	//Livros Fiscais > Parametrização do livro oficial
	LivrosFiscaisCriar livrosFiscaisCriar;
	LivrosFiscaisExcluir livrosFiscaisExcluir;

	
	// Parametros de Contabilização	> Contas Default para Extemporâneo
	ContasDefaultParaExtemporaneoExcluirMassa contasDefaultParaExtemporaneoExcluirMassa;
	
	// Parâmetros para Envio de Mensagens
	ParâmetrosParaEnvioDeMensagensCriar parâmetrosParaEnvioDeMensagensCriar;
	ParâmetrosParaEnvioDeMensagensEditar parâmetrosParaEnvioDeMensagensEditar;
	ParâmetrosParaEnvioDeMensagensExcluir parâmetrosParaEnvioDeMensagensExcluir;
	ParâmetrosParaEnvioDeMensagensExcluirMassa parâmetrosParaEnvioDeMensagensExcluirMassa;
	ParâmetrosParaEnvioDeMensagensDetalhes parâmetrosParaEnvioDeMensagensDetalhes;
	ParâmetrosParaEnvioDeMensagensVisualizar parâmetrosParaEnvioDeMensagensVisualizar;
	ParâmetrosParaEnvioDeMensagensFiltrosId parâmetrosParaEnvioDeMensagensFiltrosId;
	
	// Preço de Transferência > Valores para Método / Valores para Método PVEX
	ValoresParaMetodoPVEXExcluirMassa valoresParaMetodoPVEXExcluirMassa;
	
	// Preço de Transferência >	Valores para Método / Valores para Método PECEX
	ValoresParaMetodoPECEXExcluirMassas valoresParaMetodoPECEXExcluirMassas;
	
	// Siscoserv > Enquadramento
	EnquadramentoExcluirMassa enquadramentoExcluirMassa;
	
	// Tabela de Apoio do SPED	> 4.2.2 CFOP
	CFODetalhe cFODetalhe;
	CFOPEditar CFOPEditar;
	CFOVisualizar cFOVisualizar;
	CFOPFiltrosAvancados cFOPFiltrosAvancados;
	
	
	// Tabela de Apoio do SPED	4.5.5 Classificação de Contribuintes do IPI
	ClassificaçaoDeContribuintesDoIPIExcluirMassa classificaçaoDeContribuintesDoIPIExcluirMassa;
	
	// Tabela de Apoio ECD	> Código dos Fatos Contábeis
	CodigoFatosContabeisCriar codigoFatosContabeisCriar;
	CodigoFatosContabeisEditar codigoFatosContabeisEditar;
	CodigoFatosContabeisExluir codigoFatosContabeisExluir;
	CodigoFatosContabeisDetalhe codigoFatosContabeisDetalhe;
	CodigoFatosContabeisFiltrar codigoFatosContabeisFiltrar;
	CodigoFatosContabeisVisualizar codigoFatosContabeisVisualizar;
	
	// Tabela de Apoio ECD > Fatos Contábeis
	FatosContabeisFiltrar fatosContabeisFiltrar;
	// Tabela de Apoio ECD > DeXParaContraPartida
	DeXParaContraPartidaExcluirEmMassa deXParaContraPartidaExcluirEmMassa;
	// Tabela de Apoio ECD	> Balanço Consolidado
	BalançoConsolidadoEditar balançoConsolidadoEditar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 11 - Compatibilidade en Cat. Trab.
	CompatibilidadeEnCatTrabExcluir compatibilidadeEnCatTrabExcluir;
	CompatibilidadeEnCatTrabVisualizar compatibilidadeEnCatTrabVisualizar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 17 - Descrição de Nat. de Lesão
	DescriçãoDeNatDeLesãoCriar descriçãoDeNatDeLesãoCriar;
	DescriçãoDeNatDeLesãoEditar descriçãoDeNatDeLesãoEditar;
	DescriçãoDeNatDeLesãoExcluir descriçãoDeNatDeLesãoExcluir;
	DescriçãoDeNatDeLesãoVisualizar descriçãoDeNatDeLesãoVisualizar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benefícios
	TiposDeBenefíciosCriar tiposDeBenefíciosCriar;
	TiposDeBeneficiosEditar tiposDeBeneficiosEditar;
	TiposDeBenefíciosExcluir tiposDeBenefíciosExcluir;
	TiposDeBenefíciosCriarExcluirMassa tiposDeBenefíciosCriarExcluirMassa;
	TiposDeBenefíciosVisualizar tiposDeBenefíciosVisualizar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benefícios
	MotivosCesBeneficiosCriar motivosCesBeneficiosCriar;
	MotivosCesBeneficiosEditar motivosCesBeneficiosEditar;
	MotivosCesBeneficiosExcluir motivosCesBeneficiosExcluir;
	MotivosCesBeneficiosExcluirMassa motivosCesBeneficiosExcluirMassa;
	MotivosCesBeneficiosVisualizar motivosCesBeneficiosVisualizar;
	
	// Taxas de Atualização	> Configuração de Tipo Taxa de Atualização
	ConfiguraçãDeTipoTaxaDeAtualizaçãoCriar configuraçãDeTipoTaxaDeAtualizaçãoCriar;
	ConfiguraçãDeTipoTaxaDeAtualizaçãoEditar configuraçãDeTipoTaxaDeAtualizaçãoEditar;	
	ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluir configuraçãDeTipoTaxaDeAtualizaçãoExcluir;
	ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizar  configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar;
	ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetalle  configuraçãoDeTipoTaxaDeAtualizaçãoDetalle;
	ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa;
	
	
	//Contas Especiais IRPJ/CSLL
	ContasEspeciaisIRPJCSLL  contasEspeciaisIRPJCSLL;
	
	// Rateiro Consorcio
	RateiroConsorcio  rateiroConsorcio;
	
	//Tabela de Apoio do SPED > CFOP
	
	// -----------------------------------------------------------------------------------------
	
	// Atividades fiscais >	Associação de Atividades Fiscais

	@Test(priority = 0)
	public void associaçãoCriar() {

		System.out.println("-------------------Atividades fiscais >	Associação de Atividades Fiscais-------------------------");

		associaçãoCriar = new AssociaçãoCriar();
		associaçãoCriar.beforeClass();
	//	associaçãoCriar.login();
	//	associaçãoCriar.acessarMDR();
		associaçãoCriar.criarAssociação();
		associaçãoCriar.afterClass();

	}

	@Test(priority = 1,dependsOnMethods = "associaçãoCriar")
	public void associaçãoEditar() {

		associaçãoEditar = new AssociaçãoEditar();
		associaçãoEditar.beforeClass();
		//associaçãoEditar.login();
		//associaçãoEditar.acessarMDR();
		associaçãoEditar.editarAssociação();
		associaçãoEditar.afterClass();

	}

	@Test(priority = 2,dependsOnMethods = "associaçãoCriar")
	public void associaçãoDetalhe() {

		associaçãoDetalhes = new AssociaçãoDetalhes();
		associaçãoDetalhes.beforeClass();
	//	associaçãoDetalhes.ingresar();
	//	associaçãoDetalhes.mdrEntrar();
		associaçãoDetalhes.detalheAssociação();
		associaçãoDetalhes.afterClass();

	}

	@Test(priority = 3,dependsOnMethods = "associaçãoCriar")
	public void associaçãoVisualizar() {

		associaçãoVisualizar = new AssociaçãoVisualizar();
		associaçãoVisualizar.beforeClass();
	//	associaçãoVisualizar.ingresar();
		//associaçãoVisualizar.mdrEntrar();
		associaçãoVisualizar.visualizarAssociação();
		associaçãoVisualizar.afterClass();
		
		System.out.println("-------------------Atividade Fiscal > Atividade Fiscal Fin-------------------------");
	}
	
	// Cadastros IRPJ/CSLL > Tabela de Apoio ECF
	
	@Test(priority = 4)
	public void tabelaDeApoioECFCriar() {
		System.out.println("-------------------Cadastros IRPJ/CSLL > Tabela de Apoio ECF-------------------------");
		
		tabelaDeApoioECFCriar = new TabelaDeApoioECFCriar();
		tabelaDeApoioECFCriar.beforeClass();

		tabelaDeApoioECFCriar.criar();
		tabelaDeApoioECFCriar.afterClass();		
	}
	
	// Eventos e-Social > S1070 - Processos Adm. / Judiciais
	
	@Test(priority = 5)
	public void s1070ProcessosAdmJudiciaisCriar() {
		System.out.println("-------------------Eventos e-Social > S1070 - Processos Adm. / Judiciais-------------------------");

		s1070ProcessosAdmJudiciaisCriar = new S1070ProcessosAdmJudiciaisCriar();
		s1070ProcessosAdmJudiciaisCriar.beforeClass();

		s1070ProcessosAdmJudiciaisCriar.criar();
		s1070ProcessosAdmJudiciaisCriar.afterClass();		
	}
	
	@Test(priority = 6,dependsOnMethods = "s1070ProcessosAdmJudiciaisCriar")
	public void s1070ProcessosAdmJudiciaisEditar() {
		System.out.println("-------------------Eventos e-Social > S1070 - Processos Adm. / Judiciais-------------------------");

		s1070ProcessosAdmJudiciaisEditar = new S1070ProcessosAdmJudiciaisEditar();
		s1070ProcessosAdmJudiciaisEditar.beforeClass();

		s1070ProcessosAdmJudiciaisEditar.editar();
		s1070ProcessosAdmJudiciaisEditar.afterClass();		
	}
	
	@Test(priority = 7,dependsOnMethods = "s1070ProcessosAdmJudiciaisCriar")
	public void s1070ProcessosAdmJudiciaisExcluir() {
		System.out.println("-------------------Eventos e-Social > S1070 - Processos Adm. / Judiciais-------------------------");

		s1070ProcessosAdmJudiciaisExluir = new S1070ProcessosAdmJudiciaisExluir();
		s1070ProcessosAdmJudiciaisExluir.beforeClass();

		s1070ProcessosAdmJudiciaisExluir.excluir();
		s1070ProcessosAdmJudiciaisExluir.afterClass();		
		
		System.out.println("-------------------Eventos e-Social > S1070 - Processos Adm. / Judiciais FIN-------------------------");
	}
	
	// Eventos e-Social >  S1210 - Pagamentos de Rendimentos do Trabalho
	
	@Test(priority = 8)
	public void s1210PagamentosDeRendimientosDoTrabalhoCriar() {
		System.out.println("-------------------Eventos e-Social > S1070 - S1210 - Pagamentos de Rendimentos do Trabalho-------------------------");

		s1210PagamentosDeRendimientosDoTrabalhoCriar = new S1210PagamentosDeRendimientosDoTrabalhoCriar();
		s1210PagamentosDeRendimientosDoTrabalhoCriar.beforeClass();
		s1210PagamentosDeRendimientosDoTrabalhoCriar.ingresar();
		s1210PagamentosDeRendimientosDoTrabalhoCriar.ingresarMDR();
		s1210PagamentosDeRendimientosDoTrabalhoCriar.criar();
		s1210PagamentosDeRendimientosDoTrabalhoCriar.afterClass();		
	}
	
	@Test(priority = 9,dependsOnMethods = "s1210PagamentosDeRendimientosDoTrabalhoCriar")
	public void s1210PagamentosDeRendimientosDoTrabalhoEditar() {
		s1210PagamentosDeRendimientosDoTrabalhoCEditar = new S1210PagamentosDeRendimientosDoTrabalhoEditar();
		s1210PagamentosDeRendimientosDoTrabalhoCEditar.beforeClass();
		s1210PagamentosDeRendimientosDoTrabalhoCEditar.ingresar();
		s1210PagamentosDeRendimientosDoTrabalhoCEditar.ingresarMDR();
		s1210PagamentosDeRendimientosDoTrabalhoCEditar.editar();
		s1210PagamentosDeRendimientosDoTrabalhoCEditar.afterClass();		
	}
	
	@Test(priority = 10,dependsOnMethods = "s1210PagamentosDeRendimientosDoTrabalhoCriar")
	public void s1210PagamentosDeRendimientosDoTrabalhoExcluir() {
		s1210PagamentosDeRendimientosDoTrabalhoExcluir = new S1210PagamentosDeRendimientosDoTrabalhoExcluir();
		s1210PagamentosDeRendimientosDoTrabalhoExcluir.beforeClass();
		s1210PagamentosDeRendimientosDoTrabalhoExcluir.ingresar();
		s1210PagamentosDeRendimientosDoTrabalhoExcluir.ingresarMDR();
		s1210PagamentosDeRendimientosDoTrabalhoExcluir.excluir();
		s1210PagamentosDeRendimientosDoTrabalhoExcluir.afterClass();		
	}
	
	@Test(priority = 11,dependsOnMethods = "s1210PagamentosDeRendimientosDoTrabalhoCriar")
	public void s1210PagamentosDeRendimientosDoTrabalhoDetalhe() {
		s1210PagamentosDeRendimientosDoTrabalhoDetalhe = new S1210PagamentosDeRendimientosDoTrabalhoDetalhe();
		s1210PagamentosDeRendimientosDoTrabalhoDetalhe.beforeClass();
		s1210PagamentosDeRendimientosDoTrabalhoDetalhe.ingresar();
		s1210PagamentosDeRendimientosDoTrabalhoDetalhe.ingresarMDR();
		s1210PagamentosDeRendimientosDoTrabalhoDetalhe.detalhe();
		s1210PagamentosDeRendimientosDoTrabalhoDetalhe.afterClass();		
		
		System.out.println("-------------------Eventos e-Social > S1070 - S1210 - Pagamentos de Rendimentos do Trabalho FIN-------------------------");
	}
	
	// Eventos e-Social > S2210 – Comunicação de Acidente de Trabalho

	@Test(priority = 12)
	public void s2210ComunicaçãoDeAcidenteDeTrabalhoCriar() {
		System.out.println("-------------------Eventos e-Social > S2210 – Comunicação de Acidente de Trabalho -------------------------");

		s2210ComunicaçãoDeAcidenteDeTrabalhoCriar = new S2210ComunicaçãoDeAcidenteDeTrabalhoCriar();
		s2210ComunicaçãoDeAcidenteDeTrabalhoCriar.beforeClass();
		s2210ComunicaçãoDeAcidenteDeTrabalhoCriar.ingresar();
		s2210ComunicaçãoDeAcidenteDeTrabalhoCriar.ingresarMDR();
		s2210ComunicaçãoDeAcidenteDeTrabalhoCriar.criar();
		s2210ComunicaçãoDeAcidenteDeTrabalhoCriar.afterClass();		
	}
	
	@Test(priority = 13,dependsOnMethods = "s2210ComunicaçãoDeAcidenteDeTrabalhoCriar")
	public void s2210ComunicaçãoDeAcidenteDeTrabalhoEditar() {
		s2210ComunicaçãoDeAcidenteDeTrabalhoEditar = new S2210ComunicaçãoDeAcidenteDeTrabalhoEditar();
		s2210ComunicaçãoDeAcidenteDeTrabalhoEditar.beforeClass();
		s2210ComunicaçãoDeAcidenteDeTrabalhoEditar.ingresar();
		s2210ComunicaçãoDeAcidenteDeTrabalhoEditar.ingresarMDR();
		s2210ComunicaçãoDeAcidenteDeTrabalhoEditar.editar();
		s2210ComunicaçãoDeAcidenteDeTrabalhoEditar.afterClass();		
	}
	
	@Test(priority = 14,dependsOnMethods = "s2210ComunicaçãoDeAcidenteDeTrabalhoCriar")
	public void s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID() {
		s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID = new S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID();
		s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID.beforeClass();
		s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID.login();
		s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID.acessarMDR();
		s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID.filtro();
		s2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID.afterClass();		
	}
	
	@Test(priority = 15,dependsOnMethods = "s2210ComunicaçãoDeAcidenteDeTrabalhoCriar")
	public void s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir() {
		s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir = new S2210ComunicaçãoDeAcidenteDeTrabalhoExcluir();
		s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir.beforeClass();
		s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir.ingresar();
		s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir.ingresarMDR();
		s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir.excluir();
		s2210ComunicaçãoDeAcidenteDeTrabalhoExcluir.afterClass();		
		
		System.out.println("-------------------Eventos e-Social > S2210 – Comunicação de Acidente de Trabalho FIN -------------------------");
	}
	
	// 15 Filtro por ID
	
	// Eventos e-Social > S1270 - Contratação de Trabalhadores Avulsos Não Portuários

	@Test(priority = 16)
	public void contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar() {
		System.out.println("-------------------Eventos e-Social > S1270 - Contratação de Trabalhadores Avulsos Não Portuários -------------------------");

		contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar = new ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar.beforeClass();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar.ingresar();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar.ingresarMDR();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar.criar();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar.afterClass();		
	}
	
	// Livros Fiscais > Parametrização do livro oficial
	
	@Test(priority = 17)
	public void livrosFiscaisCriar() {
		System.out.println("-------------------Livros Fiscais > Parametrização do livro oficial -------------------------");

		livrosFiscaisCriar = new LivrosFiscaisCriar();
		livrosFiscaisCriar.beforeClass();
		//livrosFiscaisCriar.login();
		//livrosFiscaisCriar.acessarMDR();
		livrosFiscaisCriar.criar();
		livrosFiscaisCriar.afterClass();		
	}
	
	
	
	@Test(priority = 20,dependsOnMethods = "livrosFiscaisCriar")
	public void livrosFiscaisExcluir() {
		livrosFiscaisExcluir = new LivrosFiscaisExcluir();
		livrosFiscaisExcluir.beforeClass();
		//livrosFiscaisExcluir.login();
		//livrosFiscaisExcluir.acessarMDR();
		livrosFiscaisExcluir.excluir();
		livrosFiscaisExcluir.afterClass();		
	}
	
	// 19 - 20
	
	// Parametros de Contabilização	> Contas Default para Extemporâneo
	// 21 - 26
	
	@Test(priority = 27)
	public void contasDefaultParaExtemporaneoExcluirMassa() {
		System.out.println("-------------------Parametros de Contabilização	> Contas Default para Extemporâneo -------------------------");
		contasDefaultParaExtemporaneoExcluirMassa = new ContasDefaultParaExtemporaneoExcluirMassa();
		contasDefaultParaExtemporaneoExcluirMassa.beforeClass();
		//contasDefaultParaExtemporaneoExcluirMassa.login();
		//contasDefaultParaExtemporaneoExcluirMassa.acessarMDR();
		contasDefaultParaExtemporaneoExcluirMassa.criar();
		contasDefaultParaExtemporaneoExcluirMassa.excluirMassa();
		contasDefaultParaExtemporaneoExcluirMassa.afterClass();		
	}
	
	// Parâmetros para Envio de Mensagens
	
	@Test(priority = 28)
	public void parâmetrosParaEnvioDeMensagensCriar() {
		System.out.println("-------------------Parâmetros para Envio de Mensagens -------------------------");
		parâmetrosParaEnvioDeMensagensCriar = new ParâmetrosParaEnvioDeMensagensCriar();
		parâmetrosParaEnvioDeMensagensCriar.beforeClass();
		//parâmetrosParaEnvioDeMensagensCriar.ingresar();
		//parâmetrosParaEnvioDeMensagensCriar.ingresarMDR();
		parâmetrosParaEnvioDeMensagensCriar.criar();
		parâmetrosParaEnvioDeMensagensCriar.afterClass();		
	}
	
	@Test(priority = 29,dependsOnMethods = "parâmetrosParaEnvioDeMensagensCriar")
	public void parâmetrosParaEnvioDeMensagensEditar() {
		parâmetrosParaEnvioDeMensagensEditar = new ParâmetrosParaEnvioDeMensagensEditar();
		parâmetrosParaEnvioDeMensagensEditar.beforeClass();
		//parâmetrosParaEnvioDeMensagensEditar.ingresar();
		//parâmetrosParaEnvioDeMensagensEditar.ingresarMDR();
		parâmetrosParaEnvioDeMensagensEditar.editar();
		parâmetrosParaEnvioDeMensagensEditar.afterClass();		
	}
	
	@Test(priority = 29,dependsOnMethods = "parâmetrosParaEnvioDeMensagensCriar")
	public void parâmetrosParaEnvioDeMensagensFiltrosId() {
		parâmetrosParaEnvioDeMensagensFiltrosId = new ParâmetrosParaEnvioDeMensagensFiltrosId();
		parâmetrosParaEnvioDeMensagensFiltrosId.beforeClass();
		//parâmetrosParaEnvioDeMensagensFiltrosId.login();
		//parâmetrosParaEnvioDeMensagensFiltrosId.acessarMDR();
		parâmetrosParaEnvioDeMensagensFiltrosId.filtros();
		parâmetrosParaEnvioDeMensagensFiltrosId.afterClass();		
	}
	@Test(priority = 30,dependsOnMethods = "parâmetrosParaEnvioDeMensagensCriar")
	public void parâmetrosParaEnvioDeMensagensDetalhe() {
		parâmetrosParaEnvioDeMensagensDetalhes = new ParâmetrosParaEnvioDeMensagensDetalhes();
		parâmetrosParaEnvioDeMensagensDetalhes.beforeClass();
		////parâmetrosParaEnvioDeMensagensDetalhes.ingresar();
		//parâmetrosParaEnvioDeMensagensDetalhes.ingresarMDR();
		parâmetrosParaEnvioDeMensagensDetalhes.detalhes();
		parâmetrosParaEnvioDeMensagensDetalhes.afterClass();		
	}
	
	@Test(priority = 31,dependsOnMethods = "parâmetrosParaEnvioDeMensagensCriar")
	public void parâmetrosParaEnvioDeMensagensVisualizar() {
		parâmetrosParaEnvioDeMensagensVisualizar = new ParâmetrosParaEnvioDeMensagensVisualizar();
		parâmetrosParaEnvioDeMensagensVisualizar.beforeClass();
		//parâmetrosParaEnvioDeMensagensVisualizar.ingresar();
		//parâmetrosParaEnvioDeMensagensVisualizar.ingresarMDR();
		parâmetrosParaEnvioDeMensagensVisualizar.visualizar();
		parâmetrosParaEnvioDeMensagensVisualizar.afterClass();		
	}
	
	@Test(priority = 32,dependsOnMethods = "parâmetrosParaEnvioDeMensagensCriar")
	public void parâmetrosParaEnvioDeMensagensExcluir() {
		parâmetrosParaEnvioDeMensagensExcluir = new ParâmetrosParaEnvioDeMensagensExcluir();
		parâmetrosParaEnvioDeMensagensExcluir.beforeClass();
		//parâmetrosParaEnvioDeMensagensExcluir.ingresar();
		//parâmetrosParaEnvioDeMensagensExcluir.ingresarMDR();
		parâmetrosParaEnvioDeMensagensExcluir.excluir();
		parâmetrosParaEnvioDeMensagensExcluir.afterClass();		
	}
	
	@Test(priority = 33)
	public void parâmetrosParaEnvioDeMensagensExcluirMassa() {
		parâmetrosParaEnvioDeMensagensExcluirMassa = new ParâmetrosParaEnvioDeMensagensExcluirMassa();
		parâmetrosParaEnvioDeMensagensExcluirMassa.beforeClass();
		//parâmetrosParaEnvioDeMensagensExcluirMassa.login();
		//parâmetrosParaEnvioDeMensagensExcluirMassa.acessarMDR();
		parâmetrosParaEnvioDeMensagensExcluirMassa.criar();
		parâmetrosParaEnvioDeMensagensExcluirMassa.excluirMassa();
		parâmetrosParaEnvioDeMensagensExcluirMassa.afterClass();	
		
		System.out.println("-------------------Parâmetros para Envio de Mensagens FIN -------------------------");
	}
	
	// Preço de Transferência > Valores para Método / Valores para Método PVEX
	// 28 - 33
	@Test(priority = 33)
	public void valoresParaMetodoPVEXExcluirMassa() {		
		valoresParaMetodoPVEXExcluirMassa = new ValoresParaMetodoPVEXExcluirMassa();
		valoresParaMetodoPVEXExcluirMassa.beforeClass();
		valoresParaMetodoPVEXExcluirMassa.login();
		//valoresParaMetodoPVEXExcluirMassa.acessarMDR();
		//valoresParaMetodoPVEXExcluirMassa.criar();
		valoresParaMetodoPVEXExcluirMassa.excluirMassa();
		valoresParaMetodoPVEXExcluirMassa.afterClass();		
		System.out.println("------------------- Preço de Transferência > Valores para Método / Valores para Método PVEX FIN -------------------------");
	}
	
	// Preço de Transferência >	Valores para Método / Valores para Método PECEX
	//34 - 39
	@Test(priority = 39)
	public void valoresParaMetodoPECEXExcluirMassas() {		
		valoresParaMetodoPECEXExcluirMassas = new ValoresParaMetodoPECEXExcluirMassas();
		valoresParaMetodoPECEXExcluirMassas.beforeClass();
		//valoresParaMetodoPECEXExcluirMassas.login();
		//valoresParaMetodoPECEXExcluirMassas.acessarMDR();
		valoresParaMetodoPECEXExcluirMassas.criar();
		valoresParaMetodoPECEXExcluirMassas.excluirMassa();
		valoresParaMetodoPECEXExcluirMassas.afterClass();	
		System.out.println("------------------- Preço de Transferência >	Valores para Método / Valores para Método PECEX FIN -------------------------");
	}
	
	// Siscoserv > Enquadramento
	// 40 - 45
	@Test(priority = 45)
	public void enquadramentoExcluirMassa() {		
		enquadramentoExcluirMassa = new EnquadramentoExcluirMassa();
		enquadramentoExcluirMassa.beforeClass();
		enquadramentoExcluirMassa.login();
		enquadramentoExcluirMassa.acessarMDR();
		enquadramentoExcluirMassa.criar();
		enquadramentoExcluirMassa.excluirMassa();
		enquadramentoExcluirMassa.afterClass();		
		System.out.println("------------------- Siscoserv > Enquadramento FIN-------------------------");
	}
	
	// Tabela de Apoio do SPED	> 4.2.2 CFOP
	// 46 - 53
	@Test(priority = 47)
	public void CFOPEditar() {		
		enquadramentoExcluirMassa = new EnquadramentoExcluirMassa();
		enquadramentoExcluirMassa.beforeClass();
		enquadramentoExcluirMassa.login();
		enquadramentoExcluirMassa.acessarMDR();
		enquadramentoExcluirMassa.criar();
		enquadramentoExcluirMassa.excluirMassa();
		enquadramentoExcluirMassa.afterClass();		
	}
	
	@Test(priority = 48)
	public void cFODetalhe() {		
		enquadramentoExcluirMassa = new EnquadramentoExcluirMassa();
		enquadramentoExcluirMassa.beforeClass();
		enquadramentoExcluirMassa.login();
		enquadramentoExcluirMassa.acessarMDR();
		enquadramentoExcluirMassa.criar();
		enquadramentoExcluirMassa.excluirMassa();
		enquadramentoExcluirMassa.afterClass();		
	}
	
	@Test(priority = 49)
	public void cFOVisualizar() {		
		enquadramentoExcluirMassa = new EnquadramentoExcluirMassa();
		enquadramentoExcluirMassa.beforeClass();
		enquadramentoExcluirMassa.login();
		enquadramentoExcluirMassa.acessarMDR();
		enquadramentoExcluirMassa.criar();
		enquadramentoExcluirMassa.excluirMassa();
		enquadramentoExcluirMassa.afterClass();		
	}
	
	@Test(priority = 50)
	public void cFOPFiltrosAvancados() {		
		cFOPFiltrosAvancados = new CFOPFiltrosAvancados();
		cFOPFiltrosAvancados.beforeClass();
		cFOPFiltrosAvancados.ingresar();
		cFOPFiltrosAvancados.mdrEntrar();
		cFOPFiltrosAvancados.filtros();
		cFOPFiltrosAvancados.afterClass();		
	}
	
	// Tabela de Apoio do SPED	> 4.3.8 Código de Ajustes de Contribuições ou Créditos
	// 50 - 56
	
	
	// Tabela de Apoio do SPED	4.5.5 Classificação de Contribuintes do IPI
	// 57 - 64
	@Test(priority = 64)
	public void classificaçaoDeContribuintesDoIPIExcluirMassa() {		
		classificaçaoDeContribuintesDoIPIExcluirMassa = new ClassificaçaoDeContribuintesDoIPIExcluirMassa();
		classificaçaoDeContribuintesDoIPIExcluirMassa.beforeClass();
		classificaçaoDeContribuintesDoIPIExcluirMassa.login();
		classificaçaoDeContribuintesDoIPIExcluirMassa.acessarMDR();
		classificaçaoDeContribuintesDoIPIExcluirMassa.criar();
		classificaçaoDeContribuintesDoIPIExcluirMassa.excluirMassa();
		classificaçaoDeContribuintesDoIPIExcluirMassa.afterClass();		
		System.out.println("------------------- Tabela de Apoio do SPED	4.5.5 Classificação de Contribuintes do IPI FIN-------------------------");
	}
	
	// Tabela de Apoio ECD	> Código dos Fatos Contábeis
	
	@Test(priority = 65)
	public void codigoFatosContabeisCriar() {		
		System.out.println("------------------- Tabela de Apoio ECD	> Código dos Fatos Contábeis -------------------------");
		codigoFatosContabeisCriar = new CodigoFatosContabeisCriar();
		codigoFatosContabeisCriar.beforeClass();
		codigoFatosContabeisCriar.ingresar();
		codigoFatosContabeisCriar.mdrEntrar();
		codigoFatosContabeisCriar.criar();
		codigoFatosContabeisCriar.afterClass();		
	}
	
	@Test(priority = 66,dependsOnMethods = "codigoFatosContabeisCriar")
	public void codigoFatosContabeisEditar() {		
		codigoFatosContabeisEditar = new CodigoFatosContabeisEditar();
		codigoFatosContabeisEditar.beforeClass();
		codigoFatosContabeisEditar.ingresar();
		codigoFatosContabeisEditar.ingresarMDR();
		codigoFatosContabeisEditar.editarCodigoFatosContabeis();
		codigoFatosContabeisEditar.afterClass();		
	}
	
	@Test(priority = 67,dependsOnMethods = "codigoFatosContabeisCriar")
	public void codigoFatosContabeisDetalhe() {		
		codigoFatosContabeisDetalhe = new CodigoFatosContabeisDetalhe();
		codigoFatosContabeisDetalhe.beforeClass();
		codigoFatosContabeisDetalhe.ingresar();
		codigoFatosContabeisDetalhe.mdrEntrar();
		codigoFatosContabeisDetalhe.detalhe();
		codigoFatosContabeisDetalhe.afterClass();		
	}
	
	@Test(priority = 68,dependsOnMethods = "codigoFatosContabeisCriar")
	public void codigoFatosContabeisVisualizar() {		
		codigoFatosContabeisVisualizar = new CodigoFatosContabeisVisualizar();
		codigoFatosContabeisVisualizar.beforeClass();
		codigoFatosContabeisVisualizar.ingresar();
		codigoFatosContabeisVisualizar.mdrEntrar();
		codigoFatosContabeisVisualizar.visualizar();
		codigoFatosContabeisVisualizar.afterClass();		
	}
	
	@Test(priority = 69,dependsOnMethods = "codigoFatosContabeisCriar")
	public void codigoFatosContabeisFiltrar() {		
		codigoFatosContabeisFiltrar = new CodigoFatosContabeisFiltrar();
		codigoFatosContabeisFiltrar.beforeClass();
		codigoFatosContabeisFiltrar.ingresar();
		codigoFatosContabeisFiltrar.mdrEntrar();
		codigoFatosContabeisFiltrar.filtrarCodigoFatosContabeis();
		codigoFatosContabeisFiltrar.afterClass();		
	}
	
	@Test(priority = 70,dependsOnMethods = "codigoFatosContabeisCriar")
	public void codigoFatosContabeisExluir() {		
		codigoFatosContabeisExluir = new CodigoFatosContabeisExluir();
		codigoFatosContabeisExluir.beforeClass();
		codigoFatosContabeisExluir.ingresar();
		codigoFatosContabeisExluir.ingresarMDR();
		codigoFatosContabeisExluir.excluirCodigoFatosContabeis();
		codigoFatosContabeisExluir.afterClass();		
	}
	
	// 71 Excluir em massa
	
	// Tabela de Apoio ECD > Fatos Contábeis
	// 72 - 78
	@Test(priority = 70)
	public void fatosContabeisFiltrar() {		
		fatosContabeisFiltrar = new FatosContabeisFiltrar();
		fatosContabeisFiltrar.beforeClass();
		fatosContabeisFiltrar.ingresar();
		fatosContabeisFiltrar.mdrEntrar();
		fatosContabeisFiltrar.filtrarFatosContabeis();
		fatosContabeisFiltrar.afterClass();		
	}
	
	// Tabela de Apoio ECD	> Balanço Consolidado
	// 79 -86
	@Test(priority = 79)
	public void balançoConsolidadoEditar() {		
		balançoConsolidadoEditar = new BalançoConsolidadoEditar();
		balançoConsolidadoEditar.beforeClass();
		balançoConsolidadoEditar.ingresar();
		balançoConsolidadoEditar.ingresarMDR();
		balançoConsolidadoEditar.editar();
		balançoConsolidadoEditar.afterClass();		
	}
	
	// Tabelas de Apoio E-SOCIAL > Tabela 11 - Compatibilidade en Cat. Trab.
	// 87 - 94
	@Test(priority = 89)
	public void compatibilidadeEnCatTrabVisualizar() {		
		compatibilidadeEnCatTrabVisualizar = new CompatibilidadeEnCatTrabVisualizar();
		compatibilidadeEnCatTrabVisualizar.beforeClass();
		compatibilidadeEnCatTrabVisualizar.visualizar();
		compatibilidadeEnCatTrabVisualizar.afterClass();		
	}
	
	@Test(priority = 90)
	public void compatibilidadeEnCatTrabExcluir() {		
		compatibilidadeEnCatTrabExcluir = new CompatibilidadeEnCatTrabExcluir();
		compatibilidadeEnCatTrabExcluir.beforeClass();
		compatibilidadeEnCatTrabExcluir.excluir();
		compatibilidadeEnCatTrabExcluir.afterClass();		
	}
	
	// Tabelas de Apoio E-SOCIAL > Tabela 17 - Descrição de Nat. de Lesão
	// 95 - 107
	@Test(priority = 95)
	public void descriçãoDeNatDeLesãoCriar() {		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 17 - Descrição de Nat. de Lesão -------------------------");
		descriçãoDeNatDeLesãoCriar = new DescriçãoDeNatDeLesãoCriar();
		descriçãoDeNatDeLesãoCriar.beforeClass();
		descriçãoDeNatDeLesãoCriar.ingresar();
		descriçãoDeNatDeLesãoCriar.mdrEntrar();
		descriçãoDeNatDeLesãoCriar.criar();
		descriçãoDeNatDeLesãoCriar.afterClass();		
	}
	
	@Test(priority = 96,dependsOnMethods = "descriçãoDeNatDeLesãoCriar")
	public void descriçãoDeNatDeLesãoEditar() {		
		descriçãoDeNatDeLesãoEditar = new DescriçãoDeNatDeLesãoEditar();
		descriçãoDeNatDeLesãoEditar.beforeClass();
		descriçãoDeNatDeLesãoEditar.ingresar();
		descriçãoDeNatDeLesãoEditar.mdrEntrar();
		descriçãoDeNatDeLesãoEditar.editar();
		descriçãoDeNatDeLesãoEditar.afterClass();		
	}
	
	@Test(priority = 97,dependsOnMethods = "descriçãoDeNatDeLesãoCriar")
	public void descriçãoDeNatDeLesãoExcluir() {		
		descriçãoDeNatDeLesãoExcluir = new DescriçãoDeNatDeLesãoExcluir();
		descriçãoDeNatDeLesãoExcluir.beforeClass();
		descriçãoDeNatDeLesãoExcluir.ingresar();
		descriçãoDeNatDeLesãoExcluir.mdrEntrar();
		descriçãoDeNatDeLesãoExcluir.excluir();
		descriçãoDeNatDeLesãoExcluir.afterClass();		
	}
	
	@Test(priority = 98,dependsOnMethods = "descriçãoDeNatDeLesãoCriar")
	public void descriçãoDeNatDeLesãoVisualizar() {		
		descriçãoDeNatDeLesãoVisualizar = new DescriçãoDeNatDeLesãoVisualizar();
		descriçãoDeNatDeLesãoVisualizar.beforeClass();
		descriçãoDeNatDeLesãoVisualizar.ingresar();
		descriçãoDeNatDeLesãoVisualizar.mdrEntrar();
		descriçãoDeNatDeLesãoVisualizar.visualizar();
		descriçãoDeNatDeLesãoVisualizar.afterClass();		
	}
	
	// Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benefícios
	// 108 - 115
	@Test(priority = 108)
	public void tiposDeBenefíciosCriar() {		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benefícios -------------------------");
		tiposDeBenefíciosCriar = new TiposDeBenefíciosCriar();
		tiposDeBenefíciosCriar.beforeClass();
		tiposDeBenefíciosCriar.login();
		tiposDeBenefíciosCriar.acessarMDR();
		tiposDeBenefíciosCriar.criar();
		tiposDeBenefíciosCriar.afterClass();		
	}
	
	@Test(priority = 109,dependsOnMethods = "tiposDeBenefíciosCriar")
	public void tiposDeBeneficiosEditar() {		
		tiposDeBeneficiosEditar = new TiposDeBeneficiosEditar();
		tiposDeBeneficiosEditar.beforeClass();
		tiposDeBeneficiosEditar.login();
		tiposDeBeneficiosEditar.acessarMDR();
		tiposDeBeneficiosEditar.editar();
		tiposDeBeneficiosEditar.afterClass();		
	}
	
	@Test(priority = 110,dependsOnMethods = "tiposDeBenefíciosCriar")
	public void tiposDeBenefíciosVisualizar() {		
		tiposDeBenefíciosVisualizar = new TiposDeBenefíciosVisualizar();
		tiposDeBenefíciosVisualizar.beforeClass();
		tiposDeBenefíciosVisualizar.login();
		tiposDeBenefíciosVisualizar.acessarMDR();
		tiposDeBenefíciosVisualizar.visualizar();
		tiposDeBenefíciosVisualizar.afterClass();		
	}
	
	@Test(priority = 111,dependsOnMethods = "tiposDeBenefíciosCriar")
	public void tiposDeBenefíciosExcluir() {		
		tiposDeBenefíciosExcluir = new TiposDeBenefíciosExcluir();
		tiposDeBenefíciosExcluir.beforeClass();
		tiposDeBenefíciosExcluir.login();
		tiposDeBenefíciosExcluir.acessarMDR();
		tiposDeBenefíciosExcluir.excluir();
		tiposDeBenefíciosExcluir.afterClass();		
	}
	
	@Test(priority = 112)
	public void tiposDeBenefíciosExcluirMassa() {		
		tiposDeBenefíciosCriarExcluirMassa = new TiposDeBenefíciosCriarExcluirMassa();
		tiposDeBenefíciosCriarExcluirMassa.beforeClass();
		tiposDeBenefíciosCriarExcluirMassa.login();
		tiposDeBenefíciosCriarExcluirMassa.acessarMDR();
		tiposDeBenefíciosCriarExcluirMassa.criar();
		tiposDeBenefíciosCriarExcluirMassa.excluirMassa();
		tiposDeBenefíciosCriarExcluirMassa.afterClass();		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benefícios FIN -------------------------");
	}	
	
	// Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benefícios
	// 116 - 122
	@Test(priority = 116)
	public void motivosCesBeneficiosCriar() {		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benefícios -------------------------");
		motivosCesBeneficiosCriar = new MotivosCesBeneficiosCriar();
		motivosCesBeneficiosCriar.beforeClass();
		//motivosCesBeneficiosCriar.login();
		//motivosCesBeneficiosCriar.acessarMDR();
		motivosCesBeneficiosCriar.criar();
		motivosCesBeneficiosCriar.afterClass();		
	}
	
	@Test(priority = 117,dependsOnMethods = "motivosCesBeneficiosCriar")
	public void motivosCesBeneficiosEditar() {		
		motivosCesBeneficiosEditar = new MotivosCesBeneficiosEditar();
		motivosCesBeneficiosEditar.beforeClass();
		//motivosCesBeneficiosEditar.login();
		//motivosCesBeneficiosEditar.acessarMDR();
		motivosCesBeneficiosEditar.editar();
		motivosCesBeneficiosEditar.afterClass();		
	}
	
	@Test(priority = 118,dependsOnMethods = "motivosCesBeneficiosCriar")
	public void motivosCesBeneficiosVisualizar() {		
		motivosCesBeneficiosVisualizar = new MotivosCesBeneficiosVisualizar();
		motivosCesBeneficiosVisualizar.beforeClass();
		//motivosCesBeneficiosVisualizar.login();
		//motivosCesBeneficiosVisualizar.acessarMDR();
		motivosCesBeneficiosVisualizar.visualizar();
		motivosCesBeneficiosVisualizar.afterClass();		
	}
	
	@Test(priority = 119,dependsOnMethods = "motivosCesBeneficiosCriar")
	public void motivosCesBeneficiosExcluir() {		
		motivosCesBeneficiosExcluir = new MotivosCesBeneficiosExcluir();
		motivosCesBeneficiosExcluir.beforeClass();
		//motivosCesBeneficiosExcluir.login();
		//motivosCesBeneficiosExcluir.acessarMDR();
		motivosCesBeneficiosExcluir.excluir();
		motivosCesBeneficiosExcluir.afterClass();		
	}
	
	@Test(priority = 120)
	public void motivosCesBeneficiosExcluirMassa() {		
		motivosCesBeneficiosExcluirMassa = new MotivosCesBeneficiosExcluirMassa();
		motivosCesBeneficiosExcluirMassa.beforeClass();
		//motivosCesBeneficiosExcluirMassa.login();
		//motivosCesBeneficiosExcluirMassa.acessarMDR();
		motivosCesBeneficiosExcluirMassa.criar();
		motivosCesBeneficiosExcluirMassa.excluirMassa();
		motivosCesBeneficiosExcluirMassa.afterClass();		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benefícios -------------------------");
	}
	
	// Taxas de Atualização	> Configuração de Tipo Taxa de Atualização
	// 123 - 130
	@Test(priority = 123)
	public void configuraçãDeTipoTaxaDeAtualizaçãoCriar() {		
		System.out.println("------------------- Taxas de Atualização > Configuração de Tipo Taxa de Atualização -------------------------");
		configuraçãDeTipoTaxaDeAtualizaçãoCriar = new ConfiguraçãDeTipoTaxaDeAtualizaçãoCriar();
		configuraçãDeTipoTaxaDeAtualizaçãoCriar.beforeClass();
		configuraçãDeTipoTaxaDeAtualizaçãoCriar.ingresar();
		configuraçãDeTipoTaxaDeAtualizaçãoCriar.mdrEntrar();
		configuraçãDeTipoTaxaDeAtualizaçãoCriar.criar();
		configuraçãDeTipoTaxaDeAtualizaçãoCriar.afterClass();				
	}
	
	@Test(priority = 124,dependsOnMethods = "configuraçãDeTipoTaxaDeAtualizaçãoCriar")
	public void configuraçãDeTipoTaxaDeAtualizaçãoEditar() {		
		configuraçãDeTipoTaxaDeAtualizaçãoEditar = new ConfiguraçãDeTipoTaxaDeAtualizaçãoEditar();
		configuraçãDeTipoTaxaDeAtualizaçãoEditar.beforeClass();
		configuraçãDeTipoTaxaDeAtualizaçãoEditar.ingresar();
		configuraçãDeTipoTaxaDeAtualizaçãoEditar.mdrEntrar();
		configuraçãDeTipoTaxaDeAtualizaçãoEditar.editar();
		configuraçãDeTipoTaxaDeAtualizaçãoEditar.afterClass();				
	}
	
	@Test(priority = 125,dependsOnMethods = "configuraçãDeTipoTaxaDeAtualizaçãoCriar")
	public void configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar() {		
		configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar = new ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizar();
		configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar.beforeClass();
		configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar.ingresar();
		configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar.mdrEntrar();
		configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar.visualizar();
		configuraçãoDeTipoTaxaDeAtualizaçãoVisualizar.afterClass();				
	}
	
	@Test(priority = 126,dependsOnMethods = "configuraçãDeTipoTaxaDeAtualizaçãoCriar")
	public void configuraçãoDeTipoTaxaDeAtualizaçãoDetalle() {		
		configuraçãoDeTipoTaxaDeAtualizaçãoDetalle = new ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetalle();
		configuraçãoDeTipoTaxaDeAtualizaçãoDetalle.beforeClass();
		configuraçãoDeTipoTaxaDeAtualizaçãoDetalle.ingresar();
		configuraçãoDeTipoTaxaDeAtualizaçãoDetalle.ingresarMDR();
		configuraçãoDeTipoTaxaDeAtualizaçãoDetalle.detalle();
		configuraçãoDeTipoTaxaDeAtualizaçãoDetalle.afterClass();				
	}
	
	@Test(priority = 127,dependsOnMethods = "configuraçãDeTipoTaxaDeAtualizaçãoCriar")
	public void configuraçãDeTipoTaxaDeAtualizaçãoExcluir() {		
		configuraçãDeTipoTaxaDeAtualizaçãoExcluir = new ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluir();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluir.beforeClass();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluir.ingresar();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluir.mdrEntrar();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluir.excluir();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluir.afterClass();				
	}
	
	@Test(priority = 128)
	public void configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa() {
		System.out.println(
				"------Taxas de Atualização	> Configuração de Tipo Taxa de Atualização----------");
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa = new ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa.beforeClass();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa.ingresar();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa.mdrEntrar();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa.excluirEmMassa();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa.afterClass();
	}
	
	// Contas Especiais IRPJ/CSLL
		// 131  - 136
		@Test(priority = 131)
		public void  contasEspeciaisIRPJCSLL() {		
			System.out.println("------------------- Contas Especiais IRPJ/CSLL -------------------------");
			contasEspeciaisIRPJCSLL = new ContasEspeciaisIRPJCSLL();
			contasEspeciaisIRPJCSLL.beforeClass();
			contasEspeciaisIRPJCSLL.ingresar();
			contasEspeciaisIRPJCSLL.ingresarMDR();
			contasEspeciaisIRPJCSLL.criar();
			contasEspeciaisIRPJCSLL.afterClass();				
		}
		
		//137 - 144
		
		@Test(priority = 137)
		public void  rateiroConsorcio() {		
			System.out.println("------------------- Rateiro  Consorcio  -------------------------");
			rateiroConsorcio = new RateiroConsorcio();
			rateiroConsorcio.beforeClass();
			rateiroConsorcio.ingresar();
			rateiroConsorcio.ingresarMDR();
			rateiroConsorcio.criar();
			rateiroConsorcio.afterClass();				
		}
		
		// Tabela de Apoio ECD > DeXParaContraPartida

		@Test(priority = 145)
		public void  deXParaContraPartidaExcluirEmMassa() {		
			System.out.println("------------------- Tabela de Apoio ECD > DeXParaContraPartida -------------------------");
			deXParaContraPartidaExcluirEmMassa = new DeXParaContraPartidaExcluirEmMassa();
			deXParaContraPartidaExcluirEmMassa.beforeClass();
			deXParaContraPartidaExcluirEmMassa.login();
			deXParaContraPartidaExcluirEmMassa.acessarMDR();
			deXParaContraPartidaExcluirEmMassa.criar();
			deXParaContraPartidaExcluirEmMassa.afterClass();				
		}
		
		
		
 }  
