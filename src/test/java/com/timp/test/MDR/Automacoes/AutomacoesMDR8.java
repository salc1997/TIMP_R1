package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oCriar;
import com.timp.test.MDR.CadastroCondi�ao.CadastroCondi�aoExcluirMasas;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimientoExcluirMasas;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoExcluirMasas;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasCriar;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasEditar;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasExcluir;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasExcluirEmMassa;
import com.timp.test.MDR.CadastrosIRPJCSLL.CadastroContaisContabeis.CadastroContaisContabeisFiltroID;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasCont�beisRBLP.ContasCont�beisRBLPFiltroId;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisEditar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisExcluir;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisVisualizar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailCriar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialEditar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.CadastroDeC�digoDeRegras.CadastroDeC�digoDeRegrasCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoDetalles;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoExcluir;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoExcluirEmMassa;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoVisualizar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaDetalle;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaExcluir;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaExcluirMassa;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaVisualizar;
import com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrabalhoFiltroID;
import com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoCriar;
import com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoEditar;
import com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoExcluir;
import com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoExcluirMassa;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��o.S1250Aquisi��oCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��o.S1250Aquisi��oEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��o.S1250Aquisi��oExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��oTotal.S1250Aquisi��oTotalCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��oTotal.S1250Aquisi��oTotalEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEventos.S1250DadosdeEventoCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEventos.S1250DadosdeEventoEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEventos.S1250DadosdeEventoExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisi��o.S1250DetAquisi��oCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisi��o.S1250DetAquisi��oEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisi��o.S1250DetAquisi��oExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial.S1250InfProcJudicialCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial.S1250InfProcJudicialEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial.S1250InfProcJudicialExcluir;
import com.timp.test.MDR.EventosESocial.S2230AfastamentoTempor�rio.S2230AfastamentoTempor�rioFiltroId;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoExcluirMasas;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficial;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialEditar;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialExcluir;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialVisualizar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTDetalle;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTEditar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluir;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluirMasas;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTVisualizar;
import com.timp.test.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFCriar;
import com.timp.test.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFDetalhes;
import com.timp.test.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFEditar;
import com.timp.test.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFExcluir;
import com.timp.test.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFExcluirEmMasa;
import com.timp.test.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFVisualizar;

public class AutomacoesMDR8 {

	// Determina��o de Relev�ncia de Tarefa por Motivo de Reabertura > Regra de
	// Reabertura
	RegraDeReaberturaCriar regraDeReaberturaCriar;
	RegraDeReaberturaEditar regraDeReaberturaEditar;
	RegraDeReaberturaDetalle regraDeReaberturaDetalle;
	RegraDeReaberturaVisualizar regraDeReaberturaVisualizar;
	RegraDeReaberturaExcluir regraDeReaberturaExcluir;
	RegraDeReaberturaExcluirMassa regraDeReaberturaExcluirMassa;

	// Cadastro Espec�fico do INSS (CEI) > Cadastro de Obras
	CadastroDeObrasCriar cadastroDeObrasCriar;
	CadastroDeObrasEditar cadastroDeObrasEditar;
	CadastroDeObrasExcluir cadastroDeObrasExcluir;
	CadastroDeObrasExcluirEmMassa cadastroDeObrasExcluirEmMassa;
	// Cadastro Espec�fico do INSS (CEI) > Cadastro de Obras
	ConfiguracaoFundoSocailCriar configuracaoFundoSocailCriar;
	ConfiguracoesFundoSocialEditar configuracoesFundoSocialEditar;

	// Livros Fiscais > Par�metros para Livro ICMS ST

	ParametrosParaLivroICMSSTCriar parametrosParaLivroICMSSTCriar;
	ParametrosParaLivroICMSSTEditar parametrosParaLivroICMSSTEditar;
	ParametrosParaLivroICMSSTVisualizar parametrosParaLivroICMSSTVisualizar;
	ParametrosParaLivroICMSSTDetalle parametrosParaLivroICMSSTDetalle;
	ParametrosParaLivroICMSSTExcluir parametrosParaLivroICMSSTExcluir;

	// S2230 AfastamentoTempor�rio

	S2230AfastamentoTempor�rioFiltroId s2230AfastamentoTempor�rioFiltroId;

	// Cadastros IRPJ/CSLL > Cadastro Contas Cont�beis
	CadastroContaisContabeisFiltroID cadastroContaisContabeisFiltroID;

	// Cadastros IRPJ/CSLL DE-PARA Contas Cont�beis
	DEPARAContasCont�beisCriar dEPARAContasCont�beisCriar;
	DEPARAContasCont�beisEditar dEPARAContasCont�beisEditar;
	DEPARAContasCont�beisVisualizar dEPARAContasCont�beisVisualizar;
	DEPARAContasCont�beisExcluir dEPARAContasCont�beisExcluir;

	// Hierarquia De Cenarios De Corre�ao
	HierarquiaDeCenariosDeCorre�aoExcluirMasas hierarquiaDeCenariosDeCorre�aoExcluirMasas;

	// Cadastro Condi�ao
	CadastroCondi�aoExcluirMasas cadastroCondi�aoExcluirMasas;

	// Cadastro Derex > Cadastro Respons�vel pelo Movimento

	ResponsavelMovimientoExcluirMasas responsavelMovimientoExcluirMasas;

	// Cadastro Derex > Institui��o Financeira
	InstituicaoExcluirMasas instituicaoExcluirMasas;

	// Livros Fiscais > Par�metros para Livro ICMS ST
	ParametrosParaLivroICMSSTExcluirMasas parametrosParaLivroICMSSTExcluirMasas;

	// Cadastros IRPJ/CSLL > Contas Cont�beis RB/LP
	ContasCont�beisRBLPFiltroId contasCont�beisRBLPFiltroId;

