package com.timp.test.MDR.TabelasApoioSped.CodigoContribuišaoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuišaoSocialApurada.CodigoContribuišaoSocialApuradaEditarPO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class CodigoContribuišaoSocialApuradaEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribuišaoSocialApuradaEditarPO codigoContribuišaoSocialApuradaEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContribuišaoSocialApuradaEditarPO = new CodigoContribuišaoSocialApuradaEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoContribuišaoSocialApuradaEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
