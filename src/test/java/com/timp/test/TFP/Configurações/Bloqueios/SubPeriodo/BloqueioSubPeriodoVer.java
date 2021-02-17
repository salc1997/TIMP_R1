package com.timp.test.TFP.Configurações.Bloqueios.SubPeriodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.SubPeriodo.BloqueioSubPeriodoVerPO;

public class BloqueioSubPeriodoVer extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	BloqueioSubPeriodoVerPO bloqueioSubPeriodoVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		bloqueioSubPeriodoVerPO = new BloqueioSubPeriodoVerPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void TFPEntrar() {
		acessarTFPPO .acessarTFP();
	}

	@Test(priority = 2)
	public void ver() {
		ArrayList<Boolean> sucesso = bloqueioSubPeriodoVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
  
}
