package com.timp.test.TFP.Configuracoes.Bloqueios.SubPeriodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Bloqueios.SubPeriodo.SubPeriodoFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SubPeriodoFiltroId extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubPeriodoFiltroIdPO subPeriodoFiltroIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subPeriodoFiltroIdPO = new SubPeriodoFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTFPPO.acessarTFP();
		ArrayList<Boolean> sucesso = subPeriodoFiltroIdPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}

}
