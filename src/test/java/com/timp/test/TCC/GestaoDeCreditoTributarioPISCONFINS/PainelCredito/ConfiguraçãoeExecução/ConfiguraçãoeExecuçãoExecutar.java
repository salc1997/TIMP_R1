package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o.Configura��oeExecu��oCriarPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o.Configura��oeExecu��oExecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��oeExecu��oExecutar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��oeExecu��oExecutarPO configura��oeExecu��oExecutarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��oeExecu��oExecutarPO = new Configura��oeExecu��oExecutarPO();
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
	public void acessarTCC() {

		acessarTCCPO.acessarTCC();

	}

	@Test(priority = 2)
	public void executar() {

		boolean sucesso = configura��oeExecu��oExecutarPO.executar();

	}

}
