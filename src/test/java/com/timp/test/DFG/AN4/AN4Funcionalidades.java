package com.timp.test.DFG.AN4;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.AN4.AN4FuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AN4Funcionalidades extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	AN4FuncionalidadesPO aN4FuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		aN4FuncionalidadesPO = new AN4FuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

/*	@Test(priority = 1)
	public void DFGEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void AN4ID() {
		aN4FuncionalidadesPO.Id();

	}

	@Test(priority = 3)
	public void AN4Criar1() {

		boolean sucesso = aN4FuncionalidadesPO.Criar();
		assertTrue(sucesso, Criar);

	}

	@Test(priority = 4)
	public void AN4Criar2() {

		boolean sucesso = aN4FuncionalidadesPO.Criar2();
		assertTrue(sucesso, Criar);

	}

	@Test(priority = 5)
	public void AN4IdBRE() {

		aN4FuncionalidadesPO.IdBRE();

	}

	@Test(priority = 6)
	public void criarRegraBRE() {

		boolean sucesso = aN4FuncionalidadesPO.CriarRegra();
		assertTrue(sucesso, Criar);
	}*/
	
	@Test(priority = 7)
	public void AN4IdDFG() {

		aN4FuncionalidadesPO.IdDFG();

	}
	
	/*@Test(priority = 8)
	public void criarRaizDFG() {

		boolean sucesso = aN4FuncionalidadesPO.CriarConfiguracoe();
		assertTrue(sucesso, Criar);
		

	}
	
	@Test(priority = 9)
	public void criarRaizDFG2() {

		boolean sucesso = aN4FuncionalidadesPO.CriarConfiguracoe2();
		assertTrue(sucesso, Criar);
		

	}*/
	
	@Test(priority = 10)
	public void executarDFG() {

		aN4FuncionalidadesPO. ExecutarConfiguracao();
		//boolean sucesso = 
		//assertTrue(sucesso, Criar);
		

	}
}
