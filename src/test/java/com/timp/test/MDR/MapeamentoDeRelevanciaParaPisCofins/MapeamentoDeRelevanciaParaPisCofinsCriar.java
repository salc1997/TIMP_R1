package com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsCriarPO;

public class MapeamentoDeRelevanciaParaPisCofinsCriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoDeRelevanciaParaPisCofinsCriarPO mapeamentoDeRelevanciaParaPisCofinsCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoDeRelevanciaParaPisCofinsCriarPO = new MapeamentoDeRelevanciaParaPisCofinsCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test(priority = 1)
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = mapeamentoDeRelevanciaParaPisCofinsCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
