package com.timp.test.ADM.Usuarios.Pacotes;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Pacotes.PacotesCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PacotesCriar extends TestBase{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	PacotesCriarPO pacotesCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  pacotesCriarPO = new PacotesCriarPO();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

 	
 	@Test
 	public void Crear() {

 		loginTC.login();
 		acessarADMPO.acessarADM();
 		boolean sucesso =  pacotesCriarPO.Criar();

		assertTrue(sucesso, Criar);
 		
		sleep(2000);
 	}
}