package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialExcluirPO;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasExcluirEmMassa;
import com.timp.test.MDR.Centralizacao.Movimento.MovimentoDetalhes;
import com.timp.test.MDR.Centralizacao.Saldos.SaldosCriar;
import com.timp.test.MDR.Centralizacao.Saldos.SaldosFiltrarId;
import com.timp.test.MDR.CodigoContabilizacao.CodigoContabilizacaoFiltrosAvan;
import com.timp.test.MDR.CodigoReceita.CodigoReceitaFiltrosAvan;
import com.timp.test.MDR.DeXParaM010PlanodeContasSocietario.DeXParaM010PlanodeContasSocietarioExcluirEmMassa;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluirEmMassa;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoExcluirEmMassa;
import com.timp.test.MDR.EventosESocial.S2240CondiçõesAmbDoTrabFatDeRisco.S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID;
import com.timp.test.MDR.ICMSSTTransporte.ICMSSTTransporteExcluirEmMassa;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisCriar;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisExcluirEmMassa;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisFiltroId;
import com.timp.test.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluirEmMassa;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTFiltrosAvan;
import com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPExcluirEnMasa;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPExcluirEmMasa;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPExcluirEnMasa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICExcluirEmMasa;
import com.timp.test.MDR.RegistroECAC.RegistroECACFiltrosAvan;
import com.timp.test.MDR.SaldoInicial.SaldoInicialCriar;
import com.timp.test.MDR.SaldoInicial.SaldoInicialDetalhe;
import com.timp.test.MDR.SaldoInicial.SaldoInicialEditar;
import com.timp.test.MDR.SaldoInicial.SaldoInicialExcluir;
import com.timp.test.MDR.SaldoInicial.SaldoInicialFiltroAvan;
import com.timp.test.MDR.SaldoInicial.SaldoInicialVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASExcluirEnMasa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASVisualizar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDeContribucaoSocialApurada.TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFFiltrosAvan;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasDetalhes;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotasDeTaxaDeActualizacaoExcluirEmMassa;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosCriar;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosEditar;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosExcluir;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosExcluirEmMassa;

public class AutomacoesMDRKen extends TestBaseKenssy {

	//Centralização	 > Saldos
	SaldosCriar saldosCriar;
	SaldosFiltrarId saldosFiltrarId;
	
	//Centralização	 > Movimentos
	MovimentoDetalhes movimentoDetalhes;
	
	//De X Para M010 - Plano de Contas Societario 
	DeXParaM010PlanodeContasSocietarioExcluirEmMassa deXParaM010PlanodeContasSocietarioExcluirEmMassa;
	
	//Incentivos Fiscais > Incentivos Fiscais
	IncentivosFiscaisCriar incentivosFiscaisCriar;
	IncentivosFiscaisFiltroId incentivosFiscaisFiltroId;
	IncentivosFiscaisExcluirEmMassa incentivosFiscaisExcluirEmMassa;
	
	//SaldoInicialCriar > SaldoInicialCriar
	SaldoInicialCriar saldoInicialCriar;
	SaldoInicialEditar saldoInicialEditar;
	SaldoInicialDetalhe saldoInicialDetalhe;
	SaldoInicialVisualizar saldoInicialVisualizar;
	SaldoInicialExcluir saldoInicialExcluir;
	SaldoInicialFiltroAvan saldoInicialFiltroAvan;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 19 - Motivos de Desligamento
	MotivosdeDesligamentoCriar  motivosdeDesligamentoCriar;
	MotivosdeDesligamentoEditar motivosdeDesligamentoEditar;
	MotivosdeDesligamentoVisualizar motivosdeDesligamentoVisualizar;
	MotivosdeDesligamentoExcluir motivosdeDesligamentoExcluir;
	MotivosdeDesligamentoExcluirMasa motivosdeDesligamentoExcluirMasa;
	
	//Tabelas de Apoio E-SOCIAL	> Tabela 22 - Compatibilidade entre FPAS
	CompatibilidadeEntreFPASCriar compatibilidadeEntreFPASCriar;
	CompatibilidadeEntreFPASEditar compatibilidadeEntreFPASEditar;
	CompatibilidadeEntreFPASVisualizar compatibilidadeEntreFPASVisualizar;
	CompatibilidadeEntreFPASExcluir compatibilidadeEntreFPASExcluir;
	CompatibilidadeEntreFPASExcluirEnMasa compatibilidadeEntreFPASExcluirEnMasa;
	