	// Parametriza��o Do Livro Oficial
	Parametriza��oDoLivroOficial parametriza��oDoLivroOficial;
	Parametriza��oDoLivroOficialEditar parametriza��oDoLivroOficialEditar;
	Parametriza��oDoLivroOficialVisualizar parametriza��oDoLivroOficialVisualizar;
	Parametriza��oDoLivroOficialExcluir parametriza��oDoLivroOficialExcluir;

	// Determinacao De Relevancia De Tarefa > Cadastro De C�digo De Regras
	CadastroDeC�digoDeRegrasCriar cadastroDeC�digoDeRegrasCriar;
	// Determinacao Relevancia Tarefa Motivo Reabertura > Determinacion Relevancia
	// Por Motivo
	DeterminacionRelevanciaPorMotivoCriar determinacionRelevanciaPorMotivoCriar;
	DeterminacionRelevanciaPorMotivoEditar determinacionRelevanciaPorMotivoEditar;
	DeterminacionRelevanciaPorMotivoDetalles determinacionRelevanciaPorMotivoDetalles;
	DeterminacionRelevanciaPorMotivoExcluirEmMassa determinacionRelevanciaPorMotivoExcluirEmMassa;
	DeterminacionRelevanciaPorMotivoVisualizar determinacionRelevanciaPorMotivoVisualizar;
	DeterminacionRelevanciaPorMotivoExcluir determinacionRelevanciaPorMotivoExcluir;

	// Eventos e-Social > S1060 Ambientes de trabalho
	S1060AmbientesDeTrablhoCriar s1060AmbientesDeTrablhoCriar;
	S1060AmbientesDeTrablhoEditar s1060AmbientesDeTrablhoEditar;
	S1060AmbientesDeTrabalhoFiltroID s1060AmbientesDeTrabalhoFiltroID;
	S1060AmbientesDeTrablhoExcluirMassa s1060AmbientesDeTrablhoExcluirMassa;
	S1060AmbientesDeTrablhoExcluir s1060AmbientesDeTrablhoExcluir;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisi��o
	S1250Aquisi��oCriar s1250Aquisi��oCriar;
	S1250Aquisi��oEditar s1250Aquisi��oEditar;
	S1250Aquisi��oExcluir s1250Aquisi��oExcluir;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisi��o

	S1250Aquisi��oTotalCriar s1250Aquisi��oTotalCriar;
	S1250Aquisi��oTotalEditar s1250Aquisi��oTotalEditar;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Dados de eventos
	S1250DadosdeEventoCriar s1250DadosdeEventoCriar;
	S1250DadosdeEventoExcluir s1250DadosdeEventoExcluir;
	S1250DadosdeEventoEditar s1250DadosdeEventoEditar;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisi��o
	S1250DetAquisi��oCriar s1250DetAquisi��oCriar;
	S1250DetAquisi��oEditar s1250DetAquisi��oEditar;
	S1250DetAquisi��oExcluir s1250DetAquisi��oExcluir;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Det nota fiscal
	S1250DetNotaFiscalCriar s1250DetNotaFiscalCriar;
	S1250DetNotaFiscalEditar s1250DetNotaFiscalEditar;
	S1250DetNotaFiscalExcluir s1250DetNotaFiscalExcluir;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Det Processo Judicial
	S1250DetProcessoJudicialCriar s1250DetProcessoJudicialCriar;
	S1250DetProcessoJudicialEditar s1250DetProcessoJudicialEditar;
	S1250DetProcessoJudicialExcluir s1250DetProcessoJudicialExcluir;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Inf Proc Judicial
	S1250InfProcJudicialCriar s1250InfProcJudicialCriar;
	S1250InfProcJudicialEditar s1250InfProcJudicialEditar;
	S1250InfProcJudicialExcluir s1250InfProcJudicialExcluir;

	// Parametros Para Categoria De IRF
	ParametrosParaCategoriaDeIRFCriar parametrosParaCategoriaDeIRFCriar;
	ParametrosParaCategoriaDeIRFEditar parametrosParaCategoriaDeIRFEditar;
	ParametrosParaCategoriaDeIRFDetalhes parametrosParaCategoriaDeIRFDetalhes;
	ParametrosParaCategoriaDeIRFExcluir parametrosParaCategoriaDeIRFExcluir;
	ParametrosParaCategoriaDeIRFVisualizar parametrosParaCategoriaDeIRFVisualizar;
	ParametrosParaCategoriaDeIRFExcluirEmMasa parametrosParaCategoriaDeIRFExcluirEmMasa;
	// 0 --- 7

	@Test(priority = 0)
	public void regraDeReaberturaCriar() {

		System.out.println(
				"----Determina��o de Relev�ncia de Tarefa por Motivo de Reabertura >	Regra de Reabertura-------------");

		regraDeReaberturaCriar = new RegraDeReaberturaCriar();
		regraDeReaberturaCriar.beforeClass();
		regraDeReaberturaCriar.ingresar();
		regraDeReaberturaCriar.ingresarMDR();
		regraDeReaberturaCriar.criar();
		regraDeReaberturaCriar.afterClass();

	}

	@Test(priority = 1)
	public void regraDeReaberturaEditar() {

		regraDeReaberturaEditar = new RegraDeReaberturaEditar();
		regraDeReaberturaEditar.beforeClass();
		regraDeReaberturaEditar.ingresar();
		regraDeReaberturaEditar.ingresarMDR();
		regraDeReaberturaEditar.editar();
		regraDeReaberturaEditar.afterClass();

	}

	@Test(priority = 2)
	public void regraDeReaberturaDetalle() {

		regraDeReaberturaDetalle = new RegraDeReaberturaDetalle();
		regraDeReaberturaDetalle.beforeClass();
		regraDeReaberturaDetalle.ingresar();
		regraDeReaberturaDetalle.ingresarMDR();
		regraDeReaberturaDetalle.detalle();
		regraDeReaberturaDetalle.afterClass();

	}

