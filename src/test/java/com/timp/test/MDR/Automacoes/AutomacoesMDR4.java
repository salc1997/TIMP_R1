package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;

import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Criar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Detalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Editar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Excluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10Visualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Criar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Detalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Editar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Excluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11ExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11Visualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Criar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Detalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Editar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Excluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12ExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12Visualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeLogradouros.TabelaLogradouroCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeLogradouros.TabelaLogradouroEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeLogradouros.TabelaLogradouroExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeLogradouros.TabelaLogradouroVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeLogradouros.TabelaLograduroDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeOutrosCreditos.TabelaDeOutrosCreditosVisualizar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeProdutos.TabelaDeProdutosCriar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeProdutos.TabelaDeProdutosDetalhes;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeProdutos.TabelaDeProdutosEditar;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeProdutos.TabelaDeProdutosExcluir;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeProdutos.TabelaDeProdutosExcluirEmMassa;
import com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeProdutos.TabelaDeProdutosVisualizar;

public class AutomacoesMDR4 extends TestBaseSteven {

	// Tabelas Complementares para obriga�oes acessorias > Tabela de codigos de
	// tranferencias

	TabelaDeCodigosDeTransferenciasCriar tabelaDeCodigosDeTransferenciasCriar;
	TabelaDeCodigosDeTransferenciasDetalhes tabelaDeCodigosDeTransferenciasDetalhes;
	TabelaDeCodigosDeTransferenciasEditar tabelaDeCodigosDeTransferenciasEditar;
	TabelaDeCodigosDeTransferenciasExcluir tabelaDeCodigosDeTransferenciasExcluir;
	TabelaDeCodigosDeTransferenciasVisualizar tabelaDeCodigosDeTransferenciasVisualizar;

	// Tabelas Complementares para obriga�oes acessorias > Tabela de credito por
	// obriga�ao
	TabelaDeCreditosPorObrigacaoCriar tabelaDeCreditosPorObrigacaoCriar;
	TabelaDeCreditosPorObrigacaoDetalhes tabelaDeCreditosPorObrigacaoDetalhes;
	TabelaDeCreditosPorObrigacaoEditar tabelaDeCreditosPorObrigacaoEditar;
	TabelaDeCreditosPorObrigacaoExcluir tabelaDeCreditosPorObrigacaoExcluir;
	TabelaDeCreditosPorObrigacaoVisualizar tabelaDeCreditosPorObrigacaoVisualizar;
	TabelaDeCreditosPorObrigacaoExcluirEmMassa tabelaDeCreditosPorObrigacaoExcluirEmMassa;

	// Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamento
	// Para Registro 10
	TabelaDeDetalhamentosParaRegistro10Criar tabelaDeDetalhamentosParaRegistro10Criar;
	TabelaDeDetalhamentosParaRegistro10Detalhes tabelaDeDetalhamentosParaRegistro10Detalhes;
	TabelaDeDetalhamentosParaRegistro10Editar tabelaDeDetalhamentosParaRegistro10Editar;
	TabelaDeDetalhamentosParaRegistro10Excluir tabelaDeDetalhamentosParaRegistro10Excluir;
	TabelaDeDetalhamentosParaRegistro10Visualizar tabelaDeDetalhamentosParaRegistro10Visualizar;

	// Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamento
	// Para Registro 11
	TabelaDeDetalhamentosParaRegistro11Criar tabelaDeDetalhamentosParaRegistro11Criar;
	TabelaDeDetalhamentosParaRegistro11Detalhes tabelaDeDetalhamentosParaRegistro11Detalhes;
	TabelaDeDetalhamentosParaRegistro11Editar tabelaDeDetalhamentosParaRegistro11Editar;
	TabelaDeDetalhamentosParaRegistro11Excluir tabelaDeDetalhamentosParaRegistro11Excluir;
	TabelaDeDetalhamentosParaRegistro11Visualizar tabelaDeDetalhamentosParaRegistro11Visualizar;
	TabelaDeDetalhamentosParaRegistro11ExcluirEmMassa tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa;
	// Tabelas Complementares para obriga�oes acessorias > Tabela de estoque para
	// registro 12
	TabelaDeEstoqueParaRegistro12Criar tabelaDeEstoqueParaRegistro12Criar;
	TabelaDeEstoqueParaRegistro12Editar tabelaDeEstoqueParaRegistro12Editar;
	TabelaDeEstoqueParaRegistro12Detalhes tabelaDeEstoqueParaRegistro12Detalhes;
	TabelaDeEstoqueParaRegistro12Excluir tabelaDeEstoqueParaRegistro12Excluir;
	TabelaDeEstoqueParaRegistro12Visualizar tabelaDeEstoqueParaRegistro12Visualizar;
	TabelaDeEstoqueParaRegistro12ExcluirEmMassa tabelaDeEstoqueParaRegistro12ExcluirEmMassa;

