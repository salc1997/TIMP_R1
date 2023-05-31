package com.timp.test.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos.RegraDeCamposTodasAsFuncPO;


public class RegraDeCamposTodasAsFunc extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegraDeCamposTodasAsFuncPO regraDeCamposTodasAsFuncPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regraDeCamposTodasAsFuncPO = new RegraDeCamposTodasAsFuncPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority = 0)
	public void criar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regraDeCamposTodasAsFuncPO.criar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}
	
	@Test(priority = 1)
	public void editar() {
		boolean sucesso = regraDeCamposTodasAsFuncPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}
	
	@Test(priority = 2)
	public void Detalle() {
	
		ArrayList<Boolean> sucesso = regraDeCamposTodasAsFuncPO.Detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	@Test(priority = 3)
	public void ver() {
		
		ArrayList<Boolean> sucesso = regraDeCamposTodasAsFuncPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	
	@Test(priority = 4)
	public void excluir() {
		
		boolean sucesso = regraDeCamposTodasAsFuncPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