	//Thin Capitalization > Empréstimos
	EmprestimosCriar emprestimosCriar;
	EmprestimosEditar emprestimosEditar;
	EmprestimosExcluir emprestimosExcluir;
	EmprestimosExcluirEmMassa emprestimosExcluirEmMassa;
	
	///********************BUSCAR AUTOMATIZACION A LA QUE PERTENECE*********
		//ICMS-ST Transporte
		ICMSSTTransporteExcluirEmMassa iCMSSTTransporteExcluirEmMassa;
		
		//Cadastro Específico do INSS (CEI) > Cadastro de Obras
		CadastroDeObrasExcluirEmMassa cadastroDeObrasExcluirEmMassa;
		
		//Código da Receita
		CodigoReceitaFiltrosAvan codigoReceitaFiltrosAvan;
		
	    //Código de Contabilização
		CodigoContabilizacaoFiltrosAvan codigoContabilizacaoFiltrosAvan;
		//aqui
		//Livros Fiscais > Parâmetros para Livro ICMS ST
		ParametrosParaLivroICMSSTFiltrosAvan parametrosParaLivroICMSSTFiltrosAvan;
		
		//Preço de Transferência > Modelo de Apuração TP
		ModeloDeApuracaoTPExcluirEnMasa modeloDeApuracaoTPExcluirEnMasa;
		
		//Preço de Transferência >	Parâmetros para TP
		ParametrosParaTPExcluirEnMasa parametrosParaTPExcluirEnMasa;

		//Preço de Transferência >	Valores para Método de Importação / Valores para Método PRL
		//FALTAN EN LA AUTOMATIZACION
		
		//Preço de Transferência >	Valores para Método de Importação / Valores para Método PIC
		ValoresParaMetodoPICExcluirEmMasa valoresParaMetodoPICExcluirEmMasa;	
		
		//Preço de Transferência > Valores para Método / Valores para Método CAP
		ValoresParaMetodoCAPExcluirEmMassa valoresParaMetodoCAPExcluirEmMassa;
		
		//Preço de Transferência >	Valores para Método / Valores para Método PVV
		ValoresParaMetodoPVVExcluirEmMassa valoresParaMetodoPVVExcluirEmMassa;
		
		//Registro ECAC
		RegistroECACFiltrosAvan registroECACFiltrosAvan;
		
		//Preço de Transferência >	Parâmetros Modelos de Apuração TP
		ParametrosModeloDeApuracaoTPExcluirEmMasa parametrosModeloDeApuracaoTPExcluirEmMasa;
		
		//Tabelas Complementares para Obrigações Acessórias	> Tabela Complementar para DIRF
		TabelaComplementarParaDIRFFiltrosAvan tabelaComplementarParaDIRFFiltrosAvan;
		
		//Determinação de Relevância de Tarefa	Determinação de Relevância por Regra
		DeterminacaoDeRelevanciaPorRegraExcluirEmMassa determinacaoDeRelevanciaPorRegraExcluirEmMassa;
		
		//Determinação de Relevância de Tarefa por Motivo de Reabertura	Determinação de Relevância por Motivo
		DeterminacionRelevanciaPorMotivoExcluirEmMassa determinacionRelevanciaPorMotivoExcluirEmMassa;
		
		//Preço de Transferência	Valores para Método / Valores para Método CPL
		ValoresParaMetodoCPLExcluirEmMassa valoresParaMetodoCPLExcluirEmMassa;
		
		//Preço de Transferência	Valores para Método / Valores para Método PCI
		ValoresParaMetodoPCIExcluirEmMassa valoresParaMetodoPCIExcluirEmMassa;
		
		//Preço de Transferência	Valores para Método / Valores para Método PVA
		ValoresParaMetodoPVAExcluirEmMassa valoresParaMetodoPVAExcluirEmMassa;
		
		//Taxas de Atualização	Configuração de Tipo Taxa de Atualização
		ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa;
		
