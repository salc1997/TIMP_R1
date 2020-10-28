package com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras.CadastroDeObrasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroDeObrasEditar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CadastroDeObrasEditarPO  cadastroDeObrasEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  cadastroDeObrasEditarPO = new CadastroDeObrasEditarPO ();
  }

  @AfterClass
  public void afterClass() {
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
  public void editar() {

	  boolean sucesso = cadastroDeObrasEditarPO.Editar();
	  assertTrue(sucesso, Editar);
	  
	}

}
