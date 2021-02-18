package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFCriar;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFEditar;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRF.RegistroRFVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela11.CompatibilidadEnCatTrabExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotacaoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExlusionMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoExcluirEmMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaExcluirMassa;
import com.timp.test.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaCriar;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaDetalhes;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaEditar;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluir;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluirEmMasa;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaFiltroCodigo;
import com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaVisualizar;

public class AutomacoesMDR16 extends TestBaseSteven{
	

	//Tabelas de Apoio E-SOCIAL > Tabela 13 - Parte do Corpo Atingida
	
	ParteDoCorpoAtingidaCriar parteDoCorpoAtingidaCriar;
	ParteDoCorpoAtingidaEditar parteDoCorpoAtingidaEditar;
	ParteDoCorpoAtingidaExcluir parteDoCorpoAtingidaExcluir;
	ParteDoCorpoAtingidaVisualizar parteDoCorpoAtingidaVisualizar;
	
	
	//Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente
	
	AgenteCausadorDeAcidenteCriar agenteCausadorDeAcidenteCriar;
	AgenteCausadorDeAcidenteEditar agenteCausadorDeAcidenteEditar;
	AgenteCausadorDeAcidenteExcluir agenteCausadorDeAcidenteExcluir;
	AgenteCausadorDeAcidenteVisualizar agenteCausadorDeAcidenteVisualizar;
	
	
	//Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação
	
	CompatibilidadeEntreLotacaoCriar compatibilidadeEntreLotacaoCriar;
	CompatibilidadeEntreLotacaoEditar compatibilidadeEntreLotacaoEditar;
	CompatibilidadeEntreLotacaoExcluir compatibilidadeEntreLotacaoExcluir;
	CompatibilidadeEntreLotacaoVisualizar compatibilidadeEntreLotacaoVisualizar;
	
	//Siscoserv > Registro RF
	RegistroRFCriar registroRFCriar;
	RegistroRFEditar  registroRFEditar;
	RegistroRFDetalhes registroRFDetalhes;
	RegistroRFVisualizar registroRFVisualizar;
	RegistroRFExcluir registroRFExcluir;
	
	
	//Tabelas de Apoio E-SOCIAL	Tabela 09 - Tipos de Arquivos e-Social
	
	TiposDeArquivosESocialCriar tiposDeArquivosESocialCriar;
	TiposDeArquivosESocialEditar tiposDeArquivosESocialEditar;
	TiposDeArquivosESocialExcluir tiposDeArquivosESocialExcluir;
	TiposDeArquivosESocialExcluirEmMassa tiposDeArquivosESocialExcluirEmMassa;
	TiposDeArquivosESocialVisualizar tiposDeArquivosESocialVisualizar;
	
	
	//Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária
	
	TiposDeLotacaoTributarioCriar tiposDeLotacaoTributarioCriar;
	TiposDeLotacaoTributarioEditar tiposDeLotacaoTributarioEditar;
	TiposDeLotacaoTributarioExcluir tiposDeLotacaoTributarioExcluir;
	TiposDeLotacaoTributarioExcluirEmMassa tiposDeLotacaoTributarioExcluirEmMassa;
	TiposDeLotacaoTributarioVisualizar tiposDeLotacaoTributarioVisualizar;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 18 - Motivos de Afastamento
	MotivoDeAfastamentoCriar motivoDeAfastamentoCriar;
	MotivoDeAfastamentoEditar motivoDeAfastamentoEditar;
	MotivoDeAfastamentoExcluir motivoDeAfastamentoExcluir;
	MotivoDeAfastamentoExcluirEmMassa motivoDeAfastamentoExcluirEmMassa;
	MotivoDeAfastamentoVisualizar motivoDeAfastamentoVisualizar;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 20 - Tipos de Logradouro
	TiposDeLogradouroCriar tiposDeLogradouroCriar;
	TiposDeLogradouroEditar tiposDeLogradouroEditar;
	TiposDeLogradouroExcluir tiposDeLogradouroExcluir;
	TiposDeLogradouroExcluirEmMasa tiposDeLogradouroExcluirEmMasa;
	TiposDeLogradouroVisualizar tiposDeLogradouroVisualizar;
	
