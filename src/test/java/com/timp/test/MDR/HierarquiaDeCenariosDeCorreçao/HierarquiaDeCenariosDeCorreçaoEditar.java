package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoEditarPO;

public class HierarquiaDeCenariosDeCorreçaoEditar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorreçaoEditarPO hierarquiaDeCenariosDeCorreçaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorreçaoEditarPO = new HierarquiaDeCenariosDeCorreçaoEditarPO();
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
	public void editar() {

		boolean sucesso = hierarquiaDeCenariosDeCorreçaoEditarPO.editar();
		assertTrue(sucesso, Editar);
		//assertEquals(sucesso, "edit", visualizaçar);
	}

}
