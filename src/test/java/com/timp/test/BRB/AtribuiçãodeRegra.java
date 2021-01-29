package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.AtribuiçãodeRegraPO;
import com.sap.timp.pageObjectModel.BRB.DuplicidadePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtribuiçãodeRegra extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	AtribuiçãodeRegraPO atribuiçãodeRegraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		atribuiçãodeRegraPO = new AtribuiçãodeRegraPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();

	}

	@Test(priority = 2)
	public void editar() {

		boolean sucesso = atribuiçãodeRegraPO.editar();
		assertTrue(sucesso, Editar);

	}

}