		//Taxas de Atualização	Alíquotas de Taxa de Atualização
		AliquotasDeTaxaDeActualizacaoExcluirEmMassa aliquotasDeTaxaDeActualizacaoExcluirEmMassa;
		
		//Parâmetros de criação de NF	Cadastro de Nota Fiscal
		CadastroNotaFiscalExcluirEmMassa cadastroNotaFiscalExcluirEmMassa;
		
		//Tabela de Apoio do SPED > 4.3.5 Tabela Código de Contribuição Social Apurada
		TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa;
		
		//Livros Fiscais > Livros Fiscais
		LivrosFiscaisExcluirEmMassa livrosFiscaisExcluirEmMassa;
		
		//Eventos e-Social > S2240 - Condições Amb do Trab - Fat de Risco
		S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID;
		
		
	@Test(priority = 0)
	public void saldosCriar() {
		System.out.println(
				"-------------------Centralizacao > Saldos-------------------------");
		saldosCriar = new SaldosCriar();
		saldosCriar.beforeClass();
		saldosCriar.login();
		saldosCriar.acessarMDR();
		saldosCriar.CriarSaldo();
		saldosCriar.afterClass();
	}

	@Test(priority = 1)
	public void saldosFiltrarId() {
		saldosFiltrarId = new SaldosFiltrarId();
		saldosFiltrarId.beforeClass();
		saldosFiltrarId.login();
		saldosFiltrarId.acessarMDR();
		saldosFiltrarId.FiltrarSaldosId();
		saldosFiltrarId.afterClass();
	}

	
	@Test(priority = 2)
	public void movimentoDetalhes() {
		System.out.println(
				"-------------------Centralizacao > Movimentos-------------------------");
		movimentoDetalhes = new MovimentoDetalhes();
		movimentoDetalhes.beforeClass();
		movimentoDetalhes.login();
		movimentoDetalhes.acessarMDR();
		movimentoDetalhes.detalheMovimento();
		movimentoDetalhes.afterClass();
	}
	
	@Test(priority = 3)
	public void deXParaM010PlanodeContasSocietarioExcluirEmMassa() {
		System.out.println(
				"-------------------De X Para M010 Plano de Contas Societario-------------------------");
		deXParaM010PlanodeContasSocietarioExcluirEmMassa = new DeXParaM010PlanodeContasSocietarioExcluirEmMassa();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.beforeClass();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.ingresar();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.mdrEntrar();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.excluirEmMassa();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 4)
	public void incentivosFiscaisCriar() {
		System.out.println(
				"-------------------Incentivos Fiscais > Incentivos Fiscais-------------------------");
		incentivosFiscaisCriar = new IncentivosFiscaisCriar();
		incentivosFiscaisCriar.beforeClass();
		incentivosFiscaisCriar.login();
		incentivosFiscaisCriar.acessarMDR();
		incentivosFiscaisCriar.CriarIncentivosFiscais();
		incentivosFiscaisCriar.afterClass();
	}
	
	@Test(priority = 5)
	public void incentivosFiscaisExcluirEmMassa() {
		incentivosFiscaisExcluirEmMassa = new IncentivosFiscaisExcluirEmMassa();
		incentivosFiscaisExcluirEmMassa.beforeClass();
		incentivosFiscaisExcluirEmMassa.login();
		incentivosFiscaisExcluirEmMassa.mdrEntrar();
		incentivosFiscaisExcluirEmMassa.excluirEmMassa();
		incentivosFiscaisExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 6)
	public void saldoInicialCriar() {
		System.out.println(
				"-------------------Saldo Inicial -------------------------");
		saldoInicialCriar = new SaldoInicialCriar();
		saldoInicialCriar.beforeClass();
		saldoInicialCriar.login();
		saldoInicialCriar.acessarMDR();
		saldoInicialCriar.CriarSaldoInicial();
		saldoInicialCriar.afterClass();
	}
	
