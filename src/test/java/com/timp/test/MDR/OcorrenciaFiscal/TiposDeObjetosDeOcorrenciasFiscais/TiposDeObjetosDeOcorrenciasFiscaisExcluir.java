package com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisExcluirPO;

public class TiposDeObjetosDeOcorrenciasFiscaisExcluir extends TestBaseEliel{

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeObjetosDeOcorrenciasFiscaisExcluirPO tiposDeObjetosDeOcorrenciasFiscaisExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirPO = new TiposDeObjetosDeOcorrenciasFiscaisExcluirPO();
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
	public void excluir() {

		
		boolean sucesso = tiposDeObjetosDeOcorrenciasFiscaisExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}			
}