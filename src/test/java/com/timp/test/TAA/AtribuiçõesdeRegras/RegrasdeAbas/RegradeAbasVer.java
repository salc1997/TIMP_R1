package com.timp.test.TAA.AtribuiçõesdeRegras.RegrasdeAbas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoVerPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeAbas.RegradeAbasVerPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegradeAbasVer extends TestBase {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegradeAbasVerPO regradeAbasVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasVerPO = new RegradeAbasVerPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void ver() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		ArrayList<Boolean> sucesso = regradeAbasVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}

}
