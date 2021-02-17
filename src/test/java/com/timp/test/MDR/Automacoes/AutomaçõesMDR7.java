package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;


import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oCriar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oDetalhes;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oEditar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oVisualizar;
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
import com.timp.test.MDR.EventosESocial.S1270Contrata��DeTrabalhadoresAvulsosN�oPortu�rios.Contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar;
import com.timp.test.MDR.EventosESocial.S2210Comunica��oDeAcidenteDeTrabalho.S2210Comunica��oDeAcidenteDeTrabalhoCriar;
import com.timp.test.MDR.EventosESocial.S2210Comunica��oDeAcidenteDeTrabalho.S2210Comunica��oDeAcidenteDeTrabalhoEditar;
import com.timp.test.MDR.EventosESocial.S2210Comunica��oDeAcidenteDeTrabalho.S2210Comunica��oDeAcidenteDeTrabalhoExcluir;
import com.timp.test.MDR.EventosESocial.S2210Comunica��oDeAcidenteDeTrabalho.S2210Comunica��oDeAcidenteDeTrabalhoFiltroID;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriar;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluir;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialEditar;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialVisualizar;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIICriar;
import com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIDetalhe;
import com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoExcluirMassa;
import com.timp.test.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensCriar;
import com.timp.test.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensDetalhes;
import com.timp.test.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensEditar;
import com.timp.test.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensExcluir;
import com.timp.test.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensExcluirMassa;
import com.timp.test.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensFiltrosId;
import com.timp.test.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensVisualizar;
import com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXExcluirMassas;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXExcluirMassa;
import com.timp.test.MDR.RateiroConsorcio.RateiroConsorcio;
import com.timp.test.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoExcluirMassa;
import com.timp.test.MDR.RegistroECAC.RegistroECACExcluirMassa;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoExcluirMassa;
import com.timp.test.MDR.Siscoserv.NBS.NBSExcluirMassa;
import com.timp.test.MDR.TabelaApoioECD.Balan�oConsolidado.Balan�oConsolidadoEditar;
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
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBeneficiosEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenef�ciosCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenef�ciosCriarExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenef�ciosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela25.TiposDeBenef�ciosVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosVisualizar;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFODetalhe;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFOPEditar;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFOPFiltrosAvancados;
import com.timp.test.MDR.TabelasApoioSped.CFOP.CFOVisualizar;

import com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPIExcluirMassa;
import com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�oesCreditosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.LogradouroExcluirMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluirMassa;
import com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oCriar;
import com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oEditar;
import com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oExcluir;
import com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa;
import com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��oDetalle;
import com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��oVisualizar;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluirEmMassa;


public class Automa��esMDR7 {	
	// Atividades fiscais >	Associa��o de Atividades Fiscais
	Associa��oCriar associa��oCriar;
	Associa��oEditar associa��oEditar;
	Associa��oDetalhes associa��oDetalhes;
	Associa��oVisualizar associa��oVisualizar;
	
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
	
	// Eventos e-Social > S2210 � Comunica��o de Acidente de Trabalho
	S2210Comunica��oDeAcidenteDeTrabalhoCriar s2210Comunica��oDeAcidenteDeTrabalhoCriar;
	S2210Comunica��oDeAcidenteDeTrabalhoEditar s2210Comunica��oDeAcidenteDeTrabalhoEditar;
	S2210Comunica��oDeAcidenteDeTrabalhoExcluir s2210Comunica��oDeAcidenteDeTrabalhoExcluir;
	S2210Comunica��oDeAcidenteDeTrabalhoFiltroID s2210Comunica��oDeAcidenteDeTrabalhoFiltroID;
	
	// Eventos e-Social > S1270 - Contrata��o de Trabalhadores Avulsos N�o Portu�rios
	Contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar;
	
	//Livros Fiscais > Parametriza��o do livro oficial
	LivrosFiscaisCriar livrosFiscaisCriar;
	LivrosFiscaisExcluir livrosFiscaisExcluir;

	
	// Parametros de Contabiliza��o	> Contas Default para Extempor�neo
	ContasDefaultParaExtemporaneoExcluirMassa contasDefaultParaExtemporaneoExcluirMassa;
	