	//Tabelas de Apoio E-SOCIAL > Tabela 21 - Natureza Juridica
	NaturezaJuridicaCriar naturezaJuridicaCriar;
	NaturezaJuridicaEditar naturezaJuridicaEditar;
	NaturezaJuridicaExcluir naturezaJuridicaExcluir;
	NaturezaJuridicaVisualizar naturezaJuridicaVisualizar;
	NaturezaJuridicaExcluirMassa naturezaJuridicaExcluirMassa;
	
	//Tabelas de Apoio E-SOCIAL > Unidade de Medida
	UnidadeDeMedidaCriar unidadeDeMedidaCriar;
	UnidadeDeMedidaEditar unidadeDeMedidaEditar;
	UnidadeDeMedidaDetalhes unidadeDeMedidaDetalhes;
	UnidadeDeMedidaVisualizar unidadeDeMedidaVisualizar;
	UnidadeDeMedidaExcluir unidadeDeMedidaExcluir;
	UnidadeDeMedidaExcluirEmMasa unidadeDeMedidaExcluirEmMasa;
	UnidadeDeMedidaFiltroCodigo unidadeDeMedidaFiltroCodigo;
	//Tabelas de Apoio E-SOCIAL > Tabela 11 - Compatibilidade en Cat. Trab.
	CompatibilidadeEnCatTrabCriar compatibilidadeEnCatTrabCriar;
	CompatibilidadeEnCatTrabEditar compatibilidadeEnCatTrabEditar;
	CompatibilidadeEnCatTrabExcluir compatibilidadeEnCatTrabExcluir;
	CompatibilidadeEnCatTrabVisualizar compatibilidadeEnCatTrabVisualizar;
	CompatibilidadEnCatTrabExcluirMassa compatibilidadEnCatTrabExcluirMassa;
	//Tabelas de Apoio E-SOCIAL > Tabela 15 - Agente Causador de SGDP
	AgenteCausadorDeSGDPCriar agenteCausadorDeSGDPCriar;
	AgenteCausadorDeSGDPEditar agenteCausadorDeSGDPEditar;
	AgenteCausadorDeSGDPExcluir agenteCausadorDeSGDPExcluir;
	AgenteCausadorDeSGDPVisualizar agenteCausadorDeSGDPVisualizar;
	AgenteCausadorDeSGDPExlusionMassa agenteCausadorDeSGDPExlusionMassa;
	
	@Test(priority = 0)
	public void parteDoCorpoAtingidaCriar() {

		System.out.println("-------------------//Tabelas de Apoio E-SOCIAL > Tabela 13 - Parte do Corpo Atingida-------------------------");

		parteDoCorpoAtingidaCriar = new ParteDoCorpoAtingidaCriar();
		parteDoCorpoAtingidaCriar.beforeClass();
		parteDoCorpoAtingidaCriar.criar();
		parteDoCorpoAtingidaCriar.afterClass();

	}

	@Test(priority = 1)
	public void parteDoCorpoAtingidaEditar() {

		parteDoCorpoAtingidaEditar = new ParteDoCorpoAtingidaEditar();
		parteDoCorpoAtingidaEditar.beforeClass();
		parteDoCorpoAtingidaEditar.editar();
		parteDoCorpoAtingidaEditar.afterClass();

	}

	@Test(priority =2)
	public void parteDoCorpoAtingidaVisualizar() {

		parteDoCorpoAtingidaVisualizar = new ParteDoCorpoAtingidaVisualizar();
		parteDoCorpoAtingidaVisualizar.beforeClass();
		parteDoCorpoAtingidaVisualizar.visualizar();
		parteDoCorpoAtingidaVisualizar.afterClass();

	}


