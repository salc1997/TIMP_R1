package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPasta extends TestBase{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO parametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO = new ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}



	@Test()
	public void criarGerenciarMoverPasta() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = parametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO.criarGerenciarMoverPasta();
		assertTrue(sucesso, Criar);
	}
}
