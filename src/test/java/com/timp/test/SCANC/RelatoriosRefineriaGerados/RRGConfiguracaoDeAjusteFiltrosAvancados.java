package com.timp.test.SCANC.RelatoriosRefineriaGerados;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados.RRFConfiguracaoDeAjusteFiltrosAvancadosPO;

public class RRGConfiguracaoDeAjusteFiltrosAvancados extends TestBaseSteven {
	//TSTNG-1485
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	RRFConfiguracaoDeAjusteFiltrosAvancadosPO rRFConfiguracaoDeAjusteFiltrosAvancadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		rRFConfiguracaoDeAjusteFiltrosAvancadosPO = new RRFConfiguracaoDeAjusteFiltrosAvancadosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void scancEntrar() {
		acessarSCANCPO.acessarSCANC();
	}

	@Test(priority = 2)
	public void filtrosAvancados() {
		ArrayList<Boolean> sucesso = rRFConfiguracaoDeAjusteFiltrosAvancadosPO.filtrosAvancados();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
}
