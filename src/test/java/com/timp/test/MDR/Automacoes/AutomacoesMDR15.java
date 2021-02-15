package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCICriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIExcluirEmMassa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICExcluirEmMasa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICFiltroID;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLCriar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLDetalhes;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLEditar;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLExcluir;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLExcluirEmMasa;
import com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLFiltroID;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoCriar;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoEditar;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoExcluir;
import com.timp.test.MDR.Siscoserv.Enquadramento.EnquadramentoVisualizar;
import com.timp.test.MDR.Siscoserv.NBS.NBSCriar;
import com.timp.test.MDR.Siscoserv.NBS.NBSDetalhes;
import com.timp.test.MDR.Siscoserv.NBS.NBSEditar;
import com.timp.test.MDR.Siscoserv.NBS.NBSExcluir;
import com.timp.test.MDR.Siscoserv.NBS.NBSExcluirMassa;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaCriar;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaDetalhes;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaEditar;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaExcluir;
import com.timp.test.MDR.Siscoserv.PaisMoeda.PaisMoedaVisualizar;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASCriar;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASEditar;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASFiltroID;
import com.timp.test.MDR.Siscoserv.RegistroRAS.RegistroRASVisualizar;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPCriar;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPEditar;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRP.RegistroRPFiltroID;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSCriar;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSDetalhes;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSEditar;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSExcluir;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSFiltroID;
import com.timp.test.MDR.Siscoserv.RegistroRVS.RegistroRVSVisualizar;

public class AutomacoesMDR15 extends TestBaseSteven{
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CPL
	ValoresParaMetodoCPLCriar valoresParaMetodoCPLCriar;
	ValoresParaMetodoCPLEditar valoresParaMetodoCPLEditar;
	ValoresParaMetodoCPLDetalhes valoresParaMetodoCPLDetalhes;
	ValoresParaMetodoCPLExcluir valoresParaMetodoCPLExcluir;
	ValoresParaMetodoCPLFiltroID valoresParaMetodoCPLFiltroID;
	ValoresParaMetodoCPLExcluirEmMassa valoresParaMetodoCPLExcluirEmMassa;

	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo PCI
	ValoresParaMetodoPCICriar valoresParaMetodoPCICriar;
	ValoresParaMetodoPCIEditar valoresParaMetodoPCIEditar;
	ValoresParaMetodoPCIDetalhes valoresParaMetodoPCIDetalhes;
	ValoresParaMetodoPCIExcluir valoresParaMetodoPCIExcluir;
	ValoresParaMetodoPCIFiltroID valoresParaMetodoPCIFiltroID;
	ValoresParaMetodoPCIExcluirEmMassa valoresParaMetodoPCIExcluirEmMassa;

	//Preco De Transferencia > Valores Para Metodo de Importaçao >Valores Para Metodo PIC
	ValoresParaMetodoPICCriar valoresParaMetodoPICCriar;
	ValoresParaMetodoPICDetalhes valoresParaMetodoPICDetalhes;
	ValoresParaMetodoPICEditar valoresParaMetodoPICEditar;
	ValoresParaMetodoPICExcluir valoresParaMetodoPICExcluir;
	ValoresParaMetodoPICExcluirEmMasa valoresParaMetodoPICExcluirEmMasa;	
	ValoresParaMetodoPICFiltroID valoresParaMetodoPICFiltroID;

	//Preco De Transferencia > Valores Para Metodo de Importaçao >Valores Para Metodo PRL
	ValoresParaMetodoPRLCriar valoresParaMetodoPRLCriar;
	ValoresParaMetodoPRLEditar valoresParaMetodoPRLEditar;
	ValoresParaMetodoPRLDetalhes valoresParaMetodoPRLDetalhes;
	ValoresParaMetodoPRLExcluir valoresParaMetodoPRLExcluir;
	ValoresParaMetodoPRLFiltroID valoresParaMetodoPRLFiltroID;
	ValoresParaMetodoPRLExcluirEmMasa valoresParaMetodoPRLExcluirEmMasa;

	//Siscoserv > Pais/Moeda
	PaisMoedaCriar paisMoedaCriar;
	PaisMoedaEditar paisMoedaEditar;
	PaisMoedaDetalhes paisMoedaDetalhes;
	PaisMoedaVisualizar paisMoedaVisualizar;
	PaisMoedaExcluir paisMoedaExcluir;

