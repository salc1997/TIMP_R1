package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosCriar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosDetalhes;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosEditar;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosExcluir;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosFiltroID;
import com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosVisualizar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraCriar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraDetalhes;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraEditar;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluir;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluirEmMassa;
import com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraVisualizar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPExcluirEnMasa;
import com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX.ValoresParaMetodoPECEXFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVACriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVADetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA.ValoresParaMetodoPVAFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVFiltroID;
import com.timp.test.MDR.RegistroECAC.RegistroECACCVisualizar;
import com.timp.test.MDR.RegistroECAC.RegistroECACCriar;
import com.timp.test.MDR.RegistroECAC.RegistroECACEditar;
import com.timp.test.MDR.RegistroECAC.RegistroECACExcluir;
import com.timp.test.MDR.RegistroECAC.RegistroECACExcluirMassa;
import com.timp.test.MDR.RegistroECAC.RegistroECACFiltrosAvan;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisCriar;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisDetalhes;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisEditar;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisExcluir;
import com.timp.test.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisExcluirEmMasa;

public class AutomacoesMDR14 extends TestBaseSteven{
////Preço de Transferencia > Parametros para TP
	ParametrosParaTPCriar parametrosParaTPCriar;
	ParametrosParaTPEditar parametrosParaTPEditar;
	ParametrosParaTPExcluir parametrosParaTPExcluir;
	ParametrosParaTPFiltroID parametrosParaTPFiltroID;
	ParametrosParaTPExcluirEnMasa parametrosParaTPExcluirEnMasa;

	// Registro ECAC

	RegistroECACCriar registroECACCriar;
	RegistroECACEditar registroECACEditar;
	RegistroECACExcluir registroECACExcluir;
	RegistroECACCVisualizar registroECACCVisualizar;
	RegistroECACExcluirMassa registroECACExcluirMassa;
	RegistroECACFiltrosAvan registroECACFiltrosAvan;

	//Atividades Para Tributacao > Tipos De Servicos
	TiposDeServicosCriar tiposDeServicosCriar;
	TiposDeServicosDetalhes tiposDeServicosDetalhes;
	TiposDeServicosEditar tiposDeServicosEditar;
	TiposDeServicosVisualizar tiposDeServicosVisualizar;
	TiposDeServicosExcluir tiposDeServicosExcluir;
	TiposDeServicosFiltroID tiposDeServicosFiltroID;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV
	ValoresParaMetodoPVVCriar valoresParaMetodoPVVCriar;
	ValoresParaMetodoPVVDetalhes valoresParaMetodoPVVDetalhes;
	ValoresParaMetodoPVVEditar valoresParaMetodoPVVEditar;
	ValoresParaMetodoPVVExcluir valoresParaMetodoPVVExcluir;
	ValoresParaMetodoPVVFiltroID valoresParaMetodoPVVFiltroID;
	ValoresParaMetodoPVVExcluirEmMassa valoresParaMetodoPVVExcluirEmMassa;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX
	ValoresParaMetodoPVEXCriar valoresParaMetodoPVEXCriar;
	ValoresParaMetodoPVEXDetalhes valoresParaMetodoPVEXDetalhes;
	ValoresParaMetodoPVEXEditar valoresParaMetodoPVEXEditar;
	ValoresParaMetodoPVEXExcluir valoresParaMetodoPVEXExcluir;
	ValoresParaMetodoPVEXFiltroID valoresParaMetodoPVEXFiltroID;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX
	ValoresParaMetodoPECEXCriar valoresParaMetodoPECEXCriar;
	ValoresParaMetodoPECEXDetalhes valoresParaMetodoPECEXDetalhes;
	ValoresParaMetodoPECEXEditar valoresParaMetodoPECEXEditar;
	ValoresParaMetodoPECEXExcluir valoresParaMetodoPECEXExcluir;
	ValoresParaMetodoPECEXFiltroID valoresParaMetodoPECEXFiltroID;

	//Reinf > Processos Adm/Judiciais
	ProcessosAdmJudiciaisCriar processosAdmJudiciaisCriar;
	ProcessosAdmJudiciaisEditar processosAdmJudiciaisEditar;
	ProcessosAdmJudiciaisDetalhes processosAdmJudiciaisDetalhes;
	ProcessosAdmJudiciaisExcluir processosAdmJudiciaisExcluir;
	ProcessosAdmJudiciaisExcluirEmMasa processosAdmJudiciaisExcluirEmMasa;
	
