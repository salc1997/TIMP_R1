package com.timp.test.MDR.Antecipacao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoDetalhePO;

public class AntecipacaoDetalhe extends TestBaseFernando{
	LoginTC loginTC;
	  AcessarMDRPO accesarMDR;
	  AntecipacaoDetalhePO antecipacaoDetalhePO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationF();
		  loginTC = new LoginTC();
		  accesarMDR = new AcessarMDRPO();
		  antecipacaoDetalhePO = new AntecipacaoDetalhePO();
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
		  boolean sucesso = accesarMDR.acessarMDR();
		  assertTrue(sucesso, "The element is not present");
	  }
	  
	  @Test(priority = 2)
	  public void detalhe() {	  
		  ArrayList<Boolean> sucesso = antecipacaoDetalhePO.detalhe();
		  for(int i = 0; i < sucesso.size(); i++) {
			  assertTrue(sucesso.get(i), Detalhes);
		  }
	  }
}