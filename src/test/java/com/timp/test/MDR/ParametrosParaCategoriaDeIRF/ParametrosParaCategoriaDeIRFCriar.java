package com.timp.test.MDR.ParametrosParaCategoriaDeIRF;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
<<<<<<< HEAD
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosCriarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;

public class ParametrosParaCategoriaDeIRFCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaCategoriaDeIRFCriarPO parametrosParaCategoriaDeIRFCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaCategoriaDeIRFCriarPO = new ParametrosParaCategoriaDeIRFCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = parametrosParaCategoriaDeIRFCriarPO.criar();
		assertTrue(sucesso, Criar);
=======
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosCriarPO;
//import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;

public class ParametrosParaCategoriaDeIRFCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	//ParametrosParaCategoriaDeIRFCriarPO parametrosParaCategoriaDeIRFCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
	//	parametrosParaCategoriaDeIRFCriarPO = new ParametrosParaCategoriaDeIRFCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		//boolean sucesso = parametrosParaCategoriaDeIRFCriarPO.criar();
		//assertTrue(sucesso, Criar);
>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git

	}

}
