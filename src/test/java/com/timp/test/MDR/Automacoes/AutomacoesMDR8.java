package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oCriar;
import com.timp.test.MDR.CadastroCondi�ao.CadastroCondi�aoExcluirMasas;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimientoExcluirMasas;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoExcluirMasas;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasCriar;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasEditar;
import com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras.CadastroDeObrasExcluir;
import com.timp.test.MDR.CadastrosIRPJCSLL.CadastroContaisContabeis.CadastroContaisContabeisFiltroID;
import com.timp.test.MDR.CadastrosIRPJCSLL.ContasCont�beisRBLP.ContasCont�beisRBLPFiltroId;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisEditar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisExcluir;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisVisualizar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailCriar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaDetalle;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaExcluir;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaVisualizar;
import com.timp.test.MDR.EventosESocial.S2230AfastamentoTempor�rio.S2230AfastamentoTempor�rioFiltroId;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoExcluirMasas;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficial;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialEditar;
import com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialVisualizar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTDetalle;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTEditar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluir;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluirMasas;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTVisualizar;

public class AutomacoesMDR8 {
	
	// Determina��o de Relev�ncia de Tarefa por Motivo de Reabertura >	Regra de Reabertura
	RegraDeReaberturaCriar regraDeReaberturaCriar;
	RegraDeReaberturaEditar regraDeReaberturaEditar;
	RegraDeReaberturaDetalle regraDeReaberturaDetalle;
	RegraDeReaberturaVisualizar regraDeReaberturaVisualizar;
	RegraDeReaberturaExcluir   regraDeReaberturaExcluir;
	
	
	// Cadastro Espec�fico do INSS (CEI) >	Cadastro de Obras
	CadastroDeObrasCriar  cadastroDeObrasCriar;
	CadastroDeObrasEditar cadastroDeObrasEditar;
	CadastroDeObrasExcluir cadastroDeObrasExcluir;
	
	//  Cadastro Espec�fico do INSS (CEI) >	Cadastro de Obras
	ConfiguracaoFundoSocailCriar  configuracaoFundoSocailCriar;
	ConfiguracoesFundoSocialEditar  configuracoesFundoSocialEditar;
	
	// Livros Fiscais > Par�metros para Livro ICMS ST
	
	ParametrosParaLivroICMSSTCriar parametrosParaLivroICMSSTCriar;
	ParametrosParaLivroICMSSTEditar parametrosParaLivroICMSSTEditar;
	ParametrosParaLivroICMSSTVisualizar parametrosParaLivroICMSSTVisualizar;
	ParametrosParaLivroICMSSTDetalle parametrosParaLivroICMSSTDetalle;
	ParametrosParaLivroICMSSTExcluir parametrosParaLivroICMSSTExcluir;
	
	
	// S2230  AfastamentoTempor�rio
	
	S2230AfastamentoTempor�rioFiltroId s2230AfastamentoTempor�rioFiltroId;
	
	// Cadastros IRPJ/CSLL > Cadastro Contas Cont�beis
	CadastroContaisContabeisFiltroID cadastroContaisContabeisFiltroID;
	
	//Cadastros IRPJ/CSLL	DE-PARA Contas Cont�beis
	DEPARAContasCont�beisCriar 	dEPARAContasCont�beisCriar;
	DEPARAContasCont�beisEditar dEPARAContasCont�beisEditar;
	DEPARAContasCont�beisVisualizar dEPARAContasCont�beisVisualizar;
	DEPARAContasCont�beisExcluir dEPARAContasCont�beisExcluir;
	
	// Hierarquia De Cenarios De Corre�ao
	HierarquiaDeCenariosDeCorre�aoExcluirMasas  hierarquiaDeCenariosDeCorre�aoExcluirMasas;
	
	// Cadastro Condi�ao
	CadastroCondi�aoExcluirMasas cadastroCondi�aoExcluirMasas;

	//Cadastro Derex > Cadastro Respons�vel pelo Movimento
	
	ResponsavelMovimientoExcluirMasas responsavelMovimientoExcluirMasas;
	
	//Cadastro Derex > Institui��o Financeira
	InstituicaoExcluirMasas instituicaoExcluirMasas;
	
	//Livros Fiscais > Par�metros para Livro ICMS ST
		ParametrosParaLivroICMSSTExcluirMasas  parametrosParaLivroICMSSTExcluirMasas;
		
	//Cadastros IRPJ/CSLL	> Contas Cont�beis RB/LP
		ContasCont�beisRBLPFiltroId contasCont�beisRBLPFiltroId;
		
