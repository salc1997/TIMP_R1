package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteCriar;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteDetalhe;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteEditar;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteExcluir;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteVisualizar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesCriar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesDetalhes;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesEditar;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesExcluir;
import com.timp.test.MDR.Ajustes.CodigosAjustes.CodigosAjustesVisualizar;
import com.timp.test.MDR.Antecipacao.AntecipacaoCriar;
import com.timp.test.MDR.Antecipacao.AntecipacaoDetalhe;
import com.timp.test.MDR.Antecipacao.AntecipacaoEditar;
import com.timp.test.MDR.Antecipacao.AntecipacaoEliminar;
import com.timp.test.MDR.Antecipacao.AntecipacaoFiltros;
import com.timp.test.MDR.Antecipacao.AntecipacaoVisualizar;
import com.timp.test.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioCriar;
import com.timp.test.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioDetalhes;
import com.timp.test.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioEditar;
import com.timp.test.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioExcluir;
import com.timp.test.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioFiltroID;
import com.timp.test.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioVisualizar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oCriar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oDetalhes;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oEditar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oExcluir;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oVisualizar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeCriar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeEditar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeEliminar;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeExcluirMassa;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeFiltro;
import com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeVisualizar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeCriar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeEditar;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluir;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluirMassa;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeFiscalDetalle;
import com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeVisualizar;
import com.timp.test.MDR.CadastroCondi�ao.*;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoCriar;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoEditar;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoFiltros;
import com.timp.test.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoVisualizar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstitucaoDetalhes;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstitucaoVisualizar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoCriar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoEditar;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoExcluir;
import com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoFiltroId;

public class AutomacoesMDR1 extends TestBaseSteven {
	
	// Ajustes > Associa��o de C�digos de Ajustes
	Associa��oCodigoAjusteCriar associa��oCodigoAjusteCriar;
	Associa��oCodigoAjusteEditar associa��oCodigoAjusteEditar;
	Associa��oCodigoAjusteExcluir associa��oCodigoAjusteExcluir;
	Associa��oCodigoAjusteDetalhe associa��oCodigoAjusteDetalhe;
	Associa��oCodigoAjusteVisualizar associa��oCodigoAjusteVisualizar;

	// Ajustes > C�digo Ajustes
	CodigosAjustesCriar codigosAjustesCriar;
	CodigosAjustesDetalhes codigosAjustesDetalhes;
	CodigosAjustesEditar codigosAjustesEditar;
	CodigosAjustesExcluir codigosAjustesExcluir;
	CodigosAjustesVisualizar codigosAjustesVisualizar;

	// Antecipa��o

	AntecipacaoCriar antecipacaoCriar;
	AntecipacaoEditar antecipacaoEditar;
	AntecipacaoFiltros antecipacaoFiltros;
	AntecipacaoVisualizar antecipacaoVisualizar;
	AntecipacaoEliminar antecipacaoEliminar;
	AntecipacaoDetalhe antecipacaoDetalhe;
	// Ativa��o para Munic�pio

	Ativa�aoParaMunicipioCriar ativa�aoParaMunicipioCriar;
	Ativa�aoParaMunicipioEditar ativa�aoParaMunicipioEditar;
	Ativa�aoParaMunicipioDetalhes ativa�aoParaMunicipioDetalhes;
	Ativa�aoParaMunicipioVisualizar ativa�aoParaMunicipioVisualizar;
	Ativa�aoParaMunicipioExcluir ativa�aoParaMunicipioExcluir;
	Ativa�aoParaMunicipioFiltroID ativa�aoParaMunicipioFiltroID;

	// Atividades Fiscais > Atividades Fiscais

	AtividadeCriar atividadeCriar;
	AtividadeEditar atividadeEditar;
	AtividadeEliminar atividadeEliminar;
	AtividadeFiltro atividadeFiltro;
	AtividadeVisualizar atividadeVisualizar;
	AtividadeExcluirMassa atividadeExcluirMassa;
	
	// Atividades Fiscais > Associa��o de Atividades Fiscais
	Associa��oCriar associa��oCriar;
	Associa��oDetalhes associa��oDetalhes;
	Associa��oEditar associa��oEditar;
	Associa��oVisualizar associa��oVisualizar;
	Associa��oExcluir associa��oExcluir;
	
