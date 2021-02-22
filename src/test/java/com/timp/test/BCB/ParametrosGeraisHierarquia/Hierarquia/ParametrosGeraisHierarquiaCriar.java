package com.timp.test.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia.ParametrosGeraisHierarquiaCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaCriar extends TestBaseCristhian {
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaCriarPO parametrosGeraisHierarquiaCriarPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisHierarquiaCriarPO = new ParametrosGeraisHierarquiaCriarPO();


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
		
		ArrayList<Boolean> sucesso = parametrosGeraisHierarquiaCriarPO.criarConfiguracaoHierariquia();
		System.out.println("veamos"+sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
		
	}
	
//	@Test(priority = 3)
//	public void criarConfiguracao() {
//		
//		//hierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracao();
//
//		
//
//	@Test(priority = 4)
//	public void executar() {
//		
//		hierarquiaConfiguracaoTodasAsFuncionalidadesPO.executar();
//		/*
//		ArrayList<Boolean> subNivel1 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subnivel1Verificacao();
//		
//		for (int i = 0; i < subNivel1.size(); i++) {
//			assertTrue(subNivel1.get(i), "Erro no Subnivel 1");
//		}
//		
//		ArrayList<Boolean> subNivel2 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel2();
//		
//		for (int i = 0; i < subNivel2.size(); i++) {
//			assertTrue(subNivel2.get(i), "Erro no Subnivel 2");
//		}
//		
//		ArrayList<Boolean> subNivel3 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel3();
//		
//		for (int i = 0; i < subNivel3.size(); i++) {
//			assertTrue(subNivel3.get(i), "Erro no Subnivel 3");
//		}
//		*/
//		
//		ArrayList<Boolean> subNivel4 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel4();
//		
//		for (int i = 0; i < subNivel4.size(); i++) {
//			assertTrue(subNivel4.get(i), "Erro no Subnivel 4");
//		}
//		
//		boolean subNivel5 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel5();
//		
//		assertTrue(subNivel5, "Erro no Subnivel 5");
//		
//		
//		
//		
//		
//	}

}