	// Parametriza��o Do Livro Oficial
		Parametriza��oDoLivroOficial parametriza��oDoLivroOficial;
		Parametriza��oDoLivroOficialEditar parametriza��oDoLivroOficialEditar;
		Parametriza��oDoLivroOficialVisualizar parametriza��oDoLivroOficialVisualizar;
		
	
	// 0 --- 7
	
	@Test(priority = 0)
	public void regraDeReaberturaCriar() {

		System.out.println("----Determina��o de Relev�ncia de Tarefa por Motivo de Reabertura >	Regra de Reabertura-------------");

		regraDeReaberturaCriar = new RegraDeReaberturaCriar();
		regraDeReaberturaCriar.beforeClass();
		regraDeReaberturaCriar.ingresar();
		regraDeReaberturaCriar.ingresarMDR();
		regraDeReaberturaCriar.criar();
		regraDeReaberturaCriar.afterClass();

	}
	
	@Test(priority = 1)
	public void  regraDeReaberturaEditar() {

		regraDeReaberturaEditar = new RegraDeReaberturaEditar();
		regraDeReaberturaEditar.beforeClass();
		regraDeReaberturaEditar.ingresar();
		regraDeReaberturaEditar.ingresarMDR();
		regraDeReaberturaEditar.editar();
		regraDeReaberturaEditar.afterClass();

	}
	
	@Test(priority = 2)
	public void  regraDeReaberturaDetalle() {

		regraDeReaberturaDetalle = new RegraDeReaberturaDetalle();
		regraDeReaberturaDetalle.beforeClass();
		regraDeReaberturaDetalle.ingresar();
		regraDeReaberturaDetalle.ingresarMDR();
		regraDeReaberturaDetalle.detalle();
		regraDeReaberturaDetalle.afterClass();

	}
	
	@Test(priority = 3)
	public void  regraDeReaberturaExcluir() {

		regraDeReaberturaExcluir = new RegraDeReaberturaExcluir();
		regraDeReaberturaExcluir.beforeClass();
		regraDeReaberturaExcluir.ingresar();
		regraDeReaberturaExcluir.ingresarMDR();
		regraDeReaberturaExcluir.excluir();
		regraDeReaberturaExcluir.afterClass();
		
		System.out.println("-------------------Regra De Reabertura Fim-------------------------");

	}
	//12
	
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
	public void  cadastroDeObrasEditar() {

		 cadastroDeObrasEditar = new CadastroDeObrasEditar();
		 cadastroDeObrasEditar.beforeClass();
		 cadastroDeObrasEditar.ingresar();
		 cadastroDeObrasEditar.ingresarMDR();
		 cadastroDeObrasEditar.editar();
		 cadastroDeObrasEditar.afterClass();

	}
	
