package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisExcluirMassa extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	IncentivosFiscaisExcluirMassaPO incentivosFiscaisExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		incentivosFiscaisExcluirMassaPO = new IncentivosFiscaisExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void criar() {

		boolean sucesso = incentivosFiscaisExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = incentivosFiscaisExcluirMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
