package com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarEditarPO;

public class InclusaoDeCamposMarEditar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InclusaoDeCamposMarEditarPO inclusaoDeCamposMarEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		inclusaoDeCamposMarEditarPO = new InclusaoDeCamposMarEditarPO();
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
<<<<<<< HEAD
		
		
		boolean sucesso =inclusaoDeCamposMarEditarPO.editar();
		
		assertTrue(sucesso, Editar);
=======

		String sucesso = inclusaoDeCamposMarEditarPO.editar();

		assertEquals(sucesso, "edit", visualizaçar);
>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git
	}

}
