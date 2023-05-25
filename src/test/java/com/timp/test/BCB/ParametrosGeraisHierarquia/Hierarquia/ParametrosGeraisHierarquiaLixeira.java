package com.timp.test.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia.ParametrosGeraisHierarquiaExcluirSelectFlagPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia.ParametrosGeraisHierarquiaLixeiraPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaLixeira extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaLixeiraPO parametrosGeraisHierarquiaLixeiraPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisHierarquiaLixeiraPO = new ParametrosGeraisHierarquiaLixeiraPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisHierarquiaLixeiraPO.lixeiraHierarquia();
		assertTrue(sucesso, Eliminado);
	}

}