	//Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra
	DeterminacaoDeRelevanciaPorRegraCriar determinacaoDeRelevanciaPorRegraCriar;
	DeterminacaoDeRelevanciaPorRegraDetalhes determinacaoDeRelevanciaPorRegraDetalhes;
	DeterminacaoDeRelevanciaPorRegraEditar determinacaoDeRelevanciaPorRegraEditar;
	DeterminacaoDeRelevanciaPorRegraVisualizar determinacaoDeRelevanciaPorRegraVisualizar;
	DeterminacaoDeRelevanciaPorRegraExcluir determinacaoDeRelevanciaPorRegraExcluir;
	DeterminacaoDeRelevanciaPorRegraExcluirEmMassa determinacaoDeRelevanciaPorRegraExcluirEmMassa;
	

	//Preco De Transferencia > Valores Para Metodo > Valores Para Metodo CAP
	ValoresParaMetodoCAPCriar valoresParaMetodoCAPCriar;
	ValoresParaMetodoCAPDetalhes valoresParaMetodoCAPDetalhes;
	ValoresParaMetodoCAPEditar valoresParaMetodoCAPEditar;
	ValoresParaMetodoCAPExcluir valoresParaMetodoCAPExcluir;
	ValoresParaMetodoCAPFiltroID valoresParaMetodoCAPFiltroID;
	ValoresParaMetodoCAPExcluirEmMassa valoresParaMetodoCAPExcluirEmMassa;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVA
	ValoresParaMetodoPVACriar valoresParaMetodoPVACriar;
	ValoresParaMetodoPVADetalhes valoresParaMetodoPVADetalhes;
	ValoresParaMetodoPVAEditar valoresParaMetodoPVAEditar;
	ValoresParaMetodoPVAExcluir valoresParaMetodoPVAExcluir;
	ValoresParaMetodoPVAFiltroID valoresParaMetodoPVAFiltroID;
	ValoresParaMetodoPVAExcluirEmMassa valoresParaMetodoPVAExcluirEmMassa;
	
	// 123
	// Preço de Transferencia > Parametros para TP

	@Test(priority = 122)
	public void parametrosParaTPCriar() {
		System.out.println("-------------------Preço de Transferencia > Parametros para TP-------------------------");
		parametrosParaTPCriar = new ParametrosParaTPCriar();
		parametrosParaTPCriar.beforeClass();
		parametrosParaTPCriar.login();
		parametrosParaTPCriar.acessarMDR();
		parametrosParaTPCriar.criar();
		parametrosParaTPCriar.afterClass();

	}

	@Test(priority = 123)
	public void parametrosParaTPEditar() {
		parametrosParaTPEditar = new ParametrosParaTPEditar();
		parametrosParaTPEditar.beforeClass();
		parametrosParaTPEditar.login();
		parametrosParaTPEditar.acessarMDR();
		parametrosParaTPEditar.editar();
		parametrosParaTPEditar.afterClass();

	}

	@Test(priority = 124)
	public void parametrosParaTPFiltroId() {

		parametrosParaTPFiltroID = new ParametrosParaTPFiltroID();
		parametrosParaTPFiltroID.beforeClass();
		parametrosParaTPFiltroID.login();
		parametrosParaTPFiltroID.acessarMDR();
		parametrosParaTPFiltroID.filtroId();
		parametrosParaTPFiltroID.afterClass();

	}

	@Test(priority = 125)
	public void parametrosParaTPExcluir() {
		parametrosParaTPExcluir = new ParametrosParaTPExcluir();
		parametrosParaTPExcluir.beforeClass();
		parametrosParaTPExcluir.login();
		parametrosParaTPExcluir.acessarMDR();
		parametrosParaTPExcluir.excluir();
		parametrosParaTPExcluir.afterClass();
	}

	@Test(priority = 126)
	public void parametrosParaTPExcluirEnMasa() {

		parametrosParaTPExcluirEnMasa = new ParametrosParaTPExcluirEnMasa();
		parametrosParaTPExcluirEnMasa.beforeClass();
		parametrosParaTPExcluirEnMasa.ingresar();
		parametrosParaTPExcluirEnMasa.mdrEntrar();
		parametrosParaTPExcluirEnMasa.excluirEmMasaParametrosParaTP();
		parametrosParaTPExcluirEnMasa.afterClass();

		System.out.println(
				"-------------------Preço de Transferencia >  Parametros Para TP Fim-------------------------");

	}