	@Test(priority = 3)
	public void regraDeReaberturaExcluirMassa() {

		regraDeReaberturaExcluirMassa = new RegraDeReaberturaExcluirMassa();
		regraDeReaberturaExcluirMassa.beforeClass();
		regraDeReaberturaExcluirMassa.login();
		regraDeReaberturaExcluirMassa.acessarMDR();
		regraDeReaberturaExcluirMassa.criar();
		regraDeReaberturaExcluirMassa.afterClass();

	}

	@Test(priority = 4)
	public void regraDeReaberturaVisualizar() {

		regraDeReaberturaVisualizar = new RegraDeReaberturaVisualizar();
		regraDeReaberturaVisualizar.beforeClass();
		regraDeReaberturaVisualizar.ingresar();
		regraDeReaberturaVisualizar.ingresarMDR();
		regraDeReaberturaVisualizar.visualizar();
		regraDeReaberturaVisualizar.afterClass();

	}

	@Test(priority = 5)
	public void regraDeReaberturaExcluir() {

		regraDeReaberturaExcluir = new RegraDeReaberturaExcluir();
		regraDeReaberturaExcluir.beforeClass();
		regraDeReaberturaExcluir.ingresar();
		regraDeReaberturaExcluir.ingresarMDR();
		regraDeReaberturaExcluir.excluir();
		regraDeReaberturaExcluir.afterClass();

		System.out.println("-------------------Regra De Reabertura Fim-------------------------");

	}
	// 12

	// 7-------12

	@Test(priority = 7)
	public void cadastroDeObrasCriar() {

		System.out.println("----Cadastro Espec�fico do INSS (CEI) >	Cadastro de Obras-------------");

		cadastroDeObrasCriar = new CadastroDeObrasCriar();
		cadastroDeObrasCriar.beforeClass();
		cadastroDeObrasCriar.ingresar();
		cadastroDeObrasCriar.ingresarMDR();
		cadastroDeObrasCriar.criar();
		cadastroDeObrasCriar.afterClass();

	}

	@Test(priority = 7)
	public void cadastroDeObrasEditar() {

		cadastroDeObrasEditar = new CadastroDeObrasEditar();
		cadastroDeObrasEditar.beforeClass();
		cadastroDeObrasEditar.ingresar();
		cadastroDeObrasEditar.ingresarMDR();
		cadastroDeObrasEditar.editar();
		cadastroDeObrasEditar.afterClass();

	}

	@Test(priority = 8)
	public void cadastroDeObrasExcluir() {

		cadastroDeObrasExcluir = new CadastroDeObrasExcluir();
		cadastroDeObrasExcluir.beforeClass();
		cadastroDeObrasExcluir.ingresar();
		cadastroDeObrasExcluir.ingresarMDR();
		cadastroDeObrasExcluir.excluir();
		cadastroDeObrasExcluir.afterClass();
	}

	@Test(priority = 9)
	public void cadastroDeObrasExcluirEmMassa() {
		cadastroDeObrasExcluirEmMassa = new CadastroDeObrasExcluirEmMassa();
		cadastroDeObrasExcluirEmMassa.beforeClass();
		cadastroDeObrasExcluirEmMassa.ingresar();
		cadastroDeObrasExcluirEmMassa.mdrEntrar();
		cadastroDeObrasExcluirEmMassa.excluirEmMassa();
		cadastroDeObrasExcluirEmMassa.afterClass();

		System.out.println("-------------------Cadastro De Obras Fim-------------------------");
	}

	//// 13-------18

	@Test(priority = 13)
	public void configuracaoFundoSocailCriar() {

		System.out.println("----Configura��es de Fundo Social-------------");

		configuracaoFundoSocailCriar = new ConfiguracaoFundoSocailCriar();
		configuracaoFundoSocailCriar.beforeClass();
		configuracaoFundoSocailCriar.login();
		configuracaoFundoSocailCriar.acessarMDR();
		configuracaoFundoSocailCriar.criar();
		configuracaoFundoSocailCriar.afterClass();

	}

	@Test(priority = 14)
	public void configuracoesFundoSocialEditar() {

		configuracoesFundoSocialEditar = new ConfiguracoesFundoSocialEditar();
		configuracoesFundoSocialEditar.beforeClass();
		configuracoesFundoSocialEditar.ingresar();
		configuracoesFundoSocialEditar.ingresarMDR();
		configuracoesFundoSocialEditar.editar();
		configuracoesFundoSocialEditar.afterClass();

	}

	// 19------------24

	// 24 ---------30

	@Test(priority = 24)
	public void s2230AfastamentoTempor�rioFiltroId() {

		System.out.println("---- s2230  Afastamento Tempor�rio -------------");

		s2230AfastamentoTempor�rioFiltroId = new S2230AfastamentoTempor�rioFiltroId();
		s2230AfastamentoTempor�rioFiltroId.beforeClass();
		s2230AfastamentoTempor�rioFiltroId.login();
		s2230AfastamentoTempor�rioFiltroId.acessarMDR();
		s2230AfastamentoTempor�rioFiltroId.filtro();
		s2230AfastamentoTempor�rioFiltroId.afterClass();

	}

	// 31 -----------35

	@Test(priority = 31)
	public void cadastroContaisContabeisFiltroID() {

		System.out.println("---- cadastro ContaisContabeis -------------");

		cadastroContaisContabeisFiltroID = new CadastroContaisContabeisFiltroID();
		cadastroContaisContabeisFiltroID.beforeClass();
		cadastroContaisContabeisFiltroID.login();
		cadastroContaisContabeisFiltroID.acessarMDR();
		cadastroContaisContabeisFiltroID.filtro();
		cadastroContaisContabeisFiltroID.afterClass();

	}
	// 36 -------41

