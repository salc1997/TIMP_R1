package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura.RegradeReaberturaExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegraDeReaberturaExcluir extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	RegradeReaberturaExcluirPO  regradeReaberturaExcluirPO;

  @BeforeClass
  public void beforeClass() {
	  
	  driver = initialization();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC(); 
	  regradeReaberturaExcluirPO = new RegradeReaberturaExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
 
  
  @Test()
  public void excluir() {
	  loginTC.login();
	  accesarMDRPO.acessarMDR();
	  
	  
	  boolean sucesso = regradeReaberturaExcluirPO.Excluir();
	  assertTrue(sucesso, Editar);
	
	}
  



}
