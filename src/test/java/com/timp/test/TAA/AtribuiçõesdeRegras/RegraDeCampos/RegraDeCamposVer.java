package com.timp.test.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos.RegraDeCamposVerPO;


public class RegraDeCamposVer extends TestBase {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegraDeCamposVerPO regraDeCamposVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regraDeCamposVerPO = new RegraDeCamposVerPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void ver() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		ArrayList<Boolean> sucesso = regraDeCamposVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
}