	// Atividades Fiscais > Grupo Atividades Fiscais

	GrupoAtividadeCriar grupoAtividadeCriar;
	GrupoAtividadeEditar grupoAtividadeEditar;
	GrupoAtividadeVisualizar grupoAtividadeVisualizar;
	GrupoAtividadeExcluir grupoAtividadeExcluir;
	GrupoAtividadeExcluirMassa grupoAtividadeExcluirMassa;
	GrupoAtividadeFiscalDetalle grupoAtividadeFiscalDetalle;
	
	// Cadastro da Condi��o

	CadastroCondicaoCriar cadastroCondicaoCriar;
	CadasatroCondicaoVisualizar cadasatroCondicaoVisualizar;
	CadastroCondicaoEditar cadastroCondicaoEditar;
	CadastroCondicaoExcluir cadastroCondicaoExcluir;
	cadastrocondicaoDetalle cadastroCondicaoDetalle;

	// Cadastro Derex > Responsav�l Pelo Movimento
	ResponsavelMovimentoCriar cadastroresponsavelPeloMovimentoCriar;
	ResponsavelMovimentoEditar cadastroresponsavelPeloMovimentoEditar;
	ResponsavelMovimentoFiltros cadastroresponsavelPeloMovimentoFiltros;
	ResponsavelMovimentoVisualizar cadastroresponsavelPeloMovimentoVisualizar;

	// Cadastro Derex > Institui��o Financeira
	InstituicaoCriar instituicaoCriar;
	InstitucaoVisualizar instituicaoVisualizar;
	InstituicaoEditar instituicaoEditar;
	InstituicaoExcluir instituicaoExcluir;
	InstitucaoDetalhes institucaoDetalhes;
	InstituicaoFiltroId instituicaoFiltroId;
		
	// --------------------------------------------------------------------------------------------------
	
	// Ajustes > Associa��o de C�digos de Ajustes

	@Test(priority = 0)
	public void associa��oCodigoAjusteCriar() {

		System.out.println("-------------------Ajustes > Associa��o de C�digos de Ajustes-------------------------");

		associa��oCodigoAjusteCriar = new Associa��oCodigoAjusteCriar();
		associa��oCodigoAjusteCriar.beforeClass();
		associa��oCodigoAjusteCriar.ingresar();
		associa��oCodigoAjusteCriar.ingresarMDR();
		associa��oCodigoAjusteCriar.criarAssocia��oCodigoAjuste();
		associa��oCodigoAjusteCriar.afterClass();

	}
	
	@Test(priority = 1)
	public void associa��oCodigoAjusteEditar() {

		associa��oCodigoAjusteEditar = new Associa��oCodigoAjusteEditar();
		associa��oCodigoAjusteEditar.beforeClass();
		associa��oCodigoAjusteEditar.ingresar();
		associa��oCodigoAjusteEditar.ingresarMDR();
		associa��oCodigoAjusteEditar.associa��oCodigoAjusteEditar();
		associa��oCodigoAjusteEditar.afterClass();

	}
	
	@Test(priority = 3)
	public void associa��oCodigoAjusteExcluir() {

		associa��oCodigoAjusteExcluir = new Associa��oCodigoAjusteExcluir();
		associa��oCodigoAjusteExcluir.beforeClass();
		associa��oCodigoAjusteExcluir.ingresar();
		associa��oCodigoAjusteExcluir.ingresarMDR();
		associa��oCodigoAjusteExcluir.excluirAssocia��oCodigoAjuste();
		associa��oCodigoAjusteExcluir.afterClass();

	}
	
	@Test(priority = 2)
	public void associa��oCodigoAjusteDetalhe() {

		associa��oCodigoAjusteDetalhe = new Associa��oCodigoAjusteDetalhe();
		associa��oCodigoAjusteDetalhe.beforeClass();
		associa��oCodigoAjusteDetalhe.ingresar();
		associa��oCodigoAjusteDetalhe.ingresarMDR();
		associa��oCodigoAjusteDetalhe.detalhe();
		associa��oCodigoAjusteDetalhe.afterClass();

	}
	