	@Test(priority = 7)
	public void saldoInicialEditar() {
		saldoInicialEditar = new SaldoInicialEditar();
		saldoInicialEditar.beforeClass();
		saldoInicialEditar.login();
		saldoInicialEditar.acessarMDR();
		saldoInicialEditar.editarSaldo();
		saldoInicialEditar.afterClass();
	}
	
	
	@Test(priority = 8)
	public void saldoInicialDetalhe() {
		saldoInicialDetalhe = new SaldoInicialDetalhe();
		saldoInicialDetalhe.beforeClass();
		saldoInicialDetalhe.login();
		saldoInicialDetalhe.acessarMDR();
		saldoInicialDetalhe.detalheSaldoInicial();
		saldoInicialDetalhe.afterClass();
	}

	@Test(priority = 9)
	public void saldoInicialVisualizar() {
		saldoInicialVisualizar = new SaldoInicialVisualizar();
		saldoInicialVisualizar.beforeClass();
		saldoInicialVisualizar.login();
		saldoInicialVisualizar.acessarMDR();
		saldoInicialVisualizar.VisualizarSaldoInicial();
		saldoInicialVisualizar.afterClass();
	}
	
	@Test(priority = 10)
	public void saldoInicialExcluir() {
		saldoInicialExcluir = new SaldoInicialExcluir();
		saldoInicialExcluir.beforeClass();
		saldoInicialExcluir.login();
		saldoInicialExcluir.acessarMDR();
		saldoInicialExcluir.ExcluirSaldoInicial();
		saldoInicialExcluir.afterClass();
	}
	
	@Test(priority = 11)
	public void saldoInicialFiltroAvan() {
		saldoInicialFiltroAvan = new SaldoInicialFiltroAvan();
		saldoInicialFiltroAvan.beforeClass();
		saldoInicialFiltroAvan.login();
		saldoInicialFiltroAvan.acessarMDR();
		saldoInicialFiltroAvan.FiltrarAvanSaldoIncial();
		saldoInicialFiltroAvan.afterClass();
	}
	
	
	@Test(priority = 12)
	public void motivosdeDesligamentoCriar() {
		System.out.println(
				"-------------------Tabelas de Apoio E-SOCIAL > Tabela 19 - Motivos de Desligamento-------------------------");
		motivosdeDesligamentoCriar = new MotivosdeDesligamentoCriar();
		motivosdeDesligamentoCriar.beforeClass();
		motivosdeDesligamentoCriar.login();
		motivosdeDesligamentoCriar.acessarMDR();
		motivosdeDesligamentoCriar.criarMotivoDesligamento();
		motivosdeDesligamentoCriar.afterClass();
	}
	
	@Test(priority = 13)
	public void motivosdeDesligamentoEditar() {
		motivosdeDesligamentoEditar = new MotivosdeDesligamentoEditar();
		motivosdeDesligamentoEditar.beforeClass();
		motivosdeDesligamentoEditar.login();
		motivosdeDesligamentoEditar.mdrEntrar();
		motivosdeDesligamentoEditar.editarMotivoDesligamento();
		motivosdeDesligamentoEditar.afterClass();
	}
	
	
	@Test(priority = 14)
	public void motivosdeDesligamentoVisualizar() {
		motivosdeDesligamentoVisualizar = new MotivosdeDesligamentoVisualizar();
		motivosdeDesligamentoVisualizar.beforeClass();
		motivosdeDesligamentoVisualizar.ingresar();
		motivosdeDesligamentoVisualizar.mdrEntrar();
		motivosdeDesligamentoVisualizar.visualizarMotivosDesligamento();
		motivosdeDesligamentoVisualizar.afterClass();
	}
	
