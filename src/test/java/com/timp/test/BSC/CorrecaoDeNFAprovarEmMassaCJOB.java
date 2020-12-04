package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorrecaoDeNFAprovarEmMassaCJOBPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorrecaoDeNFAprovarEmMassaCJOB extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	CorrecaoDeNFAprovarEmMassaCJOBPO  correcaoDeNFAprovarEmMassaCJOBPO;
	
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarBrbPO = new AcessarBrbPO();
	  correcaoDeNFAprovarEmMassaCJOBPO = new  CorrecaoDeNFAprovarEmMassaCJOBPO();
	  acessarBSC = new  AcessarBSCPO();
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
	public void  Aprovar() {
		correcaoDeNFAprovarEmMassaCJOBPO .enviar();
	   
	  // ArrayList<Boolean> viEdi =   correcaoDeNFAprovarEmMassaCJOBPO.enviar();
	//	for (int i = 0; i < viEdi.size(); i++) {
	//	assertTrue(viEdi.get(i), Filtros);
		}

}
