package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteCriar;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteDetalhe;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteEditar;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteExcluir;
import com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteVisualizar;
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
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioCriar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioDetalhes;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioEditar;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioExcluir;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioFiltroID;
import com.timp.test.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioVisualizar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoDetalhes;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoEditar;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoExcluir;
import com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoVisualizar;
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
import com.timp.test.MDR.CadastroCondiçao.*;
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
	
	// Ajustes > Associação de Códigos de Ajustes
	AssociaçãoCodigoAjusteCriar associaçãoCodigoAjusteCriar;
	AssociaçãoCodigoAjusteEditar associaçãoCodigoAjusteEditar;
	AssociaçãoCodigoAjusteExcluir associaçãoCodigoAjusteExcluir;
	AssociaçãoCodigoAjusteDetalhe associaçãoCodigoAjusteDetalhe;
	AssociaçãoCodigoAjusteVisualizar associaçãoCodigoAjusteVisualizar;

	// Ajustes > Código Ajustes
	CodigosAjustesCriar codigosAjustesCriar;
	CodigosAjustesDetalhes codigosAjustesDetalhes;
	CodigosAjustesEditar codigosAjustesEditar;
	CodigosAjustesExcluir codigosAjustesExcluir;
	CodigosAjustesVisualizar codigosAjustesVisualizar;

	// Antecipação

	AntecipacaoCriar antecipacaoCriar;
	AntecipacaoEditar antecipacaoEditar;
	AntecipacaoFiltros antecipacaoFiltros;
	AntecipacaoVisualizar antecipacaoVisualizar;
	AntecipacaoEliminar antecipacaoEliminar;
	AntecipacaoDetalhe antecipacaoDetalhe;
	// Ativação para Município

	AtivaçaoParaMunicipioCriar ativaçaoParaMunicipioCriar;
	AtivaçaoParaMunicipioEditar ativaçaoParaMunicipioEditar;
	AtivaçaoParaMunicipioDetalhes ativaçaoParaMunicipioDetalhes;
	AtivaçaoParaMunicipioVisualizar ativaçaoParaMunicipioVisualizar;
	AtivaçaoParaMunicipioExcluir ativaçaoParaMunicipioExcluir;
	AtivaçaoParaMunicipioFiltroID ativaçaoParaMunicipioFiltroID;

	// Atividades Fiscais > Atividades Fiscais

	AtividadeCriar atividadeCriar;
	AtividadeEditar atividadeEditar;
	AtividadeEliminar atividadeEliminar;
	AtividadeFiltro atividadeFiltro;
	AtividadeVisualizar atividadeVisualizar;
	AtividadeExcluirMassa atividadeExcluirMassa;
	
	// Atividades Fiscais > Associação de Atividades Fiscais
	AssociaçãoCriar associaçãoCriar;
	AssociaçãoDetalhes associaçãoDetalhes;
	AssociaçãoEditar associaçãoEditar;
	AssociaçãoVisualizar associaçãoVisualizar;
	AssociaçãoExcluir associaçãoExcluir;
	
	// Atividades Fiscais > Grupo Atividades Fiscais

	GrupoAtividadeCriar grupoAtividadeCriar;
	GrupoAtividadeEditar grupoAtividadeEditar;
	GrupoAtividadeVisualizar grupoAtividadeVisualizar;
	GrupoAtividadeExcluir grupoAtividadeExcluir;
	GrupoAtividadeExcluirMassa grupoAtividadeExcluirMassa;
	GrupoAtividadeFiscalDetalle grupoAtividadeFiscalDetalle;
	
	// Cadastro da Condição

	CadastroCondicaoCriar cadastroCondicaoCriar;
	CadasatroCondicaoVisualizar cadasatroCondicaoVisualizar;
	CadastroCondicaoEditar cadastroCondicaoEditar;
	CadastroCondicaoExcluir cadastroCondicaoExcluir;
	cadastrocondicaoDetalle cadastroCondicaoDetalle;

	// Cadastro Derex > Responsavél Pelo Movimento
	ResponsavelMovimentoCriar cadastroresponsavelPeloMovimentoCriar;
	ResponsavelMovimentoEditar cadastroresponsavelPeloMovimentoEditar;
	ResponsavelMovimentoFiltros cadastroresponsavelPeloMovimentoFiltros;
	ResponsavelMovimentoVisualizar cadastroresponsavelPeloMovimentoVisualizar;

	// Cadastro Derex > Instituição Financeira
	InstituicaoCriar instituicaoCriar;
	InstitucaoVisualizar instituicaoVisualizar;
	InstituicaoEditar instituicaoEditar;
	InstituicaoExcluir instituicaoExcluir;
	InstitucaoDetalhes institucaoDetalhes;
	InstituicaoFiltroId instituicaoFiltroId;
		
	// --------------------------------------------------------------------------------------------------
	
	// Ajustes > Associação de Códigos de Ajustes

	@Test(priority = 0)
	public void associaçãoCodigoAjusteCriar() {

		System.out.println("-------------------Ajustes > Associação de Códigos de Ajustes-------------------------");

		associaçãoCodigoAjusteCriar = new AssociaçãoCodigoAjusteCriar();
		associaçãoCodigoAjusteCriar.beforeClass();
		associaçãoCodigoAjusteCriar.ingresar();
		associaçãoCodigoAjusteCriar.ingresarMDR();
		associaçãoCodigoAjusteCriar.criarAssociaçãoCodigoAjuste();
		associaçãoCodigoAjusteCriar.afterClass();

	}
	
	@Test(priority = 1)
	public void associaçãoCodigoAjusteEditar() {

		associaçãoCodigoAjusteEditar = new AssociaçãoCodigoAjusteEditar();
		associaçãoCodigoAjusteEditar.beforeClass();
		associaçãoCodigoAjusteEditar.ingresar();
		associaçãoCodigoAjusteEditar.ingresarMDR();
		associaçãoCodigoAjusteEditar.associaçãoCodigoAjusteEditar();
		associaçãoCodigoAjusteEditar.afterClass();

	}
	
	@Test(priority = 3)
	public void associaçãoCodigoAjusteExcluir() {

		associaçãoCodigoAjusteExcluir = new AssociaçãoCodigoAjusteExcluir();
		associaçãoCodigoAjusteExcluir.beforeClass();
		associaçãoCodigoAjusteExcluir.ingresar();
		associaçãoCodigoAjusteExcluir.ingresarMDR();
		associaçãoCodigoAjusteExcluir.excluirAssociaçãoCodigoAjuste();
		associaçãoCodigoAjusteExcluir.afterClass();

	}
	
	@Test(priority = 2)
	public void associaçãoCodigoAjusteDetalhe() {

		associaçãoCodigoAjusteDetalhe = new AssociaçãoCodigoAjusteDetalhe();
		associaçãoCodigoAjusteDetalhe.beforeClass();
		associaçãoCodigoAjusteDetalhe.ingresar();
		associaçãoCodigoAjusteDetalhe.ingresarMDR();
		associaçãoCodigoAjusteDetalhe.detalhe();
		associaçãoCodigoAjusteDetalhe.afterClass();

	}
	
	@Test(priority = 2)
	public void associaçãoCodigoAjusteVisualizar() {

		associaçãoCodigoAjusteVisualizar = new AssociaçãoCodigoAjusteVisualizar();
		associaçãoCodigoAjusteVisualizar.beforeClass();
		associaçãoCodigoAjusteVisualizar.ingresar();
		associaçãoCodigoAjusteVisualizar.ingresarMDR();
		associaçãoCodigoAjusteVisualizar.visualizarAssociaçãoCodigoAjuste();
		associaçãoCodigoAjusteVisualizar.afterClass();
		
		System.out.println("-------------------Ajustes > Associação de Códigos de Ajustes Fin-------------------------");
	}
	

	// Ajustes > Código Ajustes

	@Test(priority = 5)
	public void codigosAjusteCriar() {

		System.out.println("-------------------Código Ajustes-------------------------");

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

		System.out.println("-------------------Ajustes > Código Ajustes Fin-------------------------");
	}

	// Antecipacao

	@Test(priority = 10)
	public void antecipacaoCriar() {

		System.out.println("-------------------Antecipação-------------------------");

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

		System.out.println("-------------------Antecipacão Fin-------------------------");
	}

	// Ativação para Município

	@Test(priority = 15)
	public void ativacaoParaMunicipioCriar() {

		System.out.println("-------------------Ativação para Município-------------------------");

		ativaçaoParaMunicipioCriar = new AtivaçaoParaMunicipioCriar();
		ativaçaoParaMunicipioCriar.beforeClass();
		ativaçaoParaMunicipioCriar.login();
		ativaçaoParaMunicipioCriar.acessarMDR();
		ativaçaoParaMunicipioCriar.criar();
		ativaçaoParaMunicipioCriar.afterClass();

	}

	@Test(priority = 16)
	public void ativacaoParaMunicipioEditar() {

		ativaçaoParaMunicipioEditar = new AtivaçaoParaMunicipioEditar();
		ativaçaoParaMunicipioEditar.beforeClass();
		ativaçaoParaMunicipioEditar.login();
		ativaçaoParaMunicipioEditar.acessarMDR();
		ativaçaoParaMunicipioEditar.editar();
		ativaçaoParaMunicipioEditar.afterClass();

	}

	@Test(priority = 17)
	public void ativacaoParaMunicipioVisualizar() {

		ativaçaoParaMunicipioVisualizar = new AtivaçaoParaMunicipioVisualizar();
		ativaçaoParaMunicipioVisualizar.beforeClass();
		ativaçaoParaMunicipioVisualizar.login();
		ativaçaoParaMunicipioVisualizar.acessarMDR();
		ativaçaoParaMunicipioVisualizar.visualizar();
		ativaçaoParaMunicipioVisualizar.afterClass();

	}
	
	@Test(priority = 17)
	public void ativacaoParaMunicipioFiltroID() {

		ativaçaoParaMunicipioFiltroID = new AtivaçaoParaMunicipioFiltroID();
		ativaçaoParaMunicipioFiltroID.beforeClass();
		ativaçaoParaMunicipioFiltroID.login();
		ativaçaoParaMunicipioFiltroID.acessarMDR();
		ativaçaoParaMunicipioFiltroID.filtro();
		ativaçaoParaMunicipioFiltroID.afterClass();

	}


	@Test(priority = 18)
	public void ativacaoParaMunicipioDetalhes() {

		ativaçaoParaMunicipioDetalhes = new AtivaçaoParaMunicipioDetalhes();
		ativaçaoParaMunicipioDetalhes.beforeClass();
		ativaçaoParaMunicipioDetalhes.login();
		ativaçaoParaMunicipioDetalhes.acessarMDR();
		ativaçaoParaMunicipioDetalhes.detalhes();
		ativaçaoParaMunicipioDetalhes.afterClass();

	}

	@Test(priority = 19)
	public void ativacaoParaMunicipioExcluir() {

		ativaçaoParaMunicipioExcluir = new AtivaçaoParaMunicipioExcluir();
		ativaçaoParaMunicipioExcluir.beforeClass();
		ativaçaoParaMunicipioExcluir.login();
		ativaçaoParaMunicipioExcluir.acessarMDR();
		ativaçaoParaMunicipioExcluir.excluir();
		ativaçaoParaMunicipioExcluir.afterClass();

		System.out.println("-------------------Ativação para Município Fin-------------------------");
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

	// Cadastro da Condição

	@Test(priority = 29)
	public void cadastroCondicaoCriar() {

		System.out.println("-------------------Cadastro da Condição-------------------------");

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

		System.out.println("-------------------Cadastro da Condição Fin-------------------------");
	}

	// Cadastro Derex > Insituição Financeira

	@Test(priority = 33)
	public void instituicaoFinanceiraCriar() {

		System.out.println("-------------------Cadastro Derex > Insituição Financeira-------------------------");

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
	


//Cadastro Derex > Cadastro Responsável Pelo Movimento

	@Test(priority = 35)
	public void cadastroResponsavelPeloMovimentoCriar() {

		System.out.println(
				"-------------------Cadastro Derex > Cadastro Responsável Pelo Movimento-------------------------");

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
				"-------------------Cadastro Derex > Cadastro Responsável Pelo Movimento Fin-------------------------");

	}

	@Test(priority = 39)
	public void instituicaoFinanceiraExcluir() {

		instituicaoExcluir = new InstituicaoExcluir();
		instituicaoExcluir.beforeClass();
		instituicaoExcluir.login();
		instituicaoExcluir.acessarMDR();
		instituicaoExcluir.excluir();
		instituicaoExcluir.afterClass();

		System.out.println("-------------------Cadastro Derex > Insituição Financeira Fin-------------------------");

	}



		

}