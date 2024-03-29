package com.timp.test.SCANC.RelatoriosRefineriaGerados;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados.RRGConfiguracaoDeAjusteCriarComDiaEspecificoPO;

public class RRGConfiguracaoDeAjusteCriarComDiaEspecifico extends TestBase {
	//TSTNG-443
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	RRGConfiguracaoDeAjusteCriarComDiaEspecificoPO rRGConfiguracaoDeAjusteCriarComDiaEspecificoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		rRGConfiguracaoDeAjusteCriarComDiaEspecificoPO = new RRGConfiguracaoDeAjusteCriarComDiaEspecificoPO();
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
	public void criarComDiaEspecifico() {
		boolean sucesso = rRGConfiguracaoDeAjusteCriarComDiaEspecificoPO.criarComDiaEspecifico();
		assertTrue(sucesso, Criar);
	}
}