	@Test(priority = 2)
	public void associa��oCodigoAjusteVisualizar() {

		associa��oCodigoAjusteVisualizar = new Associa��oCodigoAjusteVisualizar();
		associa��oCodigoAjusteVisualizar.beforeClass();
		associa��oCodigoAjusteVisualizar.ingresar();
		associa��oCodigoAjusteVisualizar.ingresarMDR();
		associa��oCodigoAjusteVisualizar.visualizarAssocia��oCodigoAjuste();
		associa��oCodigoAjusteVisualizar.afterClass();
		
		System.out.println("-------------------Ajustes > Associa��o de C�digos de Ajustes Fin-------------------------");
	}
	

	// Ajustes > C�digo Ajustes

	@Test(priority = 5)
	public void codigosAjusteCriar() {

		System.out.println("-------------------C�digo Ajustes-------------------------");

		codigosAjustesCriar = new CodigosAjustesCriar();
		codigosAjustesCriar.beforeClass();
		codigosAjustesCriar.login();
		codigosAjustesCriar.acessarMDR();
		codigosAjustesCriar.criar();
		codigosAjustesCriar.afterClass();

	}

	@Test(priority = 6)
	public void codigosAjustesVisualizar() {

		codigosAjustesVisualizar = new CodigosAjustesVisualizar();
		codigosAjustesVisualizar.beforeClass();
		codigosAjustesVisualizar.login();
		codigosAjustesVisualizar.acessarMDR();
		codigosAjustesVisualizar.visualizar();
		codigosAjustesVisualizar.afterClass();

	}

	@Test(priority = 7)
	public void codigosAjustesEditar() {

		codigosAjustesEditar = new CodigosAjustesEditar();
		codigosAjustesEditar.beforeClass();
		codigosAjustesEditar.login();
		codigosAjustesEditar.acessarMDR();
		codigosAjustesEditar.editar();
		codigosAjustesEditar.afterClass();

	}

	@Test(priority = 8)
	public void codigosAjustesDetalhes() {

		codigosAjustesDetalhes = new CodigosAjustesDetalhes();
		codigosAjustesDetalhes.beforeClass();
		codigosAjustesDetalhes.login();
		codigosAjustesDetalhes.acessarMDR();
		codigosAjustesDetalhes.detalhes();
		codigosAjustesDetalhes.afterClass();

	}

	@Test(priority = 9)
	public void codigosAjustesExcluir() {

		codigosAjustesExcluir = new CodigosAjustesExcluir();
		codigosAjustesExcluir.beforeClass();
		codigosAjustesExcluir.login();
		codigosAjustesExcluir.acessarMDR();
		codigosAjustesExcluir.excluir();
		codigosAjustesExcluir.afterClass();

		System.out.println("-------------------Ajustes > C�digo Ajustes Fin-------------------------");
	}

	// Antecipacao

	@Test(priority = 10)
	public void antecipacaoCriar() {

		System.out.println("-------------------Antecipa��o-------------------------");

		antecipacaoCriar = new AntecipacaoCriar();
		antecipacaoCriar.beforeClass();
		antecipacaoCriar.login();
		antecipacaoCriar.acessarMDR();
		antecipacaoCriar.criar();
		antecipacaoCriar.afterClass();

	}

	@Test(priority = 11)
	public void antecipacaoEditar() {

		antecipacaoEditar = new AntecipacaoEditar();
		antecipacaoEditar.beforeClass();
		antecipacaoEditar.login();
		antecipacaoEditar.acessarMDR();
		antecipacaoEditar.editar();
		antecipacaoEditar.afterClass();

	}

	@Test(priority = 12)
	public void antecipacaoVisualizar() {

		antecipacaoVisualizar = new AntecipacaoVisualizar();
		antecipacaoVisualizar.beforeClass();
		antecipacaoVisualizar.login();
		antecipacaoVisualizar.acessarMDR();
		antecipacaoVisualizar.visualizar();
		antecipacaoVisualizar.afterClass();

	}

	@Test(priority = 13)
	public void antecipacaoFiltros() {

		antecipacaoFiltros = new AntecipacaoFiltros();
		antecipacaoFiltros.beforeClass();
		antecipacaoFiltros.login();
		antecipacaoFiltros.acessarMDR();
		antecipacaoFiltros.filtros();
		antecipacaoFiltros.afterClass();

	}
	
