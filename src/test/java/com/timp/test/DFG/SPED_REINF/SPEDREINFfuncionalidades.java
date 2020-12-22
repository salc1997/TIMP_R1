package com.timp.test.DFG.SPED_REINF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI.EFDICMSIPICriarPO;
import com.sap.timp.pageObjectModel.DFG.SPED_REINF.SPEDREINFfuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SPEDREINFfuncionalidades extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	SPEDREINFfuncionalidadesPO sPEDREINFfuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		sPEDREINFfuncionalidadesPO = new SPEDREINFfuncionalidadesPO();
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
		boolean sucesso = sPEDREINFfuncionalidadesPO.criar();
		assertTrue(sucesso, Criar);		
		
		boolean sucesso2 = sPEDREINFfuncionalidadesPO.editar();
		assertTrue(sucesso2, Editar);	
		
		ArrayList<Boolean> sucesso3 = sPEDREINFfuncionalidadesPO.informacao();
		
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), visualizaçar);
		}
		
		ArrayList<Boolean> sucesso4 = sPEDREINFfuncionalidadesPO.visualizar();
		
		for (int i = 0; i < sucesso4.size(); i++) {
			assertTrue(sucesso4.get(i), visualizaçar);
		}
		
		boolean sucesso5 = sPEDREINFfuncionalidadesPO.executar();
		assertTrue(sucesso5, visualizaçar);	

	}
	


}
