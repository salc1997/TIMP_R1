package com.timp.test.TDK.Execucoes.Lixeira;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.Lixeira.LixeiraRestaurarEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LixeiraRestaurarEmMassa extends TestBaseMassiel{ 
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	LixeiraRestaurarEmMassaPO lixeiraRestaurarEmMassaPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		lixeiraRestaurarEmMassaPO = new LixeiraRestaurarEmMassaPO();
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
	public void acessarTDK() {
		acessarTDKPO.acessarTDK();
	}
	
	@Test(priority = 2)
	public void retaurar() {
		
		
		ArrayList<Boolean> sucesso = lixeiraRestaurarEmMassaPO.Restaurar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		
	}

}
