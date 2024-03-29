package com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.*;

public class AtividadeEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeEditarPO atividadeEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeEditarPO = new AtividadeEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = atividadeEditarPO.editar();

		assertTrue(sucesso, Editar);
		
		sleep(2000);
	}

}