	//Siscoserv > NBS
	NBSCriar nbsCriar;
	NBSEditar nbsEditar;
	NBSDetalhes nbsDetalhes;
	NBSExcluir nbsExcluir;
	NBSExcluirMassa nBSExcluirMassa;

	//Siscoserv > Enquadramento
	EnquadramentoCriar enquadramentoCriar;
	EnquadramentoEditar enquadramentoEditar;
	EnquadramentoVisualizar enquadramentoVisualizar;
	EnquadramentoExcluir enquadramentoExcluir;

	//Siscoserv > Registro RAS
	RegistroRASCriar registroRASCriar;
	RegistroRASEditar registroRASEditar;
	RegistroRASDetalhes registroRASDetalhes;
	RegistroRASVisualizar registroRASVisualizar;
	RegistroRASFiltroID registroRASFiltroID;
	RegistroRASExcluir registroRASExcluir;

	//Siscoserv > Registro RP
	RegistroRPCriar registroRPCriar;
	RegistroRPDetalhes registroRPDetalhes;
	RegistroRPEditar registroRPEditar;
	RegistroRPFiltroID registroRPFiltroID;
	RegistroRPExcluir registroRPExcluir;

	// Siscoserv > Registro RVS
	RegistroRVSCriar registroRVSCriar;
	RegistroRVSDetalhes registroRVSDetalhes;
	RegistroRVSEditar registroRVSEditar;
	RegistroRVSExcluir registroRVSExcluir;
	RegistroRVSFiltroID registroRVSFiltroID;
	RegistroRVSVisualizar registroRVSVisualizar;
	
	// 190
	//Preco De Transferencia > Valores Para Metodo >Valores Para Metodo CPL

	@Test(priority = 190)
	public void valoresParaMetodoCPLCriar() {
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo CPL-------------------------");
		valoresParaMetodoCPLCriar = new ValoresParaMetodoCPLCriar();
		valoresParaMetodoCPLCriar.beforeClass();
		valoresParaMetodoCPLCriar.login();
		valoresParaMetodoCPLCriar.acessarMDR();
		valoresParaMetodoCPLCriar.criar();
		valoresParaMetodoCPLCriar.afterClass();


	}

	@Test(priority = 191)
	public void valoresParaMetodoCPLEditar() {
		valoresParaMetodoCPLEditar = new ValoresParaMetodoCPLEditar();
		valoresParaMetodoCPLEditar.beforeClass();
		valoresParaMetodoCPLEditar.login();
		valoresParaMetodoCPLEditar.acessarMDR();
		valoresParaMetodoCPLEditar.editar();
		valoresParaMetodoCPLEditar.afterClass();

	}

	@Test(priority = 192)
	public void valoresParaMetodoCPLDetalhes() {
		valoresParaMetodoCPLDetalhes = new ValoresParaMetodoCPLDetalhes();
		valoresParaMetodoCPLDetalhes.beforeClass();
		valoresParaMetodoCPLDetalhes.login();
		valoresParaMetodoCPLDetalhes.acessarMDR();
		valoresParaMetodoCPLDetalhes.Detalhes();
		valoresParaMetodoCPLDetalhes.afterClass();

	}


	@Test(priority = 193)
	public void valoresParaMetodoCPLFiltroID() {

		valoresParaMetodoCPLFiltroID = new ValoresParaMetodoCPLFiltroID();
		valoresParaMetodoCPLFiltroID.beforeClass();
		valoresParaMetodoCPLFiltroID.login();
		valoresParaMetodoCPLFiltroID.acessarMDR();
		valoresParaMetodoCPLFiltroID.filtro();
		valoresParaMetodoCPLFiltroID.afterClass();

	}


	@Test(priority = 194)
	public void valoresParaMetodoCPLExcluir() {
		valoresParaMetodoCPLExcluir = new ValoresParaMetodoCPLExcluir();
		valoresParaMetodoCPLExcluir.beforeClass();
		valoresParaMetodoCPLExcluir.login();
		valoresParaMetodoCPLExcluir.acessarMDR();
		valoresParaMetodoCPLExcluir.excluir();
		valoresParaMetodoCPLExcluir.afterClass();

	}

