package com.timp.test.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos.RegraDeCamposExcluirPO;

public class RegraDeCamposExcluir extends TestBase {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegraDeCamposExcluirPO regraDeCamposExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regraDeCamposExcluirPO = new RegraDeCamposExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regraDeCamposExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
