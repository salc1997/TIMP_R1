package com.timp.test.MDR.Reinf.ProcessosAdmJudiciais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisEditarPO;

public class ProcessosAdmJudiciaisEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ProcessosAdmJudiciaisEditarPO processosAdmJudiciaisEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		processosAdmJudiciaisEditarPO = new ProcessosAdmJudiciaisEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = processosAdmJudiciaisEditarPO.editar();
		assertTrue(sucesso, Editar);

	}

}