	// 130
	// Registro ECAC

	@Test(priority = 130)
	public void registroECACCriar() {
		System.out.println("-------------------Registro ECAC-------------------------");
		registroECACCriar = new RegistroECACCriar();
		registroECACCriar.beforeClass();
		registroECACCriar.login();
		registroECACCriar.acessarMDR();
		registroECACCriar.criar();
		registroECACCriar.afterClass();

	}


	@Test(priority = 131)
	public void registroECACEditar() {
		registroECACEditar = new RegistroECACEditar();
		registroECACEditar.beforeClass();
		registroECACEditar.login();
		registroECACEditar.acessarMDR();
		registroECACEditar.editar();
		registroECACEditar.afterClass();

	}

	@Test(priority = 132)
	public void registroECACCVisualizar() {
		registroECACCVisualizar = new RegistroECACCVisualizar();
		registroECACCVisualizar.beforeClass();
		registroECACCVisualizar.ingresar();
		registroECACCVisualizar.ingresarMDR();
		registroECACCVisualizar.Visualizar();
		registroECACCVisualizar.afterClass();

	}

	@Test(priority = 133)
	public void registroECACExcluir() {
		registroECACExcluir = new RegistroECACExcluir();
		registroECACExcluir.beforeClass();
		registroECACExcluir.login();
		registroECACExcluir.acessarMDR();
		registroECACExcluir.excluir();
		registroECACExcluir.afterClass();
	}

	@Test(priority = 134)
	public void registroECACExcluirMassa() {
		registroECACExcluirMassa = new RegistroECACExcluirMassa();
		registroECACExcluirMassa.beforeClass();
		registroECACExcluirMassa.login();
		registroECACExcluirMassa.acessarMDR();
		registroECACExcluirMassa.criar();
		registroECACExcluirMassa.excluirMassa();
		registroECACExcluirMassa.afterClass();
	}


	@Test(priority = 135)
	public void registroECACFiltrosAvan() {

		registroECACFiltrosAvan = new RegistroECACFiltrosAvan();
		registroECACFiltrosAvan.beforeClass();
		registroECACFiltrosAvan.login();
		registroECACFiltrosAvan.acessarMDR();
		registroECACFiltrosAvan.filtrarAvanRegistroECAC();
		registroECACFiltrosAvan.afterClass();

		System.out.println("-------------------Registro ECAC Fim-------------------------");

	}

	// 136
	// Atividades Para Tributacao > Tipos De Servicos
	@Test(priority = 136)
	public void tiposDeServicosCriar() {
		System.out
		.println("-------------------Atividades Para Tributacao > Tipos De Servicos-------------------------");
		tiposDeServicosCriar = new TiposDeServicosCriar();
		tiposDeServicosCriar.beforeClass();
		tiposDeServicosCriar.login();
		tiposDeServicosCriar.acessarMDR();
		tiposDeServicosCriar.criar();
		tiposDeServicosCriar.afterClass();

	}

	@Test(priority = 137)
	public void tiposDeServicosDetalhes() {
		tiposDeServicosDetalhes = new TiposDeServicosDetalhes();
		tiposDeServicosDetalhes.beforeClass();
		tiposDeServicosDetalhes.login();
		tiposDeServicosDetalhes.acessarMDR();
		tiposDeServicosDetalhes.detalhes();
		tiposDeServicosDetalhes.afterClass();

	}

	@Test(priority = 138)
	public void tiposDeServicosEditar() {
		tiposDeServicosEditar = new TiposDeServicosEditar();
		tiposDeServicosEditar.beforeClass();
		tiposDeServicosEditar.login();
		tiposDeServicosEditar.acessarMDR();
		tiposDeServicosEditar.editar();
		tiposDeServicosEditar.afterClass();

	}

	@Test(priority = 139)
	public void tiposDeServicosVisualizar() {
		tiposDeServicosVisualizar = new TiposDeServicosVisualizar();
		tiposDeServicosVisualizar.beforeClass();
		tiposDeServicosVisualizar.login();
		tiposDeServicosVisualizar.acessarMDR();
		tiposDeServicosVisualizar.Visualizar();
		tiposDeServicosVisualizar.afterClass();

	}

