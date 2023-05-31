package com.timp.test.ATR.Estruturas.Estruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarFiltrosPO;

public class EstruturasVisualizarFiltros extends TestBase{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstruturasVisualizarFiltrosPO estruturasVisualizarFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		estruturasVisualizarFiltrosPO = new  EstruturasVisualizarFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void visualizar() {
		
		loginTC.login();
		
		acessarATRPO.acessarATR();
		
		boolean sucesso = estruturasVisualizarFiltrosPO.visualizar();
		assertTrue(sucesso, visualizar);
		
		sleep(3000);
	}
}