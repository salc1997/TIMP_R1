package com.timp.test.MDR.TabelasApoioESocial.Tabela16;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SGDPExcluir extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SGDPExcluirPO sGDPExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		sGDPExcluirPO = new SGDPExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = sGDPExcluirPO.excluir();
		assertTrue(sucesso, Criar);
	}
}
