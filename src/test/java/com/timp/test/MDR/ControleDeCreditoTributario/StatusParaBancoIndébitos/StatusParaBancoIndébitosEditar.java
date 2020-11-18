package com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEEditarPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class StatusParaBancoInd�bitosEditar extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusParaBancoInd�bitosEditarPO statusParaBancoInd�bitosEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		statusParaBancoInd�bitosEditarPO = new StatusParaBancoInd�bitosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void editar() {

		boolean sucesso = statusParaBancoInd�bitosEditarPO.editar();

		assertTrue(sucesso, Criar);

	}
}