	@Test(priority = 14)
	public void antecipacaoDetalhe() {

		antecipacaoDetalhe = new AntecipacaoDetalhe();
		antecipacaoDetalhe.beforeClass();
		antecipacaoDetalhe.login();
		antecipacaoDetalhe.acessarMDR();
		antecipacaoDetalhe.detalhe();
		antecipacaoDetalhe.afterClass();

	}


	@Test(priority = 15)
	public void antecipacaoExcluir() {

		antecipacaoEliminar = new AntecipacaoEliminar();
		antecipacaoEliminar.beforeClass();
		antecipacaoEliminar.login();
		antecipacaoEliminar.acessarMDR();
		antecipacaoEliminar.excluir();
		antecipacaoEliminar.afterClass();

		System.out.println("-------------------Antecipac�o Fin-------------------------");
	}

	// Ativa��o para Munic�pio

	@Test(priority = 15)
	public void ativacaoParaMunicipioCriar() {

		System.out.println("-------------------Ativa��o para Munic�pio-------------------------");

		ativa�aoParaMunicipioCriar = new Ativa�aoParaMunicipioCriar();
		ativa�aoParaMunicipioCriar.beforeClass();
		ativa�aoParaMunicipioCriar.login();
		ativa�aoParaMunicipioCriar.acessarMDR();
		ativa�aoParaMunicipioCriar.criar();
		ativa�aoParaMunicipioCriar.afterClass();

	}

	@Test(priority = 16)
	public void ativacaoParaMunicipioEditar() {

		ativa�aoParaMunicipioEditar = new Ativa�aoParaMunicipioEditar();
		ativa�aoParaMunicipioEditar.beforeClass();
		ativa�aoParaMunicipioEditar.login();
		ativa�aoParaMunicipioEditar.acessarMDR();
		ativa�aoParaMunicipioEditar.editar();
		ativa�aoParaMunicipioEditar.afterClass();

	}

	@Test(priority = 17)
	public void ativacaoParaMunicipioVisualizar() {

		ativa�aoParaMunicipioVisualizar = new Ativa�aoParaMunicipioVisualizar();
		ativa�aoParaMunicipioVisualizar.beforeClass();
		ativa�aoParaMunicipioVisualizar.login();
		ativa�aoParaMunicipioVisualizar.acessarMDR();
		ativa�aoParaMunicipioVisualizar.visualizar();
		ativa�aoParaMunicipioVisualizar.afterClass();

	}
	
	@Test(priority = 17)
	public void ativacaoParaMunicipioFiltroID() {

		ativa�aoParaMunicipioFiltroID = new Ativa�aoParaMunicipioFiltroID();
		ativa�aoParaMunicipioFiltroID.beforeClass();
		ativa�aoParaMunicipioFiltroID.login();
		ativa�aoParaMunicipioFiltroID.acessarMDR();
		ativa�aoParaMunicipioFiltroID.filtro();
		ativa�aoParaMunicipioFiltroID.afterClass();

	}


	@Test(priority = 18)
	public void ativacaoParaMunicipioDetalhes() {

		ativa�aoParaMunicipioDetalhes = new Ativa�aoParaMunicipioDetalhes();
		ativa�aoParaMunicipioDetalhes.beforeClass();
		ativa�aoParaMunicipioDetalhes.login();
		ativa�aoParaMunicipioDetalhes.acessarMDR();
		ativa�aoParaMunicipioDetalhes.detalhes();
		ativa�aoParaMunicipioDetalhes.afterClass();

	}

	@Test(priority = 19)
	public void ativacaoParaMunicipioExcluir() {

		ativa�aoParaMunicipioExcluir = new Ativa�aoParaMunicipioExcluir();
		ativa�aoParaMunicipioExcluir.beforeClass();
		ativa�aoParaMunicipioExcluir.login();
		ativa�aoParaMunicipioExcluir.acessarMDR();
		ativa�aoParaMunicipioExcluir.excluir();
		ativa�aoParaMunicipioExcluir.afterClass();

		System.out.println("-------------------Ativa��o para Munic�pio Fin-------------------------");
	}