	@Test(priority = 3)
	public void parteDoCorpoAtingidaExcluir() {

		parteDoCorpoAtingidaExcluir = new ParteDoCorpoAtingidaExcluir();
		parteDoCorpoAtingidaExcluir.beforeClass();
		parteDoCorpoAtingidaExcluir.excluir();
		parteDoCorpoAtingidaExcluir.afterClass();

		System.out.println("-------------------//Tabelas de Apoio E-SOCIAL > Tabela 13 - Parte do Corpo Atingida Fin-------------------------");
	}

//6
	
	// Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente

	@Test(priority = 6)
	public void agenteCausadorDeAcidenteCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente-------------------------");

		agenteCausadorDeAcidenteCriar = new AgenteCausadorDeAcidenteCriar();
		agenteCausadorDeAcidenteCriar.beforeClass();
		agenteCausadorDeAcidenteCriar.criar();
		agenteCausadorDeAcidenteCriar.afterClass();

	}

	@Test(priority = 7)
	public void agenteCausadorDeAcidenteEditar() {

		agenteCausadorDeAcidenteEditar = new AgenteCausadorDeAcidenteEditar();
		agenteCausadorDeAcidenteEditar.beforeClass();
		agenteCausadorDeAcidenteEditar.editar();
		agenteCausadorDeAcidenteEditar.afterClass();

	}

	@Test(priority = 8)
	public void agenteCausadorDeAcidenteVisualizar() {

		agenteCausadorDeAcidenteVisualizar = new AgenteCausadorDeAcidenteVisualizar();
		agenteCausadorDeAcidenteVisualizar.beforeClass();
		agenteCausadorDeAcidenteVisualizar.visualizar();
		agenteCausadorDeAcidenteVisualizar.afterClass();

	}

	@Test(priority = 9)
	public void agenteCausadorDeAcidenteExcluir() {

		agenteCausadorDeAcidenteExcluir = new AgenteCausadorDeAcidenteExcluir();
		agenteCausadorDeAcidenteExcluir.beforeClass();
		agenteCausadorDeAcidenteExcluir.excluir();
		agenteCausadorDeAcidenteExcluir.afterClass();

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 14 - Agente Causador de Acidente  Fin-------------------------");
	}

	
//14
	
	// Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação

	@Test(priority = 14)
	public void compatibilidadeEntreLotacaoCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação-------------------------");

		compatibilidadeEntreLotacaoCriar = new CompatibilidadeEntreLotacaoCriar();
		compatibilidadeEntreLotacaoCriar.beforeClass();
		compatibilidadeEntreLotacaoCriar.criar();
		compatibilidadeEntreLotacaoCriar.afterClass();

	}

	@Test(priority = 15)
	public void compatibilidadeEntreLotacaoEditar() {

		compatibilidadeEntreLotacaoEditar = new CompatibilidadeEntreLotacaoEditar();
		compatibilidadeEntreLotacaoEditar.beforeClass();
		compatibilidadeEntreLotacaoEditar.editar();
		compatibilidadeEntreLotacaoEditar.afterClass();

	}

	@Test(priority = 16)
	public void compatibilidadeEntreLotacaoVisualizar() {

		compatibilidadeEntreLotacaoVisualizar = new CompatibilidadeEntreLotacaoVisualizar();
		compatibilidadeEntreLotacaoVisualizar.beforeClass();
		compatibilidadeEntreLotacaoVisualizar.visualizar();
		compatibilidadeEntreLotacaoVisualizar.afterClass();

	}



	@Test(priority = 17)
	public void compatibilidadeEntreLotacaoExcluir() {

		compatibilidadeEntreLotacaoExcluir = new CompatibilidadeEntreLotacaoExcluir();
		compatibilidadeEntreLotacaoExcluir.beforeClass();
		compatibilidadeEntreLotacaoExcluir.excluir();
		compatibilidadeEntreLotacaoExcluir.afterClass();

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 12 - Compatibilidade entre Lotação Fin-------------------------");
	}