	@Test(priority = 8)
	public void  cadastroDeObrasExcluir() {

		cadastroDeObrasExcluir = new CadastroDeObrasExcluir();
		cadastroDeObrasExcluir.beforeClass();
		cadastroDeObrasExcluir.ingresar();
		cadastroDeObrasExcluir.ingresarMDR();
		cadastroDeObrasExcluir.excluir();
		cadastroDeObrasExcluir.afterClass();
		
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
	public void  configuracoesFundoSocialEditar() {

		configuracoesFundoSocialEditar = new ConfiguracoesFundoSocialEditar();
		configuracoesFundoSocialEditar.beforeClass();
		configuracoesFundoSocialEditar.ingresar();
		configuracoesFundoSocialEditar.ingresarMDR();
		configuracoesFundoSocialEditar.editar();
		configuracoesFundoSocialEditar.afterClass();

	}
	
	//19------------24
	
	@Test(priority = 19)
	public void parametrosParaLivroICMSSTCriar() {

		System.out.println("---- Libros Fiscais Parametros Para Livro ICMSST-------------");

		parametrosParaLivroICMSSTCriar = new ParametrosParaLivroICMSSTCriar();
		parametrosParaLivroICMSSTCriar.beforeClass();
		parametrosParaLivroICMSSTCriar.login();
		parametrosParaLivroICMSSTCriar.acessarMDR();
		parametrosParaLivroICMSSTCriar.criar();
		parametrosParaLivroICMSSTCriar.afterClass();

	}
	
	@Test(priority = 20)
	public void  parametrosParaLivroICMSSTEditar() {

		parametrosParaLivroICMSSTEditar = new ParametrosParaLivroICMSSTEditar();
		parametrosParaLivroICMSSTEditar.beforeClass();
		parametrosParaLivroICMSSTEditar.login();
		parametrosParaLivroICMSSTEditar.acessarMDR();
		parametrosParaLivroICMSSTEditar.editar();
		parametrosParaLivroICMSSTEditar.afterClass();

	}
	
	@Test(priority = 21)
	public void  parametrosParaLivroICMSSTVisualizar() {

		parametrosParaLivroICMSSTVisualizar = new ParametrosParaLivroICMSSTVisualizar();
		parametrosParaLivroICMSSTVisualizar.beforeClass();
		parametrosParaLivroICMSSTVisualizar.login();
		parametrosParaLivroICMSSTVisualizar.acessarMDR();
		parametrosParaLivroICMSSTVisualizar.visualizar();
		parametrosParaLivroICMSSTVisualizar.afterClass();

	}
	
	@Test(priority = 22)
	public void parametrosParaLivroICMSSTDetalle() {

		parametrosParaLivroICMSSTDetalle = new ParametrosParaLivroICMSSTDetalle();
		parametrosParaLivroICMSSTDetalle.beforeClass();
		parametrosParaLivroICMSSTDetalle.login();
		parametrosParaLivroICMSSTDetalle.acessarMDR();
		parametrosParaLivroICMSSTDetalle.visualizar();
		parametrosParaLivroICMSSTDetalle.afterClass();

	}
	
	@Test(priority = 23)
	public void parametrosParaLivroICMSSTExcluir() {

		parametrosParaLivroICMSSTExcluir= new ParametrosParaLivroICMSSTExcluir();
		parametrosParaLivroICMSSTExcluir.beforeClass();
		parametrosParaLivroICMSSTExcluir.ingresar();
		parametrosParaLivroICMSSTExcluir.ingresarMDR();
		parametrosParaLivroICMSSTExcluir.Excluir();
		parametrosParaLivroICMSSTExcluir.afterClass();

		System.out.println("-------------------Parametros Para Livro ICMSST Fim-------------------------");
	}
	//24 ---------30
	
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
	
	//31 -----------35
	
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
	//36 -------41
	
	
	@Test(priority = 36)
	public void dEPARAContasCont�beisCriar() {

		System.out.println("---- Cadastros IRPJ/CSLL > DE-PARA Contas Cont�beis -------------");

		dEPARAContasCont�beisCriar= new DEPARAContasCont�beisCriar();
		dEPARAContasCont�beisCriar.beforeClass();
		dEPARAContasCont�beisCriar.ingresar();
		dEPARAContasCont�beisCriar.ingresarMDR();
		dEPARAContasCont�beisCriar.criar();
		dEPARAContasCont�beisCriar.afterClass();

	}
	
	@Test(priority = 37)
	public void dEPARAContasCont�beisEditar() {

		dEPARAContasCont�beisEditar= new DEPARAContasCont�beisEditar();
		dEPARAContasCont�beisEditar.beforeClass();
		dEPARAContasCont�beisEditar.ingresar();
		dEPARAContasCont�beisEditar.ingresarMDR();
		dEPARAContasCont�beisEditar.Editar();
		dEPARAContasCont�beisEditar.afterClass();

	}
	
	@Test(priority = 38)
	public void dEPARAContasCont�beisVisualizar() {

		dEPARAContasCont�beisVisualizar= new DEPARAContasCont�beisVisualizar();
		dEPARAContasCont�beisVisualizar.beforeClass();
		dEPARAContasCont�beisVisualizar.ingresar();
		dEPARAContasCont�beisVisualizar.ingresarMDR();
		dEPARAContasCont�beisVisualizar.visualizar();
		dEPARAContasCont�beisVisualizar.afterClass();

	}
	
	@Test(priority = 39)
	public void dEPARAContasCont�beisExcluir() {

		dEPARAContasCont�beisExcluir= new DEPARAContasCont�beisExcluir();
		dEPARAContasCont�beisExcluir.beforeClass();
		dEPARAContasCont�beisExcluir.ingresar();
		dEPARAContasCont�beisExcluir.ingresarMDR();
		dEPARAContasCont�beisExcluir.excluir();
		dEPARAContasCont�beisExcluir.afterClass();

		System.out.println("-------------------Parametros Para Livro ICMSST Fim-------------------------");
	}
	
	//41

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
	
	//42
	
	
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
	
	//43
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
	
	//44
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
		
		//45 
		
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
		
		//46
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
		//47 -52
		
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
		
		@Test(priority = 49)
		public void parametriza��oDoLivroOficialVisualizar() {
			parametriza��oDoLivroOficialVisualizar= new Parametriza��oDoLivroOficialVisualizar();
			parametriza��oDoLivroOficialVisualizar.beforeClass();
			parametriza��oDoLivroOficialVisualizar.ingresar();
			parametriza��oDoLivroOficialVisualizar.ingresarMDR();
			parametriza��oDoLivroOficialVisualizar.visualizar();
			parametriza��oDoLivroOficialVisualizar.afterClass();		
		}
}