	@Test(priority = 15)
	public void motivosdeDesligamentoExcluir() {
		motivosdeDesligamentoExcluir = new MotivosdeDesligamentoExcluir();
		motivosdeDesligamentoExcluir.beforeClass();
		motivosdeDesligamentoExcluir.login();
		motivosdeDesligamentoExcluir.acessarMDR();
		motivosdeDesligamentoExcluir.excluirMotivosDesligamento();
		motivosdeDesligamentoExcluir.afterClass();
	}
	
	
	@Test(priority = 16)
	public void motivosdeDesligamentoExcluirMasa() {
		motivosdeDesligamentoExcluirMasa = new MotivosdeDesligamentoExcluirMasa();
		motivosdeDesligamentoExcluirMasa.beforeClass();
		motivosdeDesligamentoExcluirMasa.ingresar();
		motivosdeDesligamentoExcluirMasa.mdrEntrar();
		motivosdeDesligamentoExcluirMasa.excluirMasaMotivosDesligamento();
		motivosdeDesligamentoExcluirMasa.afterClass();
	}
	
	
	@Test(priority = 17)
	public void compatibilidadeEntreFPASCriar() {
		System.out.println(
				"------------------- Tabelas de Apoio E-SOCIAL	> Tabela 22 - Compatibilidade entre FPAS-------------------------");
		compatibilidadeEntreFPASCriar = new CompatibilidadeEntreFPASCriar();
		compatibilidadeEntreFPASCriar.beforeClass();
		compatibilidadeEntreFPASCriar.login();
		compatibilidadeEntreFPASCriar.acessarMDR();
		compatibilidadeEntreFPASCriar.criarCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASCriar.afterClass();
	}
	
	@Test(priority = 18)
	public void compatibilidadeEntreFPASEditar() {
		compatibilidadeEntreFPASEditar = new CompatibilidadeEntreFPASEditar();
		compatibilidadeEntreFPASEditar.beforeClass();
		compatibilidadeEntreFPASEditar.ingresar();
		compatibilidadeEntreFPASEditar.mdrEntrar();
		compatibilidadeEntreFPASEditar.editarCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASEditar.afterClass();
	}
	
	@Test(priority = 19)
	public void compatibilidadeEntreFPASVisualizar() {
		compatibilidadeEntreFPASVisualizar = new CompatibilidadeEntreFPASVisualizar();
		compatibilidadeEntreFPASVisualizar.beforeClass();
		compatibilidadeEntreFPASVisualizar.login();
		compatibilidadeEntreFPASVisualizar.acessarMDR();
		compatibilidadeEntreFPASVisualizar.visualizarCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASVisualizar.afterClass();
	}
	
	@Test(priority = 20)
	public void compatibilidadeEntreFPASExcluir() {
		compatibilidadeEntreFPASExcluir = new CompatibilidadeEntreFPASExcluir();
		compatibilidadeEntreFPASExcluir.beforeClass();
		compatibilidadeEntreFPASExcluir.ingresar();
		compatibilidadeEntreFPASExcluir.mdrEntrar();
		compatibilidadeEntreFPASExcluir.excluirCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASExcluir.afterClass();
	}
	
	@Test(priority = 21)
	public void emprestimosCriar() {
		System.out.println(
				"-------------------Thin Capitalization	> Empréstimos-------------------------");
		emprestimosCriar = new EmprestimosCriar();
		emprestimosCriar.beforeClass();
		emprestimosCriar.login();
		emprestimosCriar.acessarMDR();
		emprestimosCriar.criarEmprestimos();
		emprestimosCriar.afterClass();
	}
	
	@Test(priority = 22)
	public void emprestimosEditar() {
		emprestimosEditar = new EmprestimosEditar();
		emprestimosEditar.beforeClass();
		emprestimosEditar.ingresar();
		emprestimosEditar.mdrEntrar();
		emprestimosEditar.editarEmprestimos();
		emprestimosEditar.afterClass();
	}
	
	@Test(priority = 23)
	public void emprestimosExcluir() {
		emprestimosExcluir = new EmprestimosExcluir();
		emprestimosExcluir.beforeClass();
		emprestimosExcluir.ingresar();
		emprestimosExcluir.mdrEntrar();
		emprestimosExcluir.excluirEmprestimos();
		emprestimosExcluir.afterClass();
	}
	
	
	@Test(priority = 24)
	public void emprestimosExcluirEmMassa() {
		emprestimosExcluirEmMassa = new EmprestimosExcluirEmMassa();
		emprestimosExcluirEmMassa.beforeClass();
		emprestimosExcluirEmMassa.ingresar();
		emprestimosExcluirEmMassa.mdrEntrar();
		emprestimosExcluirEmMassa.excluirEmMassaEmprestimos();
		emprestimosExcluirEmMassa.afterClass();
	}
	
	
	@Test(priority = 25)
	public void iCMSSTTransporteExcluirEmMassa() {
		System.out.println(
				"-------------------ICMS-ST Transporte-------------------------");
		iCMSSTTransporteExcluirEmMassa = new ICMSSTTransporteExcluirEmMassa();
		iCMSSTTransporteExcluirEmMassa.beforeClass();
		iCMSSTTransporteExcluirEmMassa.ingresar();
		iCMSSTTransporteExcluirEmMassa.mdrEntrar();
		iCMSSTTransporteExcluirEmMassa.excluirEmMassa();
		iCMSSTTransporteExcluirEmMassa.afterClass();
	}
	

