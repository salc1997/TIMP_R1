package com.timp.test.TCC.BancoCr�ditoTribut�rio.PainelPerDcomp.Configura��odeBancodeCr�ditoTribut�rio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainelExcluirPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeBancodeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rioExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeBancodeCr�ditoTribut�rioExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeBancodeCr�ditoTribut�rioExcluirPO configura��odeBancodeCr�ditoTribut�rioExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeBancodeCr�ditoTribut�rioExcluirPO = new Configura��odeBancodeCr�ditoTribut�rioExcluirPO();
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
		acessarTCCPO.acessarTCC();
	}

	@Test(priority = 2)
	public void excluir() {

		boolean sucesso2 = configura��odeBancodeCr�ditoTribut�rioExcluirPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