//23
	//Siscoserv > Registro RF Fin
	@Test(priority = 23)
	public void registroRFCriar() {
		
		System.out.println("-------------------Siscoserv > Registro RF -------------------------");

		registroRFCriar = new RegistroRFCriar();
		registroRFCriar.beforeClass();
		registroRFCriar.criar();
		registroRFCriar.afterClass();

	}
	
	@Test(priority = 24)
	public void registroRFVisualizar() {

		registroRFVisualizar = new RegistroRFVisualizar();
		registroRFVisualizar.beforeClass();
		registroRFVisualizar.visualizar();
		registroRFVisualizar.afterClass();

	}

	@Test(priority = 25)
	public void registroRFDetalhes() {

		registroRFDetalhes = new RegistroRFDetalhes();
		registroRFDetalhes.beforeClass();
		registroRFDetalhes.detalhes();
		registroRFDetalhes.afterClass();

	}

	@Test(priority = 26)
	public void registroRFEditar() {

		registroRFEditar = new RegistroRFEditar();
		registroRFEditar.beforeClass();
		registroRFEditar.Editar();
		registroRFEditar.afterClass();

	}
	
	@Test(priority = 27)
	public void registroRFExcluir() {

		registroRFExcluir = new RegistroRFExcluir();
		registroRFExcluir.beforeClass();
		registroRFExcluir.excluir();
		registroRFExcluir.afterClass();

		System.out.println("-------------------Siscoserv > Registro RF Fin-------------------------");
	}

	
//31
	
	// Tabelas de Apoio E-SOCIAL > Tabela 09 - Tipos de Arquivos e-Social

	@Test(priority = 31)
	public void tiposDeArquivosESocialCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 09 - Tipos de Arquivos e-Social-------------------------");

		tiposDeArquivosESocialCriar = new TiposDeArquivosESocialCriar();
		tiposDeArquivosESocialCriar.beforeClass();
		tiposDeArquivosESocialCriar.criar();
		tiposDeArquivosESocialCriar.afterClass();

	}

	@Test(priority = 32)
	public void tiposDeArquivosESocialEditar() {

		tiposDeArquivosESocialEditar = new TiposDeArquivosESocialEditar();
		tiposDeArquivosESocialEditar.beforeClass();
		tiposDeArquivosESocialEditar.editar();
		tiposDeArquivosESocialEditar.afterClass();

	}

	@Test(priority = 33)
	public void tiposDeArquivosESocialVisualizar() {

		tiposDeArquivosESocialVisualizar = new TiposDeArquivosESocialVisualizar();
		tiposDeArquivosESocialVisualizar.beforeClass();
		tiposDeArquivosESocialVisualizar.visualizar();
		tiposDeArquivosESocialVisualizar.afterClass();

	}




	@Test(priority = 34)
	public void tiposDeArquivosESocialExcluir() {

		tiposDeArquivosESocialExcluir = new TiposDeArquivosESocialExcluir();
		tiposDeArquivosESocialExcluir.beforeClass();
		tiposDeArquivosESocialExcluir.excluir();
		tiposDeArquivosESocialExcluir.afterClass();

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 09 - Tipos de Arquivos e-Social Fin-------------------------");
	}
	
	
	@Test(priority = 35)
	public void tiposDeArquivosESocialExcluirEmMassa() {

		tiposDeArquivosESocialExcluirEmMassa = new TiposDeArquivosESocialExcluirEmMassa();
		tiposDeArquivosESocialExcluirEmMassa.beforeClass();
		tiposDeArquivosESocialExcluirEmMassa.criar();
		tiposDeArquivosESocialExcluirEmMassa.afterClass();

	}


	
