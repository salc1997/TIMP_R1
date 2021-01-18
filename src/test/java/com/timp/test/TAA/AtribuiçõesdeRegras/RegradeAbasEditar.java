package com.timp.test.TAA.Atribui��esdeRegras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoEditarPO;
import com.sap.timp.pageObjectModel.TAA.Atribui��esdeRegras.RegradeAbasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeAbasEditar extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarTAAPO  acessarTAAPO;
	RegradeAbasEditarPO regradeAbasEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasEditarPO = new RegradeAbasEditarPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTAA() {
		acessarTAAPO.acessarTAA();
	}

	@Test(priority = 2)
	public void editar() {
		boolean sucesso = regradeAbasEditarPO.editar();
		assertTrue(sucesso, Editar);
	}

}