	@Test(priority = 195)
	public void valoresParaMetodoCPLExcluirEmMassa() {

		valoresParaMetodoCPLExcluirEmMassa = new ValoresParaMetodoCPLExcluirEmMassa();
		valoresParaMetodoCPLExcluirEmMassa.beforeClass();
		valoresParaMetodoCPLExcluirEmMassa.ingresar();
		valoresParaMetodoCPLExcluirEmMassa.mdrEntrar();
		valoresParaMetodoCPLExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoCPLExcluirEmMassa.afterClass();

		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo CPL Fim-------------------------");

	}


	//197
	//Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PCI	

	@Test(priority = 197)
	public void valoresParaMetodoPCICriar() {
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PCI-------------------------");
		valoresParaMetodoPCICriar = new ValoresParaMetodoPCICriar();
		valoresParaMetodoPCICriar.beforeClass();
		valoresParaMetodoPCICriar.login();
		valoresParaMetodoPCICriar.acessarMDR();
		valoresParaMetodoPCICriar.criar();
		valoresParaMetodoPCICriar.afterClass();

	}

	@Test(priority = 198)
	public void valoresParaMetodoPCIEditar() {
		valoresParaMetodoPCIEditar = new ValoresParaMetodoPCIEditar();
		valoresParaMetodoPCIEditar.beforeClass();
		valoresParaMetodoPCIEditar.login();
		valoresParaMetodoPCIEditar.acessarMDR();
		valoresParaMetodoPCIEditar.editar();
		valoresParaMetodoPCIEditar.afterClass();

	}

	@Test(priority = 199)
	public void valoresParaMetodoPCIDetalhes() {
		valoresParaMetodoPCIDetalhes = new ValoresParaMetodoPCIDetalhes();
		valoresParaMetodoPCIDetalhes.beforeClass();
		valoresParaMetodoPCIDetalhes.login();
		valoresParaMetodoPCIDetalhes.acessarMDR();
		valoresParaMetodoPCIDetalhes.Detalhes();
		valoresParaMetodoPCIDetalhes.afterClass();

	}


	@Test(priority = 200)
	public void valoresParaMetodoPCIFiltroID() {

		valoresParaMetodoPCIFiltroID = new ValoresParaMetodoPCIFiltroID();
		valoresParaMetodoPCIFiltroID.beforeClass();
		valoresParaMetodoPCIFiltroID.login();
		valoresParaMetodoPCIFiltroID.acessarMDR();
		valoresParaMetodoPCIFiltroID.filtro();
		valoresParaMetodoPCIFiltroID.afterClass();

	}


	@Test(priority = 201)
	public void valoresParaMetodoPCIExcluir() {
		valoresParaMetodoPCIExcluir = new ValoresParaMetodoPCIExcluir();
		valoresParaMetodoPCIExcluir.beforeClass();
		valoresParaMetodoPCIExcluir.login();
		valoresParaMetodoPCIExcluir.acessarMDR();
		valoresParaMetodoPCIExcluir.excluir();
		valoresParaMetodoPCIExcluir.afterClass();


	}


	@Test(priority = 202)
	public void valoresParaMetodoPCIExcluirEmMassa() {

		valoresParaMetodoPCIExcluirEmMassa = new ValoresParaMetodoPCIExcluirEmMassa();
		valoresParaMetodoPCIExcluirEmMassa.beforeClass();
		valoresParaMetodoPCIExcluirEmMassa.ingresar();
		valoresParaMetodoPCIExcluirEmMassa.mdrEntrar();
		valoresParaMetodoPCIExcluirEmMassa.excluirEmMassa();
		valoresParaMetodoPCIExcluirEmMassa.afterClass();

		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo > Valores Para Metodo PCI Fim-------------------------");


	}

	//204
	//Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PIC

	@Test(priority = 204)
	public void valoresParaMetodoPICCriar() {
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PIC-------------------------");
		valoresParaMetodoPICCriar = new ValoresParaMetodoPICCriar();
		valoresParaMetodoPICCriar.beforeClass();
		valoresParaMetodoPICCriar.login();
		valoresParaMetodoPICCriar.acessarMDR();
		valoresParaMetodoPICCriar.criar();
		valoresParaMetodoPICCriar.afterClass();

	}

	@Test(priority = 205)
	public void valoresParaMetodoPICEditar() {

		valoresParaMetodoPICEditar = new ValoresParaMetodoPICEditar();
		valoresParaMetodoPICEditar.beforeClass();
		valoresParaMetodoPICEditar.login();
		valoresParaMetodoPICEditar.acessarMDR();
		valoresParaMetodoPICEditar.editar();
		valoresParaMetodoPICEditar.afterClass();

	}

