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
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisCriar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisEditar;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisExcluir;
import com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisVisualizar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracaoFundoSocailCriar;
import com.timp.test.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaCriar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaDetalle;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaEditar;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaExcluir;
import com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura.RegraDeReaberturaVisualizar;
import com.timp.test.MDR.EventosESocial.S2230AfastamentoTemporário.S2230AfastamentoTemporárioFiltroId;
import com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirMasas;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTDetalle;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTEditar;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluir;
import com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTVisualizar;

public class AutomacoesMDR8 {
	
	// Determinação de Relevância de Tarefa por Motivo de Reabertura >	Regra de Reabertura
	RegraDeReaberturaCriar regraDeReaberturaCriar;
	RegraDeReaberturaEditar regraDeReaberturaEditar;
	RegraDeReaberturaDetalle regraDeReaberturaDetalle;
	RegraDeReaberturaVisualizar regraDeReaberturaVisualizar;
	RegraDeReaberturaExcluir   regraDeReaberturaExcluir;
	
	
	// Cadastro Específico do INSS (CEI) >	Cadastro de Obras
	CadastroDeObrasCriar  cadastroDeObrasCriar;
	CadastroDeObrasEditar cadastroDeObrasEditar;
	CadastroDeObrasExcluir cadastroDeObrasExcluir;
	CadastroDeObrasExcluirEmMassa cadastroDeObrasExcluirEmMassa;
	//  Cadastro Específico do INSS (CEI) >	Cadastro de Obras
	ConfiguracaoFundoSocailCriar  configuracaoFundoSocailCriar;
	ConfiguracoesFundoSocialEditar  configuracoesFundoSocialEditar;
	
	// Livros Fiscais > Parâmetros para Livro ICMS ST
	
	ParametrosParaLivroICMSSTCriar parametrosParaLivroICMSSTCriar;
	ParametrosParaLivroICMSSTEditar parametrosParaLivroICMSSTEditar;
	ParametrosParaLivroICMSSTVisualizar parametrosParaLivroICMSSTVisualizar;
	ParametrosParaLivroICMSSTDetalle parametrosParaLivroICMSSTDetalle;
	ParametrosParaLivroICMSSTExcluir parametrosParaLivroICMSSTExcluir;
	
	
	// S2230  AfastamentoTemporário
	
	S2230AfastamentoTemporárioFiltroId s2230AfastamentoTemporárioFiltroId;
	
	// Cadastros IRPJ/CSLL > Cadastro Contas Contábeis
	CadastroContaisContabeisFiltroID cadastroContaisContabeisFiltroID;
	
	//Cadastros IRPJ/CSLL	DE-PARA Contas Contábeis
	DEPARAContasContábeisCriar 	dEPARAContasContábeisCriar;
	DEPARAContasContábeisEditar dEPARAContasContábeisEditar;
	DEPARAContasContábeisVisualizar dEPARAContasContábeisVisualizar;
	DEPARAContasContábeisExcluir dEPARAContasContábeisExcluir;
	
	// Hierarquia De Cenarios De Correçao
	HierarquiaDeCenariosDeCorreçaoExcluirMasas  hierarquiaDeCenariosDeCorreçaoExcluirMasas;
	
	// Cadastro Condiçao
	CadastroCondiçaoExcluirMasas cadastroCondiçaoExcluirMasas;

	//Cadastro Derex > Cadastro Responsável pelo Movimento
	
	ResponsavelMovimientoExcluirMasas responsavelMovimientoExcluirMasas;
	//Cadastro Derex > Instituição Financeira
	InstituicaoExcluirMasas instituicaoExcluirMasas;
	
	// 0 --- 7
	
