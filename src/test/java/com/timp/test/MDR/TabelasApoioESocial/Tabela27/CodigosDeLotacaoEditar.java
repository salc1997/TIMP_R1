package com.timp.test.MDR.TabelasApoioESocial.Tabela27;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigosDeLotacaoEditar extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	CodigosDeLotacaoEditarPO codigosDeLotacaoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  codigosDeLotacaoEditarPO = new CodigosDeLotacaoEditarPO();
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
  public void editar() {
	  boolean sucesso = codigosDeLotacaoEditarPO.editar();
	  assertTrue(sucesso, Editar);
  }
}