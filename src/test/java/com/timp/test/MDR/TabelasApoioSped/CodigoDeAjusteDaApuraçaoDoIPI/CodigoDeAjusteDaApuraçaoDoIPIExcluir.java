package com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaExcluirPO;

public class CodigoDeAjusteDaApuraçaoDoIPIExcluir extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeAjusteDaApuraçaoDoIPIExcluirPO codigoDeAjusteDaApuraçaoDoIPIExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeAjusteDaApuraçaoDoIPIExcluirPO = new CodigoDeAjusteDaApuraçaoDoIPIExcluirPO();
		
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {
		
		boolean sucesso = codigoDeAjusteDaApuraçaoDoIPIExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}		
	
	
	
	
}