	// Tabelas Complementares para obriga�oes acessorias > Tabela de isen�oes

	TabelaDeIsencoesCriar tabelaDeIsencoesCriar;
	TabelaDeIsencoesDetalhes tabelaDeIsencoesDetalhes;
	TabelaDeIsencoesEditar tabelaDeIsencoesEditar;
	TabelaDeIsencoesExcluir tabelaDeIsencoesExcluir;
	TabelaDeIsencoesVisualizar tabelaDeIsencoesVisualizar;
	TabelaDeIsencoesExcluirEmMassa tabelaDeIsencoesExcluirEmMassa;

	// Tabelas Complementares para obriga�oes acessorias > Tabela de outros creditos

	TabelaDeOutrosCreditosCriar tabelaDeOutrosCreditosCriar;
	TabelaDeOutrosCreditosDetalhes tabelaDeOutrosCreditosDetalhes;
	TabelaDeOutrosCreditosEditar tabelaDeOutrosCreditosEditar;
	TabelaDeOutrosCreditosExcluir tabelaDeOutrosCreditosExcluir;
	TabelaDeOutrosCreditosVisualizar tabelaDeOutrosCreditosVisualizar;
	TabelaDeOutrosCreditosExcluirEmMassa tabelaDeOutrosCreditosExcluirEmMassa;
	
	// Tabelas Complementares para obriga�oes acessorias > Tabela de Produtos

	TabelaDeProdutosCriar tabelaDeProdutosCriar;
	TabelaDeProdutosDetalhes tabelaDeProdutosDetalhes;
	TabelaDeProdutosExcluir tabelaDeProdutosExcluir;
	TabelaDeProdutosExcluirEmMassa tabelaDeProdutosExcluirEmMassa;
	TabelaDeProdutosEditar tabelaDeProdutosEditar;
	TabelaDeProdutosVisualizar tabelaDeProdutosVisualizar;

	// Tabelas Complementares para obriga�oes acessorias > Tabela de Logradouros
	TabelaLogradouroCriar tabelaLogradouroCriar;
	TabelaLograduroDetalhes tabelaLograduroDetalhes;
	TabelaLogradouroEditar tabelaLogradouroEditar;
	TabelaLogradouroExcluir tabelaLogradouroExcluir;
	TabelaLogradouroVisualizar tabelaLogradouroVisualizar;
	
	// --------------------------------------------------------------------------------------------------

	// Tabelas Complementares para obriga�oes acessorias > Tabela de codigos de
	// tranferencias