	// Par�metros para Envio de Mensagens
	Par�metrosParaEnvioDeMensagensCriar par�metrosParaEnvioDeMensagensCriar;
	Par�metrosParaEnvioDeMensagensEditar par�metrosParaEnvioDeMensagensEditar;
	Par�metrosParaEnvioDeMensagensExcluir par�metrosParaEnvioDeMensagensExcluir;
	Par�metrosParaEnvioDeMensagensExcluirMassa par�metrosParaEnvioDeMensagensExcluirMassa;
	Par�metrosParaEnvioDeMensagensDetalhes par�metrosParaEnvioDeMensagensDetalhes;
	Par�metrosParaEnvioDeMensagensVisualizar par�metrosParaEnvioDeMensagensVisualizar;
	Par�metrosParaEnvioDeMensagensFiltrosId par�metrosParaEnvioDeMensagensFiltrosId;
	
	// Pre�o de Transfer�ncia > Valores para M�todo / Valores para M�todo PVEX
	ValoresParaMetodoPVEXExcluirMassa valoresParaMetodoPVEXExcluirMassa;
	
	// Pre�o de Transfer�ncia >	Valores para M�todo / Valores para M�todo PECEX
	ValoresParaMetodoPECEXExcluirMassas valoresParaMetodoPECEXExcluirMassas;
	
	// Siscoserv > Enquadramento
	EnquadramentoExcluirMassa enquadramentoExcluirMassa;
	
	// Tabela de Apoio do SPED	> 4.2.2 CFOP
	CFODetalhe cFODetalhe;
	CFOPEditar CFOPEditar;
	CFOVisualizar cFOVisualizar;
	CFOPFiltrosAvancados cFOPFiltrosAvancados;
	
	
	// Tabela de Apoio do SPED	4.5.5 Classifica��o de Contribuintes do IPI
	Classifica�aoDeContribuintesDoIPIExcluirMassa classifica�aoDeContribuintesDoIPIExcluirMassa;
	
	// Tabela de Apoio ECD	> C�digo dos Fatos Cont�beis
	CodigoFatosContabeisCriar codigoFatosContabeisCriar;
	CodigoFatosContabeisEditar codigoFatosContabeisEditar;
	CodigoFatosContabeisExluir codigoFatosContabeisExluir;
	CodigoFatosContabeisDetalhe codigoFatosContabeisDetalhe;
	CodigoFatosContabeisFiltrar codigoFatosContabeisFiltrar;
	CodigoFatosContabeisVisualizar codigoFatosContabeisVisualizar;
	
	// Tabela de Apoio ECD > Fatos Cont�beis
	FatosContabeisFiltrar fatosContabeisFiltrar;
	// Tabela de Apoio ECD > DeXParaContraPartida
	DeXParaContraPartidaExcluirEmMassa deXParaContraPartidaExcluirEmMassa;
	// Tabela de Apoio ECD	> Balan�o Consolidado
	Balan�oConsolidadoEditar balan�oConsolidadoEditar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 11 - Compatibilidade en Cat. Trab.
	CompatibilidadeEnCatTrabExcluir compatibilidadeEnCatTrabExcluir;
	CompatibilidadeEnCatTrabVisualizar compatibilidadeEnCatTrabVisualizar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 17 - Descri��o de Nat. de Les�o
	Descri��oDeNatDeLes�oCriar descri��oDeNatDeLes�oCriar;
	Descri��oDeNatDeLes�oEditar descri��oDeNatDeLes�oEditar;
	Descri��oDeNatDeLes�oExcluir descri��oDeNatDeLes�oExcluir;
	Descri��oDeNatDeLes�oVisualizar descri��oDeNatDeLes�oVisualizar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benef�cios
	TiposDeBenef�ciosCriar tiposDeBenef�ciosCriar;
	TiposDeBeneficiosEditar tiposDeBeneficiosEditar;
	TiposDeBenef�ciosExcluir tiposDeBenef�ciosExcluir;
	TiposDeBenef�ciosCriarExcluirMassa tiposDeBenef�ciosCriarExcluirMassa;
	TiposDeBenef�ciosVisualizar tiposDeBenef�ciosVisualizar;
	
	// Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benef�cios
	MotivosCesBeneficiosCriar motivosCesBeneficiosCriar;
	MotivosCesBeneficiosEditar motivosCesBeneficiosEditar;
	MotivosCesBeneficiosExcluir motivosCesBeneficiosExcluir;
	MotivosCesBeneficiosExcluirMassa motivosCesBeneficiosExcluirMassa;
	MotivosCesBeneficiosVisualizar motivosCesBeneficiosVisualizar;
	
