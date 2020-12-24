package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.LeiautesExecu��oFuncionalidadesPO;

public class LeiautesExecu��oFuncionalidades extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecu��oFuncionalidadesPO leiautesExecu��oFuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecu��oFuncionalidadesPO = new LeiautesExecu��oFuncionalidadesPO();
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
		
//		boolean sucesso2 = leiautesExecu��oFuncionalidadesPO.editar();
//		assertTrue(sucesso2, Editar);	
//		
//		ArrayList<Boolean> sucesso3 = leiautesExecu��oFuncionalidadesPO.informacao();
//		
//		for (int i = 0; i < sucesso3.size(); i++) {
//			assertTrue(sucesso3.get(i), visualiza�ar);
//		}
//		
//		ArrayList<Boolean> sucesso4 = leiautesExecu��oFuncionalidadesPO.visualizar();
//		
//		for (int i = 0; i < sucesso4.size(); i++) {
//			assertTrue(sucesso4.get(i), visualiza�ar);
//		}
//		
//		boolean sucesso5 = leiautesExecu��oFuncionalidadesPO.executar();
//		assertTrue(sucesso5);	

	}
}
