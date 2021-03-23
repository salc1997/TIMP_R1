package com.timp.test.TCC.CentralizaçãoDeTributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltroXIDPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltrosAvançadosPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CentralizaçãoDeTributosFiltroXID extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	CentralizaçãoDeTributosFiltroXIDPO centralizaçãoDeTributosFiltroXIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centralizaçãoDeTributosFiltroXIDPO = new CentralizaçãoDeTributosFiltroXIDPO();
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

		centralizaçãoDeTributosFiltroXIDPO.Filtros();

	}
}
