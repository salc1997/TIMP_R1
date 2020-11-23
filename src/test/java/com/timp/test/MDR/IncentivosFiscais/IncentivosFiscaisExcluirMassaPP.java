package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisExcluirMassaPPPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisExcluirMassaPP extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	IncentivosFiscaisExcluirMassaPPPO incentivosFiscaisExcluirMassaPPPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		incentivosFiscaisExcluirMassaPPPO = new IncentivosFiscaisExcluirMassaPPPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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

		boolean sucesso = incentivosFiscaisExcluirMassaPPPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = incentivosFiscaisExcluirMassaPPPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
