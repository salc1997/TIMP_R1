package com.timp.test.MDR.AtivašaoParaMunicipio;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtivašaoParaMunicipio.AtivašaoParaMunicipioFiltroIDPO;

public class AtivašaoParaMunicipioFiltroID extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtivašaoParaMunicipioFiltroIDPO ativašaoParaMunicipioFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativašaoParaMunicipioFiltroIDPO = new AtivašaoParaMunicipioFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = ativašaoParaMunicipioFiltroIDPO.filtro();

		assertTrue(sucesso, Filtros);
		sleep(2000);

	}
}
