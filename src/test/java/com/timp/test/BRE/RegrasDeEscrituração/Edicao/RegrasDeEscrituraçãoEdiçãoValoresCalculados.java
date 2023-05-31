package com.timp.test.BRE.RegrasDeEscritura��o.Edicao;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.Edicao.RegrasDeEscritura��oEdi��oValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscritura��oEdi��oValoresCalculados extends TestBase{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscritura��oEdi��oValoresCalculadosPO regrasDeEscritura��oEdi��oValoresCalculadosPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscritura��oEdi��oValoresCalculadosPO = new RegrasDeEscritura��oEdi��oValoresCalculadosPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
	public void ValoresCalculados() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeEscritura��oEdi��oValoresCalculadosPO.Valores();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		sleep(2000);
	}

}