	@Test(priority = 36)
	public void dEPARAContasCont�beisCriar() {

		System.out.println("---- Cadastros IRPJ/CSLL > DE-PARA Contas Cont�beis -------------");

		dEPARAContasCont�beisCriar = new DEPARAContasCont�beisCriar();
		dEPARAContasCont�beisCriar.beforeClass();
		dEPARAContasCont�beisCriar.ingresar();
		dEPARAContasCont�beisCriar.ingresarMDR();
		dEPARAContasCont�beisCriar.criar();
		dEPARAContasCont�beisCriar.afterClass();

	}

	@Test(priority = 37)
	public void dEPARAContasCont�beisEditar() {

		dEPARAContasCont�beisEditar = new DEPARAContasCont�beisEditar();
		dEPARAContasCont�beisEditar.beforeClass();
		dEPARAContasCont�beisEditar.ingresar();
		dEPARAContasCont�beisEditar.ingresarMDR();
		dEPARAContasCont�beisEditar.Editar();
		dEPARAContasCont�beisEditar.afterClass();

	}

	@Test(priority = 38)
	public void dEPARAContasCont�beisVisualizar() {

		dEPARAContasCont�beisVisualizar = new DEPARAContasCont�beisVisualizar();
		dEPARAContasCont�beisVisualizar.beforeClass();
		dEPARAContasCont�beisVisualizar.ingresar();
		dEPARAContasCont�beisVisualizar.ingresarMDR();
		dEPARAContasCont�beisVisualizar.visualizar();
		dEPARAContasCont�beisVisualizar.afterClass();

	}

	@Test(priority = 39)
	public void dEPARAContasCont�beisExcluir() {

		dEPARAContasCont�beisExcluir = new DEPARAContasCont�beisExcluir();
		dEPARAContasCont�beisExcluir.beforeClass();
		dEPARAContasCont�beisExcluir.ingresar();
		dEPARAContasCont�beisExcluir.ingresarMDR();
		dEPARAContasCont�beisExcluir.excluir();
		dEPARAContasCont�beisExcluir.afterClass();

		System.out.println("-------------------Parametros Para Livro ICMSST Fim-------------------------");
	}

	// 41

	@Test(priority = 41)
	public void hierarquiaDeCenariosDeCorre�aoExcluirMasas() {

		System.out.println("---- Hierarquia De Cenarios De Corre�ao -------------");

		hierarquiaDeCenariosDeCorre�aoExcluirMasas = new HierarquiaDeCenariosDeCorre�aoExcluirMasas();
		hierarquiaDeCenariosDeCorre�aoExcluirMasas.beforeClass();
		hierarquiaDeCenariosDeCorre�aoExcluirMasas.login();
		hierarquiaDeCenariosDeCorre�aoExcluirMasas.acessarMDR();
		hierarquiaDeCenariosDeCorre�aoExcluirMasas.criar();
		hierarquiaDeCenariosDeCorre�aoExcluirMasas.afterClass();

	}

	// 42

	@Test(priority = 42)
	public void cadastroCondi�aoExcluirMasas() {

		System.out.println("---- Cadastro Condicao-------------");

		cadastroCondi�aoExcluirMasas = new CadastroCondi�aoExcluirMasas();
		cadastroCondi�aoExcluirMasas.beforeClass();
		cadastroCondi�aoExcluirMasas.login();
		cadastroCondi�aoExcluirMasas.acessarMDR();
		cadastroCondi�aoExcluirMasas.criar();
		cadastroCondi�aoExcluirMasas.afterClass();

	}

	// 43
	@Test(priority = 43)
	public void responsavelMovimientoExcluirMasas() {

		System.out.println("---- Responsavel Movimiento -------------");

		responsavelMovimientoExcluirMasas = new ResponsavelMovimientoExcluirMasas();
		responsavelMovimientoExcluirMasas.beforeClass();
		responsavelMovimientoExcluirMasas.login();
		responsavelMovimientoExcluirMasas.acessarMDR();
		responsavelMovimientoExcluirMasas.criar();
		responsavelMovimientoExcluirMasas.afterClass();

	}

	// 44
	@Test(priority = 44)
	public void instituicaoExcluirMasas() {

		System.out.println("----  institucao  -------------");

		instituicaoExcluirMasas = new InstituicaoExcluirMasas();
		instituicaoExcluirMasas.beforeClass();
		instituicaoExcluirMasas.login();
		instituicaoExcluirMasas.acessarMDR();
		instituicaoExcluirMasas.criar();
		instituicaoExcluirMasas.afterClass();

	}

	// 45

	@Test(priority = 45)
	public void parametrosParaLivroICMSSTExcluirMasas() {

		System.out.println("----  Parametros Para Livro ICMSS  -------------");

		parametrosParaLivroICMSSTExcluirMasas = new ParametrosParaLivroICMSSTExcluirMasas();
		parametrosParaLivroICMSSTExcluirMasas.beforeClass();
		parametrosParaLivroICMSSTExcluirMasas.login();
		parametrosParaLivroICMSSTExcluirMasas.acessarMDR();
		parametrosParaLivroICMSSTExcluirMasas.criar();
		parametrosParaLivroICMSSTExcluirMasas.afterClass();

	}

	// 46
	@Test(priority = 46)
	public void contasCont�beisRBLPFiltroId() {

		System.out.println("----  Contas Cont�beis RBLP  -------------");

		contasCont�beisRBLPFiltroId = new ContasCont�beisRBLPFiltroId();
		contasCont�beisRBLPFiltroId.beforeClass();
		contasCont�beisRBLPFiltroId.login();
		contasCont�beisRBLPFiltroId.acessarMDR();
		contasCont�beisRBLPFiltroId.filtro();
		contasCont�beisRBLPFiltroId.afterClass();

	}
	// 47 -52

	@Test(priority = 47)
	public void parametriza��oDoLivroOficial() {

		System.out.println("----  Parametriza��o Do Livro Oficial  -------------");

		parametriza��oDoLivroOficial = new Parametriza��oDoLivroOficial();
		parametriza��oDoLivroOficial.beforeClass();
		parametriza��oDoLivroOficial.login();
		parametriza��oDoLivroOficial.acessarMDR();
		parametriza��oDoLivroOficial.criar();
		parametriza��oDoLivroOficial.afterClass();
	}

