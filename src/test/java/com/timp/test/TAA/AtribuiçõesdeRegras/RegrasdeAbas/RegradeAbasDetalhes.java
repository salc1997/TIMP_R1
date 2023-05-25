package com.timp.test.TAA.AtribuiçõesdeRegras.RegrasdeAbas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeAbas.RegradeAbasDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegradeAbasDetalhes extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegradeAbasDetalhesPO regradeAbasDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasDetalhesPO = new RegradeAbasDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void Detalle() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		ArrayList<Boolean> sucesso = regradeAbasDetalhesPO.Detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}

}
