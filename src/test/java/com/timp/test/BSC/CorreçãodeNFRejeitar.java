package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorreçãodeNFRejeitarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorreçãodeNFRejeitar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	CorreçãodeNFRejeitarPO  correçãodeNFRejeitarPO;

  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarBrbPO = new AcessarBrbPO();
	  correçãodeNFRejeitarPO = new CorreçãodeNFRejeitarPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();

	}
	
	@Test(priority = 2)
	public void  rejeitar() {
		
		
		ArrayList<Boolean> rejeitar =   correçãodeNFRejeitarPO.Rejeitar();
		for (int i = 0; i < rejeitar.size(); i++) {
		assertTrue(rejeitar.get(i), Filtros);
		}
	}

}