	// Taxas de Atualiza��o	> Configura��o de Tipo Taxa de Atualiza��o
	Configura��DeTipoTaxaDeAtualiza��oCriar configura��DeTipoTaxaDeAtualiza��oCriar;
	Configura��DeTipoTaxaDeAtualiza��oEditar configura��DeTipoTaxaDeAtualiza��oEditar;	
	Configura��DeTipoTaxaDeAtualiza��oExcluir configura��DeTipoTaxaDeAtualiza��oExcluir;
	Configura��oDeTipoTaxaDeAtualiza��oVisualizar  configura��oDeTipoTaxaDeAtualiza��oVisualizar;
	Configura��oDeTipoTaxaDeAtualiza��oDetalle  configura��oDeTipoTaxaDeAtualiza��oDetalle;
	Configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa;
	
	
	//Contas Especiais IRPJ/CSLL
	ContasEspeciaisIRPJCSLL  contasEspeciaisIRPJCSLL;
	
	// Rateiro Consorcio
	RateiroConsorcio  rateiroConsorcio;
	
	//Tabela de Apoio do SPED > CFOP
	
	// -----------------------------------------------------------------------------------------
	
	// Atividades fiscais >	Associa��o de Atividades Fiscais

	@Test(priority = 0)
	public void associa��oCriar() {

		System.out.println("-------------------Atividades fiscais >	Associa��o de Atividades Fiscais-------------------------");

		associa��oCriar = new Associa��oCriar();
		associa��oCriar.beforeClass();
	//	associa��oCriar.login();
	//	associa��oCriar.acessarMDR();
		associa��oCriar.criarAssocia��o();
		associa��oCriar.afterClass();

	}

	@Test(priority = 1,dependsOnMethods = "associa��oCriar")
	public void associa��oEditar() {

		associa��oEditar = new Associa��oEditar();
		associa��oEditar.beforeClass();
		//associa��oEditar.login();
		//associa��oEditar.acessarMDR();
		associa��oEditar.editarAssocia��o();
		associa��oEditar.afterClass();

	}

	@Test(priority = 2,dependsOnMethods = "associa��oCriar")
	public void associa��oDetalhe() {

		associa��oDetalhes = new Associa��oDetalhes();
		associa��oDetalhes.beforeClass();
	//	associa��oDetalhes.ingresar();
	//	associa��oDetalhes.mdrEntrar();
		associa��oDetalhes.detalheAssocia��o();
		associa��oDetalhes.afterClass();

	}