	@Test(priority = 0)
	public void tabelaDeCodigosDeTransferenciasCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de codigos de tranferencias-------------------------");
		tabelaDeCodigosDeTransferenciasCriar = new TabelaDeCodigosDeTransferenciasCriar();
		tabelaDeCodigosDeTransferenciasCriar.beforeClass();
		tabelaDeCodigosDeTransferenciasCriar.login();
		tabelaDeCodigosDeTransferenciasCriar.acessarMDR();
		tabelaDeCodigosDeTransferenciasCriar.criar();
		tabelaDeCodigosDeTransferenciasCriar.afterClass();

	}

	@Test(priority = 1)
	public void tabelaDeCodigosDeTransferenciasDetalhes() {

		tabelaDeCodigosDeTransferenciasDetalhes = new TabelaDeCodigosDeTransferenciasDetalhes();
		tabelaDeCodigosDeTransferenciasDetalhes.beforeClass();
		tabelaDeCodigosDeTransferenciasDetalhes.login();
		tabelaDeCodigosDeTransferenciasDetalhes.acessarMDR();
		tabelaDeCodigosDeTransferenciasDetalhes.detalhes();
		tabelaDeCodigosDeTransferenciasDetalhes.afterClass();

	}

	@Test(priority = 2)
	public void tabelaDeCodigosDeTransferenciasEditar() {

		tabelaDeCodigosDeTransferenciasEditar = new TabelaDeCodigosDeTransferenciasEditar();
		tabelaDeCodigosDeTransferenciasEditar.beforeClass();
		tabelaDeCodigosDeTransferenciasEditar.login();
		tabelaDeCodigosDeTransferenciasEditar.acessarMDR();
		tabelaDeCodigosDeTransferenciasEditar.editar();
		tabelaDeCodigosDeTransferenciasEditar.afterClass();

	}

	@Test(priority = 3)
	public void tabelaDeCodigosDeTransferenciasVisualizar() {
		tabelaDeCodigosDeTransferenciasVisualizar = new TabelaDeCodigosDeTransferenciasVisualizar();
		tabelaDeCodigosDeTransferenciasVisualizar.beforeClass();
		tabelaDeCodigosDeTransferenciasVisualizar.login();
		tabelaDeCodigosDeTransferenciasVisualizar.acessarMDR();
		tabelaDeCodigosDeTransferenciasVisualizar.visualizar();
		tabelaDeCodigosDeTransferenciasVisualizar.afterClass();

	}

	@Test(priority = 4)
	public void tabelaDeCodigosDeTransferenciasExcluir() {

		tabelaDeCodigosDeTransferenciasExcluir = new TabelaDeCodigosDeTransferenciasExcluir();
		tabelaDeCodigosDeTransferenciasExcluir.beforeClass();
		tabelaDeCodigosDeTransferenciasExcluir.login();
		tabelaDeCodigosDeTransferenciasExcluir.acessarMDR();
		tabelaDeCodigosDeTransferenciasExcluir.excluir();
		tabelaDeCodigosDeTransferenciasExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de codigos de tranferencias Fim-------------------------");

	}
	// priority 6
	// Tabelas Complementares para obriga�oes acessorias > Tabela de credito por
	// obriga�ao

	@Test(priority = 6)
	public void tabelaDeCreditosPorObrigacaoCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de credito por obriga�ao-------------------------");
		tabelaDeCreditosPorObrigacaoCriar = new TabelaDeCreditosPorObrigacaoCriar();
		tabelaDeCreditosPorObrigacaoCriar.beforeClass();
		tabelaDeCreditosPorObrigacaoCriar.login();
		tabelaDeCreditosPorObrigacaoCriar.acessarMDR();
		tabelaDeCreditosPorObrigacaoCriar.criar();
		tabelaDeCreditosPorObrigacaoCriar.afterClass();

	}

	@Test(priority = 7, dependsOnMethods = "tabelaDeCreditosPorObrigacaoCriar")
	public void tabelaDeCreditosPorObrigacaoDetalhes() {

		tabelaDeCreditosPorObrigacaoDetalhes = new TabelaDeCreditosPorObrigacaoDetalhes();
		tabelaDeCreditosPorObrigacaoDetalhes.beforeClass();
		tabelaDeCreditosPorObrigacaoDetalhes.login();
		tabelaDeCreditosPorObrigacaoDetalhes.acessarMDR();
		tabelaDeCreditosPorObrigacaoDetalhes.detalhes();
		tabelaDeCreditosPorObrigacaoDetalhes.afterClass();

	}

	@Test(priority = 8)
	public void tabelaDeCreditosPorObrigacaoEditar() {

		tabelaDeCreditosPorObrigacaoEditar = new TabelaDeCreditosPorObrigacaoEditar();
		tabelaDeCreditosPorObrigacaoEditar.beforeClass();
		tabelaDeCreditosPorObrigacaoEditar.login();
		tabelaDeCreditosPorObrigacaoEditar.acessarMDR();
		tabelaDeCreditosPorObrigacaoEditar.editar();
		tabelaDeCreditosPorObrigacaoEditar.afterClass();

	}

	@Test(priority = 9)
	public void tabelaDeCreditosPorObrigacaoVisulizar() {

		tabelaDeCreditosPorObrigacaoVisualizar = new TabelaDeCreditosPorObrigacaoVisualizar();
		tabelaDeCreditosPorObrigacaoVisualizar.beforeClass();
		tabelaDeCreditosPorObrigacaoVisualizar.login();
		tabelaDeCreditosPorObrigacaoVisualizar.acessarMDR();
		tabelaDeCreditosPorObrigacaoVisualizar.visualizar();
		tabelaDeCreditosPorObrigacaoVisualizar.afterClass();

	}

	@Test(priority = 10)
	public void tabelaDeCreditosPorObrigacaoExcluir() {

		tabelaDeCreditosPorObrigacaoExcluir = new TabelaDeCreditosPorObrigacaoExcluir();
		tabelaDeCreditosPorObrigacaoExcluir.beforeClass();
		tabelaDeCreditosPorObrigacaoExcluir.login();
		tabelaDeCreditosPorObrigacaoExcluir.acessarMDR();
		tabelaDeCreditosPorObrigacaoExcluir.excluir();
		tabelaDeCreditosPorObrigacaoExcluir.afterClass();
			}
	
	@Test(priority = 11)
	public void tabelaDeCreditosPorObrigacaoExcluirEmMassa() {

		tabelaDeCreditosPorObrigacaoExcluirEmMassa = new TabelaDeCreditosPorObrigacaoExcluirEmMassa();
		tabelaDeCreditosPorObrigacaoExcluirEmMassa.beforeClass();
		tabelaDeCreditosPorObrigacaoExcluirEmMassa.login();
		tabelaDeCreditosPorObrigacaoExcluirEmMassa.acessarMDR();
		tabelaDeCreditosPorObrigacaoExcluirEmMassa.criar();
		tabelaDeCreditosPorObrigacaoExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de credito por obriga�ao Fim-------------------------");
	}

	// 12
	// Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamentos
	// Para Registro 10

	@Test(priority = 12)
	public void tabelaDeDetalhamentosParaRegistro10Criar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamentos Para Registro 10-------------------------");
		tabelaDeDetalhamentosParaRegistro10Criar = new TabelaDeDetalhamentosParaRegistro10Criar();
		tabelaDeDetalhamentosParaRegistro10Criar.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Criar.login();
		tabelaDeDetalhamentosParaRegistro10Criar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Criar.criar();
		tabelaDeDetalhamentosParaRegistro10Criar.afterClass();

	}

	@Test(priority = 13)
	public void tabelaDeDetalhamentosParaRegistro10Detalhes() {

		tabelaDeDetalhamentosParaRegistro10Detalhes = new TabelaDeDetalhamentosParaRegistro10Detalhes();
		tabelaDeDetalhamentosParaRegistro10Detalhes.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Detalhes.login();
		tabelaDeDetalhamentosParaRegistro10Detalhes.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Detalhes.detalhes();
		tabelaDeDetalhamentosParaRegistro10Detalhes.afterClass();

	}

	@Test(priority = 14)
	public void tabelaDeDetalhamentosParaRegistro10Editar() {

		tabelaDeDetalhamentosParaRegistro10Editar = new TabelaDeDetalhamentosParaRegistro10Editar();
		tabelaDeDetalhamentosParaRegistro10Editar.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Editar.login();
		tabelaDeDetalhamentosParaRegistro10Editar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Editar.editar();
		tabelaDeDetalhamentosParaRegistro10Editar.afterClass();

	}

	@Test(priority = 15)
	public void tabelaDeDetalhamentosParaRegistro10Visualizar() {

		tabelaDeDetalhamentosParaRegistro10Visualizar = new TabelaDeDetalhamentosParaRegistro10Visualizar();
		tabelaDeDetalhamentosParaRegistro10Visualizar.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Visualizar.login();
		tabelaDeDetalhamentosParaRegistro10Visualizar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Visualizar.visualizar();
		tabelaDeDetalhamentosParaRegistro10Visualizar.afterClass();

	}

	@Test(priority = 16)
	public void tabelaDeDetalhamentosParaRegistro10Excluir() {

		tabelaDeDetalhamentosParaRegistro10Excluir = new TabelaDeDetalhamentosParaRegistro10Excluir();
		tabelaDeDetalhamentosParaRegistro10Excluir.beforeClass();
		tabelaDeDetalhamentosParaRegistro10Excluir.login();
		tabelaDeDetalhamentosParaRegistro10Excluir.acessarMDR();
		tabelaDeDetalhamentosParaRegistro10Excluir.excluir();
		tabelaDeDetalhamentosParaRegistro10Excluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamentos Para Registro 10 Fim-------------------------");

	}

	// 18
	// Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamentos
	// Para Registro 11

	@Test(priority = 18)
	public void tabelaDeDetalhamentosParaRegistro11Criar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamentos Para Registro 11-------------------------");
		tabelaDeDetalhamentosParaRegistro11Criar = new TabelaDeDetalhamentosParaRegistro11Criar();
		tabelaDeDetalhamentosParaRegistro11Criar.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Criar.login();
		tabelaDeDetalhamentosParaRegistro11Criar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Criar.criar();
		tabelaDeDetalhamentosParaRegistro11Criar.afterClass();

	}

	@Test(priority = 19)
	public void tabelaDeDetalhamentosParaRegistro11Detalhes() {

		tabelaDeDetalhamentosParaRegistro11Detalhes = new TabelaDeDetalhamentosParaRegistro11Detalhes();
		tabelaDeDetalhamentosParaRegistro11Detalhes.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Detalhes.login();
		tabelaDeDetalhamentosParaRegistro11Detalhes.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Detalhes.detalhes();
		tabelaDeDetalhamentosParaRegistro11Detalhes.afterClass();

	}

	@Test(priority = 20)
	public void tabelaDeDetalhamentosParaRegistro11Editar() {

		tabelaDeDetalhamentosParaRegistro11Editar = new TabelaDeDetalhamentosParaRegistro11Editar();
		tabelaDeDetalhamentosParaRegistro11Editar.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Editar.login();
		tabelaDeDetalhamentosParaRegistro11Editar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Editar.editar();
		tabelaDeDetalhamentosParaRegistro11Editar.afterClass();

	}

	@Test(priority = 21)
	public void tabelaDeDetalhamentosParaRegistro11Visualizar() {

		tabelaDeDetalhamentosParaRegistro11Visualizar = new TabelaDeDetalhamentosParaRegistro11Visualizar();
		tabelaDeDetalhamentosParaRegistro11Visualizar.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Visualizar.login();
		tabelaDeDetalhamentosParaRegistro11Visualizar.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Visualizar.visualizar();
		tabelaDeDetalhamentosParaRegistro11Visualizar.afterClass();

	}

	@Test(priority = 22)
	public void tabelaDeDetalhamentosParaRegistro11Excluir() {

		tabelaDeDetalhamentosParaRegistro11Excluir = new TabelaDeDetalhamentosParaRegistro11Excluir();
		tabelaDeDetalhamentosParaRegistro11Excluir.beforeClass();
		tabelaDeDetalhamentosParaRegistro11Excluir.login();
		tabelaDeDetalhamentosParaRegistro11Excluir.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11Excluir.excluir();
		tabelaDeDetalhamentosParaRegistro11Excluir.afterClass();
		
	}
	
	@Test(priority = 23)
	public void tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa() {

		tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa = new TabelaDeDetalhamentosParaRegistro11ExcluirEmMassa();
		tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa.beforeClass();
		tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa.login();
		tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa.acessarMDR();
		tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa.criar();
		tabelaDeDetalhamentosParaRegistro11ExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Detalhamentos Para Registro 11 Fim-------------------------");

	}

	// 24
	// Tabelas Complementares para obriga�oes acessorias > Tabela de Estoque para
	// registro 12

	@Test(priority = 24)
	public void tabelaDeEstoqueParaRegistro12Criar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de estoque para registro 12-------------------------");
		tabelaDeEstoqueParaRegistro12Criar = new TabelaDeEstoqueParaRegistro12Criar();
		tabelaDeEstoqueParaRegistro12Criar.beforeClass();
		tabelaDeEstoqueParaRegistro12Criar.login();
		tabelaDeEstoqueParaRegistro12Criar.acessarMDR();
		tabelaDeEstoqueParaRegistro12Criar.criar();
		tabelaDeEstoqueParaRegistro12Criar.afterClass();

	}

	@Test(priority = 25)
	public void tabelaDeEstoqueParaRegistro12Detalhes() {

		tabelaDeEstoqueParaRegistro12Detalhes = new TabelaDeEstoqueParaRegistro12Detalhes();
		tabelaDeEstoqueParaRegistro12Detalhes.beforeClass();
		tabelaDeEstoqueParaRegistro12Detalhes.login();
		tabelaDeEstoqueParaRegistro12Detalhes.acessarMDR();
		tabelaDeEstoqueParaRegistro12Detalhes.detalhes();
		tabelaDeEstoqueParaRegistro12Detalhes.afterClass();

	}

	@Test(priority = 26)
	public void tabelaDeEstoqueParaRegistro12Editar() {

		tabelaDeEstoqueParaRegistro12Editar = new TabelaDeEstoqueParaRegistro12Editar();
		tabelaDeEstoqueParaRegistro12Editar.beforeClass();
		tabelaDeEstoqueParaRegistro12Editar.login();
		tabelaDeEstoqueParaRegistro12Editar.acessarMDR();
		tabelaDeEstoqueParaRegistro12Editar.editar();
		tabelaDeEstoqueParaRegistro12Editar.afterClass();

	}

	@Test(priority = 27)
	public void tabelaDeEstoqueParaRegistro12Visualizar() {

		tabelaDeEstoqueParaRegistro12Visualizar = new TabelaDeEstoqueParaRegistro12Visualizar();
		tabelaDeEstoqueParaRegistro12Visualizar.beforeClass();
		tabelaDeEstoqueParaRegistro12Visualizar.login();
		tabelaDeEstoqueParaRegistro12Visualizar.acessarMDR();
		tabelaDeEstoqueParaRegistro12Visualizar.visualizar();
		tabelaDeEstoqueParaRegistro12Visualizar.afterClass();

	}

	@Test(priority = 28)
	public void tabelaDeEstoqueParaRegistro12Excluir() {

		tabelaDeEstoqueParaRegistro12Excluir = new TabelaDeEstoqueParaRegistro12Excluir();
		tabelaDeEstoqueParaRegistro12Excluir.beforeClass();
		tabelaDeEstoqueParaRegistro12Excluir.login();
		tabelaDeEstoqueParaRegistro12Excluir.acessarMDR();
		tabelaDeEstoqueParaRegistro12Excluir.excluir();
		tabelaDeEstoqueParaRegistro12Excluir.afterClass();
			}
	
	@Test(priority = 29)
	public void tabelaDeEstoqueParaRegistro12ExcluirEmMassa() {

		tabelaDeEstoqueParaRegistro12ExcluirEmMassa = new TabelaDeEstoqueParaRegistro12ExcluirEmMassa();
		tabelaDeEstoqueParaRegistro12ExcluirEmMassa.beforeClass();
		tabelaDeEstoqueParaRegistro12ExcluirEmMassa.login();
		tabelaDeEstoqueParaRegistro12ExcluirEmMassa.acessarMDR();
		tabelaDeEstoqueParaRegistro12ExcluirEmMassa.criar();
		tabelaDeEstoqueParaRegistro12ExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de estoque para registro 12 Fim-------------------------");
	}

	// 30
	// Tabelas Complementares para obriga�oes acessorias > Tabela de isen�oes

	@Test(priority = 30)
	public void tabelaDeIsencoesCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de isen�oes-------------------------");
		tabelaDeIsencoesCriar = new TabelaDeIsencoesCriar();
		tabelaDeIsencoesCriar.beforeClass();
		tabelaDeIsencoesCriar.login();
		tabelaDeIsencoesCriar.acessarMDR();
		tabelaDeIsencoesCriar.criar();
		tabelaDeIsencoesCriar.afterClass();

	}

	@Test(priority = 31)
	public void tabelaDeIsencoesDetalhes() {

		tabelaDeIsencoesDetalhes = new TabelaDeIsencoesDetalhes();
		tabelaDeIsencoesDetalhes.beforeClass();
		tabelaDeIsencoesDetalhes.login();
		tabelaDeIsencoesDetalhes.acessarMDR();
		tabelaDeIsencoesDetalhes.Detalhes();
		tabelaDeIsencoesDetalhes.afterClass();

	}

	@Test(priority = 32)
	public void tabelaDeIsencoesEditar() {

		tabelaDeIsencoesEditar = new TabelaDeIsencoesEditar();
		tabelaDeIsencoesEditar.beforeClass();
		tabelaDeIsencoesEditar.login();
		tabelaDeIsencoesEditar.acessarMDR();
		tabelaDeIsencoesEditar.editar();
		tabelaDeIsencoesEditar.afterClass();

	}

	@Test(priority = 33)
	public void tabelaDeIsencoesVisualizar() {

		tabelaDeIsencoesVisualizar = new TabelaDeIsencoesVisualizar();
		tabelaDeIsencoesVisualizar.beforeClass();
		tabelaDeIsencoesVisualizar.login();
		tabelaDeIsencoesVisualizar.acessarMDR();
		tabelaDeIsencoesVisualizar.Visualizar();
		tabelaDeIsencoesVisualizar.afterClass();

	}

	@Test(priority = 34)
	public void tabelaDeIsencoesExcluir() {

		tabelaDeIsencoesExcluir = new TabelaDeIsencoesExcluir();
		tabelaDeIsencoesExcluir.beforeClass();
		tabelaDeIsencoesExcluir.login();
		tabelaDeIsencoesExcluir.acessarMDR();
		tabelaDeIsencoesExcluir.excluir();
		tabelaDeIsencoesExcluir.afterClass();
	}
	
	@Test(priority = 35)
	public void tabelaDeIsencoesExcluirEmMassa() {

		tabelaDeIsencoesExcluirEmMassa = new TabelaDeIsencoesExcluirEmMassa();
		tabelaDeIsencoesExcluirEmMassa.beforeClass();
		tabelaDeIsencoesExcluirEmMassa.login();
		tabelaDeIsencoesExcluirEmMassa.acessarMDR();
		tabelaDeIsencoesExcluirEmMassa.criar();
		tabelaDeIsencoesExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de inse�oes Fim-------------------------");

	}

	// 36
	// Tabelas Complementares para obriga�oes acessorias > Tabela de outros creditos

	@Test(priority = 36)
	public void tabelaDeOutrosCreditosCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de outros creditos-------------------------");
		tabelaDeOutrosCreditosCriar = new TabelaDeOutrosCreditosCriar();
		tabelaDeOutrosCreditosCriar.beforeClass();
		tabelaDeOutrosCreditosCriar.login();
		tabelaDeOutrosCreditosCriar.acessarMDR();
		tabelaDeOutrosCreditosCriar.criar();
		tabelaDeOutrosCreditosCriar.afterClass();

	}

	@Test(priority = 37)
	public void tabelaDeOutrosCreditosDetalhes() {

		tabelaDeOutrosCreditosDetalhes = new TabelaDeOutrosCreditosDetalhes();
		tabelaDeOutrosCreditosDetalhes.beforeClass();
		tabelaDeOutrosCreditosDetalhes.login();
		tabelaDeOutrosCreditosDetalhes.acessarMDR();
		tabelaDeOutrosCreditosDetalhes.Detalhes();
		tabelaDeOutrosCreditosDetalhes.afterClass();

	}

	@Test(priority = 38)
	public void tabelaDeOutrosCreditosEditar() {

		tabelaDeOutrosCreditosEditar = new TabelaDeOutrosCreditosEditar();
		tabelaDeOutrosCreditosEditar.beforeClass();
		tabelaDeOutrosCreditosEditar.login();
		tabelaDeOutrosCreditosEditar.acessarMDR();
		tabelaDeOutrosCreditosEditar.editar();
		tabelaDeOutrosCreditosEditar.afterClass();

	}

	@Test(priority = 39)
	public void tabelaDeOutrosCreditosVisualizar() {

		tabelaDeOutrosCreditosVisualizar = new TabelaDeOutrosCreditosVisualizar();
		tabelaDeOutrosCreditosVisualizar.beforeClass();
		tabelaDeOutrosCreditosVisualizar.login();
		tabelaDeOutrosCreditosVisualizar.acessarMDR();
		tabelaDeOutrosCreditosVisualizar.Visualizar();
		tabelaDeOutrosCreditosVisualizar.afterClass();
	}

	@Test(priority = 40)
	public void tabelaDeOutrosCreditosExcluir() {

		tabelaDeOutrosCreditosExcluir = new TabelaDeOutrosCreditosExcluir();
		tabelaDeOutrosCreditosExcluir.beforeClass();
		tabelaDeOutrosCreditosExcluir.login();
		tabelaDeOutrosCreditosExcluir.acessarMDR();
		tabelaDeOutrosCreditosExcluir.excluir();
		tabelaDeOutrosCreditosExcluir.afterClass();
		}
	
	@Test(priority = 41)
	public void tabelaDeOutrosCreditosExcluirEmMassa() {

		tabelaDeOutrosCreditosExcluirEmMassa = new TabelaDeOutrosCreditosExcluirEmMassa();
		tabelaDeOutrosCreditosExcluirEmMassa.beforeClass();
		tabelaDeOutrosCreditosExcluirEmMassa.login();
		tabelaDeOutrosCreditosExcluirEmMassa.acessarMDR();
		tabelaDeOutrosCreditosExcluirEmMassa.criar();
		tabelaDeOutrosCreditosExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de outros creditos Fim-------------------------");
	}

	// 42
	// Tabelas Complementares para obriga�oes acessorias > Tabela de Produtos
	@Test(priority = 42)
	public void tabelaDeProdutosCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Produtos-------------------------");
		tabelaDeProdutosCriar = new TabelaDeProdutosCriar();
		tabelaDeProdutosCriar.beforeClass();
		tabelaDeProdutosCriar.login();
		tabelaDeProdutosCriar.acessarMDR();
		tabelaDeProdutosCriar.criar();
		tabelaDeProdutosCriar.afterClass();

	}

	@Test(priority = 43)
	public void tabelaDeProdutosDetalhes() {
		tabelaDeProdutosDetalhes = new TabelaDeProdutosDetalhes();
		tabelaDeProdutosDetalhes.beforeClass();
		tabelaDeProdutosDetalhes.login();
		tabelaDeProdutosDetalhes.acessarMDR();
		tabelaDeProdutosDetalhes.Detalhes();
		tabelaDeProdutosDetalhes.afterClass();

	}
	

	@Test(priority = 44)
	public void tabelaDeProdutosEditar() {
		tabelaDeProdutosEditar = new TabelaDeProdutosEditar();
		tabelaDeProdutosEditar.beforeClass();
		tabelaDeProdutosEditar.login();
		tabelaDeProdutosEditar.acessarMDR();
		tabelaDeProdutosEditar.editar();
		tabelaDeProdutosEditar.afterClass();
		
	}
	
	@Test(priority = 45)
	public void tabelaDeProdutosVisualizar() {
		tabelaDeProdutosVisualizar = new TabelaDeProdutosVisualizar();
		tabelaDeProdutosVisualizar.beforeClass();
		tabelaDeProdutosVisualizar.login();
		tabelaDeProdutosVisualizar.acessarMDR();
		tabelaDeProdutosVisualizar.visualizar();
		tabelaDeProdutosVisualizar.afterClass();
		
	}

	@Test(priority = 46)
	public void tabelaDeProdutosExcluir() {
		tabelaDeProdutosExcluir = new TabelaDeProdutosExcluir();
		tabelaDeProdutosExcluir.beforeClass();
		tabelaDeProdutosExcluir.login();
		tabelaDeProdutosExcluir.acessarMDR();
		tabelaDeProdutosExcluir.excluir();
		tabelaDeProdutosExcluir.afterClass();
		
	}
	
	
	
	@Test(priority = 47)
	public void tabelaDeProdutosExcluirEmMassa() {
		tabelaDeProdutosExcluirEmMassa = new TabelaDeProdutosExcluirEmMassa();
		tabelaDeProdutosExcluirEmMassa.beforeClass();
		tabelaDeProdutosExcluirEmMassa.login();
		tabelaDeProdutosExcluirEmMassa.acessarMDR();
		tabelaDeProdutosExcluirEmMassa.criar();
		tabelaDeProdutosExcluirEmMassa.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Produtos Fim-------------------------");

	}

	// 48
	// Tabelas Complementares para obriga�oes acessorias > Tabela de Logradouro
	@Test(priority = 48)
	public void tabelaLogradouroCriar() {
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Logradouro-------------------------");
		tabelaLogradouroCriar = new TabelaLogradouroCriar();
		tabelaLogradouroCriar.beforeClass();
		tabelaLogradouroCriar.login();
		tabelaLogradouroCriar.acessarMDR();
		tabelaLogradouroCriar.criar();
		tabelaLogradouroCriar.afterClass();

	}

	@Test(priority = 49)
	public void tabelaLograduroDetalhes() {

		tabelaLograduroDetalhes = new TabelaLograduroDetalhes();
		tabelaLograduroDetalhes.beforeClass();
		tabelaLograduroDetalhes.login();
		tabelaLograduroDetalhes.acessarMDR();
		tabelaLograduroDetalhes.detalhes();
		tabelaLograduroDetalhes.afterClass();

	}

	@Test(priority = 50)
	public void tabelaLogradouroEditar() {

		tabelaLogradouroEditar = new TabelaLogradouroEditar();
		tabelaLogradouroEditar.beforeClass();
		tabelaLogradouroEditar.login();
		tabelaLogradouroEditar.acessarMDR();
		tabelaLogradouroEditar.editar();
		tabelaLogradouroEditar.afterClass();

	}

	@Test(priority = 51)
	public void tabelaLogradouroVisuzalizar() {

		tabelaLogradouroVisualizar = new TabelaLogradouroVisualizar();
		tabelaLogradouroVisualizar.beforeClass();
		tabelaLogradouroVisualizar.login();
		tabelaLogradouroVisualizar.acessarMDR();
		tabelaLogradouroVisualizar.visualizar();
		tabelaLogradouroVisualizar.afterClass();
	}

	@Test(priority = 52)
	public void tabelaLogradouroExcluir() {

		tabelaLogradouroExcluir = new TabelaLogradouroExcluir();
		tabelaLogradouroExcluir.beforeClass();
		tabelaLogradouroExcluir.login();
		tabelaLogradouroExcluir.acessarMDR();
		tabelaLogradouroExcluir.excluir();
		tabelaLogradouroExcluir.afterClass();
		System.out.println(
				"-------------------Tabelas Complementares para obriga�oes acessorias > Tabela de Logradouro Fim-------------------------");

	}

}