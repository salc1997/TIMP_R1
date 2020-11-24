package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.HierarquiaConfiguracaoTodasAsFuncionalidadesPO;
import com.sap.timp.pageObjectModel.BCB.HierarquiaExecucoesTodasAsFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class HierarquiaExecucoesTodasAsFuncionalidades extends TestBaseKenssy {
  
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	HierarquiaExecucoesTodasAsFuncionalidadesPO hierarquiaExecucoesTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		hierarquiaExecucoesTodasAsFuncionalidadesPO = new HierarquiaExecucoesTodasAsFuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}

	@Test(priority = 2)
	public void criarConfiguracaoHierarquia() {
		
		ArrayList<Boolean> sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.criarConfiguracaoExecucoes();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
		
	}
	
	@Test
	public void f() {
	}
}
