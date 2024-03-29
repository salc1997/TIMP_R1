package com.timp.test.MDR.Siscoserv.Enquadramento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.Enquadramento.EnquadramentoExcluirPO;

public class EnquadramentoExcluir extends TestBase {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EnquadramentoExcluirPO enquadramentoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		enquadramentoExcluirPO = new EnquadramentoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = enquadramentoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
	
}