	@Test(priority = 26)
	public void cadastroDeObrasExcluirEmMassa() {
		System.out.println(
				"-------------------Cadastro Específico do INSS (CEI) > Cadastro de Obras-------------------------");
		cadastroDeObrasExcluirEmMassa = new CadastroDeObrasExcluirEmMassa();
		cadastroDeObrasExcluirEmMassa.beforeClass();
		cadastroDeObrasExcluirEmMassa.ingresar();
		cadastroDeObrasExcluirEmMassa.mdrEntrar();
		cadastroDeObrasExcluirEmMassa.excluirEmMassa();
		cadastroDeObrasExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 27)
	public void codigoReceitaFiltrosAvan() {
		System.out.println(
				"-------------------Codigo da Receita-------------------------");
		codigoReceitaFiltrosAvan = new CodigoReceitaFiltrosAvan();
		codigoReceitaFiltrosAvan.beforeClass();
		codigoReceitaFiltrosAvan.login();
		codigoReceitaFiltrosAvan.acessarMDR();
		codigoReceitaFiltrosAvan.filtrosAvanzados();
		codigoReceitaFiltrosAvan.afterClass();
	}
	
	
	@Test(priority = 28)
	public void codigoContabilizacaoFiltrosAvan() {
		System.out.println(
				"-------------------Código de Contabilização-------------------------");
		codigoContabilizacaoFiltrosAvan = new CodigoContabilizacaoFiltrosAvan();
		codigoContabilizacaoFiltrosAvan.beforeClass();
		codigoContabilizacaoFiltrosAvan.login();
		codigoContabilizacaoFiltrosAvan.acessarMDR();
		codigoContabilizacaoFiltrosAvan.filtrarAvanCodigoContabilizacao();
		codigoContabilizacaoFiltrosAvan.afterClass();
	}
	
	
	@Test(priority = 29)
	public void parametrosParaLivroICMSSTFiltrosAvan() {
		System.out.println(
				"-------------------Livros Fiscais > Parâmetros para Livro ICMS ST-------------------------");
		parametrosParaLivroICMSSTFiltrosAvan = new ParametrosParaLivroICMSSTFiltrosAvan();
		parametrosParaLivroICMSSTFiltrosAvan.beforeClass();
		parametrosParaLivroICMSSTFiltrosAvan.login();
		parametrosParaLivroICMSSTFiltrosAvan.acessarMDR();
		parametrosParaLivroICMSSTFiltrosAvan.filtrosAvanzados();
		parametrosParaLivroICMSSTFiltrosAvan.afterClass();
	}
	
	

	@Test(priority = 30)
	public void modeloDeApuracaoTPExcluirEnMasa() {
		System.out.println(
				"-------------------Preço de Transferência >	Modelo para TP-------------------------");
		modeloDeApuracaoTPExcluirEnMasa = new ModeloDeApuracaoTPExcluirEnMasa();
		modeloDeApuracaoTPExcluirEnMasa.beforeClass();
		modeloDeApuracaoTPExcluirEnMasa.ingresar();
		modeloDeApuracaoTPExcluirEnMasa.mdrEntrar();
		modeloDeApuracaoTPExcluirEnMasa.excluirEnMasaModeloApuracaoTP();
		modeloDeApuracaoTPExcluirEnMasa.afterClass();
	}
	
	
	@Test(priority = 31)
	public void parametrosParaTPExcluirEnMasa() {
		System.out.println(
				"-------------------Preço de Transferência >	Parâmetros para TP-------------------------");
		parametrosParaTPExcluirEnMasa = new ParametrosParaTPExcluirEnMasa();
		parametrosParaTPExcluirEnMasa.beforeClass();
		parametrosParaTPExcluirEnMasa.ingresar();
		parametrosParaTPExcluirEnMasa.mdrEntrar();
		parametrosParaTPExcluirEnMasa.excluirEmMasaParametrosParaTP();
		parametrosParaTPExcluirEnMasa.afterClass();
	}
	
	
	@Test(priority = 32)
	public void valoresParaMetodoCAPExcluirEmMassa() {
		System.out.println(
				"-------------------Preço de Transferência > Valores para Método / Valores para Método CAP-------------------------");
		valoresParaMetodoCAPExcluirEmMassa = new ValoresParaMetodoCAPExcluirEmMassa();
		valoresParaMetodoCAPExcluirEmMassa.beforeClass();
		valoresParaMetodoCAPExcluirEmMassa.ingresar();
		valoresParaMetodoCAPExcluirEmMassa.mdrEntrar();
		valoresParaMetodoCAPExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoCAPExcluirEmMassa.afterClass();
	}
	
	
	
