package com.timp.test.TCC.BancoCr�ditoTribut�rio.PainelPerDcomp;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainelCriarcomC�piaExcluirPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainelEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeLayoutdePainelCriarcomC�piaExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO  acessarTCCPO;
	Configura��odeLayoutdePainelCriarcomC�piaExcluirPO configura��odeLayoutdePainelCriarcomC�piaExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeLayoutdePainelCriarcomC�piaExcluirPO = new Configura��odeLayoutdePainelCriarcomC�piaExcluirPO();
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
	public void editar() {
		boolean sucesso = configura��odeLayoutdePainelCriarcomC�piaExcluirPO.editar();
		assertTrue(sucesso, Editar);
		
		boolean sucesso2 = configura��odeLayoutdePainelCriarcomC�piaExcluirPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
