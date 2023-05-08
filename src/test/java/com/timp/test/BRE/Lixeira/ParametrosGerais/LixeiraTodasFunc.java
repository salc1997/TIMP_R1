package com.timp.test.BRE.Lixeira.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.Lixeira.ParametrosGerais.LIxeiraCriarPO;
import com.sap.timp.pageObjectModel.BRE.Lixeira.ParametrosGerais.LixeiraTodasFuncPO;

public class LixeiraTodasFunc extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	LixeiraTodasFuncPO lixeiraTodasFuncPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		lixeiraTodasFuncPO = new LixeiraTodasFuncPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test(priority =0)
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = lixeiraTodasFuncPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		sleep(1000);
	}
	
	@Test(priority = 1)
	public void restaurar() {
		
		boolean sucesso = lixeiraTodasFuncPO.restaurar();
		assertTrue(sucesso, Restaurar);
		sleep(2000);
		
		sleep(1000);
	} 
	
	@Test(priority = 2)
	public void excluir() {
		
		ArrayList<Boolean> sucesso = lixeiraTodasFuncPO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}	
		
		sleep(1000);
	}
}