	@Test(priority = 48)
	public void parametriza��oDoLivroOficialEditar() {
		parametriza��oDoLivroOficialEditar = new Parametriza��oDoLivroOficialEditar();
		parametriza��oDoLivroOficialEditar.beforeClass();
		parametriza��oDoLivroOficialEditar.login();
		parametriza��oDoLivroOficialEditar.acessarMDR();
		parametriza��oDoLivroOficialEditar.Editar();
		parametriza��oDoLivroOficialEditar.afterClass();
	}

	@Test(priority = 48)
	public void parametriza��oDoLivroOficialVisualizar() {
		parametriza��oDoLivroOficialVisualizar = new Parametriza��oDoLivroOficialVisualizar();
		parametriza��oDoLivroOficialVisualizar.beforeClass();
		parametriza��oDoLivroOficialVisualizar.ingresar();
		parametriza��oDoLivroOficialVisualizar.ingresarMDR();
		parametriza��oDoLivroOficialVisualizar.visualizar();
		parametriza��oDoLivroOficialVisualizar.afterClass();
	}

	@Test(priority = 49)
	public void parametriza��oDoLivroOficialExcluir() {
		parametriza��oDoLivroOficialExcluir = new Parametriza��oDoLivroOficialExcluir();
		parametriza��oDoLivroOficialExcluir.beforeClass();
		parametriza��oDoLivroOficialExcluir.login();
		parametriza��oDoLivroOficialExcluir.acessarMDR();
		parametriza��oDoLivroOficialExcluir.excluir();
		parametriza��oDoLivroOficialExcluir.afterClass();
	}

	@Test(priority = 50)
	public void cadastroDeC�digoDeRegrasCriar() {

		System.out.println("----  Determinacao De Relevancia De Tarefa > Cadastro De C�digo De Regras  -------------");

		cadastroDeC�digoDeRegrasCriar = new CadastroDeC�digoDeRegrasCriar();
		cadastroDeC�digoDeRegrasCriar.beforeClass();
		cadastroDeC�digoDeRegrasCriar.login();
		cadastroDeC�digoDeRegrasCriar.acessarMDR();
		cadastroDeC�digoDeRegrasCriar.criar();
		cadastroDeC�digoDeRegrasCriar.afterClass();
	}

	// Determinacao Relevancia Tarefa Motivo Reabertura > Determinacion Relevancia
	// Por Motivo

	@Test(priority = 51)
	public void determinacionRelevanciaPorMotivoCriar() {

		System.out.println(
				"---- Determinacao Relevancia Tarefa Motivo Reabertura > Determinacion Relevancia Por Motivo  -------------");

		determinacionRelevanciaPorMotivoCriar = new DeterminacionRelevanciaPorMotivoCriar();
		determinacionRelevanciaPorMotivoCriar.beforeClass();
		determinacionRelevanciaPorMotivoCriar.login();
		determinacionRelevanciaPorMotivoCriar.acessarMDR();
		determinacionRelevanciaPorMotivoCriar.criar();
		determinacionRelevanciaPorMotivoCriar.afterClass();
	}

	@Test(priority = 52)
	public void determinacionRelevanciaPorMotivoEditar() {

		determinacionRelevanciaPorMotivoEditar = new DeterminacionRelevanciaPorMotivoEditar();
		determinacionRelevanciaPorMotivoEditar.beforeClass();
		determinacionRelevanciaPorMotivoEditar.login();
		determinacionRelevanciaPorMotivoEditar.acessarMDR();
		determinacionRelevanciaPorMotivoEditar.editar();
		determinacionRelevanciaPorMotivoEditar.afterClass();
	}

	@Test(priority = 53)
	public void determinacionRelevanciaPorMotivoDetalles() {

		determinacionRelevanciaPorMotivoDetalles = new DeterminacionRelevanciaPorMotivoDetalles();
		determinacionRelevanciaPorMotivoDetalles.beforeClass();
		determinacionRelevanciaPorMotivoDetalles.login();
		determinacionRelevanciaPorMotivoDetalles.acessarMDR();
		determinacionRelevanciaPorMotivoDetalles.detalhes();
		determinacionRelevanciaPorMotivoDetalles.afterClass();
	}

	@Test(priority = 54)
	
	public void determinacionRelevanciaPorMotivoVisualizar() {

		determinacionRelevanciaPorMotivoVisualizar = new DeterminacionRelevanciaPorMotivoVisualizar();
		determinacionRelevanciaPorMotivoVisualizar.beforeClass();
		determinacionRelevanciaPorMotivoVisualizar.login();
		determinacionRelevanciaPorMotivoVisualizar.acessarMDR();
		determinacionRelevanciaPorMotivoVisualizar.visualizar();
		determinacionRelevanciaPorMotivoVisualizar.afterClass();
	}

	@Test(priority = 55)
	
	public void determinacionRelevanciaPorMotivoExcluirEmMassa() {

		determinacionRelevanciaPorMotivoExcluirEmMassa = new DeterminacionRelevanciaPorMotivoExcluirEmMassa();
		determinacionRelevanciaPorMotivoExcluirEmMassa.beforeClass();
		determinacionRelevanciaPorMotivoExcluirEmMassa.ingresar();
		determinacionRelevanciaPorMotivoExcluirEmMassa.mdrEntrar();
		determinacionRelevanciaPorMotivoExcluirEmMassa.criar();
		determinacionRelevanciaPorMotivoExcluirEmMassa.excluir();
		determinacionRelevanciaPorMotivoExcluirEmMassa.afterClass();
	}

	@Test(priority = 56)
	