	@Test(priority = 140)
	public void tiposDeServicos() {
		tiposDeServicosExcluir = new TiposDeServicosExcluir();
		tiposDeServicosExcluir.beforeClass();
		tiposDeServicosExcluir.login();
		tiposDeServicosExcluir.acessarMDR();
		tiposDeServicosExcluir.excluir();
		tiposDeServicosExcluir.afterClass();


	}

	@Test(priority = 141)
	public void tiposDeServicosFiltroID() {

		tiposDeServicosFiltroID = new TiposDeServicosFiltroID();
		tiposDeServicosFiltroID.beforeClass();
		tiposDeServicosFiltroID.login();
		tiposDeServicosFiltroID.acessarMDR();
		tiposDeServicosFiltroID.filtro();
		tiposDeServicosFiltroID.afterClass();

	}

	// 142
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV

	@Test(priority = 142)
	public void valoresParaMetodoPVVCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV-------------------------");
		valoresParaMetodoPVVCriar = new ValoresParaMetodoPVVCriar();
		valoresParaMetodoPVVCriar.beforeClass();
		valoresParaMetodoPVVCriar.login();
		valoresParaMetodoPVVCriar.acessarMDR();
		valoresParaMetodoPVVCriar.criar();
		valoresParaMetodoPVVCriar.afterClass();

	}

	@Test(priority = 142)
	public void valoresParaMetodoPVVDetalhes() {

		valoresParaMetodoPVVDetalhes = new ValoresParaMetodoPVVDetalhes();
		valoresParaMetodoPVVDetalhes.beforeClass();
		valoresParaMetodoPVVDetalhes.login();
		valoresParaMetodoPVVDetalhes.acessarMDR();
		valoresParaMetodoPVVDetalhes.Detalhes();
		valoresParaMetodoPVVDetalhes.afterClass();

	}

	@Test(priority = 143)
	public void valoresParaMetodoPVVEditar() {

		valoresParaMetodoPVVEditar = new ValoresParaMetodoPVVEditar();
		valoresParaMetodoPVVEditar.beforeClass();
		valoresParaMetodoPVVEditar.login();
		valoresParaMetodoPVVEditar.acessarMDR();
		valoresParaMetodoPVVEditar.editar();
		valoresParaMetodoPVVEditar.afterClass();

	}


	@Test(priority = 144)
	public void valoresParaMetodoPVVFiltroID() {

		valoresParaMetodoPVVFiltroID = new ValoresParaMetodoPVVFiltroID();
		valoresParaMetodoPVVFiltroID.beforeClass();
		valoresParaMetodoPVVFiltroID.login();
		valoresParaMetodoPVVFiltroID.acessarMDR();
		valoresParaMetodoPVVFiltroID.filtro();
		valoresParaMetodoPVVFiltroID.afterClass();

	}


	@Test(priority = 145)
	public void valoresParaMetodoPVVExcluir() {

		valoresParaMetodoPVVExcluir = new ValoresParaMetodoPVVExcluir();
		valoresParaMetodoPVVExcluir.beforeClass();
		valoresParaMetodoPVVExcluir.login();
		valoresParaMetodoPVVExcluir.acessarMDR();
		valoresParaMetodoPVVExcluir.excluir();
		valoresParaMetodoPVVExcluir.afterClass();

	}

	@Test(priority = 146)
	public void valoresParaMetodoPVVExcluirEmMassa() {

		valoresParaMetodoPVVExcluirEmMassa = new ValoresParaMetodoPVVExcluirEmMassa();
		valoresParaMetodoPVVExcluirEmMassa.beforeClass();
		valoresParaMetodoPVVExcluirEmMassa.ingresar();
		valoresParaMetodoPVVExcluirEmMassa.mdrEntrar();
		valoresParaMetodoPVVExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoPVVExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVV Fim-------------------------");
	}

	// 149
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX

	@Test(priority = 149)
	public void valoresParaMetodoPVEXCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX-------------------------");
		valoresParaMetodoPVEXCriar = new ValoresParaMetodoPVEXCriar();
		valoresParaMetodoPVEXCriar.beforeClass();
		valoresParaMetodoPVEXCriar.login();
		valoresParaMetodoPVEXCriar.acessarMDR();
		valoresParaMetodoPVEXCriar.criar();
		valoresParaMetodoPVEXCriar.afterClass();

	}

	@Test(priority = 150)
	public void valoresParaMetodoPVEXDetalhes() {

		valoresParaMetodoPVEXDetalhes = new ValoresParaMetodoPVEXDetalhes();
		valoresParaMetodoPVEXDetalhes.beforeClass();
		valoresParaMetodoPVEXDetalhes.login();
		valoresParaMetodoPVEXDetalhes.acessarMDR();
		valoresParaMetodoPVEXDetalhes.Detalhes();
		valoresParaMetodoPVEXDetalhes.afterClass();

	}

	@Test(priority = 151)
	public void valoresParaMetodoPVEXEditar() {

		valoresParaMetodoPVEXEditar = new ValoresParaMetodoPVEXEditar();
		valoresParaMetodoPVEXEditar.beforeClass();
		valoresParaMetodoPVEXEditar.login();
		valoresParaMetodoPVEXEditar.acessarMDR();
		valoresParaMetodoPVEXEditar.editar();
		valoresParaMetodoPVEXEditar.afterClass();

	}


	@Test(priority = 152)
	public void valoresParaMetodoPVEXFiltroID() {

		valoresParaMetodoPVEXFiltroID = new ValoresParaMetodoPVEXFiltroID();
		valoresParaMetodoPVEXFiltroID.beforeClass();
		valoresParaMetodoPVEXFiltroID.login();
		valoresParaMetodoPVEXFiltroID.acessarMDR();
		valoresParaMetodoPVEXFiltroID.filtro();
		valoresParaMetodoPVEXFiltroID.afterClass();

	}


	@Test(priority = 153)
	public void valoresParaMetodoPVEXExcluir() {

		valoresParaMetodoPVEXExcluir = new ValoresParaMetodoPVEXExcluir();
		valoresParaMetodoPVEXExcluir.beforeClass();
		valoresParaMetodoPVEXExcluir.login();
		valoresParaMetodoPVEXExcluir.acessarMDR();
		valoresParaMetodoPVEXExcluir.excluir();
		valoresParaMetodoPVEXExcluir.afterClass();
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVEX Fim-------------------------");
	}

	// 156
	//// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX

	@Test(priority = 156)
	public void valoresParaMetodoPECEXCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX-------------------------");
		valoresParaMetodoPECEXCriar = new ValoresParaMetodoPECEXCriar();
		valoresParaMetodoPECEXCriar.beforeClass();
		valoresParaMetodoPECEXCriar.login();
		valoresParaMetodoPECEXCriar.acessarMDR();
		valoresParaMetodoPECEXCriar.criar();
		valoresParaMetodoPECEXCriar.afterClass();

	}

	@Test(priority = 157)
	public void valoresParaMetodoPECEXDetalhes() {

		valoresParaMetodoPECEXDetalhes = new ValoresParaMetodoPECEXDetalhes();
		valoresParaMetodoPECEXDetalhes.beforeClass();
		valoresParaMetodoPECEXDetalhes.login();
		valoresParaMetodoPECEXDetalhes.acessarMDR();
		valoresParaMetodoPECEXDetalhes.Detalhes();
		valoresParaMetodoPECEXDetalhes.afterClass();

	}

	@Test(priority = 158)
	public void valoresParaMetodoPECEXEditar() {

		valoresParaMetodoPECEXEditar = new ValoresParaMetodoPECEXEditar();
		valoresParaMetodoPECEXEditar.beforeClass();
		valoresParaMetodoPECEXEditar.login();
		valoresParaMetodoPECEXEditar.acessarMDR();
		valoresParaMetodoPECEXEditar.editar();
		valoresParaMetodoPECEXEditar.afterClass();

	}

	//Preço de Transferência > Valores para Método / Valores para Método PECEX
	@Test(priority = 159)
	public void valoresParaMetodoPECEXFiltroID() {

		valoresParaMetodoPECEXFiltroID = new ValoresParaMetodoPECEXFiltroID();
		valoresParaMetodoPECEXFiltroID.beforeClass();
		valoresParaMetodoPECEXFiltroID.login();
		valoresParaMetodoPECEXFiltroID.acessarMDR();
		valoresParaMetodoPECEXFiltroID.filtro();
		valoresParaMetodoPECEXFiltroID.afterClass();

	}


	@Test(priority = 160)
	public void valoresParaMetodoPECEXExcluir() {

		valoresParaMetodoPECEXExcluir = new ValoresParaMetodoPECEXExcluir();
		valoresParaMetodoPECEXExcluir.beforeClass();
		valoresParaMetodoPECEXExcluir.login();
		valoresParaMetodoPECEXExcluir.acessarMDR();
		valoresParaMetodoPECEXExcluir.excluir();
		valoresParaMetodoPECEXExcluir.afterClass();
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PECEX Fim-------------------------");

	}

	// 163
	// Reinf > Processos Adm/Judiciais

	@Test(priority = 163)
	public void processosAdmJudiciaisCriar() {
		System.out.println("-------------------Reinf > Processos Adm/Judiciais-------------------------");
		processosAdmJudiciaisCriar = new ProcessosAdmJudiciaisCriar();
		processosAdmJudiciaisCriar.beforeClass();
		processosAdmJudiciaisCriar.login();
		processosAdmJudiciaisCriar.acessarMDR();
		processosAdmJudiciaisCriar.criar();
		processosAdmJudiciaisCriar.afterClass();

	}

	@Test(priority = 164)
	public void processosAdmJudiciaisEditar() {

		processosAdmJudiciaisEditar = new ProcessosAdmJudiciaisEditar();
		processosAdmJudiciaisEditar.beforeClass();
		processosAdmJudiciaisEditar.login();
		processosAdmJudiciaisEditar.acessarMDR();
		processosAdmJudiciaisEditar.editar();
		processosAdmJudiciaisEditar.afterClass();

	}

	@Test(priority = 165)
	public void processosAdmJudiciaisDetalhes() {

		processosAdmJudiciaisDetalhes = new ProcessosAdmJudiciaisDetalhes();
		processosAdmJudiciaisDetalhes.beforeClass();
		processosAdmJudiciaisDetalhes.login();
		processosAdmJudiciaisDetalhes.acessarMDR();
		processosAdmJudiciaisDetalhes.detalhes();
		processosAdmJudiciaisDetalhes.afterClass();

	}

	@Test(priority = 165)
	public void processosAdmJudiciaisExcluirEmMasa() {

		processosAdmJudiciaisExcluirEmMasa = new ProcessosAdmJudiciaisExcluirEmMasa();
		processosAdmJudiciaisExcluirEmMasa.beforeClass();
		processosAdmJudiciaisExcluirEmMasa.login();
		processosAdmJudiciaisExcluirEmMasa.acessarMDR();
		processosAdmJudiciaisExcluirEmMasa.excluir();
		processosAdmJudiciaisExcluirEmMasa.afterClass();

	}

	@Test(priority = 167)
	public void processosAdmJudiciaisExcluir() {

		processosAdmJudiciaisExcluir = new ProcessosAdmJudiciaisExcluir();
		processosAdmJudiciaisExcluir.beforeClass();
		processosAdmJudiciaisExcluir.login();
		processosAdmJudiciaisExcluir.acessarMDR();
		processosAdmJudiciaisExcluir.excluir();
		processosAdmJudiciaisExcluir.afterClass();

		System.out.println("-------------------Reinf > Processos Adm/Judiciais Fim-------------------------");

	}
	// 169
	// Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra

	@Test(priority = 169)
	public void determinacaoDeRelevanciaPorRegraCriar() {
		System.out.println(
				"-------------------Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra-------------------------");
		determinacaoDeRelevanciaPorRegraCriar = new DeterminacaoDeRelevanciaPorRegraCriar();
		determinacaoDeRelevanciaPorRegraCriar.beforeClass();
		/*determinacaoDeRelevanciaPorRegraCriar.login();
		determinacaoDeRelevanciaPorRegraCriar.acessarMDR();*/
		determinacaoDeRelevanciaPorRegraCriar.criar();
		determinacaoDeRelevanciaPorRegraCriar.afterClass();

	}

	@Test(priority = 170)
	public void determinacaoDeRelevanciaPorRegraEditar() {
		determinacaoDeRelevanciaPorRegraEditar = new DeterminacaoDeRelevanciaPorRegraEditar();
		determinacaoDeRelevanciaPorRegraEditar.beforeClass();
		/*determinacaoDeRelevanciaPorRegraEditar.login();
		determinacaoDeRelevanciaPorRegraEditar.acessarMDR();*/
		determinacaoDeRelevanciaPorRegraEditar.editar();
		determinacaoDeRelevanciaPorRegraEditar.afterClass();

	}

	@Test(priority = 171)
	public void determinacaoDeRelevanciaPorRegraDetalhes() {
		determinacaoDeRelevanciaPorRegraDetalhes = new DeterminacaoDeRelevanciaPorRegraDetalhes();
		determinacaoDeRelevanciaPorRegraDetalhes.beforeClass();
		/*determinacaoDeRelevanciaPorRegraDetalhes.login();
		determinacaoDeRelevanciaPorRegraDetalhes.acessarMDR();*/
		determinacaoDeRelevanciaPorRegraDetalhes.detalhes();
		determinacaoDeRelevanciaPorRegraDetalhes.afterClass();

	}

	@Test(priority = 172)
	public void determinacaoDeRelevanciaPorRegraVisualizar() {
		determinacaoDeRelevanciaPorRegraVisualizar = new DeterminacaoDeRelevanciaPorRegraVisualizar();
		determinacaoDeRelevanciaPorRegraVisualizar.beforeClass();
		/*determinacaoDeRelevanciaPorRegraVisualizar.login();
		determinacaoDeRelevanciaPorRegraVisualizar.acessarMDR();*/
		determinacaoDeRelevanciaPorRegraVisualizar.Visualizar();
		determinacaoDeRelevanciaPorRegraVisualizar.afterClass();

	}

	@Test(priority = 173)
	public void determinacaoDeRelevanciaPorRegraExcluir() {
		determinacaoDeRelevanciaPorRegraExcluir = new DeterminacaoDeRelevanciaPorRegraExcluir();
		determinacaoDeRelevanciaPorRegraExcluir.beforeClass();
		/*determinacaoDeRelevanciaPorRegraExcluir.login();
		determinacaoDeRelevanciaPorRegraExcluir.acessarMDR();*/
		determinacaoDeRelevanciaPorRegraExcluir.excluir();
		determinacaoDeRelevanciaPorRegraExcluir.afterClass();

	}


	@Test(priority = 174)
	public void determinacaoDeRelevanciaPorRegraExcluirEmMassa() {

		determinacaoDeRelevanciaPorRegraExcluirEmMassa = new DeterminacaoDeRelevanciaPorRegraExcluirEmMassa();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.beforeClass();
		/*determinacaoDeRelevanciaPorRegraExcluirEmMassa.ingresar();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.mdrEntrar();*/
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.excluirEmMassa();
		determinacaoDeRelevanciaPorRegraExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------Determinacao De Relevancia De Tarefa > Determinacao De Relevancia Por Regra Fim-------------------------");

	}

	// 176
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP

	@Test(priority = 176)
	public void valoresParaMetodoCAPCriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP-------------------------");
		valoresParaMetodoCAPCriar = new ValoresParaMetodoCAPCriar();
		valoresParaMetodoCAPCriar.beforeClass();
		valoresParaMetodoCAPCriar.login();
		valoresParaMetodoCAPCriar.acessarMDR();
		valoresParaMetodoCAPCriar.criar();
		valoresParaMetodoCAPCriar.afterClass();

	}

	@Test(priority = 177)
	public void valoresParaMetodoCAPEditar() {
		valoresParaMetodoCAPEditar = new ValoresParaMetodoCAPEditar();
		valoresParaMetodoCAPEditar.beforeClass();
		valoresParaMetodoCAPEditar.login();
		valoresParaMetodoCAPEditar.acessarMDR();
		valoresParaMetodoCAPEditar.editar();
		valoresParaMetodoCAPEditar.afterClass();

	}

	@Test(priority = 178)
	public void valoresParaMetodoCAPDetalhes() {
		valoresParaMetodoCAPDetalhes = new ValoresParaMetodoCAPDetalhes();
		valoresParaMetodoCAPDetalhes.beforeClass();
		valoresParaMetodoCAPDetalhes.login();
		valoresParaMetodoCAPDetalhes.acessarMDR();
		valoresParaMetodoCAPDetalhes.Detalhes();
		valoresParaMetodoCAPDetalhes.afterClass();

	}


	@Test(priority = 179)
	public void valoresParaMetodoCAPFiltroID() {

		valoresParaMetodoCAPFiltroID = new ValoresParaMetodoCAPFiltroID();
		valoresParaMetodoCAPFiltroID.beforeClass();
		valoresParaMetodoCAPFiltroID.login();
		valoresParaMetodoCAPFiltroID.acessarMDR();
		valoresParaMetodoCAPFiltroID.filtro();
		valoresParaMetodoCAPFiltroID.afterClass();
	}

	@Test(priority = 180)
	public void valoresParaMetodoCAPExcluir() {
		valoresParaMetodoCAPExcluir = new ValoresParaMetodoCAPExcluir();
		valoresParaMetodoCAPExcluir.beforeClass();
		valoresParaMetodoCAPExcluir.login();
		valoresParaMetodoCAPExcluir.acessarMDR();
		valoresParaMetodoCAPExcluir.excluir();
		valoresParaMetodoCAPExcluir.afterClass();
	}

	@Test(priority = 181)
	public void valoresParaMetodoCAPExcluirEmMassa() {

		valoresParaMetodoCAPExcluirEmMassa = new ValoresParaMetodoCAPExcluirEmMassa();
		valoresParaMetodoCAPExcluirEmMassa.beforeClass();
		valoresParaMetodoCAPExcluirEmMassa.ingresar();
		valoresParaMetodoCAPExcluirEmMassa.mdrEntrar();
		valoresParaMetodoCAPExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoCAPExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CAP Fim-------------------------");
	}

	// 183
	// Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PVA

	@Test(priority = 183)
	public void valoresParaMetodoPVACriar() {
		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PVA-------------------------");
		valoresParaMetodoPVACriar = new ValoresParaMetodoPVACriar();
		valoresParaMetodoPVACriar.beforeClass();
		valoresParaMetodoPVACriar.login();
		valoresParaMetodoPVACriar.acessarMDR();
		valoresParaMetodoPVACriar.criar();
		valoresParaMetodoPVACriar.afterClass();

	}

	@Test(priority = 184)
	public void valoresParaMetodoPVAEditar() {

		valoresParaMetodoPVAEditar = new ValoresParaMetodoPVAEditar();
		valoresParaMetodoPVAEditar.beforeClass();
		valoresParaMetodoPVAEditar.login();
		valoresParaMetodoPVAEditar.acessarMDR();
		valoresParaMetodoPVAEditar.editar();
		valoresParaMetodoPVAEditar.afterClass();

	}

	@Test(priority = 185)
	public void valoresParaMetodoPVADetalhes() {

		valoresParaMetodoPVADetalhes = new ValoresParaMetodoPVADetalhes();
		valoresParaMetodoPVADetalhes.beforeClass();
		valoresParaMetodoPVADetalhes.login();
		valoresParaMetodoPVADetalhes.acessarMDR();
		valoresParaMetodoPVADetalhes.Detalhes();
		valoresParaMetodoPVADetalhes.afterClass();

	}


	@Test(priority = 186)
	public void valoresParaMetodoPVAFiltroID() {

		valoresParaMetodoPVAFiltroID = new ValoresParaMetodoPVAFiltroID();
		valoresParaMetodoPVAFiltroID.beforeClass();
		valoresParaMetodoPVAFiltroID.login();
		valoresParaMetodoPVAFiltroID.acessarMDR();
		valoresParaMetodoPVAFiltroID.filtro();
		valoresParaMetodoPVAFiltroID.afterClass();

	}


	@Test(priority = 187)
	public void valoresParaMetodoPVAExcluir() {

		valoresParaMetodoPVAExcluir = new ValoresParaMetodoPVAExcluir();
		valoresParaMetodoPVAExcluir.beforeClass();
		valoresParaMetodoPVAExcluir.login();
		valoresParaMetodoPVAExcluir.acessarMDR();
		valoresParaMetodoPVAExcluir.excluir();
		valoresParaMetodoPVAExcluir.afterClass();


	}

	@Test(priority = 188)
	public void valoresParaMetodoPVAExcluirEmMassa() {

		valoresParaMetodoPVAExcluirEmMassa = new ValoresParaMetodoPVAExcluirEmMassa();
		valoresParaMetodoPVAExcluirEmMassa.beforeClass();
		valoresParaMetodoPVAExcluirEmMassa.ingresar();
		valoresParaMetodoPVAExcluirEmMassa.mdrEntrar();
		valoresParaMetodoPVAExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoPVAExcluirEmMassa.afterClass();

		System.out.println(
				"-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PVA Fim-------------------------");

	}
}
