package com.timp.test.MDR.Centralizacao.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosCriarPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TributosEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TributosEditarPO tributoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tributoEditarPO = new TributosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		
		boolean sucesso = tributoEditarPO.tributosEditar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}

}
