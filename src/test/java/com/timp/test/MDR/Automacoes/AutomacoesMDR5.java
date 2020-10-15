
package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosCriarPO;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCECriar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEDetalhes;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEEditar;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEExcluir;
import com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEVisualizar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaDetalhes;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaExcluir;
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
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioCriar;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioExcluir;
import com.timp.test.MDR.ValorAdicionado.Municipio.MunicipioVisualizar;

public class AutomacoesMDR5 extends TestBaseSteven {

	// Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de
	// Motivos de Reabertura

	CadastroMotivosReaberturaCriar cadastroMotivosReaberturaCriar;
	CadastroMotivosReaberturaDetalhes cadastroMotivosReaberturaDetalhes;
	CadastroMotivosReaberturaEditar cadastroMotivosReaberturaEditar;
	CadastroMotivosReaberturaExcluir cadastroMotivosReaberturaExcluir;
	CadastroMotivosReaberturaVisualizar cadastroMotivosReaberturaVisualizar;

	// Parâmetros de criação de NF > Cadastro de Nota Fiscal

	CadastroNotaFiscalCriar cadastroNotaFiscalCriar;
	CadastroNotaFiscalEditar cadastroNotaFiscalEditar;
	CadastroNotaFiscalExcluir cadastroNotaFiscalExcluir;

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

	// municipios Fiscais > municipios Fiscais

	@Test(priority = 20)
	public void municipioCriar() {

		System.out.println("-------------------municipio Fiscal > municipio Fiscal-------------------------");

		municipioCriar = new MunicipioCriar();
		municipioCriar.beforeClass();
		municipioCriar.login();
		municipioCriar.acessarMDR();
		municipioCriar.criar();
		municipioCriar.afterClass();

	}

	@Test(priority = 22)
	public void municipioVisualizar() {

		municipioVisualizar = new MunicipioVisualizar();
		municipioVisualizar.beforeClass();
		municipioVisualizar.login();
		municipioVisualizar.acessarMDR();
		municipioVisualizar.visualizar();
		municipioVisualizar.afterClass();

	}

	@Test(priority = 24)
	public void municipioExcluir() {

		municipioExcluir = new MunicipioExcluir();
		municipioExcluir.beforeClass();
		municipioExcluir.login();
		municipioExcluir.acessarMDR();
		municipioExcluir.excluir();
		municipioExcluir.afterClass();

		System.out.println("-------------------municipio Fiscal > municipio Fiscal Fin-------------------------");
	}

	// 48

	// cadastroFornecedorcers Fiscais > cadastroFornecedorcers Fiscais

	@Test(priority = 20)
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

	@Test(priority = 21)
	public void cadastroFornecedorcerEditar() {

		cadastroFornecedorEditar = new CadastroFornecedorEditar();
		cadastroFornecedorEditar.beforeClass();
		cadastroFornecedorEditar.login();
		cadastroFornecedorEditar.acessarMDR();
		cadastroFornecedorEditar.editar();
		cadastroFornecedorEditar.afterClass();

	}

	@Test(priority = 22)
	public void cadastroFornecedorcerVisualizar() {

		cadastroFornecedorVisualizar = new CadastroFornecedorVisualizar();
		cadastroFornecedorVisualizar.beforeClass();
		cadastroFornecedorVisualizar.login();
		cadastroFornecedorVisualizar.acessarMDR();
		cadastroFornecedorVisualizar.visualizar();
		cadastroFornecedorVisualizar.afterClass();

	}

	@Test(priority = 24)
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

}