	@Test(priority = 3,dependsOnMethods = "associa��oCriar")
	public void associa��oVisualizar() {

		associa��oVisualizar = new Associa��oVisualizar();
		associa��oVisualizar.beforeClass();
	//	associa��oVisualizar.ingresar();
		//associa��oVisualizar.mdrEntrar();
		associa��oVisualizar.visualizarAssocia��o();
		associa��oVisualizar.afterClass();
		
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
	
	// Eventos e-Social > S2210 � Comunica��o de Acidente de Trabalho

	@Test(priority = 12)
	public void s2210Comunica��oDeAcidenteDeTrabalhoCriar() {
		System.out.println("-------------------Eventos e-Social > S2210 � Comunica��o de Acidente de Trabalho -------------------------");

		s2210Comunica��oDeAcidenteDeTrabalhoCriar = new S2210Comunica��oDeAcidenteDeTrabalhoCriar();
		s2210Comunica��oDeAcidenteDeTrabalhoCriar.beforeClass();
		s2210Comunica��oDeAcidenteDeTrabalhoCriar.ingresar();
		s2210Comunica��oDeAcidenteDeTrabalhoCriar.ingresarMDR();
		s2210Comunica��oDeAcidenteDeTrabalhoCriar.criar();
		s2210Comunica��oDeAcidenteDeTrabalhoCriar.afterClass();		
	}
	
	@Test(priority = 13,dependsOnMethods = "s2210Comunica��oDeAcidenteDeTrabalhoCriar")
	public void s2210Comunica��oDeAcidenteDeTrabalhoEditar() {
		s2210Comunica��oDeAcidenteDeTrabalhoEditar = new S2210Comunica��oDeAcidenteDeTrabalhoEditar();
		s2210Comunica��oDeAcidenteDeTrabalhoEditar.beforeClass();
		s2210Comunica��oDeAcidenteDeTrabalhoEditar.ingresar();
		s2210Comunica��oDeAcidenteDeTrabalhoEditar.ingresarMDR();
		s2210Comunica��oDeAcidenteDeTrabalhoEditar.editar();
		s2210Comunica��oDeAcidenteDeTrabalhoEditar.afterClass();		
	}
	
	@Test(priority = 14,dependsOnMethods = "s2210Comunica��oDeAcidenteDeTrabalhoCriar")
	public void s2210Comunica��oDeAcidenteDeTrabalhoFiltroID() {
		s2210Comunica��oDeAcidenteDeTrabalhoFiltroID = new S2210Comunica��oDeAcidenteDeTrabalhoFiltroID();
		s2210Comunica��oDeAcidenteDeTrabalhoFiltroID.beforeClass();
		s2210Comunica��oDeAcidenteDeTrabalhoFiltroID.login();
		s2210Comunica��oDeAcidenteDeTrabalhoFiltroID.acessarMDR();
		s2210Comunica��oDeAcidenteDeTrabalhoFiltroID.filtro();
		s2210Comunica��oDeAcidenteDeTrabalhoFiltroID.afterClass();		
	}
	
	@Test(priority = 15,dependsOnMethods = "s2210Comunica��oDeAcidenteDeTrabalhoCriar")
	public void s2210Comunica��oDeAcidenteDeTrabalhoExcluir() {
		s2210Comunica��oDeAcidenteDeTrabalhoExcluir = new S2210Comunica��oDeAcidenteDeTrabalhoExcluir();
		s2210Comunica��oDeAcidenteDeTrabalhoExcluir.beforeClass();
		s2210Comunica��oDeAcidenteDeTrabalhoExcluir.ingresar();
		s2210Comunica��oDeAcidenteDeTrabalhoExcluir.ingresarMDR();
		s2210Comunica��oDeAcidenteDeTrabalhoExcluir.excluir();
		s2210Comunica��oDeAcidenteDeTrabalhoExcluir.afterClass();		
		
		System.out.println("-------------------Eventos e-Social > S2210 � Comunica��o de Acidente de Trabalho FIN -------------------------");
	}
	
	// 15 Filtro por ID
	
	// Eventos e-Social > S1270 - Contrata��o de Trabalhadores Avulsos N�o Portu�rios

	@Test(priority = 16)
	public void contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar() {
		System.out.println("-------------------Eventos e-Social > S1270 - Contrata��o de Trabalhadores Avulsos N�o Portu�rios -------------------------");

		contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar = new Contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar();
		contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar.beforeClass();
		contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar.ingresar();
		contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar.ingresarMDR();
		contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar.criar();
		contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar.afterClass();		
	}
	
	// Livros Fiscais > Parametriza��o do livro oficial
	
	@Test(priority = 17)
	public void livrosFiscaisCriar() {
		System.out.println("-------------------Livros Fiscais > Parametriza��o do livro oficial -------------------------");

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
	
	// Parametros de Contabiliza��o	> Contas Default para Extempor�neo
	// 21 - 26
	
	@Test(priority = 27)
	public void contasDefaultParaExtemporaneoExcluirMassa() {
		System.out.println("-------------------Parametros de Contabiliza��o	> Contas Default para Extempor�neo -------------------------");
		contasDefaultParaExtemporaneoExcluirMassa = new ContasDefaultParaExtemporaneoExcluirMassa();
		contasDefaultParaExtemporaneoExcluirMassa.beforeClass();
		//contasDefaultParaExtemporaneoExcluirMassa.login();
		//contasDefaultParaExtemporaneoExcluirMassa.acessarMDR();
		contasDefaultParaExtemporaneoExcluirMassa.criar();
		contasDefaultParaExtemporaneoExcluirMassa.excluirMassa();
		contasDefaultParaExtemporaneoExcluirMassa.afterClass();		
	}
	
	// Par�metros para Envio de Mensagens
	
	@Test(priority = 28)
	public void par�metrosParaEnvioDeMensagensCriar() {
		System.out.println("-------------------Par�metros para Envio de Mensagens -------------------------");
		par�metrosParaEnvioDeMensagensCriar = new Par�metrosParaEnvioDeMensagensCriar();
		par�metrosParaEnvioDeMensagensCriar.beforeClass();
		//par�metrosParaEnvioDeMensagensCriar.ingresar();
		//par�metrosParaEnvioDeMensagensCriar.ingresarMDR();
		par�metrosParaEnvioDeMensagensCriar.criar();
		par�metrosParaEnvioDeMensagensCriar.afterClass();		
	}
	
	@Test(priority = 29,dependsOnMethods = "par�metrosParaEnvioDeMensagensCriar")
	public void par�metrosParaEnvioDeMensagensEditar() {
		par�metrosParaEnvioDeMensagensEditar = new Par�metrosParaEnvioDeMensagensEditar();
		par�metrosParaEnvioDeMensagensEditar.beforeClass();
		//par�metrosParaEnvioDeMensagensEditar.ingresar();
		//par�metrosParaEnvioDeMensagensEditar.ingresarMDR();
		par�metrosParaEnvioDeMensagensEditar.editar();
		par�metrosParaEnvioDeMensagensEditar.afterClass();		
	}
	
	@Test(priority = 29,dependsOnMethods = "par�metrosParaEnvioDeMensagensCriar")
	public void par�metrosParaEnvioDeMensagensFiltrosId() {
		par�metrosParaEnvioDeMensagensFiltrosId = new Par�metrosParaEnvioDeMensagensFiltrosId();
		par�metrosParaEnvioDeMensagensFiltrosId.beforeClass();
		//par�metrosParaEnvioDeMensagensFiltrosId.login();
		//par�metrosParaEnvioDeMensagensFiltrosId.acessarMDR();
		par�metrosParaEnvioDeMensagensFiltrosId.filtros();
		par�metrosParaEnvioDeMensagensFiltrosId.afterClass();		
	}
	@Test(priority = 30,dependsOnMethods = "par�metrosParaEnvioDeMensagensCriar")
	public void par�metrosParaEnvioDeMensagensDetalhe() {
		par�metrosParaEnvioDeMensagensDetalhes = new Par�metrosParaEnvioDeMensagensDetalhes();
		par�metrosParaEnvioDeMensagensDetalhes.beforeClass();
		////par�metrosParaEnvioDeMensagensDetalhes.ingresar();
		//par�metrosParaEnvioDeMensagensDetalhes.ingresarMDR();
		par�metrosParaEnvioDeMensagensDetalhes.detalhes();
		par�metrosParaEnvioDeMensagensDetalhes.afterClass();		
	}
	
	@Test(priority = 31,dependsOnMethods = "par�metrosParaEnvioDeMensagensCriar")
	public void par�metrosParaEnvioDeMensagensVisualizar() {
		par�metrosParaEnvioDeMensagensVisualizar = new Par�metrosParaEnvioDeMensagensVisualizar();
		par�metrosParaEnvioDeMensagensVisualizar.beforeClass();
		//par�metrosParaEnvioDeMensagensVisualizar.ingresar();
		//par�metrosParaEnvioDeMensagensVisualizar.ingresarMDR();
		par�metrosParaEnvioDeMensagensVisualizar.visualizar();
		par�metrosParaEnvioDeMensagensVisualizar.afterClass();		
	}
	
	@Test(priority = 32,dependsOnMethods = "par�metrosParaEnvioDeMensagensCriar")
	public void par�metrosParaEnvioDeMensagensExcluir() {
		par�metrosParaEnvioDeMensagensExcluir = new Par�metrosParaEnvioDeMensagensExcluir();
		par�metrosParaEnvioDeMensagensExcluir.beforeClass();
		//par�metrosParaEnvioDeMensagensExcluir.ingresar();
		//par�metrosParaEnvioDeMensagensExcluir.ingresarMDR();
		par�metrosParaEnvioDeMensagensExcluir.excluir();
		par�metrosParaEnvioDeMensagensExcluir.afterClass();		
	}
	
	@Test(priority = 33)
	public void par�metrosParaEnvioDeMensagensExcluirMassa() {
		par�metrosParaEnvioDeMensagensExcluirMassa = new Par�metrosParaEnvioDeMensagensExcluirMassa();
		par�metrosParaEnvioDeMensagensExcluirMassa.beforeClass();
		//par�metrosParaEnvioDeMensagensExcluirMassa.login();
		//par�metrosParaEnvioDeMensagensExcluirMassa.acessarMDR();
		par�metrosParaEnvioDeMensagensExcluirMassa.criar();
		par�metrosParaEnvioDeMensagensExcluirMassa.excluirMassa();
		par�metrosParaEnvioDeMensagensExcluirMassa.afterClass();	
		
		System.out.println("-------------------Par�metros para Envio de Mensagens FIN -------------------------");
	}
	
	// Pre�o de Transfer�ncia > Valores para M�todo / Valores para M�todo PVEX
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
		System.out.println("------------------- Pre�o de Transfer�ncia > Valores para M�todo / Valores para M�todo PVEX FIN -------------------------");
	}
	
	// Pre�o de Transfer�ncia >	Valores para M�todo / Valores para M�todo PECEX
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
		System.out.println("------------------- Pre�o de Transfer�ncia >	Valores para M�todo / Valores para M�todo PECEX FIN -------------------------");
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
	
	// Tabela de Apoio do SPED	> 4.3.8 C�digo de Ajustes de Contribui��es ou Cr�ditos
	// 50 - 56
	
	
	// Tabela de Apoio do SPED	4.5.5 Classifica��o de Contribuintes do IPI
	// 57 - 64
	@Test(priority = 64)
	public void classifica�aoDeContribuintesDoIPIExcluirMassa() {		
		classifica�aoDeContribuintesDoIPIExcluirMassa = new Classifica�aoDeContribuintesDoIPIExcluirMassa();
		classifica�aoDeContribuintesDoIPIExcluirMassa.beforeClass();
		classifica�aoDeContribuintesDoIPIExcluirMassa.login();
		classifica�aoDeContribuintesDoIPIExcluirMassa.acessarMDR();
		classifica�aoDeContribuintesDoIPIExcluirMassa.criar();
		classifica�aoDeContribuintesDoIPIExcluirMassa.excluirMassa();
		classifica�aoDeContribuintesDoIPIExcluirMassa.afterClass();		
		System.out.println("------------------- Tabela de Apoio do SPED	4.5.5 Classifica��o de Contribuintes do IPI FIN-------------------------");
	}
	
	// Tabela de Apoio ECD	> C�digo dos Fatos Cont�beis
	
	@Test(priority = 65)
	public void codigoFatosContabeisCriar() {		
		System.out.println("------------------- Tabela de Apoio ECD	> C�digo dos Fatos Cont�beis -------------------------");
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
	
	// Tabela de Apoio ECD > Fatos Cont�beis
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
	
	// Tabela de Apoio ECD	> Balan�o Consolidado
	// 79 -86
	@Test(priority = 79)
	public void balan�oConsolidadoEditar() {		
		balan�oConsolidadoEditar = new Balan�oConsolidadoEditar();
		balan�oConsolidadoEditar.beforeClass();
		balan�oConsolidadoEditar.ingresar();
		balan�oConsolidadoEditar.ingresarMDR();
		balan�oConsolidadoEditar.editar();
		balan�oConsolidadoEditar.afterClass();		
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
	
	// Tabelas de Apoio E-SOCIAL > Tabela 17 - Descri��o de Nat. de Les�o
	// 95 - 107
	@Test(priority = 95)
	public void descri��oDeNatDeLes�oCriar() {		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 17 - Descri��o de Nat. de Les�o -------------------------");
		descri��oDeNatDeLes�oCriar = new Descri��oDeNatDeLes�oCriar();
		descri��oDeNatDeLes�oCriar.beforeClass();
		descri��oDeNatDeLes�oCriar.ingresar();
		descri��oDeNatDeLes�oCriar.mdrEntrar();
		descri��oDeNatDeLes�oCriar.criar();
		descri��oDeNatDeLes�oCriar.afterClass();		
	}
	
	@Test(priority = 96,dependsOnMethods = "descri��oDeNatDeLes�oCriar")
	public void descri��oDeNatDeLes�oEditar() {		
		descri��oDeNatDeLes�oEditar = new Descri��oDeNatDeLes�oEditar();
		descri��oDeNatDeLes�oEditar.beforeClass();
		descri��oDeNatDeLes�oEditar.ingresar();
		descri��oDeNatDeLes�oEditar.mdrEntrar();
		descri��oDeNatDeLes�oEditar.editar();
		descri��oDeNatDeLes�oEditar.afterClass();		
	}
	
	@Test(priority = 97,dependsOnMethods = "descri��oDeNatDeLes�oCriar")
	public void descri��oDeNatDeLes�oExcluir() {		
		descri��oDeNatDeLes�oExcluir = new Descri��oDeNatDeLes�oExcluir();
		descri��oDeNatDeLes�oExcluir.beforeClass();
		descri��oDeNatDeLes�oExcluir.ingresar();
		descri��oDeNatDeLes�oExcluir.mdrEntrar();
		descri��oDeNatDeLes�oExcluir.excluir();
		descri��oDeNatDeLes�oExcluir.afterClass();		
	}
	
	@Test(priority = 98,dependsOnMethods = "descri��oDeNatDeLes�oCriar")
	public void descri��oDeNatDeLes�oVisualizar() {		
		descri��oDeNatDeLes�oVisualizar = new Descri��oDeNatDeLes�oVisualizar();
		descri��oDeNatDeLes�oVisualizar.beforeClass();
		descri��oDeNatDeLes�oVisualizar.ingresar();
		descri��oDeNatDeLes�oVisualizar.mdrEntrar();
		descri��oDeNatDeLes�oVisualizar.visualizar();
		descri��oDeNatDeLes�oVisualizar.afterClass();		
	}
	
	// Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benef�cios
	// 108 - 115
	@Test(priority = 108)
	public void tiposDeBenef�ciosCriar() {		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benef�cios -------------------------");
		tiposDeBenef�ciosCriar = new TiposDeBenef�ciosCriar();
		tiposDeBenef�ciosCriar.beforeClass();
		tiposDeBenef�ciosCriar.login();
		tiposDeBenef�ciosCriar.acessarMDR();
		tiposDeBenef�ciosCriar.criar();
		tiposDeBenef�ciosCriar.afterClass();		
	}
	
	@Test(priority = 109,dependsOnMethods = "tiposDeBenef�ciosCriar")
	public void tiposDeBeneficiosEditar() {		
		tiposDeBeneficiosEditar = new TiposDeBeneficiosEditar();
		tiposDeBeneficiosEditar.beforeClass();
		tiposDeBeneficiosEditar.login();
		tiposDeBeneficiosEditar.acessarMDR();
		tiposDeBeneficiosEditar.editar();
		tiposDeBeneficiosEditar.afterClass();		
	}
	
	@Test(priority = 110,dependsOnMethods = "tiposDeBenef�ciosCriar")
	public void tiposDeBenef�ciosVisualizar() {		
		tiposDeBenef�ciosVisualizar = new TiposDeBenef�ciosVisualizar();
		tiposDeBenef�ciosVisualizar.beforeClass();
		tiposDeBenef�ciosVisualizar.login();
		tiposDeBenef�ciosVisualizar.acessarMDR();
		tiposDeBenef�ciosVisualizar.visualizar();
		tiposDeBenef�ciosVisualizar.afterClass();		
	}
	
	@Test(priority = 111,dependsOnMethods = "tiposDeBenef�ciosCriar")
	public void tiposDeBenef�ciosExcluir() {		
		tiposDeBenef�ciosExcluir = new TiposDeBenef�ciosExcluir();
		tiposDeBenef�ciosExcluir.beforeClass();
		tiposDeBenef�ciosExcluir.login();
		tiposDeBenef�ciosExcluir.acessarMDR();
		tiposDeBenef�ciosExcluir.excluir();
		tiposDeBenef�ciosExcluir.afterClass();		
	}
	
	@Test(priority = 112)
	public void tiposDeBenef�ciosExcluirMassa() {		
		tiposDeBenef�ciosCriarExcluirMassa = new TiposDeBenef�ciosCriarExcluirMassa();
		tiposDeBenef�ciosCriarExcluirMassa.beforeClass();
		tiposDeBenef�ciosCriarExcluirMassa.login();
		tiposDeBenef�ciosCriarExcluirMassa.acessarMDR();
		tiposDeBenef�ciosCriarExcluirMassa.criar();
		tiposDeBenef�ciosCriarExcluirMassa.excluirMassa();
		tiposDeBenef�ciosCriarExcluirMassa.afterClass();		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 25 - Tipos de Benef�cios FIN -------------------------");
	}	
	
	// Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benef�cios
	// 116 - 122
	@Test(priority = 116)
	public void motivosCesBeneficiosCriar() {		
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benef�cios -------------------------");
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
		System.out.println("------------------- Tabelas de Apoio E-SOCIAL > Tabela 26 - Motivos de Ces. Benef�cios -------------------------");
	}
	
	// Taxas de Atualiza��o	> Configura��o de Tipo Taxa de Atualiza��o
	// 123 - 130
	@Test(priority = 123)
	public void configura��DeTipoTaxaDeAtualiza��oCriar() {		
		System.out.println("------------------- Taxas de Atualiza��o > Configura��o de Tipo Taxa de Atualiza��o -------------------------");
		configura��DeTipoTaxaDeAtualiza��oCriar = new Configura��DeTipoTaxaDeAtualiza��oCriar();
		configura��DeTipoTaxaDeAtualiza��oCriar.beforeClass();
		configura��DeTipoTaxaDeAtualiza��oCriar.ingresar();
		configura��DeTipoTaxaDeAtualiza��oCriar.mdrEntrar();
		configura��DeTipoTaxaDeAtualiza��oCriar.criar();
		configura��DeTipoTaxaDeAtualiza��oCriar.afterClass();				
	}
	
	@Test(priority = 124,dependsOnMethods = "configura��DeTipoTaxaDeAtualiza��oCriar")
	public void configura��DeTipoTaxaDeAtualiza��oEditar() {		
		configura��DeTipoTaxaDeAtualiza��oEditar = new Configura��DeTipoTaxaDeAtualiza��oEditar();
		configura��DeTipoTaxaDeAtualiza��oEditar.beforeClass();
		configura��DeTipoTaxaDeAtualiza��oEditar.ingresar();
		configura��DeTipoTaxaDeAtualiza��oEditar.mdrEntrar();
		configura��DeTipoTaxaDeAtualiza��oEditar.editar();
		configura��DeTipoTaxaDeAtualiza��oEditar.afterClass();				
	}
	
	@Test(priority = 125,dependsOnMethods = "configura��DeTipoTaxaDeAtualiza��oCriar")
	public void configura��oDeTipoTaxaDeAtualiza��oVisualizar() {		
		configura��oDeTipoTaxaDeAtualiza��oVisualizar = new Configura��oDeTipoTaxaDeAtualiza��oVisualizar();
		configura��oDeTipoTaxaDeAtualiza��oVisualizar.beforeClass();
		configura��oDeTipoTaxaDeAtualiza��oVisualizar.ingresar();
		configura��oDeTipoTaxaDeAtualiza��oVisualizar.mdrEntrar();
		configura��oDeTipoTaxaDeAtualiza��oVisualizar.visualizar();
		configura��oDeTipoTaxaDeAtualiza��oVisualizar.afterClass();				
	}
	
	@Test(priority = 126,dependsOnMethods = "configura��DeTipoTaxaDeAtualiza��oCriar")
	public void configura��oDeTipoTaxaDeAtualiza��oDetalle() {		
		configura��oDeTipoTaxaDeAtualiza��oDetalle = new Configura��oDeTipoTaxaDeAtualiza��oDetalle();
		configura��oDeTipoTaxaDeAtualiza��oDetalle.beforeClass();
		configura��oDeTipoTaxaDeAtualiza��oDetalle.ingresar();
		configura��oDeTipoTaxaDeAtualiza��oDetalle.ingresarMDR();
		configura��oDeTipoTaxaDeAtualiza��oDetalle.detalle();
		configura��oDeTipoTaxaDeAtualiza��oDetalle.afterClass();				
	}
	
	@Test(priority = 127,dependsOnMethods = "configura��DeTipoTaxaDeAtualiza��oCriar")
	public void configura��DeTipoTaxaDeAtualiza��oExcluir() {		
		configura��DeTipoTaxaDeAtualiza��oExcluir = new Configura��DeTipoTaxaDeAtualiza��oExcluir();
		configura��DeTipoTaxaDeAtualiza��oExcluir.beforeClass();
		configura��DeTipoTaxaDeAtualiza��oExcluir.ingresar();
		configura��DeTipoTaxaDeAtualiza��oExcluir.mdrEntrar();
		configura��DeTipoTaxaDeAtualiza��oExcluir.excluir();
		configura��DeTipoTaxaDeAtualiza��oExcluir.afterClass();				
	}
	
	@Test(priority = 128)
	public void configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa() {
		System.out.println(
				"------Taxas de Atualiza��o	> Configura��o de Tipo Taxa de Atualiza��o----------");
		configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa = new Configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa();
		configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa.beforeClass();
		configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa.ingresar();
		configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa.mdrEntrar();
		configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa.excluirEmMassa();
		configura��DeTipoTaxaDeAtualiza��oExcluirEmMassa.afterClass();
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
