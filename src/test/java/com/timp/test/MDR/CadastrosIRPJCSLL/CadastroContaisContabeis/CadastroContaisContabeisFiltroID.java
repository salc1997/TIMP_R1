package com.timp.test.MDR.CadastrosIRPJCSLL.CadastroContaisContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.CadastroContasCont�beis.CadastroContasCont�beisFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroContaisContabeisFiltroID extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroContasCont�beisFiltroIdPO cadastroContasCont�beisFiltroIdPO;
 
  @BeforeClass
  public void beforeClass() {
	  
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroContasCont�beisFiltroIdPO = new CadastroContasCont�beisFiltroIdPO();
		
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void filtro() {

		//cadastroContasCont�beisFiltroIdPO.filtro();
		boolean sucesso = cadastroContasCont�beisFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);


	}

}