	// Atividades Fiscais > Atividades Fiscais

	@Test(priority = 20)
	public void atividadeFiscalCriar() {

		System.out.println("-------------------Atividade Fiscal > Atividade Fiscal-------------------------");

		atividadeCriar = new AtividadeCriar();
		atividadeCriar.beforeClass();
		atividadeCriar.login();
		atividadeCriar.acessarMDR();
		atividadeCriar.criar();
		atividadeCriar.afterClass();

	}

	@Test(priority = 21)
	public void atividadeFiscalEditar() {

		atividadeEditar = new AtividadeEditar();
		atividadeEditar.beforeClass();
		atividadeEditar.login();
		atividadeEditar.acessarMDR();
		atividadeEditar.editar();
		atividadeEditar.afterClass();

	}

	@Test(priority = 21)
	public void atividadeFiscalVisualizar() {

		atividadeVisualizar = new AtividadeVisualizar();
		atividadeVisualizar.beforeClass();
		atividadeVisualizar.login();
		atividadeVisualizar.acessarMDR();
		atividadeVisualizar.visualizar();
		atividadeVisualizar.afterClass();

	}

	@Test(priority = 22)
	public void atividadeFiscalFiltro() {

		atividadeFiltro = new AtividadeFiltro();
		atividadeFiltro.beforeClass();
		atividadeFiltro.login();
		atividadeFiltro.acessarMDR();
		atividadeFiltro.filtro();
		atividadeFiltro.afterClass();

	}

	@Test(priority = 23)
	public void atividadeFiscalExcluir() {

		atividadeEliminar = new AtividadeEliminar();
		atividadeEliminar.beforeClass();
		atividadeEliminar.login();
		atividadeEliminar.acessarMDR();
		atividadeEliminar.eliminar();
		atividadeEliminar.afterClass();

	}
	
	@Test(priority = 24)
	public void atividadeExcluirMassa() {

		atividadeExcluirMassa = new AtividadeExcluirMassa();
		atividadeExcluirMassa.beforeClass();
		atividadeExcluirMassa.login();
		atividadeExcluirMassa.acessarMDR();
		atividadeExcluirMassa.criar();
		atividadeExcluirMassa.excluirMassa();
		atividadeExcluirMassa.afterClass();

		System.out.println("-------------------Atividade Fiscal > Atividade Fiscal Fin-------------------------");
	}

	// Atividades Fiscais > Grupo Atividades Fiscais

	@Test(priority = 25)
	public void grupoAtividadeFiscalCriar() {

		System.out.println("-------------------Atividade Fiscal > Grupo Atividade Fiscal-------------------------");

		grupoAtividadeCriar = new GrupoAtividadeCriar();
		grupoAtividadeCriar.beforeClass();
		grupoAtividadeCriar.login();
		grupoAtividadeCriar.acessarMDR();
		grupoAtividadeCriar.criar();
		grupoAtividadeCriar.afterClass();

	}

	@Test(priority = 26)
	public void grupoAtividadeFiscalEditar() {

		grupoAtividadeEditar = new GrupoAtividadeEditar();
		grupoAtividadeEditar.beforeClass();
		grupoAtividadeEditar.login();
		grupoAtividadeEditar.acessarMDR();
		grupoAtividadeEditar.editar();
		grupoAtividadeEditar.afterClass();

	}
	
	@Test(priority = 26)
	public void grupoAtividadeFiscalDetalle() {

		grupoAtividadeFiscalDetalle = new GrupoAtividadeFiscalDetalle();
		grupoAtividadeFiscalDetalle.beforeClass();
		grupoAtividadeFiscalDetalle.ingresar();
		grupoAtividadeFiscalDetalle.ingresarMDR();
		grupoAtividadeFiscalDetalle.detalle();
		grupoAtividadeFiscalDetalle.afterClass();

	}

	@Test(priority = 26)
	public void grupoAtividadeFiscalVisualizar() {

		grupoAtividadeVisualizar = new GrupoAtividadeVisualizar();
		grupoAtividadeVisualizar.beforeClass();
		grupoAtividadeVisualizar.login();
		grupoAtividadeVisualizar.acessarMDR();
		grupoAtividadeVisualizar.visualizar();
		grupoAtividadeVisualizar.afterClass();
	}
	
