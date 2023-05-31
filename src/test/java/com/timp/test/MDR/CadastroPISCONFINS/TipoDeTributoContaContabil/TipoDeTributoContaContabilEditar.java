package com.timp.test.MDR.CadastroPISCONFINS.TipoDeTributoContaContabil;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabilEditarPO;

public class TipoDeTributoContaContabilEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TipoDeTributoContaContabilEditarPO tipoDeTributoContaContabilEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tipoDeTributoContaContabilEditarPO = new TipoDeTributoContaContabilEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = tipoDeTributoContaContabilEditarPO.editar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
	}

}