	@Test(priority = 0)
	public void regraDeReaberturaCriar() {

		System.out.println("----Determinação de Relevância de Tarefa por Motivo de Reabertura >	Regra de Reabertura-------------");

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

		System.out.println("----Cadastro Específico do INSS (CEI) >	Cadastro de Obras-------------");

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
	public void s2230AfastamentoTemporárioFiltroId() {

		System.out.println("---- s2230  Afastamento Temporário -------------");

		s2230AfastamentoTemporárioFiltroId = new S2230AfastamentoTemporárioFiltroId();
		s2230AfastamentoTemporárioFiltroId.beforeClass();
		s2230AfastamentoTemporárioFiltroId.login();
		s2230AfastamentoTemporárioFiltroId.acessarMDR();
		s2230AfastamentoTemporárioFiltroId.filtro();
		s2230AfastamentoTemporárioFiltroId.afterClass();

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
	public void dEPARAContasContábeisCriar() {

		System.out.println("---- Cadastros IRPJ/CSLL > DE-PARA Contas Contábeis -------------");

		dEPARAContasContábeisCriar= new DEPARAContasContábeisCriar();
		dEPARAContasContábeisCriar.beforeClass();
		dEPARAContasContábeisCriar.ingresar();
		dEPARAContasContábeisCriar.ingresarMDR();
		dEPARAContasContábeisCriar.criar();
		dEPARAContasContábeisCriar.afterClass();

	}
	
	@Test(priority = 37)
	public void dEPARAContasContábeisEditar() {

		dEPARAContasContábeisEditar= new DEPARAContasContábeisEditar();
		dEPARAContasContábeisEditar.beforeClass();
		dEPARAContasContábeisEditar.ingresar();
		dEPARAContasContábeisEditar.ingresarMDR();
		dEPARAContasContábeisEditar.Editar();
		dEPARAContasContábeisEditar.afterClass();

	}
	
	@Test(priority = 38)
	public void dEPARAContasContábeisVisualizar() {

		dEPARAContasContábeisVisualizar= new DEPARAContasContábeisVisualizar();
		dEPARAContasContábeisVisualizar.beforeClass();
		dEPARAContasContábeisVisualizar.ingresar();
		dEPARAContasContábeisVisualizar.ingresarMDR();
		dEPARAContasContábeisVisualizar.visualizar();
		dEPARAContasContábeisVisualizar.afterClass();

	}
	
	@Test(priority = 39)
	public void dEPARAContasContábeisExcluir() {

		dEPARAContasContábeisExcluir= new DEPARAContasContábeisExcluir();
		dEPARAContasContábeisExcluir.beforeClass();
		dEPARAContasContábeisExcluir.ingresar();
		dEPARAContasContábeisExcluir.ingresarMDR();
		dEPARAContasContábeisExcluir.excluir();
		dEPARAContasContábeisExcluir.afterClass();

		System.out.println("-------------------Parametros Para Livro ICMSST Fim-------------------------");
	}
	
	//41

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
	
	//42
	
	
	@Test(priority = 42)
	public void cadastroCondiçaoExcluirMasas() {

		System.out.println("---- Hierarquia De Cenarios De Correçao -------------");

		cadastroCondiçaoExcluirMasas = new CadastroCondiçaoExcluirMasas();
		cadastroCondiçaoExcluirMasas.beforeClass();
		cadastroCondiçaoExcluirMasas.login();
		cadastroCondiçaoExcluirMasas.acessarMDR();
		cadastroCondiçaoExcluirMasas.criar();
		cadastroCondiçaoExcluirMasas.afterClass();

	}
	
	//43
	@Test(priority = 43)
	public void responsavelMovimientoExcluirMasas() {

		System.out.println("---- Hierarquia De Cenarios De Correçao -------------");

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

			System.out.println("---- Hierarquia De Cenarios De Correçao -------------");

			instituicaoExcluirMasas = new InstituicaoExcluirMasas();
			instituicaoExcluirMasas.beforeClass();
			instituicaoExcluirMasas.login();
			instituicaoExcluirMasas.acessarMDR();
			instituicaoExcluirMasas.criar();
			instituicaoExcluirMasas.afterClass();

		}
	
}
