package com.timp.test.BSC;



import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.FiltroPorIDRegistroPO;


public class FiltroPorIDRegistroCriar extends TestBase {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FiltroPorIDRegistroPO filtroPorIDRegistroPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		filtroPorIDRegistroPO = new FiltroPorIDRegistroPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarBrbPO.acessar();

		ArrayList<Boolean> sucesso = filtroPorIDRegistroPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
}
