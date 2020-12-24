package com.timp.test.MDR.EventosESocial.S2230AfastamentoTemporário;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2230AfastamentoTemporário.S2230AfastamentoTemporárioFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2230AfastamentoTemporárioFiltroId extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S2230AfastamentoTemporárioFiltroIdPO s2230AfastamentoTemporárioFiltroIdPO;

  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s2230AfastamentoTemporárioFiltroIdPO = new S2230AfastamentoTemporárioFiltroIdPO();
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
	//	s2230AfastamentoTemporárioFiltroIdPO.filtro();

		boolean sucesso = s2230AfastamentoTemporárioFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);


	}

}