	@Test(priority = 206)
	public void valoresParaMetodoPICDetalhes() {

		valoresParaMetodoPICDetalhes = new ValoresParaMetodoPICDetalhes();
		valoresParaMetodoPICDetalhes.beforeClass();
		valoresParaMetodoPICDetalhes.login();
		valoresParaMetodoPICDetalhes.acessarMDR();
		valoresParaMetodoPICDetalhes.Detalhes();
		valoresParaMetodoPICDetalhes.afterClass();

	}

	@Test(priority = 207)
	public void valoresParaMetodoPICExcluir() {

		valoresParaMetodoPICExcluir = new ValoresParaMetodoPICExcluir();
		valoresParaMetodoPICExcluir.beforeClass();
		valoresParaMetodoPICExcluir.login();
		valoresParaMetodoPICExcluir.acessarMDR();
		valoresParaMetodoPICExcluir.excluir();
		valoresParaMetodoPICExcluir.afterClass();

	}

	@Test(priority = 208)
	public void valoresParaMetodoPICFiltroID() {

		valoresParaMetodoPICFiltroID = new ValoresParaMetodoPICFiltroID();
		valoresParaMetodoPICFiltroID.beforeClass();
		valoresParaMetodoPICFiltroID.login();
		valoresParaMetodoPICFiltroID.acessarMDR();
		valoresParaMetodoPICFiltroID.filtro();
		valoresParaMetodoPICFiltroID.afterClass();

	}

	@Test(priority = 209)
	public void valoresParaMetodoPICExcluirEmMasa() {

		valoresParaMetodoPICExcluirEmMasa = new ValoresParaMetodoPICExcluirEmMasa();
		valoresParaMetodoPICExcluirEmMasa.beforeClass();
		valoresParaMetodoPICExcluirEmMasa.ingresar();
		valoresParaMetodoPICExcluirEmMasa.mdrEntrar();
		valoresParaMetodoPICExcluirEmMasa.excluirEnMasaCompatibilidadeEntreFPAS();
		valoresParaMetodoPICExcluirEmMasa.afterClass();
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PIC Fim-------------------------");


	}



	//211
	//Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PRL
	@Test(priority = 211)
	public void valoresParaMetodoPRLCriar() {
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PRL-------------------------");
		valoresParaMetodoPRLCriar = new ValoresParaMetodoPRLCriar();
		valoresParaMetodoPRLCriar.beforeClass();
		valoresParaMetodoPRLCriar.login();
		valoresParaMetodoPRLCriar.acessarMDR();
		valoresParaMetodoPRLCriar.criar();
		valoresParaMetodoPRLCriar.afterClass();

	}

	@Test(priority = 212)
	public void valoresParaMetodoPRLEditar() {
		valoresParaMetodoPRLEditar = new ValoresParaMetodoPRLEditar();
		valoresParaMetodoPRLEditar.beforeClass();
		valoresParaMetodoPRLEditar.login();
		valoresParaMetodoPRLEditar.acessarMDR();
		valoresParaMetodoPRLEditar.editar();
		valoresParaMetodoPRLEditar.afterClass();

	}

	@Test(priority = 213)
	public void valoresParaMetodoPRLDetalhes() {
		valoresParaMetodoPRLDetalhes = new ValoresParaMetodoPRLDetalhes();
		valoresParaMetodoPRLDetalhes.beforeClass();
		valoresParaMetodoPRLDetalhes.login();
		valoresParaMetodoPRLDetalhes.acessarMDR();
		valoresParaMetodoPRLDetalhes.Detalhes();
		valoresParaMetodoPRLDetalhes.afterClass();

	}

	@Test(priority = 214)
	public void valoresParaMetodoPRLFiltroID() {
		valoresParaMetodoPRLFiltroID = new ValoresParaMetodoPRLFiltroID();
		valoresParaMetodoPRLFiltroID.beforeClass();
		valoresParaMetodoPRLFiltroID.login();
		valoresParaMetodoPRLFiltroID.acessarMDR();
		valoresParaMetodoPRLFiltroID.filtro();
		valoresParaMetodoPRLFiltroID.afterClass();

	}