	public void determinacionRelevanciaPorMotivoExcluir() {

		determinacionRelevanciaPorMotivoExcluir = new DeterminacionRelevanciaPorMotivoExcluir();
		determinacionRelevanciaPorMotivoExcluir.beforeClass();
		determinacionRelevanciaPorMotivoExcluir.login();
		determinacionRelevanciaPorMotivoExcluir.acessarMDR();
		determinacionRelevanciaPorMotivoExcluir.excluir();
		determinacionRelevanciaPorMotivoExcluir.afterClass();

		System.out.println(
				"---- Determinacao Relevancia Tarefa Motivo Reabertura > Determinacion Relevancia Por Motivo Fim -------------");

	}

	// Eventos e-Social > S1060 Ambientes de trabalho

	@Test(priority = 57)
	
	public void s1060AmbientesDeTrablhoCriar() {

		System.out.println("---- Eventos e-Social > S1060 Ambientes de trabalho -------------");

		s1060AmbientesDeTrablhoCriar = new S1060AmbientesDeTrablhoCriar();
		s1060AmbientesDeTrablhoCriar.beforeClass();
		s1060AmbientesDeTrablhoCriar.login();
		s1060AmbientesDeTrablhoCriar.acessarMDR();
		s1060AmbientesDeTrablhoCriar.criar();
		s1060AmbientesDeTrablhoCriar.afterClass();
	}

	@Test(priority = 58)
	
	public void s1060AmbientesDeTrablhoEditar() {

		s1060AmbientesDeTrablhoEditar = new S1060AmbientesDeTrablhoEditar();
		s1060AmbientesDeTrablhoEditar.beforeClass();
		s1060AmbientesDeTrablhoEditar.login();
		s1060AmbientesDeTrablhoEditar.acessarMDR();
		s1060AmbientesDeTrablhoEditar.editar();
		s1060AmbientesDeTrablhoEditar.afterClass();
	}

	@Test(priority = 59)
	
	public void s1060AmbientesDeTrabalhoFiltroID() {

		s1060AmbientesDeTrabalhoFiltroID = new S1060AmbientesDeTrabalhoFiltroID();
		s1060AmbientesDeTrabalhoFiltroID.beforeClass();
		s1060AmbientesDeTrabalhoFiltroID.login();
		s1060AmbientesDeTrabalhoFiltroID.acessarMDR();
		s1060AmbientesDeTrabalhoFiltroID.filtro();
		s1060AmbientesDeTrabalhoFiltroID.afterClass();
	}

	@Test(priority = 60)
	
	public void s1060AmbientesDeTrablhoExcluirMassa() {

		s1060AmbientesDeTrablhoExcluirMassa = new S1060AmbientesDeTrablhoExcluirMassa();
		s1060AmbientesDeTrablhoExcluirMassa.beforeClass();
		s1060AmbientesDeTrablhoExcluirMassa.login();
		s1060AmbientesDeTrablhoExcluirMassa.acessarMDR();
		s1060AmbientesDeTrablhoExcluirMassa.criar();
		s1060AmbientesDeTrablhoExcluirMassa.afterClass();
	}

	@Test(priority = 61)
	
	public void s1060AmbientesDeTrablhoExcluir() {

		s1060AmbientesDeTrablhoExcluir = new S1060AmbientesDeTrablhoExcluir();
		s1060AmbientesDeTrablhoExcluir.beforeClass();
		s1060AmbientesDeTrablhoExcluir.login();
		s1060AmbientesDeTrablhoExcluir.acessarMDR();
		s1060AmbientesDeTrablhoExcluir.excluir();
		s1060AmbientesDeTrablhoExcluir.afterClass();
		System.out.println("---- Eventos e-Social > S1060 Ambientes de trabalho FIM -------------");

	}

//Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisi��o

	@Test(priority = 62)
	
	public void s1250Aquisi��oCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisi��o -------------");

		s1250Aquisi��oCriar = new S1250Aquisi��oCriar();
		s1250Aquisi��oCriar.beforeClass();
		s1250Aquisi��oCriar.login();
		s1250Aquisi��oCriar.acessarMDR();
		s1250Aquisi��oCriar.criar();
		s1250Aquisi��oCriar.afterClass();
	}

	@Test(priority = 63)
	
	public void s1250Aquisi��oEditar() {

		s1250Aquisi��oEditar = new S1250Aquisi��oEditar();
		s1250Aquisi��oEditar.beforeClass();
		s1250Aquisi��oEditar.login();
		s1250Aquisi��oEditar.acessarMDR();
		s1250Aquisi��oEditar.editar();
		s1250Aquisi��oEditar.afterClass();
	}

	@Test(priority = 64)
	
	public void s1250Aquisi��oExcluir() {

		s1250Aquisi��oExcluir = new S1250Aquisi��oExcluir();
		s1250Aquisi��oExcluir.beforeClass();
		s1250Aquisi��oExcluir.login();
		s1250Aquisi��oExcluir.acessarMDR();
		s1250Aquisi��oExcluir.excluir();
		s1250Aquisi��oExcluir.afterClass();

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisi��o FIM -------------");

	}

//Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisi��o Toltal

	@Test(priority = 65)
	
	public void s1250Aquisi��oTotalCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisi��o Toltal -------------");

		s1250Aquisi��oTotalCriar = new S1250Aquisi��oTotalCriar();
		s1250Aquisi��oTotalCriar.beforeClass();
		s1250Aquisi��oTotalCriar.login();
		s1250Aquisi��oTotalCriar.acessarMDR();
		s1250Aquisi��oTotalCriar.criar();
		s1250Aquisi��oTotalCriar.afterClass();
	}

	@Test(priority = 66)
	
	public void s1250Aquisi��oTotalEditar() {

		s1250Aquisi��oTotalEditar = new S1250Aquisi��oTotalEditar();
		s1250Aquisi��oTotalEditar.beforeClass();
		s1250Aquisi��oTotalEditar.login();
		s1250Aquisi��oTotalEditar.acessarMDR();
		s1250Aquisi��oTotalEditar.editar();
		s1250Aquisi��oTotalEditar.afterClass();
	}
