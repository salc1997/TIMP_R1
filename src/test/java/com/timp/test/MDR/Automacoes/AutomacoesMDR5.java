package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;

import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaDetalhes;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaExcluir;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaVisualizar;
import com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalCriar;
import com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalEditar;
import com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalExcluir;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalCriar;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalEditar;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalExcluir;



public class AutomacoesMDR5 extends TestBaseSteven {
	
	
	
	// Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de Motivos de Reabertura
	
	CadastroMotivosReaberturaCriar cadastroMotivosReaberturaCriar;
	CadastroMotivosReaberturaDetalhes cadastroMotivosReaberturaDetalhes;
	CadastroMotivosReaberturaEditar cadastroMotivosReaberturaEditar;
	CadastroMotivosReaberturaExcluir cadastroMotivosReaberturaExcluir;
	CadastroMotivosReaberturaVisualizar cadastroMotivosReaberturaVisualizar;
	
	// Parâmetros de criação de NF > Cadastro de Nota Fiscal
	
	CadastroNotaFiscalCriar cadastroNotaFiscalCriar;
	CadastroNotaFiscalEditar cadastroNotaFiscalEditar;
	CadastroNotaFiscalExcluir cadastroNotaFiscalExcluir;

	
	
	//Ocorrência Fiscal > Status de Ocorrência Fiscal
	
	StatusOcorrenciaFiscalCriar statusOcorrenciaFiscalCriar;
	StatusOcorrenciaFiscalEditar statusOcorrenciaFiscalEditar;
	StatusOcorrenciaFiscalExcluir statusOcorrenciaFiscalExcluir;
	
	
	
	
	
	//0
	
	// Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de Motivos de Reabertura


		@Test(priority = 0)
		public void cadastroMotivosReaberturaCriar() {

			System.out.println("-------------------Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de Motivos de Reabertura-------------------------");

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

			System.out.println("-------------------Determinação de Relevância de Tarefa por Motivo de Reabertura > Cadastro de Motivos de Reabertura Fin-------------------------");
		}


	
	
	//6
		
		// Parâmetros de criação de NF > Cadastro de Nota Fiscal

		@Test(priority = 6)
		public void cadastroNotaFiscalCriar() {

			System.out.println("-------------------Parâmetros de criação de NF > Cadastro de Nota Fiscal-------------------------");

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

			System.out.println("-------------------Parâmetros de criação de NF > Cadastro de Nota Fiscal Fin-------------------------");
		}

		
		
	//12
		
		// Ocorrência Fiscal > Status de Ocorrência Fiscal

		@Test(priority = 12)
		public void statusOcorrenciaFiscalCriar() {

			System.out.println("-------------------Ocorrência Fiscal > Status de Ocorrência Fiscal-------------------------");

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

			System.out.println("-------------------Ocorrência Fiscal > Status de Ocorrência Fiscal Fin-------------------------");
		}

		
		
		
	//18
		
		
		
		
		
}