	@Test(priority = 215)
	public void valoresParaMetodoPRLExcluir() {
		valoresParaMetodoPRLExcluir = new ValoresParaMetodoPRLExcluir();
		valoresParaMetodoPRLExcluir.beforeClass();
		valoresParaMetodoPRLExcluir.login();
		valoresParaMetodoPRLExcluir.acessarMDR();
		valoresParaMetodoPRLExcluir.excluir();
		valoresParaMetodoPRLExcluir.afterClass();
		System.out.println("-------------------Preco De Transferencia > Valores Para Metodo de importaçao > Valores Para Metodo PRL Fim-------------------------");

	}

	@Test(priority = 216)
	public void valoresParaMetodoPRLExcluirEmMasa() {
		System.out.println(
				"-------------------Preço de Transferência > Valores para Método / Valores para Método CAP-------------------------");
		valoresParaMetodoPRLExcluirEmMasa = new ValoresParaMetodoPRLExcluirEmMasa();
		valoresParaMetodoPRLExcluirEmMasa.beforeClass();
		valoresParaMetodoPRLExcluirEmMasa.ingresar();
		valoresParaMetodoPRLExcluirEmMasa.mdrEntrar();
		valoresParaMetodoPRLExcluirEmMasa.excluirEnMasaCompatibilidadeEntreFPAS();
		valoresParaMetodoPRLExcluirEmMasa.afterClass();
	}

	//218
	//Siscoserv > Pais/Moeda
	@Test(priority = 218)
	public void paisMoedaCriar() {
		System.out.println("-------------------Siscoserv > Pais/Moeda-------------------------");
		paisMoedaCriar = new PaisMoedaCriar();
		paisMoedaCriar.beforeClass();
		paisMoedaCriar.login();
		paisMoedaCriar.acessarMDR();
		paisMoedaCriar.criar();
		paisMoedaCriar.afterClass();

	}

	@Test(priority = 219)
	public void paisMoedaEditar() {
		paisMoedaEditar = new PaisMoedaEditar();
		paisMoedaEditar.beforeClass();
		paisMoedaEditar.login();
		paisMoedaEditar.acessarMDR();
		paisMoedaEditar.editar();
		paisMoedaEditar.afterClass();

	}

	@Test(priority = 220)
	public void paisMoedaDetalhes() {
		paisMoedaDetalhes = new PaisMoedaDetalhes();
		paisMoedaDetalhes.beforeClass();
		paisMoedaDetalhes.login();
		paisMoedaDetalhes.acessarMDR();
		paisMoedaDetalhes.detalhes();
		paisMoedaDetalhes.afterClass();

	}

	@Test(priority = 221)
	public void paisMoedaVisualizar() {
		paisMoedaVisualizar = new PaisMoedaVisualizar();
		paisMoedaVisualizar.beforeClass();
		paisMoedaVisualizar.login();
		paisMoedaVisualizar.acessarMDR();
		paisMoedaVisualizar.Visualizar();
		paisMoedaVisualizar.afterClass();

	}

	@Test(priority = 222)
	public void paisMoedaExcluir() {
		paisMoedaExcluir = new PaisMoedaExcluir();
		paisMoedaExcluir.beforeClass();
		paisMoedaExcluir.login();
		paisMoedaExcluir.acessarMDR();
		paisMoedaExcluir.excluir();
		paisMoedaExcluir.afterClass();
		System.out.println("-------------------Siscoserv > Pais/Moeda Fim-------------------------");

	}

	//224
	////Siscoserv > NBS

	@Test(priority = 224)
	public void nbsCriar() {
		System.out.println("-------------------Siscoserv > NBS-------------------------");
		nbsCriar = new NBSCriar();
		nbsCriar.beforeClass();
		nbsCriar.login();
		nbsCriar.acessarMDR();
		nbsCriar.criar();
		nbsCriar.afterClass();

	}

	@Test(priority = 225)
	public void nbsEditar() {
		nbsEditar = new NBSEditar();
		nbsEditar.beforeClass();
		nbsEditar.login();
		nbsEditar.acessarMDR();
		nbsEditar.editar();
		nbsEditar.afterClass();

	}

	@Test(priority = 226)
	public void nbsDetalhes() {
		nbsDetalhes = new NBSDetalhes();
		nbsDetalhes.beforeClass();
		nbsDetalhes.login();
		nbsDetalhes.acessarMDR();
		nbsDetalhes.detalhes();
		nbsDetalhes.afterClass();

	}