	@Test(priority = 33)
	public void valoresParaMetodoPVVExcluirEmMassa() {
		System.out.println(
				"-------------------Preço de Transferência > Valores para Método / Valores para Método PVV-------------------------");
		valoresParaMetodoPVVExcluirEmMassa = new ValoresParaMetodoPVVExcluirEmMassa();
		valoresParaMetodoPVVExcluirEmMassa.beforeClass();
		valoresParaMetodoPVVExcluirEmMassa.ingresar();
		valoresParaMetodoPVVExcluirEmMassa.mdrEntrar();
		valoresParaMetodoPVVExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoPVVExcluirEmMassa.afterClass();
	}
	
	
	@Test(priority = 34)
	public void registroECACFiltrosAvan() {
		System.out.println(
				"------------------- Registro ECAC-------------------------");
		registroECACFiltrosAvan = new RegistroECACFiltrosAvan();
		registroECACFiltrosAvan.beforeClass();
		registroECACFiltrosAvan.login();
		registroECACFiltrosAvan.acessarMDR();
		registroECACFiltrosAvan.filtrarAvanRegistroECAC();
		registroECACFiltrosAvan.afterClass();
	}
	
	
	@Test(priority = 35)
	public void tabelaComplementarParaDIRFFiltrosAvan() {
		System.out.println(
				"------Tabelas Complementares para Obrigações Acessórias	> Tabela Complementar para DIRF----------");
		tabelaComplementarParaDIRFFiltrosAvan = new TabelaComplementarParaDIRFFiltrosAvan();
		tabelaComplementarParaDIRFFiltrosAvan.beforeClass();
		tabelaComplementarParaDIRFFiltrosAvan.login();
		tabelaComplementarParaDIRFFiltrosAvan.acessarMDR();
		tabelaComplementarParaDIRFFiltrosAvan.filtrosAvanTabelaComplementarParaDIRF();
		tabelaComplementarParaDIRFFiltrosAvan.afterClass();
	}
	
	
	@Test(priority = 36)
	public void determinacaoDeRelevanciaPorRegraExcluirEmMassa() {
		System.out.println(
				"------Determinação de Relevância de Tarefa > Determinação de Relevância por Regra----------");
		determinacaoDeRelevanciaPorRegraExcluirEmMassa = new DeterminacaoDeRelevanciaPorRegraExcluirEmMassa();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.beforeClass();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.ingresar();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.mdrEntrar();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.excluirEmMassa();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 37)
	public void determinacionRelevanciaPorMotivoExcluirEmMassa() {
		System.out.println(
				"------Determinação de Relevância de Tarefa por Motivo de Reabertura > Determinação de Relevância por Motivo----------");
		determinacionRelevanciaPorMotivoExcluirEmMassa = new DeterminacionRelevanciaPorMotivoExcluirEmMassa();
		determinacionRelevanciaPorMotivoExcluirEmMassa.beforeClass();
		determinacionRelevanciaPorMotivoExcluirEmMassa.ingresar();
		determinacionRelevanciaPorMotivoExcluirEmMassa.mdrEntrar();
		determinacionRelevanciaPorMotivoExcluirEmMassa.excluirEmMassa();
		determinacionRelevanciaPorMotivoExcluirEmMassa.afterClass();
	}
	
	
	@Test(priority = 38)
	public void valoresParaMetodoCPLExcluirEmMassa() {
		System.out.println(
				"------Preço de Transferência > Valores para Método / Valores para Método CPL----------");
		valoresParaMetodoCPLExcluirEmMassa = new ValoresParaMetodoCPLExcluirEmMassa();
		valoresParaMetodoCPLExcluirEmMassa.beforeClass();
		valoresParaMetodoCPLExcluirEmMassa.ingresar();
		valoresParaMetodoCPLExcluirEmMassa.mdrEntrar();
		valoresParaMetodoCPLExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoCPLExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 39)
	public void valoresParaMetodoPCIExcluirEmMassa() {
		System.out.println(
				"------Preço de Transferência	Valores para Método / Valores para Método PCI----------");
		valoresParaMetodoPCIExcluirEmMassa = new ValoresParaMetodoPCIExcluirEmMassa();
		valoresParaMetodoPCIExcluirEmMassa.beforeClass();
		valoresParaMetodoPCIExcluirEmMassa.ingresar();
		valoresParaMetodoPCIExcluirEmMassa.mdrEntrar();
		valoresParaMetodoPCIExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoPCIExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 40)
	public void valoresParaMetodoPVAExcluirEmMassa() {

		System.out.println(
				"------Preço de Transferência	Valores para Método / Valores para Método PVA----------");
		valoresParaMetodoPVAExcluirEmMassa = new ValoresParaMetodoPVAExcluirEmMassa();
		valoresParaMetodoPVAExcluirEmMassa.beforeClass();
		valoresParaMetodoPVAExcluirEmMassa.ingresar();
		valoresParaMetodoPVAExcluirEmMassa.mdrEntrar();
		valoresParaMetodoPVAExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoPVAExcluirEmMassa.afterClass();
	}
	
	
	
