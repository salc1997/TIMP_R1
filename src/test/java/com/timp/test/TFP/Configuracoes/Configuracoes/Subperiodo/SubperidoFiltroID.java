package com.timp.test.TFP.Configuracoes.Configuracoes.Subperiodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Subperíodo.SubperidoFiltroIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SubperidoFiltroID extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubperidoFiltroIDPO subperíodoFiltroIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subperíodoFiltroIDPO = new SubperidoFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void Filtro() {
		loginTC.login();
		acessarTFPPO.acessarTFP();
		ArrayList<Boolean> sucesso = subperíodoFiltroIDPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}

}