	@Test(priority = 227)
	public void nbsExcluir() {
		nbsExcluir = new NBSExcluir();
		nbsExcluir.beforeClass();
		nbsExcluir.login();
		nbsExcluir.acessarMDR();
		nbsExcluir.excluir();
		nbsExcluir.afterClass();		
	}

	@Test(priority = 228)
	public void nbsExcluirMassa() {
		nBSExcluirMassa = new NBSExcluirMassa();
		nBSExcluirMassa.beforeClass();
		nBSExcluirMassa.login();
		nBSExcluirMassa.acessarMDR();
		nBSExcluirMassa.criar();
		nBSExcluirMassa.excluirMassa();
		nBSExcluirMassa.afterClass();
		System.out.println("-------------------Siscoserv > NBS FIM-------------------------");			
	}

	//231
	//Siscoserv > Enquadramento

	@Test(priority = 231)
	public void enquadramentoCriar() {
		System.out.println("-------------------Siscoserv > Enquadramento-------------------------");
		enquadramentoCriar = new EnquadramentoCriar();
		enquadramentoCriar.beforeClass();
		enquadramentoCriar.login();
		enquadramentoCriar.acessarMDR();
		enquadramentoCriar.criar();
		enquadramentoCriar.afterClass();

	}

	@Test(priority = 232)
	public void enquadramentoEditar() {
		enquadramentoEditar = new EnquadramentoEditar();
		enquadramentoEditar.beforeClass();
		enquadramentoEditar.login();
		enquadramentoEditar.acessarMDR();
		enquadramentoEditar.editar();
		enquadramentoEditar.afterClass();

	}

	@Test(priority = 233)
	public void enquadramentoVisualizar() {
		enquadramentoVisualizar = new EnquadramentoVisualizar();
		enquadramentoVisualizar.beforeClass();
		enquadramentoVisualizar.login();
		enquadramentoVisualizar.acessarMDR();
		enquadramentoVisualizar.Visualizar();
		enquadramentoVisualizar.afterClass();

	}


	@Test(priority = 234)
	public void enquadramentoExcluir() {
		enquadramentoExcluir = new EnquadramentoExcluir();
		enquadramentoExcluir.beforeClass();
		enquadramentoExcluir.login();
		enquadramentoExcluir.acessarMDR();
		enquadramentoExcluir.excluir();
		enquadramentoExcluir.afterClass();
		System.out.println("-------------------Siscoserv > Enquadramento Fim-------------------------");

	}

	//237
	@Test(priority = 237)
	public void registroRASCriar() {
		System.out.println("-------------------Siscoserv > Registro RAS-------------------------");
		registroRASCriar = new RegistroRASCriar();
		registroRASCriar.beforeClass();
		registroRASCriar.login();
		registroRASCriar.acessarMDR();
		registroRASCriar.criar();
		registroRASCriar.afterClass();

	}

	@Test(priority = 238)
	public void registroRASEditar() {
		registroRASEditar = new RegistroRASEditar();
		registroRASEditar.beforeClass();
		registroRASEditar.login();
		registroRASEditar.acessarMDR();
		registroRASEditar.editar();
		registroRASEditar.afterClass();

	}

	@Test(priority = 239)
	public void registroRASDetalhes() {
		registroRASDetalhes = new RegistroRASDetalhes();
		registroRASDetalhes.beforeClass();
		registroRASDetalhes.login();
		registroRASDetalhes.acessarMDR();
		registroRASDetalhes.detalhes();
		registroRASDetalhes.afterClass();

	}

	@Test(priority = 240)
	public void registroRASFiltroID() {
		registroRASFiltroID = new RegistroRASFiltroID();
		registroRASFiltroID.beforeClass();
		registroRASFiltroID.login();
		registroRASFiltroID.acessarMDR();
		registroRASFiltroID.filtroId();
		registroRASFiltroID.afterClass();

	}

	@Test(priority = 241)
	public void registroRASVisualizar() {
		registroRASVisualizar = new RegistroRASVisualizar();
		registroRASVisualizar.beforeClass();
		registroRASVisualizar.login();
		registroRASVisualizar.acessarMDR();
		registroRASVisualizar.Visualizar();
		registroRASVisualizar.afterClass();

	}

	@Test(priority = 242)
	public void registroRASExcluir() {
		registroRASExcluir = new RegistroRASExcluir();
		registroRASExcluir.beforeClass();
		registroRASExcluir.login();
		registroRASExcluir.acessarMDR();
		registroRASExcluir.excluir();
		registroRASExcluir.afterClass();
		System.out.println("-------------------Siscoserv > Registro RAS FIM-------------------------");


	}

