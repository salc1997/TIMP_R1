package com.timp.test.TCC.BancoDeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel.Configura��odeLayoutdePainelEditarPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel.Configura��odeLayoutdePainelExecutarGravarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeLayoutdePainelExecutarGravar extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeLayoutdePainelExecutarGravarPO configura��odeLayoutdePainelExecutarGravarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeLayoutdePainelExecutarGravarPO = new Configura��odeLayoutdePainelExecutarGravarPO();
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
	public void executarGravar() {
		boolean sucesso = configura��odeLayoutdePainelExecutarGravarPO.executarGravar();
		assertTrue(sucesso, Editar);
	}
}
