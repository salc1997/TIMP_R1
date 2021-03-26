package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.LeiautesExecu��oFuncionalidades1PO;

public class LeiautesExecu��oFuncionalidades1 extends TestBaseSteven {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecu��oFuncionalidades1PO leiautesExecu��oFuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecu��oFuncionalidadesPO = new LeiautesExecu��oFuncionalidades1PO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criar() {
		boolean sucesso = leiautesExecu��oFuncionalidadesPO.criar();
		assertTrue(sucesso, Criar);		
		
	/*boolean sucesso2 = leiautesExecu��oFuncionalidadesPO.editar();
		assertTrue(sucesso2, Editar);	
		
		ArrayList<Boolean> sucesso3 = leiautesExecu��oFuncionalidadesPO.informacao();
		
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), visualiza�ar);
		}
		
		ArrayList<Boolean> sucesso4 = leiautesExecu��oFuncionalidadesPO.visualizar();
		
		for (int i = 0; i < sucesso4.size(); i++) {
			assertTrue(sucesso4.get(i), visualiza�ar);
		}
		
		boolean sucesso5 = leiautesExecu��oFuncionalidadesPO.executar();
		assertTrue(sucesso5);	*/

	}
}
