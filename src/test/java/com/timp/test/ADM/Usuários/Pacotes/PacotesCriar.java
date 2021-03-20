package com.timp.test.ADM.Usu�rios.Pacotes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Usu�rios.Pacotes.PacotesCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PacotesCriar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	PacotesCriarPO pacotesCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  pacotesCriarPO = new PacotesCriarPO();
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
 	public void AcessarADM() {

 		acessarADMPO.acessarADM();
 		
 	}
 	
 	@Test(priority = 2)
 	public void Crear() {

 		
 		boolean sucesso =  pacotesCriarPO.Criar();

		assertTrue(sucesso, Criar);
 		
 		
 	}
}