	@Test(priority = 27)
	public void grupoAtividadeFiscalExcluir() {

		grupoAtividadeExcluir = new GrupoAtividadeExcluir();
		grupoAtividadeExcluir.beforeClass();
		grupoAtividadeExcluir.ingresar();
		grupoAtividadeExcluir.mdrEntrar();
		grupoAtividadeExcluir.excluir();
		grupoAtividadeExcluir.afterClass();

	}
	
	@Test(priority = 28)
	public void grupoAtividadeFiscalExcluirMassa() {

		grupoAtividadeExcluirMassa = new GrupoAtividadeExcluirMassa();
		grupoAtividadeExcluirMassa.beforeClass();
		grupoAtividadeExcluirMassa.login();
		grupoAtividadeExcluirMassa.acessarMDR();
		grupoAtividadeExcluirMassa.excluirMassa();
		grupoAtividadeExcluirMassa.afterClass();

		System.out.println("-------------------Atividade Fiscal > Grupo Atividade Fiscal Fin-------------------------");
	}

	// Cadastro da Condi��o

	@Test(priority = 29)
	public void cadastroCondicaoCriar() {

		System.out.println("-------------------Cadastro da Condi��o-------------------------");

		cadastroCondicaoCriar = new CadastroCondicaoCriar();
		cadastroCondicaoCriar.beforeClass();
		cadastroCondicaoCriar.login();
		cadastroCondicaoCriar.acessarMDR();
		cadastroCondicaoCriar.criar();
		cadastroCondicaoCriar.afterClass();

	}

	@Test(priority = 30)
	public void cadastroCondicaoEditar() {

		cadastroCondicaoEditar = new CadastroCondicaoEditar();
		cadastroCondicaoEditar.beforeClass();
		cadastroCondicaoEditar.login();
		cadastroCondicaoEditar.acessarMDR();
		cadastroCondicaoEditar.editar();
		cadastroCondicaoEditar.afterClass();

	}

	@Test(priority = 30)
	public void cadastroCondicaoDetalle() {

		cadastroCondicaoDetalle = new cadastrocondicaoDetalle();
		cadastroCondicaoDetalle.beforeClass();
		cadastroCondicaoDetalle.ingresar();
		cadastroCondicaoDetalle.ingresarMDR();
		cadastroCondicaoDetalle.detalle();
		cadastroCondicaoDetalle.afterClass();

	}
	@Test(priority = 31)
	public void cadastroCondicaoVisualizar() {

		cadasatroCondicaoVisualizar = new CadasatroCondicaoVisualizar();
		cadasatroCondicaoVisualizar.beforeClass();
		cadasatroCondicaoVisualizar.login();
		cadasatroCondicaoVisualizar.acessarMDR();
		cadasatroCondicaoVisualizar.visualizar();
		cadasatroCondicaoVisualizar.afterClass();

	}

	@Test(priority = 32)
	public void cadastroCondicaoExcluir() {

		cadastroCondicaoExcluir = new CadastroCondicaoExcluir();
		cadastroCondicaoExcluir.beforeClass();
		cadastroCondicaoExcluir.login();
		cadastroCondicaoExcluir.acessarMDR();
		cadastroCondicaoExcluir.Excluir();
		cadastroCondicaoExcluir.afterClass();

		System.out.println("-------------------Cadastro da Condi��o Fin-------------------------");
	}

	// Cadastro Derex > Insitui��o Financeira

	@Test(priority = 33)
	public void instituicaoFinanceiraCriar() {

		System.out.println("-------------------Cadastro Derex > Insitui��o Financeira-------------------------");

		instituicaoCriar = new InstituicaoCriar();
		instituicaoCriar.beforeClass();
		instituicaoCriar.login();
		instituicaoCriar.acessarMDR();
		instituicaoCriar.criar();
		instituicaoCriar.afterClass();

	}

	@Test(priority = 34)
	public void instituicaoFinanceiraEditar() {

		instituicaoEditar = new InstituicaoEditar();
		instituicaoEditar.beforeClass();
		instituicaoEditar.login();
		instituicaoEditar.acessarMDR();
		instituicaoEditar.editar();
		instituicaoEditar.afterClass();

	}

