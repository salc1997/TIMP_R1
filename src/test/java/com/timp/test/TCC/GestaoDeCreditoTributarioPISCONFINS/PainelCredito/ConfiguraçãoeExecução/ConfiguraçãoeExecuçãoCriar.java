package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o.Configura��oeExecu��oCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��oeExecu��oCriar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��oeExecu��oCriarPO configura��oeExecu��oCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��oeExecu��oCriarPO = new Configura��oeExecu��oCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configura��oeExecu��oCriarPO.Criar();
		assertTrue(sucesso, Criar);
	}
}
