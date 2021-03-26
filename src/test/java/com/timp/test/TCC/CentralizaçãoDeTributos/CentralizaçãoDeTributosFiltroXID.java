package com.timp.test.TCC.Centraliza��oDeTributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltroXIDPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltrosAvan�adosPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Centraliza��oDeTributosFiltroXID extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Centraliza��oDeTributosFiltroXIDPO centraliza��oDeTributosFiltroXIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centraliza��oDeTributosFiltroXIDPO = new Centraliza��oDeTributosFiltroXIDPO();
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
	public void acessarTCC() {

		acessarTCCPO.acessarTCC();

	}

	@Test(priority = 2)
	public void Filtro() {

		centraliza��oDeTributosFiltroXIDPO.Filtros();

	}
}