	//244
	//Siscoserv > Registro RP
	@Test(priority = 244)
	public void registroRPCriar() {
		System.out.println("-------------------Siscoserv > Registro RP-------------------------");
		registroRPCriar = new RegistroRPCriar();
		registroRPCriar.beforeClass();
		registroRPCriar.login();
		registroRPCriar.acessarMDR();
		registroRPCriar.criar();
		registroRPCriar.afterClass();

	}

	@Test(priority = 245)
	public void registroRPEditar() {
		registroRPEditar = new RegistroRPEditar();
		registroRPEditar.beforeClass();
		registroRPEditar.login();
		registroRPEditar.acessarMDR();
		registroRPEditar.editar();
		registroRPEditar.afterClass();

	}

	@Test(priority = 246)
	public void registroRPDetalhes() {
		registroRPDetalhes = new RegistroRPDetalhes();
		registroRPDetalhes.beforeClass();
		registroRPDetalhes.login();
		registroRPDetalhes.acessarMDR();
		registroRPDetalhes.detalhes();
		registroRPDetalhes.afterClass();

	}

	@Test(priority = 247)
	public void registroRPFiltroID() {
		registroRPFiltroID = new RegistroRPFiltroID();
		registroRPFiltroID.beforeClass();
		registroRPFiltroID.login();
		registroRPFiltroID.acessarMDR();
		registroRPFiltroID.filtroId();
		registroRPFiltroID.afterClass();

	}

	@Test(priority = 248)
	public void registroRPExcluir() {
		registroRPExcluir = new RegistroRPExcluir();
		registroRPExcluir.beforeClass();
		registroRPExcluir.login();
		registroRPExcluir.acessarMDR();
		registroRPExcluir.excluir();
		registroRPExcluir.afterClass();
		System.out.println("-------------------Siscoserv > Registro RP Fim-------------------------");


	}

	//251
	//Siscoserv > Registro RVS
	@Test(priority = 251)
	public void registroRVSCriar() {
		System.out.println("-------------------Siscoserv > Registro RVS-------------------------");
		registroRVSCriar = new RegistroRVSCriar();
		registroRVSCriar.beforeClass();
		registroRVSCriar.login();
		registroRVSCriar.acessarMDR();
		registroRVSCriar.criar();
		registroRVSCriar.afterClass();

	}

	@Test(priority = 252)
	public void registroRVSDetalhes() {

		registroRVSDetalhes = new RegistroRVSDetalhes();
		registroRVSDetalhes.beforeClass();
		registroRVSDetalhes.login();
		registroRVSDetalhes.acessarMDR();
		registroRVSDetalhes.detalhes();
		registroRVSDetalhes.afterClass();

	}

	@Test(priority = 253)
	public void registroRVSEditar() {

		registroRVSEditar = new RegistroRVSEditar();
		registroRVSEditar.beforeClass();
		registroRVSEditar.login();
		registroRVSEditar.acessarMDR();
		registroRVSEditar.editar();
		registroRVSEditar.afterClass();

	}

	@Test(priority = 254)
	public void registroRVSVisualizar() {

		registroRVSVisualizar = new RegistroRVSVisualizar();
		registroRVSVisualizar.beforeClass();
		registroRVSVisualizar.login();
		registroRVSVisualizar.acessarMDR();
		registroRVSVisualizar.Visualizar();
		registroRVSVisualizar.afterClass();

	}

	@Test(priority = 255)
	public void registroRVSFiltroID() {

		registroRVSFiltroID = new RegistroRVSFiltroID();
		registroRVSFiltroID.beforeClass();
		registroRVSFiltroID.login();
		registroRVSFiltroID.acessarMDR();
		registroRVSFiltroID.filtroId();
		registroRVSFiltroID.afterClass();

	}

	@Test(priority = 256)
	public void registroRVSExcluir() {

		registroRVSExcluir = new RegistroRVSExcluir();
		registroRVSExcluir.beforeClass();
		registroRVSExcluir.login();
		registroRVSExcluir.acessarMDR();
		registroRVSExcluir.excluir();
		registroRVSExcluir.afterClass();

		System.out.println("-------------------Siscoserv > Registro RVS Fim-------------------------");


	}
}
