package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO;
import com.sap.timp.pageObjectModel.BCB.OrigenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class FormulaHierarquiaConfiguracaoTodasAsFuncionalidades extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO = new FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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

//	@Test(priority = 2)
//	public void criarConfiguracaoHierarquia() {
//		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierarquia();
//		System.out.println(sucesso);
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), subniveis);
//		}
//	}
//	
//	@Test(priority = 3)
//	public void criarConfiguracionConfiguracao() {
//		sleep(2000);
//		boolean sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracionConfiguracao();
//		assertTrue(sucesso, Criar);	
//	}
//	
//	@Test(priority = 4)	
//	public void criarConfiguracao() {
//		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.configurarConfiguracao();
//		System.out.println(sucesso);
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), subniveis);
//		}
//	}
//	
	@Test(priority = 5)	
	public void outputBCB() {
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.formulaOutputBCB();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
//	@Test(priority = 6)	
//	public void subNivel2() {
//		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel2();
//		System.out.println(sucesso);
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), subniveis);
//		}
//	}	
//	
//	@Test(priority = 7)	
//	public void subNivel3() {
//		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel3();
//		System.out.println(sucesso);
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), subniveis);
//		}
//	}
//	
//	@Test(priority = 8)	
//	public void subNivel4() {
//		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel4();
//		System.out.println(sucesso);
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), subniveis);
//		}
//	}
//	
//	@Test(priority = 9)	
//	public void subNivel5() {
//		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel5();
//		System.out.println(sucesso);
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), subniveis);
//		}
//	}

}
