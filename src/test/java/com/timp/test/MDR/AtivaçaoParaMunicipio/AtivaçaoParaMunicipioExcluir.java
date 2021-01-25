package com.timp.test.MDR.AtivaçaoParaMunicipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtivaçaoParaMunicipioExcluir extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtivaçaoParaMunicipioExcluirPO ativaçaoParaMunicipioExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativaçaoParaMunicipioExcluirPO = new AtivaçaoParaMunicipioExcluirPO();
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
	public void excluir() {
		boolean sucesso = ativaçaoParaMunicipioExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}

}
