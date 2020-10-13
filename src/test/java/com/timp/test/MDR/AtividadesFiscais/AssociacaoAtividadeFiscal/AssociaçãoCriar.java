package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Associa��oCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	Associa��oCriarPO associa��oCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  associa��oCriarPO = new Associa��oCriarPO();
	
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
  public void ingresar() {
	  loginTC.login();
  }
  
  @Test(priority = 1)
  public void mdrEntrar() {
	  boolean sucesso = accesarMDR.acessarMDR();

  }
  
  @Test(priority = 2)
  public void criarAssocia��o() {
	  boolean sucesso = associa��oCriarPO.criarAssocia��o();
	  assertTrue(sucesso, Criar);
  }
}
