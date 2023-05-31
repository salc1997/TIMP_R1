package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oEditarPO;

public class Associa��oEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Associa��oEditarPO associa��oEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		associa��oEditarPO = new Associa��oEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editarAssocia��o() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		boolean sucesso = associa��oEditarPO.editarAssocia��o();
		assertTrue(sucesso, Editar);
		
		sleep(2000);
	}
}
