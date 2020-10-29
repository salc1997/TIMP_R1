package com.timp.test.BCB;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.HierarquiaConfiguracaoTodasAsFuncionalidadesPO;



public class HierarquiaConfiguracaoTodasAsFuncionalidades extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	HierarquiaConfiguracaoTodasAsFuncionalidadesPO hierarquiaConfiguracaoTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		hierarquiaConfiguracaoTodasAsFuncionalidadesPO = new HierarquiaConfiguracaoTodasAsFuncionalidadesPO();


	}

	@AfterClass
	public void afterClass() {
		// driver.close();
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
		
		ArrayList<Boolean> sucesso = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierariquia();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
		
		
		
	}
	

	@Test(priority = 3)
	public void criarConfiguracao() {
		
		hierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracao();

		
		
		
	}
}