	@Test(priority = 41)
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
	
	
	@Test(priority = 42)
	public void aliquotasDeTaxaDeActualizacaoExcluirEmMassa() {
		System.out.println(
				"------Taxas de Atualização > Alíquotas de Taxa de Atualização----------");
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa = new AliquotasDeTaxaDeActualizacaoExcluirEmMassa();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.beforeClass();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.ingresar();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.mdrEntrar();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.excluirEmMassa();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.afterClass();
	}
	
	
	
	@Test(priority = 43)
	public void cadastroNotaFiscalExcluirEmMassa() {
		System.out.println(
				"------Parâmetros de criação de NF > Cadastro de Nota Fiscal----------");
		cadastroNotaFiscalExcluirEmMassa = new CadastroNotaFiscalExcluirEmMassa();
		cadastroNotaFiscalExcluirEmMassa.beforeClass();
		cadastroNotaFiscalExcluirEmMassa.ingresar();
		cadastroNotaFiscalExcluirEmMassa.mdrEntrar();
		cadastroNotaFiscalExcluirEmMassa.excluirEmMassa();
		cadastroNotaFiscalExcluirEmMassa.afterClass();
	}
	
	
	@Test(priority = 44)
	public void tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa() {
		System.out.println(
				"------Tabela de Apoio do SPED > 4.3.5 Tabela Código de Contribuição Social Apurada----------");
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa = new TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.beforeClass();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.ingresar();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.mdrEntrar();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.excluirEmMassa();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 44)
	public void livrosFiscaisExcluirEmMassa() {
		System.out.println(
				"------LivrosFiscais > LivrosFiscais----------");
		livrosFiscaisExcluirEmMassa = new LivrosFiscaisExcluirEmMassa();
		livrosFiscaisExcluirEmMassa.beforeClass();
		livrosFiscaisExcluirEmMassa.ingresar();
		livrosFiscaisExcluirEmMassa.mdrEntrar();
		livrosFiscaisExcluirEmMassa.excluirEmMassa();
		livrosFiscaisExcluirEmMassa.afterClass();
	}
	
	

	@Test(priority = 45)
	public void s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID() {
		System.out.println(
				"------Eventos e-Social > S2240 - Condições Amb do Trab - Fat de Risco----------");
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID = new S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.beforeClass();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.login();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.acessarMDR();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.filtroPorId();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.afterClass();
	}
		
}