//39
	
	// Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária

	@Test(priority = 39)
	public void tiposDeLotacaoTributarioCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária-------------------------");

		tiposDeLotacaoTributarioCriar = new TiposDeLotacaoTributarioCriar();
		tiposDeLotacaoTributarioCriar.beforeClass();
		tiposDeLotacaoTributarioCriar.criar();
		tiposDeLotacaoTributarioCriar.afterClass();

	}

	@Test(priority = 40)
	public void tiposDeLotacaoTributarioEditar() {

		tiposDeLotacaoTributarioEditar = new TiposDeLotacaoTributarioEditar();
		tiposDeLotacaoTributarioEditar.beforeClass();
		tiposDeLotacaoTributarioEditar.editar();
		tiposDeLotacaoTributarioEditar.afterClass();

	}

	@Test(priority = 41)
	public void tiposDeLotacaoTributarioVisualizar() {

		tiposDeLotacaoTributarioVisualizar = new TiposDeLotacaoTributarioVisualizar();
		tiposDeLotacaoTributarioVisualizar.beforeClass();
		tiposDeLotacaoTributarioVisualizar.visualizar();
		tiposDeLotacaoTributarioVisualizar.afterClass();

	}



	@Test(priority = 42)
	public void tiposDeLotacaoTributarioExcluir() {

		tiposDeLotacaoTributarioExcluir = new TiposDeLotacaoTributarioExcluir();
		tiposDeLotacaoTributarioExcluir.beforeClass();
		tiposDeLotacaoTributarioExcluir.excluir();
		tiposDeLotacaoTributarioExcluir.afterClass();

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 10 - Tipos de Lotação Tributária Fin-------------------------");
	}
	

	@Test(priority = 43)
	public void tiposDeLotacaoTributarioExcluirEmMassa() {

		tiposDeLotacaoTributarioExcluirEmMassa = new TiposDeLotacaoTributarioExcluirEmMassa();
		tiposDeLotacaoTributarioExcluirEmMassa.beforeClass();
		tiposDeLotacaoTributarioExcluirEmMassa.criar();
		tiposDeLotacaoTributarioExcluirEmMassa.afterClass();

	}

	
	
