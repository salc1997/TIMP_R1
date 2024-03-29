package com.timp.test.DFG.Painel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Painel.PainelNovaConfiguraçãoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PainelNovaConfiguração extends TestBase{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	PainelNovaConfiguraçãoPO painelNovaConfiguraçãoPO;
	
  @BeforeClass
  public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		painelNovaConfiguraçãoPO = new PainelNovaConfiguraçãoPO();
  }

  @AfterClass
  public void afterClass() {

	 // driver.close();

  }
  

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}
	
  @Test(priority = 1)
	public void DFGEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criar() {
		
	
		ArrayList<Boolean> sucesso =painelNovaConfiguraçãoPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

}
