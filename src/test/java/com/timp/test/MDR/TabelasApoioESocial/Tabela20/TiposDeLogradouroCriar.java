package com.timp.test.MDR.TabelasApoioESocial.Tabela20;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeLogradouroCriar extends TestBaseSteven{
  
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLogradouroCriarPO tiposDeLogradouroCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  tiposDeLogradouroCriarPO = new TiposDeLogradouroCriarPO();
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
	public void acessarMDR() {
		acessarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	  public void criar() {
			 boolean sucesso = tiposDeLogradouroCriarPO.criar();
			  assertTrue(sucesso, Criar);
	  }

}