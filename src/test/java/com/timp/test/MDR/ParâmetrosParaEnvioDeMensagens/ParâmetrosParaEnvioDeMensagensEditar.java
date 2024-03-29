package com.timp.test.MDR.ParāmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParāmetrosParaEnvioDeMensagens.ParāmetrosParaEnvioDeMensagensEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParāmetrosParaEnvioDeMensagensEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParāmetrosParaEnvioDeMensagensEditarPO parāmetrosParaEnvioDeMensagensEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parāmetrosParaEnvioDeMensagensEditarPO = new ParāmetrosParaEnvioDeMensagensEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void editar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = parāmetrosParaEnvioDeMensagensEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