	@Test(priority = 34)
	public void instituicaoFinanceiraVisualizar() {

		instituicaoVisualizar = new InstitucaoVisualizar();
		instituicaoVisualizar.beforeClass();
		instituicaoVisualizar.login();
		instituicaoVisualizar.acessarMDR();
		instituicaoVisualizar.visualizar();
		instituicaoVisualizar.afterClass();

	}
	
	@Test(priority = 35)
	public void institucaoDetalhes() {

		institucaoDetalhes = new InstitucaoDetalhes();
		institucaoDetalhes.beforeClass();
		institucaoDetalhes.login();
		institucaoDetalhes.acessarMDR();
		institucaoDetalhes.detalhes();
		institucaoDetalhes.afterClass();

	}
	
	@Test(priority = 36)
	public void instituicaoFiltroId() {

		instituicaoFiltroId = new InstituicaoFiltroId();
		instituicaoFiltroId.beforeClass();
		instituicaoFiltroId.login();
		instituicaoFiltroId.acessarMDR();
		instituicaoFiltroId.filtroId();
		instituicaoFiltroId.afterClass();

	}
	


//Cadastro Derex > Cadastro Respons�vel Pelo Movimento

	@Test(priority = 35)
	public void cadastroResponsavelPeloMovimentoCriar() {

		System.out.println(
				"-------------------Cadastro Derex > Cadastro Respons�vel Pelo Movimento-------------------------");

		cadastroresponsavelPeloMovimentoCriar = new ResponsavelMovimentoCriar();
		cadastroresponsavelPeloMovimentoCriar.beforeClass();
		cadastroresponsavelPeloMovimentoCriar.login();
		cadastroresponsavelPeloMovimentoCriar.acessarMDR();
		cadastroresponsavelPeloMovimentoCriar.criar();
		cadastroresponsavelPeloMovimentoCriar.afterClass();

	}

	@Test(priority = 36)
	public void cadastroResponsavelPeloMovimentoEditar() {

		cadastroresponsavelPeloMovimentoEditar = new ResponsavelMovimentoEditar();
		cadastroresponsavelPeloMovimentoEditar.beforeClass();
		cadastroresponsavelPeloMovimentoEditar.login();
		cadastroresponsavelPeloMovimentoEditar.acessarMDR();
		cadastroresponsavelPeloMovimentoEditar.editar();
		cadastroresponsavelPeloMovimentoEditar.afterClass();

	}

	@Test(priority = 37)
	public void cadastroResponsavelPeloMovimentoVisualizar() {

		cadastroresponsavelPeloMovimentoVisualizar = new ResponsavelMovimentoVisualizar();
		cadastroresponsavelPeloMovimentoVisualizar.beforeClass();
		cadastroresponsavelPeloMovimentoVisualizar.login();
		cadastroresponsavelPeloMovimentoVisualizar.acessarMDR();
		cadastroresponsavelPeloMovimentoVisualizar.visualizar();
		cadastroresponsavelPeloMovimentoVisualizar.afterClass();

	}

	@Test(priority = 38)
	public void cadastroResponsavelPeloMovimentoFiltro() {

		cadastroresponsavelPeloMovimentoFiltros = new ResponsavelMovimentoFiltros();
		cadastroresponsavelPeloMovimentoFiltros.beforeClass();
		cadastroresponsavelPeloMovimentoFiltros.login();
		cadastroresponsavelPeloMovimentoFiltros.acessarMDR();
		cadastroresponsavelPeloMovimentoFiltros.filtros();
		cadastroresponsavelPeloMovimentoFiltros.afterClass();

		System.out.println(
				"-------------------Cadastro Derex > Cadastro Respons�vel Pelo Movimento Fin-------------------------");

	}

	@Test(priority = 39)
	public void instituicaoFinanceiraExcluir() {

		instituicaoExcluir = new InstituicaoExcluir();
		instituicaoExcluir.beforeClass();
		instituicaoExcluir.login();
		instituicaoExcluir.acessarMDR();
		instituicaoExcluir.excluir();
		instituicaoExcluir.afterClass();

		System.out.println("-------------------Cadastro Derex > Insitui��o Financeira Fin-------------------------");

	}



		

}