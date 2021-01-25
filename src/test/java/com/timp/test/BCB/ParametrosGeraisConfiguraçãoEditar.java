package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfigura��oEditarPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oEditar extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfigura��oEditarPO parametrosGeraisConfigura��oEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	driver = initializationC();
	loginTC = new LoginTC();
	acessarBCBPO = new AcessarBCBPO();
	parametrosGeraisConfigura��oEditarPO = new ParametrosGeraisConfigura��oEditarPO();
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
  public void editar() {

	//  parametrosGeraisConfigura��oEditarPO.editar();
	  
	boolean sucesso = parametrosGeraisConfigura��oEditarPO.editar();

	assertTrue(sucesso, Editar);

  }

}
