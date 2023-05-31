package com.timp.test.TAA.AtribuiçõesdeRegras.RegrasdeAbas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeAbas.RegradeAbasTodasAsFuncPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegradeAbasTodasAsFunc extends TestBase {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegradeAbasTodasAsFuncPO regradeAbasTodasAsFuncPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasTodasAsFuncPO = new RegradeAbasTodasAsFuncPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test(priority = 0)
	public void criar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regradeAbasTodasAsFuncPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
	
	@Test(priority = 1)
	public void Detalle() {
	
		ArrayList<Boolean> sucesso = regradeAbasTodasAsFuncPO.Detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	@Test(priority = 2)
	public void editar() {
		
		boolean sucesso = regradeAbasTodasAsFuncPO.editar();
		assertTrue(sucesso, Editar);
		
		sleep(2000);
	}
	
	@Test(priority = 3)
	public void ver() {
		
		ArrayList<Boolean> sucesso = regradeAbasTodasAsFuncPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	
	@Test(priority = 4)
	public void excluir() {
		
		boolean sucesso = regradeAbasTodasAsFuncPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}


}
