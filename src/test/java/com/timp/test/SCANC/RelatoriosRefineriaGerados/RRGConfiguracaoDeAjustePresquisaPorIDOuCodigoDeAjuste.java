package com.timp.test.SCANC.RelatoriosRefineriaGerados;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados.RRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO;

public class RRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjuste extends TestBase{
	//TSTNG-428
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	RRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO rRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		rRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO = new RRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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
	public void pesquisar() {
		ArrayList<Boolean> sucesso = rRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO.pesquisar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}
}
