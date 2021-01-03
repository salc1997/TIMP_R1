package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorrecaoDeNFAprovarEmMassaCJOBPO;
import com.sap.timp.pageObjectModel.BSC.Corre��odeNFAprovarS_JOBPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Corre��odeNFAprovarS_JOB extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	Corre��odeNFAprovarS_JOBPO  corre��odeNFAprovarS_JOBPO;
	
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarBrbPO = new AcessarBrbPO();
	  corre��odeNFAprovarS_JOBPO = new  Corre��odeNFAprovarS_JOBPO();
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
		
	   
	   ArrayList<Boolean> viEdi =  corre��odeNFAprovarS_JOBPO .enviar();
		for (int i = 0; i < viEdi.size(); i++) {
		assertTrue(viEdi.get(i), Filtros);
		}

	}

}
