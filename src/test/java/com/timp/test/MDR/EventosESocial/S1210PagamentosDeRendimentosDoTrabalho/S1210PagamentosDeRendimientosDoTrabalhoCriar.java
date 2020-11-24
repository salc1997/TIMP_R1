package com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1210PagamentosDeRendimientosDoTrabalhoCriar extends TestBaseFernando{
	  LoginTC loginTC;
	  AcessarMDRPO accesarMDRPO;
	  S1210PagamentosDeRendimientosDoTrabalhoCriarPO s1210PagamentosDeRendimientosDoTrabalhoCriarPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationF();
		  loginTC = new LoginTC();
		  accesarMDRPO = new AcessarMDRPO();
		  s1210PagamentosDeRendimientosDoTrabalhoCriarPO = new S1210PagamentosDeRendimientosDoTrabalhoCriarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  @Test(priority = 0)
	  public void ingresar() {
		  loginTC.login();
	  }
	  
	  @Test(priority = 1)
	  public void ingresarMDR() {
		  accesarMDRPO.acessarMDR();
	  }
	  
	  @Test(priority = 2)
	  public void criar() {
		  boolean sucesso = s1210PagamentosDeRendimientosDoTrabalhoCriarPO.criar();
		  assertTrue(sucesso, Criar);
	  }
}
