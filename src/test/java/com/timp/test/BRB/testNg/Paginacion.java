package com.timp.test.BRB.testNg;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.prueba.PaginacionPO;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
 
public class Paginacion extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	PaginacionPO paginacionPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		paginacionPO = new PaginacionPO();
	}

	
	//@AfterClass public void afterClass() { driver.close(); }

	
	@Test(groups = {"brb"})
	public void paginacion() {
		
		loginTC.login();
		acessarBrbPO.acessar();

		String paginaS = paginacionPO.paginacionPS();
		assertEquals(paginaS, "2", paginaSeguiente);

		String paginaA = paginacionPO.paginacionPA();
		assertEquals(paginaA, "1", paginaAnterior);

		String paginaF = paginacionPO.paginacionPF();
		assertEquals(paginaF, paginacionPO.totalPAges.getAttribute("value"), paginaFinal);

		String paginaI = paginacionPO.paginacionPI();
		assertEquals(paginaI, "1", paginaInicial);

		String paginaB = paginacionPO.numero();
		assertEquals(paginaB, "1", paginaInserida);

	}

}