//47
	
	// Tabelas de Apoio E-SOCIAL	Tabela 18 - Motivos de Afastamento

	@Test(priority = 47)
	public void motivoDeAfastamentoCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 18 - Motivos de Afastamento-------------------------");

		motivoDeAfastamentoCriar = new MotivoDeAfastamentoCriar();
		motivoDeAfastamentoCriar.beforeClass();
		motivoDeAfastamentoCriar.criar();
		motivoDeAfastamentoCriar.afterClass();

	}

	@Test(priority = 48)
	public void motivoDeAfastamentoEditar() {

		motivoDeAfastamentoEditar = new MotivoDeAfastamentoEditar();
		motivoDeAfastamentoEditar.beforeClass();
		motivoDeAfastamentoEditar.editar();
		motivoDeAfastamentoEditar.afterClass();

	}

	@Test(priority = 49)
	public void motivoDeAfastamentoVisualizar() {

		motivoDeAfastamentoVisualizar = new MotivoDeAfastamentoVisualizar();
		motivoDeAfastamentoVisualizar.beforeClass();
		motivoDeAfastamentoVisualizar.visualizar();
		motivoDeAfastamentoVisualizar.afterClass();

	}



	@Test(priority = 50)
	public void motivoDeAfastamentoExcluir() {

		motivoDeAfastamentoExcluir = new MotivoDeAfastamentoExcluir();
		motivoDeAfastamentoExcluir.beforeClass();;
		motivoDeAfastamentoExcluir.excluir();
		motivoDeAfastamentoExcluir.afterClass();

		
	}
	

	@Test(priority = 51)
	public void motivoDeAfastamentoExcluirEmMassa() {

		motivoDeAfastamentoExcluirEmMassa = new MotivoDeAfastamentoExcluirEmMassa();
		motivoDeAfastamentoExcluirEmMassa.beforeClass();
		motivoDeAfastamentoExcluirEmMassa.criar();
		motivoDeAfastamentoExcluirEmMassa.afterClass();
		
		System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 18 - Motivos de Afastamento Fin-------------------------");
	}

	//55
	
	@Test(priority = 55)
	public void tiposDeLogradouroCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 20 - Tipos de Logradouro-------------------------");

		tiposDeLogradouroCriar = new TiposDeLogradouroCriar();
		tiposDeLogradouroCriar.beforeClass();
		tiposDeLogradouroCriar.criar();
		tiposDeLogradouroCriar.afterClass();

	}

	@Test(priority = 56)
	public void tiposDeLogradouroEditar() {

		tiposDeLogradouroEditar = new TiposDeLogradouroEditar();
		tiposDeLogradouroEditar.beforeClass();
		tiposDeLogradouroEditar.editar();
		tiposDeLogradouroEditar.afterClass();

	}

	@Test(priority = 57)
	public void tiposDeLogradouroVisualizar() {

		tiposDeLogradouroVisualizar = new TiposDeLogradouroVisualizar();
		tiposDeLogradouroVisualizar.beforeClass();
		tiposDeLogradouroVisualizar.visualizar();
		tiposDeLogradouroVisualizar.afterClass();

	}



	@Test(priority = 58)
	public void tiposDeLogradouroExcluir() {

		tiposDeLogradouroExcluir = new TiposDeLogradouroExcluir();
		tiposDeLogradouroExcluir.beforeClass();
		tiposDeLogradouroExcluir.excluir();
		tiposDeLogradouroExcluir.afterClass();

		
	}
	

	@Test(priority = 59)
	public void tiposDeLogradouroExcluirEmMassa() {

		tiposDeLogradouroExcluirEmMasa = new TiposDeLogradouroExcluirEmMasa();
		tiposDeLogradouroExcluirEmMasa.beforeClass();
		tiposDeLogradouroExcluirEmMasa.excluir();
		tiposDeLogradouroExcluirEmMasa.afterClass();
		
		System.out.println("-------------------Tabelas de Apoio E-SOCIAL	Tabela 20 - Tipos de Logradouro fin-------------------------");

	}



	//61
	
	
	@Test(priority = 61)
	public void naturezaJuridicaCriar() {

		System.out.println("-------------------naturezaJuridica Fiscal > naturezaJuridica Fiscal-------------------------");

		naturezaJuridicaCriar = new NaturezaJuridicaCriar();
		naturezaJuridicaCriar.beforeClass();
		naturezaJuridicaCriar.criar();
		naturezaJuridicaCriar.afterClass();

	}

	@Test(priority = 62)
	public void naturezaJuridicaEditar() {

		naturezaJuridicaEditar = new NaturezaJuridicaEditar();
		naturezaJuridicaEditar.beforeClass();
		naturezaJuridicaEditar.editar();
		naturezaJuridicaEditar.afterClass();

	}

	@Test(priority = 63)
	public void naturezaJuridicaVisualizar() {

		naturezaJuridicaVisualizar = new NaturezaJuridicaVisualizar();
		naturezaJuridicaVisualizar.beforeClass();
		naturezaJuridicaVisualizar.visualizar();
		naturezaJuridicaVisualizar.afterClass();

	}



	@Test(priority = 64)
	public void naturezaJuridicaExcluir() {

		naturezaJuridicaExcluir = new NaturezaJuridicaExcluir();
		naturezaJuridicaExcluir.beforeClass();
		naturezaJuridicaExcluir.excluir();
		naturezaJuridicaExcluir.afterClass();
	}
	
	
	@Test(priority = 65)
	public void naturezaJuridicaExcluirMassa() {

		naturezaJuridicaExcluirMassa = new NaturezaJuridicaExcluirMassa();
		naturezaJuridicaExcluirMassa.beforeClass();
		//naturezaJuridicaExcluirMassa.criar();
		naturezaJuridicaExcluirMassa.excluirMassa();
		naturezaJuridicaExcluirMassa.afterClass();

		System.out.println("-------------------naturezaJuridica Fiscal > naturezaJuridica Fiscal Fin-------------------------");
	}

	//68
	
	// Tabelas de Apoio E-SOCIAL > Unidade de Medida

	@Test(priority = 68)
	public void unidadeDeMedidaCriar() {

		System.out.println("-------------------unidadeDeMedida Fiscal > unidadeDeMedida Fiscal-------------------------");

		unidadeDeMedidaCriar = new UnidadeDeMedidaCriar();
		unidadeDeMedidaCriar.beforeClass();
		unidadeDeMedidaCriar.criar();
		unidadeDeMedidaCriar.afterClass();

	}

	@Test(priority = 69)
	public void unidadeDeMedidaEditar() {

		unidadeDeMedidaEditar = new UnidadeDeMedidaEditar();
		unidadeDeMedidaEditar.beforeClass();
		unidadeDeMedidaEditar.editar();
		unidadeDeMedidaEditar.afterClass();

	}

	@Test(priority = 70)
	public void unidadeDeMedidaVisualizar() {

		unidadeDeMedidaVisualizar = new UnidadeDeMedidaVisualizar();
		unidadeDeMedidaVisualizar.beforeClass();
		unidadeDeMedidaVisualizar.visualizar();
		unidadeDeMedidaVisualizar.afterClass();

	}

	@Test(priority = 71)
	public void unidadeDeMedidaDetalhes() {

		unidadeDeMedidaDetalhes = new UnidadeDeMedidaDetalhes();
		unidadeDeMedidaDetalhes.beforeClass();
		unidadeDeMedidaDetalhes.detalhes();
		unidadeDeMedidaDetalhes.afterClass();

	}


	@Test(priority = 72)
	public void unidadeDeMedidaExcluir() {

		unidadeDeMedidaExcluir = new UnidadeDeMedidaExcluir();
		unidadeDeMedidaExcluir.beforeClass();
		unidadeDeMedidaExcluir.excluir();
		unidadeDeMedidaExcluir.afterClass();

		
	}
	
	@Test(priority = 73)
	public void unidadeDeMedidaExcluirEmMassa() {

		unidadeDeMedidaExcluirEmMasa = new UnidadeDeMedidaExcluirEmMasa();
		unidadeDeMedidaExcluirEmMasa.beforeClass();
		unidadeDeMedidaExcluirEmMasa.excluir();
		unidadeDeMedidaExcluirEmMasa.afterClass();

	}
	
	@Test(priority = 74)
	public void unidadeDeMedidaFiltroCodigo() {

		unidadeDeMedidaFiltroCodigo = new UnidadeDeMedidaFiltroCodigo();
		unidadeDeMedidaFiltroCodigo.beforeClass();
		unidadeDeMedidaFiltroCodigo.filtroCodigo();
		unidadeDeMedidaFiltroCodigo.afterClass();
		
		System.out.println("-------------------unidadeDeMedida Fiscal > unidadeDeMedida Fiscal Fin-------------------------");

	}

	//76
	//Tabelas de Apoio E-SOCIAL > Tabela 11 - Compatibilidade en Cat. Trab.
	@Test(priority = 76)
	public void compatibilidadeEnCatTrabCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 11 - Compatibilidade en Cat. Trab.-------------------------");

		compatibilidadeEnCatTrabCriar = new CompatibilidadeEnCatTrabCriar();
		compatibilidadeEnCatTrabCriar.beforeClass();
		compatibilidadeEnCatTrabCriar.criar();
		compatibilidadeEnCatTrabCriar.afterClass();

	}
	
	@Test(priority = 77)
	public void compatibilidadeEnCatTrabEditar() {


		compatibilidadeEnCatTrabEditar = new CompatibilidadeEnCatTrabEditar();
		compatibilidadeEnCatTrabEditar.beforeClass();
		compatibilidadeEnCatTrabEditar.editar();
		compatibilidadeEnCatTrabEditar.afterClass();

	}
	
	@Test(priority = 78)
	public void compatibilidadeEnCatTrabVisualizar() {


		compatibilidadeEnCatTrabVisualizar = new CompatibilidadeEnCatTrabVisualizar();
		compatibilidadeEnCatTrabVisualizar.beforeClass();
		compatibilidadeEnCatTrabVisualizar.visualizar();
		compatibilidadeEnCatTrabVisualizar.afterClass();

	}
	
	@Test(priority = 79)
	public void compatibilidadeEnCatTrabExcluir() {


		compatibilidadeEnCatTrabExcluir = new CompatibilidadeEnCatTrabExcluir();
		compatibilidadeEnCatTrabExcluir.beforeClass();
		compatibilidadeEnCatTrabExcluir.excluir();
		compatibilidadeEnCatTrabExcluir.afterClass();

	}
	
	
	@Test(priority = 80)
	public void compatibilidadEnCatTrabExcluirMassa() {


		compatibilidadEnCatTrabExcluirMassa = new CompatibilidadEnCatTrabExcluirMassa();
		compatibilidadEnCatTrabExcluirMassa.beforeClass();
		compatibilidadEnCatTrabExcluirMassa.criar();
		compatibilidadEnCatTrabExcluirMassa.afterClass();

	}
	//84
	
	//Tabelas de Apoio E-SOCIAL > Tabela 15 - Agente Causador de SGDP
	
	
	@Test(priority = 84)
	public void agenteCausadorDeSGDPCriar() {

		System.out.println("-------------------Tabelas de Apoio E-SOCIAL > Tabela 15 - Agente Causador de SGDP-------------------------");

		agenteCausadorDeSGDPCriar = new AgenteCausadorDeSGDPCriar();
		agenteCausadorDeSGDPCriar.beforeClass();
		agenteCausadorDeSGDPCriar.criar();
		agenteCausadorDeSGDPCriar.afterClass();

	}
	@Test(priority = 85)
	public void agenteCausadorDeSGDPEditar() {

		agenteCausadorDeSGDPEditar = new AgenteCausadorDeSGDPEditar();
		agenteCausadorDeSGDPEditar.beforeClass();
		agenteCausadorDeSGDPEditar.editar();
		agenteCausadorDeSGDPEditar.afterClass();

	}
	@Test(priority = 86)
	public void agenteCausadorDeSGDPVisualizar() {

		agenteCausadorDeSGDPVisualizar = new AgenteCausadorDeSGDPVisualizar();
		agenteCausadorDeSGDPVisualizar.beforeClass();
		agenteCausadorDeSGDPVisualizar.visualizar();
		agenteCausadorDeSGDPVisualizar.afterClass();

	}
	@Test(priority = 87)
	public void agenteCausadorDeSGDPExcluir() {

		agenteCausadorDeSGDPExcluir = new AgenteCausadorDeSGDPExcluir();
		agenteCausadorDeSGDPExcluir.beforeClass();
		agenteCausadorDeSGDPExcluir.excluirr();
		agenteCausadorDeSGDPExcluir.afterClass();

	}
	@Test(priority = 88)
	public void agenteCausadorDeSGDPExlusionMassa() {

		agenteCausadorDeSGDPExlusionMassa = new AgenteCausadorDeSGDPExlusionMassa();
		agenteCausadorDeSGDPExlusionMassa.beforeClass();
		agenteCausadorDeSGDPExlusionMassa.criar();
		agenteCausadorDeSGDPExlusionMassa.afterClass();

	}
	
 
	
}
