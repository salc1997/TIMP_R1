package com.timp.test.LOG.LogDeAções;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.LOG.AcessarLOGPO;
import com.sap.timp.pageObjectModel.LOG.LogDeAções.LogDeAçõesDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LogDeAçõesDetalhes extends TestBase{
	LoginTC loginTC;
	AcessarLOGPO acessarLOGPO;
	LogDeAçõesDetalhesPO  logDeAçõesDetalhesPO ;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarLOGPO = new AcessarLOGPO();
	  logDeAçõesDetalhesPO = new LogDeAçõesDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void AcessarLOG() {

		acessarLOGPO.acessarLOG();
	
	}
	
	@Test(priority = 2)
	public void Detalle() {

		ArrayList<Boolean> sucesso = logDeAçõesDetalhesPO.detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	
	}


}
