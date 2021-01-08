package com.timp.test.DFG.Leiautes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.LeiautesExecucaoCamposEspeciais1y2PO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.LeiautesExecucaoFuncionalidades4PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LeiautesExecucaoFuncionalidades4 extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecucaoFuncionalidades4PO leiautesExecucaoFuncionalidades4PO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecucaoFuncionalidades4PO = new LeiautesExecucaoFuncionalidades4PO();
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
		ArrayList<Boolean> sucesso =leiautesExecucaoFuncionalidades4PO.criarLeiaute();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 2)
	public void separadores() {
		leiautesExecucaoFuncionalidades4PO.separadores();
	}
	
	@Test(priority = 3)
	public void dataInicialDeReferencia() {
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades4PO.dataInicialDeReferencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 4)
	public void saltodeLinha() {
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades4PO.saltodeLinha();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 5)
	public void dataFinalDeReferencia() {
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades4PO.dataFinalDeReferencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 6)
	public void versao() {
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades4PO.versao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 7)
	public void horaDaExecucao() {
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades4PO.horaDaExecucao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 8)
	public void dataDaExecucao() {
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades4PO.dataDaExecucao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 9)
	public void periodoDaReferencia() {
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades4PO.periodoDaReferencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

}
