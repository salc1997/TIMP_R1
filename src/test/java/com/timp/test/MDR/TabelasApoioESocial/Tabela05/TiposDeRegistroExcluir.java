package com.timp.test.MDR.TabelasApoioESocial.Tabela05;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroExcluirPO;

public class TiposDeRegistroExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeRegistroExcluirPO tiposDeRegistroExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeRegistroExcluirPO = new TiposDeRegistroExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeRegistroExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
