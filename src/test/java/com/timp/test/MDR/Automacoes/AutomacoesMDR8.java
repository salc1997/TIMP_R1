package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriar;
import com.timp.test.MDR.CadastroCondiçao.CadastroCondiçaoExcluirMasas;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimientoExcluirMasas;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoExcluirMasas;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasCriar;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasEditar;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasExcluir;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasExcluirEmMassa;
import com.timp.test.MDR.CadastrosIRPJCSLL.CadastroContaisContabeis.CadastroContaisContabeisFiltroID;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasContábeisRBLP.ContasContábeisRBLPFiltroId;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisEditar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisExcluir;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisVisualizar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailCriar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialEditar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.CadastroDeCódigoDeRegras.CadastroDeCódigoDeRegrasCriar;
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
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição.S1250AquisiçãoCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição.S1250AquisiçãoEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição.S1250AquisiçãoExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisiçãoTotal.S1250AquisiçãoTotalCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisiçãoTotal.S1250AquisiçãoTotalEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEventos.S1250DadosdeEventoCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEventos.S1250DadosdeEventoEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEventos.S1250DadosdeEventoExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisição.S1250DetAquisiçãoCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisição.S1250DetAquisiçãoEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisição.S1250DetAquisiçãoExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialExcluir;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial.S1250InfProcJudicialCriar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial.S1250InfProcJudicialEditar;
import com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial.S1250InfProcJudicialExcluir;
import com.timp.test.MDR.EventosESocial.S2230AfastamentoTemporário.S2230AfastamentoTemporárioFiltroId;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirMasas;
import com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficial;
import com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialEditar;
import com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialExcluir;
import com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialVisualizar;
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

	// Determinação de Relevância de Tarefa por Motivo de Reabertura > Regra de
	// Reabertura
	RegraDeReaberturaCriar regraDeReaberturaCriar;
	RegraDeReaberturaEditar regraDeReaberturaEditar;
	RegraDeReaberturaDetalle regraDeReaberturaDetalle;
	RegraDeReaberturaVisualizar regraDeReaberturaVisualizar;
	RegraDeReaberturaExcluir regraDeReaberturaExcluir;
	RegraDeReaberturaExcluirMassa regraDeReaberturaExcluirMassa;

	// Cadastro Específico do INSS (CEI) > Cadastro de Obras
	CadastroDeObrasCriar cadastroDeObrasCriar;
	CadastroDeObrasEditar cadastroDeObrasEditar;
	CadastroDeObrasExcluir cadastroDeObrasExcluir;
	CadastroDeObrasExcluirEmMassa cadastroDeObrasExcluirEmMassa;
	// Cadastro Específico do INSS (CEI) > Cadastro de Obras
	ConfiguracaoFundoSocailCriar configuracaoFundoSocailCriar;
	ConfiguracoesFundoSocialEditar configuracoesFundoSocialEditar;

	// Livros Fiscais > Parâmetros para Livro ICMS ST

	ParametrosParaLivroICMSSTCriar parametrosParaLivroICMSSTCriar;
	ParametrosParaLivroICMSSTEditar parametrosParaLivroICMSSTEditar;
	ParametrosParaLivroICMSSTVisualizar parametrosParaLivroICMSSTVisualizar;
	ParametrosParaLivroICMSSTDetalle parametrosParaLivroICMSSTDetalle;
	ParametrosParaLivroICMSSTExcluir parametrosParaLivroICMSSTExcluir;

	// S2230 AfastamentoTemporário

	S2230AfastamentoTemporárioFiltroId s2230AfastamentoTemporárioFiltroId;

	// Cadastros IRPJ/CSLL > Cadastro Contas Contábeis
	CadastroContaisContabeisFiltroID cadastroContaisContabeisFiltroID;

	// Cadastros IRPJ/CSLL DE-PARA Contas Contábeis
	DEPARAContasContábeisCriar dEPARAContasContábeisCriar;
	DEPARAContasContábeisEditar dEPARAContasContábeisEditar;
	DEPARAContasContábeisVisualizar dEPARAContasContábeisVisualizar;
	DEPARAContasContábeisExcluir dEPARAContasContábeisExcluir;

	// Hierarquia De Cenarios De Correçao
	HierarquiaDeCenariosDeCorreçaoExcluirMasas hierarquiaDeCenariosDeCorreçaoExcluirMasas;

	// Cadastro Condiçao
	CadastroCondiçaoExcluirMasas cadastroCondiçaoExcluirMasas;

	// Cadastro Derex > Cadastro Responsável pelo Movimento

	ResponsavelMovimientoExcluirMasas responsavelMovimientoExcluirMasas;

	// Cadastro Derex > Instituição Financeira
	InstituicaoExcluirMasas instituicaoExcluirMasas;

	// Livros Fiscais > Parâmetros para Livro ICMS ST
	ParametrosParaLivroICMSSTExcluirMasas parametrosParaLivroICMSSTExcluirMasas;

	// Cadastros IRPJ/CSLL > Contas Contábeis RB/LP
	ContasContábeisRBLPFiltroId contasContábeisRBLPFiltroId;

	// Parametrização Do Livro Oficial
	ParametrizaçãoDoLivroOficial parametrizaçãoDoLivroOficial;
	ParametrizaçãoDoLivroOficialEditar parametrizaçãoDoLivroOficialEditar;
	ParametrizaçãoDoLivroOficialVisualizar parametrizaçãoDoLivroOficialVisualizar;
	ParametrizaçãoDoLivroOficialExcluir parametrizaçãoDoLivroOficialExcluir;

	// Determinacao De Relevancia De Tarefa > Cadastro De Código De Regras
	CadastroDeCódigoDeRegrasCriar cadastroDeCódigoDeRegrasCriar;
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

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisição
	S1250AquisiçãoCriar s1250AquisiçãoCriar;
	S1250AquisiçãoEditar s1250AquisiçãoEditar;
	S1250AquisiçãoExcluir s1250AquisiçãoExcluir;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisição

	S1250AquisiçãoTotalCriar s1250AquisiçãoTotalCriar;
	S1250AquisiçãoTotalEditar s1250AquisiçãoTotalEditar;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Dados de eventos
	S1250DadosdeEventoCriar s1250DadosdeEventoCriar;
	S1250DadosdeEventoExcluir s1250DadosdeEventoExcluir;
	S1250DadosdeEventoEditar s1250DadosdeEventoEditar;

	// Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisição
	S1250DetAquisiçãoCriar s1250DetAquisiçãoCriar;
	S1250DetAquisiçãoEditar s1250DetAquisiçãoEditar;
	S1250DetAquisiçãoExcluir s1250DetAquisiçãoExcluir;

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
				"----Determinação de Relevância de Tarefa por Motivo de Reabertura >	Regra de Reabertura-------------");

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

		System.out.println("----Cadastro Específico do INSS (CEI) >	Cadastro de Obras-------------");

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

		System.out.println("----Configurações de Fundo Social-------------");

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
	public void s2230AfastamentoTemporárioFiltroId() {

		System.out.println("---- s2230  Afastamento Temporário -------------");

		s2230AfastamentoTemporárioFiltroId = new S2230AfastamentoTemporárioFiltroId();
		s2230AfastamentoTemporárioFiltroId.beforeClass();
		s2230AfastamentoTemporárioFiltroId.login();
		s2230AfastamentoTemporárioFiltroId.acessarMDR();
		s2230AfastamentoTemporárioFiltroId.filtro();
		s2230AfastamentoTemporárioFiltroId.afterClass();

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
	public void dEPARAContasContábeisCriar() {

		System.out.println("---- Cadastros IRPJ/CSLL > DE-PARA Contas Contábeis -------------");

		dEPARAContasContábeisCriar = new DEPARAContasContábeisCriar();
		dEPARAContasContábeisCriar.beforeClass();
		dEPARAContasContábeisCriar.ingresar();
		dEPARAContasContábeisCriar.ingresarMDR();
		dEPARAContasContábeisCriar.criar();
		dEPARAContasContábeisCriar.afterClass();

	}

	@Test(priority = 37)
	public void dEPARAContasContábeisEditar() {

		dEPARAContasContábeisEditar = new DEPARAContasContábeisEditar();
		dEPARAContasContábeisEditar.beforeClass();
		dEPARAContasContábeisEditar.ingresar();
		dEPARAContasContábeisEditar.ingresarMDR();
		dEPARAContasContábeisEditar.Editar();
		dEPARAContasContábeisEditar.afterClass();

	}

	@Test(priority = 38)
	public void dEPARAContasContábeisVisualizar() {

		dEPARAContasContábeisVisualizar = new DEPARAContasContábeisVisualizar();
		dEPARAContasContábeisVisualizar.beforeClass();
		dEPARAContasContábeisVisualizar.ingresar();
		dEPARAContasContábeisVisualizar.ingresarMDR();
		dEPARAContasContábeisVisualizar.visualizar();
		dEPARAContasContábeisVisualizar.afterClass();

	}

	@Test(priority = 39)
	public void dEPARAContasContábeisExcluir() {

		dEPARAContasContábeisExcluir = new DEPARAContasContábeisExcluir();
		dEPARAContasContábeisExcluir.beforeClass();
		dEPARAContasContábeisExcluir.ingresar();
		dEPARAContasContábeisExcluir.ingresarMDR();
		dEPARAContasContábeisExcluir.excluir();
		dEPARAContasContábeisExcluir.afterClass();

		System.out.println("-------------------Parametros Para Livro ICMSST Fim-------------------------");
	}

	// 41

	@Test(priority = 41)
	public void hierarquiaDeCenariosDeCorreçaoExcluirMasas() {

		System.out.println("---- Hierarquia De Cenarios De Correçao -------------");

		hierarquiaDeCenariosDeCorreçaoExcluirMasas = new HierarquiaDeCenariosDeCorreçaoExcluirMasas();
		hierarquiaDeCenariosDeCorreçaoExcluirMasas.beforeClass();
		hierarquiaDeCenariosDeCorreçaoExcluirMasas.login();
		hierarquiaDeCenariosDeCorreçaoExcluirMasas.acessarMDR();
		hierarquiaDeCenariosDeCorreçaoExcluirMasas.criar();
		hierarquiaDeCenariosDeCorreçaoExcluirMasas.afterClass();

	}

	// 42

	@Test(priority = 42)
	public void cadastroCondiçaoExcluirMasas() {

		System.out.println("---- Cadastro Condicao-------------");

		cadastroCondiçaoExcluirMasas = new CadastroCondiçaoExcluirMasas();
		cadastroCondiçaoExcluirMasas.beforeClass();
		cadastroCondiçaoExcluirMasas.login();
		cadastroCondiçaoExcluirMasas.acessarMDR();
		cadastroCondiçaoExcluirMasas.criar();
		cadastroCondiçaoExcluirMasas.afterClass();

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
	public void contasContábeisRBLPFiltroId() {

		System.out.println("----  Contas Contábeis RBLP  -------------");

		contasContábeisRBLPFiltroId = new ContasContábeisRBLPFiltroId();
		contasContábeisRBLPFiltroId.beforeClass();
		contasContábeisRBLPFiltroId.login();
		contasContábeisRBLPFiltroId.acessarMDR();
		contasContábeisRBLPFiltroId.filtro();
		contasContábeisRBLPFiltroId.afterClass();

	}
	// 47 -52

	@Test(priority = 47)
	public void parametrizaçãoDoLivroOficial() {

		System.out.println("----  Parametrização Do Livro Oficial  -------------");

		parametrizaçãoDoLivroOficial = new ParametrizaçãoDoLivroOficial();
		parametrizaçãoDoLivroOficial.beforeClass();
		parametrizaçãoDoLivroOficial.login();
		parametrizaçãoDoLivroOficial.acessarMDR();
		parametrizaçãoDoLivroOficial.criar();
		parametrizaçãoDoLivroOficial.afterClass();
	}

	@Test(priority = 48)
	public void parametrizaçãoDoLivroOficialEditar() {
		parametrizaçãoDoLivroOficialEditar = new ParametrizaçãoDoLivroOficialEditar();
		parametrizaçãoDoLivroOficialEditar.beforeClass();
		parametrizaçãoDoLivroOficialEditar.login();
		parametrizaçãoDoLivroOficialEditar.acessarMDR();
		parametrizaçãoDoLivroOficialEditar.Editar();
		parametrizaçãoDoLivroOficialEditar.afterClass();
	}

	@Test(priority = 48)
	public void parametrizaçãoDoLivroOficialVisualizar() {
		parametrizaçãoDoLivroOficialVisualizar = new ParametrizaçãoDoLivroOficialVisualizar();
		parametrizaçãoDoLivroOficialVisualizar.beforeClass();
		parametrizaçãoDoLivroOficialVisualizar.ingresar();
		parametrizaçãoDoLivroOficialVisualizar.ingresarMDR();
		parametrizaçãoDoLivroOficialVisualizar.visualizar();
		parametrizaçãoDoLivroOficialVisualizar.afterClass();
	}

	@Test(priority = 49)
	public void parametrizaçãoDoLivroOficialExcluir() {
		parametrizaçãoDoLivroOficialExcluir = new ParametrizaçãoDoLivroOficialExcluir();
		parametrizaçãoDoLivroOficialExcluir.beforeClass();
		parametrizaçãoDoLivroOficialExcluir.login();
		parametrizaçãoDoLivroOficialExcluir.acessarMDR();
		parametrizaçãoDoLivroOficialExcluir.excluir();
		parametrizaçãoDoLivroOficialExcluir.afterClass();
	}

	@Test(priority = 50)
	public void cadastroDeCódigoDeRegrasCriar() {

		System.out.println("----  Determinacao De Relevancia De Tarefa > Cadastro De Código De Regras  -------------");

		cadastroDeCódigoDeRegrasCriar = new CadastroDeCódigoDeRegrasCriar();
		cadastroDeCódigoDeRegrasCriar.beforeClass();
		cadastroDeCódigoDeRegrasCriar.login();
		cadastroDeCódigoDeRegrasCriar.acessarMDR();
		cadastroDeCódigoDeRegrasCriar.criar();
		cadastroDeCódigoDeRegrasCriar.afterClass();
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

//Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisição

	@Test(priority = 62)
	
	public void s1250AquisiçãoCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisição -------------");

		s1250AquisiçãoCriar = new S1250AquisiçãoCriar();
		s1250AquisiçãoCriar.beforeClass();
		s1250AquisiçãoCriar.login();
		s1250AquisiçãoCriar.acessarMDR();
		s1250AquisiçãoCriar.criar();
		s1250AquisiçãoCriar.afterClass();
	}

	@Test(priority = 63)
	
	public void s1250AquisiçãoEditar() {

		s1250AquisiçãoEditar = new S1250AquisiçãoEditar();
		s1250AquisiçãoEditar.beforeClass();
		s1250AquisiçãoEditar.login();
		s1250AquisiçãoEditar.acessarMDR();
		s1250AquisiçãoEditar.editar();
		s1250AquisiçãoEditar.afterClass();
	}

	@Test(priority = 64)
	
	public void s1250AquisiçãoExcluir() {

		s1250AquisiçãoExcluir = new S1250AquisiçãoExcluir();
		s1250AquisiçãoExcluir.beforeClass();
		s1250AquisiçãoExcluir.login();
		s1250AquisiçãoExcluir.acessarMDR();
		s1250AquisiçãoExcluir.excluir();
		s1250AquisiçãoExcluir.afterClass();

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisição FIM -------------");

	}

//Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisição Toltal

	@Test(priority = 65)
	
	public void s1250AquisiçãoTotalCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Aquisição Toltal -------------");

		s1250AquisiçãoTotalCriar = new S1250AquisiçãoTotalCriar();
		s1250AquisiçãoTotalCriar.beforeClass();
		s1250AquisiçãoTotalCriar.login();
		s1250AquisiçãoTotalCriar.acessarMDR();
		s1250AquisiçãoTotalCriar.criar();
		s1250AquisiçãoTotalCriar.afterClass();
	}

	@Test(priority = 66)
	
	public void s1250AquisiçãoTotalEditar() {

		s1250AquisiçãoTotalEditar = new S1250AquisiçãoTotalEditar();
		s1250AquisiçãoTotalEditar.beforeClass();
		s1250AquisiçãoTotalEditar.login();
		s1250AquisiçãoTotalEditar.acessarMDR();
		s1250AquisiçãoTotalEditar.editar();
		s1250AquisiçãoTotalEditar.afterClass();
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

//Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisição

	@Test(priority = 70)
	
	public void s1250DetAquisiçãoCriar() {

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisição -------------");

		s1250DetAquisiçãoCriar = new S1250DetAquisiçãoCriar();
		s1250DetAquisiçãoCriar.beforeClass();
		s1250DetAquisiçãoCriar.login();
		s1250DetAquisiçãoCriar.acessarMDR();
		s1250DetAquisiçãoCriar.criar();
		s1250DetAquisiçãoCriar.afterClass();
	}
	
	@Test(priority = 71)

	public void s1250DetAquisiçãoEditar() {

		s1250DetAquisiçãoEditar = new S1250DetAquisiçãoEditar();
		s1250DetAquisiçãoEditar.beforeClass();
		s1250DetAquisiçãoEditar.login();
		s1250DetAquisiçãoEditar.acessarMDR();
		s1250DetAquisiçãoEditar.editar();
		s1250DetAquisiçãoEditar.afterClass();
	}

	@Test(priority = 72)
	
	public void s1250DetAquisiçãoExcluir() {

		s1250DetAquisiçãoExcluir = new S1250DetAquisiçãoExcluir();
		s1250DetAquisiçãoExcluir.beforeClass();
		s1250DetAquisiçãoExcluir.login();
		s1250DetAquisiçãoExcluir.acessarMDR();
		s1250DetAquisiçãoExcluir.excluir();
		s1250DetAquisiçãoExcluir.afterClass();

		System.out.println("---- Eventos e-social > S1250 Aquisicao De Producao Rural/Det Aquisição Fim -------------");

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
