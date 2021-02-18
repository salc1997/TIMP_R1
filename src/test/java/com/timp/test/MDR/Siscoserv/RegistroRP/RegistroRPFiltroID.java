package com.timp.test.MDR.Siscoserv.RegistroRP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRP.RegistroRPFiltroIDPO;

public class RegistroRPFiltroID extends TestBaseEliel{
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRPFiltroIDPO registroRPFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRPFiltroIDPO = new RegistroRPFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test(priority = 1)
	public void filtroId() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRPFiltroIDPO.filtro();

		assertTrue(sucesso, Filtros);

	}
	
}
