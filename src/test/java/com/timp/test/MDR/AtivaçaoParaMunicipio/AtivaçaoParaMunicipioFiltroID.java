package com.timp.test.MDR.AtivaçaoParaMunicipio;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioFiltroIDPO;

public class AtivaçaoParaMunicipioFiltroID extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtivaçaoParaMunicipioFiltroIDPO ativaçaoParaMunicipioFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativaçaoParaMunicipioFiltroIDPO = new AtivaçaoParaMunicipioFiltroIDPO();

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
	public void filtro() {

		boolean sucesso = ativaçaoParaMunicipioFiltroIDPO.filtro();

		assertTrue(sucesso, Filtros);


	}
}
