package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPCriarPO;

public class ValoresParaMetodoCAPCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ValoresParaMetodoCAPCriarPO valoresParaMetodoCAPCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		valoresParaMetodoCAPCriarPO = new ValoresParaMetodoCAPCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = valoresParaMetodoCAPCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}
