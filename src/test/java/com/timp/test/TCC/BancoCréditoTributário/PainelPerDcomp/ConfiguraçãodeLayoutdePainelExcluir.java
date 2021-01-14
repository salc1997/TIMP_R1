package com.timp.test.TCC.BancoCr�ditoTribut�rio.PainelPerDcomp;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainelCriarcomC�piaExcluirPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainelExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeLayoutdePainelExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO  acessarTCCPO;
	Configura��odeLayoutdePainelExcluirPO configura��odeLayoutdePainelExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeLayoutdePainelExcluirPO = new Configura��odeLayoutdePainelExcluirPO();
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
		
		boolean sucesso2 = configura��odeLayoutdePainelExcluirPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}


}
