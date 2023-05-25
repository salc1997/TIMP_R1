package com.timp.test.TFP.Configuracoes.Configuracoes.Subperiodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Subper�odo.SubperidoVerPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SubperiodoVer extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubperidoVerPO subper�odoVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subper�odoVerPO = new SubperidoVerPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void ver() {

		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = subper�odoVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}

	}

}