//Eventos e-social > S1250 Aquisicao De Producao Rural/Dados de eventos

	@Test(priority = 67)
	
	public void s1250DadosdeEventoCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Dados de eventos -------------");

		s1250DadosdeEventoCriar = new S1250DadosdeEventoCriar();
		s1250DadosdeEventoCriar.beforeClass();
		s1250DadosdeEventoCriar.login();
		s1250DadosdeEventoCriar.acessarMDR();
		s1250DadosdeEventoCriar.criar();
		s1250DadosdeEventoCriar.afterClass();
	}

	@Test(priority = 68)
	
	public void s1250DadosdeEventoEditar() {

		s1250DadosdeEventoEditar = new S1250DadosdeEventoEditar();
		s1250DadosdeEventoEditar.beforeClass();
		s1250DadosdeEventoEditar.login();
		s1250DadosdeEventoEditar.acessarMDR();
		s1250DadosdeEventoEditar.editar();
		s1250DadosdeEventoEditar.afterClass();
	}

	@Test(priority = 69)
	
	public void s1250DadosdeEventoExcluir() {

		s1250DadosdeEventoExcluir = new S1250DadosdeEventoExcluir();
		s1250DadosdeEventoExcluir.beforeClass();
		s1250DadosdeEventoExcluir.login();
		s1250DadosdeEventoExcluir.acessarMDR();
		s1250DadosdeEventoExcluir.excluir();
		s1250DadosdeEventoExcluir.afterClass();
		System.out.println(
				"---- Eventos e-social > S1250 Aquisicao De Producao Rural/Dados de eventos Fim -------------");

	}

//Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisi��o

	@Test(priority = 70)
	
	public void s1250DetAquisi��oCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisi��o -------------");

		s1250DetAquisi��oCriar = new S1250DetAquisi��oCriar();
		s1250DetAquisi��oCriar.beforeClass();
		s1250DetAquisi��oCriar.login();
		s1250DetAquisi��oCriar.acessarMDR();
		s1250DetAquisi��oCriar.criar();
		s1250DetAquisi��oCriar.afterClass();
	}
	
	@Test(priority = 71)

	public void s1250DetAquisi��oEditar() {

		s1250DetAquisi��oEditar = new S1250DetAquisi��oEditar();
		s1250DetAquisi��oEditar.beforeClass();
		s1250DetAquisi��oEditar.login();
		s1250DetAquisi��oEditar.acessarMDR();
		s1250DetAquisi��oEditar.editar();
		s1250DetAquisi��oEditar.afterClass();
	}

	@Test(priority = 72)
	
	public void s1250DetAquisi��oExcluir() {

		s1250DetAquisi��oExcluir = new S1250DetAquisi��oExcluir();
		s1250DetAquisi��oExcluir.beforeClass();
		s1250DetAquisi��oExcluir.login();
		s1250DetAquisi��oExcluir.acessarMDR();
		s1250DetAquisi��oExcluir.excluir();
		s1250DetAquisi��oExcluir.afterClass();

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisi��o Fim -------------");

	}

//Eventos e-social > S1250 Aquisicao De Producao Rural/Det nota fiscal

	@Test(priority = 73)
	
	public void s1250DetNotaFiscalCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Det nota fiscal  -------------");

		s1250DetNotaFiscalCriar = new S1250DetNotaFiscalCriar();
		s1250DetNotaFiscalCriar.beforeClass();
		s1250DetNotaFiscalCriar.login();
		s1250DetNotaFiscalCriar.acessarMDR();
		s1250DetNotaFiscalCriar.criar();
		s1250DetNotaFiscalCriar.afterClass();
	}

	@Test(priority = 74)
	
	public void S1250DetNotaFiscalEditar() {

		s1250DetNotaFiscalEditar = new S1250DetNotaFiscalEditar();
		s1250DetNotaFiscalEditar.beforeClass();
		s1250DetNotaFiscalEditar.login();
		s1250DetNotaFiscalEditar.acessarMDR();
		s1250DetNotaFiscalEditar.editar();
		s1250DetNotaFiscalEditar.afterClass();
	}

	@Test(priority = 75)
	
	public void S1250DetNotaFiscalExcluir() {

		s1250DetNotaFiscalExcluir = new S1250DetNotaFiscalExcluir();
		s1250DetNotaFiscalExcluir.beforeClass();
		s1250DetNotaFiscalExcluir.login();
		s1250DetNotaFiscalExcluir.acessarMDR();
		s1250DetNotaFiscalExcluir.excluir();
		s1250DetNotaFiscalExcluir.afterClass();
		System.out
				.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Det nota fiscal fim -------------");

	}
//Eventos e-social > S1250 Aquisicao De Producao Rural/Det Processo Judicial

	@Test(priority = 76)
	
	public void s1250DetProcessoJudicialCriar() {

		System.out.println(
				"---- Eventos e-social > S1250 Aquisicao De Producao Rural/Det Processo Judicial  -------------");

		s1250DetProcessoJudicialCriar = new S1250DetProcessoJudicialCriar();
		s1250DetProcessoJudicialCriar.beforeClass();
		s1250DetProcessoJudicialCriar.login();
		s1250DetProcessoJudicialCriar.acessarMDR();
		s1250DetProcessoJudicialCriar.criar();
		s1250DetProcessoJudicialCriar.afterClass();
	}

	@Test(priority = 77)
	
	public void s1250DetProcessoJudicialEditar() {

		s1250DetProcessoJudicialEditar = new S1250DetProcessoJudicialEditar();
		s1250DetProcessoJudicialEditar.beforeClass();
		s1250DetProcessoJudicialEditar.login();
		s1250DetProcessoJudicialEditar.acessarMDR();
		s1250DetProcessoJudicialEditar.editar();
		s1250DetProcessoJudicialEditar.afterClass();
	}

	@Test(priority = 78)
	
	public void s1250DetProcessoJudicialExcluir() {

		s1250DetProcessoJudicialExcluir = new S1250DetProcessoJudicialExcluir();
		s1250DetProcessoJudicialExcluir.beforeClass();
		s1250DetProcessoJudicialExcluir.login();
		s1250DetProcessoJudicialExcluir.acessarMDR();
		s1250DetProcessoJudicialExcluir.excluir();
		s1250DetProcessoJudicialExcluir.afterClass();
		System.out.println(
				"----  Eventos e-social > S1250 Aquisicao De Producao Rural/Det Processo Judicial fim -------------");

	}

