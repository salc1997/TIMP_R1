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
import com.timp.test.MDR.EventosESocial.S1270ContrataçãDeTrabalhadoresAvulsosNãoPortuários.ContrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa;
import com.timp.test.MDR.EventosESocial.S2240CondiçõesAmbDoTrabFatDeRisco.S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID;
import com.timp.test.MDR.ICMSSTTransporte.ICMSSTTransporteExcluirEmMassa;
import com.timp.test.MDR.ICMSSTTransporte.ICMSSTTransporteFiltroID;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisCriar;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisDetalles;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisEditar;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisExcluir;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisExcluirEmMassa;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisFiltroId;
import com.timp.test.MDR.IncentivosFiscais.IncentivosFiscaisVisualizar;
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
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLExcluirEmMasa;
import com.timp.test.MDR.RegistroECAC.RegistroECACFiltrosAvan;
import com.timp.test.MDR.SCANC.AjusteDeTransferencia.AjusteDeTransferenciaExcluirEmMasa;
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
import com.timp.test.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela23.FatoresDeRiscoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela23.FatoresDeRiscoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabExcluiMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoExcluirEmMasa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela28.DadosDeRATCriar;
import com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDeContribucaoSocialApurada.TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFFiltrosAvan;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasDetalhes;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoCriar;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoDetalhes;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoEditar;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoExcluir;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoExcluirEmMassa;
import com.timp.test.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizacaoVisualizar;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosCriar;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosEditar;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosExcluir;
import com.timp.test.MDR.ThinCapitalization.Emprestimos.EmprestimosExcluirEmMassa;
import com.timp.test.TAA.Ajustes.AjusteCancelar;

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
	IncentivosFiscaisDetalles incentivosFiscaisDetalles;
	IncentivosFiscaisVisualizar incentivosFiscaisVisualizar;
	IncentivosFiscaisEditar incentivosFiscaisEditar;
	IncentivosFiscaisExcluir incentivosFiscaisExcluir;
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
	
	
	//Tabelas de Apoio E-SOCIAL	> Tabela 23 - Fatores de Risco
		FatoresDeRiscoCriar fatoresDeRiscoCriar;
		FatoresDeRiscoEditar fatoresDeRiscoEditar;
		FactoresDeRiscoExcluir factoresDeRiscoExcluir;
		FactoresDeRiscoVisualizar factoresDeRiscoVisualizar;
		FactoresDeRiscoExcluirMassa factoresDeRiscoExcluirMassa;
	//Thin Capitalization > Empréstimos
	EmprestimosCriar emprestimosCriar;
	EmprestimosEditar emprestimosEditar;
	EmprestimosExcluir emprestimosExcluir;
	EmprestimosExcluirEmMassa emprestimosExcluirEmMassa;
	
		//ICMS-ST Transporte
		ICMSSTTransporteExcluirEmMassa iCMSSTTransporteExcluirEmMassa;
		ICMSSTTransporteFiltroID icmsstTransporteFiltroID;
		
		//Determinação de Relevância de Tarefa por Motivo de Reabertura	Determinação de Relevância por Motivo
		DeterminacionRelevanciaPorMotivoExcluirEmMassa determinacionRelevanciaPorMotivoExcluirEmMassa;
		
		
		//Taxas de Atualização	Alíquotas de Taxa de Atualização
		AliquotaDeTaxaDeActualizacaoExcluirEmMassa aliquotasDeTaxaDeActualizacaoExcluirEmMassa;
		AliquotaDeTaxaDeActualizacaoCriar aliquotaDeTaxaDeActualizacaoCriar;
		AliquotaDeTaxaDeActualizacaoEditar aliquotaDeTaxaDeActualizacaoEditar;
		AliquotaDeTaxaDeActualizacaoDetalhes aliquotaDeTaxaDeActualizacaoDetalhes;
		AliquotaDeTaxaDeActualizacaoExcluir aliquotaDeTaxaDeActualizacaoExcluir;
		AliquotaDeTaxaDeActualizacaoVisualizar aliquotaDeTaxaDeActualizacaoVisualizar;
		//Tabela de Apoio do SPED > 4.3.5 Tabela Código de Contribuição Social Apurada
		TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa;
		
		//Eventos e-Social > S2240 - Condições Amb do Trab - Fat de Risco
		S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID;
		
		//Eventos e-Social > S1270 - Contratação de Trabalhadores Avulsos Não Portuários
		ContrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa;
		//SCANC > Ajuste de Transferencia
		AjusteDeTransferenciaExcluirEmMasa ajusteDeTransferenciaExcluirEmMasa;
		//Tabelas de Apoio E-SOCIAL	> Tabela 24 - Codificação de Ac. de Trab.
		CodificaçãoDeAcDeTrabCriar codificaçãoDeAcDeTrabCriar;
		CodificaçãoDeAcDeTrabEditar codificaçãoDeAcDeTrabEditar;
		CodificaçãoDeAcDeTrabExcluiMassa codificaçãoDeAcDeTrabExcluiMassa;
		CodificaçãoDeAcDeTrabExcluir codificaçãoDeAcDeTrabExcluir;
		CodificaçãoDeAcDeTrabVisualizar codificaçãoDeAcDeTrabVisualizar;
		//Tabelas de Apoio E-SOCIAL	> Tabela 27 - Códigos de Lotação.
		CodigosDeLotacaoCriar codigosDeLotacaoCriar;
		CodigosDeLotacaoEditar codigosDeLotacaoEditar;
		CodigosDeLotacaoVisualizar codigosDeLotacaoVisualizar;
		CodigosDeLotacaoExcluir codigosDeLotacaoExcluir;
		CodigosDeLotacaoExcluirEmMasa codigosDeLotacaoExcluirEmMasa;
		//Tabelas de Apoio E-SOCIAL	> Tabela 28 - Dados de RAT
		DadosDeRATCriar dadosDeRATCriar;
	@Test(priority = 0)
	public void saldosCriar() {
		System.out.println(
				"-------------------Centralizacao > Saldos-------------------------");
		saldosCriar = new SaldosCriar();
		saldosCriar.beforeClass();
		saldosCriar.CriarSaldo();
		saldosCriar.afterClass();
	}

	@Test(priority = 1)
	public void saldosFiltrarId() {
		saldosFiltrarId = new SaldosFiltrarId();
		saldosFiltrarId.beforeClass();
		saldosFiltrarId.FiltrarSaldosId();
		saldosFiltrarId.afterClass();
	}

	
	@Test(priority = 1)
	public void movimentoDetalhes() {
		System.out.println(
				"-------------------Centralizacao > Movimentos-------------------------");
		movimentoDetalhes = new MovimentoDetalhes();
		movimentoDetalhes.beforeClass();
		movimentoDetalhes.detalheMovimento();
		movimentoDetalhes.afterClass();
	}
	
	@Test(priority = 1)
	public void deXParaM010PlanodeContasSocietarioExcluirEmMassa() {
		System.out.println(
				"-------------------De X Para M010 Plano de Contas Societario-------------------------");
		deXParaM010PlanodeContasSocietarioExcluirEmMassa = new DeXParaM010PlanodeContasSocietarioExcluirEmMassa();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.beforeClass();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.excluirEmMassa();
		deXParaM010PlanodeContasSocietarioExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 2)
	public void incentivosFiscaisCriar() {
		System.out.println(
				"-------------------Incentivos Fiscais > Incentivos Fiscais-------------------------");
		incentivosFiscaisCriar = new IncentivosFiscaisCriar();
		incentivosFiscaisCriar.beforeClass();
		incentivosFiscaisCriar.CriarIncentivosFiscais();
		incentivosFiscaisCriar.afterClass();
	}

	

	@Test(priority = 3, dependsOnMethods = "incentivosFiscaisCriar")
	public void incentivosFiscaisEditar() {
		incentivosFiscaisEditar = new IncentivosFiscaisEditar();
		incentivosFiscaisEditar.beforeClass();
		incentivosFiscaisEditar.editar();
		incentivosFiscaisEditar.afterClass();
	}
	
	@Test(priority = 4, dependsOnMethods = "incentivosFiscaisCriar")
	public void incentivosFiscaisDetalles() {
		incentivosFiscaisDetalles = new IncentivosFiscaisDetalles();
		incentivosFiscaisDetalles.beforeClass();
		incentivosFiscaisDetalles.detalhes();
		incentivosFiscaisDetalles.afterClass();
	}
	
	@Test(priority = 4, dependsOnMethods = "incentivosFiscaisCriar")
	public void incentivosFiscaisVisualizar() {
		incentivosFiscaisVisualizar = new IncentivosFiscaisVisualizar();
		incentivosFiscaisVisualizar.beforeClass();
		incentivosFiscaisVisualizar.visualizar();
		incentivosFiscaisVisualizar.afterClass();
	}
	
	
	@Test(priority = 4, dependsOnMethods = "incentivosFiscaisCriar")
	public void incentivosFiscaisFiltroId() {
		incentivosFiscaisFiltroId = new IncentivosFiscaisFiltroId();
		incentivosFiscaisFiltroId.beforeClass();
		incentivosFiscaisFiltroId.FiltrarIncentivosFiscaisId();
		incentivosFiscaisFiltroId.afterClass();
	}
	
	
	@Test(priority = 5, dependsOnMethods = "incentivosFiscaisCriar")
	public void incentivosFiscaisExcluir() {
		incentivosFiscaisExcluir = new IncentivosFiscaisExcluir();
		incentivosFiscaisExcluir.beforeClass();
		incentivosFiscaisExcluir.Excluir();
		incentivosFiscaisExcluir.afterClass();
	}
	
	@Test(priority = 6)
	public void incentivosFiscaisExcluirEmMassa() {
		incentivosFiscaisExcluirEmMassa = new IncentivosFiscaisExcluirEmMassa();
		incentivosFiscaisExcluirEmMassa.beforeClass();
		incentivosFiscaisExcluirEmMassa.excluirEmMassa();
		incentivosFiscaisExcluirEmMassa.afterClass();
	}
	
	
	
	@Test(priority = 6)
	public void saldoInicialCriar() {
		System.out.println(
				"-------------------Saldo Inicial -------------------------");
		saldoInicialCriar = new SaldoInicialCriar();
		saldoInicialCriar.beforeClass();
		saldoInicialCriar.CriarSaldoInicial();
		saldoInicialCriar.afterClass();
	}
	
	@Test(priority = 7, dependsOnMethods = "saldoInicialCriar")
	public void saldoInicialEditar() {
		saldoInicialEditar = new SaldoInicialEditar();
		saldoInicialEditar.beforeClass();
		saldoInicialEditar.editarSaldo();
		saldoInicialEditar.afterClass();
	}
	
	
	@Test(priority = 8, dependsOnMethods = "saldoInicialCriar")
	public void saldoInicialDetalhe() {
		saldoInicialDetalhe = new SaldoInicialDetalhe();
		saldoInicialDetalhe.beforeClass();
		saldoInicialDetalhe.detalheSaldoInicial();
		saldoInicialDetalhe.afterClass();
	}

	@Test(priority = 9, dependsOnMethods = "saldoInicialCriar")
	public void saldoInicialVisualizar() {
		saldoInicialVisualizar = new SaldoInicialVisualizar();
		saldoInicialVisualizar.beforeClass();
		saldoInicialVisualizar.VisualizarSaldoInicial();
		saldoInicialVisualizar.afterClass();
	}
	
	@Test(priority = 10, dependsOnMethods = "saldoInicialCriar")
	public void saldoInicialExcluir() {
		saldoInicialExcluir = new SaldoInicialExcluir();
		saldoInicialExcluir.beforeClass();
		saldoInicialExcluir.ExcluirSaldoInicial();
		saldoInicialExcluir.afterClass();
	}
	
	@Test(priority = 11)
	public void saldoInicialFiltroAvan() {
		saldoInicialFiltroAvan = new SaldoInicialFiltroAvan();
		saldoInicialFiltroAvan.beforeClass();
		saldoInicialFiltroAvan.FiltrarAvanSaldoIncial();
		saldoInicialFiltroAvan.afterClass();
	}
	
	
	@Test(priority = 12)
	public void motivosdeDesligamentoCriar() {
		System.out.println(
				"-------------------Tabelas de Apoio E-SOCIAL > Tabela 19 - Motivos de Desligamento-------------------------");
		motivosdeDesligamentoCriar = new MotivosdeDesligamentoCriar();
		motivosdeDesligamentoCriar.beforeClass();
		motivosdeDesligamentoCriar.criarMotivoDesligamento();
		motivosdeDesligamentoCriar.afterClass();
	}
	
	@Test(priority = 13, dependsOnMethods = "motivosdeDesligamentoCriar")
	public void motivosdeDesligamentoEditar() {
		motivosdeDesligamentoEditar = new MotivosdeDesligamentoEditar();
		motivosdeDesligamentoEditar.beforeClass();
		motivosdeDesligamentoEditar.editarMotivoDesligamento();
		motivosdeDesligamentoEditar.afterClass();
	}
	
	
	@Test(priority = 14, dependsOnMethods = "motivosdeDesligamentoCriar")
	public void motivosdeDesligamentoVisualizar() {
		motivosdeDesligamentoVisualizar = new MotivosdeDesligamentoVisualizar();
		motivosdeDesligamentoVisualizar.beforeClass();
		motivosdeDesligamentoVisualizar.visualizarMotivosDesligamento();
		motivosdeDesligamentoVisualizar.afterClass();
	}
	
	@Test(priority = 15, dependsOnMethods = "motivosdeDesligamentoCriar")
	public void motivosdeDesligamentoExcluir() {
		motivosdeDesligamentoExcluir = new MotivosdeDesligamentoExcluir();
		motivosdeDesligamentoExcluir.beforeClass();
		motivosdeDesligamentoExcluir.excluirMotivosDesligamento();
		motivosdeDesligamentoExcluir.afterClass();
	}
	
	
	@Test(priority = 16)
	public void motivosdeDesligamentoExcluirMasa() {
		motivosdeDesligamentoExcluirMasa = new MotivosdeDesligamentoExcluirMasa();
		motivosdeDesligamentoExcluirMasa.beforeClass();
		//motivosdeDesligamentoExcluirMasa.excluirMasaMotivosDesligamento();
		motivosdeDesligamentoExcluirMasa.afterClass();
	}
	
	
	@Test(priority = 17)
	public void compatibilidadeEntreFPASCriar() {
		System.out.println(
				"------------------- Tabelas de Apoio E-SOCIAL	> Tabela 22 - Compatibilidade entre FPAS-------------------------");
		compatibilidadeEntreFPASCriar = new CompatibilidadeEntreFPASCriar();
		compatibilidadeEntreFPASCriar.beforeClass();
		compatibilidadeEntreFPASCriar.criarCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASCriar.afterClass();
	}
	
	@Test(priority = 18, dependsOnMethods = "compatibilidadeEntreFPASCriar")
	public void compatibilidadeEntreFPASEditar() {
		compatibilidadeEntreFPASEditar = new CompatibilidadeEntreFPASEditar();
		compatibilidadeEntreFPASEditar.beforeClass();
		compatibilidadeEntreFPASEditar.editarCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASEditar.afterClass();
	}
	
	@Test(priority = 19, dependsOnMethods = "compatibilidadeEntreFPASCriar")
	public void compatibilidadeEntreFPASVisualizar() {
		compatibilidadeEntreFPASVisualizar = new CompatibilidadeEntreFPASVisualizar();
		compatibilidadeEntreFPASVisualizar.beforeClass();
		compatibilidadeEntreFPASVisualizar.visualizarCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASVisualizar.afterClass();
	}
	
	@Test(priority = 20, dependsOnMethods = "compatibilidadeEntreFPASCriar")
	public void compatibilidadeEntreFPASExcluir() {
		compatibilidadeEntreFPASExcluir = new CompatibilidadeEntreFPASExcluir();
		compatibilidadeEntreFPASExcluir.beforeClass();
		compatibilidadeEntreFPASExcluir.excluirCompatibilidadeEntreFPAS();
		compatibilidadeEntreFPASExcluir.afterClass();
	}
	
	@Test(priority = 21)
	public void compatibilidadeEntreFPASExcluirEnMasa() {
		compatibilidadeEntreFPASExcluirEnMasa = new CompatibilidadeEntreFPASExcluirEnMasa();
		compatibilidadeEntreFPASExcluirEnMasa.beforeClass();
		compatibilidadeEntreFPASExcluirEnMasa.criar();
		compatibilidadeEntreFPASExcluirEnMasa.afterClass();
	}
	
	@Test(priority = 21)
	public void emprestimosCriar() {
		System.out.println(
				"-------------------Thin Capitalization	> Empréstimos-------------------------");
		emprestimosCriar = new EmprestimosCriar();
		emprestimosCriar.beforeClass();
		emprestimosCriar.criarEmprestimos();
		emprestimosCriar.afterClass();
	}
	
	@Test(priority = 22, dependsOnMethods = "emprestimosCriar")
	public void emprestimosEditar() {
		emprestimosEditar = new EmprestimosEditar();
		emprestimosEditar.beforeClass();
		emprestimosEditar.editarEmprestimos();
		emprestimosEditar.afterClass();
	}
	
	@Test(priority = 23, dependsOnMethods = "emprestimosCriar")
	public void emprestimosExcluir() {
		emprestimosExcluir = new EmprestimosExcluir();
		emprestimosExcluir.beforeClass();
		emprestimosExcluir.excluirEmprestimos();
		emprestimosExcluir.afterClass();
	}
	
	
	@Test(priority = 24)
	public void emprestimosExcluirEmMassa() {
		emprestimosExcluirEmMassa = new EmprestimosExcluirEmMassa();
		emprestimosExcluirEmMassa.beforeClass();
		emprestimosExcluirEmMassa.criar();
		emprestimosExcluirEmMassa.excluir();
		emprestimosExcluirEmMassa.afterClass();
	}
	
	
	@Test(priority = 25)
	public void iCMSSTTransporteExcluirEmMassa() {
		System.out.println(
				"-------------------ICMS-ST Transporte-------------------------");
		iCMSSTTransporteExcluirEmMassa = new ICMSSTTransporteExcluirEmMassa();
		iCMSSTTransporteExcluirEmMassa.beforeClass();
		iCMSSTTransporteExcluirEmMassa.criar();
		iCMSSTTransporteExcluirEmMassa.afterClass();
	}
	
	@Test(priority = 26)
	public void icmsstTransporteFiltroID() {
		icmsstTransporteFiltroID = new ICMSSTTransporteFiltroID();
		icmsstTransporteFiltroID.beforeClass();
		icmsstTransporteFiltroID.filtro();
		icmsstTransporteFiltroID.afterClass();
	}
	
	
	//ESPACIO PARA LOS ANTERIORES 
	// 31-36
	
	@Test(priority = 42)
	public void aliquotasDeTaxaDeActualizacaoExcluirEmMassa() {
		System.out.println(
				"------Taxas de Atualização > Alíquotas de Taxa de Atualização----------");
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa = new AliquotaDeTaxaDeActualizacaoExcluirEmMassa();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.beforeClass();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.criar();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.excluir();
		aliquotasDeTaxaDeActualizacaoExcluirEmMassa.afterClass();
	}
	
	
	@Test(priority = 44)
	public void tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa() {
		System.out.println(
				"------Tabela de Apoio do SPED > 4.3.5 Tabela Código de Contribuição Social Apurada----------");
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa = new TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.beforeClass();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.excluirEmMassa();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa.afterClass();
	}

	@Test(priority = 45)
	public void contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa() {
		System.out.println(
				"------Eventos e-Social > S1270 - Contratação de Trabalhadores Avulsos Não Portuários----------");
		contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa = new ContrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa.beforeClass();
//		contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa.ingresar();
//		contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa.ingresar();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa.excluirEmMassa();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa.afterClass();
	}
	
	@Test(priority = 46)
	public void s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID() {
		System.out.println(
				"------Eventos e-Social > S2240 - Condições Amb do Trab - Fat de Risco----------");
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID = new S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.beforeClass();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.filtroPorId();
		s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID.afterClass();
	}
	
	//SCANC > Ajuste de Transferencia
	
	@Test(priority = 47)
	public void ajusteDeTransferenciaExcluirEmMasa() {
		System.out.println(
				"------SCANC > Ajuste de Transferencia----------");
		ajusteDeTransferenciaExcluirEmMasa = new AjusteDeTransferenciaExcluirEmMasa();
		ajusteDeTransferenciaExcluirEmMasa.beforeClass();
		ajusteDeTransferenciaExcluirEmMasa.login();
		ajusteDeTransferenciaExcluirEmMasa.acessarMDR();
		ajusteDeTransferenciaExcluirEmMasa.excluir();
		ajusteDeTransferenciaExcluirEmMasa.afterClass();
	}
	
	//Tabelas de Apoio E-SOCIAL	> Tabela 23 - Fatores de Risco
	
	@Test(priority = 48)
	public void fatoresDeRiscoCriar() {
		System.out.println(
				"------Tabelas de Apoio E-SOCIAL	> Tabela 23 - Fatores de Risco----------");
		fatoresDeRiscoCriar = new FatoresDeRiscoCriar();
		fatoresDeRiscoCriar.beforeClass();
		fatoresDeRiscoCriar.criar();
		fatoresDeRiscoCriar.afterClass();
	}
	
	
	
	@Test(priority = 49, dependsOnMethods = "fatoresDeRiscoCriar")
	public void fatoresDeRiscoEditar() {
		fatoresDeRiscoEditar = new FatoresDeRiscoEditar();
		fatoresDeRiscoEditar.beforeClass();
		fatoresDeRiscoEditar.editar();
		fatoresDeRiscoEditar.afterClass();
	}
	
	@Test(priority = 50, dependsOnMethods = "fatoresDeRiscoCriar")
	public void factoresDeRiscoVisualizar() {
		factoresDeRiscoVisualizar = new FactoresDeRiscoVisualizar();
		factoresDeRiscoVisualizar.beforeClass();
		factoresDeRiscoVisualizar.visualizar();
		factoresDeRiscoVisualizar.afterClass();
	}
	
	@Test(priority = 51, dependsOnMethods = "fatoresDeRiscoCriar")
	public void factoresDeRiscoExcluir() {
		factoresDeRiscoExcluir = new FactoresDeRiscoExcluir();
		factoresDeRiscoExcluir.beforeClass();
		factoresDeRiscoExcluir.excluir();
		factoresDeRiscoExcluir.afterClass();
	}
	
	@Test(priority = 52)
	public void factoresDeRiscoExcluirMassa() {
		factoresDeRiscoExcluirMassa = new FactoresDeRiscoExcluirMassa();
		factoresDeRiscoExcluirMassa.beforeClass();
		factoresDeRiscoExcluirMassa.ExcluirMassa();
		factoresDeRiscoExcluirMassa.afterClass();
	}
	
	//Tabelas de Apoio E-SOCIAL	> Tabela 24 - Codificação de Ac. de Trab.
	
	@Test(priority = 53)
	public void codificaçãoDeAcDeTrabCriar() {
		System.out.println(
				"------Tabelas de Apoio E-SOCIAL	> Tabela 24 - Codificação de Ac. de Trab.----------");
		codificaçãoDeAcDeTrabCriar = new CodificaçãoDeAcDeTrabCriar();
		codificaçãoDeAcDeTrabCriar.beforeClass();
		codificaçãoDeAcDeTrabCriar.criar();
		codificaçãoDeAcDeTrabCriar.afterClass();
	}
	
	@Test(priority = 54, dependsOnMethods = "codificaçãoDeAcDeTrabCriar")
	public void codificaçãoDeAcDeTrabEditar() {
		codificaçãoDeAcDeTrabEditar = new CodificaçãoDeAcDeTrabEditar();
		codificaçãoDeAcDeTrabEditar.beforeClass();
		codificaçãoDeAcDeTrabEditar.editar();
		codificaçãoDeAcDeTrabEditar.afterClass();
	}
	
	@Test(priority = 55, dependsOnMethods = "codificaçãoDeAcDeTrabCriar")
	public void codificaçãoDeAcDeTrabVisualizar() {
		codificaçãoDeAcDeTrabVisualizar = new CodificaçãoDeAcDeTrabVisualizar();
		codificaçãoDeAcDeTrabVisualizar.beforeClass();
		codificaçãoDeAcDeTrabVisualizar.visualizar();
		codificaçãoDeAcDeTrabVisualizar.afterClass();
	}
	
	@Test(priority = 56, dependsOnMethods = "codificaçãoDeAcDeTrabCriar")
	public void codificaçãoDeAcDeTrabExcluir() {
		codificaçãoDeAcDeTrabExcluir = new CodificaçãoDeAcDeTrabExcluir();
		codificaçãoDeAcDeTrabExcluir.beforeClass();
		codificaçãoDeAcDeTrabExcluir.excluir();
		codificaçãoDeAcDeTrabExcluir.afterClass();
	}
	
	@Test(priority = 57)
	public void codificaçãoDeAcDeTrabExcluiMassa() {
		codificaçãoDeAcDeTrabExcluiMassa = new CodificaçãoDeAcDeTrabExcluiMassa();
		codificaçãoDeAcDeTrabExcluiMassa.beforeClass();
		codificaçãoDeAcDeTrabExcluiMassa.criar();
		codificaçãoDeAcDeTrabExcluiMassa.afterClass();
	}
	
	//Tabelas de Apoio E-SOCIAL	> Tabela 27 - Códigos de Lotação.
	
	@Test(priority = 58)
	public void codigosDeLotacaoCriar() {
		System.out.println(
				"------Tabelas de Apoio E-SOCIAL	> Tabela 27 - Códigos de Lotação.----------");
		codigosDeLotacaoCriar = new CodigosDeLotacaoCriar();
		codigosDeLotacaoCriar.beforeClass();
		codigosDeLotacaoCriar.criar();
		codigosDeLotacaoCriar.afterClass();
	}
	
	@Test(priority = 59, dependsOnMethods = "codigosDeLotacaoCriar")
	public void codigosDeLotacaoEditar() {
		codigosDeLotacaoEditar = new CodigosDeLotacaoEditar();
		codigosDeLotacaoEditar.beforeClass();
		codigosDeLotacaoEditar.editar();
		codigosDeLotacaoEditar.afterClass();
	}
	
	@Test(priority = 60,dependsOnMethods = "codigosDeLotacaoCriar")
	public void codigosDeLotacaoVisualizar() {
		codigosDeLotacaoVisualizar = new CodigosDeLotacaoVisualizar();
		codigosDeLotacaoVisualizar.beforeClass();
		codigosDeLotacaoVisualizar.visualizar();
		codigosDeLotacaoVisualizar.afterClass();
	}
	
	@Test(priority = 61,dependsOnMethods = "codigosDeLotacaoCriar")
	public void codigosDeLotacaoExcluir() {
		codigosDeLotacaoExcluir = new CodigosDeLotacaoExcluir();
		codigosDeLotacaoExcluir.beforeClass();
		codigosDeLotacaoExcluir.excluir();
		codigosDeLotacaoExcluir.afterClass();
	}
	
	@Test(priority = 62)
	public void codigosDeLotacaoExcluirEmMasa() {
		codigosDeLotacaoExcluirEmMasa = new CodigosDeLotacaoExcluirEmMasa();
		codigosDeLotacaoExcluirEmMasa.beforeClass();
		codigosDeLotacaoExcluirEmMasa.excluir();
		codigosDeLotacaoExcluirEmMasa.afterClass();
	}
	
	//Tabelas de Apoio E-SOCIAL	> Tabela 28 - Dados de RAT
	
	@Test(priority = 63)
	public void dadosDeRATCriar() {
		System.out.println(
				"------Tabelas de Apoio E-SOCIAL	> Tabela 28 - Dados de RAT.----------");
		dadosDeRATCriar = new DadosDeRATCriar();
		dadosDeRATCriar.beforeClass();
		dadosDeRATCriar.criar();
		dadosDeRATCriar.afterClass();
	}
	//Taxas de Atualização	Alíquotas de Taxa de Atualização
	@Test(priority = 64)
	public void aliquotaDeTaxaDeActualizacaoCriar() {
		System.out.println(
				"------Taxas de Atualização	Alíquotas de Taxa de Atualização.----------");
		aliquotaDeTaxaDeActualizacaoCriar = new AliquotaDeTaxaDeActualizacaoCriar();
		aliquotaDeTaxaDeActualizacaoCriar.beforeClass();
		aliquotaDeTaxaDeActualizacaoCriar.criar();
		aliquotaDeTaxaDeActualizacaoCriar.afterClass();
	}
	
	
	@Test(priority = 65, dependsOnMethods = "aliquotaDeTaxaDeActualizacaoCriar")
	public void aliquotaDeTaxaDeActualizacaoEditar() {
		aliquotaDeTaxaDeActualizacaoEditar = new AliquotaDeTaxaDeActualizacaoEditar();
		aliquotaDeTaxaDeActualizacaoEditar.beforeClass();
		aliquotaDeTaxaDeActualizacaoEditar.editar();
		aliquotaDeTaxaDeActualizacaoEditar.afterClass();
	}
	
	
	@Test(priority = 66, dependsOnMethods = "aliquotaDeTaxaDeActualizacaoCriar")
	public void aliquotaDeTaxaDeActualizacaoDetalhes() {
		aliquotaDeTaxaDeActualizacaoDetalhes = new AliquotaDeTaxaDeActualizacaoDetalhes();
		aliquotaDeTaxaDeActualizacaoDetalhes.beforeClass();
		aliquotaDeTaxaDeActualizacaoDetalhes.detalhes();
		aliquotaDeTaxaDeActualizacaoDetalhes.afterClass();
	}
	
	@Test(priority = 67, dependsOnMethods = "aliquotaDeTaxaDeActualizacaoCriar")
	public void aliquotaDeTaxaDeActualizacaoVisualizar() {
		aliquotaDeTaxaDeActualizacaoVisualizar = new AliquotaDeTaxaDeActualizacaoVisualizar();
		aliquotaDeTaxaDeActualizacaoVisualizar.beforeClass();
		aliquotaDeTaxaDeActualizacaoVisualizar.visualizar();
		aliquotaDeTaxaDeActualizacaoVisualizar.afterClass();
	}
	
	@Test(priority = 68, dependsOnMethods = "aliquotaDeTaxaDeActualizacaoCriar")
	public void aliquotaDeTaxaDeActualizacaoExcluir() {
		aliquotaDeTaxaDeActualizacaoExcluir = new AliquotaDeTaxaDeActualizacaoExcluir();
		aliquotaDeTaxaDeActualizacaoExcluir.beforeClass();
		aliquotaDeTaxaDeActualizacaoExcluir.excluir();
		aliquotaDeTaxaDeActualizacaoExcluir.afterClass();
	}
	
}
