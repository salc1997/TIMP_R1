package com.timp.test.TAA.AtribuiçõesdeRegras.RegrasdeAbas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoEditarPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeAbas.RegradeAbasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeAbasEditar extends TestBase {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegradeAbasEditarPO regradeAbasEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasEditarPO = new RegradeAbasEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void editar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regradeAbasEditarPO.editar();
		assertTrue(sucesso, Editar);
		
		sleep(2000);
	}

}
