package com.timp.test.MDR.TabelasApoioESocial.Tabela20;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TiposDeLogradouroVisualizar extends TestBaseSteven{
  
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TiposDeLogradouroVisualizarPO tiposDeLogradouroVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  tiposDeLogradouroVisualizarPO = new TiposDeLogradouroVisualizarPO();
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
	 accesarMDR.acessarMDR();

  }
  
  @Test(priority = 2)
  public void visualizar() {
	  ArrayList<Boolean> sucesso = tiposDeLogradouroVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
  }
}