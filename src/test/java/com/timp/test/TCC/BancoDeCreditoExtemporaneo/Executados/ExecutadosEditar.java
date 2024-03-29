package com.timp.test.TCC.BancoDeCreditoExtemporaneo.Executados;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.Executados.ExecutadosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ExecutadosEditar extends TestBase{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ExecutadosEditarPO executadosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		executadosEditarPO = new ExecutadosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}
  
	@Test()
	public void executarEditar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = executadosEditarPO.editar();
		assertTrue(sucesso, Criar);
	}

}