//Eventos e-social > S1250 Aquisicao De Producao Rural/Inf Proc Judicial

	@Test(priority = 79)
	
	public void s1250InfProcJudicialCriar() {

		System.out.println("----Eventos e-social > S1250 Aquisicao De Producao Rural/Inf Proc Judicial  -------------");

		s1250InfProcJudicialCriar = new S1250InfProcJudicialCriar();
		s1250InfProcJudicialCriar.beforeClass();
		s1250InfProcJudicialCriar.login();
		s1250InfProcJudicialCriar.acessarMDR();
		s1250InfProcJudicialCriar.criar();
		s1250InfProcJudicialCriar.afterClass();
	}

	@Test(priority = 80)
	
	public void s1250InfProcJudicialEditar() {

		s1250InfProcJudicialEditar = new S1250InfProcJudicialEditar();
		s1250InfProcJudicialEditar.beforeClass();
		s1250InfProcJudicialEditar.login();
		s1250InfProcJudicialEditar.acessarMDR();
		s1250InfProcJudicialEditar.editar();
		s1250InfProcJudicialEditar.afterClass();
	}

	@Test(priority = 81)
	
	public void s1250InfProcJudicialExcluir() {

		s1250InfProcJudicialExcluir = new S1250InfProcJudicialExcluir();
		s1250InfProcJudicialExcluir.beforeClass();
		s1250InfProcJudicialExcluir.login();
		s1250InfProcJudicialExcluir.acessarMDR();
		s1250InfProcJudicialExcluir.excluir();
		s1250InfProcJudicialExcluir.afterClass();
		System.out.println(
				"----  Eventos e-social > S1250 Aquisicao De Producao Rural/Inf Proc Judicial fim -------------");

	}
	
	//Parametros Para Categoria De IRF
	
	@Test(priority = 82)
	
	public void parametrosParaCategoriaDeIRFCriar() {

		System.out.println("----Parametros Para Categoria De IRF-------------");

		parametrosParaCategoriaDeIRFCriar = new ParametrosParaCategoriaDeIRFCriar();
		parametrosParaCategoriaDeIRFCriar.beforeClass();
		parametrosParaCategoriaDeIRFCriar.login();
		parametrosParaCategoriaDeIRFCriar.acessarMDR();
		parametrosParaCategoriaDeIRFCriar.criar();
		parametrosParaCategoriaDeIRFCriar.afterClass();
	}
	
	@Test(priority = 83)
	
	public void parametrosParaCategoriaDeIRFDetalhes() {

		parametrosParaCategoriaDeIRFDetalhes = new ParametrosParaCategoriaDeIRFDetalhes();
		parametrosParaCategoriaDeIRFDetalhes.beforeClass();
		parametrosParaCategoriaDeIRFDetalhes.login();
		parametrosParaCategoriaDeIRFDetalhes.acessarMDR();
		parametrosParaCategoriaDeIRFDetalhes.detalhes();
		parametrosParaCategoriaDeIRFDetalhes.afterClass();
	}
	
	

	@Test(priority = 84)
	
	public void parametrosParaCategoriaDeIRFEditar() {

		parametrosParaCategoriaDeIRFEditar = new ParametrosParaCategoriaDeIRFEditar();
		parametrosParaCategoriaDeIRFEditar.beforeClass();
		parametrosParaCategoriaDeIRFEditar.login();
		parametrosParaCategoriaDeIRFEditar.acessarMDR();
		parametrosParaCategoriaDeIRFEditar.editar();
		parametrosParaCategoriaDeIRFEditar.afterClass();
	}
	
	@Test(priority = 85)
	
	public void parametrosParaCategoriaDeIRFVisualizar() {

		parametrosParaCategoriaDeIRFVisualizar = new ParametrosParaCategoriaDeIRFVisualizar();
		parametrosParaCategoriaDeIRFVisualizar.beforeClass();
		parametrosParaCategoriaDeIRFVisualizar.ingresar();
		parametrosParaCategoriaDeIRFVisualizar.ingresarMDR();
		parametrosParaCategoriaDeIRFVisualizar.visualizar();
		parametrosParaCategoriaDeIRFVisualizar.afterClass();
	}
	

	@Test(priority = 86)
	
	public void parametrosParaCategoriaDeIRFExcluirEmMasa() {

		parametrosParaCategoriaDeIRFExcluirEmMasa = new ParametrosParaCategoriaDeIRFExcluirEmMasa();
		parametrosParaCategoriaDeIRFExcluirEmMasa.beforeClass();
		parametrosParaCategoriaDeIRFExcluirEmMasa.login();
		parametrosParaCategoriaDeIRFExcluirEmMasa.acessarMDR();
		parametrosParaCategoriaDeIRFExcluirEmMasa.excluir();
		parametrosParaCategoriaDeIRFExcluirEmMasa.afterClass();
	}
	
	@Test(priority = 87)
	
	public void parametrosParaCategoriaDeIRFExcluir() {

		parametrosParaCategoriaDeIRFExcluir = new ParametrosParaCategoriaDeIRFExcluir();
		parametrosParaCategoriaDeIRFExcluir.beforeClass();
		parametrosParaCategoriaDeIRFExcluir.login();
		parametrosParaCategoriaDeIRFExcluir.acessarMDR();
		parametrosParaCategoriaDeIRFExcluir.excluir();
		parametrosParaCategoriaDeIRFExcluir.afterClass();
		System.out.println("----Parametros Para Categoria De IRF fim-------------");

	}


}
