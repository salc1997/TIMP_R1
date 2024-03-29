package com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisExcluirPO;

public class TiposDeObjetosDeOcorrenciasFiscaisExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeObjetosDeOcorrenciasFiscaisExcluirPO tiposDeObjetosDeOcorrenciasFiscaisExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirPO = new TiposDeObjetosDeOcorrenciasFiscaisExcluirPO();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeObjetosDeOcorrenciasFiscaisExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
}
