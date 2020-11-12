package com.timp.test.MDR.TabelasApoioESocial.Tabela20;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeLogradouroEditar extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TiposDeLogradouroEditarPO tiposDeLogradouroEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  tiposDeLogradouroEditarPO = new TiposDeLogradouroEditarPO();
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
  public void mdrEntrar() {
	 accesarMDR.acessarMDR();

  }
  
  @Test(priority = 2)
  public void editar() {
	  boolean sucesso = tiposDeLogradouroEditarPO.editar();
	  assertTrue(sucesso, Editar);
  }
}
