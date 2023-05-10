package com.timp.test.TFP.Configuracoes.Configuracoes.Subperiodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Subper�odo.SubperiodoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SubperidoExcluir extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubperiodoExcluirPO subper�odoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subper�odoExcluirPO = new SubperiodoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTFPPO.acessarTFP();

		boolean sucesso2 = subper�odoExcluirPO.Excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
